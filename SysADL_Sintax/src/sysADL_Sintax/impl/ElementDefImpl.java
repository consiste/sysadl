/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Requirement;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ElementDefImpl#getSatisfies <em>Satisfies</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementDefImpl extends NamedElementImpl implements ElementDef {
	/**
	 * The cached value of the '{@link #getSatisfies() <em>Satisfies</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfies()
	 * @generated
	 * @ordered
	 */
	protected Requirement satisfies;

	/**
	 * This is true if the Satisfies reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean satisfiesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ELEMENT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement getSatisfies() {
		if (satisfies != null && satisfies.eIsProxy()) {
			InternalEObject oldSatisfies = (InternalEObject)satisfies;
			satisfies = (Requirement)eResolveProxy(oldSatisfies);
			if (satisfies != oldSatisfies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.ELEMENT_DEF__SATISFIES, oldSatisfies, satisfies));
			}
		}
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement basicGetSatisfies() {
		return satisfies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatisfies(Requirement newSatisfies, NotificationChain msgs) {
		Requirement oldSatisfies = satisfies;
		satisfies = newSatisfies;
		boolean oldSatisfiesESet = satisfiesESet;
		satisfiesESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.ELEMENT_DEF__SATISFIES, oldSatisfies, newSatisfies, !oldSatisfiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfies(Requirement newSatisfies) {
		if (newSatisfies != satisfies) {
			NotificationChain msgs = null;
			if (satisfies != null)
				msgs = ((InternalEObject)satisfies).eInverseRemove(this, SysADLPackage.REQUIREMENT__SATISFIED_BY, Requirement.class, msgs);
			if (newSatisfies != null)
				msgs = ((InternalEObject)newSatisfies).eInverseAdd(this, SysADLPackage.REQUIREMENT__SATISFIED_BY, Requirement.class, msgs);
			msgs = basicSetSatisfies(newSatisfies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSatisfiesESet = satisfiesESet;
			satisfiesESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ELEMENT_DEF__SATISFIES, newSatisfies, newSatisfies, !oldSatisfiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetSatisfies(NotificationChain msgs) {
		Requirement oldSatisfies = satisfies;
		satisfies = null;
		boolean oldSatisfiesESet = satisfiesESet;
		satisfiesESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, SysADLPackage.ELEMENT_DEF__SATISFIES, oldSatisfies, null, oldSatisfiesESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSatisfies() {
		if (satisfies != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)satisfies).eInverseRemove(this, SysADLPackage.REQUIREMENT__SATISFIED_BY, Requirement.class, msgs);
			msgs = basicUnsetSatisfies(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldSatisfiesESet = satisfiesESet;
			satisfiesESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, SysADLPackage.ELEMENT_DEF__SATISFIES, null, null, oldSatisfiesESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSatisfies() {
		return satisfiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ELEMENT_DEF__SATISFIES:
				if (satisfies != null)
					msgs = ((InternalEObject)satisfies).eInverseRemove(this, SysADLPackage.REQUIREMENT__SATISFIED_BY, Requirement.class, msgs);
				return basicSetSatisfies((Requirement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ELEMENT_DEF__SATISFIES:
				return basicUnsetSatisfies(msgs);
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
			case SysADLPackage.ELEMENT_DEF__SATISFIES:
				if (resolve) return getSatisfies();
				return basicGetSatisfies();
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
			case SysADLPackage.ELEMENT_DEF__SATISFIES:
				setSatisfies((Requirement)newValue);
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
			case SysADLPackage.ELEMENT_DEF__SATISFIES:
				unsetSatisfies();
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
			case SysADLPackage.ELEMENT_DEF__SATISFIES:
				return isSetSatisfies();
		}
		return super.eIsSet(featureID);
	}

} //ElementDefImpl
