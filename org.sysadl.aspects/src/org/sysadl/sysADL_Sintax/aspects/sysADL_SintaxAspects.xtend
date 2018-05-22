package org.sysadl.sysADL_Sintax.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.BasicEList
import sysADL_Sintax.ActivityBody
import sysADL_Sintax.ActivityDef
import sysADL_Sintax.Pin
import sysADL_Sintax.ActivityDelegation
import sysADL_Sintax.ActionUse
import sysADL_Sintax.DataObject
import sysADL_Sintax.ActivityFlowable
import sysADL_Sintax.ActivityRelation
import sysADL_Sintax.ActivityFlow
import sysADL_Sintax.NamedElement
import org.sysadl.context.SysADLContext
import org.sysadl.engine.SysADLExecutionEngine
import org.sysadl.context.impl.SysADLContextImpl
import org.sysadl.engine.ExecutionUtil
import sysADL_Sintax.DataBuffer
import java.util.Queue
import sysADL_Sintax.DataStore
import org.sysadl.execution.ui.Inputer
import org.sysadl.execution.ui.UiActivityPinInput
import org.sysadl.execution.value.Values

@Aspect(className=ActivityBody)
class ActivityBodyAspect {
	private boolean finished
	private UiActivityPinInput input
	/**
	 * Initialize the model, setting the private attributes and pin values for input
	 */
	@InitializeModel
	def public void init(EList<String> args) {
		_self.input = new Inputer(_self.eContainer as ActivityDef)
		_self.finished = false;
	}

	/** 
	 * For now, main method just iterates over steps
	 */
	@Main
	def static void main() {
		// Infinite loop, find a way to make it finite
		while (!_self.finished) {
			_self.step()
		}
	    println("End of execution")
	}

	/* Step
	 * There are three kinds of step: 
	 * - Flow: A data flows from one action to another
	 * - Action Run: An Action has all data it needs and will execute
	 * - Data: A data is provided by a DataObject 
	 */
	@Step
	def void step() {
		// Setup  pins of activity:
		_self.stepActivityPins()
		
		// Data steps:
		_self.stepRunData()
		
		// Transmit the values over the flows and delegations:
		_self.stepRunTransmit()
		
		// Action steps:
		_self.stepRunActions()
	}

	@Step
	def void stepActivityPins() {
		// generate values for the activity pins in
		val act = _self.eContainer.eContainer as ActivityDef

		_self.input.requestInput // request input
		
		var changed = false
		for (i : act.inParameters) { // remove values from the list that were consumed
			val pinValue = _self.input.values.get(i as Pin)
			if (ActivityFlowableAspect.cvalue(i as Pin)===null && pinValue!==null) {
				_self.input.values.remove(i as Pin); // remove or set null?
				_self.input.values.put(i as Pin, null);
				changed = true
			} else {
				if (pinValue!==null) {
					ActivityFlowableAspect.cvalue(i as Pin, pinValue)
				}
			}
		}
		
		// update table values on input
		if (changed) _self.input.mapChanged
		
		// consume the values for the activity pins out
		for (p : act.outParameters) {
			ActivityFlowableAspect.cvalue(p as Pin, null)
		}
	}

	@Step
	def void stepRunData() {
		for (d : _self.dataObjects) {
			DataObjectAspect.run(d as DataObject)
		}
	}
	
	@Step
	def void stepRunTransmit() {
		for (f : _self.flows) {
			ActivityRelationAspect.run(f as ActivityRelation);
		}
	}
	@Step
	def void stepRunActions() {
		for (a : _self.actions) { // a is an ActionUse 
			ActionUseAspect.run(a as ActionUse)
		}
	}

}

@Aspect(className=ActionUse)
class ActionUseAspect {
	@Step
	def void run() {
		if (_self.canRun()) {
			println("Running action " + _self.name)
	
			// Consume values of inputs to build the context
			var SysADLContext c = new SysADLContextImpl()
			for (i : _self.pinIn) {
				c.add(i as Pin, ActivityFlowableAspect.cvalue(i as Pin)) // add all values in the context
				// Set previous values as null
				ActivityFlowableAspect.cvalue(i as Pin, null)
			}
			val exec = ExecutionUtil.getExecutablesFor(_self)
			if (exec===null) println("Unable to find Executables for action "+_self.name)
			else {
				val result = SysADLExecutionEngine.instance.execute(exec, c)
				println("Action " + _self.name + " execution finished, result: "+result)
				ActivityFlowableAspect.cvalue(_self, result)
			}
		}
	}
	def boolean canRun() {
		for (i : _self.pinIn) {
			
			if (ActivityFlowableAspect.cvalue(i as Pin)===null) return false;
		}
		return true;
	}
}

