/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage
 * @generated
 */
public interface SysADLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysADLFactory eINSTANCE = sysADL_Sintax.impl.SysADLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Constraint Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Use</em>'.
	 * @generated
	 */
	ConstraintUse createConstraintUse();

	/**
	 * Returns a new object of class '<em>Data Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type Def</em>'.
	 * @generated
	 */
	DataTypeDef createDataTypeDef();

	/**
	 * Returns a new object of class '<em>Dimension Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Def</em>'.
	 * @generated
	 */
	DimensionDef createDimensionDef();

	/**
	 * Returns a new object of class '<em>Type Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Use</em>'.
	 * @generated
	 */
	TypeUse createTypeUse();

	/**
	 * Returns a new object of class '<em>Unit Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Def</em>'.
	 * @generated
	 */
	UnitDef createUnitDef();

	/**
	 * Returns a new object of class '<em>Value Type Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type Def</em>'.
	 * @generated
	 */
	ValueTypeDef createValueTypeDef();

	/**
	 * Returns a new object of class '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration</em>'.
	 * @generated
	 */
	Enumeration createEnumeration();

	/**
	 * Returns a new object of class '<em>Enum Literal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal Value</em>'.
	 * @generated
	 */
	EnumLiteralValue createEnumLiteralValue();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Component Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Def</em>'.
	 * @generated
	 */
	ComponentDef createComponentDef();

	/**
	 * Returns a new object of class '<em>Component Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Use</em>'.
	 * @generated
	 */
	ComponentUse createComponentUse();

	/**
	 * Returns a new object of class '<em>Connector Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Def</em>'.
	 * @generated
	 */
	ConnectorDef createConnectorDef();

	/**
	 * Returns a new object of class '<em>Connector Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Use</em>'.
	 * @generated
	 */
	ConnectorUse createConnectorUse();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation</em>'.
	 * @generated
	 */
	Delegation createDelegation();

	/**
	 * Returns a new object of class '<em>Composite Port Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Port Def</em>'.
	 * @generated
	 */
	CompositePortDef createCompositePortDef();

	/**
	 * Returns a new object of class '<em>Simple Port Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Port Def</em>'.
	 * @generated
	 */
	SimplePortDef createSimplePortDef();

	/**
	 * Returns a new object of class '<em>Port Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Use</em>'.
	 * @generated
	 */
	PortUse createPortUse();

	/**
	 * Returns a new object of class '<em>Connector Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Binding</em>'.
	 * @generated
	 */
	ConnectorBinding createConnectorBinding();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Action Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Def</em>'.
	 * @generated
	 */
	ActionDef createActionDef();

	/**
	 * Returns a new object of class '<em>Action Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Use</em>'.
	 * @generated
	 */
	ActionUse createActionUse();

	/**
	 * Returns a new object of class '<em>Activity Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Body</em>'.
	 * @generated
	 */
	ActivityBody createActivityBody();

	/**
	 * Returns a new object of class '<em>Activity Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Def</em>'.
	 * @generated
	 */
	ActivityDef createActivityDef();

	/**
	 * Returns a new object of class '<em>Activity Delegation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Delegation</em>'.
	 * @generated
	 */
	ActivityDelegation createActivityDelegation();

	/**
	 * Returns a new object of class '<em>Activity Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Flow</em>'.
	 * @generated
	 */
	ActivityFlow createActivityFlow();

	/**
	 * Returns a new object of class '<em>Activity Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Switch</em>'.
	 * @generated
	 */
	ActivitySwitch createActivitySwitch();

	/**
	 * Returns a new object of class '<em>Activity Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Switch Case</em>'.
	 * @generated
	 */
	ActivitySwitchCase createActivitySwitchCase();

	/**
	 * Returns a new object of class '<em>Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pin</em>'.
	 * @generated
	 */
	Pin createPin();

	/**
	 * Returns a new object of class '<em>Action Pin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Pin</em>'.
	 * @generated
	 */
	ActionPin createActionPin();

	/**
	 * Returns a new object of class '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Store</em>'.
	 * @generated
	 */
	DataStore createDataStore();

	/**
	 * Returns a new object of class '<em>Data Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Buffer</em>'.
	 * @generated
	 */
	DataBuffer createDataBuffer();

	/**
	 * Returns a new object of class '<em>Protocol Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Body</em>'.
	 * @generated
	 */
	ProtocolBody createProtocolBody();

	/**
	 * Returns a new object of class '<em>Action Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Send</em>'.
	 * @generated
	 */
	ActionSend createActionSend();

	/**
	 * Returns a new object of class '<em>Action Receive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Receive</em>'.
	 * @generated
	 */
	ActionReceive createActionReceive();

	/**
	 * Returns a new object of class '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol</em>'.
	 * @generated
	 */
	Protocol createProtocol();

	/**
	 * Returns a new object of class '<em>Constraint Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Def</em>'.
	 * @generated
	 */
	ConstraintDef createConstraintDef();

	/**
	 * Returns a new object of class '<em>Executable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable</em>'.
	 * @generated
	 */
	Executable createExecutable();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Conditional Test Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Test Expression</em>'.
	 * @generated
	 */
	ConditionalTestExpression createConditionalTestExpression();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Conditional Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Logical Expression</em>'.
	 * @generated
	 */
	ConditionalLogicalExpression createConditionalLogicalExpression();

	/**
	 * Returns a new object of class '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Expression</em>'.
	 * @generated
	 */
	LogicalExpression createLogicalExpression();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns a new object of class '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift Expression</em>'.
	 * @generated
	 */
	ShiftExpression createShiftExpression();

	/**
	 * Returns a new object of class '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expression</em>'.
	 * @generated
	 */
	ArithmeticExpression createArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Classification Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification Expression</em>'.
	 * @generated
	 */
	ClassificationExpression createClassificationExpression();

	/**
	 * Returns a new object of class '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Expression</em>'.
	 * @generated
	 */
	NameExpression createNameExpression();

	/**
	 * Returns a new object of class '<em>Boolean Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal Expression</em>'.
	 * @generated
	 */
	BooleanLiteralExpression createBooleanLiteralExpression();

	/**
	 * Returns a new object of class '<em>Natural Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Literal Expression</em>'.
	 * @generated
	 */
	NaturalLiteralExpression createNaturalLiteralExpression();

	/**
	 * Returns a new object of class '<em>String Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal Expression</em>'.
	 * @generated
	 */
	StringLiteralExpression createStringLiteralExpression();

	/**
	 * Returns a new object of class '<em>This Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>This Expression</em>'.
	 * @generated
	 */
	ThisExpression createThisExpression();

	/**
	 * Returns a new object of class '<em>Property Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Access Expression</em>'.
	 * @generated
	 */
	PropertyAccessExpression createPropertyAccessExpression();

	/**
	 * Returns a new object of class '<em>Prefix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix Expression</em>'.
	 * @generated
	 */
	PrefixExpression createPrefixExpression();

	/**
	 * Returns a new object of class '<em>Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postfix Expression</em>'.
	 * @generated
	 */
	PostfixExpression createPostfixExpression();

	/**
	 * Returns a new object of class '<em>Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Statement</em>'.
	 * @generated
	 */
	BlockStatement createBlockStatement();

	/**
	 * Returns a new object of class '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Expression</em>'.
	 * @generated
	 */
	AssignmentExpression createAssignmentExpression();

	/**
	 * Returns a new object of class '<em>Left Hand Side</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Left Hand Side</em>'.
	 * @generated
	 */
	LeftHandSide createLeftHandSide();

	/**
	 * Returns a new object of class '<em>Variable Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Decl</em>'.
	 * @generated
	 */
	VariableDecl createVariableDecl();

	/**
	 * Returns a new object of class '<em>If Block Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Block Statement</em>'.
	 * @generated
	 */
	IfBlockStatement createIfBlockStatement();

	/**
	 * Returns a new object of class '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Statement</em>'.
	 * @generated
	 */
	IfStatement createIfStatement();

	/**
	 * Returns a new object of class '<em>Else Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Else Statement</em>'.
	 * @generated
	 */
	ElseStatement createElseStatement();

	/**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
	ReturnStatement createReturnStatement();

	/**
	 * Returns a new object of class '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While Statement</em>'.
	 * @generated
	 */
	WhileStatement createWhileStatement();

	/**
	 * Returns a new object of class '<em>Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do Statement</em>'.
	 * @generated
	 */
	DoStatement createDoStatement();

	/**
	 * Returns a new object of class '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Statement</em>'.
	 * @generated
	 */
	ForStatement createForStatement();

	/**
	 * Returns a new object of class '<em>For Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Control</em>'.
	 * @generated
	 */
	ForControl createForControl();

	/**
	 * Returns a new object of class '<em>For Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Var</em>'.
	 * @generated
	 */
	ForVar createForVar();

	/**
	 * Returns a new object of class '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Statement</em>'.
	 * @generated
	 */
	SwitchStatement createSwitchStatement();

	/**
	 * Returns a new object of class '<em>Switch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Clause</em>'.
	 * @generated
	 */
	SwitchClause createSwitchClause();

	/**
	 * Returns a new object of class '<em>Default Switch Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Switch Clause</em>'.
	 * @generated
	 */
	DefaultSwitchClause createDefaultSwitchClause();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Allocation Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allocation Table</em>'.
	 * @generated
	 */
	AllocationTable createAllocationTable();

	/**
	 * Returns a new object of class '<em>Executable Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executable Allocation</em>'.
	 * @generated
	 */
	ExecutableAllocation createExecutableAllocation();

	/**
	 * Returns a new object of class '<em>Activity Allocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Allocation</em>'.
	 * @generated
	 */
	ActivityAllocation createActivityAllocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SysADLPackage getSysADLPackage();

} //SysADLFactory
