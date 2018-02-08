/**
 */
package sysADL_Sintax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.PackageImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.PackageImpl#getElementImports <em>Element Imports</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.PackageImpl#getArchitectures <em>Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements sysADL_Sintax.Package {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList imports;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Imports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList elementImports;

	/**
	 * The cached value of the '{@link #getArchitectures() <em>Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList architectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImports() {
		if (imports == null) {
			imports = new EObjectResolvingEList(sysADL_Sintax.Package.class, this, SysADLPackage.PACKAGE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElementImports() {
		if (elementImports == null) {
			elementImports = new EObjectResolvingEList(ElementDef.class, this, SysADLPackage.PACKAGE__ELEMENT_IMPORTS);
		}
		return elementImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArchitectures() {
		if (architectures == null) {
			architectures = new EObjectContainmentEList(ElementDef.class, this, SysADLPackage.PACKAGE__ARCHITECTURES);
		}
		return architectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.PACKAGE__ARCHITECTURES:
				return ((InternalEList)getArchitectures()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.PACKAGE__IMPORTS:
				return getImports();
			case SysADLPackage.PACKAGE__ELEMENT_IMPORTS:
				return getElementImports();
			case SysADLPackage.PACKAGE__ARCHITECTURES:
				return getArchitectures();
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
			case SysADLPackage.PACKAGE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection)newValue);
				return;
			case SysADLPackage.PACKAGE__ELEMENT_IMPORTS:
				getElementImports().clear();
				getElementImports().addAll((Collection)newValue);
				return;
			case SysADLPackage.PACKAGE__ARCHITECTURES:
				getArchitectures().clear();
				getArchitectures().addAll((Collection)newValue);
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
			case SysADLPackage.PACKAGE__IMPORTS:
				getImports().clear();
				return;
			case SysADLPackage.PACKAGE__ELEMENT_IMPORTS:
				getElementImports().clear();
				return;
			case SysADLPackage.PACKAGE__ARCHITECTURES:
				getArchitectures().clear();
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
			case SysADLPackage.PACKAGE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case SysADLPackage.PACKAGE__ELEMENT_IMPORTS:
				return elementImports != null && !elementImports.isEmpty();
			case SysADLPackage.PACKAGE__ARCHITECTURES:
				return architectures != null && !architectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
