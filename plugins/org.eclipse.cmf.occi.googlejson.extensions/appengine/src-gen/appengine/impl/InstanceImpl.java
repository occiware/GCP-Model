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
import appengine.Instance;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.InstanceImpl#getAverageLatency <em>Average Latency</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getVmIp <em>Vm Ip</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getVmStatus <em>Vm Status</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getErrors <em>Errors</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#isVmDebugEnabled <em>Vm Debug Enabled</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getAppEngineRelease <em>App Engine Release</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getVmName <em>Vm Name</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getQps <em>Qps</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getVmId <em>Vm Id</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getVmZoneName <em>Vm Zone Name</em>}</li>
 *   <li>{@link appengine.impl.InstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends ResourceImpl implements Instance {
	/**
	 * The default value of the '{@link #getAverageLatency() <em>Average Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageLatency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AVERAGE_LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAverageLatency() <em>Average Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageLatency()
	 * @generated
	 * @ordered
	 */
	protected Integer averageLatency = AVERAGE_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryUsage() <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryUsage() <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryUsage()
	 * @generated
	 * @ordered
	 */
	protected String memoryUsage = MEMORY_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmIp() <em>Vm Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmIp()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmIp() <em>Vm Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmIp()
	 * @generated
	 * @ordered
	 */
	protected String vmIp = VM_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected String availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmStatus() <em>Vm Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmStatus() <em>Vm Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmStatus()
	 * @generated
	 * @ordered
	 */
	protected String vmStatus = VM_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrors() <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ERRORS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrors() <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrors()
	 * @generated
	 * @ordered
	 */
	protected Integer errors = ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isVmDebugEnabled() <em>Vm Debug Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmDebugEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VM_DEBUG_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVmDebugEnabled() <em>Vm Debug Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVmDebugEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean vmDebugEnabled = VM_DEBUG_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequests() <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected Integer requests = REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppEngineRelease() <em>App Engine Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppEngineRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String APP_ENGINE_RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppEngineRelease() <em>App Engine Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppEngineRelease()
	 * @generated
	 * @ordered
	 */
	protected String appEngineRelease = APP_ENGINE_RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmName()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmName() <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmName()
	 * @generated
	 * @ordered
	 */
	protected String vmName = VM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQps() <em>Qps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQps()
	 * @generated
	 * @ordered
	 */
	protected static final Integer QPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQps() <em>Qps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQps()
	 * @generated
	 * @ordered
	 */
	protected Integer qps = QPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmId() <em>Vm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmId()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmId() <em>Vm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmId()
	 * @generated
	 * @ordered
	 */
	protected String vmId = VM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmZoneName() <em>Vm Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmZoneName()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ZONE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmZoneName() <em>Vm Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmZoneName()
	 * @generated
	 * @ordered
	 */
	protected String vmZoneName = VM_ZONE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAverageLatency() {
		return averageLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageLatency(Integer newAverageLatency) {
		Integer oldAverageLatency = averageLatency;
		averageLatency = newAverageLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__AVERAGE_LATENCY, oldAverageLatency, averageLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemoryUsage() {
		return memoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryUsage(String newMemoryUsage) {
		String oldMemoryUsage = memoryUsage;
		memoryUsage = newMemoryUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__MEMORY_USAGE, oldMemoryUsage, memoryUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmIp() {
		return vmIp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmIp(String newVmIp) {
		String oldVmIp = vmIp;
		vmIp = newVmIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__VM_IP, oldVmIp, vmIp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(String newAvailability) {
		String oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmStatus() {
		return vmStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmStatus(String newVmStatus) {
		String oldVmStatus = vmStatus;
		vmStatus = newVmStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__VM_STATUS, oldVmStatus, vmStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getErrors() {
		return errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrors(Integer newErrors) {
		Integer oldErrors = errors;
		errors = newErrors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__ERRORS, oldErrors, errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVmDebugEnabled() {
		return vmDebugEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmDebugEnabled(boolean newVmDebugEnabled) {
		boolean oldVmDebugEnabled = vmDebugEnabled;
		vmDebugEnabled = newVmDebugEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__VM_DEBUG_ENABLED, oldVmDebugEnabled, vmDebugEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRequests() {
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequests(Integer newRequests) {
		Integer oldRequests = requests;
		requests = newRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__REQUESTS, oldRequests, requests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAppEngineRelease() {
		return appEngineRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppEngineRelease(String newAppEngineRelease) {
		String oldAppEngineRelease = appEngineRelease;
		appEngineRelease = newAppEngineRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__APP_ENGINE_RELEASE, oldAppEngineRelease, appEngineRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmName() {
		return vmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmName(String newVmName) {
		String oldVmName = vmName;
		vmName = newVmName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__VM_NAME, oldVmName, vmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQps() {
		return qps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQps(Integer newQps) {
		Integer oldQps = qps;
		qps = newQps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__QPS, oldQps, qps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmId() {
		return vmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmId(String newVmId) {
		String oldVmId = vmId;
		vmId = newVmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__VM_ID, oldVmId, vmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmZoneName() {
		return vmZoneName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmZoneName(String newVmZoneName) {
		String oldVmZoneName = vmZoneName;
		vmZoneName = newVmZoneName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__VM_ZONE_NAME, oldVmZoneName, vmZoneName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list(final String servicesId, final String appsId, final String pageToken, final Integer pageSize, final String versionsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!list(String,String,String,Integer,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get(final String servicesId, final String appsId, final String instancesId, final String versionsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!get(String,String,String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void debug(final String servicesId, final String appsId, final String instancesId, final String versionsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!debug(String,String,String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(final String appsId, final String instancesId, final String versionsId, final String servicesId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!delete(String,String,String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.INSTANCE__AVERAGE_LATENCY:
				return getAverageLatency();
			case AppenginePackage.INSTANCE__MEMORY_USAGE:
				return getMemoryUsage();
			case AppenginePackage.INSTANCE__VM_IP:
				return getVmIp();
			case AppenginePackage.INSTANCE__AVAILABILITY:
				return getAvailability();
			case AppenginePackage.INSTANCE__VM_STATUS:
				return getVmStatus();
			case AppenginePackage.INSTANCE__ERRORS:
				return getErrors();
			case AppenginePackage.INSTANCE__START_TIME:
				return getStartTime();
			case AppenginePackage.INSTANCE__VM_DEBUG_ENABLED:
				return isVmDebugEnabled();
			case AppenginePackage.INSTANCE__REQUESTS:
				return getRequests();
			case AppenginePackage.INSTANCE__APP_ENGINE_RELEASE:
				return getAppEngineRelease();
			case AppenginePackage.INSTANCE__VM_NAME:
				return getVmName();
			case AppenginePackage.INSTANCE__QPS:
				return getQps();
			case AppenginePackage.INSTANCE__VM_ID:
				return getVmId();
			case AppenginePackage.INSTANCE__VM_ZONE_NAME:
				return getVmZoneName();
			case AppenginePackage.INSTANCE__NAME:
				return getName();
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
			case AppenginePackage.INSTANCE__AVERAGE_LATENCY:
				setAverageLatency((Integer)newValue);
				return;
			case AppenginePackage.INSTANCE__MEMORY_USAGE:
				setMemoryUsage((String)newValue);
				return;
			case AppenginePackage.INSTANCE__VM_IP:
				setVmIp((String)newValue);
				return;
			case AppenginePackage.INSTANCE__AVAILABILITY:
				setAvailability((String)newValue);
				return;
			case AppenginePackage.INSTANCE__VM_STATUS:
				setVmStatus((String)newValue);
				return;
			case AppenginePackage.INSTANCE__ERRORS:
				setErrors((Integer)newValue);
				return;
			case AppenginePackage.INSTANCE__START_TIME:
				setStartTime((String)newValue);
				return;
			case AppenginePackage.INSTANCE__VM_DEBUG_ENABLED:
				setVmDebugEnabled((Boolean)newValue);
				return;
			case AppenginePackage.INSTANCE__REQUESTS:
				setRequests((Integer)newValue);
				return;
			case AppenginePackage.INSTANCE__APP_ENGINE_RELEASE:
				setAppEngineRelease((String)newValue);
				return;
			case AppenginePackage.INSTANCE__VM_NAME:
				setVmName((String)newValue);
				return;
			case AppenginePackage.INSTANCE__QPS:
				setQps((Integer)newValue);
				return;
			case AppenginePackage.INSTANCE__VM_ID:
				setVmId((String)newValue);
				return;
			case AppenginePackage.INSTANCE__VM_ZONE_NAME:
				setVmZoneName((String)newValue);
				return;
			case AppenginePackage.INSTANCE__NAME:
				setName((String)newValue);
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
			case AppenginePackage.INSTANCE__AVERAGE_LATENCY:
				setAverageLatency(AVERAGE_LATENCY_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__MEMORY_USAGE:
				setMemoryUsage(MEMORY_USAGE_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__VM_IP:
				setVmIp(VM_IP_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__VM_STATUS:
				setVmStatus(VM_STATUS_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__ERRORS:
				setErrors(ERRORS_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__VM_DEBUG_ENABLED:
				setVmDebugEnabled(VM_DEBUG_ENABLED_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__REQUESTS:
				setRequests(REQUESTS_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__APP_ENGINE_RELEASE:
				setAppEngineRelease(APP_ENGINE_RELEASE_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__VM_NAME:
				setVmName(VM_NAME_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__QPS:
				setQps(QPS_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__VM_ID:
				setVmId(VM_ID_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__VM_ZONE_NAME:
				setVmZoneName(VM_ZONE_NAME_EDEFAULT);
				return;
			case AppenginePackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
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
			case AppenginePackage.INSTANCE__AVERAGE_LATENCY:
				return AVERAGE_LATENCY_EDEFAULT == null ? averageLatency != null : !AVERAGE_LATENCY_EDEFAULT.equals(averageLatency);
			case AppenginePackage.INSTANCE__MEMORY_USAGE:
				return MEMORY_USAGE_EDEFAULT == null ? memoryUsage != null : !MEMORY_USAGE_EDEFAULT.equals(memoryUsage);
			case AppenginePackage.INSTANCE__VM_IP:
				return VM_IP_EDEFAULT == null ? vmIp != null : !VM_IP_EDEFAULT.equals(vmIp);
			case AppenginePackage.INSTANCE__AVAILABILITY:
				return AVAILABILITY_EDEFAULT == null ? availability != null : !AVAILABILITY_EDEFAULT.equals(availability);
			case AppenginePackage.INSTANCE__VM_STATUS:
				return VM_STATUS_EDEFAULT == null ? vmStatus != null : !VM_STATUS_EDEFAULT.equals(vmStatus);
			case AppenginePackage.INSTANCE__ERRORS:
				return ERRORS_EDEFAULT == null ? errors != null : !ERRORS_EDEFAULT.equals(errors);
			case AppenginePackage.INSTANCE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case AppenginePackage.INSTANCE__VM_DEBUG_ENABLED:
				return vmDebugEnabled != VM_DEBUG_ENABLED_EDEFAULT;
			case AppenginePackage.INSTANCE__REQUESTS:
				return REQUESTS_EDEFAULT == null ? requests != null : !REQUESTS_EDEFAULT.equals(requests);
			case AppenginePackage.INSTANCE__APP_ENGINE_RELEASE:
				return APP_ENGINE_RELEASE_EDEFAULT == null ? appEngineRelease != null : !APP_ENGINE_RELEASE_EDEFAULT.equals(appEngineRelease);
			case AppenginePackage.INSTANCE__VM_NAME:
				return VM_NAME_EDEFAULT == null ? vmName != null : !VM_NAME_EDEFAULT.equals(vmName);
			case AppenginePackage.INSTANCE__QPS:
				return QPS_EDEFAULT == null ? qps != null : !QPS_EDEFAULT.equals(qps);
			case AppenginePackage.INSTANCE__VM_ID:
				return VM_ID_EDEFAULT == null ? vmId != null : !VM_ID_EDEFAULT.equals(vmId);
			case AppenginePackage.INSTANCE__VM_ZONE_NAME:
				return VM_ZONE_NAME_EDEFAULT == null ? vmZoneName != null : !VM_ZONE_NAME_EDEFAULT.equals(vmZoneName);
			case AppenginePackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppenginePackage.INSTANCE___LIST__STRING_STRING_STRING_INTEGER_STRING:
				list((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4));
				return null;
			case AppenginePackage.INSTANCE___GET__STRING_STRING_STRING_STRING:
				get((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case AppenginePackage.INSTANCE___DEBUG__STRING_STRING_STRING_STRING:
				debug((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case AppenginePackage.INSTANCE___DELETE__STRING_STRING_STRING_STRING:
				delete((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (averageLatency: ");
		result.append(averageLatency);
		result.append(", memoryUsage: ");
		result.append(memoryUsage);
		result.append(", vmIp: ");
		result.append(vmIp);
		result.append(", availability: ");
		result.append(availability);
		result.append(", vmStatus: ");
		result.append(vmStatus);
		result.append(", errors: ");
		result.append(errors);
		result.append(", startTime: ");
		result.append(startTime);
		result.append(", vmDebugEnabled: ");
		result.append(vmDebugEnabled);
		result.append(", requests: ");
		result.append(requests);
		result.append(", appEngineRelease: ");
		result.append(appEngineRelease);
		result.append(", vmName: ");
		result.append(vmName);
		result.append(", qps: ");
		result.append(qps);
		result.append(", vmId: ");
		result.append(vmId);
		result.append(", vmZoneName: ");
		result.append(vmZoneName);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
