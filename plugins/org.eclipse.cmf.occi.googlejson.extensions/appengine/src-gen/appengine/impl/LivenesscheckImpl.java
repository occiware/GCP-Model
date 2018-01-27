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
import appengine.Livenesscheck;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Livenesscheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getFailureThreshold <em>Failure Threshold</em>}</li>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getPath <em>Path</em>}</li>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getHost <em>Host</em>}</li>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getSuccessThreshold <em>Success Threshold</em>}</li>
 *   <li>{@link appengine.impl.LivenesscheckImpl#getCheckInterval <em>Check Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LivenesscheckImpl extends ResourceImpl implements Livenesscheck {
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
	 * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialDelay()
	 * @generated
	 * @ordered
	 */
	protected String initialDelay = INITIAL_DELAY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivenesscheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getLivenesscheck();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__FAILURE_THRESHOLD, oldFailureThreshold, failureThreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialDelay() {
		return initialDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialDelay(String newInitialDelay) {
		String oldInitialDelay = initialDelay;
		initialDelay = newInitialDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__INITIAL_DELAY, oldInitialDelay, initialDelay));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__SUCCESS_THRESHOLD, oldSuccessThreshold, successThreshold));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LIVENESSCHECK__CHECK_INTERVAL, oldCheckInterval, checkInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.LIVENESSCHECK__FAILURE_THRESHOLD:
				return getFailureThreshold();
			case AppenginePackage.LIVENESSCHECK__TIMEOUT:
				return getTimeout();
			case AppenginePackage.LIVENESSCHECK__INITIAL_DELAY:
				return getInitialDelay();
			case AppenginePackage.LIVENESSCHECK__PATH:
				return getPath();
			case AppenginePackage.LIVENESSCHECK__HOST:
				return getHost();
			case AppenginePackage.LIVENESSCHECK__SUCCESS_THRESHOLD:
				return getSuccessThreshold();
			case AppenginePackage.LIVENESSCHECK__CHECK_INTERVAL:
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
			case AppenginePackage.LIVENESSCHECK__FAILURE_THRESHOLD:
				setFailureThreshold((Integer)newValue);
				return;
			case AppenginePackage.LIVENESSCHECK__TIMEOUT:
				setTimeout((String)newValue);
				return;
			case AppenginePackage.LIVENESSCHECK__INITIAL_DELAY:
				setInitialDelay((String)newValue);
				return;
			case AppenginePackage.LIVENESSCHECK__PATH:
				setPath((String)newValue);
				return;
			case AppenginePackage.LIVENESSCHECK__HOST:
				setHost((String)newValue);
				return;
			case AppenginePackage.LIVENESSCHECK__SUCCESS_THRESHOLD:
				setSuccessThreshold((Integer)newValue);
				return;
			case AppenginePackage.LIVENESSCHECK__CHECK_INTERVAL:
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
			case AppenginePackage.LIVENESSCHECK__FAILURE_THRESHOLD:
				setFailureThreshold(FAILURE_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.LIVENESSCHECK__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case AppenginePackage.LIVENESSCHECK__INITIAL_DELAY:
				setInitialDelay(INITIAL_DELAY_EDEFAULT);
				return;
			case AppenginePackage.LIVENESSCHECK__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AppenginePackage.LIVENESSCHECK__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case AppenginePackage.LIVENESSCHECK__SUCCESS_THRESHOLD:
				setSuccessThreshold(SUCCESS_THRESHOLD_EDEFAULT);
				return;
			case AppenginePackage.LIVENESSCHECK__CHECK_INTERVAL:
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
			case AppenginePackage.LIVENESSCHECK__FAILURE_THRESHOLD:
				return FAILURE_THRESHOLD_EDEFAULT == null ? failureThreshold != null : !FAILURE_THRESHOLD_EDEFAULT.equals(failureThreshold);
			case AppenginePackage.LIVENESSCHECK__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case AppenginePackage.LIVENESSCHECK__INITIAL_DELAY:
				return INITIAL_DELAY_EDEFAULT == null ? initialDelay != null : !INITIAL_DELAY_EDEFAULT.equals(initialDelay);
			case AppenginePackage.LIVENESSCHECK__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AppenginePackage.LIVENESSCHECK__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case AppenginePackage.LIVENESSCHECK__SUCCESS_THRESHOLD:
				return SUCCESS_THRESHOLD_EDEFAULT == null ? successThreshold != null : !SUCCESS_THRESHOLD_EDEFAULT.equals(successThreshold);
			case AppenginePackage.LIVENESSCHECK__CHECK_INTERVAL:
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
		result.append(" (failureThreshold: ");
		result.append(failureThreshold);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", initialDelay: ");
		result.append(initialDelay);
		result.append(", path: ");
		result.append(path);
		result.append(", host: ");
		result.append(host);
		result.append(", successThreshold: ");
		result.append(successThreshold);
		result.append(", checkInterval: ");
		result.append(checkInterval);
		result.append(')');
		return result.toString();
	}

} //LivenesscheckImpl
