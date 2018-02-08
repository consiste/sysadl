/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.StringLiteralExpression;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.StringLiteralExpressionImpl#getStr_value <em>Str value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringLiteralExpressionImpl extends ExpressionImpl implements StringLiteralExpression {
	/**
	 * The default value of the '{@link #getStr_value() <em>Str value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr_value()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStr_value() <em>Str value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr_value()
	 * @generated
	 * @ordered
	 */
	protected String str_value = STR_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.STRING_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStr_value() {
		return str_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStr_value(String newStr_value) {
		String oldStr_value = str_value;
		str_value = newStr_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.STRING_LITERAL_EXPRESSION__STR_VALUE, oldStr_value, str_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.STRING_LITERAL_EXPRESSION__STR_VALUE:
				return getStr_value();
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
			case SysADLPackage.STRING_LITERAL_EXPRESSION__STR_VALUE:
				setStr_value((String)newValue);
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
			case SysADLPackage.STRING_LITERAL_EXPRESSION__STR_VALUE:
				setStr_value(STR_VALUE_EDEFAULT);
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
			case SysADLPackage.STRING_LITERAL_EXPRESSION__STR_VALUE:
				return STR_VALUE_EDEFAULT == null ? str_value != null : !STR_VALUE_EDEFAULT.equals(str_value);
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
		result.append(" (str_value: ");
		result.append(str_value);
		result.append(')');
		return result.toString();
	}

} //StringLiteralExpressionImpl
