/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.DimensionDef;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.UnitDef;
import sysADL_Sintax.ValueTypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ValueTypeDefImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ValueTypeDefImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ValueTypeDefImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueTypeDefImpl extends TypeDefImpl implements ValueTypeDef {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected UnitDef unit;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected DimensionDef dimension;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeDef superType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.VALUE_TYPE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDef getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (UnitDef)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.VALUE_TYPE_DEF__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitDef basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(UnitDef newUnit) {
		UnitDef oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.VALUE_TYPE_DEF__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionDef getDimension() {
		if (dimension != null && dimension.eIsProxy()) {
			InternalEObject oldDimension = (InternalEObject)dimension;
			dimension = (DimensionDef)eResolveProxy(oldDimension);
			if (dimension != oldDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.VALUE_TYPE_DEF__DIMENSION, oldDimension, dimension));
			}
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionDef basicGetDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(DimensionDef newDimension) {
		DimensionDef oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.VALUE_TYPE_DEF__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeDef getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (ValueTypeDef)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.VALUE_TYPE_DEF__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeDef basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(ValueTypeDef newSuperType) {
		ValueTypeDef oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.VALUE_TYPE_DEF__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.VALUE_TYPE_DEF__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case SysADLPackage.VALUE_TYPE_DEF__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
			case SysADLPackage.VALUE_TYPE_DEF__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysADLPackage.VALUE_TYPE_DEF__UNIT:
				setUnit((UnitDef)newValue);
				return;
			case SysADLPackage.VALUE_TYPE_DEF__DIMENSION:
				setDimension((DimensionDef)newValue);
				return;
			case SysADLPackage.VALUE_TYPE_DEF__SUPER_TYPE:
				setSuperType((ValueTypeDef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysADLPackage.VALUE_TYPE_DEF__UNIT:
				setUnit((UnitDef)null);
				return;
			case SysADLPackage.VALUE_TYPE_DEF__DIMENSION:
				setDimension((DimensionDef)null);
				return;
			case SysADLPackage.VALUE_TYPE_DEF__SUPER_TYPE:
				setSuperType((ValueTypeDef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysADLPackage.VALUE_TYPE_DEF__UNIT:
				return unit != null;
			case SysADLPackage.VALUE_TYPE_DEF__DIMENSION:
				return dimension != null;
			case SysADLPackage.VALUE_TYPE_DEF__SUPER_TYPE:
				return superType != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueTypeDefImpl
