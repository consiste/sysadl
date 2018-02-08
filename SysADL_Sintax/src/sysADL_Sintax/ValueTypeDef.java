/**
 */
package sysADL_Sintax;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.ValueTypeDef#getUnit <em>Unit</em>}</li>
 *   <li>{@link sysADL_Sintax.ValueTypeDef#getDimension <em>Dimension</em>}</li>
 *   <li>{@link sysADL_Sintax.ValueTypeDef#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see sysADL_Sintax.SysADLPackage#getValueTypeDef()
 * @model
 * @generated
 */
public interface ValueTypeDef extends TypeDef {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' reference.
	 * @see #setUnit(UnitDef)
	 * @see sysADL_Sintax.SysADLPackage#getValueTypeDef_Unit()
	 * @model
	 * @generated
	 */
	UnitDef getUnit();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ValueTypeDef#getUnit <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitDef value);

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
	 * @see sysADL_Sintax.SysADLPackage#getValueTypeDef_Dimension()
	 * @model
	 * @generated
	 */
	DimensionDef getDimension();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ValueTypeDef#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(DimensionDef value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(ValueTypeDef)
	 * @see sysADL_Sintax.SysADLPackage#getValueTypeDef_SuperType()
	 * @model
	 * @generated
	 */
	ValueTypeDef getSuperType();

	/**
	 * Sets the value of the '{@link sysADL_Sintax.ValueTypeDef#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(ValueTypeDef value);

} // ValueTypeDef
