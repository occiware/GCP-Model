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
 * A representation of the model object '<em><b>Authorizeddomain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A domain that a user has been authorized to administer. To authorize use of a domain, verify ownership via Webmaster Central (https://www.google.com/webmasters/verification/home).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Authorizeddomain#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getAuthorizeddomain()
 * @model
 * @generated
 */
public interface Authorizeddomain extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the AuthorizedDomain resource in the API. Example: apps/myapp/authorizedDomains/example.com.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getAuthorizeddomain_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizeddomain!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Authorizeddomain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists all domains the user is authorized to administer.
	 * @param appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * @param pageSize Maximum results to return per page.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true" pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizeddomain!list(String,String,Integer)'"
	 * @generated
	 */
	void list(String appsId, String pageToken, Integer pageSize);

} // Authorizeddomain
