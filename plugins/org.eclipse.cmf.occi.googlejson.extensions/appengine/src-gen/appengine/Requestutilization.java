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
 * A representation of the model object '<em><b>Requestutilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target scaling by request utilization. Only applicable for VM runtimes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Requestutilization#getTargetRequestCountPerSecond <em>Target Request Count Per Second</em>}</li>
 *   <li>{@link appengine.Requestutilization#getTargetConcurrentRequests <em>Target Concurrent Requests</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getRequestutilization()
 * @model
 * @generated
 */
public interface Requestutilization extends Resource {
	/**
	 * Returns the value of the '<em><b>Target Request Count Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target requests per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Request Count Per Second</em>' attribute.
	 * @see #setTargetRequestCountPerSecond(Integer)
	 * @see appengine.AppenginePackage#getRequestutilization_TargetRequestCountPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetRequestCountPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Requestutilization#getTargetRequestCountPerSecond <em>Target Request Count Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Request Count Per Second</em>' attribute.
	 * @see #getTargetRequestCountPerSecond()
	 * @generated
	 */
	void setTargetRequestCountPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target number of concurrent requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Concurrent Requests</em>' attribute.
	 * @see #setTargetConcurrentRequests(Integer)
	 * @see appengine.AppenginePackage#getRequestutilization_TargetConcurrentRequests()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetConcurrentRequests();

	/**
	 * Sets the value of the '{@link appengine.Requestutilization#getTargetConcurrentRequests <em>Target Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Concurrent Requests</em>' attribute.
	 * @see #getTargetConcurrentRequests()
	 * @generated
	 */
	void setTargetConcurrentRequests(Integer value);

} // Requestutilization
