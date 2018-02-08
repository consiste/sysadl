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

import sysADL_Sintax.ActivityDelegation;
import sysADL_Sintax.BehaviorDef;
import sysADL_Sintax.ConstraintUse;
import sysADL_Sintax.DataDef;
import sysADL_Sintax.Pin;
import sysADL_Sintax.Protocol;
import sysADL_Sintax.ProtocolBody;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getBehaDefs <em>Beha Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getDataDefs <em>Data Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getDelegations <em>Delegations</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ProtocolImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolImpl extends ElementDefImpl implements Protocol {
	/**
	 * The cached value of the '{@link #getInParameters() <em>In Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInParameters()
	 * @generated
	 * @ordered
	 */
	protected EList inParameters;

	/**
	 * The cached value of the '{@link #getOutParameters() <em>Out Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutParameters()
	 * @generated
	 * @ordered
	 */
	protected EList outParameters;

	/**
	 * The cached value of the '{@link #getBehaDefs() <em>Beha Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaDefs()
	 * @generated
	 * @ordered
	 */
	protected EList behaDefs;

	/**
	 * The cached value of the '{@link #getDataDefs() <em>Data Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDefs()
	 * @generated
	 * @ordered
	 */
	protected EList dataDefs;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList constraints;

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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected ProtocolBody body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.PROTOCOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInParameters() {
		if (inParameters == null) {
			inParameters = new EObjectContainmentEList(Pin.class, this, SysADLPackage.PROTOCOL__IN_PARAMETERS);
		}
		return inParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutParameters() {
		if (outParameters == null) {
			outParameters = new EObjectContainmentEList(Pin.class, this, SysADLPackage.PROTOCOL__OUT_PARAMETERS);
		}
		return outParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBehaDefs() {
		if (behaDefs == null) {
			behaDefs = new EObjectContainmentEList(BehaviorDef.class, this, SysADLPackage.PROTOCOL__BEHA_DEFS);
		}
		return behaDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataDefs() {
		if (dataDefs == null) {
			dataDefs = new EObjectContainmentEList(DataDef.class, this, SysADLPackage.PROTOCOL__DATA_DEFS);
		}
		return dataDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList(ConstraintUse.class, this, SysADLPackage.PROTOCOL__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDelegations() {
		if (delegations == null) {
			delegations = new EObjectContainmentEList(ActivityDelegation.class, this, SysADLPackage.PROTOCOL__DELEGATIONS);
		}
		return delegations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolBody getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(ProtocolBody newBody, NotificationChain msgs) {
		ProtocolBody oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ProtocolBody newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.PROTOCOL__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.PROTOCOL__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.PROTOCOL__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.PROTOCOL__IN_PARAMETERS:
				return ((InternalEList)getInParameters()).basicRemove(otherEnd, msgs);
			case SysADLPackage.PROTOCOL__OUT_PARAMETERS:
				return ((InternalEList)getOutParameters()).basicRemove(otherEnd, msgs);
			case SysADLPackage.PROTOCOL__BEHA_DEFS:
				return ((InternalEList)getBehaDefs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.PROTOCOL__DATA_DEFS:
				return ((InternalEList)getDataDefs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.PROTOCOL__CONSTRAINTS:
				return ((InternalEList)getConstraints()).basicRemove(otherEnd, msgs);
			case SysADLPackage.PROTOCOL__DELEGATIONS:
				return ((InternalEList)getDelegations()).basicRemove(otherEnd, msgs);
			case SysADLPackage.PROTOCOL__BODY:
				return basicSetBody(null, msgs);
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
			case SysADLPackage.PROTOCOL__IN_PARAMETERS:
				return getInParameters();
			case SysADLPackage.PROTOCOL__OUT_PARAMETERS:
				return getOutParameters();
			case SysADLPackage.PROTOCOL__BEHA_DEFS:
				return getBehaDefs();
			case SysADLPackage.PROTOCOL__DATA_DEFS:
				return getDataDefs();
			case SysADLPackage.PROTOCOL__CONSTRAINTS:
				return getConstraints();
			case SysADLPackage.PROTOCOL__DELEGATIONS:
				return getDelegations();
			case SysADLPackage.PROTOCOL__BODY:
				return getBody();
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
			case SysADLPackage.PROTOCOL__IN_PARAMETERS:
				getInParameters().clear();
				getInParameters().addAll((Collection)newValue);
				return;
			case SysADLPackage.PROTOCOL__OUT_PARAMETERS:
				getOutParameters().clear();
				getOutParameters().addAll((Collection)newValue);
				return;
			case SysADLPackage.PROTOCOL__BEHA_DEFS:
				getBehaDefs().clear();
				getBehaDefs().addAll((Collection)newValue);
				return;
			case SysADLPackage.PROTOCOL__DATA_DEFS:
				getDataDefs().clear();
				getDataDefs().addAll((Collection)newValue);
				return;
			case SysADLPackage.PROTOCOL__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection)newValue);
				return;
			case SysADLPackage.PROTOCOL__DELEGATIONS:
				getDelegations().clear();
				getDelegations().addAll((Collection)newValue);
				return;
			case SysADLPackage.PROTOCOL__BODY:
				setBody((ProtocolBody)newValue);
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
			case SysADLPackage.PROTOCOL__IN_PARAMETERS:
				getInParameters().clear();
				return;
			case SysADLPackage.PROTOCOL__OUT_PARAMETERS:
				getOutParameters().clear();
				return;
			case SysADLPackage.PROTOCOL__BEHA_DEFS:
				getBehaDefs().clear();
				return;
			case SysADLPackage.PROTOCOL__DATA_DEFS:
				getDataDefs().clear();
				return;
			case SysADLPackage.PROTOCOL__CONSTRAINTS:
				getConstraints().clear();
				return;
			case SysADLPackage.PROTOCOL__DELEGATIONS:
				getDelegations().clear();
				return;
			case SysADLPackage.PROTOCOL__BODY:
				setBody((ProtocolBody)null);
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
			case SysADLPackage.PROTOCOL__IN_PARAMETERS:
				return inParameters != null && !inParameters.isEmpty();
			case SysADLPackage.PROTOCOL__OUT_PARAMETERS:
				return outParameters != null && !outParameters.isEmpty();
			case SysADLPackage.PROTOCOL__BEHA_DEFS:
				return behaDefs != null && !behaDefs.isEmpty();
			case SysADLPackage.PROTOCOL__DATA_DEFS:
				return dataDefs != null && !dataDefs.isEmpty();
			case SysADLPackage.PROTOCOL__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case SysADLPackage.PROTOCOL__DELEGATIONS:
				return delegations != null && !delegations.isEmpty();
			case SysADLPackage.PROTOCOL__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtocolImpl
