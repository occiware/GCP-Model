/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package appengine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Securitylevel</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Security (HTTPS) enforcement for this URL.
 * <!-- end-model-doc -->
 * @see appengine.AppenginePackage#getSecuritylevel()
 * @model
 * @generated
 */
public enum Securitylevel implements Enumerator {
	/**
	 * The '<em><b>SECURE UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_UNSPECIFIED(0, "SECURE_UNSPECIFIED", "SECURE_UNSPECIFIED"),

	/**
	 * The '<em><b>SECURE DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_DEFAULT(1, "SECURE_DEFAULT", "SECURE_DEFAULT"),

	/**
	 * The '<em><b>SECURE NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_NEVER(2, "SECURE_NEVER", "SECURE_NEVER"),

	/**
	 * The '<em><b>SECURE OPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_OPTIONAL(3, "SECURE_OPTIONAL", "SECURE_OPTIONAL"),

	/**
	 * The '<em><b>SECURE ALWAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURE_ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	SECURE_ALWAYS(4, "SECURE_ALWAYS", "SECURE_ALWAYS");

	/**
	 * The '<em><b>SECURE UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not specified.
	 * <!-- end-model-doc -->
	 * @see #SECURE_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>SECURE DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Both HTTP and HTTPS requests with URLs that match the handler succeed without redirects. The application can examine the request to determine which protocol was used, and respond accordingly.
	 * <!-- end-model-doc -->
	 * @see #SECURE_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_DEFAULT_VALUE = 1;

	/**
	 * The '<em><b>SECURE NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests for a URL that match this handler that use HTTPS are automatically redirected to the HTTP equivalent URL.
	 * <!-- end-model-doc -->
	 * @see #SECURE_NEVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_NEVER_VALUE = 2;

	/**
	 * The '<em><b>SECURE OPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Both HTTP and HTTPS requests with URLs that match the handler succeed without redirects. The application can examine the request to determine which protocol was used and respond accordingly.
	 * <!-- end-model-doc -->
	 * @see #SECURE_OPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_OPTIONAL_VALUE = 3;

	/**
	 * The '<em><b>SECURE ALWAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requests for a URL that match this handler that do not use HTTPS are automatically redirected to the HTTPS URL with the same path. Query parameters are reserved for the redirect.
	 * <!-- end-model-doc -->
	 * @see #SECURE_ALWAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURE_ALWAYS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Securitylevel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Securitylevel[] VALUES_ARRAY =
		new Securitylevel[] {
			SECURE_UNSPECIFIED,
			SECURE_DEFAULT,
			SECURE_NEVER,
			SECURE_OPTIONAL,
			SECURE_ALWAYS,
		};

	/**
	 * A public read-only list of all the '<em><b>Securitylevel</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Securitylevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Securitylevel</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Securitylevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Securitylevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Securitylevel</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Securitylevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Securitylevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Securitylevel</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Securitylevel get(int value) {
		switch (value) {
			case SECURE_UNSPECIFIED_VALUE: return SECURE_UNSPECIFIED;
			case SECURE_DEFAULT_VALUE: return SECURE_DEFAULT;
			case SECURE_NEVER_VALUE: return SECURE_NEVER;
			case SECURE_OPTIONAL_VALUE: return SECURE_OPTIONAL;
			case SECURE_ALWAYS_VALUE: return SECURE_ALWAYS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Securitylevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Securitylevel
