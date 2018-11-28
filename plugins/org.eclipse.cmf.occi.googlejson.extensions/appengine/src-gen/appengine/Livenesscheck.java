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
 * A representation of the model object '<em><b>Livenesscheck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Livenesscheck#getFailureThreshold <em>Failure Threshold</em>}</li>
 *   <li>{@link appengine.Livenesscheck#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link appengine.Livenesscheck#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link appengine.Livenesscheck#getPath <em>Path</em>}</li>
 *   <li>{@link appengine.Livenesscheck#getHost <em>Host</em>}</li>
 *   <li>{@link appengine.Livenesscheck#getSuccessThreshold <em>Success Threshold</em>}</li>
 *   <li>{@link appengine.Livenesscheck#getCheckInterval <em>Check Interval</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getLivenesscheck()
 * @model
 * @generated
 */
public interface Livenesscheck extends Resource {
	/**
	 * Returns the value of the '<em><b>Failure Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of consecutive failed checks required before considering the VM unhealthy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Threshold</em>' attribute.
	 * @see #setFailureThreshold(Integer)
	 * @see appengine.AppenginePackage#getLivenesscheck_FailureThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getFailureThreshold();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getFailureThreshold <em>Failure Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Threshold</em>' attribute.
	 * @see #getFailureThreshold()
	 * @generated
	 */
	void setFailureThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time before the check is considered failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see appengine.AppenginePackage#getLivenesscheck_Timeout()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Initial Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The initial delay before starting to execute the checks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial Delay</em>' attribute.
	 * @see #setInitialDelay(String)
	 * @see appengine.AppenginePackage#getLivenesscheck_InitialDelay()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getInitialDelay();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getInitialDelay <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Delay</em>' attribute.
	 * @see #getInitialDelay()
	 * @generated
	 */
	void setInitialDelay(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see appengine.AppenginePackage#getLivenesscheck_Path()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see appengine.AppenginePackage#getLivenesscheck_Host()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Success Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of consecutive successful checks required before considering the VM healthy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Success Threshold</em>' attribute.
	 * @see #setSuccessThreshold(Integer)
	 * @see appengine.AppenginePackage#getLivenesscheck_SuccessThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getSuccessThreshold();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getSuccessThreshold <em>Success Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Threshold</em>' attribute.
	 * @see #getSuccessThreshold()
	 * @generated
	 */
	void setSuccessThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Check Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interval between health checks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Interval</em>' attribute.
	 * @see #setCheckInterval(String)
	 * @see appengine.AppenginePackage#getLivenesscheck_CheckInterval()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getCheckInterval();

	/**
	 * Sets the value of the '{@link appengine.Livenesscheck#getCheckInterval <em>Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Interval</em>' attribute.
	 * @see #getCheckInterval()
	 * @generated
	 */
	void setCheckInterval(String value);

} // Livenesscheck
