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

import sysADL_Sintax.ElseStatement;
import sysADL_Sintax.IfBlockStatement;
import sysADL_Sintax.IfStatement;
import sysADL_Sintax.SysADLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Block Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sysADL_Sintax.impl.IfBlockStatementImpl#getMain_if <em>Main if</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.IfBlockStatementImpl#getParalel_ifs <em>Paralel ifs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.IfBlockStatementImpl#getSequential_ifs <em>Sequential ifs</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.IfBlockStatementImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link sysADL_Sintax.impl.IfBlockStatementImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfBlockStatementImpl extends StatementImpl implements IfBlockStatement {
	/**
	 * The cached value of the '{@link #getMain_if() <em>Main if</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMain_if()
	 * @generated
	 * @ordered
	 */
	protected IfStatement main_if;

	/**
	 * The cached value of the '{@link #getParalel_ifs() <em>Paralel ifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParalel_ifs()
	 * @generated
	 * @ordered
	 */
	protected EList paralel_ifs;

	/**
	 * The cached value of the '{@link #getSequential_ifs() <em>Sequential ifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequential_ifs()
	 * @generated
	 * @ordered
	 */
	protected EList sequential_ifs;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected ElseStatement final_;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected ElseStatement else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfBlockStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SysADLPackage.Literals.IF_BLOCK_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfStatement getMain_if() {
		return main_if;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMain_if(IfStatement newMain_if, NotificationChain msgs) {
		IfStatement oldMain_if = main_if;
		main_if = newMain_if;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF, oldMain_if, newMain_if);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMain_if(IfStatement newMain_if) {
		if (newMain_if != main_if) {
			NotificationChain msgs = null;
			if (main_if != null)
				msgs = ((InternalEObject)main_if).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF, null, msgs);
			if (newMain_if != null)
				msgs = ((InternalEObject)newMain_if).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF, null, msgs);
			msgs = basicSetMain_if(newMain_if, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF, newMain_if, newMain_if));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParalel_ifs() {
		if (paralel_ifs == null) {
			paralel_ifs = new EObjectContainmentEList(IfStatement.class, this, SysADLPackage.IF_BLOCK_STATEMENT__PARALEL_IFS);
		}
		return paralel_ifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSequential_ifs() {
		if (sequential_ifs == null) {
			sequential_ifs = new EObjectContainmentEList(IfStatement.class, this, SysADLPackage.IF_BLOCK_STATEMENT__SEQUENTIAL_IFS);
		}
		return sequential_ifs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStatement getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinal(ElseStatement newFinal, NotificationChain msgs) {
		ElseStatement oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.IF_BLOCK_STATEMENT__FINAL, oldFinal, newFinal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(ElseStatement newFinal) {
		if (newFinal != final_) {
			NotificationChain msgs = null;
			if (final_ != null)
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.IF_BLOCK_STATEMENT__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.IF_BLOCK_STATEMENT__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.IF_BLOCK_STATEMENT__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStatement getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(ElseStatement newElse, NotificationChain msgs) {
		ElseStatement oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysADLPackage.IF_BLOCK_STATEMENT__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(ElseStatement newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.IF_BLOCK_STATEMENT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysADLPackage.IF_BLOCK_STATEMENT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysADLPackage.IF_BLOCK_STATEMENT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF:
				return basicSetMain_if(null, msgs);
			case SysADLPackage.IF_BLOCK_STATEMENT__PARALEL_IFS:
				return ((InternalEList)getParalel_ifs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.IF_BLOCK_STATEMENT__SEQUENTIAL_IFS:
				return ((InternalEList)getSequential_ifs()).basicRemove(otherEnd, msgs);
			case SysADLPackage.IF_BLOCK_STATEMENT__FINAL:
				return basicSetFinal(null, msgs);
			case SysADLPackage.IF_BLOCK_STATEMENT__ELSE:
				return basicSetElse(null, msgs);
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
			case SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF:
				return getMain_if();
			case SysADLPackage.IF_BLOCK_STATEMENT__PARALEL_IFS:
				return getParalel_ifs();
			case SysADLPackage.IF_BLOCK_STATEMENT__SEQUENTIAL_IFS:
				return getSequential_ifs();
			case SysADLPackage.IF_BLOCK_STATEMENT__FINAL:
				return getFinal();
			case SysADLPackage.IF_BLOCK_STATEMENT__ELSE:
				return getElse();
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
			case SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF:
				setMain_if((IfStatement)newValue);
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__PARALEL_IFS:
				getParalel_ifs().clear();
				getParalel_ifs().addAll((Collection)newValue);
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__SEQUENTIAL_IFS:
				getSequential_ifs().clear();
				getSequential_ifs().addAll((Collection)newValue);
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__FINAL:
				setFinal((ElseStatement)newValue);
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__ELSE:
				setElse((ElseStatement)newValue);
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
			case SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF:
				setMain_if((IfStatement)null);
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__PARALEL_IFS:
				getParalel_ifs().clear();
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__SEQUENTIAL_IFS:
				getSequential_ifs().clear();
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__FINAL:
				setFinal((ElseStatement)null);
				return;
			case SysADLPackage.IF_BLOCK_STATEMENT__ELSE:
				setElse((ElseStatement)null);
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
			case SysADLPackage.IF_BLOCK_STATEMENT__MAIN_IF:
				return main_if != null;
			case SysADLPackage.IF_BLOCK_STATEMENT__PARALEL_IFS:
				return paralel_ifs != null && !paralel_ifs.isEmpty();
			case SysADLPackage.IF_BLOCK_STATEMENT__SEQUENTIAL_IFS:
				return sequential_ifs != null && !sequential_ifs.isEmpty();
			case SysADLPackage.IF_BLOCK_STATEMENT__FINAL:
				return final_ != null;
			case SysADLPackage.IF_BLOCK_STATEMENT__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

} //IfBlockStatementImpl
