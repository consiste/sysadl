/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.Flow#getFlowType <em>Flow Type</em>}</li>
 *   <li>{@link sysADL_Sintax.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link sysADL_Sintax.Flow#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends EObject {
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
	 * @see sysADL_Sintax.SysADLPackage#getFlow_FlowType()
	 * @model required="true"
	 * @generated
	 */
	TypeDef getFlowType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Flow#getFlowType <em>Flow Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Type</em>' reference.
	 * @see #getFlowType()
	 * @generated
	 */
	void setFlowType(TypeDef value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PortUse)
	 * @see sysADL_Sintax.SysADLPackage#getFlow_Source()
	 * @model keys="name" required="true"
	 * @generated
	 */
	PortUse getSource();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PortUse value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(PortUse)
	 * @see sysADL_Sintax.SysADLPackage#getFlow_Destination()
	 * @model keys="name" required="true"
	 * @generated
	 */
	PortUse getDestination();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.Flow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(PortUse value);

} // Flow
