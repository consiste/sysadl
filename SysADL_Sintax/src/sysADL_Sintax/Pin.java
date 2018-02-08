/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Pin#isIsFlow <em>Is Flow</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getPin()
 * @model
 * @generated
 */
public interface Pin extends TypeUse, ActivityFlowable {
	/**
	 * Returns the value of the '<em><b>Is Flow</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Flow</em>' attribute.
	 * @see #setIsFlow(boolean)
	 * @see sysADL_Sintax.SysADLPackage#getPin_IsFlow()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsFlow();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Pin#isIsFlow <em>Is Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Flow</em>' attribute.
	 * @see #isIsFlow()
	 * @generated
	 */
	void setIsFlow(boolean value);

} // Pin
