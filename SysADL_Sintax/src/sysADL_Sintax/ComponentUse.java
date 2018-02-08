/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ComponentUse#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.ComponentUse#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getComponentUse()
 * @model
 * @generated
 */
public interface ComponentUse extends StructuralUse {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ComponentDef)
	 * @see sysADL_Sintax.SysADLPackage#getComponentUse_Definition()
	 * @model required="true"
	 * @generated
	 */
	ComponentDef getDefinition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ComponentUse#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ComponentDef value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.PortUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getComponentUse_Ports()
	 * @model type="sysADL_Sintax.PortUse" containment="true"
	 * @generated
	 */
	EList getPorts();

} // ComponentUse
