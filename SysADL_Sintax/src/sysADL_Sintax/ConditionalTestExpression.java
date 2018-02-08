/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Test Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ConditionalTestExpression#getOp1 <em>Op1</em>}</li>
 *   <li>{@link sysADL_Sintax.ConditionalTestExpression#getOp2 <em>Op2</em>}</li>
 *   <li>{@link sysADL_Sintax.ConditionalTestExpression#getOp3 <em>Op3</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConditionalTestExpression()
 * @model
 * @generated
 */
public interface ConditionalTestExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Op1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op1</em>' containment reference.
	 * @see #setOp1(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getConditionalTestExpression_Op1()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOp1();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConditionalTestExpression#getOp1 <em>Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op1</em>' containment reference.
	 * @see #getOp1()
	 * @generated
	 */
	void setOp1(Expression value);

	/**
	 * Returns the value of the '<em><b>Op2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op2</em>' containment reference.
	 * @see #setOp2(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getConditionalTestExpression_Op2()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOp2();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConditionalTestExpression#getOp2 <em>Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op2</em>' containment reference.
	 * @see #getOp2()
	 * @generated
	 */
	void setOp2(Expression value);

	/**
	 * Returns the value of the '<em><b>Op3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op3</em>' containment reference.
	 * @see #setOp3(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getConditionalTestExpression_Op3()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOp3();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConditionalTestExpression#getOp3 <em>Op3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op3</em>' containment reference.
	 * @see #getOp3()
	 * @generated
	 */
	void setOp3(Expression value);

} // ConditionalTestExpression
