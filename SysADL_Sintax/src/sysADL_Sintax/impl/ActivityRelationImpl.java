/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sysADL_Sintax.ActivityFlowable;
import sysADL_Sintax.ActivityRelation;
import sysADL_Sintax.ActivitySwitch;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ActivityRelationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActivityRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActivityRelationImpl#getTargetSwitch <em>Target Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityRelationImpl extends EObjectImpl implements ActivityRelation {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityFlowable source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityFlowable target;

	/**
	 * The cached value of the '{@link #getTargetSwitch() <em>Target Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSwitch()
	 * @generated
	 * @ordered
	 */
	protected ActivitySwitch targetSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ACTIVITY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFlowable getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityFlowable)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.ACTIVITY_RELATION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFlowable basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityFlowable newSource) {
		ActivityFlowable oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTIVITY_RELATION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFlowable getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityFlowable)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.ACTIVITY_RELATION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFlowable basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityFlowable newTarget) {
		ActivityFlowable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTIVITY_RELATION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitySwitch getTargetSwitch() {
		return targetSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetSwitch(ActivitySwitch newTargetSwitch, NotificationChain msgs) {
		ActivitySwitch oldTargetSwitch = targetSwitch;
		targetSwitch = newTargetSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH, oldTargetSwitch, newTargetSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSwitch(ActivitySwitch newTargetSwitch) {
		if (newTargetSwitch != targetSwitch) {
			NotificationChain msgs = null;
			if (targetSwitch != null)
				msgs = ((InternalEObject)targetSwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH, null, msgs);
			if (newTargetSwitch != null)
				msgs = ((InternalEObject)newTargetSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH, null, msgs);
			msgs = basicSetTargetSwitch(newTargetSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH, newTargetSwitch, newTargetSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH:
				return basicSetTargetSwitch(null, msgs);
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
			case SysADLPackage.ACTIVITY_RELATION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SysADLPackage.ACTIVITY_RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH:
				return getTargetSwitch();
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
			case SysADLPackage.ACTIVITY_RELATION__SOURCE:
				setSource((ActivityFlowable)newValue);
				return;
			case SysADLPackage.ACTIVITY_RELATION__TARGET:
				setTarget((ActivityFlowable)newValue);
				return;
			case SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH:
				setTargetSwitch((ActivitySwitch)newValue);
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
			case SysADLPackage.ACTIVITY_RELATION__SOURCE:
				setSource((ActivityFlowable)null);
				return;
			case SysADLPackage.ACTIVITY_RELATION__TARGET:
				setTarget((ActivityFlowable)null);
				return;
			case SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH:
				setTargetSwitch((ActivitySwitch)null);
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
			case SysADLPackage.ACTIVITY_RELATION__SOURCE:
				return source != null;
			case SysADLPackage.ACTIVITY_RELATION__TARGET:
				return target != null;
			case SysADLPackage.ACTIVITY_RELATION__TARGET_SWITCH:
				return targetSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityRelationImpl
