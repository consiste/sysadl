/**
 */
package sysADL_Sintax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage#getConstraintKind()
 * @model
 * @generated
 */
public final class ConstraintKind extends AbstractEnumerator {
	/**
	 * The '<em><b>Pre Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_CONDITION_LITERAL
	 * @model name="preCondition"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_CONDITION = 0;

	/**
	 * The '<em><b>Post Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_CONDITION_LITERAL
	 * @model name="postCondition"
	 * @generated
	 * @ordered
	 */
	public static final int POST_CONDITION = 1;

	/**
	 * The '<em><b>Invariant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVARIANT_LITERAL
	 * @model name="invariant"
	 * @generated
	 * @ordered
	 */
	public static final int INVARIANT = 2;

	/**
	 * The '<em><b>Pre Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_CONDITION
	 * @generated
	 * @ordered
	 */
	public static final ConstraintKind PRE_CONDITION_LITERAL = new ConstraintKind(PRE_CONDITION, "preCondition", "preCondition");

	/**
	 * The '<em><b>Post Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_CONDITION
	 * @generated
	 * @ordered
	 */
	public static final ConstraintKind POST_CONDITION_LITERAL = new ConstraintKind(POST_CONDITION, "postCondition", "postCondition");

	/**
	 * The '<em><b>Invariant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVARIANT
	 * @generated
	 * @ordered
	 */
	public static final ConstraintKind INVARIANT_LITERAL = new ConstraintKind(INVARIANT, "invariant", "invariant");

	/**
	 * An array of all the '<em><b>Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintKind[] VALUES_ARRAY =
		new ConstraintKind[] {
			PRE_CONDITION_LITERAL,
			POST_CONDITION_LITERAL,
			INVARIANT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintKind get(int value) {
		switch (value) {
			case PRE_CONDITION: return PRE_CONDITION_LITERAL;
			case POST_CONDITION: return POST_CONDITION_LITERAL;
			case INVARIANT: return INVARIANT_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConstraintKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ConstraintKind
