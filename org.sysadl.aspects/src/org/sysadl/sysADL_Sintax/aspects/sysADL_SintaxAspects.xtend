package org.sysadl.sysADL_Sintax.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.eclipse.emf.common.util.EList
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.BasicEList
import sysADL_Sintax.ActivityBody
import sysADL_Sintax.ActivityDef
import sysADL_Sintax.ActivityDelegation
import sysADL_Sintax.DataObject
import sysADL_Sintax.ActivityRelation
import sysADL_Sintax.ActionUse
import sysADL_Sintax.Pin
import sysADL_Sintax.ActivityFlowable
import sysADL_Sintax.NamedElement
import org.sysadl.aspects.SysADLExecutionEngine
import java.util.HashMap
import java.util.Map
import sysADL_Sintax.util.SysADLCreationTools
import sysADL_Sintax.Model
import sysADL_Sintax.ExecutableAllocation

@Aspect(className=ActivityBody)
class ActivityBodyAspect {
	private EList flowsCurrent = new BasicEList
	private EList dataObjectFlows = new BasicEList

	/**
	 * Initialize the model, setting the private attributes and pin values for input
	 */
	@InitializeModel
	def public void init(EList<String> args) {
		/* Identify PinIn */
		val pinsIn = (_self.eContainer() as ActivityDef).inParameters

		// Set values for pinIn
		for (i : pinsIn) {
			// TODO implement me
			ActivityFlowableAspect.cvalue(i as Pin, Helper.genValue)
		}

		/* Select entry points and set values */
		// Initialize flowsCurrent list
		_self.flowsCurrent.clear // Just in case
		// Get all delegations
		val delegations = _self.flows.filter[i|i.class == ActivityDelegation]
		for (d : delegations) {
			// If the source of this delegation is a pinIn or a DataObject
			val source = (d as ActivityDelegation).source
			if (pinsIn.contains(source)) {
				// TODO the value of source must be initialized
				ActivityFlowableAspect.cvalue(source, Helper.genValue)

				// This delegation will be used in next step
				_self.flowsCurrent.add(d)
			}
		}

		/* The DataObject that are source will always produce a value, save the flows */
		val dataObjects = _self.actions.filter[i|i.class == DataObject]
		for (f : dataObjects) {
			// Add all relation which source is a data object
			_self.dataObjectFlows.addAll(_self.getRelationsBySource(f))
		}
	}

	/** 
	 * For now, main method just iterates over steps
	 */
	@Main
	def static void main() {
		// If if flowsCurrent has the same size as dataObject flows, it means that only the data objects are producing something
		while (_self.flowsCurrent.size > _self.dataObjectFlows.size) {
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
		// Flow steps:
		for (f : _self.flowsCurrent) {
			ActivityRelationAspect.run(f as ActivityRelation)
		}
		// After that, reset flow list, it will be re-generated in the two following steps
		_self.flowsCurrent.clear()

		// Action steps:
		for (a : _self.actions) { // a is an ActionUse 
			var canRun = true
			for (p : (a as ActionUse).pinIn) {
				if (ActivityFlowableAspect.cvalue(p as Pin) === null) {
					// Do nothing, action a cannot run yet
					canRun = false
					return // break the loop
				}
			}
			// If action can run, run
			if (canRun) {
				ActionUseAspect.run(a as ActionUse)

				// Produce value, add its flows to the flows current
				_self.flowsCurrent.addAll(_self.getRelationsBySource(a as ActionUse))
			}
		}

		// Data steps:
		// The data object produces a value
		for (d : _self.dataObjects) {
			DataObjectAspect.run(d as DataObject)
		}
		// Add the data object flows in the current flows list
		_self.flowsCurrent.addAll(_self.dataObjectFlows)
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
	public Object value

	def static void run() {
		println("Trying to run action "+_self.name)
		val Map<String, Object> context = new HashMap<String, Object>()
		if (ActionUseAspect.canRun(_self)) {
			println("Running action "+_self.name)
			// Consume values of inputs
			for (i : _self.pinIn) {
				// put all pinIn in context
				context.put((i as Pin).name, ActivityFlowableAspect.cvalue(i as Pin))
				// Set previous values as null
				ActivityFlowableAspect.cvalue(i as Pin, null)
			}
			_self.value = Helper.genValue // for testing purposes TODO disable when execution is okay
			// Find executable for this action
			val Model model = SysADLCreationTools.getModel(_self)
			for (alloc : model.allocation.allocs) {
				if ((alloc instanceof ExecutableAllocation) && (alloc as ExecutableAllocation).target.equals(_self)) {
					// execute and add return value to the pinOut
					_self.value = SysADLExecutionEngine.instance.execute((alloc as ExecutableAllocation).source, context);
					return
				} 
			}
			// at this point, no executable was found
			print("No executable found for "+_self.name+". Execution halted.")
		}
		else {
			println("Action "+_self.name+" does not have all necessary values")
		}
	}
	
	def boolean canRun() {
		return true	
	}
}


@Aspect(className=ActivityRelation)
class ActivityRelationAspect {
	def void run() {
		var src = _self.source
		var tar = _self.target
		println("Running flow from (" + (src as NamedElement).name + ") to (" + (tar as NamedElement).name + ")")
		// Update values from source and target
		// Target will now have the value of source
		ActivityFlowableAspect.cvalue(tar, ActivityFlowableAspect.cvalue(src))
		// Value will be consumed, source is now null
		ActivityFlowableAspect.cvalue(src, null)		
	}

}

@Aspect(className=ActivityFlowable)
abstract class ActivityFlowableAspect {
	public Object cvalue
}

@Aspect(className=DataObject)
abstract class DataObjectAspect extends ActivityFlowableAspect {
	// Produces a value
	def static void run() {
		// TODO implement me
		_self.cvalue = Helper.genValue()
	}	
}
