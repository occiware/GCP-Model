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
 * A representation of the model object '<em><b>Identityawareproxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identity-Aware Proxy
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Identityawareproxy#getOauth2ClientSecret <em>Oauth2 Client Secret</em>}</li>
 *   <li>{@link appengine.Identityawareproxy#getOauth2ClientId <em>Oauth2 Client Id</em>}</li>
 *   <li>{@link appengine.Identityawareproxy#getOauth2ClientSecretSha256 <em>Oauth2 Client Secret Sha256</em>}</li>
 *   <li>{@link appengine.Identityawareproxy#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getIdentityawareproxy()
 * @model
 * @generated
 */
public interface Identityawareproxy extends Resource {
	/**
	 * Returns the value of the '<em><b>Oauth2 Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oauth2 Client Secret</em>' attribute.
	 * @see #setOauth2ClientSecret(String)
	 * @see appengine.AppenginePackage#getIdentityawareproxy_Oauth2ClientSecret()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Identityawareproxy!oauth2ClientSecret'"
	 * @generated
	 */
	String getOauth2ClientSecret();

	/**
	 * Sets the value of the '{@link appengine.Identityawareproxy#getOauth2ClientSecret <em>Oauth2 Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth2 Client Secret</em>' attribute.
	 * @see #getOauth2ClientSecret()
	 * @generated
	 */
	void setOauth2ClientSecret(String value);

	/**
	 * Returns the value of the '<em><b>Oauth2 Client Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OAuth2 client ID to use for the authentication flow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oauth2 Client Id</em>' attribute.
	 * @see #setOauth2ClientId(String)
	 * @see appengine.AppenginePackage#getIdentityawareproxy_Oauth2ClientId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Identityawareproxy!oauth2ClientId'"
	 * @generated
	 */
	String getOauth2ClientId();

	/**
	 * Sets the value of the '{@link appengine.Identityawareproxy#getOauth2ClientId <em>Oauth2 Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth2 Client Id</em>' attribute.
	 * @see #getOauth2ClientId()
	 * @generated
	 */
	void setOauth2ClientId(String value);

	/**
	 * Returns the value of the '<em><b>Oauth2 Client Secret Sha256</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hex-encoded SHA-256 hash of the client secret.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oauth2 Client Secret Sha256</em>' attribute.
	 * @see #setOauth2ClientSecretSha256(String)
	 * @see appengine.AppenginePackage#getIdentityawareproxy_Oauth2ClientSecretSha256()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Identityawareproxy!oauth2ClientSecretSha256'"
	 * @generated
	 */
	String getOauth2ClientSecretSha256();

	/**
	 * Sets the value of the '{@link appengine.Identityawareproxy#getOauth2ClientSecretSha256 <em>Oauth2 Client Secret Sha256</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oauth2 Client Secret Sha256</em>' attribute.
	 * @see #getOauth2ClientSecretSha256()
	 * @generated
	 */
	void setOauth2ClientSecretSha256(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see appengine.AppenginePackage#getIdentityawareproxy_Enabled()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Identityawareproxy!enabled'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link appengine.Identityawareproxy#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // Identityawareproxy
