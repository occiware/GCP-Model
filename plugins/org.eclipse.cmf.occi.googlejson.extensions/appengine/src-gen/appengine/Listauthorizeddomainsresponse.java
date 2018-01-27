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
 * A representation of the model object '<em><b>Listauthorizeddomainsresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response message for AuthorizedDomains.ListAuthorizedDomains.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listauthorizeddomainsresponse#getDomains <em>Domains</em>}</li>
 *   <li>{@link appengine.Listauthorizeddomainsresponse#getNextPageToken <em>Next Page Token</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListauthorizeddomainsresponse()
 * @model
 * @generated
 */
public interface Listauthorizeddomainsresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The authorized domains belonging to the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference.
	 * @see #setDomains(array)
	 * @see appengine.AppenginePackage#getListauthorizeddomainsresponse_Domains()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listauthorizeddomainsresponse!domains'"
	 * @generated
	 */
	array getDomains();

	/**
	 * Sets the value of the '{@link appengine.Listauthorizeddomainsresponse#getDomains <em>Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domains</em>' containment reference.
	 * @see #getDomains()
	 * @generated
	 */
	void setDomains(array value);

	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListauthorizeddomainsresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listauthorizeddomainsresponse!nextPageToken'"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listauthorizeddomainsresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

} // Listauthorizeddomainsresponse
