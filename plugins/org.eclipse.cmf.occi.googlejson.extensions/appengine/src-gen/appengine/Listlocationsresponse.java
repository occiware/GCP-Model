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
 * A representation of the model object '<em><b>Listlocationsresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The response message for Locations.ListLocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listlocationsresponse#getNextPageToken <em>Next Page Token</em>}</li>
 *   <li>{@link appengine.Listlocationsresponse#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListlocationsresponse()
 * @model
 * @generated
 */
public interface Listlocationsresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The standard List next-page token.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListlocationsresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listlocationsresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of locations that matches the specified filter in the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(array)
	 * @see appengine.AppenginePackage#getListlocationsresponse_Locations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getLocations();

	/**
	 * Sets the value of the '{@link appengine.Listlocationsresponse#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(array value);

} // Listlocationsresponse
