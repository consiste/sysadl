/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.StructuralDef#getArchDefs <em>Arch Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.StructuralDef#getDataDefs <em>Data Defs</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getStructuralDef()
 * @model abstract="true"
 * @generated
 */
public interface StructuralDef extends ElementDef {
	/**
	 * Returns the value of the '<em><b>Arch Defs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.StructuralDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arch Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch Defs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getStructuralDef_ArchDefs()
	 * @model type="sysADL_Sintax.StructuralDef" containment="true"
	 * @generated
	 */
	EList getArchDefs();

	/**
	 * Returns the value of the '<em><b>Data Defs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.DataDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Defs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Defs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getStructuralDef_DataDefs()
	 * @model type="sysADL_Sintax.DataDef" containment="true"
	 * @generated
	 */
	EList getDataDefs();

} // StructuralDef
