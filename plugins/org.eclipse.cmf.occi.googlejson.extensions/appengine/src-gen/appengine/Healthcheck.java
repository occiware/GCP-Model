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
 * A representation of the model object '<em><b>Healthcheck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances. Only applicable for instances in App Engine flexible environment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Healthcheck#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link appengine.Healthcheck#getUnhealthyThreshold <em>Unhealthy Threshold</em>}</li>
 *   <li>{@link appengine.Healthcheck#isDisableHealthCheck <em>Disable Health Check</em>}</li>
 *   <li>{@link appengine.Healthcheck#getHost <em>Host</em>}</li>
 *   <li>{@link appengine.Healthcheck#getHealthyThreshold <em>Healthy Threshold</em>}</li>
 *   <li>{@link appengine.Healthcheck#getRestartThreshold <em>Restart Threshold</em>}</li>
 *   <li>{@link appengine.Healthcheck#getCheckInterval <em>Check Interval</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getHealthcheck()
 * @model
 * @generated
 */
public interface Healthcheck extends Resource {
	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time before the health check is considered failed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see appengine.AppenginePackage#getHealthcheck_Timeout()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Unhealthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of consecutive failed health checks required before removing traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unhealthy Threshold</em>' attribute.
	 * @see #setUnhealthyThreshold(Integer)
	 * @see appengine.AppenginePackage#getHealthcheck_UnhealthyThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!unhealthyThreshold'"
	 * @generated
	 */
	Integer getUnhealthyThreshold();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#getUnhealthyThreshold <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unhealthy Threshold</em>' attribute.
	 * @see #getUnhealthyThreshold()
	 * @generated
	 */
	void setUnhealthyThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Disable Health Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to explicitly disable health checks for this instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disable Health Check</em>' attribute.
	 * @see #setDisableHealthCheck(boolean)
	 * @see appengine.AppenginePackage#getHealthcheck_DisableHealthCheck()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!disableHealthCheck'"
	 * @generated
	 */
	boolean isDisableHealthCheck();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#isDisableHealthCheck <em>Disable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Health Check</em>' attribute.
	 * @see #isDisableHealthCheck()
	 * @generated
	 */
	void setDisableHealthCheck(boolean value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Host header to send when performing an HTTP health check. Example: "myapp.appspot.com"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see appengine.AppenginePackage#getHealthcheck_Host()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!host'"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Healthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of consecutive successful health checks required before receiving traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthy Threshold</em>' attribute.
	 * @see #setHealthyThreshold(Integer)
	 * @see appengine.AppenginePackage#getHealthcheck_HealthyThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!healthyThreshold'"
	 * @generated
	 */
	Integer getHealthyThreshold();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#getHealthyThreshold <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthy Threshold</em>' attribute.
	 * @see #getHealthyThreshold()
	 * @generated
	 */
	void setHealthyThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Restart Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of consecutive failed health checks required before an instance is restarted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Restart Threshold</em>' attribute.
	 * @see #setRestartThreshold(Integer)
	 * @see appengine.AppenginePackage#getHealthcheck_RestartThreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!restartThreshold'"
	 * @generated
	 */
	Integer getRestartThreshold();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#getRestartThreshold <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Threshold</em>' attribute.
	 * @see #getRestartThreshold()
	 * @generated
	 */
	void setRestartThreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Check Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interval between health checks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Interval</em>' attribute.
	 * @see #setCheckInterval(String)
	 * @see appengine.AppenginePackage#getHealthcheck_CheckInterval()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Healthcheck!checkInterval'"
	 * @generated
	 */
	String getCheckInterval();

	/**
	 * Sets the value of the '{@link appengine.Healthcheck#getCheckInterval <em>Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Interval</em>' attribute.
	 * @see #getCheckInterval()
	 * @generated
	 */
	void setCheckInterval(String value);

} // Healthcheck
