/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Delegation#getPortProxy <em>Port Proxy</em>}</li>
 *   <li>{@link sysADL_Sintax.Delegation#getFullPort <em>Full Port</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getDelegation()
 * @model
 * @generated
 */
public interface Delegation extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Proxy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Proxy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Proxy</em>' reference.
	 * @see #setPortProxy(PortUse)
	 * @see sysADL_Sintax.SysADLPackage#getDelegation_PortProxy()
	 * @model required="true"
	 * @generated
	 */
	PortUse getPortProxy();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Delegation#getPortProxy <em>Port Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Proxy</em>' reference.
	 * @see #getPortProxy()
	 * @generated
	 */
	void setPortProxy(PortUse value);

	/**
	 * Returns the value of the '<em><b>Full Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Port</em>' reference.
	 * @see #setFullPort(PortUse)
	 * @see sysADL_Sintax.SysADLPackage#getDelegation_FullPort()
	 * @model required="true"
	 * @generated
	 */
	PortUse getFullPort();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Delegation#getFullPort <em>Full Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Port</em>' reference.
	 * @see #getFullPort()
	 * @generated
	 */
	void setFullPort(PortUse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkCompatibility();

} // Delegation
