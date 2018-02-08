/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.NameExpression#getCite <em>Cite</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getNameExpression()
 * @model
 * @generated
 */
public interface NameExpression extends PrimaryExpression {
	/**
	 * Returns the value of the '<em><b>Cite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite</em>' reference.
	 * @see #setCite(NamedElement)
	 * @see sysADL_Sintax.SysADLPackage#getNameExpression_Cite()
	 * @model keys="name" required="true"
	 * @generated
	 */
	NamedElement getCite();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.NameExpression#getCite <em>Cite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite</em>' reference.
	 * @see #getCite()
	 * @generated
	 */
	void setCite(NamedElement value);

} // NameExpression
