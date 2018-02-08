/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.DataTypeDef#getDataTypeAttributes <em>Data Type Attributes</em>}</li>
 *   <li>{@link sysADL_Sintax.DataTypeDef#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getDataTypeDef()
 * @model
 * @generated
 */
public interface DataTypeDef extends TypeDef {
	/**
	 * Returns the value of the '<em><b>Data Type Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Attributes</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getDataTypeDef_DataTypeAttributes()
	 * @model type="sysADL_Sintax.TypeUse" containment="true"
	 * @generated
	 */
	EList getDataTypeAttributes();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(DataTypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getDataTypeDef_SuperType()
	 * @model
	 * @generated
	 */
	DataTypeDef getSuperType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.DataTypeDef#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(DataTypeDef value);

} // DataTypeDef
