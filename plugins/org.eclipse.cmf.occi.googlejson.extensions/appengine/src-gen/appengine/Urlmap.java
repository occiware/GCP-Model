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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Urlmap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Urlmap#getRedirectHttpResponseCode <em>Redirect Http Response Code</em>}</li>
 *   <li>{@link appengine.Urlmap#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link appengine.Urlmap#getAuthFailAction <em>Auth Fail Action</em>}</li>
 *   <li>{@link appengine.Urlmap#getUrlRegex <em>Url Regex</em>}</li>
 *   <li>{@link appengine.Urlmap#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getUrlmap()
 * @model
 * @generated
 */
public interface Urlmap extends Resource {
	/**
	 * Returns the value of the '<em><b>Redirect Http Response Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 30x code to use when performing redirects for the secure field. Defaults to 302.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redirect Http Response Code</em>' attribute.
	 * @see #setRedirectHttpResponseCode(String)
	 * @see appengine.AppenginePackage#getUrlmap_RedirectHttpResponseCode()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Urlmap!redirectHttpResponseCode'"
	 * @generated
	 */
	String getRedirectHttpResponseCode();

	/**
	 * Sets the value of the '{@link appengine.Urlmap#getRedirectHttpResponseCode <em>Redirect Http Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirect Http Response Code</em>' attribute.
	 * @see #getRedirectHttpResponseCode()
	 * @generated
	 */
	void setRedirectHttpResponseCode(String value);

	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security (HTTPS) enforcement for this URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #setSecurityLevel(String)
	 * @see appengine.AppenginePackage#getUrlmap_SecurityLevel()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Urlmap!securityLevel'"
	 * @generated
	 */
	String getSecurityLevel();

	/**
	 * Sets the value of the '{@link appengine.Urlmap#getSecurityLevel <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Level</em>' attribute.
	 * @see #getSecurityLevel()
	 * @generated
	 */
	void setSecurityLevel(String value);

	/**
	 * Returns the value of the '<em><b>Auth Fail Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Action to take when users access resources that require authentication. Defaults to redirect.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Fail Action</em>' attribute.
	 * @see #setAuthFailAction(String)
	 * @see appengine.AppenginePackage#getUrlmap_AuthFailAction()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Urlmap!authFailAction'"
	 * @generated
	 */
	String getAuthFailAction();

	/**
	 * Sets the value of the '{@link appengine.Urlmap#getAuthFailAction <em>Auth Fail Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Fail Action</em>' attribute.
	 * @see #getAuthFailAction()
	 * @generated
	 */
	void setAuthFailAction(String value);

	/**
	 * Returns the value of the '<em><b>Url Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url Regex</em>' attribute.
	 * @see #setUrlRegex(String)
	 * @see appengine.AppenginePackage#getUrlmap_UrlRegex()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Urlmap!urlRegex'"
	 * @generated
	 */
	String getUrlRegex();

	/**
	 * Sets the value of the '{@link appengine.Urlmap#getUrlRegex <em>Url Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Regex</em>' attribute.
	 * @see #getUrlRegex()
	 * @generated
	 */
	void setUrlRegex(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of login required to access this resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see appengine.AppenginePackage#getUrlmap_Login()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Urlmap!login'"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link appengine.Urlmap#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

} // Urlmap
