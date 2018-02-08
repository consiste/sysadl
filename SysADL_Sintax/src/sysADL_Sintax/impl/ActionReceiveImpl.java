/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sysADL_Sintax.ActionReceive;
import sysADL_Sintax.Pin;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Receive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ActionReceiveImpl#getVar <em>Var</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionReceiveImpl#getFlowTo <em>Flow To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionReceiveImpl extends EObjectImpl implements ActionReceive {
	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected TypeUse var;

	/**
	 * The cached value of the '{@link #getFlowTo() <em>Flow To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowTo()
	 * @generated
	 * @ordered
	 */
	protected Pin flowTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionReceiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ACTION_RECEIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVar(TypeUse newVar, NotificationChain msgs) {
		TypeUse oldVar = var;
		var = newVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTION_RECEIVE__VAR, oldVar, newVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(TypeUse newVar) {
		if (newVar != var) {
			NotificationChain msgs = null;
			if (var != null)
				msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ACTION_RECEIVE__VAR, null, msgs);
			if (newVar != null)
				msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ACTION_RECEIVE__VAR, null, msgs);
			msgs = basicSetVar(newVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTION_RECEIVE__VAR, newVar, newVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin getFlowTo() {
		if (flowTo != null && flowTo.eIsProxy()) {
			InternalEObject oldFlowTo = (InternalEObject)flowTo;
			flowTo = (Pin)eResolveProxy(oldFlowTo);
			if (flowTo != oldFlowTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.ACTION_RECEIVE__FLOW_TO, oldFlowTo, flowTo));
			}
		}
		return flowTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pin basicGetFlowTo() {
		return flowTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowTo(Pin newFlowTo) {
		Pin oldFlowTo = flowTo;
		flowTo = newFlowTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTION_RECEIVE__FLOW_TO, oldFlowTo, flowTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ACTION_RECEIVE__VAR:
				return basicSetVar(null, msgs);
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
			case SysADLPackage.ACTION_RECEIVE__VAR:
				return getVar();
			case SysADLPackage.ACTION_RECEIVE__FLOW_TO:
				if (resolve) return getFlowTo();
				return basicGetFlowTo();
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
			case SysADLPackage.ACTION_RECEIVE__VAR:
				setVar((TypeUse)newValue);
				return;
			case SysADLPackage.ACTION_RECEIVE__FLOW_TO:
				setFlowTo((Pin)newValue);
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
			case SysADLPackage.ACTION_RECEIVE__VAR:
				setVar((TypeUse)null);
				return;
			case SysADLPackage.ACTION_RECEIVE__FLOW_TO:
				setFlowTo((Pin)null);
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
			case SysADLPackage.ACTION_RECEIVE__VAR:
				return var != null;
			case SysADLPackage.ACTION_RECEIVE__FLOW_TO:
				return flowTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionReceiveImpl
