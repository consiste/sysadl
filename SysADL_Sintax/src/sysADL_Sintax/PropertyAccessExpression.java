/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.PropertyAccessExpression#getTarget <em>Target</em>}</li>
 *   <li>{@link sysADL_Sintax.PropertyAccessExpression#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getPropertyAccessExpression()
 * @model
 * @generated
 */
public interface PropertyAccessExpression extends PrimaryExpression {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getPropertyAccessExpression_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.PropertyAccessExpression#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' reference.
	 * @see #setField(NamedElement)
	 * @see sysADL_Sintax.SysADLPackage#getPropertyAccessExpression_Field()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getField();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.PropertyAccessExpression#getField <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' reference.
	 * @see #getField()
	 * @generated
	 */
	void setField(NamedElement value);

} // PropertyAccessExpression
