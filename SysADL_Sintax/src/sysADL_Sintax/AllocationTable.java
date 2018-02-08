/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allocation Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.AllocationTable#getAllocs <em>Allocs</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getAllocationTable()
 * @model
 * @generated
 */
public interface AllocationTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Allocs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Allocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getAllocationTable_Allocs()
	 * @model type="sysADL_Sintax.Allocation" containment="true"
	 * @generated
	 */
	EList getAllocs();

} // AllocationTable
