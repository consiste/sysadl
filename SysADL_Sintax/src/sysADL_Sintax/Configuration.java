/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Configuration#getComponents <em>Components</em>}</li>
 *   <li>{@link sysADL_Sintax.Configuration#getDelegations <em>Delegations</em>}</li>
 *   <li>{@link sysADL_Sintax.Configuration#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ComponentUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConfiguration_Components()
	 * @model type="sysADL_Sintax.ComponentUse" containment="true"
	 * @generated
	 */
	EList getComponents();

	/**
	 * Returns the value of the '<em><b>Delegations</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Delegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegations</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConfiguration_Delegations()
	 * @model type="sysADL_Sintax.Delegation" containment="true"
	 * @generated
	 */
	EList getDelegations();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ConnectorUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConfiguration_Connectors()
	 * @model type="sysADL_Sintax.ConnectorUse" containment="true"
	 * @generated
	 */
	EList getConnectors();

} // Configuration
