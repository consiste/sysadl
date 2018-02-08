/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import sysADL_Sintax.ProtocolAlternativeType;
import sysADL_Sintax.ProtocolBody;
import sysADL_Sintax.ProtocolBodyInternal;
import sysADL_Sintax.ProtocolControl;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ProtocolBodyImpl#getRecControl <em>Rec Control</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolBodyImpl#getBody <em>Body</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolBodyImpl#getRecursive <em>Recursive</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolBodyImpl#getRecType <em>Rec Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolBodyImpl extends EObjectImpl implements ProtocolBody {
	/**
	 * The default value of the '{@link #getRecControl() <em>Rec Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecControl()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolControl REC_CONTROL_EDEFAULT = ProtocolControl.SEVERAL_LITERAL;

	/**
	 * The cached value of the '{@link #getRecControl() <em>Rec Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecControl()
	 * @generated
	 * @ordered
	 */
	protected ProtocolControl recControl = REC_CONTROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected ProtocolBodyInternal body;

	/**
	 * The cached value of the '{@link #getRecursive() <em>Recursive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursive()
	 * @generated
	 * @ordered
	 */
	protected ProtocolBody recursive;

	/**
	 * The default value of the '{@link #getRecType() <em>Rec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecType()
	 * @generated
	 * @ordered
	 */
	protected static final ProtocolAlternativeType REC_TYPE_EDEFAULT = ProtocolAlternativeType.ALTERNATIVE_LITERAL;

	/**
	 * The cached value of the '{@link #getRecType() <em>Rec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecType()
	 * @generated
	 * @ordered
	 */
	protected ProtocolAlternativeType recType = REC_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.PROTOCOL_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolControl getRecControl() {
		return recControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecControl(ProtocolControl newRecControl) {
		ProtocolControl oldRecControl = recControl;
		recControl = newRecControl == null ? REC_CONTROL_EDEFAULT : newRecControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL_BODY__REC_CONTROL, oldRecControl, recControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBodyInternal getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(ProtocolBodyInternal newBody, NotificationChain msgs) {
		ProtocolBodyInternal oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL_BODY__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ProtocolBodyInternal newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.PROTOCOL_BODY__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.PROTOCOL_BODY__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL_BODY__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBody getRecursive() {
		return recursive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecursive(ProtocolBody newRecursive, NotificationChain msgs) {
		ProtocolBody oldRecursive = recursive;
		recursive = newRecursive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL_BODY__RECURSIVE, oldRecursive, newRecursive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursive(ProtocolBody newRecursive) {
		if (newRecursive != recursive) {
			NotificationChain msgs = null;
			if (recursive != null)
				msgs = ((InternalEObject)recursive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.PROTOCOL_BODY__RECURSIVE, null, msgs);
			if (newRecursive != null)
				msgs = ((InternalEObject)newRecursive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.PROTOCOL_BODY__RECURSIVE, null, msgs);
			msgs = basicSetRecursive(newRecursive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL_BODY__RECURSIVE, newRecursive, newRecursive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolAlternativeType getRecType() {
		return recType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecType(ProtocolAlternativeType newRecType) {
		ProtocolAlternativeType oldRecType = recType;
		recType = newRecType == null ? REC_TYPE_EDEFAULT : newRecType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL_BODY__REC_TYPE, oldRecType, recType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.PROTOCOL_BODY__BODY:
				return basicSetBody(null, msgs);
			case SysADLPackage.PROTOCOL_BODY__RECURSIVE:
				return basicSetRecursive(null, msgs);
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
			case SysADLPackage.PROTOCOL_BODY__REC_CONTROL:
				return getRecControl();
			case SysADLPackage.PROTOCOL_BODY__BODY:
				return getBody();
			case SysADLPackage.PROTOCOL_BODY__RECURSIVE:
				return getRecursive();
			case SysADLPackage.PROTOCOL_BODY__REC_TYPE:
				return getRecType();
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
			case SysADLPackage.PROTOCOL_BODY__REC_CONTROL:
				setRecControl((ProtocolControl)newValue);
				return;
			case SysADLPackage.PROTOCOL_BODY__BODY:
				setBody((ProtocolBodyInternal)newValue);
				return;
			case SysADLPackage.PROTOCOL_BODY__RECURSIVE:
				setRecursive((ProtocolBody)newValue);
				return;
			case SysADLPackage.PROTOCOL_BODY__REC_TYPE:
				setRecType((ProtocolAlternativeType)newValue);
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
			case SysADLPackage.PROTOCOL_BODY__REC_CONTROL:
				setRecControl(REC_CONTROL_EDEFAULT);
				return;
			case SysADLPackage.PROTOCOL_BODY__BODY:
				setBody((ProtocolBodyInternal)null);
				return;
			case SysADLPackage.PROTOCOL_BODY__RECURSIVE:
				setRecursive((ProtocolBody)null);
				return;
			case SysADLPackage.PROTOCOL_BODY__REC_TYPE:
				setRecType(REC_TYPE_EDEFAULT);
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
			case SysADLPackage.PROTOCOL_BODY__REC_CONTROL:
				return recControl != REC_CONTROL_EDEFAULT;
			case SysADLPackage.PROTOCOL_BODY__BODY:
				return body != null;
			case SysADLPackage.PROTOCOL_BODY__RECURSIVE:
				return recursive != null;
			case SysADLPackage.PROTOCOL_BODY__REC_TYPE:
				return recType != REC_TYPE_EDEFAULT;
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
		result.append(" (recControl: ");
		result.append(recControl);
		result.append(", recType: ");
		result.append(recType);
		result.append(')');
		return result.toString();
	}

} //ProtocolBodyImpl
