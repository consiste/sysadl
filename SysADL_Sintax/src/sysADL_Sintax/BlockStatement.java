/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.BlockStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getBlockStatement()
 * @model
 * @generated
 */
public interface BlockStatement extends Statement {
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
	 * @see sysADL_Sintax.SysADLPackage#getBlockStatement_Body()
	 * @model type="sysADL_Sintax.Statement" containment="true"
	 * @generated
	 */
	EList getBody();

} // BlockStatement
