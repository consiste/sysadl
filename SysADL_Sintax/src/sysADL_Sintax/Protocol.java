/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Protocol#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends BehaviorDef {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ProtocolBody)
	 * @see sysADL_Sintax.SysADLPackage#getProtocol_Body()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProtocolBody getBody();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Protocol#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ProtocolBody value);

} // Protocol
