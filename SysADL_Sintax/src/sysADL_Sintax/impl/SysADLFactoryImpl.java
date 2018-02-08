/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

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
import sysADL_Sintax.ActivitySwitch;
import sysADL_Sintax.ActivitySwitchCase;
import sysADL_Sintax.AffixOperator;
import sysADL_Sintax.AllocationTable;
import sysADL_Sintax.ArithmeticExpression;
import sysADL_Sintax.AssignmentExpression;
import sysADL_Sintax.AssignmentOperator;
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
import sysADL_Sintax.ConstraintKind;
import sysADL_Sintax.ConstraintUse;
import sysADL_Sintax.DataBuffer;
import sysADL_Sintax.DataStore;
import sysADL_Sintax.DataTypeDef;
import sysADL_Sintax.DefaultSwitchClause;
import sysADL_Sintax.Delegation;
import sysADL_Sintax.DimensionDef;
import sysADL_Sintax.DoStatement;
import sysADL_Sintax.ElseStatement;
import sysADL_Sintax.EnumLiteralValue;
import sysADL_Sintax.Enumeration;
import sysADL_Sintax.Executable;
import sysADL_Sintax.ExecutableAllocation;
import sysADL_Sintax.Expression;
import sysADL_Sintax.Flow;
import sysADL_Sintax.FlowProperty;
import sysADL_Sintax.ForControl;
import sysADL_Sintax.ForStatement;
import sysADL_Sintax.ForVar;
import sysADL_Sintax.IfBlockStatement;
import sysADL_Sintax.IfStatement;
import sysADL_Sintax.LeftHandSide;
import sysADL_Sintax.LogicalExpression;
import sysADL_Sintax.Model;
import sysADL_Sintax.NameExpression;
import sysADL_Sintax.NaturalLiteralExpression;
import sysADL_Sintax.Pin;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.PostfixExpression;
import sysADL_Sintax.PrefixExpression;
import sysADL_Sintax.Property;
import sysADL_Sintax.PropertyAccessExpression;
import sysADL_Sintax.Protocol;
import sysADL_Sintax.ProtocolAlternativeType;
import sysADL_Sintax.ProtocolBody;
import sysADL_Sintax.ProtocolControl;
import sysADL_Sintax.RelationalExpression;
import sysADL_Sintax.Requirement;
import sysADL_Sintax.ReturnStatement;
import sysADL_Sintax.ShiftExpression;
import sysADL_Sintax.SimplePortDef;
import sysADL_Sintax.StringLiteralExpression;
import sysADL_Sintax.SwitchClause;
import sysADL_Sintax.SwitchStatement;
import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.ThisExpression;
import sysADL_Sintax.TypeUse;
import sysADL_Sintax.UnaryExpression;
import sysADL_Sintax.UnitDef;
import sysADL_Sintax.ValueTypeDef;
import sysADL_Sintax.VariableDecl;
import sysADL_Sintax.WhileStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysADLFactoryImpl extends EFactoryImpl implements SysADLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SysADLFactory init() {
		try {
			SysADLFactory theSysADLFactory = (SysADLFactory)EPackage.Registry.INSTANCE.getEFactory(SysADLPackage.eNS_URI);
			if (theSysADLFactory != null) {
				return theSysADLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SysADLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysADLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SysADLPackage.PACKAGE: return createPackage();
			case SysADLPackage.MODEL: return createModel();
			case SysADLPackage.CONSTRAINT_USE: return createConstraintUse();
			case SysADLPackage.DATA_TYPE_DEF: return createDataTypeDef();
			case SysADLPackage.DIMENSION_DEF: return createDimensionDef();
			case SysADLPackage.TYPE_USE: return createTypeUse();
			case SysADLPackage.UNIT_DEF: return createUnitDef();
			case SysADLPackage.VALUE_TYPE_DEF: return createValueTypeDef();
			case SysADLPackage.ENUMERATION: return createEnumeration();
			case SysADLPackage.ENUM_LITERAL_VALUE: return createEnumLiteralValue();
			case SysADLPackage.PROPERTY: return createProperty();
			case SysADLPackage.COMPONENT_DEF: return createComponentDef();
			case SysADLPackage.COMPONENT_USE: return createComponentUse();
			case SysADLPackage.CONNECTOR_DEF: return createConnectorDef();
			case SysADLPackage.CONNECTOR_USE: return createConnectorUse();
			case SysADLPackage.CONFIGURATION: return createConfiguration();
			case SysADLPackage.DELEGATION: return createDelegation();
			case SysADLPackage.COMPOSITE_PORT_DEF: return createCompositePortDef();
			case SysADLPackage.SIMPLE_PORT_DEF: return createSimplePortDef();
			case SysADLPackage.PORT_USE: return createPortUse();
			case SysADLPackage.CONNECTOR_BINDING: return createConnectorBinding();
			case SysADLPackage.FLOW: return createFlow();
			case SysADLPackage.ACTION_DEF: return createActionDef();
			case SysADLPackage.ACTION_USE: return createActionUse();
			case SysADLPackage.ACTIVITY_BODY: return createActivityBody();
			case SysADLPackage.ACTIVITY_DEF: return createActivityDef();
			case SysADLPackage.ACTIVITY_DELEGATION: return createActivityDelegation();
			case SysADLPackage.ACTIVITY_FLOW: return createActivityFlow();
			case SysADLPackage.ACTIVITY_SWITCH: return createActivitySwitch();
			case SysADLPackage.ACTIVITY_SWITCH_CASE: return createActivitySwitchCase();
			case SysADLPackage.PIN: return createPin();
			case SysADLPackage.ACTION_PIN: return createActionPin();
			case SysADLPackage.DATA_STORE: return createDataStore();
			case SysADLPackage.DATA_BUFFER: return createDataBuffer();
			case SysADLPackage.PROTOCOL_BODY: return createProtocolBody();
			case SysADLPackage.ACTION_SEND: return createActionSend();
			case SysADLPackage.ACTION_RECEIVE: return createActionReceive();
			case SysADLPackage.PROTOCOL: return createProtocol();
			case SysADLPackage.CONSTRAINT_DEF: return createConstraintDef();
			case SysADLPackage.EXECUTABLE: return createExecutable();
			case SysADLPackage.EXPRESSION: return createExpression();
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION: return createConditionalTestExpression();
			case SysADLPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case SysADLPackage.CONDITIONAL_LOGICAL_EXPRESSION: return createConditionalLogicalExpression();
			case SysADLPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
			case SysADLPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case SysADLPackage.SHIFT_EXPRESSION: return createShiftExpression();
			case SysADLPackage.ARITHMETIC_EXPRESSION: return createArithmeticExpression();
			case SysADLPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case SysADLPackage.CLASSIFICATION_EXPRESSION: return createClassificationExpression();
			case SysADLPackage.NAME_EXPRESSION: return createNameExpression();
			case SysADLPackage.BOOLEAN_LITERAL_EXPRESSION: return createBooleanLiteralExpression();
			case SysADLPackage.NATURAL_LITERAL_EXPRESSION: return createNaturalLiteralExpression();
			case SysADLPackage.STRING_LITERAL_EXPRESSION: return createStringLiteralExpression();
			case SysADLPackage.THIS_EXPRESSION: return createThisExpression();
			case SysADLPackage.PROPERTY_ACCESS_EXPRESSION: return createPropertyAccessExpression();
			case SysADLPackage.PREFIX_EXPRESSION: return createPrefixExpression();
			case SysADLPackage.POSTFIX_EXPRESSION: return createPostfixExpression();
			case SysADLPackage.BLOCK_STATEMENT: return createBlockStatement();
			case SysADLPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
			case SysADLPackage.LEFT_HAND_SIDE: return createLeftHandSide();
			case SysADLPackage.VARIABLE_DECL: return createVariableDecl();
			case SysADLPackage.IF_BLOCK_STATEMENT: return createIfBlockStatement();
			case SysADLPackage.IF_STATEMENT: return createIfStatement();
			case SysADLPackage.ELSE_STATEMENT: return createElseStatement();
			case SysADLPackage.RETURN_STATEMENT: return createReturnStatement();
			case SysADLPackage.WHILE_STATEMENT: return createWhileStatement();
			case SysADLPackage.DO_STATEMENT: return createDoStatement();
			case SysADLPackage.FOR_STATEMENT: return createForStatement();
			case SysADLPackage.FOR_CONTROL: return createForControl();
			case SysADLPackage.FOR_VAR: return createForVar();
			case SysADLPackage.SWITCH_STATEMENT: return createSwitchStatement();
			case SysADLPackage.SWITCH_CLAUSE: return createSwitchClause();
			case SysADLPackage.DEFAULT_SWITCH_CLAUSE: return createDefaultSwitchClause();
			case SysADLPackage.REQUIREMENT: return createRequirement();
			case SysADLPackage.ALLOCATION_TABLE: return createAllocationTable();
			case SysADLPackage.EXECUTABLE_ALLOCATION: return createExecutableAllocation();
			case SysADLPackage.ACTIVITY_ALLOCATION: return createActivityAllocation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SysADLPackage.CONSTRAINT_KIND:
				return createConstraintKindFromString(eDataType, initialValue);
			case SysADLPackage.FLOW_PROPERTY:
				return createFlowPropertyFromString(eDataType, initialValue);
			case SysADLPackage.PROTOCOL_ALTERNATIVE_TYPE:
				return createProtocolAlternativeTypeFromString(eDataType, initialValue);
			case SysADLPackage.PROTOCOL_CONTROL:
				return createProtocolControlFromString(eDataType, initialValue);
			case SysADLPackage.AFFIX_OPERATOR:
				return createAffixOperatorFromString(eDataType, initialValue);
			case SysADLPackage.ASSIGNMENT_OPERATOR:
				return createAssignmentOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SysADLPackage.CONSTRAINT_KIND:
				return convertConstraintKindToString(eDataType, instanceValue);
			case SysADLPackage.FLOW_PROPERTY:
				return convertFlowPropertyToString(eDataType, instanceValue);
			case SysADLPackage.PROTOCOL_ALTERNATIVE_TYPE:
				return convertProtocolAlternativeTypeToString(eDataType, instanceValue);
			case SysADLPackage.PROTOCOL_CONTROL:
				return convertProtocolControlToString(eDataType, instanceValue);
			case SysADLPackage.AFFIX_OPERATOR:
				return convertAffixOperatorToString(eDataType, instanceValue);
			case SysADLPackage.ASSIGNMENT_OPERATOR:
				return convertAssignmentOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sysADL_Sintax.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintUse createConstraintUse() {
		ConstraintUseImpl constraintUse = new ConstraintUseImpl();
		return constraintUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDef createDataTypeDef() {
		DataTypeDefImpl dataTypeDef = new DataTypeDefImpl();
		return dataTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionDef createDimensionDef() {
		DimensionDefImpl dimensionDef = new DimensionDefImpl();
		return dimensionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse createTypeUse() {
		TypeUseImpl typeUse = new TypeUseImpl();
		return typeUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDef createUnitDef() {
		UnitDefImpl unitDef = new UnitDefImpl();
		return unitDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeDef createValueTypeDef() {
		ValueTypeDefImpl valueTypeDef = new ValueTypeDefImpl();
		return valueTypeDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteralValue createEnumLiteralValue() {
		EnumLiteralValueImpl enumLiteralValue = new EnumLiteralValueImpl();
		return enumLiteralValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDef createComponentDef() {
		ComponentDefImpl componentDef = new ComponentDefImpl();
		return componentDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentUse createComponentUse() {
		ComponentUseImpl componentUse = new ComponentUseImpl();
		return componentUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDef createConnectorDef() {
		ConnectorDefImpl connectorDef = new ConnectorDefImpl();
		return connectorDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorUse createConnectorUse() {
		ConnectorUseImpl connectorUse = new ConnectorUseImpl();
		return connectorUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delegation createDelegation() {
		DelegationImpl delegation = new DelegationImpl();
		return delegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositePortDef createCompositePortDef() {
		CompositePortDefImpl compositePortDef = new CompositePortDefImpl();
		return compositePortDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePortDef createSimplePortDef() {
		SimplePortDefImpl simplePortDef = new SimplePortDefImpl();
		return simplePortDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse createPortUse() {
		PortUseImpl portUse = new PortUseImpl();
		return portUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorBinding createConnectorBinding() {
		ConnectorBindingImpl connectorBinding = new ConnectorBindingImpl();
		return connectorBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDef createActionDef() {
		ActionDefImpl actionDef = new ActionDefImpl();
		return actionDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionUse createActionUse() {
		ActionUseImpl actionUse = new ActionUseImpl();
		return actionUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityBody createActivityBody() {
		ActivityBodyImpl activityBody = new ActivityBodyImpl();
		return activityBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDef createActivityDef() {
		ActivityDefImpl activityDef = new ActivityDefImpl();
		return activityDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityDelegation createActivityDelegation() {
		ActivityDelegationImpl activityDelegation = new ActivityDelegationImpl();
		return activityDelegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFlow createActivityFlow() {
		ActivityFlowImpl activityFlow = new ActivityFlowImpl();
		return activityFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitch createActivitySwitch() {
		ActivitySwitchImpl activitySwitch = new ActivitySwitchImpl();
		return activitySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitchCase createActivitySwitchCase() {
		ActivitySwitchCaseImpl activitySwitchCase = new ActivitySwitchCaseImpl();
		return activitySwitchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin createPin() {
		PinImpl pin = new PinImpl();
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionPin createActionPin() {
		ActionPinImpl actionPin = new ActionPinImpl();
		return actionPin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataBuffer createDataBuffer() {
		DataBufferImpl dataBuffer = new DataBufferImpl();
		return dataBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBody createProtocolBody() {
		ProtocolBodyImpl protocolBody = new ProtocolBodyImpl();
		return protocolBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionSend createActionSend() {
		ActionSendImpl actionSend = new ActionSendImpl();
		return actionSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionReceive createActionReceive() {
		ActionReceiveImpl actionReceive = new ActionReceiveImpl();
		return actionReceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDef createConstraintDef() {
		ConstraintDefImpl constraintDef = new ConstraintDefImpl();
		return constraintDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executable createExecutable() {
		ExecutableImpl executable = new ExecutableImpl();
		return executable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalTestExpression createConditionalTestExpression() {
		ConditionalTestExpressionImpl conditionalTestExpression = new ConditionalTestExpressionImpl();
		return conditionalTestExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalLogicalExpression createConditionalLogicalExpression() {
		ConditionalLogicalExpressionImpl conditionalLogicalExpression = new ConditionalLogicalExpressionImpl();
		return conditionalLogicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExpression createLogicalExpression() {
		LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftExpression createShiftExpression() {
		ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
		return shiftExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticExpression createArithmeticExpression() {
		ArithmeticExpressionImpl arithmeticExpression = new ArithmeticExpressionImpl();
		return arithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationExpression createClassificationExpression() {
		ClassificationExpressionImpl classificationExpression = new ClassificationExpressionImpl();
		return classificationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression createNameExpression() {
		NameExpressionImpl nameExpression = new NameExpressionImpl();
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanLiteralExpression createBooleanLiteralExpression() {
		BooleanLiteralExpressionImpl booleanLiteralExpression = new BooleanLiteralExpressionImpl();
		return booleanLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalLiteralExpression createNaturalLiteralExpression() {
		NaturalLiteralExpressionImpl naturalLiteralExpression = new NaturalLiteralExpressionImpl();
		return naturalLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteralExpression createStringLiteralExpression() {
		StringLiteralExpressionImpl stringLiteralExpression = new StringLiteralExpressionImpl();
		return stringLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThisExpression createThisExpression() {
		ThisExpressionImpl thisExpression = new ThisExpressionImpl();
		return thisExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyAccessExpression createPropertyAccessExpression() {
		PropertyAccessExpressionImpl propertyAccessExpression = new PropertyAccessExpressionImpl();
		return propertyAccessExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefixExpression createPrefixExpression() {
		PrefixExpressionImpl prefixExpression = new PrefixExpressionImpl();
		return prefixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostfixExpression createPostfixExpression() {
		PostfixExpressionImpl postfixExpression = new PostfixExpressionImpl();
		return postfixExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockStatement createBlockStatement() {
		BlockStatementImpl blockStatement = new BlockStatementImpl();
		return blockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExpression createAssignmentExpression() {
		AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftHandSide createLeftHandSide() {
		LeftHandSideImpl leftHandSide = new LeftHandSideImpl();
		return leftHandSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDecl createVariableDecl() {
		VariableDeclImpl variableDecl = new VariableDeclImpl();
		return variableDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfBlockStatement createIfBlockStatement() {
		IfBlockStatementImpl ifBlockStatement = new IfBlockStatementImpl();
		return ifBlockStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement createIfStatement() {
		IfStatementImpl ifStatement = new IfStatementImpl();
		return ifStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStatement createElseStatement() {
		ElseStatementImpl elseStatement = new ElseStatementImpl();
		return elseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnStatement createReturnStatement() {
		ReturnStatementImpl returnStatement = new ReturnStatementImpl();
		return returnStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileStatement createWhileStatement() {
		WhileStatementImpl whileStatement = new WhileStatementImpl();
		return whileStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoStatement createDoStatement() {
		DoStatementImpl doStatement = new DoStatementImpl();
		return doStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForStatement createForStatement() {
		ForStatementImpl forStatement = new ForStatementImpl();
		return forStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForControl createForControl() {
		ForControlImpl forControl = new ForControlImpl();
		return forControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForVar createForVar() {
		ForVarImpl forVar = new ForVarImpl();
		return forVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchStatement createSwitchStatement() {
		SwitchStatementImpl switchStatement = new SwitchStatementImpl();
		return switchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchClause createSwitchClause() {
		SwitchClauseImpl switchClause = new SwitchClauseImpl();
		return switchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultSwitchClause createDefaultSwitchClause() {
		DefaultSwitchClauseImpl defaultSwitchClause = new DefaultSwitchClauseImpl();
		return defaultSwitchClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTable createAllocationTable() {
		AllocationTableImpl allocationTable = new AllocationTableImpl();
		return allocationTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutableAllocation createExecutableAllocation() {
		ExecutableAllocationImpl executableAllocation = new ExecutableAllocationImpl();
		return executableAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityAllocation createActivityAllocation() {
		ActivityAllocationImpl activityAllocation = new ActivityAllocationImpl();
		return activityAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintKind createConstraintKindFromString(EDataType eDataType, String initialValue) {
		ConstraintKind result = ConstraintKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowProperty createFlowPropertyFromString(EDataType eDataType, String initialValue) {
		FlowProperty result = FlowProperty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlowPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolAlternativeType createProtocolAlternativeTypeFromString(EDataType eDataType, String initialValue) {
		ProtocolAlternativeType result = ProtocolAlternativeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolAlternativeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolControl createProtocolControlFromString(EDataType eDataType, String initialValue) {
		ProtocolControl result = ProtocolControl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolControlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AffixOperator createAffixOperatorFromString(EDataType eDataType, String initialValue) {
		AffixOperator result = AffixOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAffixOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperator createAssignmentOperatorFromString(EDataType eDataType, String initialValue) {
		AssignmentOperator result = AssignmentOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssignmentOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysADLPackage getSysADLPackage() {
		return (SysADLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static SysADLPackage getPackage() {
		return SysADLPackage.eINSTANCE;
	}

} //SysADLFactoryImpl
