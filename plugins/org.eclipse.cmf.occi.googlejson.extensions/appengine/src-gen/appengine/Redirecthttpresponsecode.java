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
 * A representation of the literals of the enumeration '<em><b>Redirecthttpresponsecode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 30x code to use when performing redirects for the secure field. Defaults to 302.
 * <!-- end-model-doc -->
 * @see appengine.AppenginePackage#getRedirecthttpresponsecode()
 * @model
 * @generated
 */
public enum Redirecthttpresponsecode implements Enumerator {
	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED(0, "REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED", "REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED"),

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 301</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_301_VALUE
	 * @generated
	 * @ordered
	 */
	REDIRECT_HTTP_RESPONSE_CODE_301(1, "REDIRECT_HTTP_RESPONSE_CODE_301", "REDIRECT_HTTP_RESPONSE_CODE_301"),

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 302</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_302_VALUE
	 * @generated
	 * @ordered
	 */
	REDIRECT_HTTP_RESPONSE_CODE_302(2, "REDIRECT_HTTP_RESPONSE_CODE_302", "REDIRECT_HTTP_RESPONSE_CODE_302"),

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 303</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_303_VALUE
	 * @generated
	 * @ordered
	 */
	REDIRECT_HTTP_RESPONSE_CODE_303(3, "REDIRECT_HTTP_RESPONSE_CODE_303", "REDIRECT_HTTP_RESPONSE_CODE_303"),

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 307</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_307_VALUE
	 * @generated
	 * @ordered
	 */
	REDIRECT_HTTP_RESPONSE_CODE_307(4, "REDIRECT_HTTP_RESPONSE_CODE_307", "REDIRECT_HTTP_RESPONSE_CODE_307");

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not specified. 302 is assumed.
	 * <!-- end-model-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 301</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 301 Moved Permanently code.
	 * <!-- end-model-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_301
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIRECT_HTTP_RESPONSE_CODE_301_VALUE = 1;

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 302</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 302 Moved Temporarily code.
	 * <!-- end-model-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_302
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIRECT_HTTP_RESPONSE_CODE_302_VALUE = 2;

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 303</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 303 See Other code.
	 * <!-- end-model-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_303
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIRECT_HTTP_RESPONSE_CODE_303_VALUE = 3;

	/**
	 * The '<em><b>REDIRECT HTTP RESPONSE CODE 307</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 307 Temporary Redirect code.
	 * <!-- end-model-doc -->
	 * @see #REDIRECT_HTTP_RESPONSE_CODE_307
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDIRECT_HTTP_RESPONSE_CODE_307_VALUE = 4;

	/**
	 * An array of all the '<em><b>Redirecthttpresponsecode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Redirecthttpresponsecode[] VALUES_ARRAY =
		new Redirecthttpresponsecode[] {
			REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED,
			REDIRECT_HTTP_RESPONSE_CODE_301,
			REDIRECT_HTTP_RESPONSE_CODE_302,
			REDIRECT_HTTP_RESPONSE_CODE_303,
			REDIRECT_HTTP_RESPONSE_CODE_307,
		};

	/**
	 * A public read-only list of all the '<em><b>Redirecthttpresponsecode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Redirecthttpresponsecode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Redirecthttpresponsecode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Redirecthttpresponsecode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Redirecthttpresponsecode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redirecthttpresponsecode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Redirecthttpresponsecode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Redirecthttpresponsecode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Redirecthttpresponsecode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Redirecthttpresponsecode get(int value) {
		switch (value) {
			case REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED_VALUE: return REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED;
			case REDIRECT_HTTP_RESPONSE_CODE_301_VALUE: return REDIRECT_HTTP_RESPONSE_CODE_301;
			case REDIRECT_HTTP_RESPONSE_CODE_302_VALUE: return REDIRECT_HTTP_RESPONSE_CODE_302;
			case REDIRECT_HTTP_RESPONSE_CODE_303_VALUE: return REDIRECT_HTTP_RESPONSE_CODE_303;
			case REDIRECT_HTTP_RESPONSE_CODE_307_VALUE: return REDIRECT_HTTP_RESPONSE_CODE_307;
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
	private Redirecthttpresponsecode(int value, String name, String literal) {
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
	
} //Redirecthttpresponsecode
