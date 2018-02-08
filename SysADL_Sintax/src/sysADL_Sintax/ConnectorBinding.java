/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ConnectorBinding#getFirstPort <em>First Port</em>}</li>
 *   <li>{@link sysADL_Sintax.ConnectorBinding#getSecondPort <em>Second Port</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConnectorBinding()
 * @model
 * @generated
 */
public interface ConnectorBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>First Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Port</em>' reference.
	 * @see #setFirstPort(PortUse)
	 * @see sysADL_Sintax.SysADLPackage#getConnectorBinding_FirstPort()
	 * @model required="true"
	 * @generated
	 */
	PortUse getFirstPort();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConnectorBinding#getFirstPort <em>First Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Port</em>' reference.
	 * @see #getFirstPort()
	 * @generated
	 */
	void setFirstPort(PortUse value);

	/**
	 * Returns the value of the '<em><b>Second Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Port</em>' reference.
	 * @see #setSecondPort(PortUse)
	 * @see sysADL_Sintax.SysADLPackage#getConnectorBinding_SecondPort()
	 * @model required="true"
	 * @generated
	 */
	PortUse getSecondPort();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConnectorBinding#getSecondPort <em>Second Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Port</em>' reference.
	 * @see #getSecondPort()
	 * @generated
	 */
	void setSecondPort(PortUse value);

} // ConnectorBinding
