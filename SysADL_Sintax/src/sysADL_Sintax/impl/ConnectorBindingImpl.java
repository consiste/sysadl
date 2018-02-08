/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sysADL_Sintax.ConnectorBinding;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ConnectorBindingImpl#getFirstPort <em>First Port</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConnectorBindingImpl#getSecondPort <em>Second Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorBindingImpl extends EObjectImpl implements ConnectorBinding {
	/**
	 * The cached value of the '{@link #getFirstPort() <em>First Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstPort()
	 * @generated
	 * @ordered
	 */
	protected PortUse firstPort;

	/**
	 * The cached value of the '{@link #getSecondPort() <em>Second Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondPort()
	 * @generated
	 * @ordered
	 */
	protected PortUse secondPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.CONNECTOR_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse getFirstPort() {
		if (firstPort != null && firstPort.eIsProxy()) {
			InternalEObject oldFirstPort = (InternalEObject)firstPort;
			firstPort = (PortUse)eResolveProxy(oldFirstPort);
			if (firstPort != oldFirstPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.CONNECTOR_BINDING__FIRST_PORT, oldFirstPort, firstPort));
			}
		}
		return firstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse basicGetFirstPort() {
		return firstPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPort(PortUse newFirstPort) {
		PortUse oldFirstPort = firstPort;
		firstPort = newFirstPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONNECTOR_BINDING__FIRST_PORT, oldFirstPort, firstPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse getSecondPort() {
		if (secondPort != null && secondPort.eIsProxy()) {
			InternalEObject oldSecondPort = (InternalEObject)secondPort;
			secondPort = (PortUse)eResolveProxy(oldSecondPort);
			if (secondPort != oldSecondPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.CONNECTOR_BINDING__SECOND_PORT, oldSecondPort, secondPort));
			}
		}
		return secondPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse basicGetSecondPort() {
		return secondPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondPort(PortUse newSecondPort) {
		PortUse oldSecondPort = secondPort;
		secondPort = newSecondPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONNECTOR_BINDING__SECOND_PORT, oldSecondPort, secondPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.CONNECTOR_BINDING__FIRST_PORT:
				if (resolve) return getFirstPort();
				return basicGetFirstPort();
			case SysADLPackage.CONNECTOR_BINDING__SECOND_PORT:
				if (resolve) return getSecondPort();
				return basicGetSecondPort();
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
			case SysADLPackage.CONNECTOR_BINDING__FIRST_PORT:
				setFirstPort((PortUse)newValue);
				return;
			case SysADLPackage.CONNECTOR_BINDING__SECOND_PORT:
				setSecondPort((PortUse)newValue);
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
			case SysADLPackage.CONNECTOR_BINDING__FIRST_PORT:
				setFirstPort((PortUse)null);
				return;
			case SysADLPackage.CONNECTOR_BINDING__SECOND_PORT:
				setSecondPort((PortUse)null);
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
			case SysADLPackage.CONNECTOR_BINDING__FIRST_PORT:
				return firstPort != null;
			case SysADLPackage.CONNECTOR_BINDING__SECOND_PORT:
				return secondPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorBindingImpl
