/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActionUse#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.ActionUse#getPinIn <em>Pin In</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActionUse()
 * @model
 * @generated
 */
public interface ActionUse extends NamedElement, ActivityFlowable {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ActionDef)
	 * @see sysADL_Sintax.SysADLPackage#getActionUse_Definition()
	 * @model
	 * @generated
	 */
	ActionDef getDefinition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionUse#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ActionDef value);

	/**
	 * Returns the value of the '<em><b>Pin In</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Pin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin In</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getActionUse_PinIn()
	 * @model type="sysADL_Sintax.Pin" containment="true"
	 * @generated
	 */
	EList getPinIn();

} // ActionUse
