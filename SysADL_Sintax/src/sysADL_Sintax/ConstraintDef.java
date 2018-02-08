/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ConstraintDef#getEquation <em>Equation</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConstraintDef()
 * @model
 * @generated
 */
public interface ConstraintDef extends BehaviorDef {
	/**
	 * Returns the value of the '<em><b>Equation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equation</em>' containment reference.
	 * @see #setEquation(Expression)
	 * @see sysADL_Sintax.SysADLPackage#getConstraintDef_Equation()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEquation();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConstraintDef#getEquation <em>Equation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equation</em>' containment reference.
	 * @see #getEquation()
	 * @generated
	 */
	void setEquation(Expression value);

} // ConstraintDef
