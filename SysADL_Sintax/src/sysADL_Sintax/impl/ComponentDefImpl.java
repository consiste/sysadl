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

import sysADL_Sintax.ComponentDef;
import sysADL_Sintax.Configuration;
import sysADL_Sintax.PortUse;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ComponentDefImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ComponentDefImpl#getComposite <em>Composite</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ComponentDefImpl#isIsBoundary <em>Is Boundary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDefImpl extends StructuralDefImpl implements ComponentDef {
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
	 * The cached value of the '{@link #getComposite() <em>Composite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposite()
	 * @generated
	 * @ordered
	 */
	protected Configuration composite;

	/**
	 * The default value of the '{@link #isIsBoundary() <em>Is Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBoundary()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOUNDARY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBoundary() <em>Is Boundary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBoundary()
	 * @generated
	 * @ordered
	 */
	protected boolean isBoundary = IS_BOUNDARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.COMPONENT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList(PortUse.class, this, SysADLPackage.COMPONENT_DEF__PORTS);
		}
		return ports;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.COMPONENT_DEF__COMPOSITE, oldComposite, newComposite);
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
				msgs = ((InternalEObject)composite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.COMPONENT_DEF__COMPOSITE, null, msgs);
			if (newComposite != null)
				msgs = ((InternalEObject)newComposite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.COMPONENT_DEF__COMPOSITE, null, msgs);
			msgs = basicSetComposite(newComposite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.COMPONENT_DEF__COMPOSITE, newComposite, newComposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBoundary() {
		return isBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBoundary(boolean newIsBoundary) {
		boolean oldIsBoundary = isBoundary;
		isBoundary = newIsBoundary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.COMPONENT_DEF__IS_BOUNDARY, oldIsBoundary, isBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.COMPONENT_DEF__PORTS:
				return ((InternalEList)getPorts()).basicRemove(otherEnd, msgs);
			case SysADLPackage.COMPONENT_DEF__COMPOSITE:
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
			case SysADLPackage.COMPONENT_DEF__PORTS:
				return getPorts();
			case SysADLPackage.COMPONENT_DEF__COMPOSITE:
				return getComposite();
			case SysADLPackage.COMPONENT_DEF__IS_BOUNDARY:
				return isIsBoundary() ? Boolean.TRUE : Boolean.FALSE;
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
			case SysADLPackage.COMPONENT_DEF__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection)newValue);
				return;
			case SysADLPackage.COMPONENT_DEF__COMPOSITE:
				setComposite((Configuration)newValue);
				return;
			case SysADLPackage.COMPONENT_DEF__IS_BOUNDARY:
				setIsBoundary(((Boolean)newValue).booleanValue());
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
			case SysADLPackage.COMPONENT_DEF__PORTS:
				getPorts().clear();
				return;
			case SysADLPackage.COMPONENT_DEF__COMPOSITE:
				setComposite((Configuration)null);
				return;
			case SysADLPackage.COMPONENT_DEF__IS_BOUNDARY:
				setIsBoundary(IS_BOUNDARY_EDEFAULT);
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
			case SysADLPackage.COMPONENT_DEF__PORTS:
				return ports != null && !ports.isEmpty();
			case SysADLPackage.COMPONENT_DEF__COMPOSITE:
				return composite != null;
			case SysADLPackage.COMPONENT_DEF__IS_BOUNDARY:
				return isBoundary != IS_BOUNDARY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isBoundary: ");
		result.append(isBoundary);
		result.append(')');
		return result.toString();
	}

} //ComponentDefImpl
