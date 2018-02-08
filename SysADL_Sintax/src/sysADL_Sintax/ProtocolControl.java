/**
 */
package sysADL_Sintax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protocol Control</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sysADL_Sintax.SysADLPackage#getProtocolControl()
 * @model
 * @generated
 */
public final class ProtocolControl extends AbstractEnumerator {
	/**
	 * The '<em><b>Several</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Several</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEVERAL_LITERAL
	 * @model name="several"
	 * @generated
	 * @ordered
	 */
	public static final int SEVERAL = 0;

	/**
	 * The '<em><b>Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Once</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONCE_LITERAL
	 * @model name="once"
	 * @generated
	 * @ordered
	 */
	public static final int ONCE = 1;

	/**
	 * The '<em><b>Perhaps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Perhaps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERHAPS_LITERAL
	 * @model name="perhaps"
	 * @generated
	 * @ordered
	 */
	public static final int PERHAPS = 2;

	/**
	 * The '<em><b>Always</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Always</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_LITERAL
	 * @model name="always"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS = 3;

	/**
	 * The '<em><b>Several</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVERAL
	 * @generated
	 * @ordered
	 */
	public static final ProtocolControl SEVERAL_LITERAL = new ProtocolControl(SEVERAL, "several", "several");

	/**
	 * The '<em><b>Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONCE
	 * @generated
	 * @ordered
	 */
	public static final ProtocolControl ONCE_LITERAL = new ProtocolControl(ONCE, "once", "once");

	/**
	 * The '<em><b>Perhaps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERHAPS
	 * @generated
	 * @ordered
	 */
	public static final ProtocolControl PERHAPS_LITERAL = new ProtocolControl(PERHAPS, "perhaps", "perhaps");

	/**
	 * The '<em><b>Always</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @generated
	 * @ordered
	 */
	public static final ProtocolControl ALWAYS_LITERAL = new ProtocolControl(ALWAYS, "always", "always");

	/**
	 * An array of all the '<em><b>Protocol Control</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtocolControl[] VALUES_ARRAY =
		new ProtocolControl[] {
			SEVERAL_LITERAL,
			ONCE_LITERAL,
			PERHAPS_LITERAL,
			ALWAYS_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Protocol Control</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protocol Control</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolControl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolControl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Control</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolControl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtocolControl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protocol Control</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtocolControl get(int value) {
		switch (value) {
			case SEVERAL: return SEVERAL_LITERAL;
			case ONCE: return ONCE_LITERAL;
			case PERHAPS: return PERHAPS_LITERAL;
			case ALWAYS: return ALWAYS_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProtocolControl(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProtocolControl
