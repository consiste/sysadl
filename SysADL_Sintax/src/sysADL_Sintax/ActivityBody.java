/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActivityBody#getActions <em>Actions</em>}</li>
 *   <li>{@link sysADL_Sintax.ActivityBody#getFlows <em>Flows</em>}</li>
 *   <li>{@link sysADL_Sintax.ActivityBody#getDataObjects <em>Data Objects</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActivityBody()
 * @model
 * @generated
 */
public interface ActivityBody extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ActionUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getActivityBody_Actions()
	 * @model type="sysADL_Sintax.ActionUse" containment="true" keys="name"
	 * @generated
	 */
	EList getActions();

	/**
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ActivityRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getActivityBody_Flows()
	 * @model type="sysADL_Sintax.ActivityRelation" containment="true"
	 * @generated
	 */
	EList getFlows();

	/**
	 * Returns the value of the '<em><b>Data Objects</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.DataObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Objects</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getActivityBody_DataObjects()
	 * @model type="sysADL_Sintax.DataObject" containment="true"
	 * @generated
	 */
	EList getDataObjects();

} // ActivityBody
