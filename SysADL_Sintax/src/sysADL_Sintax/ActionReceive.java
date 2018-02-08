/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Receive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActionReceive#getVar <em>Var</em>}</li>
 *   <li>{@link sysADL_Sintax.ActionReceive#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActionReceive()
 * @model
 * @generated
 */
public interface ActionReceive extends PredefinedAction {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(TypeUse)
	 * @see sysADL_Sintax.SysADLPackage#getActionReceive_Var()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TypeUse getVar();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionReceive#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(TypeUse value);

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
	 * @see sysADL_Sintax.SysADLPackage#getActionReceive_FlowTo()
	 * @model keys="name" required="true"
	 * @generated
	 */
	Pin getFlowTo();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionReceive#getFlowTo <em>Flow To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow To</em>' reference.
	 * @see #getFlowTo()
	 * @generated
	 */
	void setFlowTo(Pin value);

} // ActionReceive
