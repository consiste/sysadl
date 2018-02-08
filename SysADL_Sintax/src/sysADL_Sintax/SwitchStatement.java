/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.SwitchStatement#getExpr <em>Expr</em>}</li>
 *   <li>{@link sysADL_Sintax.SwitchStatement#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getSwitchStatement()
 * @model
 * @generated
 */
public interface SwitchStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getSwitchStatement_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.SwitchStatement#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

	/**
	 * Returns the value of the '<em><b>Clauses</b></em>' containment reference list.
	 * The list contents are of type {@link sysADL_Sintax.SwitchClause}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clauses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clauses</em>' containment reference list.
	 * @see sysADL_Sintax.SysADLPackage#getSwitchStatement_Clauses()
	 * @model type="sysADL_Sintax.SwitchClause" containment="true"
	 * @generated
	 */
	EList getClauses();

} // SwitchStatement
