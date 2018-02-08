/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ConnectorDef#getPorts <em>Ports</em>}</li>
 *   <li>{@link sysADL_Sintax.ConnectorDef#getFlows <em>Flows</em>}</li>
 *   <li>{@link sysADL_Sintax.ConnectorDef#getComposite <em>Composite</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConnectorDef()
 * @model
 * @generated
 */
public interface ConnectorDef extends StructuralDef {
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
	 * @see sysADL_Sintax.SysADLPackage#getConnectorDef_Ports()
	 * @model type="sysADL_Sintax.PortUse" containment="true" upper="2"
	 * @generated
	 */
	EList getPorts();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Flow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConnectorDef_Flows()
	 * @model type="sysADL_Sintax.Flow" containment="true"
	 * @generated
	 */
	EList getFlows();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' containment reference.
	 * @see #setComposite(Configuration)
	 * @see sysADL_Sintax.SysADLPackage#getConnectorDef_Composite()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getComposite();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConnectorDef#getComposite <em>Composite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' containment reference.
	 * @see #getComposite()
	 * @generated
	 */
	void setComposite(Configuration value);

} // ConnectorDef
