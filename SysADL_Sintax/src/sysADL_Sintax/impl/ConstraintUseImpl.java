/**
 */
package sysADL_Sintax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import sysADL_Sintax.ConstraintDef;
import sysADL_Sintax.ConstraintKind;
import sysADL_Sintax.ConstraintUse;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ConstraintUseImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConstraintUseImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConstraintUseImpl#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintUseImpl extends EObjectImpl implements ConstraintUse {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected ConstraintDef definition;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintKind KIND_EDEFAULT = ConstraintKind.POST_CONDITION_LITERAL;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConstraintKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList params;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.CONSTRAINT_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDef getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (ConstraintDef)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.CONSTRAINT_USE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDef basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ConstraintDef newDefinition) {
		ConstraintDef oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONSTRAINT_USE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConstraintKind newKind) {
		ConstraintKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONSTRAINT_USE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParams() {
		if (params == null) {
			params = new EObjectResolvingEList(TypeUse.class, this, SysADLPackage.CONSTRAINT_USE__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.CONSTRAINT_USE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case SysADLPackage.CONSTRAINT_USE__KIND:
				return getKind();
			case SysADLPackage.CONSTRAINT_USE__PARAMS:
				return getParams();
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
			case SysADLPackage.CONSTRAINT_USE__DEFINITION:
				setDefinition((ConstraintDef)newValue);
				return;
			case SysADLPackage.CONSTRAINT_USE__KIND:
				setKind((ConstraintKind)newValue);
				return;
			case SysADLPackage.CONSTRAINT_USE__PARAMS:
				getParams().clear();
				getParams().addAll((Collection)newValue);
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
			case SysADLPackage.CONSTRAINT_USE__DEFINITION:
				setDefinition((ConstraintDef)null);
				return;
			case SysADLPackage.CONSTRAINT_USE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SysADLPackage.CONSTRAINT_USE__PARAMS:
				getParams().clear();
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
			case SysADLPackage.CONSTRAINT_USE__DEFINITION:
				return definition != null;
			case SysADLPackage.CONSTRAINT_USE__KIND:
				return kind != KIND_EDEFAULT;
			case SysADLPackage.CONSTRAINT_USE__PARAMS:
				return params != null && !params.isEmpty();
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ConstraintUseImpl
