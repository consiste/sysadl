/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.EnumLiteralValue#getEnum <em>Enum</em>}</li>
 *   <li>{@link sysADL_Sintax.EnumLiteralValue#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getEnumLiteralValue()
 * @model
 * @generated
 */
public interface EnumLiteralValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sysADL_Sintax.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' container reference.
	 * @see #setEnum(Enumeration)
	 * @see sysADL_Sintax.SysADLPackage#getEnumLiteralValue_Enum()
	 * @see sysADL_Sintax.Enumeration#getLiterals
	 * @model opposite="literals" required="true" transient="false"
	 * @generated
	 */
	Enumeration getEnum();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.EnumLiteralValue#getEnum <em>Enum</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' container reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see sysADL_Sintax.SysADLPackage#getEnumLiteralValue_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.EnumLiteralValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // EnumLiteralValue
