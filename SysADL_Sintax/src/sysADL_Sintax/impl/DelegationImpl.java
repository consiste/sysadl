/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sysADL_Sintax.Delegation;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.DelegationImpl#getPortProxy <em>Port Proxy</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.DelegationImpl#getFullPort <em>Full Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegationImpl extends EObjectImpl implements Delegation {
	/**
	 * The cached value of the '{@link #getPortProxy() <em>Port Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProxy()
	 * @generated
	 * @ordered
	 */
	protected PortUse portProxy;

	/**
	 * The cached value of the '{@link #getFullPort() <em>Full Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPort()
	 * @generated
	 * @ordered
	 */
	protected PortUse fullPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.DELEGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse getPortProxy() {
		if (portProxy != null && portProxy.eIsProxy()) {
			InternalEObject oldPortProxy = (InternalEObject)portProxy;
			portProxy = (PortUse)eResolveProxy(oldPortProxy);
			if (portProxy != oldPortProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.DELEGATION__PORT_PROXY, oldPortProxy, portProxy));
			}
		}
		return portProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse basicGetPortProxy() {
		return portProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortProxy(PortUse newPortProxy) {
		PortUse oldPortProxy = portProxy;
		portProxy = newPortProxy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.DELEGATION__PORT_PROXY, oldPortProxy, portProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse getFullPort() {
		if (fullPort != null && fullPort.eIsProxy()) {
			InternalEObject oldFullPort = (InternalEObject)fullPort;
			fullPort = (PortUse)eResolveProxy(oldFullPort);
			if (fullPort != oldFullPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.DELEGATION__FULL_PORT, oldFullPort, fullPort));
			}
		}
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortUse basicGetFullPort() {
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullPort(PortUse newFullPort) {
		PortUse oldFullPort = fullPort;
		fullPort = newFullPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.DELEGATION__FULL_PORT, oldFullPort, fullPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkCompatibility() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.DELEGATION__PORT_PROXY:
				if (resolve) return getPortProxy();
				return basicGetPortProxy();
			case SysADLPackage.DELEGATION__FULL_PORT:
				if (resolve) return getFullPort();
				return basicGetFullPort();
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
			case SysADLPackage.DELEGATION__PORT_PROXY:
				setPortProxy((PortUse)newValue);
				return;
			case SysADLPackage.DELEGATION__FULL_PORT:
				setFullPort((PortUse)newValue);
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
			case SysADLPackage.DELEGATION__PORT_PROXY:
				setPortProxy((PortUse)null);
				return;
			case SysADLPackage.DELEGATION__FULL_PORT:
				setFullPort((PortUse)null);
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
			case SysADLPackage.DELEGATION__PORT_PROXY:
				return portProxy != null;
			case SysADLPackage.DELEGATION__FULL_PORT:
				return fullPort != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegationImpl
