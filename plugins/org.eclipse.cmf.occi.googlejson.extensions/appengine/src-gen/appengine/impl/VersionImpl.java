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
import appengine.Version;
import appengine.array;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.VersionImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getDiskUsageBytes <em>Disk Usage Bytes</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#isThreadsafe <em>Threadsafe</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getName <em>Name</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#isVm <em>Vm</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getVersionUrl <em>Version Url</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getServingStatus <em>Serving Status</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getRuntimeApiVersion <em>Runtime Api Version</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getCreateTime <em>Create Time</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getInboundServices <em>Inbound Services</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getErrorHandlers <em>Error Handlers</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getDefaultExpiration <em>Default Expiration</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getNobuildFilesRegex <em>Nobuild Files Regex</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getEnvVariables <em>Env Variables</em>}</li>
 *   <li>{@link appengine.impl.VersionImpl#getBetaSettings <em>Beta Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends ResourceImpl implements Version {
	/**
	 * The default value of the '{@link #getEnv() <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected static final String ENV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected String env = ENV_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected array handlers;

	/**
	 * The default value of the '{@link #getDiskUsageBytes() <em>Disk Usage Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskUsageBytes()
	 * @generated
	 * @ordered
	 */
	protected static final String DISK_USAGE_BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskUsageBytes() <em>Disk Usage Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskUsageBytes()
	 * @generated
	 * @ordered
	 */
	protected String diskUsageBytes = DISK_USAGE_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isThreadsafe() <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadsafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREADSAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadsafe() <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadsafe()
	 * @generated
	 * @ordered
	 */
	protected boolean threadsafe = THREADSAFE_EDEFAULT;

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
	 * The default value of the '{@link #isVm() <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVm() <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVm()
	 * @generated
	 * @ordered
	 */
	protected boolean vm = VM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersionUrl() <em>Version Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionUrl() <em>Version Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionUrl()
	 * @generated
	 * @ordered
	 */
	protected String versionUrl = VERSION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceClass = INSTANCE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getServingStatus() <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServingStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVING_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServingStatus() <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServingStatus()
	 * @generated
	 * @ordered
	 */
	protected String servingStatus = SERVING_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeApiVersion() <em>Runtime Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeApiVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_API_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeApiVersion() <em>Runtime Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeApiVersion()
	 * @generated
	 * @ordered
	 */
	protected String runtimeApiVersion = RUNTIME_API_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreateTime() <em>Create Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTime()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreateTime() <em>Create Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateTime()
	 * @generated
	 * @ordered
	 */
	protected String createTime = CREATE_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInboundServices() <em>Inbound Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundServices()
	 * @generated
	 * @ordered
	 */
	protected array inboundServices;

	/**
	 * The cached value of the '{@link #getErrorHandlers() <em>Error Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorHandlers()
	 * @generated
	 * @ordered
	 */
	protected array errorHandlers;

	/**
	 * The default value of the '{@link #getDefaultExpiration() <em>Default Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultExpiration() <em>Default Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultExpiration()
	 * @generated
	 * @ordered
	 */
	protected String defaultExpiration = DEFAULT_EXPIRATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected array libraries;

	/**
	 * The default value of the '{@link #getNobuildFilesRegex() <em>Nobuild Files Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNobuildFilesRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String NOBUILD_FILES_REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNobuildFilesRegex() <em>Nobuild Files Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNobuildFilesRegex()
	 * @generated
	 * @ordered
	 */
	protected String nobuildFilesRegex = NOBUILD_FILES_REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected String runtime = RUNTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected String createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnvVariables() <em>Env Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvVariables()
	 * @generated
	 * @ordered
	 */
	protected static final Map ENV_VARIABLES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnvVariables() <em>Env Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvVariables()
	 * @generated
	 * @ordered
	 */
	protected Map envVariables = ENV_VARIABLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetaSettings() <em>Beta Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetaSettings()
	 * @generated
	 * @ordered
	 */
	protected static final Map BETA_SETTINGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetaSettings() <em>Beta Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetaSettings()
	 * @generated
	 * @ordered
	 */
	protected Map betaSettings = BETA_SETTINGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getVersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnv() {
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(String newEnv) {
		String oldEnv = env;
		env = newEnv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__ENV, oldEnv, env));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getHandlers() {
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlers(array newHandlers, NotificationChain msgs) {
		array oldHandlers = handlers;
		handlers = newHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__HANDLERS, oldHandlers, newHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlers(array newHandlers) {
		if (newHandlers != handlers) {
			NotificationChain msgs = null;
			if (handlers != null)
				msgs = ((InternalEObject)handlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__HANDLERS, null, msgs);
			if (newHandlers != null)
				msgs = ((InternalEObject)newHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__HANDLERS, null, msgs);
			msgs = basicSetHandlers(newHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__HANDLERS, newHandlers, newHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiskUsageBytes() {
		return diskUsageBytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskUsageBytes(String newDiskUsageBytes) {
		String oldDiskUsageBytes = diskUsageBytes;
		diskUsageBytes = newDiskUsageBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__DISK_USAGE_BYTES, oldDiskUsageBytes, diskUsageBytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadsafe() {
		return threadsafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadsafe(boolean newThreadsafe) {
		boolean oldThreadsafe = threadsafe;
		threadsafe = newThreadsafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__THREADSAFE, oldThreadsafe, threadsafe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVm() {
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(boolean newVm) {
		boolean oldVm = vm;
		vm = newVm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__VM, oldVm, vm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersionUrl() {
		return versionUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionUrl(String newVersionUrl) {
		String oldVersionUrl = versionUrl;
		versionUrl = newVersionUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__VERSION_URL, oldVersionUrl, versionUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClass() {
		return instanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClass(String newInstanceClass) {
		String oldInstanceClass = instanceClass;
		instanceClass = newInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__INSTANCE_CLASS, oldInstanceClass, instanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServingStatus() {
		return servingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServingStatus(String newServingStatus) {
		String oldServingStatus = servingStatus;
		servingStatus = newServingStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__SERVING_STATUS, oldServingStatus, servingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntimeApiVersion() {
		return runtimeApiVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeApiVersion(String newRuntimeApiVersion) {
		String oldRuntimeApiVersion = runtimeApiVersion;
		runtimeApiVersion = newRuntimeApiVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__RUNTIME_API_VERSION, oldRuntimeApiVersion, runtimeApiVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateTime() {
		return createTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateTime(String newCreateTime) {
		String oldCreateTime = createTime;
		createTime = newCreateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__CREATE_TIME, oldCreateTime, createTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getInboundServices() {
		return inboundServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundServices(array newInboundServices, NotificationChain msgs) {
		array oldInboundServices = inboundServices;
		inboundServices = newInboundServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__INBOUND_SERVICES, oldInboundServices, newInboundServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundServices(array newInboundServices) {
		if (newInboundServices != inboundServices) {
			NotificationChain msgs = null;
			if (inboundServices != null)
				msgs = ((InternalEObject)inboundServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__INBOUND_SERVICES, null, msgs);
			if (newInboundServices != null)
				msgs = ((InternalEObject)newInboundServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__INBOUND_SERVICES, null, msgs);
			msgs = basicSetInboundServices(newInboundServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__INBOUND_SERVICES, newInboundServices, newInboundServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getErrorHandlers() {
		return errorHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorHandlers(array newErrorHandlers, NotificationChain msgs) {
		array oldErrorHandlers = errorHandlers;
		errorHandlers = newErrorHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__ERROR_HANDLERS, oldErrorHandlers, newErrorHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorHandlers(array newErrorHandlers) {
		if (newErrorHandlers != errorHandlers) {
			NotificationChain msgs = null;
			if (errorHandlers != null)
				msgs = ((InternalEObject)errorHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__ERROR_HANDLERS, null, msgs);
			if (newErrorHandlers != null)
				msgs = ((InternalEObject)newErrorHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__ERROR_HANDLERS, null, msgs);
			msgs = basicSetErrorHandlers(newErrorHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__ERROR_HANDLERS, newErrorHandlers, newErrorHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultExpiration() {
		return defaultExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultExpiration(String newDefaultExpiration) {
		String oldDefaultExpiration = defaultExpiration;
		defaultExpiration = newDefaultExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__DEFAULT_EXPIRATION, oldDefaultExpiration, defaultExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getLibraries() {
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibraries(array newLibraries, NotificationChain msgs) {
		array oldLibraries = libraries;
		libraries = newLibraries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__LIBRARIES, oldLibraries, newLibraries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraries(array newLibraries) {
		if (newLibraries != libraries) {
			NotificationChain msgs = null;
			if (libraries != null)
				msgs = ((InternalEObject)libraries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__LIBRARIES, null, msgs);
			if (newLibraries != null)
				msgs = ((InternalEObject)newLibraries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.VERSION__LIBRARIES, null, msgs);
			msgs = basicSetLibraries(newLibraries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__LIBRARIES, newLibraries, newLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNobuildFilesRegex() {
		return nobuildFilesRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNobuildFilesRegex(String newNobuildFilesRegex) {
		String oldNobuildFilesRegex = nobuildFilesRegex;
		nobuildFilesRegex = newNobuildFilesRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__NOBUILD_FILES_REGEX, oldNobuildFilesRegex, nobuildFilesRegex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(String newRuntime) {
		String oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__RUNTIME, oldRuntime, runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(String newCreatedBy) {
		String oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getEnvVariables() {
		return envVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvVariables(Map newEnvVariables) {
		Map oldEnvVariables = envVariables;
		envVariables = newEnvVariables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__ENV_VARIABLES, oldEnvVariables, envVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getBetaSettings() {
		return betaSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBetaSettings(Map newBetaSettings) {
		Map oldBetaSettings = betaSettings;
		betaSettings = newBetaSettings;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VERSION__BETA_SETTINGS, oldBetaSettings, betaSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(String appsId, String versionsId, String servicesId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list(Integer pageSize, String view, String servicesId, String appsId, String pageToken) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get(String versionsId, String view, String servicesId, String appsId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void patch(String updateMask, String servicesId, String appsId, String versionsId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create(String appsId, String servicesId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.VERSION__HANDLERS:
				return basicSetHandlers(null, msgs);
			case AppenginePackage.VERSION__INBOUND_SERVICES:
				return basicSetInboundServices(null, msgs);
			case AppenginePackage.VERSION__ERROR_HANDLERS:
				return basicSetErrorHandlers(null, msgs);
			case AppenginePackage.VERSION__LIBRARIES:
				return basicSetLibraries(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.VERSION__ENV:
				return getEnv();
			case AppenginePackage.VERSION__HANDLERS:
				return getHandlers();
			case AppenginePackage.VERSION__DISK_USAGE_BYTES:
				return getDiskUsageBytes();
			case AppenginePackage.VERSION__THREADSAFE:
				return isThreadsafe();
			case AppenginePackage.VERSION__NAME:
				return getName();
			case AppenginePackage.VERSION__VM:
				return isVm();
			case AppenginePackage.VERSION__VERSION_URL:
				return getVersionUrl();
			case AppenginePackage.VERSION__INSTANCE_CLASS:
				return getInstanceClass();
			case AppenginePackage.VERSION__SERVING_STATUS:
				return getServingStatus();
			case AppenginePackage.VERSION__RUNTIME_API_VERSION:
				return getRuntimeApiVersion();
			case AppenginePackage.VERSION__CREATE_TIME:
				return getCreateTime();
			case AppenginePackage.VERSION__INBOUND_SERVICES:
				return getInboundServices();
			case AppenginePackage.VERSION__ERROR_HANDLERS:
				return getErrorHandlers();
			case AppenginePackage.VERSION__DEFAULT_EXPIRATION:
				return getDefaultExpiration();
			case AppenginePackage.VERSION__LIBRARIES:
				return getLibraries();
			case AppenginePackage.VERSION__NOBUILD_FILES_REGEX:
				return getNobuildFilesRegex();
			case AppenginePackage.VERSION__RUNTIME:
				return getRuntime();
			case AppenginePackage.VERSION__CREATED_BY:
				return getCreatedBy();
			case AppenginePackage.VERSION__ENV_VARIABLES:
				return getEnvVariables();
			case AppenginePackage.VERSION__BETA_SETTINGS:
				return getBetaSettings();
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
			case AppenginePackage.VERSION__ENV:
				setEnv((String)newValue);
				return;
			case AppenginePackage.VERSION__HANDLERS:
				setHandlers((array)newValue);
				return;
			case AppenginePackage.VERSION__DISK_USAGE_BYTES:
				setDiskUsageBytes((String)newValue);
				return;
			case AppenginePackage.VERSION__THREADSAFE:
				setThreadsafe((Boolean)newValue);
				return;
			case AppenginePackage.VERSION__NAME:
				setName((String)newValue);
				return;
			case AppenginePackage.VERSION__VM:
				setVm((Boolean)newValue);
				return;
			case AppenginePackage.VERSION__VERSION_URL:
				setVersionUrl((String)newValue);
				return;
			case AppenginePackage.VERSION__INSTANCE_CLASS:
				setInstanceClass((String)newValue);
				return;
			case AppenginePackage.VERSION__SERVING_STATUS:
				setServingStatus((String)newValue);
				return;
			case AppenginePackage.VERSION__RUNTIME_API_VERSION:
				setRuntimeApiVersion((String)newValue);
				return;
			case AppenginePackage.VERSION__CREATE_TIME:
				setCreateTime((String)newValue);
				return;
			case AppenginePackage.VERSION__INBOUND_SERVICES:
				setInboundServices((array)newValue);
				return;
			case AppenginePackage.VERSION__ERROR_HANDLERS:
				setErrorHandlers((array)newValue);
				return;
			case AppenginePackage.VERSION__DEFAULT_EXPIRATION:
				setDefaultExpiration((String)newValue);
				return;
			case AppenginePackage.VERSION__LIBRARIES:
				setLibraries((array)newValue);
				return;
			case AppenginePackage.VERSION__NOBUILD_FILES_REGEX:
				setNobuildFilesRegex((String)newValue);
				return;
			case AppenginePackage.VERSION__RUNTIME:
				setRuntime((String)newValue);
				return;
			case AppenginePackage.VERSION__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case AppenginePackage.VERSION__ENV_VARIABLES:
				setEnvVariables((Map)newValue);
				return;
			case AppenginePackage.VERSION__BETA_SETTINGS:
				setBetaSettings((Map)newValue);
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
			case AppenginePackage.VERSION__ENV:
				setEnv(ENV_EDEFAULT);
				return;
			case AppenginePackage.VERSION__HANDLERS:
				setHandlers((array)null);
				return;
			case AppenginePackage.VERSION__DISK_USAGE_BYTES:
				setDiskUsageBytes(DISK_USAGE_BYTES_EDEFAULT);
				return;
			case AppenginePackage.VERSION__THREADSAFE:
				setThreadsafe(THREADSAFE_EDEFAULT);
				return;
			case AppenginePackage.VERSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AppenginePackage.VERSION__VM:
				setVm(VM_EDEFAULT);
				return;
			case AppenginePackage.VERSION__VERSION_URL:
				setVersionUrl(VERSION_URL_EDEFAULT);
				return;
			case AppenginePackage.VERSION__INSTANCE_CLASS:
				setInstanceClass(INSTANCE_CLASS_EDEFAULT);
				return;
			case AppenginePackage.VERSION__SERVING_STATUS:
				setServingStatus(SERVING_STATUS_EDEFAULT);
				return;
			case AppenginePackage.VERSION__RUNTIME_API_VERSION:
				setRuntimeApiVersion(RUNTIME_API_VERSION_EDEFAULT);
				return;
			case AppenginePackage.VERSION__CREATE_TIME:
				setCreateTime(CREATE_TIME_EDEFAULT);
				return;
			case AppenginePackage.VERSION__INBOUND_SERVICES:
				setInboundServices((array)null);
				return;
			case AppenginePackage.VERSION__ERROR_HANDLERS:
				setErrorHandlers((array)null);
				return;
			case AppenginePackage.VERSION__DEFAULT_EXPIRATION:
				setDefaultExpiration(DEFAULT_EXPIRATION_EDEFAULT);
				return;
			case AppenginePackage.VERSION__LIBRARIES:
				setLibraries((array)null);
				return;
			case AppenginePackage.VERSION__NOBUILD_FILES_REGEX:
				setNobuildFilesRegex(NOBUILD_FILES_REGEX_EDEFAULT);
				return;
			case AppenginePackage.VERSION__RUNTIME:
				setRuntime(RUNTIME_EDEFAULT);
				return;
			case AppenginePackage.VERSION__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case AppenginePackage.VERSION__ENV_VARIABLES:
				setEnvVariables(ENV_VARIABLES_EDEFAULT);
				return;
			case AppenginePackage.VERSION__BETA_SETTINGS:
				setBetaSettings(BETA_SETTINGS_EDEFAULT);
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
			case AppenginePackage.VERSION__ENV:
				return ENV_EDEFAULT == null ? env != null : !ENV_EDEFAULT.equals(env);
			case AppenginePackage.VERSION__HANDLERS:
				return handlers != null;
			case AppenginePackage.VERSION__DISK_USAGE_BYTES:
				return DISK_USAGE_BYTES_EDEFAULT == null ? diskUsageBytes != null : !DISK_USAGE_BYTES_EDEFAULT.equals(diskUsageBytes);
			case AppenginePackage.VERSION__THREADSAFE:
				return threadsafe != THREADSAFE_EDEFAULT;
			case AppenginePackage.VERSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AppenginePackage.VERSION__VM:
				return vm != VM_EDEFAULT;
			case AppenginePackage.VERSION__VERSION_URL:
				return VERSION_URL_EDEFAULT == null ? versionUrl != null : !VERSION_URL_EDEFAULT.equals(versionUrl);
			case AppenginePackage.VERSION__INSTANCE_CLASS:
				return INSTANCE_CLASS_EDEFAULT == null ? instanceClass != null : !INSTANCE_CLASS_EDEFAULT.equals(instanceClass);
			case AppenginePackage.VERSION__SERVING_STATUS:
				return SERVING_STATUS_EDEFAULT == null ? servingStatus != null : !SERVING_STATUS_EDEFAULT.equals(servingStatus);
			case AppenginePackage.VERSION__RUNTIME_API_VERSION:
				return RUNTIME_API_VERSION_EDEFAULT == null ? runtimeApiVersion != null : !RUNTIME_API_VERSION_EDEFAULT.equals(runtimeApiVersion);
			case AppenginePackage.VERSION__CREATE_TIME:
				return CREATE_TIME_EDEFAULT == null ? createTime != null : !CREATE_TIME_EDEFAULT.equals(createTime);
			case AppenginePackage.VERSION__INBOUND_SERVICES:
				return inboundServices != null;
			case AppenginePackage.VERSION__ERROR_HANDLERS:
				return errorHandlers != null;
			case AppenginePackage.VERSION__DEFAULT_EXPIRATION:
				return DEFAULT_EXPIRATION_EDEFAULT == null ? defaultExpiration != null : !DEFAULT_EXPIRATION_EDEFAULT.equals(defaultExpiration);
			case AppenginePackage.VERSION__LIBRARIES:
				return libraries != null;
			case AppenginePackage.VERSION__NOBUILD_FILES_REGEX:
				return NOBUILD_FILES_REGEX_EDEFAULT == null ? nobuildFilesRegex != null : !NOBUILD_FILES_REGEX_EDEFAULT.equals(nobuildFilesRegex);
			case AppenginePackage.VERSION__RUNTIME:
				return RUNTIME_EDEFAULT == null ? runtime != null : !RUNTIME_EDEFAULT.equals(runtime);
			case AppenginePackage.VERSION__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
			case AppenginePackage.VERSION__ENV_VARIABLES:
				return ENV_VARIABLES_EDEFAULT == null ? envVariables != null : !ENV_VARIABLES_EDEFAULT.equals(envVariables);
			case AppenginePackage.VERSION__BETA_SETTINGS:
				return BETA_SETTINGS_EDEFAULT == null ? betaSettings != null : !BETA_SETTINGS_EDEFAULT.equals(betaSettings);
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
			case AppenginePackage.VERSION___DELETE__STRING_STRING_STRING:
				delete((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case AppenginePackage.VERSION___LIST__INTEGER_STRING_STRING_STRING_STRING:
				list((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
				return null;
			case AppenginePackage.VERSION___GET__STRING_STRING_STRING_STRING:
				get((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case AppenginePackage.VERSION___PATCH__STRING_STRING_STRING_STRING:
				patch((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case AppenginePackage.VERSION___CREATE__STRING_STRING:
				create((String)arguments.get(0), (String)arguments.get(1));
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
		result.append(" (env: ");
		result.append(env);
		result.append(", diskUsageBytes: ");
		result.append(diskUsageBytes);
		result.append(", threadsafe: ");
		result.append(threadsafe);
		result.append(", name: ");
		result.append(name);
		result.append(", vm: ");
		result.append(vm);
		result.append(", versionUrl: ");
		result.append(versionUrl);
		result.append(", instanceClass: ");
		result.append(instanceClass);
		result.append(", servingStatus: ");
		result.append(servingStatus);
		result.append(", runtimeApiVersion: ");
		result.append(runtimeApiVersion);
		result.append(", createTime: ");
		result.append(createTime);
		result.append(", defaultExpiration: ");
		result.append(defaultExpiration);
		result.append(", nobuildFilesRegex: ");
		result.append(nobuildFilesRegex);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(", createdBy: ");
		result.append(createdBy);
		result.append(", envVariables: ");
		result.append(envVariables);
		result.append(", betaSettings: ");
		result.append(betaSettings);
		result.append(')');
		return result.toString();
	}

} //VersionImpl
