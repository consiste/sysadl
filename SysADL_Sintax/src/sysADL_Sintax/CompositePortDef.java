/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Port Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.CompositePortDef#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getCompositePortDef()
 * @model
 * @generated
 */
public interface CompositePortDef extends PortDef {
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
	 * @see sysADL_Sintax.SysADLPackage#getCompositePortDef_Ports()
	 * @model type="sysADL_Sintax.PortUse" containment="true" lower="2"
	 * @generated
	 */
	EList getPorts();

} // CompositePortDef
