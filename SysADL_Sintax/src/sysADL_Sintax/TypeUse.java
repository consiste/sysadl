/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.TypeUse#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getTypeUse()
 * @model
 * @generated
 */
public interface TypeUse extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(TypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getTypeUse_Definition()
	 * @model keys="name" required="true"
	 * @generated
	 */
	TypeDef getDefinition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.TypeUse#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(TypeDef value);

} // TypeUse
