/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ConnectorUse#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.ConnectorUse#getPorts <em>Ports</em>}</li>
 *   <li>{@link sysADL_Sintax.ConnectorUse#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConnectorUse()
 * @model
 * @generated
 */
public interface ConnectorUse extends StructuralUse {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ConnectorDef)
	 * @see sysADL_Sintax.SysADLPackage#getConnectorUse_Definition()
	 * @model required="true"
	 * @generated
	 */
	ConnectorDef getDefinition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConnectorUse#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ConnectorDef value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.PortUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConnectorUse_Ports()
	 * @model type="sysADL_Sintax.PortUse" containment="true"
	 * @generated
	 */
	EList getPorts();

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ConnectorBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConnectorUse_Bindings()
	 * @model type="sysADL_Sintax.ConnectorBinding" containment="true"
	 * @generated
	 */
	EList getBindings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void allPorts();

} // ConnectorUse
