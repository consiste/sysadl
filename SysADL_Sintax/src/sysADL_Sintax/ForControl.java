/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ForControl#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getForControl()
 * @model
 * @generated
 */
public interface ForControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ForVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getForControl_Vars()
	 * @model type="sysADL_Sintax.ForVar" containment="true" required="true"
	 * @generated
	 */
	EList getVars();

} // ForControl
