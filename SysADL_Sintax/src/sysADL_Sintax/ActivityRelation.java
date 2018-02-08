/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActivityRelation#getSource <em>Source</em>}</li>
 *   <li>{@link sysADL_Sintax.ActivityRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link sysADL_Sintax.ActivityRelation#getTargetSwitch <em>Target Switch</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActivityRelation()
 * @model abstract="true"
 * @generated
 */
public interface ActivityRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityFlowable)
	 * @see sysADL_Sintax.SysADLPackage#getActivityRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	ActivityFlowable getSource();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivityRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityFlowable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActivityFlowable)
	 * @see sysADL_Sintax.SysADLPackage#getActivityRelation_Target()
	 * @model
	 * @generated
	 */
	ActivityFlowable getTarget();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivityRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityFlowable value);

	/**
	 * Returns the value of the '<em><b>Target Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Switch</em>' containment reference.
	 * @see #setTargetSwitch(ActivitySwitch)
	 * @see sysADL_Sintax.SysADLPackage#getActivityRelation_TargetSwitch()
	 * @model containment="true"
	 * @generated
	 */
	ActivitySwitch getTargetSwitch();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivityRelation#getTargetSwitch <em>Target Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Switch</em>' containment reference.
	 * @see #getTargetSwitch()
	 * @generated
	 */
	void setTargetSwitch(ActivitySwitch value);

} // ActivityRelation
