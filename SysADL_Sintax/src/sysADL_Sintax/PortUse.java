/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.PortUse#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getPortUse()
 * @model
 * @generated
 */
public interface PortUse extends StructuralUse {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(PortDef)
	 * @see sysADL_Sintax.SysADLPackage#getPortUse_Definition()
	 * @model required="true"
	 * @generated
	 */
	PortDef getDefinition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.PortUse#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(PortDef value);

} // PortUse
