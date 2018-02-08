/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActivitySwitch#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActivitySwitch()
 * @model
 * @generated
 */
public interface ActivitySwitch extends ActivityFlowable {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.ActivitySwitchCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getActivitySwitch_Cases()
	 * @model type="sysADL_Sintax.ActivitySwitchCase" containment="true"
	 * @generated
	 */
	EList getCases();

} // ActivitySwitch
