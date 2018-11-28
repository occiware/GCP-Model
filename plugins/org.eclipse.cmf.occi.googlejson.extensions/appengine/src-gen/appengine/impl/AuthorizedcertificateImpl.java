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
import appengine.Authorizedcertificate;
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
 * An implementation of the model object '<em><b>Authorizedcertificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.AuthorizedcertificateImpl#getDomainMappingsCount <em>Domain Mappings Count</em>}</li>
 *   <li>{@link appengine.impl.AuthorizedcertificateImpl#getDomainNames <em>Domain Names</em>}</li>
 *   <li>{@link appengine.impl.AuthorizedcertificateImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link appengine.impl.AuthorizedcertificateImpl#getVisibleDomainMappings <em>Visible Domain Mappings</em>}</li>
 *   <li>{@link appengine.impl.AuthorizedcertificateImpl#getExpireTime <em>Expire Time</em>}</li>
 *   <li>{@link appengine.impl.AuthorizedcertificateImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizedcertificateImpl extends ResourceImpl implements Authorizedcertificate {
	/**
	 * The default value of the '{@link #getDomainMappingsCount() <em>Domain Mappings Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMappingsCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOMAIN_MAPPINGS_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainMappingsCount() <em>Domain Mappings Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainMappingsCount()
	 * @generated
	 * @ordered
	 */
	protected Integer domainMappingsCount = DOMAIN_MAPPINGS_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDomainNames() <em>Domain Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainNames()
	 * @generated
	 * @ordered
	 */
	protected array domainNames;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVisibleDomainMappings() <em>Visible Domain Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleDomainMappings()
	 * @generated
	 * @ordered
	 */
	protected array visibleDomainMappings;

	/**
	 * The default value of the '{@link #getExpireTime() <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireTime()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpireTime() <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpireTime()
	 * @generated
	 * @ordered
	 */
	protected String expireTime = EXPIRE_TIME_EDEFAULT;

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
	protected AuthorizedcertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getAuthorizedcertificate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDomainMappingsCount() {
		return domainMappingsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMappingsCount(Integer newDomainMappingsCount) {
		Integer oldDomainMappingsCount = domainMappingsCount;
		domainMappingsCount = newDomainMappingsCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT, oldDomainMappingsCount, domainMappingsCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getDomainNames() {
		return domainNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainNames(array newDomainNames, NotificationChain msgs) {
		array oldDomainNames = domainNames;
		domainNames = newDomainNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES, oldDomainNames, newDomainNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainNames(array newDomainNames) {
		if (newDomainNames != domainNames) {
			NotificationChain msgs = null;
			if (domainNames != null)
				msgs = ((InternalEObject)domainNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES, null, msgs);
			if (newDomainNames != null)
				msgs = ((InternalEObject)newDomainNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES, null, msgs);
			msgs = basicSetDomainNames(newDomainNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES, newDomainNames, newDomainNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getVisibleDomainMappings() {
		return visibleDomainMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisibleDomainMappings(array newVisibleDomainMappings, NotificationChain msgs) {
		array oldVisibleDomainMappings = visibleDomainMappings;
		visibleDomainMappings = newVisibleDomainMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS, oldVisibleDomainMappings, newVisibleDomainMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleDomainMappings(array newVisibleDomainMappings) {
		if (newVisibleDomainMappings != visibleDomainMappings) {
			NotificationChain msgs = null;
			if (visibleDomainMappings != null)
				msgs = ((InternalEObject)visibleDomainMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS, null, msgs);
			if (newVisibleDomainMappings != null)
				msgs = ((InternalEObject)newVisibleDomainMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS, null, msgs);
			msgs = basicSetVisibleDomainMappings(newVisibleDomainMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS, newVisibleDomainMappings, newVisibleDomainMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpireTime() {
		return expireTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpireTime(String newExpireTime) {
		String oldExpireTime = expireTime;
		expireTime = newExpireTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__EXPIRE_TIME, oldExpireTime, expireTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTHORIZEDCERTIFICATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(String authorizedCertificatesId, String appsId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list(String appsId, String pageToken, Integer pageSize, String view) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get(String appsId, String view, String authorizedCertificatesId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void patch(String authorizedCertificatesId, String updateMask, String appsId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create(String appsId) {
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
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES:
				return basicSetDomainNames(null, msgs);
			case AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS:
				return basicSetVisibleDomainMappings(null, msgs);
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
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT:
				return getDomainMappingsCount();
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES:
				return getDomainNames();
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DISPLAY_NAME:
				return getDisplayName();
			case AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS:
				return getVisibleDomainMappings();
			case AppenginePackage.AUTHORIZEDCERTIFICATE__EXPIRE_TIME:
				return getExpireTime();
			case AppenginePackage.AUTHORIZEDCERTIFICATE__NAME:
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
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT:
				setDomainMappingsCount((Integer)newValue);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES:
				setDomainNames((array)newValue);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS:
				setVisibleDomainMappings((array)newValue);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__EXPIRE_TIME:
				setExpireTime((String)newValue);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__NAME:
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
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT:
				setDomainMappingsCount(DOMAIN_MAPPINGS_COUNT_EDEFAULT);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES:
				setDomainNames((array)null);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS:
				setVisibleDomainMappings((array)null);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__EXPIRE_TIME:
				setExpireTime(EXPIRE_TIME_EDEFAULT);
				return;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__NAME:
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
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT:
				return DOMAIN_MAPPINGS_COUNT_EDEFAULT == null ? domainMappingsCount != null : !DOMAIN_MAPPINGS_COUNT_EDEFAULT.equals(domainMappingsCount);
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES:
				return domainNames != null;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case AppenginePackage.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS:
				return visibleDomainMappings != null;
			case AppenginePackage.AUTHORIZEDCERTIFICATE__EXPIRE_TIME:
				return EXPIRE_TIME_EDEFAULT == null ? expireTime != null : !EXPIRE_TIME_EDEFAULT.equals(expireTime);
			case AppenginePackage.AUTHORIZEDCERTIFICATE__NAME:
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
			case AppenginePackage.AUTHORIZEDCERTIFICATE___DELETE__STRING_STRING:
				delete((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case AppenginePackage.AUTHORIZEDCERTIFICATE___LIST__STRING_STRING_INTEGER_STRING:
				list((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (String)arguments.get(3));
				return null;
			case AppenginePackage.AUTHORIZEDCERTIFICATE___GET__STRING_STRING_STRING:
				get((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case AppenginePackage.AUTHORIZEDCERTIFICATE___PATCH__STRING_STRING_STRING:
				patch((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case AppenginePackage.AUTHORIZEDCERTIFICATE___CREATE__STRING:
				create((String)arguments.get(0));
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
		result.append(" (domainMappingsCount: ");
		result.append(domainMappingsCount);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", expireTime: ");
		result.append(expireTime);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AuthorizedcertificateImpl
