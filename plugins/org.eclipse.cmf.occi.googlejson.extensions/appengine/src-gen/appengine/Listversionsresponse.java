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
 * A representation of the model object '<em><b>Listversionsresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response message for Versions.ListVersions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listversionsresponse#getNextPageToken <em>Next Page Token</em>}</li>
 *   <li>{@link appengine.Listversionsresponse#getVersions <em>Versions</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListversionsresponse()
 * @model
 * @generated
 */
public interface Listversionsresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListversionsresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listversionsresponse!nextPageToken'"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listversionsresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The versions belonging to the requested service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference.
	 * @see #setVersions(array)
	 * @see appengine.AppenginePackage#getListversionsresponse_Versions()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listversionsresponse!versions'"
	 * @generated
	 */
	array getVersions();

	/**
	 * Sets the value of the '{@link appengine.Listversionsresponse#getVersions <em>Versions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versions</em>' containment reference.
	 * @see #getVersions()
	 * @generated
	 */
	void setVersions(array value);

} // Listversionsresponse
