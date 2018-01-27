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
import appengine.Application;
import appengine.array;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ApplicationImpl#getDispatchRules <em>Dispatch Rules</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getGcrDomain <em>Gcr Domain</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getDefaultCookieExpiration <em>Default Cookie Expiration</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getLocationId <em>Location Id</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getServingStatus <em>Serving Status</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getDefaultHostname <em>Default Hostname</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getAuthDomain <em>Auth Domain</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getCodeBucket <em>Code Bucket</em>}</li>
 *   <li>{@link appengine.impl.ApplicationImpl#getDefaultBucket <em>Default Bucket</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends ResourceImpl implements Application {
	/**
	 * The cached value of the '{@link #getDispatchRules() <em>Dispatch Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchRules()
	 * @generated
	 * @ordered
	 */
	protected array dispatchRules;

	/**
	 * The default value of the '{@link #getGcrDomain() <em>Gcr Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGcrDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String GCR_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGcrDomain() <em>Gcr Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGcrDomain()
	 * @generated
	 * @ordered
	 */
	protected String gcrDomain = GCR_DOMAIN_EDEFAULT;

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
	 * The default value of the '{@link #getDefaultCookieExpiration() <em>Default Cookie Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCookieExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_COOKIE_EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultCookieExpiration() <em>Default Cookie Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCookieExpiration()
	 * @generated
	 * @ordered
	 */
	protected String defaultCookieExpiration = DEFAULT_COOKIE_EXPIRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocationId() <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocationId() <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationId()
	 * @generated
	 * @ordered
	 */
	protected String locationId = LOCATION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDefaultHostname() <em>Default Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultHostname() <em>Default Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHostname()
	 * @generated
	 * @ordered
	 */
	protected String defaultHostname = DEFAULT_HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthDomain() <em>Auth Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthDomain() <em>Auth Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthDomain()
	 * @generated
	 * @ordered
	 */
	protected String authDomain = AUTH_DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeBucket() <em>Code Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBucket()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_BUCKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeBucket() <em>Code Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeBucket()
	 * @generated
	 * @ordered
	 */
	protected String codeBucket = CODE_BUCKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultBucket() <em>Default Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBucket()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BUCKET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultBucket() <em>Default Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBucket()
	 * @generated
	 * @ordered
	 */
	protected String defaultBucket = DEFAULT_BUCKET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getApplication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getDispatchRules() {
		return dispatchRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDispatchRules(array newDispatchRules, NotificationChain msgs) {
		array oldDispatchRules = dispatchRules;
		dispatchRules = newDispatchRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__DISPATCH_RULES, oldDispatchRules, newDispatchRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatchRules(array newDispatchRules) {
		if (newDispatchRules != dispatchRules) {
			NotificationChain msgs = null;
			if (dispatchRules != null)
				msgs = ((InternalEObject)dispatchRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.APPLICATION__DISPATCH_RULES, null, msgs);
			if (newDispatchRules != null)
				msgs = ((InternalEObject)newDispatchRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.APPLICATION__DISPATCH_RULES, null, msgs);
			msgs = basicSetDispatchRules(newDispatchRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__DISPATCH_RULES, newDispatchRules, newDispatchRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGcrDomain() {
		return gcrDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGcrDomain(String newGcrDomain) {
		String oldGcrDomain = gcrDomain;
		gcrDomain = newGcrDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__GCR_DOMAIN, oldGcrDomain, gcrDomain));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultCookieExpiration() {
		return defaultCookieExpiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCookieExpiration(String newDefaultCookieExpiration) {
		String oldDefaultCookieExpiration = defaultCookieExpiration;
		defaultCookieExpiration = newDefaultCookieExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__DEFAULT_COOKIE_EXPIRATION, oldDefaultCookieExpiration, defaultCookieExpiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocationId() {
		return locationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationId(String newLocationId) {
		String oldLocationId = locationId;
		locationId = newLocationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__LOCATION_ID, oldLocationId, locationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__SERVING_STATUS, oldServingStatus, servingStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultHostname() {
		return defaultHostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHostname(String newDefaultHostname) {
		String oldDefaultHostname = defaultHostname;
		defaultHostname = newDefaultHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__DEFAULT_HOSTNAME, oldDefaultHostname, defaultHostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthDomain() {
		return authDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthDomain(String newAuthDomain) {
		String oldAuthDomain = authDomain;
		authDomain = newAuthDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__AUTH_DOMAIN, oldAuthDomain, authDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeBucket() {
		return codeBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeBucket(String newCodeBucket) {
		String oldCodeBucket = codeBucket;
		codeBucket = newCodeBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__CODE_BUCKET, oldCodeBucket, codeBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultBucket() {
		return defaultBucket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultBucket(String newDefaultBucket) {
		String oldDefaultBucket = defaultBucket;
		defaultBucket = newDefaultBucket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APPLICATION__DEFAULT_BUCKET, oldDefaultBucket, defaultBucket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void repair(final String appsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Application!repair(String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get(final String appsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Application!get(String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void patch(final String updateMask, final String appsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Application!patch(String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Application!create()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.APPLICATION__DISPATCH_RULES:
				return basicSetDispatchRules(null, msgs);
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
			case AppenginePackage.APPLICATION__DISPATCH_RULES:
				return getDispatchRules();
			case AppenginePackage.APPLICATION__GCR_DOMAIN:
				return getGcrDomain();
			case AppenginePackage.APPLICATION__NAME:
				return getName();
			case AppenginePackage.APPLICATION__DEFAULT_COOKIE_EXPIRATION:
				return getDefaultCookieExpiration();
			case AppenginePackage.APPLICATION__LOCATION_ID:
				return getLocationId();
			case AppenginePackage.APPLICATION__SERVING_STATUS:
				return getServingStatus();
			case AppenginePackage.APPLICATION__DEFAULT_HOSTNAME:
				return getDefaultHostname();
			case AppenginePackage.APPLICATION__AUTH_DOMAIN:
				return getAuthDomain();
			case AppenginePackage.APPLICATION__CODE_BUCKET:
				return getCodeBucket();
			case AppenginePackage.APPLICATION__DEFAULT_BUCKET:
				return getDefaultBucket();
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
			case AppenginePackage.APPLICATION__DISPATCH_RULES:
				setDispatchRules((array)newValue);
				return;
			case AppenginePackage.APPLICATION__GCR_DOMAIN:
				setGcrDomain((String)newValue);
				return;
			case AppenginePackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case AppenginePackage.APPLICATION__DEFAULT_COOKIE_EXPIRATION:
				setDefaultCookieExpiration((String)newValue);
				return;
			case AppenginePackage.APPLICATION__LOCATION_ID:
				setLocationId((String)newValue);
				return;
			case AppenginePackage.APPLICATION__SERVING_STATUS:
				setServingStatus((String)newValue);
				return;
			case AppenginePackage.APPLICATION__DEFAULT_HOSTNAME:
				setDefaultHostname((String)newValue);
				return;
			case AppenginePackage.APPLICATION__AUTH_DOMAIN:
				setAuthDomain((String)newValue);
				return;
			case AppenginePackage.APPLICATION__CODE_BUCKET:
				setCodeBucket((String)newValue);
				return;
			case AppenginePackage.APPLICATION__DEFAULT_BUCKET:
				setDefaultBucket((String)newValue);
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
			case AppenginePackage.APPLICATION__DISPATCH_RULES:
				setDispatchRules((array)null);
				return;
			case AppenginePackage.APPLICATION__GCR_DOMAIN:
				setGcrDomain(GCR_DOMAIN_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__DEFAULT_COOKIE_EXPIRATION:
				setDefaultCookieExpiration(DEFAULT_COOKIE_EXPIRATION_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__LOCATION_ID:
				setLocationId(LOCATION_ID_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__SERVING_STATUS:
				setServingStatus(SERVING_STATUS_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__DEFAULT_HOSTNAME:
				setDefaultHostname(DEFAULT_HOSTNAME_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__AUTH_DOMAIN:
				setAuthDomain(AUTH_DOMAIN_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__CODE_BUCKET:
				setCodeBucket(CODE_BUCKET_EDEFAULT);
				return;
			case AppenginePackage.APPLICATION__DEFAULT_BUCKET:
				setDefaultBucket(DEFAULT_BUCKET_EDEFAULT);
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
			case AppenginePackage.APPLICATION__DISPATCH_RULES:
				return dispatchRules != null;
			case AppenginePackage.APPLICATION__GCR_DOMAIN:
				return GCR_DOMAIN_EDEFAULT == null ? gcrDomain != null : !GCR_DOMAIN_EDEFAULT.equals(gcrDomain);
			case AppenginePackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AppenginePackage.APPLICATION__DEFAULT_COOKIE_EXPIRATION:
				return DEFAULT_COOKIE_EXPIRATION_EDEFAULT == null ? defaultCookieExpiration != null : !DEFAULT_COOKIE_EXPIRATION_EDEFAULT.equals(defaultCookieExpiration);
			case AppenginePackage.APPLICATION__LOCATION_ID:
				return LOCATION_ID_EDEFAULT == null ? locationId != null : !LOCATION_ID_EDEFAULT.equals(locationId);
			case AppenginePackage.APPLICATION__SERVING_STATUS:
				return SERVING_STATUS_EDEFAULT == null ? servingStatus != null : !SERVING_STATUS_EDEFAULT.equals(servingStatus);
			case AppenginePackage.APPLICATION__DEFAULT_HOSTNAME:
				return DEFAULT_HOSTNAME_EDEFAULT == null ? defaultHostname != null : !DEFAULT_HOSTNAME_EDEFAULT.equals(defaultHostname);
			case AppenginePackage.APPLICATION__AUTH_DOMAIN:
				return AUTH_DOMAIN_EDEFAULT == null ? authDomain != null : !AUTH_DOMAIN_EDEFAULT.equals(authDomain);
			case AppenginePackage.APPLICATION__CODE_BUCKET:
				return CODE_BUCKET_EDEFAULT == null ? codeBucket != null : !CODE_BUCKET_EDEFAULT.equals(codeBucket);
			case AppenginePackage.APPLICATION__DEFAULT_BUCKET:
				return DEFAULT_BUCKET_EDEFAULT == null ? defaultBucket != null : !DEFAULT_BUCKET_EDEFAULT.equals(defaultBucket);
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
			case AppenginePackage.APPLICATION___REPAIR__STRING:
				repair((String)arguments.get(0));
				return null;
			case AppenginePackage.APPLICATION___GET__STRING:
				get((String)arguments.get(0));
				return null;
			case AppenginePackage.APPLICATION___PATCH__STRING_STRING:
				patch((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case AppenginePackage.APPLICATION___CREATE:
				create();
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
		result.append(" (gcrDomain: ");
		result.append(gcrDomain);
		result.append(", name: ");
		result.append(name);
		result.append(", defaultCookieExpiration: ");
		result.append(defaultCookieExpiration);
		result.append(", locationId: ");
		result.append(locationId);
		result.append(", servingStatus: ");
		result.append(servingStatus);
		result.append(", defaultHostname: ");
		result.append(defaultHostname);
		result.append(", authDomain: ");
		result.append(authDomain);
		result.append(", codeBucket: ");
		result.append(codeBucket);
		result.append(", defaultBucket: ");
		result.append(defaultBucket);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
