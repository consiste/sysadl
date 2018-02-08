/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Send</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActionSend#getExpr <em>Expr</em>}</li>
 *   <li>{@link sysADL_Sintax.ActionSend#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActionSend()
 * @model
 * @generated
 */
public interface ActionSend extends PredefinedAction {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getActionSend_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionSend#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Flow To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow To</em>' reference.
	 * @see #setFlowTo(Pin)
	 * @see sysADL_Sintax.SysADLPackage#getActionSend_FlowTo()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Pin getFlowTo();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionSend#getFlowTo <em>Flow To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow To</em>' reference.
	 * @see #getFlowTo()
	 * @generated
	 */
	void setFlowTo(Pin value);

} // ActionSend
