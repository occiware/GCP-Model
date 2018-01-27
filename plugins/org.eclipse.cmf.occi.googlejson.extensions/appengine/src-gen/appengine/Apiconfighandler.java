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
 * A representation of the model object '<em><b>Apiconfighandler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/) configuration for API handlers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Apiconfighandler#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link appengine.Apiconfighandler#getAuthFailAction <em>Auth Fail Action</em>}</li>
 *   <li>{@link appengine.Apiconfighandler#getScript <em>Script</em>}</li>
 *   <li>{@link appengine.Apiconfighandler#getLogin <em>Login</em>}</li>
 *   <li>{@link appengine.Apiconfighandler#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getApiconfighandler()
 * @model
 * @generated
 */
public interface Apiconfighandler extends Resource {
	/**
	 * Returns the value of the '<em><b>Security Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Security (HTTPS) enforcement for this URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Level</em>' attribute.
	 * @see #setSecurityLevel(String)
	 * @see appengine.AppenginePackage#getApiconfighandler_SecurityLevel()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Apiconfighandler!securityLevel'"
	 * @generated
	 */
	String getSecurityLevel();

	/**
	 * Sets the value of the '{@link appengine.Apiconfighandler#getSecurityLevel <em>Security Level</em>}' attribute.
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
	 * @see appengine.AppenginePackage#getApiconfighandler_AuthFailAction()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Apiconfighandler!authFailAction'"
	 * @generated
	 */
	String getAuthFailAction();

	/**
	 * Sets the value of the '{@link appengine.Apiconfighandler#getAuthFailAction <em>Auth Fail Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Fail Action</em>' attribute.
	 * @see #getAuthFailAction()
	 * @generated
	 */
	void setAuthFailAction(String value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path to the script from the application root directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see appengine.AppenginePackage#getApiconfighandler_Script()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Apiconfighandler!script'"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link appengine.Apiconfighandler#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level of login required to access this resource. Defaults to optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see appengine.AppenginePackage#getApiconfighandler_Login()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Apiconfighandler!login'"
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link appengine.Apiconfighandler#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to serve the endpoint at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see appengine.AppenginePackage#getApiconfighandler_Url()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Apiconfighandler!url'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link appengine.Apiconfighandler#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Apiconfighandler
