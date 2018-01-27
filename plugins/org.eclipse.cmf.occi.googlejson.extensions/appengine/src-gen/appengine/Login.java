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
 * A representation of the literals of the enumeration '<em><b>Login</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Level of login required to access this resource.
 * <!-- end-model-doc -->
 * @see appengine.AppenginePackage#getLogin()
 * @model
 * @generated
 */
public enum Login implements Enumerator {
	/**
	 * The '<em><b>LOGIN UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN_UNSPECIFIED(0, "LOGIN_UNSPECIFIED", "LOGIN_UNSPECIFIED"),

	/**
	 * The '<em><b>LOGIN OPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN_OPTIONAL(1, "LOGIN_OPTIONAL", "LOGIN_OPTIONAL"),

	/**
	 * The '<em><b>LOGIN ADMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN_ADMIN(2, "LOGIN_ADMIN", "LOGIN_ADMIN"),

	/**
	 * The '<em><b>LOGIN REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGIN_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	LOGIN_REQUIRED(3, "LOGIN_REQUIRED", "LOGIN_REQUIRED");

	/**
	 * The '<em><b>LOGIN UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not specified. LOGIN_OPTIONAL is assumed.
	 * <!-- end-model-doc -->
	 * @see #LOGIN_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>LOGIN OPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does not require that the user is signed in.
	 * <!-- end-model-doc -->
	 * @see #LOGIN_OPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_OPTIONAL_VALUE = 1;

	/**
	 * The '<em><b>LOGIN ADMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the user is not signed in, the auth_fail_action is taken. In addition, if the user is not an administrator for the application, they are given an error message regardless of auth_fail_action. If the user is an administrator, the handler proceeds.
	 * <!-- end-model-doc -->
	 * @see #LOGIN_ADMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_ADMIN_VALUE = 2;

	/**
	 * The '<em><b>LOGIN REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the user has signed in, the handler proceeds normally. Otherwise, the auth_fail_action is taken.
	 * <!-- end-model-doc -->
	 * @see #LOGIN_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOGIN_REQUIRED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Login</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Login[] VALUES_ARRAY =
		new Login[] {
			LOGIN_UNSPECIFIED,
			LOGIN_OPTIONAL,
			LOGIN_ADMIN,
			LOGIN_REQUIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Login</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Login> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Login</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Login get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Login result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Login</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Login getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Login result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Login</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Login get(int value) {
		switch (value) {
			case LOGIN_UNSPECIFIED_VALUE: return LOGIN_UNSPECIFIED;
			case LOGIN_OPTIONAL_VALUE: return LOGIN_OPTIONAL;
			case LOGIN_ADMIN_VALUE: return LOGIN_ADMIN;
			case LOGIN_REQUIRED_VALUE: return LOGIN_REQUIRED;
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
	private Login(int value, String name, String literal) {
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
	
} //Login
