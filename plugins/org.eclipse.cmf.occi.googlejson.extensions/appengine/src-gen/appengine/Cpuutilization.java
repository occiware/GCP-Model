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
 * A representation of the model object '<em><b>Cpuutilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target scaling by CPU usage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Cpuutilization#getAggregationWindowLength <em>Aggregation Window Length</em>}</li>
 *   <li>{@link appengine.Cpuutilization#getTargetUtilization <em>Target Utilization</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getCpuutilization()
 * @model
 * @generated
 */
public interface Cpuutilization extends Resource {
	/**
	 * Returns the value of the '<em><b>Aggregation Window Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Period of time over which CPU utilization is calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Window Length</em>' attribute.
	 * @see #setAggregationWindowLength(String)
	 * @see appengine.AppenginePackage#getCpuutilization_AggregationWindowLength()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getAggregationWindowLength();

	/**
	 * Sets the value of the '{@link appengine.Cpuutilization#getAggregationWindowLength <em>Aggregation Window Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Window Length</em>' attribute.
	 * @see #getAggregationWindowLength()
	 * @generated
	 */
	void setAggregationWindowLength(String value);

	/**
	 * Returns the value of the '<em><b>Target Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Utilization</em>' attribute.
	 * @see #setTargetUtilization(Integer)
	 * @see appengine.AppenginePackage#getCpuutilization_TargetUtilization()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetUtilization();

	/**
	 * Sets the value of the '{@link appengine.Cpuutilization#getTargetUtilization <em>Target Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Utilization</em>' attribute.
	 * @see #getTargetUtilization()
	 * @generated
	 */
	void setTargetUtilization(Integer value);

} // Cpuutilization
