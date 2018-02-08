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

import sysADL_Sintax.ActionDef;
import sysADL_Sintax.ActivityDelegation;
import sysADL_Sintax.BehaviorDef;
import sysADL_Sintax.ConstraintUse;
import sysADL_Sintax.DataDef;
import sysADL_Sintax.Pin;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getInParameters <em>In Parameters</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getOutParameters <em>Out Parameters</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getBehaDefs <em>Beha Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getDataDefs <em>Data Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getDelegations <em>Delegations</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActionDefImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDefImpl extends ElementDefImpl implements ActionDef {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TypeDef returnType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ACTION_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInParameters() {
		if (inParameters == null) {
			inParameters = new EObjectContainmentEList(Pin.class, this, SysADLPackage.ACTION_DEF__IN_PARAMETERS);
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
			outParameters = new EObjectContainmentEList(Pin.class, this, SysADLPackage.ACTION_DEF__OUT_PARAMETERS);
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
			behaDefs = new EObjectContainmentEList(BehaviorDef.class, this, SysADLPackage.ACTION_DEF__BEHA_DEFS);
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
			dataDefs = new EObjectContainmentEList(DataDef.class, this, SysADLPackage.ACTION_DEF__DATA_DEFS);
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
			constraints = new EObjectContainmentEList(ConstraintUse.class, this, SysADLPackage.ACTION_DEF__CONSTRAINTS);
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
			delegations = new EObjectContainmentEList(ActivityDelegation.class, this, SysADLPackage.ACTION_DEF__DELEGATIONS);
		}
		return delegations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (TypeDef)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.ACTION_DEF__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeDef newReturnType) {
		TypeDef oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ACTION_DEF__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ACTION_DEF__IN_PARAMETERS:
				return ((InternalEList)getInParameters()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTION_DEF__OUT_PARAMETERS:
				return ((InternalEList)getOutParameters()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTION_DEF__BEHA_DEFS:
				return ((InternalEList)getBehaDefs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTION_DEF__DATA_DEFS:
				return ((InternalEList)getDataDefs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTION_DEF__CONSTRAINTS:
				return ((InternalEList)getConstraints()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTION_DEF__DELEGATIONS:
				return ((InternalEList)getDelegations()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.ACTION_DEF__IN_PARAMETERS:
				return getInParameters();
			case SysADLPackage.ACTION_DEF__OUT_PARAMETERS:
				return getOutParameters();
			case SysADLPackage.ACTION_DEF__BEHA_DEFS:
				return getBehaDefs();
			case SysADLPackage.ACTION_DEF__DATA_DEFS:
				return getDataDefs();
			case SysADLPackage.ACTION_DEF__CONSTRAINTS:
				return getConstraints();
			case SysADLPackage.ACTION_DEF__DELEGATIONS:
				return getDelegations();
			case SysADLPackage.ACTION_DEF__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
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
			case SysADLPackage.ACTION_DEF__IN_PARAMETERS:
				getInParameters().clear();
				getInParameters().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTION_DEF__OUT_PARAMETERS:
				getOutParameters().clear();
				getOutParameters().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTION_DEF__BEHA_DEFS:
				getBehaDefs().clear();
				getBehaDefs().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTION_DEF__DATA_DEFS:
				getDataDefs().clear();
				getDataDefs().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTION_DEF__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTION_DEF__DELEGATIONS:
				getDelegations().clear();
				getDelegations().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTION_DEF__RETURN_TYPE:
				setReturnType((TypeDef)newValue);
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
			case SysADLPackage.ACTION_DEF__IN_PARAMETERS:
				getInParameters().clear();
				return;
			case SysADLPackage.ACTION_DEF__OUT_PARAMETERS:
				getOutParameters().clear();
				return;
			case SysADLPackage.ACTION_DEF__BEHA_DEFS:
				getBehaDefs().clear();
				return;
			case SysADLPackage.ACTION_DEF__DATA_DEFS:
				getDataDefs().clear();
				return;
			case SysADLPackage.ACTION_DEF__CONSTRAINTS:
				getConstraints().clear();
				return;
			case SysADLPackage.ACTION_DEF__DELEGATIONS:
				getDelegations().clear();
				return;
			case SysADLPackage.ACTION_DEF__RETURN_TYPE:
				setReturnType((TypeDef)null);
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
			case SysADLPackage.ACTION_DEF__IN_PARAMETERS:
				return inParameters != null && !inParameters.isEmpty();
			case SysADLPackage.ACTION_DEF__OUT_PARAMETERS:
				return outParameters != null && !outParameters.isEmpty();
			case SysADLPackage.ACTION_DEF__BEHA_DEFS:
				return behaDefs != null && !behaDefs.isEmpty();
			case SysADLPackage.ACTION_DEF__DATA_DEFS:
				return dataDefs != null && !dataDefs.isEmpty();
			case SysADLPackage.ACTION_DEF__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case SysADLPackage.ACTION_DEF__DELEGATIONS:
				return delegations != null && !delegations.isEmpty();
			case SysADLPackage.ACTION_DEF__RETURN_TYPE:
				return returnType != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionDefImpl
