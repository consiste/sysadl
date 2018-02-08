/**
 */
package sysADL_Sintax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Affix Operator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage#getAffixOperator()
 * @model
 * @generated
 */
public final class AffixOperator extends AbstractEnumerator {
	/**
	 * The '<em><b>Minus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Minus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINUS_LITERAL
	 * @model name="minus"
	 * @generated
	 * @ordered
	 */
	public static final int MINUS = 0;

	/**
	 * The '<em><b>Plus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plus</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_LITERAL
	 * @model name="plus"
	 * @generated
	 * @ordered
	 */
	public static final int PLUS = 1;

	/**
	 * The '<em><b>Minus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINUS
	 * @generated
	 * @ordered
	 */
	public static final AffixOperator MINUS_LITERAL = new AffixOperator(MINUS, "minus", "minus");

	/**
	 * The '<em><b>Plus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS
	 * @generated
	 * @ordered
	 */
	public static final AffixOperator PLUS_LITERAL = new AffixOperator(PLUS, "plus", "plus");

	/**
	 * An array of all the '<em><b>Affix Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AffixOperator[] VALUES_ARRAY =
		new AffixOperator[] {
			MINUS_LITERAL,
			PLUS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Affix Operator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Affix Operator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AffixOperator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffixOperator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affix Operator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AffixOperator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AffixOperator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Affix Operator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AffixOperator get(int value) {
		switch (value) {
			case MINUS: return MINUS_LITERAL;
			case PLUS: return PLUS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AffixOperator(int value, String name, String literal) {
		super(value, name, literal);
	}

} //AffixOperator
