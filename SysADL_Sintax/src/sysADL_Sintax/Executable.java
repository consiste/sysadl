/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Executable#getBody <em>Body</em>}</li>
 *   <li>{@link sysADL_Sintax.Executable#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link sysADL_Sintax.Executable#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getExecutable()
 * @model
 * @generated
 */
public interface Executable extends ElementDef {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getExecutable_Body()
	 * @model type="sysADL_Sintax.Statement" containment="true" required="true"
	 * @generated
	 */
	EList getBody();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(TypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getExecutable_ReturnType()
	 * @model required="true"
	 * @generated
	 */
	TypeDef getReturnType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Executable#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeDef value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getExecutable_Params()
	 * @model type="sysADL_Sintax.TypeUse" containment="true"
	 * @generated
	 */
	EList getParams();

} // Executable
