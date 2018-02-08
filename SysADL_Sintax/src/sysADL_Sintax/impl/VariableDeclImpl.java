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

import sysADL_Sintax.Expression;
import sysADL_Sintax.NamedElement;
import sysADL_Sintax.Property;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeDef;
import sysADL_Sintax.TypeUse;
import sysADL_Sintax.VariableDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.VariableDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.VariableDeclImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.VariableDeclImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.VariableDeclImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclImpl extends StatementImpl implements VariableDecl {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "newElement";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList properties;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected TypeDef definition;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.VARIABLE_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.VARIABLE_DECL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList(Property.class, this, SysADLPackage.VARIABLE_DECL__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (TypeDef)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.VARIABLE_DECL__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(TypeDef newDefinition) {
		TypeDef oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.VARIABLE_DECL__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.VARIABLE_DECL__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.VARIABLE_DECL__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.VARIABLE_DECL__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.VARIABLE_DECL__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.VARIABLE_DECL__PROPERTIES:
				return ((InternalEList)getProperties()).basicRemove(otherEnd, msgs);
			case SysADLPackage.VARIABLE_DECL__VALUE:
				return basicSetValue(null, msgs);
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
			case SysADLPackage.VARIABLE_DECL__NAME:
				return getName();
			case SysADLPackage.VARIABLE_DECL__PROPERTIES:
				return getProperties();
			case SysADLPackage.VARIABLE_DECL__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case SysADLPackage.VARIABLE_DECL__VALUE:
				return getValue();
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
			case SysADLPackage.VARIABLE_DECL__NAME:
				setName((String)newValue);
				return;
			case SysADLPackage.VARIABLE_DECL__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection)newValue);
				return;
			case SysADLPackage.VARIABLE_DECL__DEFINITION:
				setDefinition((TypeDef)newValue);
				return;
			case SysADLPackage.VARIABLE_DECL__VALUE:
				setValue((Expression)newValue);
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
			case SysADLPackage.VARIABLE_DECL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SysADLPackage.VARIABLE_DECL__PROPERTIES:
				getProperties().clear();
				return;
			case SysADLPackage.VARIABLE_DECL__DEFINITION:
				setDefinition((TypeDef)null);
				return;
			case SysADLPackage.VARIABLE_DECL__VALUE:
				setValue((Expression)null);
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
			case SysADLPackage.VARIABLE_DECL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SysADLPackage.VARIABLE_DECL__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case SysADLPackage.VARIABLE_DECL__DEFINITION:
				return definition != null;
			case SysADLPackage.VARIABLE_DECL__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case SysADLPackage.VARIABLE_DECL__NAME: return SysADLPackage.NAMED_ELEMENT__NAME;
				case SysADLPackage.VARIABLE_DECL__PROPERTIES: return SysADLPackage.NAMED_ELEMENT__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == TypeUse.class) {
			switch (derivedFeatureID) {
				case SysADLPackage.VARIABLE_DECL__DEFINITION: return SysADLPackage.TYPE_USE__DEFINITION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case SysADLPackage.NAMED_ELEMENT__NAME: return SysADLPackage.VARIABLE_DECL__NAME;
				case SysADLPackage.NAMED_ELEMENT__PROPERTIES: return SysADLPackage.VARIABLE_DECL__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == TypeUse.class) {
			switch (baseFeatureID) {
				case SysADLPackage.TYPE_USE__DEFINITION: return SysADLPackage.VARIABLE_DECL__DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VariableDeclImpl
