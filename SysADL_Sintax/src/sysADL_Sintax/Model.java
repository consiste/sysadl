/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Model#getPackages <em>Packages</em>}</li>
 *   <li>{@link sysADL_Sintax.Model#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link sysADL_Sintax.Model#getInvolvedElements <em>Involved Elements</em>}</li>
 *   <li>{@link sysADL_Sintax.Model#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getModel_Packages()
	 * @model type="sysADL_Sintax.Package" containment="true" keys="name"
	 * @generated
	 */
	EList getPackages();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getModel_Requirements()
	 * @model type="sysADL_Sintax.Requirement" containment="true" keys="name"
	 * @generated
	 */
	EList getRequirements();

	/**
	 * Returns the value of the '<em><b>Involved Elements</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.ElementDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Elements</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getModel_InvolvedElements()
	 * @model type="sysADL_Sintax.ElementDef" keys="name" ordered="false"
	 * @generated
	 */
	EList getInvolvedElements();

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' containment reference.
	 * @see #setAllocation(AllocationTable)
	 * @see sysADL_Sintax.SysADLPackage#getModel_Allocation()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	AllocationTable getAllocation();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Model#getAllocation <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' containment reference.
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(AllocationTable value);

} // Model
