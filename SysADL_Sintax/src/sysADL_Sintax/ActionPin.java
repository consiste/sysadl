/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ActionPin#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link sysADL_Sintax.ActionPin#getPinValue <em>Pin Value</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getActionPin()
 * @model
 * @generated
 */
public interface ActionPin extends Pin {
	/**
	 * Returns the value of the '<em><b>Pin Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Name</em>' reference.
	 * @see #setPinName(TypeUse)
	 * @see sysADL_Sintax.SysADLPackage#getActionPin_PinName()
	 * @model required="true"
	 * @generated
	 */
	TypeUse getPinName();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ActionPin#getPinName <em>Pin Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin Name</em>' reference.
	 * @see #getPinName()
	 * @generated
	 */
	void setPinName(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Pin Value</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin Value</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin Value</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getActionPin_PinValue()
	 * @model type="sysADL_Sintax.Statement"
	 * @generated
	 */
	EList getPinValue();

} // ActionPin
