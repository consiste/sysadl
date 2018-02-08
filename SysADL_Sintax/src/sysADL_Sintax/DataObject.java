/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.DataObject#getType <em>Type</em>}</li>
 *   <li>{@link sysADL_Sintax.DataObject#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getDataObject()
 * @model abstract="true"
 * @generated
 */
public interface DataObject extends NamedElement, ActivityFlowable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getDataObject_Type()
	 * @model keys="name" required="true"
	 * @generated
	 */
	TypeDef getType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.DataObject#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDef value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value</em>' containment reference.
	 * @see #setInitValue(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getDataObject_InitValue()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitValue();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.DataObject#getInitValue <em>Init Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' containment reference.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(Expression value);

} // DataObject
