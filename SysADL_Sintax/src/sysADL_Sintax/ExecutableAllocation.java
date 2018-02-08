/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ExecutableAllocation#getSource <em>Source</em>}</li>
 *   <li>{@link sysADL_Sintax.ExecutableAllocation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getExecutableAllocation()
 * @model
 * @generated
 */
public interface ExecutableAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Executable)
	 * @see sysADL_Sintax.SysADLPackage#getExecutableAllocation_Source()
	 * @model
	 * @generated
	 */
	Executable getSource();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ExecutableAllocation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Executable value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActionDef)
	 * @see sysADL_Sintax.SysADLPackage#getExecutableAllocation_Target()
	 * @model
	 * @generated
	 */
	ActionDef getTarget();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ExecutableAllocation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActionDef value);

} // ExecutableAllocation
