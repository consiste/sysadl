/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.NaturalLiteralExpression#getInt_value <em>Int value</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getNaturalLiteralExpression()
 * @model
 * @generated
 */
public interface NaturalLiteralExpression extends NonNameExpression {
	/**
	 * Returns the value of the '<em><b>Int value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int value</em>' attribute.
	 * @see #setInt_value(int)
	 * @see sysADL_Sintax.SysADLPackage#getNaturalLiteralExpression_Int_value()
	 * @model required="true"
	 * @generated
	 */
	int getInt_value();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.NaturalLiteralExpression#getInt_value <em>Int value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int value</em>' attribute.
	 * @see #getInt_value()
	 * @generated
	 */
	void setInt_value(int value);

} // NaturalLiteralExpression
