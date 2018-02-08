/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.BooleanLiteralExpression;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.BooleanLiteralExpressionImpl#isIsTrue <em>Is True</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanLiteralExpressionImpl extends ExpressionImpl implements BooleanLiteralExpression {
	/**
	 * The default value of the '{@link #isIsTrue() <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TRUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTrue() <em>Is True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean isTrue = IS_TRUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.BOOLEAN_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTrue() {
		return isTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTrue(boolean newIsTrue) {
		boolean oldIsTrue = isTrue;
		isTrue = newIsTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.BOOLEAN_LITERAL_EXPRESSION__IS_TRUE, oldIsTrue, isTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysADLPackage.BOOLEAN_LITERAL_EXPRESSION__IS_TRUE:
				return isIsTrue() ? Boolean.TRUE : Boolean.FALSE;
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
			case SysADLPackage.BOOLEAN_LITERAL_EXPRESSION__IS_TRUE:
				setIsTrue(((Boolean)newValue).booleanValue());
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
			case SysADLPackage.BOOLEAN_LITERAL_EXPRESSION__IS_TRUE:
				setIsTrue(IS_TRUE_EDEFAULT);
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
			case SysADLPackage.BOOLEAN_LITERAL_EXPRESSION__IS_TRUE:
				return isTrue != IS_TRUE_EDEFAULT;
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
		result.append(" (isTrue: ");
		result.append(isTrue);
		result.append(')');
		return result.toString();
	}

} //BooleanLiteralExpressionImpl
