/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends TypeDef {
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.EnumLiteralValue}.
	 * It is bidirectional and its opposite is '{@link sysADL_Sintax.EnumLiteralValue#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getEnumeration_Literals()
	 * @see sysADL_Sintax.EnumLiteralValue#getEnum
	 * @model type="sysADL_Sintax.EnumLiteralValue" opposite="enum" containment="true"
	 * @generated
	 */
	EList getLiterals();

} // Enumeration
