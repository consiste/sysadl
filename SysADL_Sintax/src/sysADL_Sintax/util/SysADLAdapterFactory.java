/**
 */
package sysADL_Sintax.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage
 * @generated
 */
public class SysADLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SysADLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysADLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SysADLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysADLSwitch modelSwitch =
		new SysADLSwitch() {
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object casePackage(sysADL_Sintax.Package object) {
				return createPackageAdapter();
			}
			public Object caseModel(Model object) {
				return createModelAdapter();
			}
			public Object caseElementDef(ElementDef object) {
				return createElementDefAdapter();
			}
			public Object caseDataDef(DataDef object) {
				return createDataDefAdapter();
			}
			public Object caseConstraintUse(ConstraintUse object) {
				return createConstraintUseAdapter();
			}
			public Object caseDataTypeDef(DataTypeDef object) {
				return createDataTypeDefAdapter();
			}
			public Object caseDimensionDef(DimensionDef object) {
				return createDimensionDefAdapter();
			}
			public Object caseTypeDef(TypeDef object) {
				return createTypeDefAdapter();
			}
			public Object caseTypeUse(TypeUse object) {
				return createTypeUseAdapter();
			}
			public Object caseUnitDef(UnitDef object) {
				return createUnitDefAdapter();
			}
			public Object caseValueTypeDef(ValueTypeDef object) {
				return createValueTypeDefAdapter();
			}
			public Object caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			public Object caseEnumLiteralValue(EnumLiteralValue object) {
				return createEnumLiteralValueAdapter();
			}
			public Object caseProperty(Property object) {
				return createPropertyAdapter();
			}
			public Object caseStructuralDef(StructuralDef object) {
				return createStructuralDefAdapter();
			}
			public Object caseStructuralUse(StructuralUse object) {
				return createStructuralUseAdapter();
			}
			public Object caseComponentDef(ComponentDef object) {
				return createComponentDefAdapter();
			}
			public Object caseComponentUse(ComponentUse object) {
				return createComponentUseAdapter();
			}
			public Object caseConnectorDef(ConnectorDef object) {
				return createConnectorDefAdapter();
			}
			public Object caseConnectorUse(ConnectorUse object) {
				return createConnectorUseAdapter();
			}
			public Object caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			public Object caseDelegation(Delegation object) {
				return createDelegationAdapter();
			}
			public Object caseCompositePortDef(CompositePortDef object) {
				return createCompositePortDefAdapter();
			}
			public Object caseSimplePortDef(SimplePortDef object) {
				return createSimplePortDefAdapter();
			}
			public Object casePortUse(PortUse object) {
				return createPortUseAdapter();
			}
			public Object caseConnectorBinding(ConnectorBinding object) {
				return createConnectorBindingAdapter();
			}
			public Object caseFlow(Flow object) {
				return createFlowAdapter();
			}
			public Object caseBehaviorDef(BehaviorDef object) {
				return createBehaviorDefAdapter();
			}
			public Object caseActionDef(ActionDef object) {
				return createActionDefAdapter();
			}
			public Object caseActionUse(ActionUse object) {
				return createActionUseAdapter();
			}
			public Object caseActivityBody(ActivityBody object) {
				return createActivityBodyAdapter();
			}
			public Object casePortDef(PortDef object) {
				return createPortDefAdapter();
			}
			public Object caseActivityDef(ActivityDef object) {
				return createActivityDefAdapter();
			}
			public Object caseActivityRelation(ActivityRelation object) {
				return createActivityRelationAdapter();
			}
			public Object caseActivityDelegation(ActivityDelegation object) {
				return createActivityDelegationAdapter();
			}
			public Object caseActivityFlow(ActivityFlow object) {
				return createActivityFlowAdapter();
			}
			public Object caseActivitySwitch(ActivitySwitch object) {
				return createActivitySwitchAdapter();
			}
			public Object caseActivitySwitchCase(ActivitySwitchCase object) {
				return createActivitySwitchCaseAdapter();
			}
			public Object caseActivityFlowable(ActivityFlowable object) {
				return createActivityFlowableAdapter();
			}
			public Object casePin(Pin object) {
				return createPinAdapter();
			}
			public Object caseActionPin(ActionPin object) {
				return createActionPinAdapter();
			}
			public Object caseDataObject(DataObject object) {
				return createDataObjectAdapter();
			}
			public Object caseDataStore(DataStore object) {
				return createDataStoreAdapter();
			}
			public Object caseDataBuffer(DataBuffer object) {
				return createDataBufferAdapter();
			}
			public Object caseProtocolBody(ProtocolBody object) {
				return createProtocolBodyAdapter();
			}
			public Object caseProtocolBodyInternal(ProtocolBodyInternal object) {
				return createProtocolBodyInternalAdapter();
			}
			public Object casePredefinedAction(PredefinedAction object) {
				return createPredefinedActionAdapter();
			}
			public Object caseActionSend(ActionSend object) {
				return createActionSendAdapter();
			}
			public Object caseActionReceive(ActionReceive object) {
				return createActionReceiveAdapter();
			}
			public Object caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			public Object caseConstraintDef(ConstraintDef object) {
				return createConstraintDefAdapter();
			}
			public Object caseExecutable(Executable object) {
				return createExecutableAdapter();
			}
			public Object caseStatement(Statement object) {
				return createStatementAdapter();
			}
			public Object caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			public Object caseConditionalTestExpression(ConditionalTestExpression object) {
				return createConditionalTestExpressionAdapter();
			}
			public Object caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			public Object caseConditionalLogicalExpression(ConditionalLogicalExpression object) {
				return createConditionalLogicalExpressionAdapter();
			}
			public Object caseLogicalExpression(LogicalExpression object) {
				return createLogicalExpressionAdapter();
			}
			public Object caseRelationalExpression(RelationalExpression object) {
				return createRelationalExpressionAdapter();
			}
			public Object caseShiftExpression(ShiftExpression object) {
				return createShiftExpressionAdapter();
			}
			public Object caseArithmeticExpression(ArithmeticExpression object) {
				return createArithmeticExpressionAdapter();
			}
			public Object caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			public Object caseClassificationExpression(ClassificationExpression object) {
				return createClassificationExpressionAdapter();
			}
			public Object casePrimaryExpression(PrimaryExpression object) {
				return createPrimaryExpressionAdapter();
			}
			public Object caseNameExpression(NameExpression object) {
				return createNameExpressionAdapter();
			}
			public Object caseNonNameExpression(NonNameExpression object) {
				return createNonNameExpressionAdapter();
			}
			public Object caseBooleanLiteralExpression(BooleanLiteralExpression object) {
				return createBooleanLiteralExpressionAdapter();
			}
			public Object caseNaturalLiteralExpression(NaturalLiteralExpression object) {
				return createNaturalLiteralExpressionAdapter();
			}
			public Object caseStringLiteralExpression(StringLiteralExpression object) {
				return createStringLiteralExpressionAdapter();
			}
			public Object caseThisExpression(ThisExpression object) {
				return createThisExpressionAdapter();
			}
			public Object casePropertyAccessExpression(PropertyAccessExpression object) {
				return createPropertyAccessExpressionAdapter();
			}
			public Object caseIncrementOrDecrementExpression(IncrementOrDecrementExpression object) {
				return createIncrementOrDecrementExpressionAdapter();
			}
			public Object casePrefixExpression(PrefixExpression object) {
				return createPrefixExpressionAdapter();
			}
			public Object casePostfixExpression(PostfixExpression object) {
				return createPostfixExpressionAdapter();
			}
			public Object caseBlockStatement(BlockStatement object) {
				return createBlockStatementAdapter();
			}
			public Object caseAssignmentExpression(AssignmentExpression object) {
				return createAssignmentExpressionAdapter();
			}
			public Object caseLeftHandSide(LeftHandSide object) {
				return createLeftHandSideAdapter();
			}
			public Object caseVariableDecl(VariableDecl object) {
				return createVariableDeclAdapter();
			}
			public Object caseIfBlockStatement(IfBlockStatement object) {
				return createIfBlockStatementAdapter();
			}
			public Object caseIfStatement(IfStatement object) {
				return createIfStatementAdapter();
			}
			public Object caseElseStatement(ElseStatement object) {
				return createElseStatementAdapter();
			}
			public Object caseReturnStatement(ReturnStatement object) {
				return createReturnStatementAdapter();
			}
			public Object caseLoopStatement(LoopStatement object) {
				return createLoopStatementAdapter();
			}
			public Object caseWhileStatement(WhileStatement object) {
				return createWhileStatementAdapter();
			}
			public Object caseDoStatement(DoStatement object) {
				return createDoStatementAdapter();
			}
			public Object caseForStatement(ForStatement object) {
				return createForStatementAdapter();
			}
			public Object caseForControl(ForControl object) {
				return createForControlAdapter();
			}
			public Object caseForVar(ForVar object) {
				return createForVarAdapter();
			}
			public Object caseSwitchStatement(SwitchStatement object) {
				return createSwitchStatementAdapter();
			}
			public Object caseSwitchClause(SwitchClause object) {
				return createSwitchClauseAdapter();
			}
			public Object caseDefaultSwitchClause(DefaultSwitchClause object) {
				return createDefaultSwitchClauseAdapter();
			}
			public Object caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			public Object caseAllocationTable(AllocationTable object) {
				return createAllocationTableAdapter();
			}
			public Object caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			public Object caseExecutableAllocation(ExecutableAllocation object) {
				return createExecutableAllocationAdapter();
			}
			public Object caseActivityAllocation(ActivityAllocation object) {
				return createActivityAllocationAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ElementDef <em>Element Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ElementDef
	 * @generated
	 */
	public Adapter createElementDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DataDef
	 * @generated
	 */
	public Adapter createDataDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConstraintUse <em>Constraint Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConstraintUse
	 * @generated
	 */
	public Adapter createConstraintUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DataTypeDef <em>Data Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DataTypeDef
	 * @generated
	 */
	public Adapter createDataTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DimensionDef <em>Dimension Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DimensionDef
	 * @generated
	 */
	public Adapter createDimensionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.TypeDef
	 * @generated
	 */
	public Adapter createTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.TypeUse <em>Type Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.TypeUse
	 * @generated
	 */
	public Adapter createTypeUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.UnitDef <em>Unit Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.UnitDef
	 * @generated
	 */
	public Adapter createUnitDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ValueTypeDef <em>Value Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ValueTypeDef
	 * @generated
	 */
	public Adapter createValueTypeDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.EnumLiteralValue <em>Enum Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.EnumLiteralValue
	 * @generated
	 */
	public Adapter createEnumLiteralValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.StructuralDef <em>Structural Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.StructuralDef
	 * @generated
	 */
	public Adapter createStructuralDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.StructuralUse <em>Structural Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.StructuralUse
	 * @generated
	 */
	public Adapter createStructuralUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ComponentDef <em>Component Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ComponentDef
	 * @generated
	 */
	public Adapter createComponentDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ComponentUse <em>Component Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ComponentUse
	 * @generated
	 */
	public Adapter createComponentUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConnectorDef <em>Connector Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConnectorDef
	 * @generated
	 */
	public Adapter createConnectorDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConnectorUse <em>Connector Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConnectorUse
	 * @generated
	 */
	public Adapter createConnectorUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Delegation
	 * @generated
	 */
	public Adapter createDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.CompositePortDef <em>Composite Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.CompositePortDef
	 * @generated
	 */
	public Adapter createCompositePortDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.SimplePortDef <em>Simple Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.SimplePortDef
	 * @generated
	 */
	public Adapter createSimplePortDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PortUse <em>Port Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PortUse
	 * @generated
	 */
	public Adapter createPortUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConnectorBinding <em>Connector Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConnectorBinding
	 * @generated
	 */
	public Adapter createConnectorBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.BehaviorDef <em>Behavior Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.BehaviorDef
	 * @generated
	 */
	public Adapter createBehaviorDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActionDef <em>Action Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActionDef
	 * @generated
	 */
	public Adapter createActionDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActionUse <em>Action Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActionUse
	 * @generated
	 */
	public Adapter createActionUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityBody <em>Activity Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityBody
	 * @generated
	 */
	public Adapter createActivityBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PortDef <em>Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PortDef
	 * @generated
	 */
	public Adapter createPortDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityDef <em>Activity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityDef
	 * @generated
	 */
	public Adapter createActivityDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityRelation <em>Activity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityRelation
	 * @generated
	 */
	public Adapter createActivityRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityDelegation <em>Activity Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityDelegation
	 * @generated
	 */
	public Adapter createActivityDelegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityFlow <em>Activity Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityFlow
	 * @generated
	 */
	public Adapter createActivityFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivitySwitch <em>Activity Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivitySwitch
	 * @generated
	 */
	public Adapter createActivitySwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivitySwitchCase <em>Activity Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivitySwitchCase
	 * @generated
	 */
	public Adapter createActivitySwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityFlowable <em>Activity Flowable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityFlowable
	 * @generated
	 */
	public Adapter createActivityFlowableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Pin
	 * @generated
	 */
	public Adapter createPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActionPin <em>Action Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActionPin
	 * @generated
	 */
	public Adapter createActionPinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DataObject
	 * @generated
	 */
	public Adapter createDataObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DataBuffer <em>Data Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DataBuffer
	 * @generated
	 */
	public Adapter createDataBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ProtocolBody <em>Protocol Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ProtocolBody
	 * @generated
	 */
	public Adapter createProtocolBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ProtocolBodyInternal <em>Protocol Body Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ProtocolBodyInternal
	 * @generated
	 */
	public Adapter createProtocolBodyInternalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PredefinedAction <em>Predefined Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PredefinedAction
	 * @generated
	 */
	public Adapter createPredefinedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActionSend <em>Action Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActionSend
	 * @generated
	 */
	public Adapter createActionSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActionReceive <em>Action Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActionReceive
	 * @generated
	 */
	public Adapter createActionReceiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConstraintDef <em>Constraint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConstraintDef
	 * @generated
	 */
	public Adapter createConstraintDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Executable
	 * @generated
	 */
	public Adapter createExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConditionalTestExpression
	 * @generated
	 */
	public Adapter createConditionalTestExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ConditionalLogicalExpression <em>Conditional Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ConditionalLogicalExpression
	 * @generated
	 */
	public Adapter createConditionalLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.LogicalExpression
	 * @generated
	 */
	public Adapter createLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.RelationalExpression
	 * @generated
	 */
	public Adapter createRelationalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ShiftExpression
	 * @generated
	 */
	public Adapter createShiftExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ArithmeticExpression
	 * @generated
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ClassificationExpression <em>Classification Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ClassificationExpression
	 * @generated
	 */
	public Adapter createClassificationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PrimaryExpression
	 * @generated
	 */
	public Adapter createPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.NameExpression
	 * @generated
	 */
	public Adapter createNameExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.NonNameExpression <em>Non Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.NonNameExpression
	 * @generated
	 */
	public Adapter createNonNameExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.BooleanLiteralExpression
	 * @generated
	 */
	public Adapter createBooleanLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.NaturalLiteralExpression <em>Natural Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.NaturalLiteralExpression
	 * @generated
	 */
	public Adapter createNaturalLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.StringLiteralExpression <em>String Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.StringLiteralExpression
	 * @generated
	 */
	public Adapter createStringLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ThisExpression
	 * @generated
	 */
	public Adapter createThisExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PropertyAccessExpression <em>Property Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PropertyAccessExpression
	 * @generated
	 */
	public Adapter createPropertyAccessExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.IncrementOrDecrementExpression <em>Increment Or Decrement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.IncrementOrDecrementExpression
	 * @generated
	 */
	public Adapter createIncrementOrDecrementExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PrefixExpression <em>Prefix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PrefixExpression
	 * @generated
	 */
	public Adapter createPrefixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.PostfixExpression
	 * @generated
	 */
	public Adapter createPostfixExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.BlockStatement
	 * @generated
	 */
	public Adapter createBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.AssignmentExpression
	 * @generated
	 */
	public Adapter createAssignmentExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.LeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.LeftHandSide
	 * @generated
	 */
	public Adapter createLeftHandSideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.VariableDecl
	 * @generated
	 */
	public Adapter createVariableDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.IfBlockStatement <em>If Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.IfBlockStatement
	 * @generated
	 */
	public Adapter createIfBlockStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.IfStatement
	 * @generated
	 */
	public Adapter createIfStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ElseStatement
	 * @generated
	 */
	public Adapter createElseStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ReturnStatement
	 * @generated
	 */
	public Adapter createReturnStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.LoopStatement
	 * @generated
	 */
	public Adapter createLoopStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.WhileStatement
	 * @generated
	 */
	public Adapter createWhileStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DoStatement
	 * @generated
	 */
	public Adapter createDoStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ForStatement
	 * @generated
	 */
	public Adapter createForStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ForControl <em>For Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ForControl
	 * @generated
	 */
	public Adapter createForControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ForVar <em>For Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ForVar
	 * @generated
	 */
	public Adapter createForVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.SwitchStatement
	 * @generated
	 */
	public Adapter createSwitchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.SwitchClause <em>Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.SwitchClause
	 * @generated
	 */
	public Adapter createSwitchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.DefaultSwitchClause <em>Default Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.DefaultSwitchClause
	 * @generated
	 */
	public Adapter createDefaultSwitchClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.AllocationTable <em>Allocation Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.AllocationTable
	 * @generated
	 */
	public Adapter createAllocationTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ExecutableAllocation <em>Executable Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ExecutableAllocation
	 * @generated
	 */
	public Adapter createExecutableAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link sysADL_Sintax.ActivityAllocation <em>Activity Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see sysADL_Sintax.ActivityAllocation
	 * @generated
	 */
	public Adapter createActivityAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SysADLAdapterFactory
