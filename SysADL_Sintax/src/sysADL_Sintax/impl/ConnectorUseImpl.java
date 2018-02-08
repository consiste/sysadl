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

import sysADL_Sintax.ConnectorBinding;
import sysADL_Sintax.ConnectorDef;
import sysADL_Sintax.ConnectorUse;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ConnectorUseImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConnectorUseImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConnectorUseImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorUseImpl extends StructuralUseImpl implements ConnectorUse {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ConnectorDef definition;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList ports;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.CONNECTOR_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDef getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (ConnectorDef)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.CONNECTOR_USE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorDef basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ConnectorDef newDefinition) {
		ConnectorDef oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONNECTOR_USE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList(PortUse.class, this, SysADLPackage.CONNECTOR_USE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList(ConnectorBinding.class, this, SysADLPackage.CONNECTOR_USE__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void allPorts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.CONNECTOR_USE__PORTS:
				return ((InternalEList)getPorts()).basicRemove(otherEnd, msgs);
			case SysADLPackage.CONNECTOR_USE__BINDINGS:
				return ((InternalEList)getBindings()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.CONNECTOR_USE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case SysADLPackage.CONNECTOR_USE__PORTS:
				return getPorts();
			case SysADLPackage.CONNECTOR_USE__BINDINGS:
				return getBindings();
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
			case SysADLPackage.CONNECTOR_USE__DEFINITION:
				setDefinition((ConnectorDef)newValue);
				return;
			case SysADLPackage.CONNECTOR_USE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection)newValue);
				return;
			case SysADLPackage.CONNECTOR_USE__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection)newValue);
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
			case SysADLPackage.CONNECTOR_USE__DEFINITION:
				setDefinition((ConnectorDef)null);
				return;
			case SysADLPackage.CONNECTOR_USE__PORTS:
				getPorts().clear();
				return;
			case SysADLPackage.CONNECTOR_USE__BINDINGS:
				getBindings().clear();
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
			case SysADLPackage.CONNECTOR_USE__DEFINITION:
				return definition != null;
			case SysADLPackage.CONNECTOR_USE__PORTS:
				return ports != null && !ports.isEmpty();
			case SysADLPackage.CONNECTOR_USE__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorUseImpl
