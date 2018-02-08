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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Requirement;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.RequirementImpl#getText <em>Text</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.RequirementImpl#getDerivedBy <em>Derived By</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.RequirementImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.RequirementImpl#getSatisfiedBy <em>Satisfied By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends NamedElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final float ID_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected float id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDerivedBy() <em>Derived By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedBy()
	 * @generated
	 * @ordered
	 */
	protected EList derivedBy;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected EList composition;

	/**
	 * The cached value of the '{@link #getSatisfiedBy() <em>Satisfied By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList satisfiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(float newId) {
		float oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.REQUIREMENT__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDerivedBy() {
		if (derivedBy == null) {
			derivedBy = new EObjectResolvingEList(Requirement.class, this, SysADLPackage.REQUIREMENT__DERIVED_BY);
		}
		return derivedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getComposition() {
		if (composition == null) {
			composition = new EObjectContainmentEList(Requirement.class, this, SysADLPackage.REQUIREMENT__COMPOSITION);
		}
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSatisfiedBy() {
		if (satisfiedBy == null) {
			satisfiedBy = new EObjectWithInverseResolvingEList(ElementDef.class, this, SysADLPackage.REQUIREMENT__SATISFIED_BY, SysADLPackage.ELEMENT_DEF__SATISFIES);
		}
		return satisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.REQUIREMENT__SATISFIED_BY:
				return ((InternalEList)getSatisfiedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.REQUIREMENT__COMPOSITION:
				return ((InternalEList)getComposition()).basicRemove(otherEnd, msgs);
			case SysADLPackage.REQUIREMENT__SATISFIED_BY:
				return ((InternalEList)getSatisfiedBy()).basicRemove(otherEnd, msgs);
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
			case SysADLPackage.REQUIREMENT__ID:
				return new Float(getId());
			case SysADLPackage.REQUIREMENT__TEXT:
				return getText();
			case SysADLPackage.REQUIREMENT__DERIVED_BY:
				return getDerivedBy();
			case SysADLPackage.REQUIREMENT__COMPOSITION:
				return getComposition();
			case SysADLPackage.REQUIREMENT__SATISFIED_BY:
				return getSatisfiedBy();
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
			case SysADLPackage.REQUIREMENT__ID:
				setId(((Float)newValue).floatValue());
				return;
			case SysADLPackage.REQUIREMENT__TEXT:
				setText((String)newValue);
				return;
			case SysADLPackage.REQUIREMENT__DERIVED_BY:
				getDerivedBy().clear();
				getDerivedBy().addAll((Collection)newValue);
				return;
			case SysADLPackage.REQUIREMENT__COMPOSITION:
				getComposition().clear();
				getComposition().addAll((Collection)newValue);
				return;
			case SysADLPackage.REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
				getSatisfiedBy().addAll((Collection)newValue);
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
			case SysADLPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case SysADLPackage.REQUIREMENT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SysADLPackage.REQUIREMENT__DERIVED_BY:
				getDerivedBy().clear();
				return;
			case SysADLPackage.REQUIREMENT__COMPOSITION:
				getComposition().clear();
				return;
			case SysADLPackage.REQUIREMENT__SATISFIED_BY:
				getSatisfiedBy().clear();
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
			case SysADLPackage.REQUIREMENT__ID:
				return id != ID_EDEFAULT;
			case SysADLPackage.REQUIREMENT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SysADLPackage.REQUIREMENT__DERIVED_BY:
				return derivedBy != null && !derivedBy.isEmpty();
			case SysADLPackage.REQUIREMENT__COMPOSITION:
				return composition != null && !composition.isEmpty();
			case SysADLPackage.REQUIREMENT__SATISFIED_BY:
				return satisfiedBy != null && !satisfiedBy.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
