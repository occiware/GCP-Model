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
 * A representation of the model object '<em><b>Readinesscheck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Readiness checking configuration for VM instances. Unhealthy instances are removed from traffic rotation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Readinesscheck#getPath <em>Path</em>}</li>
 *   <li>{@link appengine.Readinesscheck#getHost <em>Host</em>}</li>
 *   <li>{@link appengine.Readinesscheck#getSuccessThreshold <em>Success Threshold</em>}</li>
 *   <li>{@link appengine.Readinesscheck#getCheckInterval <em>Check Interval</em>}</li>
 *   <li>{@link appengine.Readinesscheck#getFailureThreshold <em>Failure Threshold</em>}</li>
 *   <li>{@link appengine.Readinesscheck#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link appengine.Readinesscheck#getAppStartTimeout <em>App Start Timeout</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getReadinesscheck()
 * @model
 * @generated
 */
public interface Readinesscheck extends Resource {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The request path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see appengine.AppenginePackage#getReadinesscheck_Path()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getPath <em>Path</em>}' attribute.
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
	 * Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see appengine.AppenginePackage#getReadinesscheck_Host()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getHost <em>Host</em>}' attribute.
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
	 * Number of consecutive successful checks required before receiving traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Success Threshold</em>' attribute.
	 * @see #setSuccessThreshold(Integer)
	 * @see appengine.AppenginePackage#getReadinesscheck_SuccessThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getSuccessThreshold();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getSuccessThreshold <em>Success Threshold</em>}' attribute.
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
	 * @see appengine.AppenginePackage#getReadinesscheck_CheckInterval()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getCheckInterval();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getCheckInterval <em>Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Interval</em>' attribute.
	 * @see #getCheckInterval()
	 * @generated
	 */
	void setCheckInterval(String value);

	/**
	 * Returns the value of the '<em><b>Failure Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of consecutive failed checks required before removing traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure Threshold</em>' attribute.
	 * @see #setFailureThreshold(Integer)
	 * @see appengine.AppenginePackage#getReadinesscheck_FailureThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getFailureThreshold();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getFailureThreshold <em>Failure Threshold</em>}' attribute.
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
	 * @see appengine.AppenginePackage#getReadinesscheck_Timeout()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>App Start Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Start Timeout</em>' attribute.
	 * @see #setAppStartTimeout(String)
	 * @see appengine.AppenginePackage#getReadinesscheck_AppStartTimeout()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getAppStartTimeout();

	/**
	 * Sets the value of the '{@link appengine.Readinesscheck#getAppStartTimeout <em>App Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Start Timeout</em>' attribute.
	 * @see #getAppStartTimeout()
	 * @generated
	 */
	void setAppStartTimeout(String value);

} // Readinesscheck
