/**
 */
package sysADL_Sintax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Hand Side</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.LeftHandSide#getTarget <em>Target</em>}</li>
 *   <li>{@link sysADL_Sintax.LeftHandSide#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getLeftHandSide()
 * @model
 * @generated
 */
public interface LeftHandSide extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(NameExpression)
	 * @see sysADL_Sintax.SysADLPackage#getLeftHandSide_Target()
	 * @model containment="true"
	 * @generated
	 */
	NameExpression getTarget();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.LeftHandSide#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NameExpression value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see sysADL_Sintax.SysADLPackage#getLeftHandSide_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.LeftHandSide#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // LeftHandSide
