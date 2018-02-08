/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ComponentDef#getPorts <em>Ports</em>}</li>
 *   <li>{@link sysADL_Sintax.ComponentDef#getComposite <em>Composite</em>}</li>
 *   <li>{@link sysADL_Sintax.ComponentDef#isIsBoundary <em>Is Boundary</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getComponentDef()
 * @model
 * @generated
 */
public interface ComponentDef extends StructuralDef {
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
	 * @see sysADL_Sintax.SysADLPackage#getComponentDef_Ports()
	 * @model type="sysADL_Sintax.PortUse" containment="true"
	 * @generated
	 */
	EList getPorts();

	/**
	 * Returns the value of the '<em><b>Composite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' containment reference.
	 * @see #setComposite(Configuration)
	 * @see sysADL_Sintax.SysADLPackage#getComponentDef_Composite()
	 * @model containment="true"
	 * @generated
	 */
	Configuration getComposite();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ComponentDef#getComposite <em>Composite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite</em>' containment reference.
	 * @see #getComposite()
	 * @generated
	 */
	void setComposite(Configuration value);

	/**
	 * Returns the value of the '<em><b>Is Boundary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Boundary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Boundary</em>' attribute.
	 * @see #setIsBoundary(boolean)
	 * @see sysADL_Sintax.SysADLPackage#getComponentDef_IsBoundary()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsBoundary();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ComponentDef#isIsBoundary <em>Is Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Boundary</em>' attribute.
	 * @see #isIsBoundary()
	 * @generated
	 */
	void setIsBoundary(boolean value);

} // ComponentDef
