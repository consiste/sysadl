/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
import sysADL_Sintax.AffixOperator;
import sysADL_Sintax.Allocation;
import sysADL_Sintax.AllocationTable;
import sysADL_Sintax.ArithmeticExpression;
import sysADL_Sintax.AssignmentExpression;
import sysADL_Sintax.AssignmentOperator;
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
import sysADL_Sintax.ConstraintKind;
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
import sysADL_Sintax.FlowProperty;
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
import sysADL_Sintax.ProtocolAlternativeType;
import sysADL_Sintax.ProtocolBody;
import sysADL_Sintax.ProtocolBodyInternal;
import sysADL_Sintax.ProtocolControl;
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
import sysADL_Sintax.SysADLFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysADLPackageImpl extends EPackageImpl implements SysADLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositePortDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePortDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityDelegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitySwitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activitySwitchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFlowableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolBodyInternalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionSendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionReceiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalTestExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalLogicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNameExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyAccessExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementOrDecrementExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftHandSideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifBlockStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSwitchClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityAllocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowPropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolAlternativeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protocolControlEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum affixOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assignmentOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see sysADL_Sintax.SysADLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SysADLPackageImpl() {
		super(eNS_URI, SysADLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SysADLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SysADLPackage init() {
		if (isInited) return (SysADLPackage)EPackage.Registry.INSTANCE.getEPackage(SysADLPackage.eNS_URI);

		// Obtain or create and register package
		SysADLPackageImpl theSysADLPackage = (SysADLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SysADLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SysADLPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSysADLPackage.createPackageContents();

		// Initialize created meta-data
		theSysADLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysADLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SysADLPackage.eNS_URI, theSysADLPackage);
		return theSysADLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Properties() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Imports() {
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ElementImports() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Architectures() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Packages() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Requirements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_InvolvedElements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Allocation() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDef() {
		return elementDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDef_Satisfies() {
		return (EReference)elementDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDef() {
		return dataDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintUse() {
		return constraintUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintUse_Definition() {
		return (EReference)constraintUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintUse_Kind() {
		return (EAttribute)constraintUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintUse_Params() {
		return (EReference)constraintUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeDef() {
		return dataTypeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDef_DataTypeAttributes() {
		return (EReference)dataTypeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeDef_SuperType() {
		return (EReference)dataTypeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionDef() {
		return dimensionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDef() {
		return typeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeUse() {
		return typeUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeUse_Definition() {
		return (EReference)typeUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitDef() {
		return unitDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitDef_Dimension() {
		return (EReference)unitDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeDef() {
		return valueTypeDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeDef_Unit() {
		return (EReference)valueTypeDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeDef_Dimension() {
		return (EReference)valueTypeDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeDef_SuperType() {
		return (EReference)valueTypeDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Literals() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteralValue() {
		return enumLiteralValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteralValue_Enum() {
		return (EReference)enumLiteralValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteralValue_Key() {
		return (EAttribute)enumLiteralValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Type() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Value() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralDef() {
		return structuralDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralDef_ArchDefs() {
		return (EReference)structuralDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralDef_DataDefs() {
		return (EReference)structuralDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralUse() {
		return structuralUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralUse_LowerBound() {
		return (EAttribute)structuralUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralUse_UpperBound() {
		return (EAttribute)structuralUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDef() {
		return componentDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDef_Ports() {
		return (EReference)componentDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDef_Composite() {
		return (EReference)componentDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDef_IsBoundary() {
		return (EAttribute)componentDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentUse() {
		return componentUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentUse_Definition() {
		return (EReference)componentUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentUse_Ports() {
		return (EReference)componentUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorDef() {
		return connectorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDef_Ports() {
		return (EReference)connectorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDef_Flows() {
		return (EReference)connectorDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorDef_Composite() {
		return (EReference)connectorDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorUse() {
		return connectorUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorUse_Definition() {
		return (EReference)connectorUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorUse_Ports() {
		return (EReference)connectorUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorUse_Bindings() {
		return (EReference)connectorUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Components() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Delegations() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Connectors() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegation() {
		return delegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_PortProxy() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegation_FullPort() {
		return (EReference)delegationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositePortDef() {
		return compositePortDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositePortDef_Ports() {
		return (EReference)compositePortDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplePortDef() {
		return simplePortDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimplePortDef_FlowProperties() {
		return (EAttribute)simplePortDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePortDef_FlowType() {
		return (EReference)simplePortDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortUse() {
		return portUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortUse_Definition() {
		return (EReference)portUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorBinding() {
		return connectorBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorBinding_FirstPort() {
		return (EReference)connectorBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorBinding_SecondPort() {
		return (EReference)connectorBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_FlowType() {
		return (EReference)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Source() {
		return (EReference)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Destination() {
		return (EReference)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorDef() {
		return behaviorDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDef_InParameters() {
		return (EReference)behaviorDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDef_OutParameters() {
		return (EReference)behaviorDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDef_BehaDefs() {
		return (EReference)behaviorDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDef_DataDefs() {
		return (EReference)behaviorDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDef_Constraints() {
		return (EReference)behaviorDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorDef_Delegations() {
		return (EReference)behaviorDefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDef() {
		return actionDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionDef_ReturnType() {
		return (EReference)actionDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionUse() {
		return actionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionUse_Definition() {
		return (EReference)actionUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionUse_PinIn() {
		return (EReference)actionUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityBody() {
		return activityBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityBody_Actions() {
		return (EReference)activityBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityBody_Flows() {
		return (EReference)activityBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityBody_DataObjects() {
		return (EReference)activityBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDef() {
		return portDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDef() {
		return activityDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityDef_Acbody() {
		return (EReference)activityDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityRelation() {
		return activityRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityRelation_Source() {
		return (EReference)activityRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityRelation_Target() {
		return (EReference)activityRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityRelation_TargetSwitch() {
		return (EReference)activityRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityDelegation() {
		return activityDelegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFlow() {
		return activityFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitySwitch() {
		return activitySwitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitySwitch_Cases() {
		return (EReference)activitySwitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivitySwitchCase() {
		return activitySwitchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitySwitchCase_Condition() {
		return (EReference)activitySwitchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivitySwitchCase_Target() {
		return (EReference)activitySwitchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFlowable() {
		return activityFlowableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsFlow() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionPin() {
		return actionPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionPin_PinName() {
		return (EReference)actionPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionPin_PinValue() {
		return (EReference)actionPinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_Type() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_InitValue() {
		return (EReference)dataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStore() {
		return dataStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataBuffer() {
		return dataBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolBody() {
		return protocolBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolBody_RecControl() {
		return (EAttribute)protocolBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolBody_Body() {
		return (EReference)protocolBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolBody_Recursive() {
		return (EReference)protocolBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolBody_RecType() {
		return (EAttribute)protocolBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolBodyInternal() {
		return protocolBodyInternalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedAction() {
		return predefinedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionSend() {
		return actionSendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSend_Expr() {
		return (EReference)actionSendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionSend_FlowTo() {
		return (EReference)actionSendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionReceive() {
		return actionReceiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionReceive_Var() {
		return (EReference)actionReceiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionReceive_FlowTo() {
		return (EReference)actionReceiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocol() {
		return protocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocol_Body() {
		return (EReference)protocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintDef() {
		return constraintDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintDef_Equation() {
		return (EReference)constraintDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutable() {
		return executableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutable_Body() {
		return (EReference)executableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutable_ReturnType() {
		return (EReference)executableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutable_Params() {
		return (EReference)executableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Value() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalTestExpression() {
		return conditionalTestExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalTestExpression_Op1() {
		return (EReference)conditionalTestExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalTestExpression_Op2() {
		return (EReference)conditionalTestExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalTestExpression_Op3() {
		return (EReference)conditionalTestExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Op1() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Op2() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryExpression_Operator() {
		return (EAttribute)binaryExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalLogicalExpression() {
		return conditionalLogicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShiftExpression() {
		return shiftExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticExpression() {
		return arithmeticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Op() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassificationExpression() {
		return classificationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassificationExpression_TypeName() {
		return (EReference)classificationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryExpression() {
		return primaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameExpression() {
		return nameExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameExpression_Cite() {
		return (EReference)nameExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNameExpression() {
		return nonNameExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanLiteralExpression() {
		return booleanLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanLiteralExpression_IsTrue() {
		return (EAttribute)booleanLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalLiteralExpression() {
		return naturalLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaturalLiteralExpression_Int_value() {
		return (EAttribute)naturalLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringLiteralExpression() {
		return stringLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringLiteralExpression_Str_value() {
		return (EAttribute)stringLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThisExpression() {
		return thisExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyAccessExpression() {
		return propertyAccessExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAccessExpression_Target() {
		return (EReference)propertyAccessExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyAccessExpression_Field() {
		return (EReference)propertyAccessExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrementOrDecrementExpression() {
		return incrementOrDecrementExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncrementOrDecrementExpression_Operand() {
		return (EReference)incrementOrDecrementExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncrementOrDecrementExpression_Operator() {
		return (EAttribute)incrementOrDecrementExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefixExpression() {
		return prefixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostfixExpression() {
		return postfixExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockStatement() {
		return blockStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockStatement_Body() {
		return (EReference)blockStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignmentExpression() {
		return assignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExpression_Lhs() {
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignmentExpression_V() {
		return (EReference)assignmentExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssignmentExpression_Operator() {
		return (EAttribute)assignmentExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeftHandSide() {
		return leftHandSideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeftHandSide_Target() {
		return (EReference)leftHandSideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeftHandSide_Index() {
		return (EAttribute)leftHandSideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDecl() {
		return variableDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_Value() {
		return (EReference)variableDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfBlockStatement() {
		return ifBlockStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlockStatement_Main_if() {
		return (EReference)ifBlockStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlockStatement_Paralel_ifs() {
		return (EReference)ifBlockStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlockStatement_Sequential_ifs() {
		return (EReference)ifBlockStatementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlockStatement_Final() {
		return (EReference)ifBlockStatementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfBlockStatement_Else() {
		return (EReference)ifBlockStatementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfStatement() {
		return ifStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Condition() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfStatement_Body() {
		return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseStatement() {
		return elseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseStatement_Body() {
		return (EReference)elseStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnStatement() {
		return returnStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturnStatement_Value() {
		return (EReference)returnStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopStatement() {
		return loopStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Condition() {
		return (EReference)loopStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopStatement_Body() {
		return (EReference)loopStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileStatement() {
		return whileStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoStatement() {
		return doStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForStatement() {
		return forStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Body() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForStatement_Control() {
		return (EReference)forStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForControl() {
		return forControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForControl_Vars() {
		return (EReference)forControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForVar() {
		return forVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForVar_Var() {
		return (EReference)forVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForVar_Expr() {
		return (EReference)forVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchStatement() {
		return switchStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_Expr() {
		return (EReference)switchStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchStatement_Clauses() {
		return (EReference)switchStatementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchClause() {
		return switchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchClause_Value() {
		return (EReference)switchClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchClause_Body() {
		return (EReference)switchClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultSwitchClause() {
		return defaultSwitchClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Id() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Text() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_DerivedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Composition() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_SatisfiedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocationTable() {
		return allocationTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllocationTable_Allocs() {
		return (EReference)allocationTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableAllocation() {
		return executableAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableAllocation_Source() {
		return (EReference)executableAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableAllocation_Target() {
		return (EReference)executableAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityAllocation() {
		return activityAllocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityAllocation_Source() {
		return (EReference)activityAllocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityAllocation_Target() {
		return (EReference)activityAllocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintKind() {
		return constraintKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowProperty() {
		return flowPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolAlternativeType() {
		return protocolAlternativeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtocolControl() {
		return protocolControlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAffixOperator() {
		return affixOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssignmentOperator() {
		return assignmentOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysADLFactory getSysADLFactory() {
		return (SysADLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__PROPERTIES);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__IMPORTS);
		createEReference(packageEClass, PACKAGE__ELEMENT_IMPORTS);
		createEReference(packageEClass, PACKAGE__ARCHITECTURES);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__PACKAGES);
		createEReference(modelEClass, MODEL__REQUIREMENTS);
		createEReference(modelEClass, MODEL__INVOLVED_ELEMENTS);
		createEReference(modelEClass, MODEL__ALLOCATION);

		elementDefEClass = createEClass(ELEMENT_DEF);
		createEReference(elementDefEClass, ELEMENT_DEF__SATISFIES);

		dataDefEClass = createEClass(DATA_DEF);

		constraintUseEClass = createEClass(CONSTRAINT_USE);
		createEReference(constraintUseEClass, CONSTRAINT_USE__DEFINITION);
		createEAttribute(constraintUseEClass, CONSTRAINT_USE__KIND);
		createEReference(constraintUseEClass, CONSTRAINT_USE__PARAMS);

		dataTypeDefEClass = createEClass(DATA_TYPE_DEF);
		createEReference(dataTypeDefEClass, DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES);
		createEReference(dataTypeDefEClass, DATA_TYPE_DEF__SUPER_TYPE);

		dimensionDefEClass = createEClass(DIMENSION_DEF);

		typeDefEClass = createEClass(TYPE_DEF);

		typeUseEClass = createEClass(TYPE_USE);
		createEReference(typeUseEClass, TYPE_USE__DEFINITION);

		unitDefEClass = createEClass(UNIT_DEF);
		createEReference(unitDefEClass, UNIT_DEF__DIMENSION);

		valueTypeDefEClass = createEClass(VALUE_TYPE_DEF);
		createEReference(valueTypeDefEClass, VALUE_TYPE_DEF__UNIT);
		createEReference(valueTypeDefEClass, VALUE_TYPE_DEF__DIMENSION);
		createEReference(valueTypeDefEClass, VALUE_TYPE_DEF__SUPER_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__LITERALS);

		enumLiteralValueEClass = createEClass(ENUM_LITERAL_VALUE);
		createEReference(enumLiteralValueEClass, ENUM_LITERAL_VALUE__ENUM);
		createEAttribute(enumLiteralValueEClass, ENUM_LITERAL_VALUE__KEY);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEReference(propertyEClass, PROPERTY__TYPE);
		createEReference(propertyEClass, PROPERTY__VALUE);

		structuralDefEClass = createEClass(STRUCTURAL_DEF);
		createEReference(structuralDefEClass, STRUCTURAL_DEF__ARCH_DEFS);
		createEReference(structuralDefEClass, STRUCTURAL_DEF__DATA_DEFS);

		structuralUseEClass = createEClass(STRUCTURAL_USE);
		createEAttribute(structuralUseEClass, STRUCTURAL_USE__LOWER_BOUND);
		createEAttribute(structuralUseEClass, STRUCTURAL_USE__UPPER_BOUND);

		componentDefEClass = createEClass(COMPONENT_DEF);
		createEReference(componentDefEClass, COMPONENT_DEF__PORTS);
		createEReference(componentDefEClass, COMPONENT_DEF__COMPOSITE);
		createEAttribute(componentDefEClass, COMPONENT_DEF__IS_BOUNDARY);

		componentUseEClass = createEClass(COMPONENT_USE);
		createEReference(componentUseEClass, COMPONENT_USE__DEFINITION);
		createEReference(componentUseEClass, COMPONENT_USE__PORTS);

		connectorDefEClass = createEClass(CONNECTOR_DEF);
		createEReference(connectorDefEClass, CONNECTOR_DEF__PORTS);
		createEReference(connectorDefEClass, CONNECTOR_DEF__FLOWS);
		createEReference(connectorDefEClass, CONNECTOR_DEF__COMPOSITE);

		connectorUseEClass = createEClass(CONNECTOR_USE);
		createEReference(connectorUseEClass, CONNECTOR_USE__DEFINITION);
		createEReference(connectorUseEClass, CONNECTOR_USE__PORTS);
		createEReference(connectorUseEClass, CONNECTOR_USE__BINDINGS);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__COMPONENTS);
		createEReference(configurationEClass, CONFIGURATION__DELEGATIONS);
		createEReference(configurationEClass, CONFIGURATION__CONNECTORS);

		delegationEClass = createEClass(DELEGATION);
		createEReference(delegationEClass, DELEGATION__PORT_PROXY);
		createEReference(delegationEClass, DELEGATION__FULL_PORT);

		compositePortDefEClass = createEClass(COMPOSITE_PORT_DEF);
		createEReference(compositePortDefEClass, COMPOSITE_PORT_DEF__PORTS);

		simplePortDefEClass = createEClass(SIMPLE_PORT_DEF);
		createEAttribute(simplePortDefEClass, SIMPLE_PORT_DEF__FLOW_PROPERTIES);
		createEReference(simplePortDefEClass, SIMPLE_PORT_DEF__FLOW_TYPE);

		portUseEClass = createEClass(PORT_USE);
		createEReference(portUseEClass, PORT_USE__DEFINITION);

		connectorBindingEClass = createEClass(CONNECTOR_BINDING);
		createEReference(connectorBindingEClass, CONNECTOR_BINDING__FIRST_PORT);
		createEReference(connectorBindingEClass, CONNECTOR_BINDING__SECOND_PORT);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__FLOW_TYPE);
		createEReference(flowEClass, FLOW__SOURCE);
		createEReference(flowEClass, FLOW__DESTINATION);

		behaviorDefEClass = createEClass(BEHAVIOR_DEF);
		createEReference(behaviorDefEClass, BEHAVIOR_DEF__IN_PARAMETERS);
		createEReference(behaviorDefEClass, BEHAVIOR_DEF__OUT_PARAMETERS);
		createEReference(behaviorDefEClass, BEHAVIOR_DEF__BEHA_DEFS);
		createEReference(behaviorDefEClass, BEHAVIOR_DEF__DATA_DEFS);
		createEReference(behaviorDefEClass, BEHAVIOR_DEF__CONSTRAINTS);
		createEReference(behaviorDefEClass, BEHAVIOR_DEF__DELEGATIONS);

		actionDefEClass = createEClass(ACTION_DEF);
		createEReference(actionDefEClass, ACTION_DEF__RETURN_TYPE);

		actionUseEClass = createEClass(ACTION_USE);
		createEReference(actionUseEClass, ACTION_USE__DEFINITION);
		createEReference(actionUseEClass, ACTION_USE__PIN_IN);

		activityBodyEClass = createEClass(ACTIVITY_BODY);
		createEReference(activityBodyEClass, ACTIVITY_BODY__ACTIONS);
		createEReference(activityBodyEClass, ACTIVITY_BODY__FLOWS);
		createEReference(activityBodyEClass, ACTIVITY_BODY__DATA_OBJECTS);

		portDefEClass = createEClass(PORT_DEF);

		activityDefEClass = createEClass(ACTIVITY_DEF);
		createEReference(activityDefEClass, ACTIVITY_DEF__ACBODY);

		activityRelationEClass = createEClass(ACTIVITY_RELATION);
		createEReference(activityRelationEClass, ACTIVITY_RELATION__SOURCE);
		createEReference(activityRelationEClass, ACTIVITY_RELATION__TARGET);
		createEReference(activityRelationEClass, ACTIVITY_RELATION__TARGET_SWITCH);

		activityDelegationEClass = createEClass(ACTIVITY_DELEGATION);

		activityFlowEClass = createEClass(ACTIVITY_FLOW);

		activitySwitchEClass = createEClass(ACTIVITY_SWITCH);
		createEReference(activitySwitchEClass, ACTIVITY_SWITCH__CASES);

		activitySwitchCaseEClass = createEClass(ACTIVITY_SWITCH_CASE);
		createEReference(activitySwitchCaseEClass, ACTIVITY_SWITCH_CASE__CONDITION);
		createEReference(activitySwitchCaseEClass, ACTIVITY_SWITCH_CASE__TARGET);

		activityFlowableEClass = createEClass(ACTIVITY_FLOWABLE);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__IS_FLOW);

		actionPinEClass = createEClass(ACTION_PIN);
		createEReference(actionPinEClass, ACTION_PIN__PIN_NAME);
		createEReference(actionPinEClass, ACTION_PIN__PIN_VALUE);

		dataObjectEClass = createEClass(DATA_OBJECT);
		createEReference(dataObjectEClass, DATA_OBJECT__TYPE);
		createEReference(dataObjectEClass, DATA_OBJECT__INIT_VALUE);

		dataStoreEClass = createEClass(DATA_STORE);

		dataBufferEClass = createEClass(DATA_BUFFER);

		protocolBodyEClass = createEClass(PROTOCOL_BODY);
		createEAttribute(protocolBodyEClass, PROTOCOL_BODY__REC_CONTROL);
		createEReference(protocolBodyEClass, PROTOCOL_BODY__BODY);
		createEReference(protocolBodyEClass, PROTOCOL_BODY__RECURSIVE);
		createEAttribute(protocolBodyEClass, PROTOCOL_BODY__REC_TYPE);

		protocolBodyInternalEClass = createEClass(PROTOCOL_BODY_INTERNAL);

		predefinedActionEClass = createEClass(PREDEFINED_ACTION);

		actionSendEClass = createEClass(ACTION_SEND);
		createEReference(actionSendEClass, ACTION_SEND__EXPR);
		createEReference(actionSendEClass, ACTION_SEND__FLOW_TO);

		actionReceiveEClass = createEClass(ACTION_RECEIVE);
		createEReference(actionReceiveEClass, ACTION_RECEIVE__VAR);
		createEReference(actionReceiveEClass, ACTION_RECEIVE__FLOW_TO);

		protocolEClass = createEClass(PROTOCOL);
		createEReference(protocolEClass, PROTOCOL__BODY);

		constraintDefEClass = createEClass(CONSTRAINT_DEF);
		createEReference(constraintDefEClass, CONSTRAINT_DEF__EQUATION);

		executableEClass = createEClass(EXECUTABLE);
		createEReference(executableEClass, EXECUTABLE__BODY);
		createEReference(executableEClass, EXECUTABLE__RETURN_TYPE);
		createEReference(executableEClass, EXECUTABLE__PARAMS);

		statementEClass = createEClass(STATEMENT);

		expressionEClass = createEClass(EXPRESSION);
		createEAttribute(expressionEClass, EXPRESSION__VALUE);

		conditionalTestExpressionEClass = createEClass(CONDITIONAL_TEST_EXPRESSION);
		createEReference(conditionalTestExpressionEClass, CONDITIONAL_TEST_EXPRESSION__OP1);
		createEReference(conditionalTestExpressionEClass, CONDITIONAL_TEST_EXPRESSION__OP2);
		createEReference(conditionalTestExpressionEClass, CONDITIONAL_TEST_EXPRESSION__OP3);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__OP1);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__OP2);
		createEAttribute(binaryExpressionEClass, BINARY_EXPRESSION__OPERATOR);

		conditionalLogicalExpressionEClass = createEClass(CONDITIONAL_LOGICAL_EXPRESSION);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);

		shiftExpressionEClass = createEClass(SHIFT_EXPRESSION);

		arithmeticExpressionEClass = createEClass(ARITHMETIC_EXPRESSION);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OP);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);

		classificationExpressionEClass = createEClass(CLASSIFICATION_EXPRESSION);
		createEReference(classificationExpressionEClass, CLASSIFICATION_EXPRESSION__TYPE_NAME);

		primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);

		nameExpressionEClass = createEClass(NAME_EXPRESSION);
		createEReference(nameExpressionEClass, NAME_EXPRESSION__CITE);

		nonNameExpressionEClass = createEClass(NON_NAME_EXPRESSION);

		booleanLiteralExpressionEClass = createEClass(BOOLEAN_LITERAL_EXPRESSION);
		createEAttribute(booleanLiteralExpressionEClass, BOOLEAN_LITERAL_EXPRESSION__IS_TRUE);

		naturalLiteralExpressionEClass = createEClass(NATURAL_LITERAL_EXPRESSION);
		createEAttribute(naturalLiteralExpressionEClass, NATURAL_LITERAL_EXPRESSION__INT_VALUE);

		stringLiteralExpressionEClass = createEClass(STRING_LITERAL_EXPRESSION);
		createEAttribute(stringLiteralExpressionEClass, STRING_LITERAL_EXPRESSION__STR_VALUE);

		thisExpressionEClass = createEClass(THIS_EXPRESSION);

		propertyAccessExpressionEClass = createEClass(PROPERTY_ACCESS_EXPRESSION);
		createEReference(propertyAccessExpressionEClass, PROPERTY_ACCESS_EXPRESSION__TARGET);
		createEReference(propertyAccessExpressionEClass, PROPERTY_ACCESS_EXPRESSION__FIELD);

		incrementOrDecrementExpressionEClass = createEClass(INCREMENT_OR_DECREMENT_EXPRESSION);
		createEReference(incrementOrDecrementExpressionEClass, INCREMENT_OR_DECREMENT_EXPRESSION__OPERAND);
		createEAttribute(incrementOrDecrementExpressionEClass, INCREMENT_OR_DECREMENT_EXPRESSION__OPERATOR);

		prefixExpressionEClass = createEClass(PREFIX_EXPRESSION);

		postfixExpressionEClass = createEClass(POSTFIX_EXPRESSION);

		blockStatementEClass = createEClass(BLOCK_STATEMENT);
		createEReference(blockStatementEClass, BLOCK_STATEMENT__BODY);

		assignmentExpressionEClass = createEClass(ASSIGNMENT_EXPRESSION);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__LHS);
		createEReference(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__V);
		createEAttribute(assignmentExpressionEClass, ASSIGNMENT_EXPRESSION__OPERATOR);

		leftHandSideEClass = createEClass(LEFT_HAND_SIDE);
		createEReference(leftHandSideEClass, LEFT_HAND_SIDE__TARGET);
		createEAttribute(leftHandSideEClass, LEFT_HAND_SIDE__INDEX);

		variableDeclEClass = createEClass(VARIABLE_DECL);
		createEReference(variableDeclEClass, VARIABLE_DECL__VALUE);

		ifBlockStatementEClass = createEClass(IF_BLOCK_STATEMENT);
		createEReference(ifBlockStatementEClass, IF_BLOCK_STATEMENT__MAIN_IF);
		createEReference(ifBlockStatementEClass, IF_BLOCK_STATEMENT__PARALEL_IFS);
		createEReference(ifBlockStatementEClass, IF_BLOCK_STATEMENT__SEQUENTIAL_IFS);
		createEReference(ifBlockStatementEClass, IF_BLOCK_STATEMENT__FINAL);
		createEReference(ifBlockStatementEClass, IF_BLOCK_STATEMENT__ELSE);

		ifStatementEClass = createEClass(IF_STATEMENT);
		createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
		createEReference(ifStatementEClass, IF_STATEMENT__BODY);

		elseStatementEClass = createEClass(ELSE_STATEMENT);
		createEReference(elseStatementEClass, ELSE_STATEMENT__BODY);

		returnStatementEClass = createEClass(RETURN_STATEMENT);
		createEReference(returnStatementEClass, RETURN_STATEMENT__VALUE);

		loopStatementEClass = createEClass(LOOP_STATEMENT);
		createEReference(loopStatementEClass, LOOP_STATEMENT__CONDITION);
		createEReference(loopStatementEClass, LOOP_STATEMENT__BODY);

		whileStatementEClass = createEClass(WHILE_STATEMENT);

		doStatementEClass = createEClass(DO_STATEMENT);

		forStatementEClass = createEClass(FOR_STATEMENT);
		createEReference(forStatementEClass, FOR_STATEMENT__BODY);
		createEReference(forStatementEClass, FOR_STATEMENT__CONTROL);

		forControlEClass = createEClass(FOR_CONTROL);
		createEReference(forControlEClass, FOR_CONTROL__VARS);

		forVarEClass = createEClass(FOR_VAR);
		createEReference(forVarEClass, FOR_VAR__VAR);
		createEReference(forVarEClass, FOR_VAR__EXPR);

		switchStatementEClass = createEClass(SWITCH_STATEMENT);
		createEReference(switchStatementEClass, SWITCH_STATEMENT__EXPR);
		createEReference(switchStatementEClass, SWITCH_STATEMENT__CLAUSES);

		switchClauseEClass = createEClass(SWITCH_CLAUSE);
		createEReference(switchClauseEClass, SWITCH_CLAUSE__VALUE);
		createEReference(switchClauseEClass, SWITCH_CLAUSE__BODY);

		defaultSwitchClauseEClass = createEClass(DEFAULT_SWITCH_CLAUSE);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__ID);
		createEAttribute(requirementEClass, REQUIREMENT__TEXT);
		createEReference(requirementEClass, REQUIREMENT__DERIVED_BY);
		createEReference(requirementEClass, REQUIREMENT__COMPOSITION);
		createEReference(requirementEClass, REQUIREMENT__SATISFIED_BY);

		allocationTableEClass = createEClass(ALLOCATION_TABLE);
		createEReference(allocationTableEClass, ALLOCATION_TABLE__ALLOCS);

		allocationEClass = createEClass(ALLOCATION);

		executableAllocationEClass = createEClass(EXECUTABLE_ALLOCATION);
		createEReference(executableAllocationEClass, EXECUTABLE_ALLOCATION__SOURCE);
		createEReference(executableAllocationEClass, EXECUTABLE_ALLOCATION__TARGET);

		activityAllocationEClass = createEClass(ACTIVITY_ALLOCATION);
		createEReference(activityAllocationEClass, ACTIVITY_ALLOCATION__SOURCE);
		createEReference(activityAllocationEClass, ACTIVITY_ALLOCATION__TARGET);

		// Create enums
		constraintKindEEnum = createEEnum(CONSTRAINT_KIND);
		flowPropertyEEnum = createEEnum(FLOW_PROPERTY);
		protocolAlternativeTypeEEnum = createEEnum(PROTOCOL_ALTERNATIVE_TYPE);
		protocolControlEEnum = createEEnum(PROTOCOL_CONTROL);
		affixOperatorEEnum = createEEnum(AFFIX_OPERATOR);
		assignmentOperatorEEnum = createEEnum(ASSIGNMENT_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		packageEClass.getESuperTypes().add(this.getNamedElement());
		modelEClass.getESuperTypes().add(this.getNamedElement());
		elementDefEClass.getESuperTypes().add(this.getNamedElement());
		dataDefEClass.getESuperTypes().add(this.getElementDef());
		dataTypeDefEClass.getESuperTypes().add(this.getTypeDef());
		dimensionDefEClass.getESuperTypes().add(this.getDataDef());
		typeDefEClass.getESuperTypes().add(this.getDataDef());
		typeUseEClass.getESuperTypes().add(this.getNamedElement());
		unitDefEClass.getESuperTypes().add(this.getDataDef());
		valueTypeDefEClass.getESuperTypes().add(this.getTypeDef());
		enumerationEClass.getESuperTypes().add(this.getTypeDef());
		structuralDefEClass.getESuperTypes().add(this.getElementDef());
		structuralUseEClass.getESuperTypes().add(this.getNamedElement());
		componentDefEClass.getESuperTypes().add(this.getStructuralDef());
		componentUseEClass.getESuperTypes().add(this.getStructuralUse());
		connectorDefEClass.getESuperTypes().add(this.getStructuralDef());
		connectorUseEClass.getESuperTypes().add(this.getStructuralUse());
		compositePortDefEClass.getESuperTypes().add(this.getPortDef());
		simplePortDefEClass.getESuperTypes().add(this.getPortDef());
		portUseEClass.getESuperTypes().add(this.getStructuralUse());
		behaviorDefEClass.getESuperTypes().add(this.getElementDef());
		actionDefEClass.getESuperTypes().add(this.getBehaviorDef());
		actionDefEClass.getESuperTypes().add(this.getActivityFlowable());
		actionUseEClass.getESuperTypes().add(this.getNamedElement());
		actionUseEClass.getESuperTypes().add(this.getActivityFlowable());
		portDefEClass.getESuperTypes().add(this.getStructuralDef());
		activityDefEClass.getESuperTypes().add(this.getBehaviorDef());
		activityDelegationEClass.getESuperTypes().add(this.getActivityRelation());
		activityFlowEClass.getESuperTypes().add(this.getActivityRelation());
		activitySwitchEClass.getESuperTypes().add(this.getActivityFlowable());
		pinEClass.getESuperTypes().add(this.getTypeUse());
		pinEClass.getESuperTypes().add(this.getActivityFlowable());
		actionPinEClass.getESuperTypes().add(this.getPin());
		dataObjectEClass.getESuperTypes().add(this.getNamedElement());
		dataObjectEClass.getESuperTypes().add(this.getActivityFlowable());
		dataStoreEClass.getESuperTypes().add(this.getDataObject());
		dataBufferEClass.getESuperTypes().add(this.getDataObject());
		protocolBodyEClass.getESuperTypes().add(this.getProtocolBodyInternal());
		predefinedActionEClass.getESuperTypes().add(this.getProtocolBodyInternal());
		actionSendEClass.getESuperTypes().add(this.getPredefinedAction());
		actionReceiveEClass.getESuperTypes().add(this.getPredefinedAction());
		protocolEClass.getESuperTypes().add(this.getBehaviorDef());
		constraintDefEClass.getESuperTypes().add(this.getBehaviorDef());
		executableEClass.getESuperTypes().add(this.getElementDef());
		expressionEClass.getESuperTypes().add(this.getStatement());
		conditionalTestExpressionEClass.getESuperTypes().add(this.getExpression());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		conditionalLogicalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		logicalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		shiftExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		arithmeticExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		classificationExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		primaryExpressionEClass.getESuperTypes().add(this.getExpression());
		nameExpressionEClass.getESuperTypes().add(this.getPrimaryExpression());
		nonNameExpressionEClass.getESuperTypes().add(this.getPrimaryExpression());
		booleanLiteralExpressionEClass.getESuperTypes().add(this.getNonNameExpression());
		naturalLiteralExpressionEClass.getESuperTypes().add(this.getNonNameExpression());
		stringLiteralExpressionEClass.getESuperTypes().add(this.getNonNameExpression());
		thisExpressionEClass.getESuperTypes().add(this.getNonNameExpression());
		propertyAccessExpressionEClass.getESuperTypes().add(this.getPrimaryExpression());
		incrementOrDecrementExpressionEClass.getESuperTypes().add(this.getExpression());
		prefixExpressionEClass.getESuperTypes().add(this.getIncrementOrDecrementExpression());
		postfixExpressionEClass.getESuperTypes().add(this.getIncrementOrDecrementExpression());
		blockStatementEClass.getESuperTypes().add(this.getStatement());
		assignmentExpressionEClass.getESuperTypes().add(this.getExpression());
		variableDeclEClass.getESuperTypes().add(this.getStatement());
		variableDeclEClass.getESuperTypes().add(this.getTypeUse());
		ifBlockStatementEClass.getESuperTypes().add(this.getStatement());
		returnStatementEClass.getESuperTypes().add(this.getStatement());
		loopStatementEClass.getESuperTypes().add(this.getStatement());
		whileStatementEClass.getESuperTypes().add(this.getLoopStatement());
		doStatementEClass.getESuperTypes().add(this.getLoopStatement());
		forStatementEClass.getESuperTypes().add(this.getStatement());
		switchStatementEClass.getESuperTypes().add(this.getStatement());
		defaultSwitchClauseEClass.getESuperTypes().add(this.getSwitchClause());
		requirementEClass.getESuperTypes().add(this.getNamedElement());
		executableAllocationEClass.getESuperTypes().add(this.getAllocation());
		activityAllocationEClass.getESuperTypes().add(this.getAllocation());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", "newElement", 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedElement_Properties(), this.getProperty(), null, "properties", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, sysADL_Sintax.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_Imports(), this.getPackage(), null, "imports", null, 0, -1, sysADL_Sintax.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_Imports().getEKeys().add(this.getNamedElement_Name());
		initEReference(getPackage_ElementImports(), this.getElementDef(), null, "elementImports", null, 0, -1, sysADL_Sintax.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_ElementImports().getEKeys().add(this.getNamedElement_Name());
		initEReference(getPackage_Architectures(), this.getElementDef(), null, "architectures", null, 0, -1, sysADL_Sintax.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getPackage_Architectures().getEKeys().add(this.getNamedElement_Name());

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Packages(), this.getPackage(), null, "packages", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_Packages().getEKeys().add(this.getNamedElement_Name());
		initEReference(getModel_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_Requirements().getEKeys().add(this.getNamedElement_Name());
		initEReference(getModel_InvolvedElements(), this.getElementDef(), null, "involvedElements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getModel_InvolvedElements().getEKeys().add(this.getNamedElement_Name());
		initEReference(getModel_Allocation(), this.getAllocationTable(), null, "allocation", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(elementDefEClass, ElementDef.class, "ElementDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDef_Satisfies(), this.getRequirement(), this.getRequirement_SatisfiedBy(), "satisfies", null, 0, 1, ElementDef.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		getElementDef_Satisfies().getEKeys().add(this.getNamedElement_Name());

		initEClass(dataDefEClass, DataDef.class, "DataDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintUseEClass, ConstraintUse.class, "ConstraintUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintUse_Definition(), this.getConstraintDef(), null, "definition", null, 0, 1, ConstraintUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintUse_Kind(), this.getConstraintKind(), "kind", "postCondition", 0, 1, ConstraintUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraintUse_Params(), this.getTypeUse(), null, "params", null, 0, -1, ConstraintUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConstraintUse_Params().getEKeys().add(this.getNamedElement_Name());

		initEClass(dataTypeDefEClass, DataTypeDef.class, "DataTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeDef_DataTypeAttributes(), this.getTypeUse(), null, "dataTypeAttributes", null, 0, -1, DataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeDef_SuperType(), this.getDataTypeDef(), null, "superType", null, 0, 1, DataTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionDefEClass, DimensionDef.class, "DimensionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDefEClass, TypeDef.class, "TypeDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(typeDefEClass, ecorePackage.getEBoolean(), "isCompatible", 0, 1);

		initEClass(typeUseEClass, TypeUse.class, "TypeUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeUse_Definition(), this.getTypeDef(), null, "definition", null, 1, 1, TypeUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTypeUse_Definition().getEKeys().add(this.getNamedElement_Name());

		initEClass(unitDefEClass, UnitDef.class, "UnitDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitDef_Dimension(), this.getDimensionDef(), null, "dimension", null, 0, 1, UnitDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeDefEClass, ValueTypeDef.class, "ValueTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueTypeDef_Unit(), this.getUnitDef(), null, "unit", null, 0, 1, ValueTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueTypeDef_Dimension(), this.getDimensionDef(), null, "dimension", null, 0, 1, ValueTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueTypeDef_SuperType(), this.getValueTypeDef(), null, "superType", null, 0, 1, ValueTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Literals(), this.getEnumLiteralValue(), this.getEnumLiteralValue_Enum(), "literals", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralValueEClass, EnumLiteralValue.class, "EnumLiteralValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumLiteralValue_Enum(), this.getEnumeration(), this.getEnumeration_Literals(), "enum", null, 1, 1, EnumLiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumLiteralValue_Key(), ecorePackage.getEString(), "key", null, 1, 1, EnumLiteralValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Type(), this.getTypeDef(), null, "type", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Value(), this.getExpression(), null, "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralDefEClass, StructuralDef.class, "StructuralDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralDef_ArchDefs(), this.getStructuralDef(), null, "archDefs", null, 0, -1, StructuralDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuralDef_DataDefs(), this.getDataDef(), null, "dataDefs", null, 0, -1, StructuralDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralUseEClass, StructuralUse.class, "StructuralUse", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralUse_LowerBound(), ecorePackage.getEInt(), "lowerBound", "1", 0, 1, StructuralUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructuralUse_UpperBound(), ecorePackage.getEInt(), "upperBound", "1", 0, 1, StructuralUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDefEClass, ComponentDef.class, "ComponentDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDef_Ports(), this.getPortUse(), null, "ports", null, 0, -1, ComponentDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDef_Composite(), this.getConfiguration(), null, "composite", null, 0, 1, ComponentDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDef_IsBoundary(), ecorePackage.getEBoolean(), "isBoundary", "false", 1, 1, ComponentDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentUseEClass, ComponentUse.class, "ComponentUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentUse_Definition(), this.getComponentDef(), null, "definition", null, 1, 1, ComponentUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentUse_Ports(), this.getPortUse(), null, "ports", null, 0, -1, ComponentUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorDefEClass, ConnectorDef.class, "ConnectorDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorDef_Ports(), this.getPortUse(), null, "ports", null, 0, 2, ConnectorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorDef_Flows(), this.getFlow(), null, "flows", null, 0, -1, ConnectorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorDef_Composite(), this.getConfiguration(), null, "composite", null, 0, 1, ConnectorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorUseEClass, ConnectorUse.class, "ConnectorUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorUse_Definition(), this.getConnectorDef(), null, "definition", null, 1, 1, ConnectorUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorUse_Ports(), this.getPortUse(), null, "ports", null, 0, -1, ConnectorUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorUse_Bindings(), this.getConnectorBinding(), null, "bindings", null, 0, -1, ConnectorUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(connectorUseEClass, null, "allPorts");

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Components(), this.getComponentUse(), null, "components", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Delegations(), this.getDelegation(), null, "delegations", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Connectors(), this.getConnectorUse(), null, "connectors", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationEClass, Delegation.class, "Delegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegation_PortProxy(), this.getPortUse(), null, "portProxy", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegation_FullPort(), this.getPortUse(), null, "fullPort", null, 1, 1, Delegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(delegationEClass, ecorePackage.getEBoolean(), "checkCompatibility", 0, 1);

		initEClass(compositePortDefEClass, CompositePortDef.class, "CompositePortDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositePortDef_Ports(), this.getPortUse(), null, "ports", null, 2, -1, CompositePortDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePortDefEClass, SimplePortDef.class, "SimplePortDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimplePortDef_FlowProperties(), this.getFlowProperty(), "flowProperties", "in", 1, 1, SimplePortDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePortDef_FlowType(), this.getTypeDef(), null, "flowType", null, 1, 1, SimplePortDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portUseEClass, PortUse.class, "PortUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortUse_Definition(), this.getPortDef(), null, "definition", null, 1, 1, PortUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorBindingEClass, ConnectorBinding.class, "ConnectorBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorBinding_FirstPort(), this.getPortUse(), null, "firstPort", null, 1, 1, ConnectorBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectorBinding_SecondPort(), this.getPortUse(), null, "secondPort", null, 1, 1, ConnectorBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_FlowType(), this.getTypeDef(), null, "flowType", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Source(), this.getPortUse(), null, "source", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFlow_Source().getEKeys().add(this.getNamedElement_Name());
		initEReference(getFlow_Destination(), this.getPortUse(), null, "destination", null, 1, 1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFlow_Destination().getEKeys().add(this.getNamedElement_Name());

		initEClass(behaviorDefEClass, BehaviorDef.class, "BehaviorDef", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorDef_InParameters(), this.getPin(), null, "inParameters", null, 0, -1, BehaviorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorDef_OutParameters(), this.getPin(), null, "outParameters", null, 0, -1, BehaviorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehaviorDef_BehaDefs(), this.getBehaviorDef(), null, "behaDefs", null, 0, -1, BehaviorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorDef_DataDefs(), this.getDataDef(), null, "dataDefs", null, 0, -1, BehaviorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorDef_Constraints(), this.getConstraintUse(), null, "constraints", null, 0, -1, BehaviorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorDef_Delegations(), this.getActivityDelegation(), null, "delegations", null, 0, -1, BehaviorDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDefEClass, ActionDef.class, "ActionDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDef_ReturnType(), this.getTypeDef(), null, "returnType", null, 0, 1, ActionDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionUseEClass, ActionUse.class, "ActionUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionUse_Definition(), this.getActionDef(), null, "definition", null, 0, 1, ActionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionUse_PinIn(), this.getPin(), null, "pinIn", null, 0, -1, ActionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityBodyEClass, ActivityBody.class, "ActivityBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityBody_Actions(), this.getActionUse(), null, "actions", null, 0, -1, ActivityBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getActivityBody_Actions().getEKeys().add(this.getNamedElement_Name());
		initEReference(getActivityBody_Flows(), this.getActivityRelation(), null, "flows", null, 0, -1, ActivityBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityBody_DataObjects(), this.getDataObject(), null, "dataObjects", null, 0, -1, ActivityBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portDefEClass, PortDef.class, "PortDef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityDefEClass, ActivityDef.class, "ActivityDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityDef_Acbody(), this.getActivityBody(), null, "acbody", null, 0, 1, ActivityDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityRelationEClass, ActivityRelation.class, "ActivityRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityRelation_Source(), this.getActivityFlowable(), null, "source", null, 1, 1, ActivityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityRelation_Target(), this.getActivityFlowable(), null, "target", null, 0, 1, ActivityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityRelation_TargetSwitch(), this.getActivitySwitch(), null, "targetSwitch", null, 0, 1, ActivityRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityDelegationEClass, ActivityDelegation.class, "ActivityDelegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityFlowEClass, ActivityFlow.class, "ActivityFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activitySwitchEClass, ActivitySwitch.class, "ActivitySwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitySwitch_Cases(), this.getActivitySwitchCase(), null, "cases", null, 0, -1, ActivitySwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activitySwitchCaseEClass, ActivitySwitchCase.class, "ActivitySwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivitySwitchCase_Condition(), this.getExpression(), null, "condition", null, 0, 1, ActivitySwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivitySwitchCase_Target(), this.getActivityFlowable(), null, "target", null, 0, 1, ActivitySwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityFlowableEClass, ActivityFlowable.class, "ActivityFlowable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pinEClass, Pin.class, "Pin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_IsFlow(), ecorePackage.getEBoolean(), "isFlow", "false", 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionPinEClass, ActionPin.class, "ActionPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionPin_PinName(), this.getTypeUse(), null, "pinName", null, 1, 1, ActionPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionPin_PinValue(), this.getStatement(), null, "pinValue", null, 0, -1, ActionPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataObject_Type(), this.getTypeDef(), null, "type", null, 1, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDataObject_Type().getEKeys().add(this.getNamedElement_Name());
		initEReference(getDataObject_InitValue(), this.getExpression(), null, "initValue", null, 0, 1, DataObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataStoreEClass, DataStore.class, "DataStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataBufferEClass, DataBuffer.class, "DataBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protocolBodyEClass, ProtocolBody.class, "ProtocolBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolBody_RecControl(), this.getProtocolControl(), "recControl", "several", 0, 1, ProtocolBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolBody_Body(), this.getProtocolBodyInternal(), null, "body", null, 0, 1, ProtocolBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolBody_Recursive(), this.getProtocolBody(), null, "recursive", null, 0, 1, ProtocolBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtocolBody_RecType(), this.getProtocolAlternativeType(), "recType", null, 0, 1, ProtocolBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolBodyInternalEClass, ProtocolBodyInternal.class, "ProtocolBodyInternal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predefinedActionEClass, PredefinedAction.class, "PredefinedAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionSendEClass, ActionSend.class, "ActionSend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionSend_Expr(), this.getExpression(), null, "expr", null, 1, 1, ActionSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionSend_FlowTo(), this.getPin(), null, "flowTo", null, 1, 1, ActionSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getActionSend_FlowTo().getEKeys().add(this.getNamedElement_Name());

		initEClass(actionReceiveEClass, ActionReceive.class, "ActionReceive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionReceive_Var(), this.getTypeUse(), null, "var", null, 1, 1, ActionReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionReceive_FlowTo(), this.getPin(), null, "flowTo", null, 1, 1, ActionReceive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getActionReceive_FlowTo().getEKeys().add(this.getNamedElement_Name());

		initEClass(protocolEClass, Protocol.class, "Protocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocol_Body(), this.getProtocolBody(), null, "body", null, 1, 1, Protocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintDefEClass, ConstraintDef.class, "ConstraintDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintDef_Equation(), this.getExpression(), null, "equation", null, 0, 1, ConstraintDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executableEClass, Executable.class, "Executable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutable_Body(), this.getStatement(), null, "body", null, 1, -1, Executable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutable_ReturnType(), this.getTypeDef(), null, "returnType", null, 1, 1, Executable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutable_Params(), this.getTypeUse(), null, "params", null, 0, -1, Executable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(statementEClass, null, "run");

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalTestExpressionEClass, ConditionalTestExpression.class, "ConditionalTestExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalTestExpression_Op1(), this.getExpression(), null, "op1", null, 0, 1, ConditionalTestExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalTestExpression_Op2(), this.getExpression(), null, "op2", null, 0, 1, ConditionalTestExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalTestExpression_Op3(), this.getExpression(), null, "op3", null, 0, 1, ConditionalTestExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Op1(), this.getExpression(), null, "op1", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Op2(), this.getExpression(), null, "op2", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalLogicalExpressionEClass, ConditionalLogicalExpression.class, "ConditionalLogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shiftExpressionEClass, ShiftExpression.class, "ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticExpressionEClass, ArithmeticExpression.class, "ArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Op(), this.getExpression(), null, "op", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnaryExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationExpressionEClass, ClassificationExpression.class, "ClassificationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassificationExpression_TypeName(), this.getTypeDef(), null, "typeName", null, 0, 1, ClassificationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameExpressionEClass, NameExpression.class, "NameExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameExpression_Cite(), this.getNamedElement(), null, "cite", null, 1, 1, NameExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNameExpression_Cite().getEKeys().add(this.getNamedElement_Name());

		initEClass(nonNameExpressionEClass, NonNameExpression.class, "NonNameExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(booleanLiteralExpressionEClass, BooleanLiteralExpression.class, "BooleanLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteralExpression_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 1, 1, BooleanLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalLiteralExpressionEClass, NaturalLiteralExpression.class, "NaturalLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNaturalLiteralExpression_Int_value(), ecorePackage.getEInt(), "int_value", null, 1, 1, NaturalLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralExpressionEClass, StringLiteralExpression.class, "StringLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteralExpression_Str_value(), ecorePackage.getEString(), "str_value", null, 1, 1, StringLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thisExpressionEClass, ThisExpression.class, "ThisExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyAccessExpressionEClass, PropertyAccessExpression.class, "PropertyAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyAccessExpression_Target(), this.getExpression(), null, "target", null, 1, 1, PropertyAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPropertyAccessExpression_Field(), this.getNamedElement(), null, "field", null, 1, 1, PropertyAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incrementOrDecrementExpressionEClass, IncrementOrDecrementExpression.class, "IncrementOrDecrementExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncrementOrDecrementExpression_Operand(), this.getLeftHandSide(), null, "operand", null, 0, 1, IncrementOrDecrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncrementOrDecrementExpression_Operator(), this.getAffixOperator(), "operator", null, 1, 1, IncrementOrDecrementExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefixExpressionEClass, PrefixExpression.class, "PrefixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(postfixExpressionEClass, PostfixExpression.class, "PostfixExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockStatementEClass, BlockStatement.class, "BlockStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockStatement_Body(), this.getStatement(), null, "body", null, 0, -1, BlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignmentExpressionEClass, AssignmentExpression.class, "AssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssignmentExpression_Lhs(), this.getLeftHandSide(), null, "lhs", null, 1, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssignmentExpression_V(), this.getExpression(), null, "v", null, 1, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssignmentExpression_Operator(), this.getAssignmentOperator(), "operator", "equal", 1, 1, AssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftHandSideEClass, LeftHandSide.class, "LeftHandSide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeftHandSide_Target(), this.getNameExpression(), null, "target", null, 0, 1, LeftHandSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLeftHandSide_Index(), ecorePackage.getEInt(), "index", null, 0, 1, LeftHandSide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDecl_Value(), this.getExpression(), null, "value", null, 0, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifBlockStatementEClass, IfBlockStatement.class, "IfBlockStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfBlockStatement_Main_if(), this.getIfStatement(), null, "main_if", null, 1, 1, IfBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBlockStatement_Paralel_ifs(), this.getIfStatement(), null, "paralel_ifs", null, 0, -1, IfBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBlockStatement_Sequential_ifs(), this.getIfStatement(), null, "sequential_ifs", null, 0, -1, IfBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBlockStatement_Final(), this.getElseStatement(), null, "final", null, 0, 1, IfBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfBlockStatement_Else(), this.getElseStatement(), null, "else", null, 0, 1, IfBlockStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfStatement_Body(), this.getStatement(), null, "body", null, 1, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseStatementEClass, ElseStatement.class, "ElseStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseStatement_Body(), this.getStatement(), null, "body", null, 1, 1, ElseStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturnStatement_Value(), this.getExpression(), null, "value", null, 1, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopStatementEClass, LoopStatement.class, "LoopStatement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopStatement_Condition(), this.getExpression(), null, "condition", null, 1, 1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopStatement_Body(), this.getStatement(), null, "body", null, 1, 1, LoopStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileStatementEClass, WhileStatement.class, "WhileStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doStatementEClass, DoStatement.class, "DoStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forStatementEClass, ForStatement.class, "ForStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForStatement_Body(), this.getStatement(), null, "body", null, 1, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForStatement_Control(), this.getForControl(), null, "control", null, 1, 1, ForStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forControlEClass, ForControl.class, "ForControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForControl_Vars(), this.getForVar(), null, "vars", null, 1, -1, ForControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forVarEClass, ForVar.class, "ForVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForVar_Var(), this.getVariableDecl(), null, "var", null, 1, 1, ForVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForVar_Expr(), this.getExpression(), null, "expr", null, 1, 1, ForVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchStatementEClass, SwitchStatement.class, "SwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchStatement_Expr(), this.getExpression(), null, "expr", null, 1, 1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchStatement_Clauses(), this.getSwitchClause(), null, "clauses", null, 0, -1, SwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchClauseEClass, SwitchClause.class, "SwitchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchClause_Value(), this.getExpression(), null, "value", null, 0, 1, SwitchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchClause_Body(), this.getStatement(), null, "body", null, 1, 1, SwitchClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultSwitchClauseEClass, DefaultSwitchClause.class, "DefaultSwitchClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Id(), ecorePackage.getEFloat(), "id", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Text(), ecorePackage.getEString(), "text", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_DerivedBy(), this.getRequirement(), null, "derivedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRequirement_DerivedBy().getEKeys().add(this.getNamedElement_Name());
		initEReference(getRequirement_Composition(), this.getRequirement(), null, "composition", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRequirement_Composition().getEKeys().add(this.getNamedElement_Name());
		initEReference(getRequirement_SatisfiedBy(), this.getElementDef(), this.getElementDef_Satisfies(), "satisfiedBy", null, 0, -1, Requirement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getRequirement_SatisfiedBy().getEKeys().add(this.getNamedElement_Name());

		addEOperation(requirementEClass, ecorePackage.getEBoolean(), "isValid", 0, 1);

		initEClass(allocationTableEClass, AllocationTable.class, "AllocationTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationTable_Allocs(), this.getAllocation(), null, "allocs", null, 0, -1, AllocationTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executableAllocationEClass, ExecutableAllocation.class, "ExecutableAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableAllocation_Source(), this.getExecutable(), null, "source", null, 0, 1, ExecutableAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutableAllocation_Target(), this.getActionDef(), null, "target", null, 0, 1, ExecutableAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityAllocationEClass, ActivityAllocation.class, "ActivityAllocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityAllocation_Source(), this.getActivityDef(), null, "source", null, 0, 1, ActivityAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityAllocation_Target(), this.getStructuralDef(), null, "target", null, 0, 1, ActivityAllocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constraintKindEEnum, ConstraintKind.class, "ConstraintKind");
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.PRE_CONDITION_LITERAL);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.POST_CONDITION_LITERAL);
		addEEnumLiteral(constraintKindEEnum, ConstraintKind.INVARIANT_LITERAL);

		initEEnum(flowPropertyEEnum, FlowProperty.class, "FlowProperty");
		addEEnumLiteral(flowPropertyEEnum, FlowProperty.IN_LITERAL);
		addEEnumLiteral(flowPropertyEEnum, FlowProperty.OUT_LITERAL);

		initEEnum(protocolAlternativeTypeEEnum, ProtocolAlternativeType.class, "ProtocolAlternativeType");
		addEEnumLiteral(protocolAlternativeTypeEEnum, ProtocolAlternativeType.ALTERNATIVE_LITERAL);
		addEEnumLiteral(protocolAlternativeTypeEEnum, ProtocolAlternativeType.COMPLIMENTARY_LITERAL);

		initEEnum(protocolControlEEnum, ProtocolControl.class, "ProtocolControl");
		addEEnumLiteral(protocolControlEEnum, ProtocolControl.SEVERAL_LITERAL);
		addEEnumLiteral(protocolControlEEnum, ProtocolControl.ONCE_LITERAL);
		addEEnumLiteral(protocolControlEEnum, ProtocolControl.PERHAPS_LITERAL);
		addEEnumLiteral(protocolControlEEnum, ProtocolControl.ALWAYS_LITERAL);

		initEEnum(affixOperatorEEnum, AffixOperator.class, "AffixOperator");
		addEEnumLiteral(affixOperatorEEnum, AffixOperator.MINUS_LITERAL);
		addEEnumLiteral(affixOperatorEEnum, AffixOperator.PLUS_LITERAL);

		initEEnum(assignmentOperatorEEnum, AssignmentOperator.class, "AssignmentOperator");
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.PLUS_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.MINUS_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.STAR_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.MOD_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.DIV_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.AND_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.OR_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.POWER_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.SHIFT_LEFT_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.SHIFT_RIGHT_EQUAL_LITERAL);
		addEEnumLiteral(assignmentOperatorEEnum, AssignmentOperator.SHIFT_RIGHT_DOUBLED_EQUAL_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  ((EOperation)statementEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
		   });
	}

} //SysADLPackageImpl
