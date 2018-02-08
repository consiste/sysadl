/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.NaturalLiteralExpression;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.NaturalLiteralExpressionImpl#getInt_value <em>Int value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaturalLiteralExpressionImpl extends ExpressionImpl implements NaturalLiteralExpression {
	/**
	 * The default value of the '{@link #getInt_value() <em>Int value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_value()
	 * @generated
	 * @ordered
	 */
	protected static final int INT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt_value() <em>Int value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt_value()
	 * @generated
	 * @ordered
	 */
	protected int int_value = INT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.NATURAL_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInt_value() {
		return int_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInt_value(int newInt_value) {
		int oldInt_value = int_value;
		int_value = newInt_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.NATURAL_LITERAL_EXPRESSION__INT_VALUE, oldInt_value, int_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.NATURAL_LITERAL_EXPRESSION__INT_VALUE:
				return new Integer(getInt_value());
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
			case SysADLPackage.NATURAL_LITERAL_EXPRESSION__INT_VALUE:
				setInt_value(((Integer)newValue).intValue());
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
			case SysADLPackage.NATURAL_LITERAL_EXPRESSION__INT_VALUE:
				setInt_value(INT_VALUE_EDEFAULT);
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
			case SysADLPackage.NATURAL_LITERAL_EXPRESSION__INT_VALUE:
				return int_value != INT_VALUE_EDEFAULT;
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
		result.append(" (int_value: ");
		result.append(int_value);
		result.append(')');
		return result.toString();
	}

} //NaturalLiteralExpressionImpl
