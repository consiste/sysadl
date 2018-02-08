/**
 */
package sysADL_Sintax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sysADL_Sintax.ActionPin;
import sysADL_Sintax.Statement;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Pin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ActionPinImpl#getPinName <em>Pin Name</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionPinImpl#getPinValue <em>Pin Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionPinImpl extends PinImpl implements ActionPin {
	/**
	 * The cached value of the '{@link #getPinName() <em>Pin Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinName()
	 * @generated
	 * @ordered
	 */
	protected TypeUse pinName;

	/**
	 * The cached value of the '{@link #getPinValue() <em>Pin Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinValue()
	 * @generated
	 * @ordered
	 */
	protected EList pinValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionPinImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ACTION_PIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getPinName() {
		if (pinName != null && pinName.eIsProxy()) {
			InternalEObject oldPinName = (InternalEObject)pinName;
			pinName = (TypeUse)eResolveProxy(oldPinName);
			if (pinName != oldPinName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.ACTION_PIN__PIN_NAME, oldPinName, pinName));
			}
		}
		return pinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse basicGetPinName() {
		return pinName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinName(TypeUse newPinName) {
		TypeUse oldPinName = pinName;
		pinName = newPinName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTION_PIN__PIN_NAME, oldPinName, pinName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPinValue() {
		if (pinValue == null) {
			pinValue = new EObjectResolvingEList(Statement.class, this, SysADLPackage.ACTION_PIN__PIN_VALUE);
		}
		return pinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.ACTION_PIN__PIN_NAME:
				if (resolve) return getPinName();
				return basicGetPinName();
			case SysADLPackage.ACTION_PIN__PIN_VALUE:
				return getPinValue();
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
			case SysADLPackage.ACTION_PIN__PIN_NAME:
				setPinName((TypeUse)newValue);
				return;
			case SysADLPackage.ACTION_PIN__PIN_VALUE:
				getPinValue().clear();
				getPinValue().addAll((Collection)newValue);
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
			case SysADLPackage.ACTION_PIN__PIN_NAME:
				setPinName((TypeUse)null);
				return;
			case SysADLPackage.ACTION_PIN__PIN_VALUE:
				getPinValue().clear();
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
			case SysADLPackage.ACTION_PIN__PIN_NAME:
				return pinName != null;
			case SysADLPackage.ACTION_PIN__PIN_VALUE:
				return pinValue != null && !pinValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActionPinImpl
