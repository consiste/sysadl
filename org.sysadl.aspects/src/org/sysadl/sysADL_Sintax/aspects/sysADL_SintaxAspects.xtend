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

@Aspect(className=ActivityBody)
class ActivityBodyAspect {

	/**
	 * Initialize the model, setting the private attributes and pin values for input
	 */
	@InitializeModel
	def public void init(EList<String> args) {
		/* Identify PinIn */
		val pinsIn = (_self.eContainer() as ActivityDef).inParameters

		// Set values for pinIn
		for (i : pinsIn) {
			// TODO implement me, ask  the user for the inputs?
			ActivityFlowableAspect.cvalue(i as Pin, Helper.genValue)
		}

		/* Select entry points and set values */
		// Get all delegations
		val delegations = _self.flows.filter[i|i.class == ActivityDelegation]
		for (d : delegations) {
			// If the source of this delegation is a pinIn or a DataObject
			val source = (d as ActivityDelegation).source
			if (pinsIn.contains(source)) {
				// TODO the value of source must be initialized
				ActivityFlowableAspect.cvalue(source, Helper.genValue)
			}
		}

	}

	/** 
	 * For now, main method just iterates over steps
	 */
	@Main
	def static void main() {
		// Infinite loop, find a way to make it finite
		while (true) {
			_self.step()
		}
//	    println("End of execution")
	}

	/* Step
	 * There are three kinds of step: 
	 * - Flow: A data flows from one action to another
	 * - Action Run: An Action has all data it needs and will execute
	 * - Data: A data is provided by a DataObject 
	 */
	@Step
	def void step() {
		// generate values for the activity pins in
		val act = _self.eContainer.eContainer as ActivityDef
		for (p : act.inParameters) {
			// if pin values are null, generate a new value
			if (ActivityFlowableAspect.cvalue(p as Pin)===null) {
				ActivityFlowableAspect.cvalue(p as Pin, Helper.genValue) // TODO ask the user?
			}
		}
		// Transmit the values over the flows and delegations
		for (f : _self.flows) {
			ActivityRelationAspect.run(f as ActivityRelation);
		}
		// Action steps:
		for (a : _self.actions) { // a is an ActionUse 
			ActionUseAspect.run(a as ActionUse)
		}

		// Data steps:
		for (d : _self.dataObjects) {
			DataObjectAspect.run(d as DataObject)
		}
	}

	def EList<ActivityRelation> getRelationsBySource(ActivityFlowable obj) {
		var list = new BasicEList<ActivityRelation>

		val flows = _self.flows
		for (f : flows) {
			if(obj == (f as ActivityRelation).source) list.add(f as ActivityRelation)
		}

		return list
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
	def void run() {
		var src = _self.source
		var tar = _self.target
		var srcvalue = ActivityFlowableAspect.cvalue(src);
		var tarvalue = ActivityFlowableAspect.cvalue(tar);
		if ((_self instanceof ActivityFlow || (_self.eContainer.eContainer as ActivityDef).inParameters.contains(src)) && tarvalue === null) {
			
			if (srcvalue !== null) {
				var ext = ""
				if (_self instanceof ActivityDelegation) ext = "(Delegation sc-tar) "
				println(ext+"Flowing " + srcvalue + " from (" + (src as NamedElement).name + ") to (" + (tar as NamedElement).name +")")
				// 	Update values from source and target
				// Target will now have the value of source
				ActivityFlowableAspect.cvalue(tar, ActivityFlowableAspect.cvalue(src))
				// Value will be consumed, source is now null
				ActivityFlowableAspect.cvalue(src, null)
			}
		} else if ((_self instanceof ActivityDelegation && (_self.eContainer.eContainer as ActivityDef).outParameters.contains(src)) && srcvalue === null){
			if (tarvalue !== null) {
				println("(Delegation tar-src) Flowing " + tarvalue + " from (" + (tar as NamedElement).name + ") to (" +(src as NamedElement).name + ")")
				// Update values from source and target
				// Source will now have the value of target
				ActivityFlowableAspect.cvalue(src, ActivityFlowableAspect.cvalue(tar))
				// Value will be consumed, target is now null
				ActivityFlowableAspect.cvalue(tar, null)
			}
		}
	}
}

@Aspect(className=ActivityFlowable)
abstract class ActivityFlowableAspect {
	public Object cvalue
}

@Aspect(className=DataObject)
abstract class DataObjectAspect extends ActivityFlowableAspect {
	// Produces/stores a value
	@Step
	def void run() {
		// TODO implement me
		// this method either will store a value or put a new value in the storage
	}
}
		