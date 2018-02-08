/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Package#getImports <em>Imports</em>}</li>
 *   <li>{@link sysADL_Sintax.Package#getElementImports <em>Element Imports</em>}</li>
 *   <li>{@link sysADL_Sintax.Package#getArchitectures <em>Architectures</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getPackage_Imports()
	 * @model type="sysADL_Sintax.Package" keys="name"
	 * @generated
	 */
	EList getImports();

	/**
	 * Returns the value of the '<em><b>Element Imports</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.ElementDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Imports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Imports</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getPackage_ElementImports()
	 * @model type="sysADL_Sintax.ElementDef" keys="name"
	 * @generated
	 */
	EList getElementImports();

	/**
	 * Returns the value of the '<em><b>Architectures</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ElementDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectures</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getPackage_Architectures()
	 * @model type="sysADL_Sintax.ElementDef" containment="true" keys="name"
	 * @generated
	 */
	EList getArchitectures();

} // Package
