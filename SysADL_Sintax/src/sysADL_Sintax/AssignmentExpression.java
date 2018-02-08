/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.AssignmentExpression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link sysADL_Sintax.AssignmentExpression#getV <em>V</em>}</li>
 *   <li>{@link sysADL_Sintax.AssignmentExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getAssignmentExpression()
 * @model
 * @generated
 */
public interface AssignmentExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(LeftHandSide)
	 * @see sysADL_Sintax.SysADLPackage#getAssignmentExpression_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LeftHandSide getLhs();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.AssignmentExpression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(LeftHandSide value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' containment reference.
	 * @see #setV(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getAssignmentExpression_V()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getV();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.AssignmentExpression#getV <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' containment reference.
	 * @see #getV()
	 * @generated
	 */
	void setV(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"equal"</code>.
	 * The literals are from the enumeration {@link sysADL_Sintax.AssignmentOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see sysADL_Sintax.AssignmentOperator
	 * @see #setOperator(AssignmentOperator)
	 * @see sysADL_Sintax.SysADLPackage#getAssignmentExpression_Operator()
	 * @model default="equal" required="true"
	 * @generated
	 */
	AssignmentOperator getOperator();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.AssignmentExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see sysADL_Sintax.AssignmentOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AssignmentOperator value);

} // AssignmentExpression
