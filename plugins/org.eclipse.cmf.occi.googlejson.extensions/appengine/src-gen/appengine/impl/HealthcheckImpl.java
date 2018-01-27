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
package appengine.impl;

import appengine.AppenginePackage;
import appengine.Healthcheck;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.HealthcheckImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link appengine.impl.HealthcheckImpl#getUnhealthyThreshold <em>Unhealthy Threshold</em>}</li>
 *   <li>{@link appengine.impl.HealthcheckImpl#isDisableHealthCheck <em>Disable Health Check</em>}</li>
 *   <li>{@link appengine.impl.HealthcheckImpl#getHost <em>Host</em>}</li>
 *   <li>{@link appengine.impl.HealthcheckImpl#getHealthyThreshold <em>Healthy Threshold</em>}</li>
 *   <li>{@link appengine.impl.HealthcheckImpl#getRestartThreshold <em>Restart Threshold</em>}</li>
 *   <li>{@link appengine.impl.HealthcheckImpl#getCheckInterval <em>Check Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcheckImpl extends ResourceImpl implements Healthcheck {
	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnhealthyThreshold() <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNHEALTHY_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnhealthyThreshold() <em>Unhealthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer unhealthyThreshold = UNHEALTHY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisableHealthCheck() <em>Disable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLE_HEALTH_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisableHealthCheck() <em>Disable Health Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisableHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean disableHealthCheck = DISABLE_HEALTH_CHECK_EDEFAULT;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getHealthyThreshold() <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEALTHY_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHealthyThreshold() <em>Healthy Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthyThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer healthyThreshold = HEALTHY_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestartThreshold() <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESTART_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestartThreshold() <em>Restart Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestartThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer restartThreshold = RESTART_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckInterval() <em>Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInterval() <em>Check Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckInterval()
	 * @generated
	 * @ordered
	 */
	protected String checkInterval = CHECK_INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getHealthcheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUnhealthyThreshold() {
		return unhealthyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnhealthyThreshold(Integer newUnhealthyThreshold) {
		Integer oldUnhealthyThreshold = unhealthyThreshold;
		unhealthyThreshold = newUnhealthyThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__UNHEALTHY_THRESHOLD, oldUnhealthyThreshold, unhealthyThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisableHealthCheck() {
		return disableHealthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableHealthCheck(boolean newDisableHealthCheck) {
		boolean oldDisableHealthCheck = disableHealthCheck;
		disableHealthCheck = newDisableHealthCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__DISABLE_HEALTH_CHECK, oldDisableHealthCheck, disableHealthCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHealthyThreshold() {
		return healthyThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthyThreshold(Integer newHealthyThreshold) {
		Integer oldHealthyThreshold = healthyThreshold;
		healthyThreshold = newHealthyThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__HEALTHY_THRESHOLD, oldHealthyThreshold, healthyThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRestartThreshold() {
		return restartThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestartThreshold(Integer newRestartThreshold) {
		Integer oldRestartThreshold = restartThreshold;
		restartThreshold = newRestartThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__RESTART_THRESHOLD, oldRestartThreshold, restartThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckInterval() {
		return checkInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInterval(String newCheckInterval) {
		String oldCheckInterval = checkInterval;
		checkInterval = newCheckInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.HEALTHCHECK__CHECK_INTERVAL, oldCheckInterval, checkInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.HEALTHCHECK__TIMEOUT:
				return getTimeout();
			case AppenginePackage.HEALTHCHECK__UNHEALTHY_THRESHOLD:
				return getUnhealthyThreshold();
			case AppenginePackage.HEALTHCHECK__DISABLE_HEALTH_CHECK:
				return isDisableHealthCheck();
			case AppenginePackage.HEALTHCHECK__HOST:
				return getHost();
			case AppenginePackage.HEALTHCHECK__HEALTHY_THRESHOLD:
				return getHealthyThreshold();
			case AppenginePackage.HEALTHCHECK__RESTART_THRESHOLD:
				return getRestartThreshold();
			case AppenginePackage.HEALTHCHECK__CHECK_INTERVAL:
				return getCheckInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppenginePackage.HEALTHCHECK__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case AppenginePackage.HEALTHCHECK__UNHEALTHY_THRESHOLD:
				setUnhealthyThreshold((Integer)newValue);
				return;
			case AppenginePackage.HEALTHCHECK__DISABLE_HEALTH_CHECK:
				setDisableHealthCheck((Boolean)newValue);
				return;
			case AppenginePackage.HEALTHCHECK__HOST:
				setHost((String)newValue);
				return;
			case AppenginePackage.HEALTHCHECK__HEALTHY_THRESHOLD:
				setHealthyThreshold((Integer)newValue);
				return;
			case AppenginePackage.HEALTHCHECK__RESTART_THRESHOLD:
				setRestartThreshold((Integer)newValue);
				return;
			case AppenginePackage.HEALTHCHECK__CHECK_INTERVAL:
				setCheckInterval((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AppenginePackage.HEALTHCHECK__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case AppenginePackage.HEALTHCHECK__UNHEALTHY_THRESHOLD:
				setUnhealthyThreshold(UNHEALTHY_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.HEALTHCHECK__DISABLE_HEALTH_CHECK:
				setDisableHealthCheck(DISABLE_HEALTH_CHECK_EDEFAULT);
				return;
			case AppenginePackage.HEALTHCHECK__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case AppenginePackage.HEALTHCHECK__HEALTHY_THRESHOLD:
				setHealthyThreshold(HEALTHY_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.HEALTHCHECK__RESTART_THRESHOLD:
				setRestartThreshold(RESTART_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.HEALTHCHECK__CHECK_INTERVAL:
				setCheckInterval(CHECK_INTERVAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AppenginePackage.HEALTHCHECK__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case AppenginePackage.HEALTHCHECK__UNHEALTHY_THRESHOLD:
				return UNHEALTHY_THRESHOLD_EDEFAULT == null ? unhealthyThreshold != null : !UNHEALTHY_THRESHOLD_EDEFAULT.equals(unhealthyThreshold);
			case AppenginePackage.HEALTHCHECK__DISABLE_HEALTH_CHECK:
				return disableHealthCheck != DISABLE_HEALTH_CHECK_EDEFAULT;
			case AppenginePackage.HEALTHCHECK__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case AppenginePackage.HEALTHCHECK__HEALTHY_THRESHOLD:
				return HEALTHY_THRESHOLD_EDEFAULT == null ? healthyThreshold != null : !HEALTHY_THRESHOLD_EDEFAULT.equals(healthyThreshold);
			case AppenginePackage.HEALTHCHECK__RESTART_THRESHOLD:
				return RESTART_THRESHOLD_EDEFAULT == null ? restartThreshold != null : !RESTART_THRESHOLD_EDEFAULT.equals(restartThreshold);
			case AppenginePackage.HEALTHCHECK__CHECK_INTERVAL:
				return CHECK_INTERVAL_EDEFAULT == null ? checkInterval != null : !CHECK_INTERVAL_EDEFAULT.equals(checkInterval);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timeout: ");
		result.append(timeout);
		result.append(", unhealthyThreshold: ");
		result.append(unhealthyThreshold);
		result.append(", disableHealthCheck: ");
		result.append(disableHealthCheck);
		result.append(", host: ");
		result.append(host);
		result.append(", healthyThreshold: ");
		result.append(healthyThreshold);
		result.append(", restartThreshold: ");
		result.append(restartThreshold);
		result.append(", checkInterval: ");
		result.append(checkInterval);
		result.append(')');
		return result.toString();
	}

} //HealthcheckImpl
