/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.FlowProperty;
import sysADL_Sintax.SimplePortDef;
import sysADL_Sintax.SysADLPackage;
import sysADL_Sintax.TypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Port Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.SimplePortDefImpl#getFlowProperties <em>Flow Properties</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.SimplePortDefImpl#getFlowType <em>Flow Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimplePortDefImpl extends PortDefImpl implements SimplePortDef {
	/**
	 * The default value of the '{@link #getFlowProperties() <em>Flow Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowProperties()
	 * @generated
	 * @ordered
	 */
	protected static final FlowProperty FLOW_PROPERTIES_EDEFAULT = FlowProperty.IN_LITERAL;

	/**
	 * The cached value of the '{@link #getFlowProperties() <em>Flow Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowProperties()
	 * @generated
	 * @ordered
	 */
	protected FlowProperty flowProperties = FLOW_PROPERTIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowType() <em>Flow Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowType()
	 * @generated
	 * @ordered
	 */
	protected TypeDef flowType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplePortDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.SIMPLE_PORT_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowProperty getFlowProperties() {
		return flowProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowProperties(FlowProperty newFlowProperties) {
		FlowProperty oldFlowProperties = flowProperties;
		flowProperties = newFlowProperties == null ? FLOW_PROPERTIES_EDEFAULT : newFlowProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.SIMPLE_PORT_DEF__FLOW_PROPERTIES, oldFlowProperties, flowProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef getFlowType() {
		if (flowType != null && flowType.eIsProxy()) {
			InternalEObject oldFlowType = (InternalEObject)flowType;
			flowType = (TypeDef)eResolveProxy(oldFlowType);
			if (flowType != oldFlowType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysADLPackage.SIMPLE_PORT_DEF__FLOW_TYPE, oldFlowType, flowType));
			}
		}
		return flowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDef basicGetFlowType() {
		return flowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowType(TypeDef newFlowType) {
		TypeDef oldFlowType = flowType;
		flowType = newFlowType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.SIMPLE_PORT_DEF__FLOW_TYPE, oldFlowType, flowType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_PROPERTIES:
				return getFlowProperties();
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_TYPE:
				if (resolve) return getFlowType();
				return basicGetFlowType();
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
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_PROPERTIES:
				setFlowProperties((FlowProperty)newValue);
				return;
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_TYPE:
				setFlowType((TypeDef)newValue);
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
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_PROPERTIES:
				setFlowProperties(FLOW_PROPERTIES_EDEFAULT);
				return;
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_TYPE:
				setFlowType((TypeDef)null);
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
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_PROPERTIES:
				return flowProperties != FLOW_PROPERTIES_EDEFAULT;
			case SysADLPackage.SIMPLE_PORT_DEF__FLOW_TYPE:
				return flowType != null;
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
		result.append(" (flowProperties: ");
		result.append(flowProperties);
		result.append(')');
		return result.toString();
	}

} //SimplePortDefImpl
