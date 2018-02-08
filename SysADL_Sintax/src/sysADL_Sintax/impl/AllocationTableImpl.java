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

import sysADL_Sintax.Allocation;
import sysADL_Sintax.AllocationTable;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.AllocationTableImpl#getAllocs <em>Allocs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationTableImpl extends EObjectImpl implements AllocationTable {
	/**
	 * The cached value of the '{@link #getAllocs() <em>Allocs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocs()
	 * @generated
	 * @ordered
	 */
	protected EList allocs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ALLOCATION_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAllocs() {
		if (allocs == null) {
			allocs = new EObjectContainmentEList(Allocation.class, this, SysADLPackage.ALLOCATION_TABLE__ALLOCS);
		}
		return allocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ALLOCATION_TABLE__ALLOCS:
				return ((InternalEList)getAllocs()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.ALLOCATION_TABLE__ALLOCS:
				return getAllocs();
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
			case SysADLPackage.ALLOCATION_TABLE__ALLOCS:
				getAllocs().clear();
				getAllocs().addAll((Collection)newValue);
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
			case SysADLPackage.ALLOCATION_TABLE__ALLOCS:
				getAllocs().clear();
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
			case SysADLPackage.ALLOCATION_TABLE__ALLOCS:
				return allocs != null && !allocs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AllocationTableImpl
