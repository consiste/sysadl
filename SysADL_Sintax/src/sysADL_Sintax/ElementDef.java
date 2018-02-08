/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ElementDef#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getElementDef()
 * @model abstract="true"
 * @generated
 */
public interface ElementDef extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Satisfies</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link sysADL_Sintax.Requirement#getSatisfiedBy <em>Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfies</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfies</em>' reference.
	 * @see #isSetSatisfies()
	 * @see #unsetSatisfies()
	 * @see #setSatisfies(Requirement)
	 * @see sysADL_Sintax.SysADLPackage#getElementDef_Satisfies()
	 * @see sysADL_Sintax.Requirement#getSatisfiedBy
	 * @model opposite="satisfiedBy" unsettable="true" keys="name" transient="true" ordered="false"
	 * @generated
	 */
	Requirement getSatisfies();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ElementDef#getSatisfies <em>Satisfies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfies</em>' reference.
	 * @see #isSetSatisfies()
	 * @see #unsetSatisfies()
	 * @see #getSatisfies()
	 * @generated
	 */
	void setSatisfies(Requirement value);

	/**
	 * Unsets the value of the '{@link sysADL_Sintax.ElementDef#getSatisfies <em>Satisfies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSatisfies()
	 * @see #getSatisfies()
	 * @see #setSatisfies(Requirement)
	 * @generated
	 */
	void unsetSatisfies();

	/**
	 * Returns whether the value of the '{@link sysADL_Sintax.ElementDef#getSatisfies <em>Satisfies</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Satisfies</em>' reference is set.
	 * @see #unsetSatisfies()
	 * @see #getSatisfies()
	 * @see #setSatisfies(Requirement)
	 * @generated
	 */
	boolean isSetSatisfies();

} // ElementDef
