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
import appengine.Readinesscheck;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Readinesscheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getPath <em>Path</em>}</li>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getHost <em>Host</em>}</li>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getSuccessThreshold <em>Success Threshold</em>}</li>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getCheckInterval <em>Check Interval</em>}</li>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getFailureThreshold <em>Failure Threshold</em>}</li>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link appengine.impl.ReadinesscheckImpl#getAppStartTimeout <em>App Start Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadinesscheckImpl extends ResourceImpl implements Readinesscheck {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	 * The default value of the '{@link #getSuccessThreshold() <em>Success Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUCCESS_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuccessThreshold() <em>Success Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer successThreshold = SUCCESS_THRESHOLD_EDEFAULT;

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
	 * The default value of the '{@link #getFailureThreshold() <em>Failure Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FAILURE_THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailureThreshold() <em>Failure Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureThreshold()
	 * @generated
	 * @ordered
	 */
	protected Integer failureThreshold = FAILURE_THRESHOLD_EDEFAULT;

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
	 * The default value of the '{@link #getAppStartTimeout() <em>App Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_START_TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppStartTimeout() <em>App Start Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppStartTimeout()
	 * @generated
	 * @ordered
	 */
	protected String appStartTimeout = APP_START_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadinesscheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getReadinesscheck();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSuccessThreshold() {
		return successThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessThreshold(Integer newSuccessThreshold) {
		Integer oldSuccessThreshold = successThreshold;
		successThreshold = newSuccessThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__SUCCESS_THRESHOLD, oldSuccessThreshold, successThreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__CHECK_INTERVAL, oldCheckInterval, checkInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFailureThreshold() {
		return failureThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailureThreshold(Integer newFailureThreshold) {
		Integer oldFailureThreshold = failureThreshold;
		failureThreshold = newFailureThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__FAILURE_THRESHOLD, oldFailureThreshold, failureThreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppStartTimeout() {
		return appStartTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppStartTimeout(String newAppStartTimeout) {
		String oldAppStartTimeout = appStartTimeout;
		appStartTimeout = newAppStartTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.READINESSCHECK__APP_START_TIMEOUT, oldAppStartTimeout, appStartTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.READINESSCHECK__PATH:
				return getPath();
			case AppenginePackage.READINESSCHECK__HOST:
				return getHost();
			case AppenginePackage.READINESSCHECK__SUCCESS_THRESHOLD:
				return getSuccessThreshold();
			case AppenginePackage.READINESSCHECK__CHECK_INTERVAL:
				return getCheckInterval();
			case AppenginePackage.READINESSCHECK__FAILURE_THRESHOLD:
				return getFailureThreshold();
			case AppenginePackage.READINESSCHECK__TIMEOUT:
				return getTimeout();
			case AppenginePackage.READINESSCHECK__APP_START_TIMEOUT:
				return getAppStartTimeout();
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
			case AppenginePackage.READINESSCHECK__PATH:
				setPath((String)newValue);
				return;
			case AppenginePackage.READINESSCHECK__HOST:
				setHost((String)newValue);
				return;
			case AppenginePackage.READINESSCHECK__SUCCESS_THRESHOLD:
				setSuccessThreshold((Integer)newValue);
				return;
			case AppenginePackage.READINESSCHECK__CHECK_INTERVAL:
				setCheckInterval((String)newValue);
				return;
			case AppenginePackage.READINESSCHECK__FAILURE_THRESHOLD:
				setFailureThreshold((Integer)newValue);
				return;
			case AppenginePackage.READINESSCHECK__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case AppenginePackage.READINESSCHECK__APP_START_TIMEOUT:
				setAppStartTimeout((String)newValue);
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
			case AppenginePackage.READINESSCHECK__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AppenginePackage.READINESSCHECK__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case AppenginePackage.READINESSCHECK__SUCCESS_THRESHOLD:
				setSuccessThreshold(SUCCESS_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.READINESSCHECK__CHECK_INTERVAL:
				setCheckInterval(CHECK_INTERVAL_EDEFAULT);
				return;
			case AppenginePackage.READINESSCHECK__FAILURE_THRESHOLD:
				setFailureThreshold(FAILURE_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.READINESSCHECK__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case AppenginePackage.READINESSCHECK__APP_START_TIMEOUT:
				setAppStartTimeout(APP_START_TIMEOUT_EDEFAULT);
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
			case AppenginePackage.READINESSCHECK__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AppenginePackage.READINESSCHECK__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case AppenginePackage.READINESSCHECK__SUCCESS_THRESHOLD:
				return SUCCESS_THRESHOLD_EDEFAULT == null ? successThreshold != null : !SUCCESS_THRESHOLD_EDEFAULT.equals(successThreshold);
			case AppenginePackage.READINESSCHECK__CHECK_INTERVAL:
				return CHECK_INTERVAL_EDEFAULT == null ? checkInterval != null : !CHECK_INTERVAL_EDEFAULT.equals(checkInterval);
			case AppenginePackage.READINESSCHECK__FAILURE_THRESHOLD:
				return FAILURE_THRESHOLD_EDEFAULT == null ? failureThreshold != null : !FAILURE_THRESHOLD_EDEFAULT.equals(failureThreshold);
			case AppenginePackage.READINESSCHECK__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case AppenginePackage.READINESSCHECK__APP_START_TIMEOUT:
				return APP_START_TIMEOUT_EDEFAULT == null ? appStartTimeout != null : !APP_START_TIMEOUT_EDEFAULT.equals(appStartTimeout);
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
		result.append(" (path: ");
		result.append(path);
		result.append(", host: ");
		result.append(host);
		result.append(", successThreshold: ");
		result.append(successThreshold);
		result.append(", checkInterval: ");
		result.append(checkInterval);
		result.append(", failureThreshold: ");
		result.append(failureThreshold);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", appStartTimeout: ");
		result.append(appStartTimeout);
		result.append(')');
		return result.toString();
	}

} //ReadinesscheckImpl
