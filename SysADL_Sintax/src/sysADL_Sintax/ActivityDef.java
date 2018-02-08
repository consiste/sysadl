/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActivityDef#getAcbody <em>Acbody</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActivityDef()
 * @model
 * @generated
 */
public interface ActivityDef extends BehaviorDef {
	/**
	 * Returns the value of the '<em><b>Acbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acbody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acbody</em>' containment reference.
	 * @see #setAcbody(ActivityBody)
	 * @see sysADL_Sintax.SysADLPackage#getActivityDef_Acbody()
	 * @model containment="true"
	 * @generated
	 */
	ActivityBody getAcbody();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActivityDef#getAcbody <em>Acbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acbody</em>' containment reference.
	 * @see #getAcbody()
	 * @generated
	 */
	void setAcbody(ActivityBody value);

} // ActivityDef
