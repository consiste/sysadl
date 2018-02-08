/**
 */
package sysADL_Sintax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Alternative Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage#getProtocolAlternativeType()
 * @model
 * @generated
 */
public final class ProtocolAlternativeType extends AbstractEnumerator {
	/**
	 * The '<em><b>Alternative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alternative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE_LITERAL
	 * @model name="alternative"
	 * @generated
	 * @ordered
	 */
	public static final int ALTERNATIVE = 0;

	/**
	 * The '<em><b>Complimentary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complimentary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARY_LITERAL
	 * @model name="complimentary"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLIMENTARY = 1;

	/**
	 * The '<em><b>Alternative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALTERNATIVE
	 * @generated
	 * @ordered
	 */
	public static final ProtocolAlternativeType ALTERNATIVE_LITERAL = new ProtocolAlternativeType(ALTERNATIVE, "alternative", "alternative");

	/**
	 * The '<em><b>Complimentary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIMENTARY
	 * @generated
	 * @ordered
	 */
	public static final ProtocolAlternativeType COMPLIMENTARY_LITERAL = new ProtocolAlternativeType(COMPLIMENTARY, "complimentary", "complimentary");

	/**
	 * An array of all the '<em><b>Protocol Alternative Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolAlternativeType[] VALUES_ARRAY =
		new ProtocolAlternativeType[] {
			ALTERNATIVE_LITERAL,
			COMPLIMENTARY_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Alternative Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Alternative Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolAlternativeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolAlternativeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Alternative Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolAlternativeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolAlternativeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Alternative Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolAlternativeType get(int value) {
		switch (value) {
			case ALTERNATIVE: return ALTERNATIVE_LITERAL;
			case COMPLIMENTARY: return COMPLIMENTARY_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProtocolAlternativeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProtocolAlternativeType
