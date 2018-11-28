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

import java.util.Map;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trafficsplit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Traffic routing configuration for versions within a single service. Traffic splits define how traffic directed to the service is assigned to versions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Trafficsplit#getShardBy <em>Shard By</em>}</li>
 *   <li>{@link appengine.Trafficsplit#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getTrafficsplit()
 * @model
 * @generated
 */
public interface Trafficsplit extends Resource {
	/**
	 * Returns the value of the '<em><b>Shard By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shard By</em>' attribute.
	 * @see #setShardBy(String)
	 * @see appengine.AppenginePackage#getTrafficsplit_ShardBy()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getShardBy();

	/**
	 * Sets the value of the '{@link appengine.Trafficsplit#getShardBy <em>Shard By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shard By</em>' attribute.
	 * @see #getShardBy()
	 * @generated
	 */
	void setShardBy(String value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once, but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up to three decimal places is supported for cookie-based splits.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allocations</em>' attribute.
	 * @see #setAllocations(Map)
	 * @see appengine.AppenginePackage#getTrafficsplit_Allocations()
	 * @model dataType="appengine.map" required="true"
	 * @generated
	 */
	Map getAllocations();

	/**
	 * Sets the value of the '{@link appengine.Trafficsplit#getAllocations <em>Allocations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocations</em>' attribute.
	 * @see #getAllocations()
	 * @generated
	 */
	void setAllocations(Map value);

} // Trafficsplit
