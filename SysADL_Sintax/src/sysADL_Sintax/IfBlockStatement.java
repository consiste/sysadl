/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.IfBlockStatement#getMain_if <em>Main if</em>}</li>
 *   <li>{@link sysADL_Sintax.IfBlockStatement#getParalel_ifs <em>Paralel ifs</em>}</li>
 *   <li>{@link sysADL_Sintax.IfBlockStatement#getSequential_ifs <em>Sequential ifs</em>}</li>
 *   <li>{@link sysADL_Sintax.IfBlockStatement#getFinal <em>Final</em>}</li>
 *   <li>{@link sysADL_Sintax.IfBlockStatement#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getIfBlockStatement()
 * @model
 * @generated
 */
public interface IfBlockStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Main if</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main if</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main if</em>' containment reference.
	 * @see #setMain_if(IfStatement)
	 * @see sysADL_Sintax.SysADLPackage#getIfBlockStatement_Main_if()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfStatement getMain_if();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.IfBlockStatement#getMain_if <em>Main if</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main if</em>' containment reference.
	 * @see #getMain_if()
	 * @generated
	 */
	void setMain_if(IfStatement value);

	/**
	 * Returns the value of the '<em><b>Paralel ifs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paralel ifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paralel ifs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getIfBlockStatement_Paralel_ifs()
	 * @model type="sysADL_Sintax.IfStatement" containment="true"
	 * @generated
	 */
	EList getParalel_ifs();

	/**
	 * Returns the value of the '<em><b>Sequential ifs</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.IfStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequential ifs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequential ifs</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getIfBlockStatement_Sequential_ifs()
	 * @model type="sysADL_Sintax.IfStatement" containment="true"
	 * @generated
	 */
	EList getSequential_ifs();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(ElseStatement)
	 * @see sysADL_Sintax.SysADLPackage#getIfBlockStatement_Final()
	 * @model containment="true"
	 * @generated
	 */
	ElseStatement getFinal();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.IfBlockStatement#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(ElseStatement value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(ElseStatement)
	 * @see sysADL_Sintax.SysADLPackage#getIfBlockStatement_Else()
	 * @model containment="true"
	 * @generated
	 */
	ElseStatement getElse();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.IfBlockStatement#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(ElseStatement value);

} // IfBlockStatement
