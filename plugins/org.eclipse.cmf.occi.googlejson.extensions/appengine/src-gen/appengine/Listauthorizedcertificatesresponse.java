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
 * A representation of the model object '<em><b>Listauthorizedcertificatesresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response message for AuthorizedCertificates.ListAuthorizedCertificates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listauthorizedcertificatesresponse#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link appengine.Listauthorizedcertificatesresponse#getNextPageToken <em>Next Page Token</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListauthorizedcertificatesresponse()
 * @model
 * @generated
 */
public interface Listauthorizedcertificatesresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Certificates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SSL certificates the user is authorized to administer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificates</em>' containment reference.
	 * @see #setCertificates(array)
	 * @see appengine.AppenginePackage#getListauthorizedcertificatesresponse_Certificates()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listauthorizedcertificatesresponse!certificates'"
	 * @generated
	 */
	array getCertificates();

	/**
	 * Sets the value of the '{@link appengine.Listauthorizedcertificatesresponse#getCertificates <em>Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificates</em>' containment reference.
	 * @see #getCertificates()
	 * @generated
	 */
	void setCertificates(array value);

	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListauthorizedcertificatesresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listauthorizedcertificatesresponse!nextPageToken'"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listauthorizedcertificatesresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

} // Listauthorizedcertificatesresponse
