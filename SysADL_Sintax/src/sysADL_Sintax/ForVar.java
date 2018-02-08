/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ForVar#getVar <em>Var</em>}</li>
 *   <li>{@link sysADL_Sintax.ForVar#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getForVar()
 * @model
 * @generated
 */
public interface ForVar extends EObject {
	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(VariableDecl)
	 * @see sysADL_Sintax.SysADLPackage#getForVar_Var()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableDecl getVar();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ForVar#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VariableDecl value);

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
	 * @see sysADL_Sintax.SysADLPackage#getForVar_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpr();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ForVar#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expression value);

} // ForVar
