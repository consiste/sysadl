/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ProtocolBody#getRecControl <em>Rec Control</em>}</li>
 *   <li>{@link sysADL_Sintax.ProtocolBody#getBody <em>Body</em>}</li>
 *   <li>{@link sysADL_Sintax.ProtocolBody#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link sysADL_Sintax.ProtocolBody#getRecType <em>Rec Type</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getProtocolBody()
 * @model
 * @generated
 */
public interface ProtocolBody extends ProtocolBodyInternal {
	/**
	 * Returns the value of the '<em><b>Rec Control</b></em>' attribute.
	 * The default value is <code>"several"</code>.
	 * The literals are from the enumeration {@link sysADL_Sintax.ProtocolControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rec Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rec Control</em>' attribute.
	 * @see sysADL_Sintax.ProtocolControl
	 * @see #setRecControl(ProtocolControl)
	 * @see sysADL_Sintax.SysADLPackage#getProtocolBody_RecControl()
	 * @model default="several"
	 * @generated
	 */
	ProtocolControl getRecControl();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ProtocolBody#getRecControl <em>Rec Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rec Control</em>' attribute.
	 * @see sysADL_Sintax.ProtocolControl
	 * @see #getRecControl()
	 * @generated
	 */
	void setRecControl(ProtocolControl value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(ProtocolBodyInternal)
	 * @see sysADL_Sintax.SysADLPackage#getProtocolBody_Body()
	 * @model containment="true"
	 * @generated
	 */
	ProtocolBodyInternal getBody();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ProtocolBody#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(ProtocolBodyInternal value);

	/**
	 * Returns the value of the '<em><b>Recursive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive</em>' containment reference.
	 * @see #setRecursive(ProtocolBody)
	 * @see sysADL_Sintax.SysADLPackage#getProtocolBody_Recursive()
	 * @model containment="true"
	 * @generated
	 */
	ProtocolBody getRecursive();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ProtocolBody#getRecursive <em>Recursive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive</em>' containment reference.
	 * @see #getRecursive()
	 * @generated
	 */
	void setRecursive(ProtocolBody value);

	/**
	 * Returns the value of the '<em><b>Rec Type</b></em>' attribute.
	 * The literals are from the enumeration {@link sysADL_Sintax.ProtocolAlternativeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rec Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rec Type</em>' attribute.
	 * @see sysADL_Sintax.ProtocolAlternativeType
	 * @see #setRecType(ProtocolAlternativeType)
	 * @see sysADL_Sintax.SysADLPackage#getProtocolBody_RecType()
	 * @model
	 * @generated
	 */
	ProtocolAlternativeType getRecType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ProtocolBody#getRecType <em>Rec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rec Type</em>' attribute.
	 * @see sysADL_Sintax.ProtocolAlternativeType
	 * @see #getRecType()
	 * @generated
	 */
	void setRecType(ProtocolAlternativeType value);

} // ProtocolBody
