/**
 */
package sysADL_Sintax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sysADL_Sintax.DataDef;
import sysADL_Sintax.StructuralDef;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.StructuralDefImpl#getArchDefs <em>Arch Defs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.StructuralDefImpl#getDataDefs <em>Data Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuralDefImpl extends ElementDefImpl implements StructuralDef {
	/**
	 * The cached value of the '{@link #getArchDefs() <em>Arch Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchDefs()
	 * @generated
	 * @ordered
	 */
	protected EList archDefs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.STRUCTURAL_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArchDefs() {
		if (archDefs == null) {
			archDefs = new EObjectContainmentEList(StructuralDef.class, this, SysADLPackage.STRUCTURAL_DEF__ARCH_DEFS);
		}
		return archDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDataDefs() {
		if (dataDefs == null) {
			dataDefs = new EObjectContainmentEList(DataDef.class, this, SysADLPackage.STRUCTURAL_DEF__DATA_DEFS);
		}
		return dataDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.STRUCTURAL_DEF__ARCH_DEFS:
				return ((InternalEList)getArchDefs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.STRUCTURAL_DEF__DATA_DEFS:
				return ((InternalEList)getDataDefs()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.STRUCTURAL_DEF__ARCH_DEFS:
				return getArchDefs();
			case SysADLPackage.STRUCTURAL_DEF__DATA_DEFS:
				return getDataDefs();
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
			case SysADLPackage.STRUCTURAL_DEF__ARCH_DEFS:
				getArchDefs().clear();
				getArchDefs().addAll((Collection)newValue);
				return;
			case SysADLPackage.STRUCTURAL_DEF__DATA_DEFS:
				getDataDefs().clear();
				getDataDefs().addAll((Collection)newValue);
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
			case SysADLPackage.STRUCTURAL_DEF__ARCH_DEFS:
				getArchDefs().clear();
				return;
			case SysADLPackage.STRUCTURAL_DEF__DATA_DEFS:
				getDataDefs().clear();
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
			case SysADLPackage.STRUCTURAL_DEF__ARCH_DEFS:
				return archDefs != null && !archDefs.isEmpty();
			case SysADLPackage.STRUCTURAL_DEF__DATA_DEFS:
				return dataDefs != null && !dataDefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructuralDefImpl
