/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.BehaviorDef#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link sysADL_Sintax.BehaviorDef#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link sysADL_Sintax.BehaviorDef#getBehaDefs <em>Beha Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.BehaviorDef#getDataDefs <em>Data Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.BehaviorDef#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link sysADL_Sintax.BehaviorDef#getDelegations <em>Delegations</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface BehaviorDef extends ElementDef {
	/**
	 * Returns the value of the '<em><b>In Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Pin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Parameters</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef_InParameters()
	 * @model type="sysADL_Sintax.Pin" containment="true" ordered="false"
	 * @generated
	 */
	EList getInParameters();

	/**
	 * Returns the value of the '<em><b>Out Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Pin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Parameters</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef_OutParameters()
	 * @model type="sysADL_Sintax.Pin" containment="true" ordered="false"
	 * @generated
	 */
	EList getOutParameters();

	/**
	 * Returns the value of the '<em><b>Beha Defs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.BehaviorDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beha Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beha Defs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef_BehaDefs()
	 * @model type="sysADL_Sintax.BehaviorDef" containment="true"
	 * @generated
	 */
	EList getBehaDefs();

	/**
	 * Returns the value of the '<em><b>Data Defs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.DataDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Defs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef_DataDefs()
	 * @model type="sysADL_Sintax.DataDef" containment="true"
	 * @generated
	 */
	EList getDataDefs();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ConstraintUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef_Constraints()
	 * @model type="sysADL_Sintax.ConstraintUse" containment="true"
	 * @generated
	 */
	EList getConstraints();

	/**
	 * Returns the value of the '<em><b>Delegations</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ActivityDelegation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegations</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getBehaviorDef_Delegations()
	 * @model type="sysADL_Sintax.ActivityDelegation" containment="true"
	 * @generated
	 */
	EList getDelegations();

} // BehaviorDef
