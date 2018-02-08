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

import sysADL_Sintax.Configuration;
import sysADL_Sintax.ConnectorDef;
import sysADL_Sintax.Flow;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ConnectorDefImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConnectorDefImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConnectorDefImpl#getComposite <em>Composite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorDefImpl extends StructuralDefImpl implements ConnectorDef {
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
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList flows;

	/**
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected Configuration composite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.CONNECTOR_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList(PortUse.class, this, SysADLPackage.CONNECTOR_DEF__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList(Flow.class, this, SysADLPackage.CONNECTOR_DEF__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getComposite() {
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposite(Configuration newComposite, NotificationChain msgs) {
		Configuration oldComposite = composite;
		composite = newComposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.CONNECTOR_DEF__COMPOSITE, oldComposite, newComposite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposite(Configuration newComposite) {
		if (newComposite != composite) {
			NotificationChain msgs = null;
			if (composite != null)
				msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONNECTOR_DEF__COMPOSITE, null, msgs);
			if (newComposite != null)
				msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONNECTOR_DEF__COMPOSITE, null, msgs);
			msgs = basicSetComposite(newComposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONNECTOR_DEF__COMPOSITE, newComposite, newComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.CONNECTOR_DEF__PORTS:
				return ((InternalEList)getPorts()).basicRemove(otherEnd, msgs);
			case SysADLPackage.CONNECTOR_DEF__FLOWS:
				return ((InternalEList)getFlows()).basicRemove(otherEnd, msgs);
			case SysADLPackage.CONNECTOR_DEF__COMPOSITE:
				return basicSetComposite(null, msgs);
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
			case SysADLPackage.CONNECTOR_DEF__PORTS:
				return getPorts();
			case SysADLPackage.CONNECTOR_DEF__FLOWS:
				return getFlows();
			case SysADLPackage.CONNECTOR_DEF__COMPOSITE:
				return getComposite();
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
			case SysADLPackage.CONNECTOR_DEF__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection)newValue);
				return;
			case SysADLPackage.CONNECTOR_DEF__FLOWS:
				getFlows().clear();
				getFlows().addAll((Collection)newValue);
				return;
			case SysADLPackage.CONNECTOR_DEF__COMPOSITE:
				setComposite((Configuration)newValue);
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
			case SysADLPackage.CONNECTOR_DEF__PORTS:
				getPorts().clear();
				return;
			case SysADLPackage.CONNECTOR_DEF__FLOWS:
				getFlows().clear();
				return;
			case SysADLPackage.CONNECTOR_DEF__COMPOSITE:
				setComposite((Configuration)null);
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
			case SysADLPackage.CONNECTOR_DEF__PORTS:
				return ports != null && !ports.isEmpty();
			case SysADLPackage.CONNECTOR_DEF__FLOWS:
				return flows != null && !flows.isEmpty();
			case SysADLPackage.CONNECTOR_DEF__COMPOSITE:
				return composite != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorDefImpl
