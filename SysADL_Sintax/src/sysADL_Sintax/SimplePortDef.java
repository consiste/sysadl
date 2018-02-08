/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Port Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.SimplePortDef#getFlowProperties <em>Flow Properties</em>}</li>
 *   <li>{@link sysADL_Sintax.SimplePortDef#getFlowType <em>Flow Type</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getSimplePortDef()
 * @model
 * @generated
 */
public interface SimplePortDef extends PortDef {
	/**
	 * Returns the value of the '<em><b>Flow Properties</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link sysADL_Sintax.FlowProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Properties</em>' attribute.
	 * @see sysADL_Sintax.FlowProperty
	 * @see #setFlowProperties(FlowProperty)
	 * @see sysADL_Sintax.SysADLPackage#getSimplePortDef_FlowProperties()
	 * @model default="in" required="true"
	 * @generated
	 */
	FlowProperty getFlowProperties();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.SimplePortDef#getFlowProperties <em>Flow Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Properties</em>' attribute.
	 * @see sysADL_Sintax.FlowProperty
	 * @see #getFlowProperties()
	 * @generated
	 */
	void setFlowProperties(FlowProperty value);

	/**
	 * Returns the value of the '<em><b>Flow Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Type</em>' reference.
	 * @see #setFlowType(TypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getSimplePortDef_FlowType()
	 * @model required="true"
	 * @generated
	 */
	TypeDef getFlowType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.SimplePortDef#getFlowType <em>Flow Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Type</em>' reference.
	 * @see #getFlowType()
	 * @generated
	 */
	void setFlowType(TypeDef value);

} // SimplePortDef
