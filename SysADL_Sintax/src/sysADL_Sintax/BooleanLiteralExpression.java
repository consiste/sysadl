/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.BooleanLiteralExpression#isIsTrue <em>Is True</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getBooleanLiteralExpression()
 * @model
 * @generated
 */
public interface BooleanLiteralExpression extends NonNameExpression {
	/**
	 * Returns the value of the '<em><b>Is True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is True</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is True</em>' attribute.
	 * @see #setIsTrue(boolean)
	 * @see sysADL_Sintax.SysADLPackage#getBooleanLiteralExpression_IsTrue()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsTrue();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.BooleanLiteralExpression#isIsTrue <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is True</em>' attribute.
	 * @see #isIsTrue()
	 * @generated
	 */
	void setIsTrue(boolean value);

} // BooleanLiteralExpression
