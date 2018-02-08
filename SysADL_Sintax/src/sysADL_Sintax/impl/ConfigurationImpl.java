/**
 */
package sysADL_Sintax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sysADL_Sintax.ComponentUse;
import sysADL_Sintax.Configuration;
import sysADL_Sintax.ConnectorUse;
import sysADL_Sintax.Delegation;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ConfigurationImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConfigurationImpl#getDelegations <em>Delegations</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConfigurationImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends EObjectImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList components;

	/**
	 * The cached value of the '{@link #getDelegations() <em>Delegations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegations()
	 * @generated
	 * @ordered
	 */
	protected EList delegations;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList(ComponentUse.class, this, SysADLPackage.CONFIGURATION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDelegations() {
		if (delegations == null) {
			delegations = new EObjectContainmentEList(Delegation.class, this, SysADLPackage.CONFIGURATION__DELEGATIONS);
		}
		return delegations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList(ConnectorUse.class, this, SysADLPackage.CONFIGURATION__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.CONFIGURATION__COMPONENTS:
				return ((InternalEList)getComponents()).basicRemove(otherEnd, msgs);
			case SysADLPackage.CONFIGURATION__DELEGATIONS:
				return ((InternalEList)getDelegations()).basicRemove(otherEnd, msgs);
			case SysADLPackage.CONFIGURATION__CONNECTORS:
				return ((InternalEList)getConnectors()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.CONFIGURATION__COMPONENTS:
				return getComponents();
			case SysADLPackage.CONFIGURATION__DELEGATIONS:
				return getDelegations();
			case SysADLPackage.CONFIGURATION__CONNECTORS:
				return getConnectors();
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
			case SysADLPackage.CONFIGURATION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection)newValue);
				return;
			case SysADLPackage.CONFIGURATION__DELEGATIONS:
				getDelegations().clear();
				getDelegations().addAll((Collection)newValue);
				return;
			case SysADLPackage.CONFIGURATION__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection)newValue);
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
			case SysADLPackage.CONFIGURATION__COMPONENTS:
				getComponents().clear();
				return;
			case SysADLPackage.CONFIGURATION__DELEGATIONS:
				getDelegations().clear();
				return;
			case SysADLPackage.CONFIGURATION__CONNECTORS:
				getConnectors().clear();
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
			case SysADLPackage.CONFIGURATION__COMPONENTS:
				return components != null && !components.isEmpty();
			case SysADLPackage.CONFIGURATION__DELEGATIONS:
				return delegations != null && !delegations.isEmpty();
			case SysADLPackage.CONFIGURATION__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
