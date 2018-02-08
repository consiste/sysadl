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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.UnitDefImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitDefImpl extends DataDefImpl implements UnitDef {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.UNIT_DEF;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.UNIT_DEF__DIMENSION, oldDimension, dimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.UNIT_DEF__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.UNIT_DEF__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
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
			case SysADLPackage.UNIT_DEF__DIMENSION:
				setDimension((DimensionDef)newValue);
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
			case SysADLPackage.UNIT_DEF__DIMENSION:
				setDimension((DimensionDef)null);
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
			case SysADLPackage.UNIT_DEF__DIMENSION:
				return dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitDefImpl
