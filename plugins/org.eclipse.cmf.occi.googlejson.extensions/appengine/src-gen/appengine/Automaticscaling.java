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
 * A representation of the model object '<em><b>Automaticscaling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Automaticscaling#getMinPendingLatency <em>Min Pending Latency</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getMaxIdleInstances <em>Max Idle Instances</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getMinIdleInstances <em>Min Idle Instances</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getMaxTotalInstances <em>Max Total Instances</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getMinTotalInstances <em>Min Total Instances</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getCoolDownPeriod <em>Cool Down Period</em>}</li>
 *   <li>{@link appengine.Automaticscaling#getMaxPendingLatency <em>Max Pending Latency</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getAutomaticscaling()
 * @model
 * @generated
 */
public interface Automaticscaling extends Resource {
	/**
	 * Returns the value of the '<em><b>Min Pending Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Pending Latency</em>' attribute.
	 * @see #setMinPendingLatency(String)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MinPendingLatency()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!minPendingLatency'"
	 * @generated
	 */
	String getMinPendingLatency();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMinPendingLatency <em>Min Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Pending Latency</em>' attribute.
	 * @see #getMinPendingLatency()
	 * @generated
	 */
	void setMinPendingLatency(String value);

	/**
	 * Returns the value of the '<em><b>Max Idle Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of idle instances that should be maintained for this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Idle Instances</em>' attribute.
	 * @see #setMaxIdleInstances(Integer)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MaxIdleInstances()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!maxIdleInstances'"
	 * @generated
	 */
	Integer getMaxIdleInstances();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMaxIdleInstances <em>Max Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Idle Instances</em>' attribute.
	 * @see #getMaxIdleInstances()
	 * @generated
	 */
	void setMaxIdleInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Idle Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Idle Instances</em>' attribute.
	 * @see #setMinIdleInstances(Integer)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MinIdleInstances()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!minIdleInstances'"
	 * @generated
	 */
	Integer getMinIdleInstances();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMinIdleInstances <em>Min Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Idle Instances</em>' attribute.
	 * @see #getMinIdleInstances()
	 * @generated
	 */
	void setMinIdleInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Total Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of instances that should be started to handle requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Total Instances</em>' attribute.
	 * @see #setMaxTotalInstances(Integer)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MaxTotalInstances()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!maxTotalInstances'"
	 * @generated
	 */
	Integer getMaxTotalInstances();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMaxTotalInstances <em>Max Total Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Total Instances</em>' attribute.
	 * @see #getMaxTotalInstances()
	 * @generated
	 */
	void setMaxTotalInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Total Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum number of instances that should be maintained for this version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Total Instances</em>' attribute.
	 * @see #setMinTotalInstances(Integer)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MinTotalInstances()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!minTotalInstances'"
	 * @generated
	 */
	Integer getMinTotalInstances();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMinTotalInstances <em>Min Total Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Total Instances</em>' attribute.
	 * @see #getMinTotalInstances()
	 * @generated
	 */
	void setMinTotalInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #setMaxConcurrentRequests(Integer)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MaxConcurrentRequests()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!maxConcurrentRequests'"
	 * @generated
	 */
	Integer getMaxConcurrentRequests();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Concurrent Requests</em>' attribute.
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 */
	void setMaxConcurrentRequests(Integer value);

	/**
	 * Returns the value of the '<em><b>Cool Down Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount of time that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait between changes to the number of virtual machines. Only applicable for VM runtimes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cool Down Period</em>' attribute.
	 * @see #setCoolDownPeriod(String)
	 * @see appengine.AppenginePackage#getAutomaticscaling_CoolDownPeriod()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!coolDownPeriod'"
	 * @generated
	 */
	String getCoolDownPeriod();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getCoolDownPeriod <em>Cool Down Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cool Down Period</em>' attribute.
	 * @see #getCoolDownPeriod()
	 * @generated
	 */
	void setCoolDownPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Max Pending Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pending Latency</em>' attribute.
	 * @see #setMaxPendingLatency(String)
	 * @see appengine.AppenginePackage#getAutomaticscaling_MaxPendingLatency()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Automaticscaling!maxPendingLatency'"
	 * @generated
	 */
	String getMaxPendingLatency();

	/**
	 * Sets the value of the '{@link appengine.Automaticscaling#getMaxPendingLatency <em>Max Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pending Latency</em>' attribute.
	 * @see #getMaxPendingLatency()
	 * @generated
	 */
	void setMaxPendingLatency(String value);

} // Automaticscaling
