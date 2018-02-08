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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sysADL_Sintax.AllocationTable;
import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Model;
import sysADL_Sintax.Requirement;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ModelImpl#getInvolvedElements <em>Involved Elements</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ModelImpl#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends NamedElementImpl implements Model {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList packages;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList requirements;

	/**
	 * The cached value of the '{@link #getInvolvedElements() <em>Involved Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedElements()
	 * @generated
	 * @ordered
	 */
	protected EList involvedElements;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected AllocationTable allocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList(sysADL_Sintax.Package.class, this, SysADLPackage.MODEL__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList(Requirement.class, this, SysADLPackage.MODEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInvolvedElements() {
		if (involvedElements == null) {
			involvedElements = new EObjectResolvingEList(ElementDef.class, this, SysADLPackage.MODEL__INVOLVED_ELEMENTS);
		}
		return involvedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocationTable getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocation(AllocationTable newAllocation, NotificationChain msgs) {
		AllocationTable oldAllocation = allocation;
		allocation = newAllocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.MODEL__ALLOCATION, oldAllocation, newAllocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(AllocationTable newAllocation) {
		if (newAllocation != allocation) {
			NotificationChain msgs = null;
			if (allocation != null)
				msgs = ((InternalEObject)allocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.MODEL__ALLOCATION, null, msgs);
			if (newAllocation != null)
				msgs = ((InternalEObject)newAllocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.MODEL__ALLOCATION, null, msgs);
			msgs = basicSetAllocation(newAllocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.MODEL__ALLOCATION, newAllocation, newAllocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.MODEL__PACKAGES:
				return ((InternalEList)getPackages()).basicRemove(otherEnd, msgs);
			case SysADLPackage.MODEL__REQUIREMENTS:
				return ((InternalEList)getRequirements()).basicRemove(otherEnd, msgs);
			case SysADLPackage.MODEL__ALLOCATION:
				return basicSetAllocation(null, msgs);
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
			case SysADLPackage.MODEL__PACKAGES:
				return getPackages();
			case SysADLPackage.MODEL__REQUIREMENTS:
				return getRequirements();
			case SysADLPackage.MODEL__INVOLVED_ELEMENTS:
				return getInvolvedElements();
			case SysADLPackage.MODEL__ALLOCATION:
				return getAllocation();
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
			case SysADLPackage.MODEL__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection)newValue);
				return;
			case SysADLPackage.MODEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection)newValue);
				return;
			case SysADLPackage.MODEL__INVOLVED_ELEMENTS:
				getInvolvedElements().clear();
				getInvolvedElements().addAll((Collection)newValue);
				return;
			case SysADLPackage.MODEL__ALLOCATION:
				setAllocation((AllocationTable)newValue);
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
			case SysADLPackage.MODEL__PACKAGES:
				getPackages().clear();
				return;
			case SysADLPackage.MODEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case SysADLPackage.MODEL__INVOLVED_ELEMENTS:
				getInvolvedElements().clear();
				return;
			case SysADLPackage.MODEL__ALLOCATION:
				setAllocation((AllocationTable)null);
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
			case SysADLPackage.MODEL__PACKAGES:
				return packages != null && !packages.isEmpty();
			case SysADLPackage.MODEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case SysADLPackage.MODEL__INVOLVED_ELEMENTS:
				return involvedElements != null && !involvedElements.isEmpty();
			case SysADLPackage.MODEL__ALLOCATION:
				return allocation != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
