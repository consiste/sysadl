/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActivitySwitchCase#getCondition <em>Condition</em>}</li>
 *   <li>{@link sysADL_Sintax.ActivitySwitchCase#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActivitySwitchCase()
 * @model
 * @generated
 */
public interface ActivitySwitchCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getActivitySwitchCase_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivitySwitchCase#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

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
	 * @see sysADL_Sintax.SysADLPackage#getActivitySwitchCase_Target()
	 * @model
	 * @generated
	 */
	ActivityFlowable getTarget();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivitySwitchCase#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityFlowable value);

} // ActivitySwitchCase
