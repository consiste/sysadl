/**
 */
package sysADL_Sintax.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import sysADL_Sintax.ActionDef;
import sysADL_Sintax.ActionPin;
import sysADL_Sintax.ActionReceive;
import sysADL_Sintax.ActionSend;
import sysADL_Sintax.ActionUse;
import sysADL_Sintax.ActivityAllocation;
import sysADL_Sintax.ActivityBody;
import sysADL_Sintax.ActivityDef;
import sysADL_Sintax.ActivityDelegation;
import sysADL_Sintax.ActivityFlow;
import sysADL_Sintax.ActivityFlowable;
import sysADL_Sintax.ActivityRelation;
import sysADL_Sintax.ActivitySwitch;
import sysADL_Sintax.ActivitySwitchCase;
import sysADL_Sintax.Allocation;
import sysADL_Sintax.AllocationTable;
import sysADL_Sintax.ArithmeticExpression;
import sysADL_Sintax.AssignmentExpression;
import sysADL_Sintax.BehaviorDef;
import sysADL_Sintax.BinaryExpression;
import sysADL_Sintax.BlockStatement;
import sysADL_Sintax.BooleanLiteralExpression;
import sysADL_Sintax.ClassificationExpression;
import sysADL_Sintax.ComponentDef;
import sysADL_Sintax.ComponentUse;
import sysADL_Sintax.CompositePortDef;
import sysADL_Sintax.ConditionalExpression;
import sysADL_Sintax.ConditionalLogicalExpression;
import sysADL_Sintax.ConditionalTestExpression;
import sysADL_Sintax.Configuration;
import sysADL_Sintax.ConnectorBinding;
import sysADL_Sintax.ConnectorDef;
import sysADL_Sintax.ConnectorUse;
import sysADL_Sintax.ConstraintDef;
import sysADL_Sintax.ConstraintUse;
import sysADL_Sintax.DataBuffer;
import sysADL_Sintax.DataDef;
import sysADL_Sintax.DataObject;
import sysADL_Sintax.DataStore;
import sysADL_Sintax.DataTypeDef;
import sysADL_Sintax.DefaultSwitchClause;
import sysADL_Sintax.Delegation;
import sysADL_Sintax.DimensionDef;
import sysADL_Sintax.DoStatement;
import sysADL_Sintax.ElementDef;
import sysADL_Sintax.ElseStatement;
import sysADL_Sintax.EnumLiteralValue;
import sysADL_Sintax.Enumeration;
import sysADL_Sintax.Executable;
import sysADL_Sintax.ExecutableAllocation;
import sysADL_Sintax.Expression;
import sysADL_Sintax.Flow;
import sysADL_Sintax.ForControl;
import sysADL_Sintax.ForStatement;
import sysADL_Sintax.ForVar;
import sysADL_Sintax.IfBlockStatement;
import sysADL_Sintax.IfStatement;
import sysADL_Sintax.IncrementOrDecrementExpression;
import sysADL_Sintax.LeftHandSide;
import sysADL_Sintax.LogicalExpression;
import sysADL_Sintax.LoopStatement;
import sysADL_Sintax.Model;
import sysADL_Sintax.NameExpression;
import sysADL_Sintax.NamedElement;
import sysADL_Sintax.NaturalLiteralExpression;
import sysADL_Sintax.NonNameExpression;
import sysADL_Sintax.Pin;
import sysADL_Sintax.PortDef;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.PostfixExpression;
import sysADL_Sintax.PredefinedAction;
import sysADL_Sintax.PrefixExpression;
import sysADL_Sintax.PrimaryExpression;
import sysADL_Sintax.Property;
import sysADL_Sintax.PropertyAccessExpression;
import sysADL_Sintax.Protocol;
import sysADL_Sintax.ProtocolBody;
import sysADL_Sintax.ProtocolBodyInternal;
import sysADL_Sintax.RelationalExpression;
import sysADL_Sintax.Requirement;
import sysADL_Sintax.ReturnStatement;
import sysADL_Sintax.ShiftExpression;
import sysADL_Sintax.SimplePortDef;
import sysADL_Sintax.Statement;
import sysADL_Sintax.StringLiteralExpression;
import sysADL_Sintax.StructuralDef;
import sysADL_Sintax.StructuralUse;
import sysADL_Sintax.SwitchClause;
import sysADL_Sintax.SwitchStatement;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.ThisExpression;
import sysADL_Sintax.TypeDef;
import sysADL_Sintax.TypeUse;
import sysADL_Sintax.UnaryExpression;
import sysADL_Sintax.UnitDef;
import sysADL_Sintax.ValueTypeDef;
import sysADL_Sintax.VariableDecl;
import sysADL_Sintax.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage
 * @generated
 */
