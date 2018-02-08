/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ClassificationExpression#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getClassificationExpression()
 * @model
 * @generated
 */
public interface ClassificationExpression extends UnaryExpression {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' reference.
	 * @see #setTypeName(TypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getClassificationExpression_TypeName()
	 * @model
	 * @generated
	 */
	TypeDef getTypeName();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ClassificationExpression#getTypeName <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(TypeDef value);

} // ClassificationExpression
