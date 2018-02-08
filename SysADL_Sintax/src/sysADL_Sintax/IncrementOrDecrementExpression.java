/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment Or Decrement Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.IncrementOrDecrementExpression#getOperand <em>Operand</em>}</li>
 *   <li>{@link sysADL_Sintax.IncrementOrDecrementExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getIncrementOrDecrementExpression()
 * @model abstract="true"
 * @generated
 */
public interface IncrementOrDecrementExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(LeftHandSide)
	 * @see sysADL_Sintax.SysADLPackage#getIncrementOrDecrementExpression_Operand()
	 * @model containment="true"
	 * @generated
	 */
	LeftHandSide getOperand();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.IncrementOrDecrementExpression#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(LeftHandSide value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link sysADL_Sintax.AffixOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see sysADL_Sintax.AffixOperator
	 * @see #setOperator(AffixOperator)
	 * @see sysADL_Sintax.SysADLPackage#getIncrementOrDecrementExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	AffixOperator getOperator();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.IncrementOrDecrementExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see sysADL_Sintax.AffixOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AffixOperator value);

} // IncrementOrDecrementExpression
