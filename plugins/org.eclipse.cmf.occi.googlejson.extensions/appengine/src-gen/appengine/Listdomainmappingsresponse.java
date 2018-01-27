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
 * A representation of the model object '<em><b>Listdomainmappingsresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response message for DomainMappings.ListDomainMappings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listdomainmappingsresponse#getNextPageToken <em>Next Page Token</em>}</li>
 *   <li>{@link appengine.Listdomainmappingsresponse#getDomainMappings <em>Domain Mappings</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListdomainmappingsresponse()
 * @model
 * @generated
 */
public interface Listdomainmappingsresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListdomainmappingsresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listdomainmappingsresponse!nextPageToken'"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listdomainmappingsresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

	/**
	 * Returns the value of the '<em><b>Domain Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The domain mappings for the application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Mappings</em>' containment reference.
	 * @see #setDomainMappings(array)
	 * @see appengine.AppenginePackage#getListdomainmappingsresponse_DomainMappings()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listdomainmappingsresponse!domainMappings'"
	 * @generated
	 */
	array getDomainMappings();

	/**
	 * Sets the value of the '{@link appengine.Listdomainmappingsresponse#getDomainMappings <em>Domain Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Mappings</em>' containment reference.
	 * @see #getDomainMappings()
	 * @generated
	 */
	void setDomainMappings(array value);

} // Listdomainmappingsresponse
