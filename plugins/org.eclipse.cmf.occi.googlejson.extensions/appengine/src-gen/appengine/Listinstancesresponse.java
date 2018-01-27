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
 * A representation of the model object '<em><b>Listinstancesresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response message for Instances.ListInstances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listinstancesresponse#getInstances <em>Instances</em>}</li>
 *   <li>{@link appengine.Listinstancesresponse#getNextPageToken <em>Next Page Token</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListinstancesresponse()
 * @model
 * @generated
 */
public interface Listinstancesresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instances belonging to the requested version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(array)
	 * @see appengine.AppenginePackage#getListinstancesresponse_Instances()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listinstancesresponse!instances'"
	 * @generated
	 */
	array getInstances();

	/**
	 * Sets the value of the '{@link appengine.Listinstancesresponse#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(array value);

	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListinstancesresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Listinstancesresponse!nextPageToken'"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listinstancesresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

} // Listinstancesresponse
