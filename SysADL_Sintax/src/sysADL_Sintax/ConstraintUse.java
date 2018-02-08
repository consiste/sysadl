/**
 */
package sysADL_Sintax;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ConstraintUse#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.ConstraintUse#getKind <em>Kind</em>}</li>
 *   <li>{@link sysADL_Sintax.ConstraintUse#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getConstraintUse()
 * @model
 * @generated
 */
public interface ConstraintUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(ConstraintDef)
	 * @see sysADL_Sintax.SysADLPackage#getConstraintUse_Definition()
	 * @model
	 * @generated
	 */
	ConstraintDef getDefinition();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConstraintUse#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(ConstraintDef value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"postCondition"</code>.
	 * The literals are from the enumeration {@link sysADL_Sintax.ConstraintKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see sysADL_Sintax.ConstraintKind
	 * @see #setKind(ConstraintKind)
	 * @see sysADL_Sintax.SysADLPackage#getConstraintUse_Kind()
	 * @model default="postCondition"
	 * @generated
	 */
	ConstraintKind getKind();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ConstraintUse#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see sysADL_Sintax.ConstraintKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ConstraintKind value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' reference list.
	 * The list contents are of type {@link sysADL_Sintax.TypeUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' reference list.
	 * @see sysADL_Sintax.SysADLPackage#getConstraintUse_Params()
	 * @model type="sysADL_Sintax.TypeUse" keys="name"
	 * @generated
	 */
	EList getParams();

} // ConstraintUse
