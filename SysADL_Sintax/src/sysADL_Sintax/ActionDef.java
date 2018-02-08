/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActionDef#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActionDef()
 * @model
 * @generated
 */
public interface ActionDef extends BehaviorDef, ActivityFlowable {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(TypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getActionDef_ReturnType()
	 * @model
	 * @generated
	 */
	TypeDef getReturnType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionDef#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeDef value);

} // ActionDef