@Aspect(className=ActivityRelation)
class ActivityRelationAspect {
	@Step
	def void run() {
		var src = _self.source
		var tar = _self.target
		var srcvalue = ActivityFlowableAspect.cvalue(src);
		var tarvalue = ActivityFlowableAspect.cvalue(tar);
		if ((_self instanceof ActivityFlow || (_self.eContainer.eContainer as ActivityDef).inParameters.contains(src)) && tarvalue === null) {
			var ext = ""
			if (_self instanceof ActivityDelegation) ext = "(Delegation scr-tar) "
			println(ext+"Flowing " + srcvalue + " from (" + (src as NamedElement).name + ") to (" + (tar as NamedElement).name +")")
			// 	Update values from source and target
			// Target will now have the value of source
			ActivityFlowableAspect.cvalue(tar, ActivityFlowableAspect.cvalue(src))
			// Value will be consumed, source is now null
			ActivityFlowableAspect.cvalue(src, null)
			
		} else if ((_self instanceof ActivityDelegation && (_self.eContainer.eContainer as ActivityDef).outParameters.contains(src)) && srcvalue === null){
			println("(Delegation tar-src) Flowing " + tarvalue + " from (" + (tar as NamedElement).name + ") to (" +(src as NamedElement).name + ")")
			// Update values from source and target
			// Source will now have the value of target
			ActivityFlowableAspect.cvalue(src, ActivityFlowableAspect.cvalue(tar))
			// Value will be consumed, target is now null
			ActivityFlowableAspect.cvalue(tar, null)
		}
		// no matter what happens, if src or tar are data objects, perform its operations
		// this will allow multiple flows from the same object in a single step
		if (src instanceof DataObject) DataObjectAspect.run(src)
		if (tar instanceof DataObject) DataObjectAspect.run(tar)
	}
}

@Aspect(className=ActivityFlowable)
abstract class ActivityFlowableAspect {
	public Object cvalue
}

@Aspect(className=DataObject)
abstract class DataObjectAspect extends ActivityFlowableAspect {
	// Produces/stores a value
	def void run()
}

@Aspect(className=DataBuffer)
class DataBufferAspect extends DataObjectAspect{
	Queue<Object> buffer
	
	def void run() {
		val value = ActivityFlowableAspect.cvalue(_self)
		val top = _self.buffer.peek
		if (value!=top) {
			// if value is different it means we should add it to the queue
			_self.buffer.add(value)
			ActivityFlowableAspect.cvalue(_self, null)
		}
		// if value is empty, it means that:
		// 1- something pushed a new value and the previous lines added to the line and removed
		// 2- the previous value was transmited somewhere else
		// therefore, check the top of the queue and update the value
		if (value===null) {
			if (!_self.buffer.isEmpty) { // if queue is empty, do nothing
				// remove the head of the queue
				_self.buffer.poll
				// push the new head to value
				ActivityFlowableAspect.cvalue(_self, _self.buffer.peek)
			}
		}
	}
}

@Aspect(className=DataStore)
class DataStoreAspect extends DataObjectAspect {
	private Object store
	
	def void run() {
		if (_self.cvalue===null) { // either the value was consumed, or the store is empty
			if (_self.store===null) { // the store is empty
				// do nothing
			} else { // the value was consumed
				// copy it from store to cvalue
				ActivityFlowableAspect.cvalue(_self, _self.store);
			}
			// important situation: void stores shall always have a void value
			if (Values.isVoidType(_self.type)) {
				_self.cvalue = Values.VOID 
			}
		} else { // either the value was not consumed or updated
			if (_self.cvalue!==_self.store) { // value updated
				_self.store = _self.cvalue;
			}
			// otherwise do nothing
		}
		
	}
}
