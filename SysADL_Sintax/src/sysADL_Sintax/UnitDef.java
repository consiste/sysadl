/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.UnitDef#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getUnitDef()
 * @model
 * @generated
 */
public interface UnitDef extends DataDef {
	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(DimensionDef)
	 * @see sysADL_Sintax.SysADLPackage#getUnitDef_Dimension()
	 * @model
	 * @generated
	 */
	DimensionDef getDimension();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.UnitDef#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(DimensionDef value);

} // UnitDef
