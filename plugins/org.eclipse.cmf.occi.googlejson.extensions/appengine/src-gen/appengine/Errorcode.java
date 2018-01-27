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
 * A representation of the literals of the enumeration '<em><b>Errorcode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Error condition this handler applies to.
 * <!-- end-model-doc -->
 * @see appengine.AppenginePackage#getErrorcode()
 * @model
 * @generated
 */
public enum Errorcode implements Enumerator {
	/**
	 * The '<em><b>ERROR CODE UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CODE_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CODE_UNSPECIFIED(0, "ERROR_CODE_UNSPECIFIED", "ERROR_CODE_UNSPECIFIED"),

	/**
	 * The '<em><b>ERROR CODE DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CODE_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CODE_DEFAULT(1, "ERROR_CODE_DEFAULT", "ERROR_CODE_DEFAULT"),

	/**
	 * The '<em><b>ERROR CODE OVER QUOTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CODE_OVER_QUOTA_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CODE_OVER_QUOTA(2, "ERROR_CODE_OVER_QUOTA", "ERROR_CODE_OVER_QUOTA"),

	/**
	 * The '<em><b>ERROR CODE DOS API DENIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CODE_DOS_API_DENIAL_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CODE_DOS_API_DENIAL(3, "ERROR_CODE_DOS_API_DENIAL", "ERROR_CODE_DOS_API_DENIAL"),

	/**
	 * The '<em><b>ERROR CODE TIMEOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CODE_TIMEOUT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CODE_TIMEOUT(4, "ERROR_CODE_TIMEOUT", "ERROR_CODE_TIMEOUT");

	/**
	 * The '<em><b>ERROR CODE UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not specified. ERROR_CODE_DEFAULT is assumed.
	 * <!-- end-model-doc -->
	 * @see #ERROR_CODE_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CODE_UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>ERROR CODE DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All other error types.
	 * <!-- end-model-doc -->
	 * @see #ERROR_CODE_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CODE_DEFAULT_VALUE = 1;

	/**
	 * The '<em><b>ERROR CODE OVER QUOTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Application has exceeded a resource quota.
	 * <!-- end-model-doc -->
	 * @see #ERROR_CODE_OVER_QUOTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CODE_OVER_QUOTA_VALUE = 2;

	/**
	 * The '<em><b>ERROR CODE DOS API DENIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Client blocked by the application's Denial of Service protection configuration.
	 * <!-- end-model-doc -->
	 * @see #ERROR_CODE_DOS_API_DENIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CODE_DOS_API_DENIAL_VALUE = 3;

	/**
	 * The '<em><b>ERROR CODE TIMEOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deadline reached before the application responds.
	 * <!-- end-model-doc -->
	 * @see #ERROR_CODE_TIMEOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CODE_TIMEOUT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Errorcode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Errorcode[] VALUES_ARRAY =
		new Errorcode[] {
			ERROR_CODE_UNSPECIFIED,
			ERROR_CODE_DEFAULT,
			ERROR_CODE_OVER_QUOTA,
			ERROR_CODE_DOS_API_DENIAL,
			ERROR_CODE_TIMEOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Errorcode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Errorcode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Errorcode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Errorcode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Errorcode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Errorcode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Errorcode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Errorcode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Errorcode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Errorcode get(int value) {
		switch (value) {
			case ERROR_CODE_UNSPECIFIED_VALUE: return ERROR_CODE_UNSPECIFIED;
			case ERROR_CODE_DEFAULT_VALUE: return ERROR_CODE_DEFAULT;
			case ERROR_CODE_OVER_QUOTA_VALUE: return ERROR_CODE_OVER_QUOTA;
			case ERROR_CODE_DOS_API_DENIAL_VALUE: return ERROR_CODE_DOS_API_DENIAL;
			case ERROR_CODE_TIMEOUT_VALUE: return ERROR_CODE_TIMEOUT;
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
	private Errorcode(int value, String name, String literal) {
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
	
} //Errorcode
