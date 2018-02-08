/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.BinaryExpression#getOp1 <em>Op1</em>}</li>
 *   <li>{@link sysADL_Sintax.BinaryExpression#getOp2 <em>Op2</em>}</li>
 *   <li>{@link sysADL_Sintax.BinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {

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
	 * @see sysADL_Sintax.SysADLPackage#getBinaryExpression_Op1()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOp1();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.BinaryExpression#getOp1 <em>Op1</em>}' containment reference.
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
	 * @see sysADL_Sintax.SysADLPackage#getBinaryExpression_Op2()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOp2();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.BinaryExpression#getOp2 <em>Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op2</em>' containment reference.
	 * @see #getOp2()
	 * @generated
	 */
	void setOp2(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see sysADL_Sintax.SysADLPackage#getBinaryExpression_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);
} // BinaryExpression
