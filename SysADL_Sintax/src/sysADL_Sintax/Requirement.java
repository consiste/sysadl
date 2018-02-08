/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link sysADL_Sintax.Requirement#getText <em>Text</em>}</li>
 *   <li>{@link sysADL_Sintax.Requirement#getDerivedBy <em>Derived By</em>}</li>
 *   <li>{@link sysADL_Sintax.Requirement#getComposition <em>Composition</em>}</li>
 *   <li>{@link sysADL_Sintax.Requirement#getSatisfiedBy <em>Satisfied By</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(float)
	 * @see sysADL_Sintax.SysADLPackage#getRequirement_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	float getId();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(float value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see sysADL_Sintax.SysADLPackage#getRequirement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Requirement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Derived By</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived By</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getRequirement_DerivedBy()
	 * @model type="sysADL_Sintax.Requirement" keys="name"
	 * @generated
	 */
	EList getDerivedBy();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getRequirement_Composition()
	 * @model type="sysADL_Sintax.Requirement" containment="true" keys="name"
	 * @generated
	 */
	EList getComposition();

	/**
	 * Returns the value of the '<em><b>Satisfied By</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.ElementDef}.
	 * It is bidirectional and its opposite is '{@link sysADL_Sintax.ElementDef#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satisfied By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied By</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getRequirement_SatisfiedBy()
	 * @see sysADL_Sintax.ElementDef#getSatisfies
	 * @model type="sysADL_Sintax.ElementDef" opposite="satisfies" keys="name" transient="true"
	 * @generated
	 */
	EList getSatisfiedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isValid();

} // Requirement
