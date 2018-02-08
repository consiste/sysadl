/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActivityAllocation#getSource <em>Source</em>}</li>
 *   <li>{@link sysADL_Sintax.ActivityAllocation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActivityAllocation()
 * @model
 * @generated
 */
public interface ActivityAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActivityDef)
	 * @see sysADL_Sintax.SysADLPackage#getActivityAllocation_Source()
	 * @model
	 * @generated
	 */
	ActivityDef getSource();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivityAllocation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActivityDef value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(StructuralDef)
	 * @see sysADL_Sintax.SysADLPackage#getActivityAllocation_Target()
	 * @model
	 * @generated
	 */
	StructuralDef getTarget();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivityAllocation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(StructuralDef value);

} // ActivityAllocation
