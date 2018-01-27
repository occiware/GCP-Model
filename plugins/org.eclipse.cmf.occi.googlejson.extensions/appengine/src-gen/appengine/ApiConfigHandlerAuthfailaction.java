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
 * A representation of the literals of the enumeration '<em><b>Api Config Handler Authfailaction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Action to take when users access resources that require authentication. Defaults to redirect.
 * <!-- end-model-doc -->
 * @see appengine.AppenginePackage#getApiConfigHandlerAuthfailaction()
 * @model
 * @generated
 */
public enum ApiConfigHandlerAuthfailaction implements Enumerator {
	/**
	 * The '<em><b>AUTH FAIL ACTION UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_FAIL_ACTION_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_FAIL_ACTION_UNSPECIFIED(0, "AUTH_FAIL_ACTION_UNSPECIFIED", "AUTH_FAIL_ACTION_UNSPECIFIED"),

	/**
	 * The '<em><b>AUTH FAIL ACTION REDIRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_FAIL_ACTION_REDIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_FAIL_ACTION_REDIRECT(1, "AUTH_FAIL_ACTION_REDIRECT", "AUTH_FAIL_ACTION_REDIRECT"),

	/**
	 * The '<em><b>AUTH FAIL ACTION UNAUTHORIZED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTH_FAIL_ACTION_UNAUTHORIZED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTH_FAIL_ACTION_UNAUTHORIZED(2, "AUTH_FAIL_ACTION_UNAUTHORIZED", "AUTH_FAIL_ACTION_UNAUTHORIZED");

	/**
	 * The '<em><b>AUTH FAIL ACTION UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not specified. AUTH_FAIL_ACTION_REDIRECT is assumed.
	 * <!-- end-model-doc -->
	 * @see #AUTH_FAIL_ACTION_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_FAIL_ACTION_UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>AUTH FAIL ACTION REDIRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Redirects user to "accounts.google.com". The user is redirected back to the application URL after signing in or creating an account.
	 * <!-- end-model-doc -->
	 * @see #AUTH_FAIL_ACTION_REDIRECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_FAIL_ACTION_REDIRECT_VALUE = 1;

	/**
	 * The '<em><b>AUTH FAIL ACTION UNAUTHORIZED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rejects request with a 401 HTTP status code and an error message.
	 * <!-- end-model-doc -->
	 * @see #AUTH_FAIL_ACTION_UNAUTHORIZED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTH_FAIL_ACTION_UNAUTHORIZED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Api Config Handler Authfailaction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ApiConfigHandlerAuthfailaction[] VALUES_ARRAY =
		new ApiConfigHandlerAuthfailaction[] {
			AUTH_FAIL_ACTION_UNSPECIFIED,
			AUTH_FAIL_ACTION_REDIRECT,
			AUTH_FAIL_ACTION_UNAUTHORIZED,
		};

	/**
	 * A public read-only list of all the '<em><b>Api Config Handler Authfailaction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ApiConfigHandlerAuthfailaction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Api Config Handler Authfailaction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApiConfigHandlerAuthfailaction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApiConfigHandlerAuthfailaction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Api Config Handler Authfailaction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApiConfigHandlerAuthfailaction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ApiConfigHandlerAuthfailaction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Api Config Handler Authfailaction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ApiConfigHandlerAuthfailaction get(int value) {
		switch (value) {
			case AUTH_FAIL_ACTION_UNSPECIFIED_VALUE: return AUTH_FAIL_ACTION_UNSPECIFIED;
			case AUTH_FAIL_ACTION_REDIRECT_VALUE: return AUTH_FAIL_ACTION_REDIRECT;
			case AUTH_FAIL_ACTION_UNAUTHORIZED_VALUE: return AUTH_FAIL_ACTION_UNAUTHORIZED;
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
	private ApiConfigHandlerAuthfailaction(int value, String name, String literal) {
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
	
} //ApiConfigHandlerAuthfailaction
