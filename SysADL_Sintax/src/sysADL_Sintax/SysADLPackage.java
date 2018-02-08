/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLFactory
 * @model kind="package"
 * @generated
 */
public interface SysADLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sysADL_Sintax";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.sysADL_Sintax";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sysADL_Sintax";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysADLPackage eINSTANCE = sysADL_Sintax.impl.SysADLPackageImpl.init();

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.NamedElementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PackageImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT_IMPORTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architectures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ARCHITECTURES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ModelImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Involved Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INVOLVED_ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ALLOCATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ElementDefImpl <em>Element Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ElementDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getElementDef()
	 * @generated
	 */
	int ELEMENT_DEF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEF__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEF__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEF__SATISFIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEF_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DataDefImpl <em>Data Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DataDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataDef()
	 * @generated
	 */
	int DATA_DEF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__NAME = ELEMENT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__PROPERTIES = ELEMENT_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF__SATISFIES = ELEMENT_DEF__SATISFIES;

	/**
	 * The number of structural features of the '<em>Data Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEF_FEATURE_COUNT = ELEMENT_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConstraintUseImpl <em>Constraint Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConstraintUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConstraintUse()
	 * @generated
	 */
	int CONSTRAINT_USE = 5;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_USE__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_USE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_USE__PARAMS = 2;

	/**
	 * The number of structural features of the '<em>Constraint Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_USE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.TypeDefImpl <em>Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.TypeDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getTypeDef()
	 * @generated
	 */
	int TYPE_DEF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__NAME = DATA_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__PROPERTIES = DATA_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF__SATISFIES = DATA_DEF__SATISFIES;

	/**
	 * The number of structural features of the '<em>Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DataTypeDefImpl <em>Data Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DataTypeDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataTypeDef()
	 * @generated
	 */
	int DATA_TYPE_DEF = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEF__NAME = TYPE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEF__PROPERTIES = TYPE_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEF__SATISFIES = TYPE_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Data Type Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES = TYPE_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEF__SUPER_TYPE = TYPE_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DimensionDefImpl <em>Dimension Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DimensionDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDimensionDef()
	 * @generated
	 */
	int DIMENSION_DEF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEF__NAME = DATA_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEF__PROPERTIES = DATA_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEF__SATISFIES = DATA_DEF__SATISFIES;

	/**
	 * The number of structural features of the '<em>Dimension Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.TypeUseImpl <em>Type Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.TypeUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getTypeUse()
	 * @generated
	 */
	int TYPE_USE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.UnitDefImpl <em>Unit Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.UnitDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getUnitDef()
	 * @generated
	 */
	int UNIT_DEF = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEF__NAME = DATA_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEF__PROPERTIES = DATA_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEF__SATISFIES = DATA_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEF__DIMENSION = DATA_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_DEF_FEATURE_COUNT = DATA_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ValueTypeDefImpl <em>Value Type Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ValueTypeDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getValueTypeDef()
	 * @generated
	 */
	int VALUE_TYPE_DEF = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF__NAME = TYPE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF__PROPERTIES = TYPE_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF__SATISFIES = TYPE_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF__UNIT = TYPE_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF__DIMENSION = TYPE_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF__SUPER_TYPE = TYPE_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Type Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_DEF_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.EnumerationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = TYPE_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__PROPERTIES = TYPE_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__SATISFIES = TYPE_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = TYPE_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = TYPE_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.EnumLiteralValueImpl <em>Enum Literal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.EnumLiteralValueImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getEnumLiteralValue()
	 * @generated
	 */
	int ENUM_LITERAL_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_VALUE__ENUM = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_VALUE__KEY = 1;

	/**
	 * The number of structural features of the '<em>Enum Literal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_LITERAL_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PropertyImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.StructuralDefImpl <em>Structural Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.StructuralDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStructuralDef()
	 * @generated
	 */
	int STRUCTURAL_DEF = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DEF__NAME = ELEMENT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DEF__PROPERTIES = ELEMENT_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DEF__SATISFIES = ELEMENT_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Arch Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DEF__ARCH_DEFS = ELEMENT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DEF__DATA_DEFS = ELEMENT_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structural Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_DEF_FEATURE_COUNT = ELEMENT_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.StructuralUseImpl <em>Structural Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.StructuralUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStructuralUse()
	 * @generated
	 */
	int STRUCTURAL_USE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_USE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_USE__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_USE__LOWER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_USE__UPPER_BOUND = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structural Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURAL_USE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ComponentDefImpl <em>Component Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ComponentDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getComponentDef()
	 * @generated
	 */
	int COMPONENT_DEF = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__NAME = STRUCTURAL_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__PROPERTIES = STRUCTURAL_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__SATISFIES = STRUCTURAL_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Arch Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__ARCH_DEFS = STRUCTURAL_DEF__ARCH_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__DATA_DEFS = STRUCTURAL_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__PORTS = STRUCTURAL_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__COMPOSITE = STRUCTURAL_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF__IS_BOUNDARY = STRUCTURAL_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DEF_FEATURE_COUNT = STRUCTURAL_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ComponentUseImpl <em>Component Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ComponentUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getComponentUse()
	 * @generated
	 */
	int COMPONENT_USE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE__NAME = STRUCTURAL_USE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE__PROPERTIES = STRUCTURAL_USE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE__LOWER_BOUND = STRUCTURAL_USE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE__UPPER_BOUND = STRUCTURAL_USE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE__DEFINITION = STRUCTURAL_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE__PORTS = STRUCTURAL_USE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_USE_FEATURE_COUNT = STRUCTURAL_USE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConnectorDefImpl <em>Connector Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConnectorDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConnectorDef()
	 * @generated
	 */
	int CONNECTOR_DEF = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__NAME = STRUCTURAL_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__PROPERTIES = STRUCTURAL_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__SATISFIES = STRUCTURAL_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Arch Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__ARCH_DEFS = STRUCTURAL_DEF__ARCH_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__DATA_DEFS = STRUCTURAL_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__PORTS = STRUCTURAL_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__FLOWS = STRUCTURAL_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF__COMPOSITE = STRUCTURAL_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_DEF_FEATURE_COUNT = STRUCTURAL_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConnectorUseImpl <em>Connector Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConnectorUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConnectorUse()
	 * @generated
	 */
	int CONNECTOR_USE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__NAME = STRUCTURAL_USE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__PROPERTIES = STRUCTURAL_USE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__LOWER_BOUND = STRUCTURAL_USE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__UPPER_BOUND = STRUCTURAL_USE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__DEFINITION = STRUCTURAL_USE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__PORTS = STRUCTURAL_USE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE__BINDINGS = STRUCTURAL_USE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_USE_FEATURE_COUNT = STRUCTURAL_USE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConfigurationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 21;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DELEGATIONS = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTORS = 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DelegationImpl <em>Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DelegationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDelegation()
	 * @generated
	 */
	int DELEGATION = 22;

	/**
	 * The feature id for the '<em><b>Port Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__PORT_PROXY = 0;

	/**
	 * The feature id for the '<em><b>Full Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION__FULL_PORT = 1;

	/**
	 * The number of structural features of the '<em>Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PortDefImpl <em>Port Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PortDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPortDef()
	 * @generated
	 */
	int PORT_DEF = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEF__NAME = STRUCTURAL_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEF__PROPERTIES = STRUCTURAL_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEF__SATISFIES = STRUCTURAL_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Arch Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEF__ARCH_DEFS = STRUCTURAL_DEF__ARCH_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEF__DATA_DEFS = STRUCTURAL_DEF__DATA_DEFS;

	/**
	 * The number of structural features of the '<em>Port Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEF_FEATURE_COUNT = STRUCTURAL_DEF_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.CompositePortDefImpl <em>Composite Port Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.CompositePortDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getCompositePortDef()
	 * @generated
	 */
	int COMPOSITE_PORT_DEF = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF__NAME = PORT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF__PROPERTIES = PORT_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF__SATISFIES = PORT_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Arch Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF__ARCH_DEFS = PORT_DEF__ARCH_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF__DATA_DEFS = PORT_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF__PORTS = PORT_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Port Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PORT_DEF_FEATURE_COUNT = PORT_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.SimplePortDefImpl <em>Simple Port Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.SimplePortDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getSimplePortDef()
	 * @generated
	 */
	int SIMPLE_PORT_DEF = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__NAME = PORT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__PROPERTIES = PORT_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__SATISFIES = PORT_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Arch Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__ARCH_DEFS = PORT_DEF__ARCH_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__DATA_DEFS = PORT_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Flow Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__FLOW_PROPERTIES = PORT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF__FLOW_TYPE = PORT_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Port Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PORT_DEF_FEATURE_COUNT = PORT_DEF_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PortUseImpl <em>Port Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PortUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPortUse()
	 * @generated
	 */
	int PORT_USE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USE__NAME = STRUCTURAL_USE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USE__PROPERTIES = STRUCTURAL_USE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USE__LOWER_BOUND = STRUCTURAL_USE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USE__UPPER_BOUND = STRUCTURAL_USE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USE__DEFINITION = STRUCTURAL_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_USE_FEATURE_COUNT = STRUCTURAL_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConnectorBindingImpl <em>Connector Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConnectorBindingImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConnectorBinding()
	 * @generated
	 */
	int CONNECTOR_BINDING = 26;

	/**
	 * The feature id for the '<em><b>First Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_BINDING__FIRST_PORT = 0;

	/**
	 * The feature id for the '<em><b>Second Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_BINDING__SECOND_PORT = 1;

	/**
	 * The number of structural features of the '<em>Connector Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.FlowImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 27;

	/**
	 * The feature id for the '<em><b>Flow Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__FLOW_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DESTINATION = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.BehaviorDef <em>Behavior Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.BehaviorDef
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBehaviorDef()
	 * @generated
	 */
	int BEHAVIOR_DEF = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__NAME = ELEMENT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__PROPERTIES = ELEMENT_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__SATISFIES = ELEMENT_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__IN_PARAMETERS = ELEMENT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__OUT_PARAMETERS = ELEMENT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Beha Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__BEHA_DEFS = ELEMENT_DEF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__DATA_DEFS = ELEMENT_DEF_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__CONSTRAINTS = ELEMENT_DEF_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF__DELEGATIONS = ELEMENT_DEF_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Behavior Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_DEF_FEATURE_COUNT = ELEMENT_DEF_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActionDefImpl <em>Action Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActionDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionDef()
	 * @generated
	 */
	int ACTION_DEF = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__NAME = BEHAVIOR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__PROPERTIES = BEHAVIOR_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__SATISFIES = BEHAVIOR_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__IN_PARAMETERS = BEHAVIOR_DEF__IN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__OUT_PARAMETERS = BEHAVIOR_DEF__OUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Beha Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__BEHA_DEFS = BEHAVIOR_DEF__BEHA_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__DATA_DEFS = BEHAVIOR_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__CONSTRAINTS = BEHAVIOR_DEF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__DELEGATIONS = BEHAVIOR_DEF__DELEGATIONS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF__RETURN_TYPE = BEHAVIOR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEF_FEATURE_COUNT = BEHAVIOR_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActionUseImpl <em>Action Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActionUseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionUse()
	 * @generated
	 */
	int ACTION_USE = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_USE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_USE__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_USE__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_USE__PIN_IN = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_USE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivityBodyImpl <em>Activity Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivityBodyImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityBody()
	 * @generated
	 */
	int ACTIVITY_BODY = 31;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BODY__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BODY__FLOWS = 1;

	/**
	 * The feature id for the '<em><b>Data Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BODY__DATA_OBJECTS = 2;

	/**
	 * The number of structural features of the '<em>Activity Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_BODY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivityDefImpl <em>Activity Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivityDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityDef()
	 * @generated
	 */
	int ACTIVITY_DEF = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__NAME = BEHAVIOR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__PROPERTIES = BEHAVIOR_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__SATISFIES = BEHAVIOR_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__IN_PARAMETERS = BEHAVIOR_DEF__IN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__OUT_PARAMETERS = BEHAVIOR_DEF__OUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Beha Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__BEHA_DEFS = BEHAVIOR_DEF__BEHA_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__DATA_DEFS = BEHAVIOR_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__CONSTRAINTS = BEHAVIOR_DEF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__DELEGATIONS = BEHAVIOR_DEF__DELEGATIONS;

	/**
	 * The feature id for the '<em><b>Acbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF__ACBODY = BEHAVIOR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DEF_FEATURE_COUNT = BEHAVIOR_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivityRelationImpl <em>Activity Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivityRelationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityRelation()
	 * @generated
	 */
	int ACTIVITY_RELATION = 34;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RELATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RELATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Target Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RELATION__TARGET_SWITCH = 2;

	/**
	 * The number of structural features of the '<em>Activity Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_RELATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivityDelegationImpl <em>Activity Delegation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivityDelegationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityDelegation()
	 * @generated
	 */
	int ACTIVITY_DELEGATION = 35;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DELEGATION__SOURCE = ACTIVITY_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DELEGATION__TARGET = ACTIVITY_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Target Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DELEGATION__TARGET_SWITCH = ACTIVITY_RELATION__TARGET_SWITCH;

	/**
	 * The number of structural features of the '<em>Activity Delegation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_DELEGATION_FEATURE_COUNT = ACTIVITY_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivityFlowImpl <em>Activity Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivityFlowImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityFlow()
	 * @generated
	 */
	int ACTIVITY_FLOW = 36;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FLOW__SOURCE = ACTIVITY_RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FLOW__TARGET = ACTIVITY_RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Target Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FLOW__TARGET_SWITCH = ACTIVITY_RELATION__TARGET_SWITCH;

	/**
	 * The number of structural features of the '<em>Activity Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FLOW_FEATURE_COUNT = ACTIVITY_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.ActivityFlowable <em>Activity Flowable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.ActivityFlowable
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityFlowable()
	 * @generated
	 */
	int ACTIVITY_FLOWABLE = 39;

	/**
	 * The number of structural features of the '<em>Activity Flowable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FLOWABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivitySwitchImpl <em>Activity Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivitySwitchImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivitySwitch()
	 * @generated
	 */
	int ACTIVITY_SWITCH = 37;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SWITCH__CASES = ACTIVITY_FLOWABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SWITCH_FEATURE_COUNT = ACTIVITY_FLOWABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivitySwitchCaseImpl <em>Activity Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivitySwitchCaseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivitySwitchCase()
	 * @generated
	 */
	int ACTIVITY_SWITCH_CASE = 38;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SWITCH_CASE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SWITCH_CASE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Activity Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PinImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = TYPE_USE__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__PROPERTIES = TYPE_USE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__DEFINITION = TYPE_USE__DEFINITION;

	/**
	 * The feature id for the '<em><b>Is Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__IS_FLOW = TYPE_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = TYPE_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActionPinImpl <em>Action Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActionPinImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionPin()
	 * @generated
	 */
	int ACTION_PIN = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN__NAME = PIN__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN__PROPERTIES = PIN__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN__DEFINITION = PIN__DEFINITION;

	/**
	 * The feature id for the '<em><b>Is Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN__IS_FLOW = PIN__IS_FLOW;

	/**
	 * The feature id for the '<em><b>Pin Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN__PIN_NAME = PIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pin Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN__PIN_VALUE = PIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_PIN_FEATURE_COUNT = PIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DataObjectImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__INIT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DataStoreImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NAME = DATA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__PROPERTIES = DATA_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__TYPE = DATA_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__INIT_VALUE = DATA_OBJECT__INIT_VALUE;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DataBufferImpl <em>Data Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DataBufferImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataBuffer()
	 * @generated
	 */
	int DATA_BUFFER = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BUFFER__NAME = DATA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BUFFER__PROPERTIES = DATA_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BUFFER__TYPE = DATA_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BUFFER__INIT_VALUE = DATA_OBJECT__INIT_VALUE;

	/**
	 * The number of structural features of the '<em>Data Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_BUFFER_FEATURE_COUNT = DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.ProtocolBodyInternal <em>Protocol Body Internal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.ProtocolBodyInternal
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolBodyInternal()
	 * @generated
	 */
	int PROTOCOL_BODY_INTERNAL = 46;

	/**
	 * The number of structural features of the '<em>Protocol Body Internal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BODY_INTERNAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ProtocolBodyImpl <em>Protocol Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ProtocolBodyImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolBody()
	 * @generated
	 */
	int PROTOCOL_BODY = 45;

	/**
	 * The feature id for the '<em><b>Rec Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BODY__REC_CONTROL = PROTOCOL_BODY_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BODY__BODY = PROTOCOL_BODY_INTERNAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Recursive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BODY__RECURSIVE = PROTOCOL_BODY_INTERNAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BODY__REC_TYPE = PROTOCOL_BODY_INTERNAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Protocol Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_BODY_FEATURE_COUNT = PROTOCOL_BODY_INTERNAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.PredefinedAction <em>Predefined Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.PredefinedAction
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPredefinedAction()
	 * @generated
	 */
	int PREDEFINED_ACTION = 47;

	/**
	 * The number of structural features of the '<em>Predefined Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_ACTION_FEATURE_COUNT = PROTOCOL_BODY_INTERNAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActionSendImpl <em>Action Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActionSendImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionSend()
	 * @generated
	 */
	int ACTION_SEND = 48;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEND__EXPR = PREDEFINED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEND__FLOW_TO = PREDEFINED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_SEND_FEATURE_COUNT = PREDEFINED_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActionReceiveImpl <em>Action Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActionReceiveImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionReceive()
	 * @generated
	 */
	int ACTION_RECEIVE = 49;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RECEIVE__VAR = PREDEFINED_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RECEIVE__FLOW_TO = PREDEFINED_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_RECEIVE_FEATURE_COUNT = PREDEFINED_ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ProtocolImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__NAME = BEHAVIOR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PROPERTIES = BEHAVIOR_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__SATISFIES = BEHAVIOR_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__IN_PARAMETERS = BEHAVIOR_DEF__IN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__OUT_PARAMETERS = BEHAVIOR_DEF__OUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Beha Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__BEHA_DEFS = BEHAVIOR_DEF__BEHA_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DATA_DEFS = BEHAVIOR_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__CONSTRAINTS = BEHAVIOR_DEF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__DELEGATIONS = BEHAVIOR_DEF__DELEGATIONS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__BODY = BEHAVIOR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = BEHAVIOR_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConstraintDefImpl <em>Constraint Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConstraintDefImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConstraintDef()
	 * @generated
	 */
	int CONSTRAINT_DEF = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__NAME = BEHAVIOR_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__PROPERTIES = BEHAVIOR_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__SATISFIES = BEHAVIOR_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>In Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__IN_PARAMETERS = BEHAVIOR_DEF__IN_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__OUT_PARAMETERS = BEHAVIOR_DEF__OUT_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Beha Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__BEHA_DEFS = BEHAVIOR_DEF__BEHA_DEFS;

	/**
	 * The feature id for the '<em><b>Data Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__DATA_DEFS = BEHAVIOR_DEF__DATA_DEFS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__CONSTRAINTS = BEHAVIOR_DEF__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Delegations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__DELEGATIONS = BEHAVIOR_DEF__DELEGATIONS;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF__EQUATION = BEHAVIOR_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DEF_FEATURE_COUNT = BEHAVIOR_DEF_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ExecutableImpl <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ExecutableImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__NAME = ELEMENT_DEF__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__PROPERTIES = ELEMENT_DEF__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__SATISFIES = ELEMENT_DEF__SATISFIES;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__BODY = ELEMENT_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__RETURN_TYPE = ELEMENT_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE__PARAMS = ELEMENT_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = ELEMENT_DEF_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.StatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 53;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConditionalTestExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConditionalTestExpression()
	 * @generated
	 */
	int CONDITIONAL_TEST_EXPRESSION = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__OP1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__OP2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Op3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION__OP3 = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Test Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TEST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.BinaryExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 56;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OP1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OP2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ConditionalLogicalExpressionImpl <em>Conditional Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ConditionalLogicalExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConditionalLogicalExpression()
	 * @generated
	 */
	int CONDITIONAL_LOGICAL_EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LOGICAL_EXPRESSION__VALUE = BINARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LOGICAL_EXPRESSION__OP1 = BINARY_EXPRESSION__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LOGICAL_EXPRESSION__OP2 = BINARY_EXPRESSION__OP2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LOGICAL_EXPRESSION__OPERATOR = BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Conditional Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_LOGICAL_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.LogicalExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__VALUE = BINARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OP1 = BINARY_EXPRESSION__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OP2 = BINARY_EXPRESSION__OP2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OPERATOR = BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.RelationalExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__VALUE = BINARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP1 = BINARY_EXPRESSION__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OP2 = BINARY_EXPRESSION__OP2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ShiftExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getShiftExpression()
	 * @generated
	 */
	int SHIFT_EXPRESSION = 60;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__VALUE = BINARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OP1 = BINARY_EXPRESSION__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OP2 = BINARY_EXPRESSION__OP2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OPERATOR = BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ArithmeticExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 61;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__VALUE = BINARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OP1 = BINARY_EXPRESSION__OP1;

	/**
	 * The feature id for the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OP2 = BINARY_EXPRESSION__OP2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = BINARY_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.UnaryExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 62;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ClassificationExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getClassificationExpression()
	 * @generated
	 */
	int CLASSIFICATION_EXPRESSION = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__VALUE = UNARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__OP = UNARY_EXPRESSION__OP;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__OPERATOR = UNARY_EXPRESSION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION__TYPE_NAME = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.PrimaryExpression <em>Primary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.PrimaryExpression
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPrimaryExpression()
	 * @generated
	 */
	int PRIMARY_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Primary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.NameExpressionImpl <em>Name Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.NameExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNameExpression()
	 * @generated
	 */
	int NAME_EXPRESSION = 65;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__VALUE = PRIMARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__CITE = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.NonNameExpression <em>Non Name Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.NonNameExpression
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNonNameExpression()
	 * @generated
	 */
	int NON_NAME_EXPRESSION = 66;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NAME_EXPRESSION__VALUE = PRIMARY_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Non Name Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NAME_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.BooleanLiteralExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBooleanLiteralExpression()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXPRESSION = 67;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXPRESSION__VALUE = NON_NAME_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXPRESSION__IS_TRUE = NON_NAME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXPRESSION_FEATURE_COUNT = NON_NAME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.NaturalLiteralExpressionImpl <em>Natural Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.NaturalLiteralExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNaturalLiteralExpression()
	 * @generated
	 */
	int NATURAL_LITERAL_EXPRESSION = 68;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LITERAL_EXPRESSION__VALUE = NON_NAME_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Int value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LITERAL_EXPRESSION__INT_VALUE = NON_NAME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Natural Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LITERAL_EXPRESSION_FEATURE_COUNT = NON_NAME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.StringLiteralExpressionImpl <em>String Literal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.StringLiteralExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStringLiteralExpression()
	 * @generated
	 */
	int STRING_LITERAL_EXPRESSION = 69;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXPRESSION__VALUE = NON_NAME_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Str value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXPRESSION__STR_VALUE = NON_NAME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXPRESSION_FEATURE_COUNT = NON_NAME_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ThisExpressionImpl <em>This Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ThisExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getThisExpression()
	 * @generated
	 */
	int THIS_EXPRESSION = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION__VALUE = NON_NAME_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>This Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_EXPRESSION_FEATURE_COUNT = NON_NAME_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PropertyAccessExpressionImpl <em>Property Access Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PropertyAccessExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPropertyAccessExpression()
	 * @generated
	 */
	int PROPERTY_ACCESS_EXPRESSION = 71;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_EXPRESSION__VALUE = PRIMARY_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_EXPRESSION__TARGET = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_EXPRESSION__FIELD = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property Access Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_ACCESS_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.IncrementOrDecrementExpressionImpl <em>Increment Or Decrement Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.IncrementOrDecrementExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getIncrementOrDecrementExpression()
	 * @generated
	 */
	int INCREMENT_OR_DECREMENT_EXPRESSION = 72;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OR_DECREMENT_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OR_DECREMENT_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OR_DECREMENT_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Increment Or Decrement Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OR_DECREMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PrefixExpressionImpl <em>Prefix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PrefixExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPrefixExpression()
	 * @generated
	 */
	int PREFIX_EXPRESSION = 73;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__VALUE = INCREMENT_OR_DECREMENT_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__OPERAND = INCREMENT_OR_DECREMENT_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION__OPERATOR = INCREMENT_OR_DECREMENT_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Prefix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFIX_EXPRESSION_FEATURE_COUNT = INCREMENT_OR_DECREMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.PostfixExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPostfixExpression()
	 * @generated
	 */
	int POSTFIX_EXPRESSION = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__VALUE = INCREMENT_OR_DECREMENT_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERAND = INCREMENT_OR_DECREMENT_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION__OPERATOR = INCREMENT_OR_DECREMENT_EXPRESSION__OPERATOR;

	/**
	 * The number of structural features of the '<em>Postfix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTFIX_EXPRESSION_FEATURE_COUNT = INCREMENT_OR_DECREMENT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.BlockStatementImpl <em>Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.BlockStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBlockStatement()
	 * @generated
	 */
	int BLOCK_STATEMENT = 75;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.AssignmentExpressionImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAssignmentExpression()
	 * @generated
	 */
	int ASSIGNMENT_EXPRESSION = 76;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__VALUE = EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__V = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.LeftHandSideImpl <em>Left Hand Side</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.LeftHandSideImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getLeftHandSide()
	 * @generated
	 */
	int LEFT_HAND_SIDE = 77;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND_SIDE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND_SIDE__INDEX = 1;

	/**
	 * The number of structural features of the '<em>Left Hand Side</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_HAND_SIDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.VariableDeclImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getVariableDecl()
	 * @generated
	 */
	int VARIABLE_DECL = 78;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__PROPERTIES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__DEFINITION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL__VALUE = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Variable Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.IfBlockStatementImpl <em>If Block Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.IfBlockStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getIfBlockStatement()
	 * @generated
	 */
	int IF_BLOCK_STATEMENT = 79;

	/**
	 * The feature id for the '<em><b>Main if</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_STATEMENT__MAIN_IF = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paralel ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_STATEMENT__PARALEL_IFS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequential ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_STATEMENT__SEQUENTIAL_IFS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_STATEMENT__FINAL = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_STATEMENT__ELSE = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>If Block Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_BLOCK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.IfStatementImpl <em>If Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.IfStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getIfStatement()
	 * @generated
	 */
	int IF_STATEMENT = 80;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT__BODY = 1;

	/**
	 * The number of structural features of the '<em>If Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ElseStatementImpl <em>Else Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ElseStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getElseStatement()
	 * @generated
	 */
	int ELSE_STATEMENT = 81;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT__BODY = 0;

	/**
	 * The number of structural features of the '<em>Else Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ReturnStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getReturnStatement()
	 * @generated
	 */
	int RETURN_STATEMENT = 82;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT__VALUE = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.LoopStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 83;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.WhileStatementImpl <em>While Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.WhileStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getWhileStatement()
	 * @generated
	 */
	int WHILE_STATEMENT = 84;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>While Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DoStatementImpl <em>Do Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DoStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDoStatement()
	 * @generated
	 */
	int DO_STATEMENT = 85;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__CONDITION = LOOP_STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT__BODY = LOOP_STATEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Do Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_STATEMENT_FEATURE_COUNT = LOOP_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ForStatementImpl <em>For Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ForStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getForStatement()
	 * @generated
	 */
	int FOR_STATEMENT = 86;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__BODY = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT__CONTROL = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ForControlImpl <em>For Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ForControlImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getForControl()
	 * @generated
	 */
	int FOR_CONTROL = 87;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CONTROL__VARS = 0;

	/**
	 * The number of structural features of the '<em>For Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_CONTROL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ForVarImpl <em>For Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ForVarImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getForVar()
	 * @generated
	 */
	int FOR_VAR = 88;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_VAR__VAR = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_VAR__EXPR = 1;

	/**
	 * The number of structural features of the '<em>For Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_VAR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.SwitchStatementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getSwitchStatement()
	 * @generated
	 */
	int SWITCH_STATEMENT = 89;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__EXPR = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clauses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT__CLAUSES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.SwitchClauseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getSwitchClause()
	 * @generated
	 */
	int SWITCH_CLAUSE = 90;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CLAUSE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CLAUSE__BODY = 1;

	/**
	 * The number of structural features of the '<em>Switch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CLAUSE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.DefaultSwitchClauseImpl <em>Default Switch Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.DefaultSwitchClauseImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDefaultSwitchClause()
	 * @generated
	 */
	int DEFAULT_SWITCH_CLAUSE = 91;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SWITCH_CLAUSE__VALUE = SWITCH_CLAUSE__VALUE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SWITCH_CLAUSE__BODY = SWITCH_CLAUSE__BODY;

	/**
	 * The number of structural features of the '<em>Default Switch Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SWITCH_CLAUSE_FEATURE_COUNT = SWITCH_CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.RequirementImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 92;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROPERTIES = NAMED_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TEXT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_BY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__COMPOSITION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Satisfied By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED_BY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.AllocationTableImpl <em>Allocation Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.AllocationTableImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAllocationTable()
	 * @generated
	 */
	int ALLOCATION_TABLE = 93;

	/**
	 * The feature id for the '<em><b>Allocs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TABLE__ALLOCS = 0;

	/**
	 * The number of structural features of the '<em>Allocation Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_TABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.AllocationImpl <em>Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.AllocationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAllocation()
	 * @generated
	 */
	int ALLOCATION = 94;

	/**
	 * The number of structural features of the '<em>Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ExecutableAllocationImpl <em>Executable Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ExecutableAllocationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getExecutableAllocation()
	 * @generated
	 */
	int EXECUTABLE_ALLOCATION = 95;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ALLOCATION__SOURCE = ALLOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ALLOCATION__TARGET = ALLOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Executable Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_ALLOCATION_FEATURE_COUNT = ALLOCATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.impl.ActivityAllocationImpl <em>Activity Allocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.impl.ActivityAllocationImpl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityAllocation()
	 * @generated
	 */
	int ACTIVITY_ALLOCATION = 96;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ALLOCATION__SOURCE = ALLOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ALLOCATION__TARGET = ALLOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Activity Allocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ALLOCATION_FEATURE_COUNT = ALLOCATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.ConstraintKind <em>Constraint Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.ConstraintKind
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConstraintKind()
	 * @generated
	 */
	int CONSTRAINT_KIND = 97;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.FlowProperty <em>Flow Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.FlowProperty
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getFlowProperty()
	 * @generated
	 */
	int FLOW_PROPERTY = 98;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.ProtocolAlternativeType <em>Protocol Alternative Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.ProtocolAlternativeType
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolAlternativeType()
	 * @generated
	 */
	int PROTOCOL_ALTERNATIVE_TYPE = 99;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.ProtocolControl <em>Protocol Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.ProtocolControl
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolControl()
	 * @generated
	 */
	int PROTOCOL_CONTROL = 100;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.AffixOperator <em>Affix Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.AffixOperator
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAffixOperator()
	 * @generated
	 */
	int AFFIX_OPERATOR = 101;

	/**
	 * The meta object id for the '{@link sysADL_Sintax.AssignmentOperator <em>Assignment Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sysADL_Sintax.AssignmentOperator
	 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAssignmentOperator()
	 * @generated
	 */
	int ASSIGNMENT_OPERATOR = 102;


	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see sysADL_Sintax.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sysADL_Sintax.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.NamedElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see sysADL_Sintax.NamedElement#getProperties()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Properties();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see sysADL_Sintax.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.Package#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see sysADL_Sintax.Package#getImports()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Imports();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.Package#getElementImports <em>Element Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Imports</em>'.
	 * @see sysADL_Sintax.Package#getElementImports()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ElementImports();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Package#getArchitectures <em>Architectures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architectures</em>'.
	 * @see sysADL_Sintax.Package#getArchitectures()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Architectures();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see sysADL_Sintax.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Model#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see sysADL_Sintax.Model#getPackages()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Model#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see sysADL_Sintax.Model#getRequirements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Requirements();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.Model#getInvolvedElements <em>Involved Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Involved Elements</em>'.
	 * @see sysADL_Sintax.Model#getInvolvedElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_InvolvedElements();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.Model#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allocation</em>'.
	 * @see sysADL_Sintax.Model#getAllocation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Allocation();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ElementDef <em>Element Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Def</em>'.
	 * @see sysADL_Sintax.ElementDef
	 * @generated
	 */
	EClass getElementDef();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ElementDef#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Satisfies</em>'.
	 * @see sysADL_Sintax.ElementDef#getSatisfies()
	 * @see #getElementDef()
	 * @generated
	 */
	EReference getElementDef_Satisfies();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DataDef <em>Data Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Def</em>'.
	 * @see sysADL_Sintax.DataDef
	 * @generated
	 */
	EClass getDataDef();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConstraintUse <em>Constraint Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Use</em>'.
	 * @see sysADL_Sintax.ConstraintUse
	 * @generated
	 */
	EClass getConstraintUse();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ConstraintUse#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see sysADL_Sintax.ConstraintUse#getDefinition()
	 * @see #getConstraintUse()
	 * @generated
	 */
	EReference getConstraintUse_Definition();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.ConstraintUse#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see sysADL_Sintax.ConstraintUse#getKind()
	 * @see #getConstraintUse()
	 * @generated
	 */
	EAttribute getConstraintUse_Kind();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.ConstraintUse#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Params</em>'.
	 * @see sysADL_Sintax.ConstraintUse#getParams()
	 * @see #getConstraintUse()
	 * @generated
	 */
	EReference getConstraintUse_Params();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DataTypeDef <em>Data Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Def</em>'.
	 * @see sysADL_Sintax.DataTypeDef
	 * @generated
	 */
	EClass getDataTypeDef();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.DataTypeDef#getDataTypeAttributes <em>Data Type Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type Attributes</em>'.
	 * @see sysADL_Sintax.DataTypeDef#getDataTypeAttributes()
	 * @see #getDataTypeDef()
	 * @generated
	 */
	EReference getDataTypeDef_DataTypeAttributes();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.DataTypeDef#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see sysADL_Sintax.DataTypeDef#getSuperType()
	 * @see #getDataTypeDef()
	 * @generated
	 */
	EReference getDataTypeDef_SuperType();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DimensionDef <em>Dimension Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Def</em>'.
	 * @see sysADL_Sintax.DimensionDef
	 * @generated
	 */
	EClass getDimensionDef();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.TypeDef <em>Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Def</em>'.
	 * @see sysADL_Sintax.TypeDef
	 * @generated
	 */
	EClass getTypeDef();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.TypeUse <em>Type Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Use</em>'.
	 * @see sysADL_Sintax.TypeUse
	 * @generated
	 */
	EClass getTypeUse();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.TypeUse#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see sysADL_Sintax.TypeUse#getDefinition()
	 * @see #getTypeUse()
	 * @generated
	 */
	EReference getTypeUse_Definition();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.UnitDef <em>Unit Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Def</em>'.
	 * @see sysADL_Sintax.UnitDef
	 * @generated
	 */
	EClass getUnitDef();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.UnitDef#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see sysADL_Sintax.UnitDef#getDimension()
	 * @see #getUnitDef()
	 * @generated
	 */
	EReference getUnitDef_Dimension();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ValueTypeDef <em>Value Type Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type Def</em>'.
	 * @see sysADL_Sintax.ValueTypeDef
	 * @generated
	 */
	EClass getValueTypeDef();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ValueTypeDef#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Unit</em>'.
	 * @see sysADL_Sintax.ValueTypeDef#getUnit()
	 * @see #getValueTypeDef()
	 * @generated
	 */
	EReference getValueTypeDef_Unit();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ValueTypeDef#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dimension</em>'.
	 * @see sysADL_Sintax.ValueTypeDef#getDimension()
	 * @see #getValueTypeDef()
	 * @generated
	 */
	EReference getValueTypeDef_Dimension();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ValueTypeDef#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see sysADL_Sintax.ValueTypeDef#getSuperType()
	 * @see #getValueTypeDef()
	 * @generated
	 */
	EReference getValueTypeDef_SuperType();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see sysADL_Sintax.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see sysADL_Sintax.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.EnumLiteralValue <em>Enum Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal Value</em>'.
	 * @see sysADL_Sintax.EnumLiteralValue
	 * @generated
	 */
	EClass getEnumLiteralValue();

	/**
	 * Returns the meta object for the container reference '{@link sysADL_Sintax.EnumLiteralValue#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see sysADL_Sintax.EnumLiteralValue#getEnum()
	 * @see #getEnumLiteralValue()
	 * @generated
	 */
	EReference getEnumLiteralValue_Enum();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.EnumLiteralValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see sysADL_Sintax.EnumLiteralValue#getKey()
	 * @see #getEnumLiteralValue()
	 * @generated
	 */
	EAttribute getEnumLiteralValue_Key();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see sysADL_Sintax.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sysADL_Sintax.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sysADL_Sintax.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sysADL_Sintax.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Value();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.StructuralDef <em>Structural Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Def</em>'.
	 * @see sysADL_Sintax.StructuralDef
	 * @generated
	 */
	EClass getStructuralDef();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.StructuralDef#getArchDefs <em>Arch Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arch Defs</em>'.
	 * @see sysADL_Sintax.StructuralDef#getArchDefs()
	 * @see #getStructuralDef()
	 * @generated
	 */
	EReference getStructuralDef_ArchDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.StructuralDef#getDataDefs <em>Data Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Defs</em>'.
	 * @see sysADL_Sintax.StructuralDef#getDataDefs()
	 * @see #getStructuralDef()
	 * @generated
	 */
	EReference getStructuralDef_DataDefs();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.StructuralUse <em>Structural Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Use</em>'.
	 * @see sysADL_Sintax.StructuralUse
	 * @generated
	 */
	EClass getStructuralUse();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.StructuralUse#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see sysADL_Sintax.StructuralUse#getLowerBound()
	 * @see #getStructuralUse()
	 * @generated
	 */
	EAttribute getStructuralUse_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.StructuralUse#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see sysADL_Sintax.StructuralUse#getUpperBound()
	 * @see #getStructuralUse()
	 * @generated
	 */
	EAttribute getStructuralUse_UpperBound();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ComponentDef <em>Component Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Def</em>'.
	 * @see sysADL_Sintax.ComponentDef
	 * @generated
	 */
	EClass getComponentDef();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ComponentDef#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sysADL_Sintax.ComponentDef#getPorts()
	 * @see #getComponentDef()
	 * @generated
	 */
	EReference getComponentDef_Ports();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ComponentDef#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite</em>'.
	 * @see sysADL_Sintax.ComponentDef#getComposite()
	 * @see #getComponentDef()
	 * @generated
	 */
	EReference getComponentDef_Composite();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.ComponentDef#isIsBoundary <em>Is Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Boundary</em>'.
	 * @see sysADL_Sintax.ComponentDef#isIsBoundary()
	 * @see #getComponentDef()
	 * @generated
	 */
	EAttribute getComponentDef_IsBoundary();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ComponentUse <em>Component Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Use</em>'.
	 * @see sysADL_Sintax.ComponentUse
	 * @generated
	 */
	EClass getComponentUse();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ComponentUse#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see sysADL_Sintax.ComponentUse#getDefinition()
	 * @see #getComponentUse()
	 * @generated
	 */
	EReference getComponentUse_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ComponentUse#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sysADL_Sintax.ComponentUse#getPorts()
	 * @see #getComponentUse()
	 * @generated
	 */
	EReference getComponentUse_Ports();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConnectorDef <em>Connector Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Def</em>'.
	 * @see sysADL_Sintax.ConnectorDef
	 * @generated
	 */
	EClass getConnectorDef();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ConnectorDef#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sysADL_Sintax.ConnectorDef#getPorts()
	 * @see #getConnectorDef()
	 * @generated
	 */
	EReference getConnectorDef_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ConnectorDef#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see sysADL_Sintax.ConnectorDef#getFlows()
	 * @see #getConnectorDef()
	 * @generated
	 */
	EReference getConnectorDef_Flows();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ConnectorDef#getComposite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite</em>'.
	 * @see sysADL_Sintax.ConnectorDef#getComposite()
	 * @see #getConnectorDef()
	 * @generated
	 */
	EReference getConnectorDef_Composite();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConnectorUse <em>Connector Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Use</em>'.
	 * @see sysADL_Sintax.ConnectorUse
	 * @generated
	 */
	EClass getConnectorUse();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ConnectorUse#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see sysADL_Sintax.ConnectorUse#getDefinition()
	 * @see #getConnectorUse()
	 * @generated
	 */
	EReference getConnectorUse_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ConnectorUse#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sysADL_Sintax.ConnectorUse#getPorts()
	 * @see #getConnectorUse()
	 * @generated
	 */
	EReference getConnectorUse_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ConnectorUse#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see sysADL_Sintax.ConnectorUse#getBindings()
	 * @see #getConnectorUse()
	 * @generated
	 */
	EReference getConnectorUse_Bindings();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see sysADL_Sintax.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Configuration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see sysADL_Sintax.Configuration#getComponents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Configuration#getDelegations <em>Delegations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegations</em>'.
	 * @see sysADL_Sintax.Configuration#getDelegations()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Delegations();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Configuration#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see sysADL_Sintax.Configuration#getConnectors()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connectors();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Delegation <em>Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegation</em>'.
	 * @see sysADL_Sintax.Delegation
	 * @generated
	 */
	EClass getDelegation();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Delegation#getPortProxy <em>Port Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Proxy</em>'.
	 * @see sysADL_Sintax.Delegation#getPortProxy()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_PortProxy();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Delegation#getFullPort <em>Full Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Full Port</em>'.
	 * @see sysADL_Sintax.Delegation#getFullPort()
	 * @see #getDelegation()
	 * @generated
	 */
	EReference getDelegation_FullPort();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.CompositePortDef <em>Composite Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Port Def</em>'.
	 * @see sysADL_Sintax.CompositePortDef
	 * @generated
	 */
	EClass getCompositePortDef();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.CompositePortDef#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see sysADL_Sintax.CompositePortDef#getPorts()
	 * @see #getCompositePortDef()
	 * @generated
	 */
	EReference getCompositePortDef_Ports();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.SimplePortDef <em>Simple Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Port Def</em>'.
	 * @see sysADL_Sintax.SimplePortDef
	 * @generated
	 */
	EClass getSimplePortDef();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.SimplePortDef#getFlowProperties <em>Flow Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Properties</em>'.
	 * @see sysADL_Sintax.SimplePortDef#getFlowProperties()
	 * @see #getSimplePortDef()
	 * @generated
	 */
	EAttribute getSimplePortDef_FlowProperties();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.SimplePortDef#getFlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Type</em>'.
	 * @see sysADL_Sintax.SimplePortDef#getFlowType()
	 * @see #getSimplePortDef()
	 * @generated
	 */
	EReference getSimplePortDef_FlowType();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PortUse <em>Port Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Use</em>'.
	 * @see sysADL_Sintax.PortUse
	 * @generated
	 */
	EClass getPortUse();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.PortUse#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see sysADL_Sintax.PortUse#getDefinition()
	 * @see #getPortUse()
	 * @generated
	 */
	EReference getPortUse_Definition();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConnectorBinding <em>Connector Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector Binding</em>'.
	 * @see sysADL_Sintax.ConnectorBinding
	 * @generated
	 */
	EClass getConnectorBinding();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ConnectorBinding#getFirstPort <em>First Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Port</em>'.
	 * @see sysADL_Sintax.ConnectorBinding#getFirstPort()
	 * @see #getConnectorBinding()
	 * @generated
	 */
	EReference getConnectorBinding_FirstPort();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ConnectorBinding#getSecondPort <em>Second Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Port</em>'.
	 * @see sysADL_Sintax.ConnectorBinding#getSecondPort()
	 * @see #getConnectorBinding()
	 * @generated
	 */
	EReference getConnectorBinding_SecondPort();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see sysADL_Sintax.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Flow#getFlowType <em>Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow Type</em>'.
	 * @see sysADL_Sintax.Flow#getFlowType()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_FlowType();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Flow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sysADL_Sintax.Flow#getSource()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Flow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see sysADL_Sintax.Flow#getDestination()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Destination();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.BehaviorDef <em>Behavior Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Def</em>'.
	 * @see sysADL_Sintax.BehaviorDef
	 * @generated
	 */
	EClass getBehaviorDef();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BehaviorDef#getInParameters <em>In Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Parameters</em>'.
	 * @see sysADL_Sintax.BehaviorDef#getInParameters()
	 * @see #getBehaviorDef()
	 * @generated
	 */
	EReference getBehaviorDef_InParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BehaviorDef#getOutParameters <em>Out Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Parameters</em>'.
	 * @see sysADL_Sintax.BehaviorDef#getOutParameters()
	 * @see #getBehaviorDef()
	 * @generated
	 */
	EReference getBehaviorDef_OutParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BehaviorDef#getBehaDefs <em>Beha Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beha Defs</em>'.
	 * @see sysADL_Sintax.BehaviorDef#getBehaDefs()
	 * @see #getBehaviorDef()
	 * @generated
	 */
	EReference getBehaviorDef_BehaDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BehaviorDef#getDataDefs <em>Data Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Defs</em>'.
	 * @see sysADL_Sintax.BehaviorDef#getDataDefs()
	 * @see #getBehaviorDef()
	 * @generated
	 */
	EReference getBehaviorDef_DataDefs();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BehaviorDef#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see sysADL_Sintax.BehaviorDef#getConstraints()
	 * @see #getBehaviorDef()
	 * @generated
	 */
	EReference getBehaviorDef_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BehaviorDef#getDelegations <em>Delegations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delegations</em>'.
	 * @see sysADL_Sintax.BehaviorDef#getDelegations()
	 * @see #getBehaviorDef()
	 * @generated
	 */
	EReference getBehaviorDef_Delegations();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActionDef <em>Action Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Def</em>'.
	 * @see sysADL_Sintax.ActionDef
	 * @generated
	 */
	EClass getActionDef();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActionDef#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see sysADL_Sintax.ActionDef#getReturnType()
	 * @see #getActionDef()
	 * @generated
	 */
	EReference getActionDef_ReturnType();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActionUse <em>Action Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Use</em>'.
	 * @see sysADL_Sintax.ActionUse
	 * @generated
	 */
	EClass getActionUse();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActionUse#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see sysADL_Sintax.ActionUse#getDefinition()
	 * @see #getActionUse()
	 * @generated
	 */
	EReference getActionUse_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ActionUse#getPinIn <em>Pin In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin In</em>'.
	 * @see sysADL_Sintax.ActionUse#getPinIn()
	 * @see #getActionUse()
	 * @generated
	 */
	EReference getActionUse_PinIn();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityBody <em>Activity Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Body</em>'.
	 * @see sysADL_Sintax.ActivityBody
	 * @generated
	 */
	EClass getActivityBody();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ActivityBody#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see sysADL_Sintax.ActivityBody#getActions()
	 * @see #getActivityBody()
	 * @generated
	 */
	EReference getActivityBody_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ActivityBody#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see sysADL_Sintax.ActivityBody#getFlows()
	 * @see #getActivityBody()
	 * @generated
	 */
	EReference getActivityBody_Flows();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ActivityBody#getDataObjects <em>Data Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Objects</em>'.
	 * @see sysADL_Sintax.ActivityBody#getDataObjects()
	 * @see #getActivityBody()
	 * @generated
	 */
	EReference getActivityBody_DataObjects();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PortDef <em>Port Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Def</em>'.
	 * @see sysADL_Sintax.PortDef
	 * @generated
	 */
	EClass getPortDef();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityDef <em>Activity Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Def</em>'.
	 * @see sysADL_Sintax.ActivityDef
	 * @generated
	 */
	EClass getActivityDef();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ActivityDef#getAcbody <em>Acbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acbody</em>'.
	 * @see sysADL_Sintax.ActivityDef#getAcbody()
	 * @see #getActivityDef()
	 * @generated
	 */
	EReference getActivityDef_Acbody();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityRelation <em>Activity Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Relation</em>'.
	 * @see sysADL_Sintax.ActivityRelation
	 * @generated
	 */
	EClass getActivityRelation();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActivityRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sysADL_Sintax.ActivityRelation#getSource()
	 * @see #getActivityRelation()
	 * @generated
	 */
	EReference getActivityRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActivityRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sysADL_Sintax.ActivityRelation#getTarget()
	 * @see #getActivityRelation()
	 * @generated
	 */
	EReference getActivityRelation_Target();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ActivityRelation#getTargetSwitch <em>Target Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Switch</em>'.
	 * @see sysADL_Sintax.ActivityRelation#getTargetSwitch()
	 * @see #getActivityRelation()
	 * @generated
	 */
	EReference getActivityRelation_TargetSwitch();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityDelegation <em>Activity Delegation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Delegation</em>'.
	 * @see sysADL_Sintax.ActivityDelegation
	 * @generated
	 */
	EClass getActivityDelegation();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityFlow <em>Activity Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Flow</em>'.
	 * @see sysADL_Sintax.ActivityFlow
	 * @generated
	 */
	EClass getActivityFlow();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivitySwitch <em>Activity Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Switch</em>'.
	 * @see sysADL_Sintax.ActivitySwitch
	 * @generated
	 */
	EClass getActivitySwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ActivitySwitch#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see sysADL_Sintax.ActivitySwitch#getCases()
	 * @see #getActivitySwitch()
	 * @generated
	 */
	EReference getActivitySwitch_Cases();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivitySwitchCase <em>Activity Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Switch Case</em>'.
	 * @see sysADL_Sintax.ActivitySwitchCase
	 * @generated
	 */
	EClass getActivitySwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ActivitySwitchCase#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see sysADL_Sintax.ActivitySwitchCase#getCondition()
	 * @see #getActivitySwitchCase()
	 * @generated
	 */
	EReference getActivitySwitchCase_Condition();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActivitySwitchCase#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sysADL_Sintax.ActivitySwitchCase#getTarget()
	 * @see #getActivitySwitchCase()
	 * @generated
	 */
	EReference getActivitySwitchCase_Target();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityFlowable <em>Activity Flowable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Flowable</em>'.
	 * @see sysADL_Sintax.ActivityFlowable
	 * @generated
	 */
	EClass getActivityFlowable();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see sysADL_Sintax.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.Pin#isIsFlow <em>Is Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Flow</em>'.
	 * @see sysADL_Sintax.Pin#isIsFlow()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_IsFlow();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActionPin <em>Action Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Pin</em>'.
	 * @see sysADL_Sintax.ActionPin
	 * @generated
	 */
	EClass getActionPin();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActionPin#getPinName <em>Pin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pin Name</em>'.
	 * @see sysADL_Sintax.ActionPin#getPinName()
	 * @see #getActionPin()
	 * @generated
	 */
	EReference getActionPin_PinName();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.ActionPin#getPinValue <em>Pin Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pin Value</em>'.
	 * @see sysADL_Sintax.ActionPin#getPinValue()
	 * @see #getActionPin()
	 * @generated
	 */
	EReference getActionPin_PinValue();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see sysADL_Sintax.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.DataObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see sysADL_Sintax.DataObject#getType()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_Type();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.DataObject#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see sysADL_Sintax.DataObject#getInitValue()
	 * @see #getDataObject()
	 * @generated
	 */
	EReference getDataObject_InitValue();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see sysADL_Sintax.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DataBuffer <em>Data Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Buffer</em>'.
	 * @see sysADL_Sintax.DataBuffer
	 * @generated
	 */
	EClass getDataBuffer();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ProtocolBody <em>Protocol Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Body</em>'.
	 * @see sysADL_Sintax.ProtocolBody
	 * @generated
	 */
	EClass getProtocolBody();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.ProtocolBody#getRecControl <em>Rec Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rec Control</em>'.
	 * @see sysADL_Sintax.ProtocolBody#getRecControl()
	 * @see #getProtocolBody()
	 * @generated
	 */
	EAttribute getProtocolBody_RecControl();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ProtocolBody#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.ProtocolBody#getBody()
	 * @see #getProtocolBody()
	 * @generated
	 */
	EReference getProtocolBody_Body();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ProtocolBody#getRecursive <em>Recursive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recursive</em>'.
	 * @see sysADL_Sintax.ProtocolBody#getRecursive()
	 * @see #getProtocolBody()
	 * @generated
	 */
	EReference getProtocolBody_Recursive();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.ProtocolBody#getRecType <em>Rec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rec Type</em>'.
	 * @see sysADL_Sintax.ProtocolBody#getRecType()
	 * @see #getProtocolBody()
	 * @generated
	 */
	EAttribute getProtocolBody_RecType();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ProtocolBodyInternal <em>Protocol Body Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Body Internal</em>'.
	 * @see sysADL_Sintax.ProtocolBodyInternal
	 * @generated
	 */
	EClass getProtocolBodyInternal();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PredefinedAction <em>Predefined Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Action</em>'.
	 * @see sysADL_Sintax.PredefinedAction
	 * @generated
	 */
	EClass getPredefinedAction();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActionSend <em>Action Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Send</em>'.
	 * @see sysADL_Sintax.ActionSend
	 * @generated
	 */
	EClass getActionSend();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ActionSend#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see sysADL_Sintax.ActionSend#getExpr()
	 * @see #getActionSend()
	 * @generated
	 */
	EReference getActionSend_Expr();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActionSend#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow To</em>'.
	 * @see sysADL_Sintax.ActionSend#getFlowTo()
	 * @see #getActionSend()
	 * @generated
	 */
	EReference getActionSend_FlowTo();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActionReceive <em>Action Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Receive</em>'.
	 * @see sysADL_Sintax.ActionReceive
	 * @generated
	 */
	EClass getActionReceive();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ActionReceive#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see sysADL_Sintax.ActionReceive#getVar()
	 * @see #getActionReceive()
	 * @generated
	 */
	EReference getActionReceive_Var();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActionReceive#getFlowTo <em>Flow To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Flow To</em>'.
	 * @see sysADL_Sintax.ActionReceive#getFlowTo()
	 * @see #getActionReceive()
	 * @generated
	 */
	EReference getActionReceive_FlowTo();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see sysADL_Sintax.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.Protocol#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.Protocol#getBody()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Body();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConstraintDef <em>Constraint Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Def</em>'.
	 * @see sysADL_Sintax.ConstraintDef
	 * @generated
	 */
	EClass getConstraintDef();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ConstraintDef#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equation</em>'.
	 * @see sysADL_Sintax.ConstraintDef#getEquation()
	 * @see #getConstraintDef()
	 * @generated
	 */
	EReference getConstraintDef_Equation();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see sysADL_Sintax.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Executable#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see sysADL_Sintax.Executable#getBody()
	 * @see #getExecutable()
	 * @generated
	 */
	EReference getExecutable_Body();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.Executable#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see sysADL_Sintax.Executable#getReturnType()
	 * @see #getExecutable()
	 * @generated
	 */
	EReference getExecutable_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Executable#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see sysADL_Sintax.Executable#getParams()
	 * @see #getExecutable()
	 * @generated
	 */
	EReference getExecutable_Params();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see sysADL_Sintax.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see sysADL_Sintax.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.Expression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see sysADL_Sintax.Expression#getValue()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Value();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConditionalTestExpression <em>Conditional Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Test Expression</em>'.
	 * @see sysADL_Sintax.ConditionalTestExpression
	 * @generated
	 */
	EClass getConditionalTestExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ConditionalTestExpression#getOp1 <em>Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op1</em>'.
	 * @see sysADL_Sintax.ConditionalTestExpression#getOp1()
	 * @see #getConditionalTestExpression()
	 * @generated
	 */
	EReference getConditionalTestExpression_Op1();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ConditionalTestExpression#getOp2 <em>Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op2</em>'.
	 * @see sysADL_Sintax.ConditionalTestExpression#getOp2()
	 * @see #getConditionalTestExpression()
	 * @generated
	 */
	EReference getConditionalTestExpression_Op2();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ConditionalTestExpression#getOp3 <em>Op3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op3</em>'.
	 * @see sysADL_Sintax.ConditionalTestExpression#getOp3()
	 * @see #getConditionalTestExpression()
	 * @generated
	 */
	EReference getConditionalTestExpression_Op3();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see sysADL_Sintax.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.BinaryExpression#getOp1 <em>Op1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op1</em>'.
	 * @see sysADL_Sintax.BinaryExpression#getOp1()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Op1();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.BinaryExpression#getOp2 <em>Op2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op2</em>'.
	 * @see sysADL_Sintax.BinaryExpression#getOp2()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Op2();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sysADL_Sintax.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ConditionalLogicalExpression <em>Conditional Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Logical Expression</em>'.
	 * @see sysADL_Sintax.ConditionalLogicalExpression
	 * @generated
	 */
	EClass getConditionalLogicalExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see sysADL_Sintax.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see sysADL_Sintax.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Expression</em>'.
	 * @see sysADL_Sintax.ShiftExpression
	 * @generated
	 */
	EClass getShiftExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see sysADL_Sintax.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see sysADL_Sintax.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.UnaryExpression#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see sysADL_Sintax.UnaryExpression#getOp()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Op();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sysADL_Sintax.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ClassificationExpression <em>Classification Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification Expression</em>'.
	 * @see sysADL_Sintax.ClassificationExpression
	 * @generated
	 */
	EClass getClassificationExpression();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ClassificationExpression#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Name</em>'.
	 * @see sysADL_Sintax.ClassificationExpression#getTypeName()
	 * @see #getClassificationExpression()
	 * @generated
	 */
	EReference getClassificationExpression_TypeName();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Expression</em>'.
	 * @see sysADL_Sintax.PrimaryExpression
	 * @generated
	 */
	EClass getPrimaryExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Expression</em>'.
	 * @see sysADL_Sintax.NameExpression
	 * @generated
	 */
	EClass getNameExpression();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.NameExpression#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cite</em>'.
	 * @see sysADL_Sintax.NameExpression#getCite()
	 * @see #getNameExpression()
	 * @generated
	 */
	EReference getNameExpression_Cite();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.NonNameExpression <em>Non Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Name Expression</em>'.
	 * @see sysADL_Sintax.NonNameExpression
	 * @generated
	 */
	EClass getNonNameExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.BooleanLiteralExpression <em>Boolean Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Expression</em>'.
	 * @see sysADL_Sintax.BooleanLiteralExpression
	 * @generated
	 */
	EClass getBooleanLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.BooleanLiteralExpression#isIsTrue <em>Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is True</em>'.
	 * @see sysADL_Sintax.BooleanLiteralExpression#isIsTrue()
	 * @see #getBooleanLiteralExpression()
	 * @generated
	 */
	EAttribute getBooleanLiteralExpression_IsTrue();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.NaturalLiteralExpression <em>Natural Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Literal Expression</em>'.
	 * @see sysADL_Sintax.NaturalLiteralExpression
	 * @generated
	 */
	EClass getNaturalLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.NaturalLiteralExpression#getInt_value <em>Int value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int value</em>'.
	 * @see sysADL_Sintax.NaturalLiteralExpression#getInt_value()
	 * @see #getNaturalLiteralExpression()
	 * @generated
	 */
	EAttribute getNaturalLiteralExpression_Int_value();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.StringLiteralExpression <em>String Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Expression</em>'.
	 * @see sysADL_Sintax.StringLiteralExpression
	 * @generated
	 */
	EClass getStringLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.StringLiteralExpression#getStr_value <em>Str value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Str value</em>'.
	 * @see sysADL_Sintax.StringLiteralExpression#getStr_value()
	 * @see #getStringLiteralExpression()
	 * @generated
	 */
	EAttribute getStringLiteralExpression_Str_value();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ThisExpression <em>This Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This Expression</em>'.
	 * @see sysADL_Sintax.ThisExpression
	 * @generated
	 */
	EClass getThisExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PropertyAccessExpression <em>Property Access Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Access Expression</em>'.
	 * @see sysADL_Sintax.PropertyAccessExpression
	 * @generated
	 */
	EClass getPropertyAccessExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.PropertyAccessExpression#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see sysADL_Sintax.PropertyAccessExpression#getTarget()
	 * @see #getPropertyAccessExpression()
	 * @generated
	 */
	EReference getPropertyAccessExpression_Target();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.PropertyAccessExpression#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Field</em>'.
	 * @see sysADL_Sintax.PropertyAccessExpression#getField()
	 * @see #getPropertyAccessExpression()
	 * @generated
	 */
	EReference getPropertyAccessExpression_Field();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.IncrementOrDecrementExpression <em>Increment Or Decrement Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment Or Decrement Expression</em>'.
	 * @see sysADL_Sintax.IncrementOrDecrementExpression
	 * @generated
	 */
	EClass getIncrementOrDecrementExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.IncrementOrDecrementExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see sysADL_Sintax.IncrementOrDecrementExpression#getOperand()
	 * @see #getIncrementOrDecrementExpression()
	 * @generated
	 */
	EReference getIncrementOrDecrementExpression_Operand();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.IncrementOrDecrementExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sysADL_Sintax.IncrementOrDecrementExpression#getOperator()
	 * @see #getIncrementOrDecrementExpression()
	 * @generated
	 */
	EAttribute getIncrementOrDecrementExpression_Operator();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PrefixExpression <em>Prefix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prefix Expression</em>'.
	 * @see sysADL_Sintax.PrefixExpression
	 * @generated
	 */
	EClass getPrefixExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.PostfixExpression <em>Postfix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postfix Expression</em>'.
	 * @see sysADL_Sintax.PostfixExpression
	 * @generated
	 */
	EClass getPostfixExpression();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.BlockStatement <em>Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Statement</em>'.
	 * @see sysADL_Sintax.BlockStatement
	 * @generated
	 */
	EClass getBlockStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.BlockStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see sysADL_Sintax.BlockStatement#getBody()
	 * @see #getBlockStatement()
	 * @generated
	 */
	EReference getBlockStatement_Body();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Expression</em>'.
	 * @see sysADL_Sintax.AssignmentExpression
	 * @generated
	 */
	EClass getAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.AssignmentExpression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see sysADL_Sintax.AssignmentExpression#getLhs()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.AssignmentExpression#getV <em>V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>V</em>'.
	 * @see sysADL_Sintax.AssignmentExpression#getV()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_V();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.AssignmentExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see sysADL_Sintax.AssignmentExpression#getOperator()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EAttribute getAssignmentExpression_Operator();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.LeftHandSide <em>Left Hand Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Hand Side</em>'.
	 * @see sysADL_Sintax.LeftHandSide
	 * @generated
	 */
	EClass getLeftHandSide();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.LeftHandSide#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see sysADL_Sintax.LeftHandSide#getTarget()
	 * @see #getLeftHandSide()
	 * @generated
	 */
	EReference getLeftHandSide_Target();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.LeftHandSide#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see sysADL_Sintax.LeftHandSide#getIndex()
	 * @see #getLeftHandSide()
	 * @generated
	 */
	EAttribute getLeftHandSide_Index();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.VariableDecl <em>Variable Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Decl</em>'.
	 * @see sysADL_Sintax.VariableDecl
	 * @generated
	 */
	EClass getVariableDecl();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.VariableDecl#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sysADL_Sintax.VariableDecl#getValue()
	 * @see #getVariableDecl()
	 * @generated
	 */
	EReference getVariableDecl_Value();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.IfBlockStatement <em>If Block Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Block Statement</em>'.
	 * @see sysADL_Sintax.IfBlockStatement
	 * @generated
	 */
	EClass getIfBlockStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.IfBlockStatement#getMain_if <em>Main if</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main if</em>'.
	 * @see sysADL_Sintax.IfBlockStatement#getMain_if()
	 * @see #getIfBlockStatement()
	 * @generated
	 */
	EReference getIfBlockStatement_Main_if();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.IfBlockStatement#getParalel_ifs <em>Paralel ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paralel ifs</em>'.
	 * @see sysADL_Sintax.IfBlockStatement#getParalel_ifs()
	 * @see #getIfBlockStatement()
	 * @generated
	 */
	EReference getIfBlockStatement_Paralel_ifs();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.IfBlockStatement#getSequential_ifs <em>Sequential ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequential ifs</em>'.
	 * @see sysADL_Sintax.IfBlockStatement#getSequential_ifs()
	 * @see #getIfBlockStatement()
	 * @generated
	 */
	EReference getIfBlockStatement_Sequential_ifs();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.IfBlockStatement#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final</em>'.
	 * @see sysADL_Sintax.IfBlockStatement#getFinal()
	 * @see #getIfBlockStatement()
	 * @generated
	 */
	EReference getIfBlockStatement_Final();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.IfBlockStatement#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see sysADL_Sintax.IfBlockStatement#getElse()
	 * @see #getIfBlockStatement()
	 * @generated
	 */
	EReference getIfBlockStatement_Else();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.IfStatement <em>If Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Statement</em>'.
	 * @see sysADL_Sintax.IfStatement
	 * @generated
	 */
	EClass getIfStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.IfStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see sysADL_Sintax.IfStatement#getCondition()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.IfStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.IfStatement#getBody()
	 * @see #getIfStatement()
	 * @generated
	 */
	EReference getIfStatement_Body();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ElseStatement <em>Else Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Statement</em>'.
	 * @see sysADL_Sintax.ElseStatement
	 * @generated
	 */
	EClass getElseStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ElseStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.ElseStatement#getBody()
	 * @see #getElseStatement()
	 * @generated
	 */
	EReference getElseStatement_Body();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ReturnStatement <em>Return Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Statement</em>'.
	 * @see sysADL_Sintax.ReturnStatement
	 * @generated
	 */
	EClass getReturnStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ReturnStatement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sysADL_Sintax.ReturnStatement#getValue()
	 * @see #getReturnStatement()
	 * @generated
	 */
	EReference getReturnStatement_Value();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see sysADL_Sintax.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.LoopStatement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see sysADL_Sintax.LoopStatement#getCondition()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.LoopStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.LoopStatement#getBody()
	 * @see #getLoopStatement()
	 * @generated
	 */
	EReference getLoopStatement_Body();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.WhileStatement <em>While Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Statement</em>'.
	 * @see sysADL_Sintax.WhileStatement
	 * @generated
	 */
	EClass getWhileStatement();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DoStatement <em>Do Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do Statement</em>'.
	 * @see sysADL_Sintax.DoStatement
	 * @generated
	 */
	EClass getDoStatement();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ForStatement <em>For Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Statement</em>'.
	 * @see sysADL_Sintax.ForStatement
	 * @generated
	 */
	EClass getForStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ForStatement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.ForStatement#getBody()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Body();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ForStatement#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Control</em>'.
	 * @see sysADL_Sintax.ForStatement#getControl()
	 * @see #getForStatement()
	 * @generated
	 */
	EReference getForStatement_Control();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ForControl <em>For Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Control</em>'.
	 * @see sysADL_Sintax.ForControl
	 * @generated
	 */
	EClass getForControl();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.ForControl#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see sysADL_Sintax.ForControl#getVars()
	 * @see #getForControl()
	 * @generated
	 */
	EReference getForControl_Vars();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ForVar <em>For Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Var</em>'.
	 * @see sysADL_Sintax.ForVar
	 * @generated
	 */
	EClass getForVar();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ForVar#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see sysADL_Sintax.ForVar#getVar()
	 * @see #getForVar()
	 * @generated
	 */
	EReference getForVar_Var();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.ForVar#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see sysADL_Sintax.ForVar#getExpr()
	 * @see #getForVar()
	 * @generated
	 */
	EReference getForVar_Expr();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.SwitchStatement <em>Switch Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Statement</em>'.
	 * @see sysADL_Sintax.SwitchStatement
	 * @generated
	 */
	EClass getSwitchStatement();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.SwitchStatement#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see sysADL_Sintax.SwitchStatement#getExpr()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Expr();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.SwitchStatement#getClauses <em>Clauses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clauses</em>'.
	 * @see sysADL_Sintax.SwitchStatement#getClauses()
	 * @see #getSwitchStatement()
	 * @generated
	 */
	EReference getSwitchStatement_Clauses();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.SwitchClause <em>Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Clause</em>'.
	 * @see sysADL_Sintax.SwitchClause
	 * @generated
	 */
	EClass getSwitchClause();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.SwitchClause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see sysADL_Sintax.SwitchClause#getValue()
	 * @see #getSwitchClause()
	 * @generated
	 */
	EReference getSwitchClause_Value();

	/**
	 * Returns the meta object for the containment reference '{@link sysADL_Sintax.SwitchClause#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see sysADL_Sintax.SwitchClause#getBody()
	 * @see #getSwitchClause()
	 * @generated
	 */
	EReference getSwitchClause_Body();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.DefaultSwitchClause <em>Default Switch Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Switch Clause</em>'.
	 * @see sysADL_Sintax.DefaultSwitchClause
	 * @generated
	 */
	EClass getDefaultSwitchClause();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see sysADL_Sintax.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see sysADL_Sintax.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link sysADL_Sintax.Requirement#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see sysADL_Sintax.Requirement#getText()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Text();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.Requirement#getDerivedBy <em>Derived By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived By</em>'.
	 * @see sysADL_Sintax.Requirement#getDerivedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DerivedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.Requirement#getComposition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composition</em>'.
	 * @see sysADL_Sintax.Requirement#getComposition()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Composition();

	/**
	 * Returns the meta object for the reference list '{@link sysADL_Sintax.Requirement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Satisfied By</em>'.
	 * @see sysADL_Sintax.Requirement#getSatisfiedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SatisfiedBy();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.AllocationTable <em>Allocation Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Table</em>'.
	 * @see sysADL_Sintax.AllocationTable
	 * @generated
	 */
	EClass getAllocationTable();

	/**
	 * Returns the meta object for the containment reference list '{@link sysADL_Sintax.AllocationTable#getAllocs <em>Allocs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allocs</em>'.
	 * @see sysADL_Sintax.AllocationTable#getAllocs()
	 * @see #getAllocationTable()
	 * @generated
	 */
	EReference getAllocationTable_Allocs();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation</em>'.
	 * @see sysADL_Sintax.Allocation
	 * @generated
	 */
	EClass getAllocation();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ExecutableAllocation <em>Executable Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Allocation</em>'.
	 * @see sysADL_Sintax.ExecutableAllocation
	 * @generated
	 */
	EClass getExecutableAllocation();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ExecutableAllocation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sysADL_Sintax.ExecutableAllocation#getSource()
	 * @see #getExecutableAllocation()
	 * @generated
	 */
	EReference getExecutableAllocation_Source();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ExecutableAllocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sysADL_Sintax.ExecutableAllocation#getTarget()
	 * @see #getExecutableAllocation()
	 * @generated
	 */
	EReference getExecutableAllocation_Target();

	/**
	 * Returns the meta object for class '{@link sysADL_Sintax.ActivityAllocation <em>Activity Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Allocation</em>'.
	 * @see sysADL_Sintax.ActivityAllocation
	 * @generated
	 */
	EClass getActivityAllocation();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActivityAllocation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see sysADL_Sintax.ActivityAllocation#getSource()
	 * @see #getActivityAllocation()
	 * @generated
	 */
	EReference getActivityAllocation_Source();

	/**
	 * Returns the meta object for the reference '{@link sysADL_Sintax.ActivityAllocation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see sysADL_Sintax.ActivityAllocation#getTarget()
	 * @see #getActivityAllocation()
	 * @generated
	 */
	EReference getActivityAllocation_Target();

	/**
	 * Returns the meta object for enum '{@link sysADL_Sintax.ConstraintKind <em>Constraint Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Kind</em>'.
	 * @see sysADL_Sintax.ConstraintKind
	 * @generated
	 */
	EEnum getConstraintKind();

	/**
	 * Returns the meta object for enum '{@link sysADL_Sintax.FlowProperty <em>Flow Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flow Property</em>'.
	 * @see sysADL_Sintax.FlowProperty
	 * @generated
	 */
	EEnum getFlowProperty();

	/**
	 * Returns the meta object for enum '{@link sysADL_Sintax.ProtocolAlternativeType <em>Protocol Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Alternative Type</em>'.
	 * @see sysADL_Sintax.ProtocolAlternativeType
	 * @generated
	 */
	EEnum getProtocolAlternativeType();

	/**
	 * Returns the meta object for enum '{@link sysADL_Sintax.ProtocolControl <em>Protocol Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol Control</em>'.
	 * @see sysADL_Sintax.ProtocolControl
	 * @generated
	 */
	EEnum getProtocolControl();

	/**
	 * Returns the meta object for enum '{@link sysADL_Sintax.AffixOperator <em>Affix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Affix Operator</em>'.
	 * @see sysADL_Sintax.AffixOperator
	 * @generated
	 */
	EEnum getAffixOperator();

	/**
	 * Returns the meta object for enum '{@link sysADL_Sintax.AssignmentOperator <em>Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Assignment Operator</em>'.
	 * @see sysADL_Sintax.AssignmentOperator
	 * @generated
	 */
	EEnum getAssignmentOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SysADLFactory getSysADLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.NamedElementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__PROPERTIES = eINSTANCE.getNamedElement_Properties();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PackageImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__IMPORTS = eINSTANCE.getPackage_Imports();

		/**
		 * The meta object literal for the '<em><b>Element Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENT_IMPORTS = eINSTANCE.getPackage_ElementImports();

		/**
		 * The meta object literal for the '<em><b>Architectures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ARCHITECTURES = eINSTANCE.getPackage_Architectures();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ModelImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__REQUIREMENTS = eINSTANCE.getModel_Requirements();

		/**
		 * The meta object literal for the '<em><b>Involved Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INVOLVED_ELEMENTS = eINSTANCE.getModel_InvolvedElements();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ALLOCATION = eINSTANCE.getModel_Allocation();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ElementDefImpl <em>Element Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ElementDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getElementDef()
		 * @generated
		 */
		EClass ELEMENT_DEF = eINSTANCE.getElementDef();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEF__SATISFIES = eINSTANCE.getElementDef_Satisfies();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DataDefImpl <em>Data Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DataDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataDef()
		 * @generated
		 */
		EClass DATA_DEF = eINSTANCE.getDataDef();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConstraintUseImpl <em>Constraint Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConstraintUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConstraintUse()
		 * @generated
		 */
		EClass CONSTRAINT_USE = eINSTANCE.getConstraintUse();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_USE__DEFINITION = eINSTANCE.getConstraintUse_Definition();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_USE__KIND = eINSTANCE.getConstraintUse_Kind();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_USE__PARAMS = eINSTANCE.getConstraintUse_Params();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DataTypeDefImpl <em>Data Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DataTypeDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataTypeDef()
		 * @generated
		 */
		EClass DATA_TYPE_DEF = eINSTANCE.getDataTypeDef();

		/**
		 * The meta object literal for the '<em><b>Data Type Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES = eINSTANCE.getDataTypeDef_DataTypeAttributes();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_DEF__SUPER_TYPE = eINSTANCE.getDataTypeDef_SuperType();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DimensionDefImpl <em>Dimension Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DimensionDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDimensionDef()
		 * @generated
		 */
		EClass DIMENSION_DEF = eINSTANCE.getDimensionDef();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.TypeDefImpl <em>Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.TypeDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getTypeDef()
		 * @generated
		 */
		EClass TYPE_DEF = eINSTANCE.getTypeDef();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.TypeUseImpl <em>Type Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.TypeUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getTypeUse()
		 * @generated
		 */
		EClass TYPE_USE = eINSTANCE.getTypeUse();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_USE__DEFINITION = eINSTANCE.getTypeUse_Definition();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.UnitDefImpl <em>Unit Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.UnitDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getUnitDef()
		 * @generated
		 */
		EClass UNIT_DEF = eINSTANCE.getUnitDef();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_DEF__DIMENSION = eINSTANCE.getUnitDef_Dimension();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ValueTypeDefImpl <em>Value Type Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ValueTypeDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getValueTypeDef()
		 * @generated
		 */
		EClass VALUE_TYPE_DEF = eINSTANCE.getValueTypeDef();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE_DEF__UNIT = eINSTANCE.getValueTypeDef_Unit();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE_DEF__DIMENSION = eINSTANCE.getValueTypeDef_Dimension();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE_DEF__SUPER_TYPE = eINSTANCE.getValueTypeDef_SuperType();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.EnumerationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.EnumLiteralValueImpl <em>Enum Literal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.EnumLiteralValueImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getEnumLiteralValue()
		 * @generated
		 */
		EClass ENUM_LITERAL_VALUE = eINSTANCE.getEnumLiteralValue();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_LITERAL_VALUE__ENUM = eINSTANCE.getEnumLiteralValue_Enum();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_LITERAL_VALUE__KEY = eINSTANCE.getEnumLiteralValue_Key();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PropertyImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.StructuralDefImpl <em>Structural Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.StructuralDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStructuralDef()
		 * @generated
		 */
		EClass STRUCTURAL_DEF = eINSTANCE.getStructuralDef();

		/**
		 * The meta object literal for the '<em><b>Arch Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_DEF__ARCH_DEFS = eINSTANCE.getStructuralDef_ArchDefs();

		/**
		 * The meta object literal for the '<em><b>Data Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURAL_DEF__DATA_DEFS = eINSTANCE.getStructuralDef_DataDefs();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.StructuralUseImpl <em>Structural Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.StructuralUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStructuralUse()
		 * @generated
		 */
		EClass STRUCTURAL_USE = eINSTANCE.getStructuralUse();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_USE__LOWER_BOUND = eINSTANCE.getStructuralUse_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURAL_USE__UPPER_BOUND = eINSTANCE.getStructuralUse_UpperBound();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ComponentDefImpl <em>Component Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ComponentDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getComponentDef()
		 * @generated
		 */
		EClass COMPONENT_DEF = eINSTANCE.getComponentDef();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEF__PORTS = eINSTANCE.getComponentDef_Ports();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DEF__COMPOSITE = eINSTANCE.getComponentDef_Composite();

		/**
		 * The meta object literal for the '<em><b>Is Boundary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DEF__IS_BOUNDARY = eINSTANCE.getComponentDef_IsBoundary();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ComponentUseImpl <em>Component Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ComponentUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getComponentUse()
		 * @generated
		 */
		EClass COMPONENT_USE = eINSTANCE.getComponentUse();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_USE__DEFINITION = eINSTANCE.getComponentUse_Definition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_USE__PORTS = eINSTANCE.getComponentUse_Ports();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConnectorDefImpl <em>Connector Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConnectorDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConnectorDef()
		 * @generated
		 */
		EClass CONNECTOR_DEF = eINSTANCE.getConnectorDef();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DEF__PORTS = eINSTANCE.getConnectorDef_Ports();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DEF__FLOWS = eINSTANCE.getConnectorDef_Flows();

		/**
		 * The meta object literal for the '<em><b>Composite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_DEF__COMPOSITE = eINSTANCE.getConnectorDef_Composite();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConnectorUseImpl <em>Connector Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConnectorUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConnectorUse()
		 * @generated
		 */
		EClass CONNECTOR_USE = eINSTANCE.getConnectorUse();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_USE__DEFINITION = eINSTANCE.getConnectorUse_Definition();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_USE__PORTS = eINSTANCE.getConnectorUse_Ports();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_USE__BINDINGS = eINSTANCE.getConnectorUse_Bindings();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConfigurationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENTS = eINSTANCE.getConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Delegations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__DELEGATIONS = eINSTANCE.getConfiguration_Delegations();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTORS = eINSTANCE.getConfiguration_Connectors();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DelegationImpl <em>Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DelegationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDelegation()
		 * @generated
		 */
		EClass DELEGATION = eINSTANCE.getDelegation();

		/**
		 * The meta object literal for the '<em><b>Port Proxy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__PORT_PROXY = eINSTANCE.getDelegation_PortProxy();

		/**
		 * The meta object literal for the '<em><b>Full Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATION__FULL_PORT = eINSTANCE.getDelegation_FullPort();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.CompositePortDefImpl <em>Composite Port Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.CompositePortDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getCompositePortDef()
		 * @generated
		 */
		EClass COMPOSITE_PORT_DEF = eINSTANCE.getCompositePortDef();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PORT_DEF__PORTS = eINSTANCE.getCompositePortDef_Ports();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.SimplePortDefImpl <em>Simple Port Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.SimplePortDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getSimplePortDef()
		 * @generated
		 */
		EClass SIMPLE_PORT_DEF = eINSTANCE.getSimplePortDef();

		/**
		 * The meta object literal for the '<em><b>Flow Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PORT_DEF__FLOW_PROPERTIES = eINSTANCE.getSimplePortDef_FlowProperties();

		/**
		 * The meta object literal for the '<em><b>Flow Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PORT_DEF__FLOW_TYPE = eINSTANCE.getSimplePortDef_FlowType();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PortUseImpl <em>Port Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PortUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPortUse()
		 * @generated
		 */
		EClass PORT_USE = eINSTANCE.getPortUse();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_USE__DEFINITION = eINSTANCE.getPortUse_Definition();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConnectorBindingImpl <em>Connector Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConnectorBindingImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConnectorBinding()
		 * @generated
		 */
		EClass CONNECTOR_BINDING = eINSTANCE.getConnectorBinding();

		/**
		 * The meta object literal for the '<em><b>First Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_BINDING__FIRST_PORT = eINSTANCE.getConnectorBinding_FirstPort();

		/**
		 * The meta object literal for the '<em><b>Second Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_BINDING__SECOND_PORT = eINSTANCE.getConnectorBinding_SecondPort();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.FlowImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Flow Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__FLOW_TYPE = eINSTANCE.getFlow_FlowType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE = eINSTANCE.getFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DESTINATION = eINSTANCE.getFlow_Destination();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.BehaviorDef <em>Behavior Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.BehaviorDef
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBehaviorDef()
		 * @generated
		 */
		EClass BEHAVIOR_DEF = eINSTANCE.getBehaviorDef();

		/**
		 * The meta object literal for the '<em><b>In Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEF__IN_PARAMETERS = eINSTANCE.getBehaviorDef_InParameters();

		/**
		 * The meta object literal for the '<em><b>Out Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEF__OUT_PARAMETERS = eINSTANCE.getBehaviorDef_OutParameters();

		/**
		 * The meta object literal for the '<em><b>Beha Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEF__BEHA_DEFS = eINSTANCE.getBehaviorDef_BehaDefs();

		/**
		 * The meta object literal for the '<em><b>Data Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEF__DATA_DEFS = eINSTANCE.getBehaviorDef_DataDefs();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEF__CONSTRAINTS = eINSTANCE.getBehaviorDef_Constraints();

		/**
		 * The meta object literal for the '<em><b>Delegations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_DEF__DELEGATIONS = eINSTANCE.getBehaviorDef_Delegations();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActionDefImpl <em>Action Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActionDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionDef()
		 * @generated
		 */
		EClass ACTION_DEF = eINSTANCE.getActionDef();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DEF__RETURN_TYPE = eINSTANCE.getActionDef_ReturnType();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActionUseImpl <em>Action Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActionUseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionUse()
		 * @generated
		 */
		EClass ACTION_USE = eINSTANCE.getActionUse();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_USE__DEFINITION = eINSTANCE.getActionUse_Definition();

		/**
		 * The meta object literal for the '<em><b>Pin In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_USE__PIN_IN = eINSTANCE.getActionUse_PinIn();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivityBodyImpl <em>Activity Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivityBodyImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityBody()
		 * @generated
		 */
		EClass ACTIVITY_BODY = eINSTANCE.getActivityBody();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_BODY__ACTIONS = eINSTANCE.getActivityBody_Actions();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_BODY__FLOWS = eINSTANCE.getActivityBody_Flows();

		/**
		 * The meta object literal for the '<em><b>Data Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_BODY__DATA_OBJECTS = eINSTANCE.getActivityBody_DataObjects();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PortDefImpl <em>Port Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PortDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPortDef()
		 * @generated
		 */
		EClass PORT_DEF = eINSTANCE.getPortDef();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivityDefImpl <em>Activity Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivityDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityDef()
		 * @generated
		 */
		EClass ACTIVITY_DEF = eINSTANCE.getActivityDef();

		/**
		 * The meta object literal for the '<em><b>Acbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_DEF__ACBODY = eINSTANCE.getActivityDef_Acbody();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivityRelationImpl <em>Activity Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivityRelationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityRelation()
		 * @generated
		 */
		EClass ACTIVITY_RELATION = eINSTANCE.getActivityRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RELATION__SOURCE = eINSTANCE.getActivityRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RELATION__TARGET = eINSTANCE.getActivityRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Target Switch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_RELATION__TARGET_SWITCH = eINSTANCE.getActivityRelation_TargetSwitch();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivityDelegationImpl <em>Activity Delegation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivityDelegationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityDelegation()
		 * @generated
		 */
		EClass ACTIVITY_DELEGATION = eINSTANCE.getActivityDelegation();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivityFlowImpl <em>Activity Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivityFlowImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityFlow()
		 * @generated
		 */
		EClass ACTIVITY_FLOW = eINSTANCE.getActivityFlow();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivitySwitchImpl <em>Activity Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivitySwitchImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivitySwitch()
		 * @generated
		 */
		EClass ACTIVITY_SWITCH = eINSTANCE.getActivitySwitch();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_SWITCH__CASES = eINSTANCE.getActivitySwitch_Cases();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivitySwitchCaseImpl <em>Activity Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivitySwitchCaseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivitySwitchCase()
		 * @generated
		 */
		EClass ACTIVITY_SWITCH_CASE = eINSTANCE.getActivitySwitchCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_SWITCH_CASE__CONDITION = eINSTANCE.getActivitySwitchCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_SWITCH_CASE__TARGET = eINSTANCE.getActivitySwitchCase_Target();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.ActivityFlowable <em>Activity Flowable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.ActivityFlowable
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityFlowable()
		 * @generated
		 */
		EClass ACTIVITY_FLOWABLE = eINSTANCE.getActivityFlowable();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PinImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Is Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__IS_FLOW = eINSTANCE.getPin_IsFlow();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActionPinImpl <em>Action Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActionPinImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionPin()
		 * @generated
		 */
		EClass ACTION_PIN = eINSTANCE.getActionPin();

		/**
		 * The meta object literal for the '<em><b>Pin Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_PIN__PIN_NAME = eINSTANCE.getActionPin_PinName();

		/**
		 * The meta object literal for the '<em><b>Pin Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_PIN__PIN_VALUE = eINSTANCE.getActionPin_PinValue();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DataObjectImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__TYPE = eINSTANCE.getDataObject_Type();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OBJECT__INIT_VALUE = eINSTANCE.getDataObject_InitValue();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DataStoreImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DataBufferImpl <em>Data Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DataBufferImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDataBuffer()
		 * @generated
		 */
		EClass DATA_BUFFER = eINSTANCE.getDataBuffer();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ProtocolBodyImpl <em>Protocol Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ProtocolBodyImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolBody()
		 * @generated
		 */
		EClass PROTOCOL_BODY = eINSTANCE.getProtocolBody();

		/**
		 * The meta object literal for the '<em><b>Rec Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_BODY__REC_CONTROL = eINSTANCE.getProtocolBody_RecControl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_BODY__BODY = eINSTANCE.getProtocolBody_Body();

		/**
		 * The meta object literal for the '<em><b>Recursive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_BODY__RECURSIVE = eINSTANCE.getProtocolBody_Recursive();

		/**
		 * The meta object literal for the '<em><b>Rec Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_BODY__REC_TYPE = eINSTANCE.getProtocolBody_RecType();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.ProtocolBodyInternal <em>Protocol Body Internal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.ProtocolBodyInternal
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolBodyInternal()
		 * @generated
		 */
		EClass PROTOCOL_BODY_INTERNAL = eINSTANCE.getProtocolBodyInternal();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.PredefinedAction <em>Predefined Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.PredefinedAction
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPredefinedAction()
		 * @generated
		 */
		EClass PREDEFINED_ACTION = eINSTANCE.getPredefinedAction();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActionSendImpl <em>Action Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActionSendImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionSend()
		 * @generated
		 */
		EClass ACTION_SEND = eINSTANCE.getActionSend();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SEND__EXPR = eINSTANCE.getActionSend_Expr();

		/**
		 * The meta object literal for the '<em><b>Flow To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_SEND__FLOW_TO = eINSTANCE.getActionSend_FlowTo();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActionReceiveImpl <em>Action Receive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActionReceiveImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActionReceive()
		 * @generated
		 */
		EClass ACTION_RECEIVE = eINSTANCE.getActionReceive();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RECEIVE__VAR = eINSTANCE.getActionReceive_Var();

		/**
		 * The meta object literal for the '<em><b>Flow To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_RECEIVE__FLOW_TO = eINSTANCE.getActionReceive_FlowTo();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ProtocolImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__BODY = eINSTANCE.getProtocol_Body();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConstraintDefImpl <em>Constraint Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConstraintDefImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConstraintDef()
		 * @generated
		 */
		EClass CONSTRAINT_DEF = eINSTANCE.getConstraintDef();

		/**
		 * The meta object literal for the '<em><b>Equation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_DEF__EQUATION = eINSTANCE.getConstraintDef_Equation();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ExecutableImpl <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ExecutableImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE__BODY = eINSTANCE.getExecutable_Body();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE__RETURN_TYPE = eINSTANCE.getExecutable_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE__PARAMS = eINSTANCE.getExecutable_Params();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.StatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__VALUE = eINSTANCE.getExpression_Value();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConditionalTestExpressionImpl <em>Conditional Test Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConditionalTestExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConditionalTestExpression()
		 * @generated
		 */
		EClass CONDITIONAL_TEST_EXPRESSION = eINSTANCE.getConditionalTestExpression();

		/**
		 * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TEST_EXPRESSION__OP1 = eINSTANCE.getConditionalTestExpression_Op1();

		/**
		 * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TEST_EXPRESSION__OP2 = eINSTANCE.getConditionalTestExpression_Op2();

		/**
		 * The meta object literal for the '<em><b>Op3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_TEST_EXPRESSION__OP3 = eINSTANCE.getConditionalTestExpression_Op3();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.BinaryExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Op1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__OP1 = eINSTANCE.getBinaryExpression_Op1();

		/**
		 * The meta object literal for the '<em><b>Op2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__OP2 = eINSTANCE.getBinaryExpression_Op2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ConditionalLogicalExpressionImpl <em>Conditional Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ConditionalLogicalExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConditionalLogicalExpression()
		 * @generated
		 */
		EClass CONDITIONAL_LOGICAL_EXPRESSION = eINSTANCE.getConditionalLogicalExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.LogicalExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.RelationalExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ShiftExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getShiftExpression()
		 * @generated
		 */
		EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ArithmeticExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.UnaryExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OP = eINSTANCE.getUnaryExpression_Op();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ClassificationExpressionImpl <em>Classification Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ClassificationExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getClassificationExpression()
		 * @generated
		 */
		EClass CLASSIFICATION_EXPRESSION = eINSTANCE.getClassificationExpression();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFICATION_EXPRESSION__TYPE_NAME = eINSTANCE.getClassificationExpression_TypeName();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.PrimaryExpression <em>Primary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.PrimaryExpression
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPrimaryExpression()
		 * @generated
		 */
		EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.NameExpressionImpl <em>Name Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.NameExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNameExpression()
		 * @generated
		 */
		EClass NAME_EXPRESSION = eINSTANCE.getNameExpression();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_EXPRESSION__CITE = eINSTANCE.getNameExpression_Cite();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.NonNameExpression <em>Non Name Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.NonNameExpression
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNonNameExpression()
		 * @generated
		 */
		EClass NON_NAME_EXPRESSION = eINSTANCE.getNonNameExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.BooleanLiteralExpressionImpl <em>Boolean Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.BooleanLiteralExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBooleanLiteralExpression()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXPRESSION = eINSTANCE.getBooleanLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Is True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL_EXPRESSION__IS_TRUE = eINSTANCE.getBooleanLiteralExpression_IsTrue();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.NaturalLiteralExpressionImpl <em>Natural Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.NaturalLiteralExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getNaturalLiteralExpression()
		 * @generated
		 */
		EClass NATURAL_LITERAL_EXPRESSION = eINSTANCE.getNaturalLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Int value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATURAL_LITERAL_EXPRESSION__INT_VALUE = eINSTANCE.getNaturalLiteralExpression_Int_value();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.StringLiteralExpressionImpl <em>String Literal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.StringLiteralExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getStringLiteralExpression()
		 * @generated
		 */
		EClass STRING_LITERAL_EXPRESSION = eINSTANCE.getStringLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Str value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL_EXPRESSION__STR_VALUE = eINSTANCE.getStringLiteralExpression_Str_value();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ThisExpressionImpl <em>This Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ThisExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getThisExpression()
		 * @generated
		 */
		EClass THIS_EXPRESSION = eINSTANCE.getThisExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PropertyAccessExpressionImpl <em>Property Access Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PropertyAccessExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPropertyAccessExpression()
		 * @generated
		 */
		EClass PROPERTY_ACCESS_EXPRESSION = eINSTANCE.getPropertyAccessExpression();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ACCESS_EXPRESSION__TARGET = eINSTANCE.getPropertyAccessExpression_Target();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_ACCESS_EXPRESSION__FIELD = eINSTANCE.getPropertyAccessExpression_Field();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.IncrementOrDecrementExpressionImpl <em>Increment Or Decrement Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.IncrementOrDecrementExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getIncrementOrDecrementExpression()
		 * @generated
		 */
		EClass INCREMENT_OR_DECREMENT_EXPRESSION = eINSTANCE.getIncrementOrDecrementExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT_OR_DECREMENT_EXPRESSION__OPERAND = eINSTANCE.getIncrementOrDecrementExpression_Operand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT_OR_DECREMENT_EXPRESSION__OPERATOR = eINSTANCE.getIncrementOrDecrementExpression_Operator();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PrefixExpressionImpl <em>Prefix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PrefixExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPrefixExpression()
		 * @generated
		 */
		EClass PREFIX_EXPRESSION = eINSTANCE.getPrefixExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.PostfixExpressionImpl <em>Postfix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.PostfixExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getPostfixExpression()
		 * @generated
		 */
		EClass POSTFIX_EXPRESSION = eINSTANCE.getPostfixExpression();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.BlockStatementImpl <em>Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.BlockStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getBlockStatement()
		 * @generated
		 */
		EClass BLOCK_STATEMENT = eINSTANCE.getBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_STATEMENT__BODY = eINSTANCE.getBlockStatement_Body();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.AssignmentExpressionImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAssignmentExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__LHS = eINSTANCE.getAssignmentExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>V</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__V = eINSTANCE.getAssignmentExpression_V();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT_EXPRESSION__OPERATOR = eINSTANCE.getAssignmentExpression_Operator();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.LeftHandSideImpl <em>Left Hand Side</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.LeftHandSideImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getLeftHandSide()
		 * @generated
		 */
		EClass LEFT_HAND_SIDE = eINSTANCE.getLeftHandSide();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_HAND_SIDE__TARGET = eINSTANCE.getLeftHandSide_Target();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEFT_HAND_SIDE__INDEX = eINSTANCE.getLeftHandSide_Index();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.VariableDeclImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getVariableDecl()
		 * @generated
		 */
		EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DECL__VALUE = eINSTANCE.getVariableDecl_Value();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.IfBlockStatementImpl <em>If Block Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.IfBlockStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getIfBlockStatement()
		 * @generated
		 */
		EClass IF_BLOCK_STATEMENT = eINSTANCE.getIfBlockStatement();

		/**
		 * The meta object literal for the '<em><b>Main if</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK_STATEMENT__MAIN_IF = eINSTANCE.getIfBlockStatement_Main_if();

		/**
		 * The meta object literal for the '<em><b>Paralel ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK_STATEMENT__PARALEL_IFS = eINSTANCE.getIfBlockStatement_Paralel_ifs();

		/**
		 * The meta object literal for the '<em><b>Sequential ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK_STATEMENT__SEQUENTIAL_IFS = eINSTANCE.getIfBlockStatement_Sequential_ifs();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK_STATEMENT__FINAL = eINSTANCE.getIfBlockStatement_Final();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_BLOCK_STATEMENT__ELSE = eINSTANCE.getIfBlockStatement_Else();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.IfStatementImpl <em>If Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.IfStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getIfStatement()
		 * @generated
		 */
		EClass IF_STATEMENT = eINSTANCE.getIfStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STATEMENT__BODY = eINSTANCE.getIfStatement_Body();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ElseStatementImpl <em>Else Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ElseStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getElseStatement()
		 * @generated
		 */
		EClass ELSE_STATEMENT = eINSTANCE.getElseStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_STATEMENT__BODY = eINSTANCE.getElseStatement_Body();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ReturnStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getReturnStatement()
		 * @generated
		 */
		EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STATEMENT__VALUE = eINSTANCE.getReturnStatement_Value();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.LoopStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getLoopStatement()
		 * @generated
		 */
		EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__CONDITION = eINSTANCE.getLoopStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_STATEMENT__BODY = eINSTANCE.getLoopStatement_Body();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.WhileStatementImpl <em>While Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.WhileStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getWhileStatement()
		 * @generated
		 */
		EClass WHILE_STATEMENT = eINSTANCE.getWhileStatement();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DoStatementImpl <em>Do Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DoStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDoStatement()
		 * @generated
		 */
		EClass DO_STATEMENT = eINSTANCE.getDoStatement();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ForStatementImpl <em>For Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ForStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getForStatement()
		 * @generated
		 */
		EClass FOR_STATEMENT = eINSTANCE.getForStatement();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__BODY = eINSTANCE.getForStatement_Body();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STATEMENT__CONTROL = eINSTANCE.getForStatement_Control();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ForControlImpl <em>For Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ForControlImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getForControl()
		 * @generated
		 */
		EClass FOR_CONTROL = eINSTANCE.getForControl();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_CONTROL__VARS = eINSTANCE.getForControl_Vars();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ForVarImpl <em>For Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ForVarImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getForVar()
		 * @generated
		 */
		EClass FOR_VAR = eINSTANCE.getForVar();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_VAR__VAR = eINSTANCE.getForVar_Var();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_VAR__EXPR = eINSTANCE.getForVar_Expr();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.SwitchStatementImpl <em>Switch Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.SwitchStatementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getSwitchStatement()
		 * @generated
		 */
		EClass SWITCH_STATEMENT = eINSTANCE.getSwitchStatement();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__EXPR = eINSTANCE.getSwitchStatement_Expr();

		/**
		 * The meta object literal for the '<em><b>Clauses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATEMENT__CLAUSES = eINSTANCE.getSwitchStatement_Clauses();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.SwitchClauseImpl <em>Switch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.SwitchClauseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getSwitchClause()
		 * @generated
		 */
		EClass SWITCH_CLAUSE = eINSTANCE.getSwitchClause();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CLAUSE__VALUE = eINSTANCE.getSwitchClause_Value();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CLAUSE__BODY = eINSTANCE.getSwitchClause_Body();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.DefaultSwitchClauseImpl <em>Default Switch Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.DefaultSwitchClauseImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getDefaultSwitchClause()
		 * @generated
		 */
		EClass DEFAULT_SWITCH_CLAUSE = eINSTANCE.getDefaultSwitchClause();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.RequirementImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TEXT = eINSTANCE.getRequirement_Text();

		/**
		 * The meta object literal for the '<em><b>Derived By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DERIVED_BY = eINSTANCE.getRequirement_DerivedBy();

		/**
		 * The meta object literal for the '<em><b>Composition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__COMPOSITION = eINSTANCE.getRequirement_Composition();

		/**
		 * The meta object literal for the '<em><b>Satisfied By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SATISFIED_BY = eINSTANCE.getRequirement_SatisfiedBy();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.AllocationTableImpl <em>Allocation Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.AllocationTableImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAllocationTable()
		 * @generated
		 */
		EClass ALLOCATION_TABLE = eINSTANCE.getAllocationTable();

		/**
		 * The meta object literal for the '<em><b>Allocs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOCATION_TABLE__ALLOCS = eINSTANCE.getAllocationTable_Allocs();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.AllocationImpl <em>Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.AllocationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAllocation()
		 * @generated
		 */
		EClass ALLOCATION = eINSTANCE.getAllocation();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ExecutableAllocationImpl <em>Executable Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ExecutableAllocationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getExecutableAllocation()
		 * @generated
		 */
		EClass EXECUTABLE_ALLOCATION = eINSTANCE.getExecutableAllocation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ALLOCATION__SOURCE = eINSTANCE.getExecutableAllocation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTABLE_ALLOCATION__TARGET = eINSTANCE.getExecutableAllocation_Target();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.impl.ActivityAllocationImpl <em>Activity Allocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.impl.ActivityAllocationImpl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getActivityAllocation()
		 * @generated
		 */
		EClass ACTIVITY_ALLOCATION = eINSTANCE.getActivityAllocation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ALLOCATION__SOURCE = eINSTANCE.getActivityAllocation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ALLOCATION__TARGET = eINSTANCE.getActivityAllocation_Target();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.ConstraintKind <em>Constraint Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.ConstraintKind
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getConstraintKind()
		 * @generated
		 */
		EEnum CONSTRAINT_KIND = eINSTANCE.getConstraintKind();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.FlowProperty <em>Flow Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.FlowProperty
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getFlowProperty()
		 * @generated
		 */
		EEnum FLOW_PROPERTY = eINSTANCE.getFlowProperty();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.ProtocolAlternativeType <em>Protocol Alternative Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.ProtocolAlternativeType
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolAlternativeType()
		 * @generated
		 */
		EEnum PROTOCOL_ALTERNATIVE_TYPE = eINSTANCE.getProtocolAlternativeType();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.ProtocolControl <em>Protocol Control</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.ProtocolControl
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getProtocolControl()
		 * @generated
		 */
		EEnum PROTOCOL_CONTROL = eINSTANCE.getProtocolControl();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.AffixOperator <em>Affix Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.AffixOperator
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAffixOperator()
		 * @generated
		 */
		EEnum AFFIX_OPERATOR = eINSTANCE.getAffixOperator();

		/**
		 * The meta object literal for the '{@link sysADL_Sintax.AssignmentOperator <em>Assignment Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sysADL_Sintax.AssignmentOperator
		 * @see sysADL_Sintax.impl.SysADLPackageImpl#getAssignmentOperator()
		 * @generated
		 */
		EEnum ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentOperator();

	}

} //SysADLPackage
