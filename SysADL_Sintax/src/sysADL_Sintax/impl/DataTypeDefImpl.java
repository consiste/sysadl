/**
 */
package sysADL_Sintax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sysADL_Sintax.DataTypeDef;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.DataTypeDefImpl#getDataTypeAttributes <em>Data Type Attributes</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.DataTypeDefImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeDefImpl extends TypeDefImpl implements DataTypeDef {
	/**
	 * The cached value of the '{@link #getDataTypeAttributes() <em>Data Type Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList dataTypeAttributes;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeDef superType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.DATA_TYPE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataTypeAttributes() {
		if (dataTypeAttributes == null) {
			dataTypeAttributes = new EObjectContainmentEList(TypeUse.class, this, SysADLPackage.DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES);
		}
		return dataTypeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDef getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (DataTypeDef)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.DATA_TYPE_DEF__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeDef basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(DataTypeDef newSuperType) {
		DataTypeDef oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.DATA_TYPE_DEF__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES:
				return ((InternalEList)getDataTypeAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES:
				return getDataTypeAttributes();
			case SysADLPackage.DATA_TYPE_DEF__SUPER_TYPE:
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
			case SysADLPackage.DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES:
				getDataTypeAttributes().clear();
				getDataTypeAttributes().addAll((Collection)newValue);
				return;
			case SysADLPackage.DATA_TYPE_DEF__SUPER_TYPE:
				setSuperType((DataTypeDef)newValue);
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
			case SysADLPackage.DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES:
				getDataTypeAttributes().clear();
				return;
			case SysADLPackage.DATA_TYPE_DEF__SUPER_TYPE:
				setSuperType((DataTypeDef)null);
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
			case SysADLPackage.DATA_TYPE_DEF__DATA_TYPE_ATTRIBUTES:
				return dataTypeAttributes != null && !dataTypeAttributes.isEmpty();
			case SysADLPackage.DATA_TYPE_DEF__SUPER_TYPE:
				return superType != null;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeDefImpl
