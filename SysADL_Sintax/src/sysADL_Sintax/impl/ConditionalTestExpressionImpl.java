/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.ConditionalTestExpression;
import sysADL_Sintax.Expression;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Test Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.ConditionalTestExpressionImpl#getOp1 <em>Op1</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConditionalTestExpressionImpl#getOp2 <em>Op2</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.ConditionalTestExpressionImpl#getOp3 <em>Op3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalTestExpressionImpl extends ExpressionImpl implements ConditionalTestExpression {
	/**
	 * The cached value of the '{@link #getOp1() <em>Op1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp1()
	 * @generated
	 * @ordered
	 */
	protected Expression op1;

	/**
	 * The cached value of the '{@link #getOp2() <em>Op2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp2()
	 * @generated
	 * @ordered
	 */
	protected Expression op2;

	/**
	 * The cached value of the '{@link #getOp3() <em>Op3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp3()
	 * @generated
	 * @ordered
	 */
	protected Expression op3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalTestExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.CONDITIONAL_TEST_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOp1() {
		return op1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp1(Expression newOp1, NotificationChain msgs) {
		Expression oldOp1 = op1;
		op1 = newOp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1, oldOp1, newOp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp1(Expression newOp1) {
		if (newOp1 != op1) {
			NotificationChain msgs = null;
			if (op1 != null)
				msgs = ((InternalEObject)op1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1, null, msgs);
			if (newOp1 != null)
				msgs = ((InternalEObject)newOp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1, null, msgs);
			msgs = basicSetOp1(newOp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1, newOp1, newOp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOp2() {
		return op2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp2(Expression newOp2, NotificationChain msgs) {
		Expression oldOp2 = op2;
		op2 = newOp2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2, oldOp2, newOp2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp2(Expression newOp2) {
		if (newOp2 != op2) {
			NotificationChain msgs = null;
			if (op2 != null)
				msgs = ((InternalEObject)op2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2, null, msgs);
			if (newOp2 != null)
				msgs = ((InternalEObject)newOp2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2, null, msgs);
			msgs = basicSetOp2(newOp2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2, newOp2, newOp2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOp3() {
		return op3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp3(Expression newOp3, NotificationChain msgs) {
		Expression oldOp3 = op3;
		op3 = newOp3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3, oldOp3, newOp3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp3(Expression newOp3) {
		if (newOp3 != op3) {
			NotificationChain msgs = null;
			if (op3 != null)
				msgs = ((InternalEObject)op3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3, null, msgs);
			if (newOp3 != null)
				msgs = ((InternalEObject)newOp3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3, null, msgs);
			msgs = basicSetOp3(newOp3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3, newOp3, newOp3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1:
				return basicSetOp1(null, msgs);
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2:
				return basicSetOp2(null, msgs);
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3:
				return basicSetOp3(null, msgs);
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
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1:
				return getOp1();
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2:
				return getOp2();
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3:
				return getOp3();
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
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1:
				setOp1((Expression)newValue);
				return;
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2:
				setOp2((Expression)newValue);
				return;
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3:
				setOp3((Expression)newValue);
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
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1:
				setOp1((Expression)null);
				return;
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2:
				setOp2((Expression)null);
				return;
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3:
				setOp3((Expression)null);
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
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP1:
				return op1 != null;
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP2:
				return op2 != null;
			case SysADLPackage.CONDITIONAL_TEST_EXPRESSION__OP3:
				return op3 != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalTestExpressionImpl
