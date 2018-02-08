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

import sysADL_Sintax.ActionUse;
import sysADL_Sintax.ActivityBody;
import sysADL_Sintax.ActivityRelation;
import sysADL_Sintax.DataObject;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ActivityBodyImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActivityBodyImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ActivityBodyImpl#getDataObjects <em>Data Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityBodyImpl extends EObjectImpl implements ActivityBody {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList actions;

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
	 * The cached value of the '{@link #getDataObjects() <em>Data Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjects()
	 * @generated
	 * @ordered
	 */
	protected EList dataObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ACTIVITY_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList(ActionUse.class, this, SysADLPackage.ACTIVITY_BODY__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFlows() {
		if (flows == null) {
			flows = new EObjectContainmentEList(ActivityRelation.class, this, SysADLPackage.ACTIVITY_BODY__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataObjects() {
		if (dataObjects == null) {
			dataObjects = new EObjectContainmentEList(DataObject.class, this, SysADLPackage.ACTIVITY_BODY__DATA_OBJECTS);
		}
		return dataObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ACTIVITY_BODY__ACTIONS:
				return ((InternalEList)getActions()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTIVITY_BODY__FLOWS:
				return ((InternalEList)getFlows()).basicRemove(otherEnd, msgs);
			case SysADLPackage.ACTIVITY_BODY__DATA_OBJECTS:
				return ((InternalEList)getDataObjects()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.ACTIVITY_BODY__ACTIONS:
				return getActions();
			case SysADLPackage.ACTIVITY_BODY__FLOWS:
				return getFlows();
			case SysADLPackage.ACTIVITY_BODY__DATA_OBJECTS:
				return getDataObjects();
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
			case SysADLPackage.ACTIVITY_BODY__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTIVITY_BODY__FLOWS:
				getFlows().clear();
				getFlows().addAll((Collection)newValue);
				return;
			case SysADLPackage.ACTIVITY_BODY__DATA_OBJECTS:
				getDataObjects().clear();
				getDataObjects().addAll((Collection)newValue);
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
			case SysADLPackage.ACTIVITY_BODY__ACTIONS:
				getActions().clear();
				return;
			case SysADLPackage.ACTIVITY_BODY__FLOWS:
				getFlows().clear();
				return;
			case SysADLPackage.ACTIVITY_BODY__DATA_OBJECTS:
				getDataObjects().clear();
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
			case SysADLPackage.ACTIVITY_BODY__ACTIONS:
				return actions != null && !actions.isEmpty();
			case SysADLPackage.ACTIVITY_BODY__FLOWS:
				return flows != null && !flows.isEmpty();
			case SysADLPackage.ACTIVITY_BODY__DATA_OBJECTS:
				return dataObjects != null && !dataObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityBodyImpl
