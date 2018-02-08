/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.StringLiteralExpression#getStr_value <em>Str value</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getStringLiteralExpression()
 * @model
 * @generated
 */
public interface StringLiteralExpression extends NonNameExpression {
	/**
	 * Returns the value of the '<em><b>Str value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Str value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Str value</em>' attribute.
	 * @see #setStr_value(String)
	 * @see sysADL_Sintax.SysADLPackage#getStringLiteralExpression_Str_value()
	 * @model required="true"
	 * @generated
	 */
	String getStr_value();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.StringLiteralExpression#getStr_value <em>Str value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Str value</em>' attribute.
	 * @see #getStr_value()
	 * @generated
	 */
	void setStr_value(String value);

} // StringLiteralExpression