public class SysADLSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysADLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysADLSwitch() {
		if (modelPackage == null) {
			modelPackage = SysADLPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SysADLPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PACKAGE: {
				sysADL_Sintax.Package package_ = (sysADL_Sintax.Package)theEObject;
				Object result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.MODEL: {
				Model model = (Model)theEObject;
				Object result = caseModel(model);
				if (result == null) result = caseNamedElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ELEMENT_DEF: {
				ElementDef elementDef = (ElementDef)theEObject;
				Object result = caseElementDef(elementDef);
				if (result == null) result = caseNamedElement(elementDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DATA_DEF: {
				DataDef dataDef = (DataDef)theEObject;
				Object result = caseDataDef(dataDef);
				if (result == null) result = caseElementDef(dataDef);
				if (result == null) result = caseNamedElement(dataDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONSTRAINT_USE: {
				ConstraintUse constraintUse = (ConstraintUse)theEObject;
				Object result = caseConstraintUse(constraintUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DATA_TYPE_DEF: {
				DataTypeDef dataTypeDef = (DataTypeDef)theEObject;
				Object result = caseDataTypeDef(dataTypeDef);
				if (result == null) result = caseTypeDef(dataTypeDef);
				if (result == null) result = caseDataDef(dataTypeDef);
				if (result == null) result = caseElementDef(dataTypeDef);
				if (result == null) result = caseNamedElement(dataTypeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DIMENSION_DEF: {
				DimensionDef dimensionDef = (DimensionDef)theEObject;
				Object result = caseDimensionDef(dimensionDef);
				if (result == null) result = caseDataDef(dimensionDef);
				if (result == null) result = caseElementDef(dimensionDef);
				if (result == null) result = caseNamedElement(dimensionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.TYPE_DEF: {
				TypeDef typeDef = (TypeDef)theEObject;
				Object result = caseTypeDef(typeDef);
				if (result == null) result = caseDataDef(typeDef);
				if (result == null) result = caseElementDef(typeDef);
				if (result == null) result = caseNamedElement(typeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.TYPE_USE: {
				TypeUse typeUse = (TypeUse)theEObject;
				Object result = caseTypeUse(typeUse);
				if (result == null) result = caseNamedElement(typeUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.UNIT_DEF: {
				UnitDef unitDef = (UnitDef)theEObject;
				Object result = caseUnitDef(unitDef);
				if (result == null) result = caseDataDef(unitDef);
				if (result == null) result = caseElementDef(unitDef);
				if (result == null) result = caseNamedElement(unitDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.VALUE_TYPE_DEF: {
				ValueTypeDef valueTypeDef = (ValueTypeDef)theEObject;
				Object result = caseValueTypeDef(valueTypeDef);
				if (result == null) result = caseTypeDef(valueTypeDef);
				if (result == null) result = caseDataDef(valueTypeDef);
				if (result == null) result = caseElementDef(valueTypeDef);
				if (result == null) result = caseNamedElement(valueTypeDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				Object result = caseEnumeration(enumeration);
				if (result == null) result = caseTypeDef(enumeration);
				if (result == null) result = caseDataDef(enumeration);
				if (result == null) result = caseElementDef(enumeration);
				if (result == null) result = caseNamedElement(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ENUM_LITERAL_VALUE: {
				EnumLiteralValue enumLiteralValue = (EnumLiteralValue)theEObject;
				Object result = caseEnumLiteralValue(enumLiteralValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PROPERTY: {
				Property property = (Property)theEObject;
				Object result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.STRUCTURAL_DEF: {
				StructuralDef structuralDef = (StructuralDef)theEObject;
				Object result = caseStructuralDef(structuralDef);
				if (result == null) result = caseElementDef(structuralDef);
				if (result == null) result = caseNamedElement(structuralDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.STRUCTURAL_USE: {
				StructuralUse structuralUse = (StructuralUse)theEObject;
				Object result = caseStructuralUse(structuralUse);
				if (result == null) result = caseNamedElement(structuralUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.COMPONENT_DEF: {
				ComponentDef componentDef = (ComponentDef)theEObject;
				Object result = caseComponentDef(componentDef);
				if (result == null) result = caseStructuralDef(componentDef);
				if (result == null) result = caseElementDef(componentDef);
				if (result == null) result = caseNamedElement(componentDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.COMPONENT_USE: {
				ComponentUse componentUse = (ComponentUse)theEObject;
				Object result = caseComponentUse(componentUse);
				if (result == null) result = caseStructuralUse(componentUse);
				if (result == null) result = caseNamedElement(componentUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONNECTOR_DEF: {
				ConnectorDef connectorDef = (ConnectorDef)theEObject;
				Object result = caseConnectorDef(connectorDef);
				if (result == null) result = caseStructuralDef(connectorDef);
				if (result == null) result = caseElementDef(connectorDef);
				if (result == null) result = caseNamedElement(connectorDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONNECTOR_USE: {
				ConnectorUse connectorUse = (ConnectorUse)theEObject;
				Object result = caseConnectorUse(connectorUse);
				if (result == null) result = caseStructuralUse(connectorUse);
				if (result == null) result = caseNamedElement(connectorUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				Object result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DELEGATION: {
				Delegation delegation = (Delegation)theEObject;
				Object result = caseDelegation(delegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.COMPOSITE_PORT_DEF: {
				CompositePortDef compositePortDef = (CompositePortDef)theEObject;
				Object result = caseCompositePortDef(compositePortDef);
				if (result == null) result = casePortDef(compositePortDef);
				if (result == null) result = caseStructuralDef(compositePortDef);
				if (result == null) result = caseElementDef(compositePortDef);
				if (result == null) result = caseNamedElement(compositePortDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.SIMPLE_PORT_DEF: {
				SimplePortDef simplePortDef = (SimplePortDef)theEObject;
				Object result = caseSimplePortDef(simplePortDef);
				if (result == null) result = casePortDef(simplePortDef);
				if (result == null) result = caseStructuralDef(simplePortDef);
				if (result == null) result = caseElementDef(simplePortDef);
				if (result == null) result = caseNamedElement(simplePortDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PORT_USE: {
				PortUse portUse = (PortUse)theEObject;
				Object result = casePortUse(portUse);
				if (result == null) result = caseStructuralUse(portUse);
				if (result == null) result = caseNamedElement(portUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONNECTOR_BINDING: {
				ConnectorBinding connectorBinding = (ConnectorBinding)theEObject;
				Object result = caseConnectorBinding(connectorBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				Object result = caseFlow(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.BEHAVIOR_DEF: {
				BehaviorDef behaviorDef = (BehaviorDef)theEObject;
				Object result = caseBehaviorDef(behaviorDef);
				if (result == null) result = caseElementDef(behaviorDef);
				if (result == null) result = caseNamedElement(behaviorDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTION_DEF: {
				ActionDef actionDef = (ActionDef)theEObject;
				Object result = caseActionDef(actionDef);
				if (result == null) result = caseBehaviorDef(actionDef);
				if (result == null) result = caseActivityFlowable(actionDef);
				if (result == null) result = caseElementDef(actionDef);
				if (result == null) result = caseNamedElement(actionDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTION_USE: {
				ActionUse actionUse = (ActionUse)theEObject;
				Object result = caseActionUse(actionUse);
				if (result == null) result = caseNamedElement(actionUse);
				if (result == null) result = caseActivityFlowable(actionUse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_BODY: {
				ActivityBody activityBody = (ActivityBody)theEObject;
				Object result = caseActivityBody(activityBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PORT_DEF: {
				PortDef portDef = (PortDef)theEObject;
				Object result = casePortDef(portDef);
				if (result == null) result = caseStructuralDef(portDef);
				if (result == null) result = caseElementDef(portDef);
				if (result == null) result = caseNamedElement(portDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_DEF: {
				ActivityDef activityDef = (ActivityDef)theEObject;
				Object result = caseActivityDef(activityDef);
				if (result == null) result = caseBehaviorDef(activityDef);
				if (result == null) result = caseElementDef(activityDef);
				if (result == null) result = caseNamedElement(activityDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_RELATION: {
				ActivityRelation activityRelation = (ActivityRelation)theEObject;
				Object result = caseActivityRelation(activityRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_DELEGATION: {
				ActivityDelegation activityDelegation = (ActivityDelegation)theEObject;
				Object result = caseActivityDelegation(activityDelegation);
				if (result == null) result = caseActivityRelation(activityDelegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_FLOW: {
				ActivityFlow activityFlow = (ActivityFlow)theEObject;
				Object result = caseActivityFlow(activityFlow);
				if (result == null) result = caseActivityRelation(activityFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_SWITCH: {
				ActivitySwitch activitySwitch = (ActivitySwitch)theEObject;
				Object result = caseActivitySwitch(activitySwitch);
				if (result == null) result = caseActivityFlowable(activitySwitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_SWITCH_CASE: {
				ActivitySwitchCase activitySwitchCase = (ActivitySwitchCase)theEObject;
				Object result = caseActivitySwitchCase(activitySwitchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_FLOWABLE: {
				ActivityFlowable activityFlowable = (ActivityFlowable)theEObject;
				Object result = caseActivityFlowable(activityFlowable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PIN: {
				Pin pin = (Pin)theEObject;
				Object result = casePin(pin);
				if (result == null) result = caseTypeUse(pin);
				if (result == null) result = caseActivityFlowable(pin);
				if (result == null) result = caseNamedElement(pin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTION_PIN: {
				ActionPin actionPin = (ActionPin)theEObject;
				Object result = caseActionPin(actionPin);
				if (result == null) result = casePin(actionPin);
				if (result == null) result = caseTypeUse(actionPin);
				if (result == null) result = caseActivityFlowable(actionPin);
				if (result == null) result = caseNamedElement(actionPin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DATA_OBJECT: {
				DataObject dataObject = (DataObject)theEObject;
				Object result = caseDataObject(dataObject);
				if (result == null) result = caseNamedElement(dataObject);
				if (result == null) result = caseActivityFlowable(dataObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DATA_STORE: {
				DataStore dataStore = (DataStore)theEObject;
				Object result = caseDataStore(dataStore);
				if (result == null) result = caseDataObject(dataStore);
				if (result == null) result = caseNamedElement(dataStore);
				if (result == null) result = caseActivityFlowable(dataStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DATA_BUFFER: {
				DataBuffer dataBuffer = (DataBuffer)theEObject;
				Object result = caseDataBuffer(dataBuffer);
				if (result == null) result = caseDataObject(dataBuffer);
				if (result == null) result = caseNamedElement(dataBuffer);
				if (result == null) result = caseActivityFlowable(dataBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PROTOCOL_BODY: {
				ProtocolBody protocolBody = (ProtocolBody)theEObject;
				Object result = caseProtocolBody(protocolBody);
				if (result == null) result = caseProtocolBodyInternal(protocolBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PROTOCOL_BODY_INTERNAL: {
				ProtocolBodyInternal protocolBodyInternal = (ProtocolBodyInternal)theEObject;
				Object result = caseProtocolBodyInternal(protocolBodyInternal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PREDEFINED_ACTION: {
				PredefinedAction predefinedAction = (PredefinedAction)theEObject;
				Object result = casePredefinedAction(predefinedAction);
				if (result == null) result = caseProtocolBodyInternal(predefinedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTION_SEND: {
				ActionSend actionSend = (ActionSend)theEObject;
				Object result = caseActionSend(actionSend);
				if (result == null) result = casePredefinedAction(actionSend);
				if (result == null) result = caseProtocolBodyInternal(actionSend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTION_RECEIVE: {
				ActionReceive actionReceive = (ActionReceive)theEObject;
				Object result = caseActionReceive(actionReceive);
				if (result == null) result = casePredefinedAction(actionReceive);
				if (result == null) result = caseProtocolBodyInternal(actionReceive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				Object result = caseProtocol(protocol);
				if (result == null) result = caseBehaviorDef(protocol);
				if (result == null) result = caseElementDef(protocol);
				if (result == null) result = caseNamedElement(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONSTRAINT_DEF: {
				ConstraintDef constraintDef = (ConstraintDef)theEObject;
				Object result = caseConstraintDef(constraintDef);
				if (result == null) result = caseBehaviorDef(constraintDef);
				if (result == null) result = caseElementDef(constraintDef);
				if (result == null) result = caseNamedElement(constraintDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.EXECUTABLE: {
				Executable executable = (Executable)theEObject;
				Object result = caseExecutable(executable);
				if (result == null) result = caseElementDef(executable);
				if (result == null) result = caseNamedElement(executable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				Object result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				Object result = caseExpression(expression);
				if (result == null) result = caseStatement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION: {
				ConditionalTestExpression conditionalTestExpression = (ConditionalTestExpression)theEObject;
				Object result = caseConditionalTestExpression(conditionalTestExpression);
				if (result == null) result = caseExpression(conditionalTestExpression);
				if (result == null) result = caseStatement(conditionalTestExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				Object result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseStatement(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CONDITIONAL_LOGICAL_EXPRESSION: {
				ConditionalLogicalExpression conditionalLogicalExpression = (ConditionalLogicalExpression)theEObject;
				Object result = caseConditionalLogicalExpression(conditionalLogicalExpression);
				if (result == null) result = caseBinaryExpression(conditionalLogicalExpression);
				if (result == null) result = caseExpression(conditionalLogicalExpression);
				if (result == null) result = caseStatement(conditionalLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				Object result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseBinaryExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = caseStatement(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				Object result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseBinaryExpression(relationalExpression);
				if (result == null) result = caseExpression(relationalExpression);
				if (result == null) result = caseStatement(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.SHIFT_EXPRESSION: {
				ShiftExpression shiftExpression = (ShiftExpression)theEObject;
				Object result = caseShiftExpression(shiftExpression);
				if (result == null) result = caseBinaryExpression(shiftExpression);
				if (result == null) result = caseExpression(shiftExpression);
				if (result == null) result = caseStatement(shiftExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				Object result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseBinaryExpression(arithmeticExpression);
				if (result == null) result = caseExpression(arithmeticExpression);
				if (result == null) result = caseStatement(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				Object result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseStatement(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.CLASSIFICATION_EXPRESSION: {
				ClassificationExpression classificationExpression = (ClassificationExpression)theEObject;
				Object result = caseClassificationExpression(classificationExpression);
				if (result == null) result = caseUnaryExpression(classificationExpression);
				if (result == null) result = caseExpression(classificationExpression);
				if (result == null) result = caseStatement(classificationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PRIMARY_EXPRESSION: {
				PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
				Object result = casePrimaryExpression(primaryExpression);
				if (result == null) result = caseExpression(primaryExpression);
				if (result == null) result = caseStatement(primaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.NAME_EXPRESSION: {
				NameExpression nameExpression = (NameExpression)theEObject;
				Object result = caseNameExpression(nameExpression);
				if (result == null) result = casePrimaryExpression(nameExpression);
				if (result == null) result = caseExpression(nameExpression);
				if (result == null) result = caseStatement(nameExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.NON_NAME_EXPRESSION: {
				NonNameExpression nonNameExpression = (NonNameExpression)theEObject;
				Object result = caseNonNameExpression(nonNameExpression);
				if (result == null) result = casePrimaryExpression(nonNameExpression);
				if (result == null) result = caseExpression(nonNameExpression);
				if (result == null) result = caseStatement(nonNameExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.BOOLEAN_LITERAL_EXPRESSION: {
				BooleanLiteralExpression booleanLiteralExpression = (BooleanLiteralExpression)theEObject;
				Object result = caseBooleanLiteralExpression(booleanLiteralExpression);
				if (result == null) result = caseNonNameExpression(booleanLiteralExpression);
				if (result == null) result = casePrimaryExpression(booleanLiteralExpression);
				if (result == null) result = caseExpression(booleanLiteralExpression);
				if (result == null) result = caseStatement(booleanLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.NATURAL_LITERAL_EXPRESSION: {
				NaturalLiteralExpression naturalLiteralExpression = (NaturalLiteralExpression)theEObject;
				Object result = caseNaturalLiteralExpression(naturalLiteralExpression);
				if (result == null) result = caseNonNameExpression(naturalLiteralExpression);
				if (result == null) result = casePrimaryExpression(naturalLiteralExpression);
				if (result == null) result = caseExpression(naturalLiteralExpression);
				if (result == null) result = caseStatement(naturalLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.STRING_LITERAL_EXPRESSION: {
				StringLiteralExpression stringLiteralExpression = (StringLiteralExpression)theEObject;
				Object result = caseStringLiteralExpression(stringLiteralExpression);
				if (result == null) result = caseNonNameExpression(stringLiteralExpression);
				if (result == null) result = casePrimaryExpression(stringLiteralExpression);
				if (result == null) result = caseExpression(stringLiteralExpression);
				if (result == null) result = caseStatement(stringLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.THIS_EXPRESSION: {
				ThisExpression thisExpression = (ThisExpression)theEObject;
				Object result = caseThisExpression(thisExpression);
				if (result == null) result = caseNonNameExpression(thisExpression);
				if (result == null) result = casePrimaryExpression(thisExpression);
				if (result == null) result = caseExpression(thisExpression);
				if (result == null) result = caseStatement(thisExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PROPERTY_ACCESS_EXPRESSION: {
				PropertyAccessExpression propertyAccessExpression = (PropertyAccessExpression)theEObject;
				Object result = casePropertyAccessExpression(propertyAccessExpression);
				if (result == null) result = casePrimaryExpression(propertyAccessExpression);
				if (result == null) result = caseExpression(propertyAccessExpression);
				if (result == null) result = caseStatement(propertyAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.INCREMENT_OR_DECREMENT_EXPRESSION: {
				IncrementOrDecrementExpression incrementOrDecrementExpression = (IncrementOrDecrementExpression)theEObject;
				Object result = caseIncrementOrDecrementExpression(incrementOrDecrementExpression);
				if (result == null) result = caseExpression(incrementOrDecrementExpression);
				if (result == null) result = caseStatement(incrementOrDecrementExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.PREFIX_EXPRESSION: {
				PrefixExpression prefixExpression = (PrefixExpression)theEObject;
				Object result = casePrefixExpression(prefixExpression);
				if (result == null) result = caseIncrementOrDecrementExpression(prefixExpression);
				if (result == null) result = caseExpression(prefixExpression);
				if (result == null) result = caseStatement(prefixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.POSTFIX_EXPRESSION: {
				PostfixExpression postfixExpression = (PostfixExpression)theEObject;
				Object result = casePostfixExpression(postfixExpression);
				if (result == null) result = caseIncrementOrDecrementExpression(postfixExpression);
				if (result == null) result = caseExpression(postfixExpression);
				if (result == null) result = caseStatement(postfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.BLOCK_STATEMENT: {
				BlockStatement blockStatement = (BlockStatement)theEObject;
				Object result = caseBlockStatement(blockStatement);
				if (result == null) result = caseStatement(blockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ASSIGNMENT_EXPRESSION: {
				AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
				Object result = caseAssignmentExpression(assignmentExpression);
				if (result == null) result = caseExpression(assignmentExpression);
				if (result == null) result = caseStatement(assignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.LEFT_HAND_SIDE: {
				LeftHandSide leftHandSide = (LeftHandSide)theEObject;
				Object result = caseLeftHandSide(leftHandSide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.VARIABLE_DECL: {
				VariableDecl variableDecl = (VariableDecl)theEObject;
				Object result = caseVariableDecl(variableDecl);
				if (result == null) result = caseStatement(variableDecl);
				if (result == null) result = caseTypeUse(variableDecl);
				if (result == null) result = caseNamedElement(variableDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.IF_BLOCK_STATEMENT: {
				IfBlockStatement ifBlockStatement = (IfBlockStatement)theEObject;
				Object result = caseIfBlockStatement(ifBlockStatement);
				if (result == null) result = caseStatement(ifBlockStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				Object result = caseIfStatement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ELSE_STATEMENT: {
				ElseStatement elseStatement = (ElseStatement)theEObject;
				Object result = caseElseStatement(elseStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				Object result = caseReturnStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.LOOP_STATEMENT: {
				LoopStatement loopStatement = (LoopStatement)theEObject;
				Object result = caseLoopStatement(loopStatement);
				if (result == null) result = caseStatement(loopStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				Object result = caseWhileStatement(whileStatement);
				if (result == null) result = caseLoopStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DO_STATEMENT: {
				DoStatement doStatement = (DoStatement)theEObject;
				Object result = caseDoStatement(doStatement);
				if (result == null) result = caseLoopStatement(doStatement);
				if (result == null) result = caseStatement(doStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				Object result = caseForStatement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.FOR_CONTROL: {
				ForControl forControl = (ForControl)theEObject;
				Object result = caseForControl(forControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.FOR_VAR: {
				ForVar forVar = (ForVar)theEObject;
				Object result = caseForVar(forVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.SWITCH_STATEMENT: {
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				Object result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.SWITCH_CLAUSE: {
				SwitchClause switchClause = (SwitchClause)theEObject;
				Object result = caseSwitchClause(switchClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.DEFAULT_SWITCH_CLAUSE: {
				DefaultSwitchClause defaultSwitchClause = (DefaultSwitchClause)theEObject;
				Object result = caseDefaultSwitchClause(defaultSwitchClause);
				if (result == null) result = caseSwitchClause(defaultSwitchClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				Object result = caseRequirement(requirement);
				if (result == null) result = caseNamedElement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ALLOCATION_TABLE: {
				AllocationTable allocationTable = (AllocationTable)theEObject;
				Object result = caseAllocationTable(allocationTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ALLOCATION: {
				Allocation allocation = (Allocation)theEObject;
				Object result = caseAllocation(allocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.EXECUTABLE_ALLOCATION: {
				ExecutableAllocation executableAllocation = (ExecutableAllocation)theEObject;
				Object result = caseExecutableAllocation(executableAllocation);
				if (result == null) result = caseAllocation(executableAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SysADLPackage.ACTIVITY_ALLOCATION: {
				ActivityAllocation activityAllocation = (ActivityAllocation)theEObject;
				Object result = caseActivityAllocation(activityAllocation);
				if (result == null) result = caseAllocation(activityAllocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePackage(sysADL_Sintax.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElementDef(ElementDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataDef(DataDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraintUse(ConstraintUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataTypeDef(DataTypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDimensionDef(DimensionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeDef(TypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTypeUse(TypeUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnitDef(UnitDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseValueTypeDef(ValueTypeDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseEnumLiteralValue(EnumLiteralValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuralDef(StructuralDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStructuralUse(StructuralUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentDef(ComponentDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentUse(ComponentUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectorDef(ConnectorDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectorUse(ConnectorUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDelegation(Delegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Port Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Port Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCompositePortDef(CompositePortDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Port Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Port Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimplePortDef(SimplePortDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortUse(PortUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConnectorBinding(ConnectorBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBehaviorDef(BehaviorDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionDef(ActionDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Use</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Use</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionUse(ActionUse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityBody(ActivityBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortDef(PortDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityDef(ActivityDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityRelation(ActivityRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Delegation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityDelegation(ActivityDelegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityFlow(ActivityFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivitySwitch(ActivitySwitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivitySwitchCase(ActivitySwitchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Flowable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Flowable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityFlowable(ActivityFlowable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePin(Pin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Pin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Pin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionPin(ActionPin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataStore(DataStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDataBuffer(DataBuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProtocolBody(ProtocolBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Body Internal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Body Internal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProtocolBodyInternal(ProtocolBodyInternal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePredefinedAction(PredefinedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionSend(ActionSend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Receive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Receive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActionReceive(ActionReceive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraintDef(ConstraintDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutable(Executable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Test Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Test Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConditionalTestExpression(ConditionalTestExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConditionalLogicalExpression(ConditionalLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLogicalExpression(LogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseShiftExpression(ShiftExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseClassificationExpression(ClassificationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrimaryExpression(PrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNameExpression(NameExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Name Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNonNameExpression(NonNameExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanLiteralExpression(BooleanLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNaturalLiteralExpression(NaturalLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringLiteralExpression(StringLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseThisExpression(ThisExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePropertyAccessExpression(PropertyAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Increment Or Decrement Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Increment Or Decrement Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIncrementOrDecrementExpression(IncrementOrDecrementExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrefixExpression(PrefixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePostfixExpression(PostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBlockStatement(BlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssignmentExpression(AssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left Hand Side</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left Hand Side</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLeftHandSide(LeftHandSide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseVariableDecl(VariableDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Block Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIfBlockStatement(IfBlockStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElseStatement(ElseStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseLoopStatement(LoopStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoStatement(DoStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForControl(ForControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseForVar(ForVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSwitchClause(SwitchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Switch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Switch Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDefaultSwitchClause(DefaultSwitchClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAllocationTable(AllocationTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAllocation(Allocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executable Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executable Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExecutableAllocation(ExecutableAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Allocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActivityAllocation(ActivityAllocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //SysADLSwitch
