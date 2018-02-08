/**
 */
package sysADL_Sintax.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sysADL_Sintax.AssignmentExpression;
import sysADL_Sintax.AssignmentOperator;
import sysADL_Sintax.Expression;
import sysADL_Sintax.LeftHandSide;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.AssignmentExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.AssignmentExpressionImpl#getV <em>V</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.AssignmentExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements AssignmentExpression {
	/**
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected LeftHandSide lhs;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected Expression v;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AssignmentOperator OPERATOR_EDEFAULT = AssignmentOperator.EQUAL_LITERAL;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected AssignmentOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.ASSIGNMENT_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftHandSide getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(LeftHandSide newLhs, NotificationChain msgs) {
		LeftHandSide oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.ASSIGNMENT_EXPRESSION__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(LeftHandSide newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ASSIGNMENT_EXPRESSION__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ASSIGNMENT_EXPRESSION__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ASSIGNMENT_EXPRESSION__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetV(Expression newV, NotificationChain msgs) {
		Expression oldV = v;
		v = newV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.ASSIGNMENT_EXPRESSION__V, oldV, newV);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(Expression newV) {
		if (newV != v) {
			NotificationChain msgs = null;
			if (v != null)
				msgs = ((InternalEObject)v).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ASSIGNMENT_EXPRESSION__V, null, msgs);
			if (newV != null)
				msgs = ((InternalEObject)newV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.ASSIGNMENT_EXPRESSION__V, null, msgs);
			msgs = basicSetV(newV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ASSIGNMENT_EXPRESSION__V, newV, newV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AssignmentOperator newOperator) {
		AssignmentOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.ASSIGNMENT_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.ASSIGNMENT_EXPRESSION__LHS:
				return basicSetLhs(null, msgs);
			case SysADLPackage.ASSIGNMENT_EXPRESSION__V:
				return basicSetV(null, msgs);
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
			case SysADLPackage.ASSIGNMENT_EXPRESSION__LHS:
				return getLhs();
			case SysADLPackage.ASSIGNMENT_EXPRESSION__V:
				return getV();
			case SysADLPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				return getOperator();
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
			case SysADLPackage.ASSIGNMENT_EXPRESSION__LHS:
				setLhs((LeftHandSide)newValue);
				return;
			case SysADLPackage.ASSIGNMENT_EXPRESSION__V:
				setV((Expression)newValue);
				return;
			case SysADLPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				setOperator((AssignmentOperator)newValue);
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
			case SysADLPackage.ASSIGNMENT_EXPRESSION__LHS:
				setLhs((LeftHandSide)null);
				return;
			case SysADLPackage.ASSIGNMENT_EXPRESSION__V:
				setV((Expression)null);
				return;
			case SysADLPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case SysADLPackage.ASSIGNMENT_EXPRESSION__LHS:
				return lhs != null;
			case SysADLPackage.ASSIGNMENT_EXPRESSION__V:
				return v != null;
			case SysADLPackage.ASSIGNMENT_EXPRESSION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //AssignmentExpressionImpl
