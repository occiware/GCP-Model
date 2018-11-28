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
 * A representation of the model object '<em><b>Listingressrulesresponse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Response message for Firewall.ListIngressRules.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Listingressrulesresponse#getNextPageToken <em>Next Page Token</em>}</li>
 *   <li>{@link appengine.Listingressrulesresponse#getIngressRules <em>Ingress Rules</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getListingressrulesresponse()
 * @model
 * @generated
 */
public interface Listingressrulesresponse extends Resource {
	/**
	 * Returns the value of the '<em><b>Next Page Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Page Token</em>' attribute.
	 * @see #setNextPageToken(String)
	 * @see appengine.AppenginePackage#getListingressrulesresponse_NextPageToken()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getNextPageToken();

	/**
	 * Sets the value of the '{@link appengine.Listingressrulesresponse#getNextPageToken <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Page Token</em>' attribute.
	 * @see #getNextPageToken()
	 * @generated
	 */
	void setNextPageToken(String value);

	/**
	 * Returns the value of the '<em><b>Ingress Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ingress FirewallRules for this application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ingress Rules</em>' containment reference.
	 * @see #setIngressRules(array)
	 * @see appengine.AppenginePackage#getListingressrulesresponse_IngressRules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getIngressRules();

	/**
	 * Sets the value of the '{@link appengine.Listingressrulesresponse#getIngressRules <em>Ingress Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingress Rules</em>' containment reference.
	 * @see #getIngressRules()
	 * @generated
	 */
	void setIngressRules(array value);

} // Listingressrulesresponse
