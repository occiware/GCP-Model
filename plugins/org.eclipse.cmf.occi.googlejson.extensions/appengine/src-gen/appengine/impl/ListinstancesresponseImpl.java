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
import appengine.Listinstancesresponse;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listinstancesresponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ListinstancesresponseImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link appengine.impl.ListinstancesresponseImpl#getNextPageToken <em>Next Page Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListinstancesresponseImpl extends ResourceImpl implements Listinstancesresponse {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected array instances;

	/**
	 * The default value of the '{@link #getNextPageToken() <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageToken()
	 * @generated
	 * @ordered
	 */
	protected static final String NEXT_PAGE_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNextPageToken() <em>Next Page Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextPageToken()
	 * @generated
	 * @ordered
	 */
	protected String nextPageToken = NEXT_PAGE_TOKEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListinstancesresponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getListinstancesresponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(array newInstances, NotificationChain msgs) {
		array oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(array newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES, newInstances, newInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextPageToken(String newNextPageToken) {
		String oldNextPageToken = nextPageToken;
		nextPageToken = newNextPageToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN, oldNextPageToken, nextPageToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES:
				return basicSetInstances(null, msgs);
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
			case AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES:
				return getInstances();
			case AppenginePackage.LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN:
				return getNextPageToken();
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
			case AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES:
				setInstances((array)newValue);
				return;
			case AppenginePackage.LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken((String)newValue);
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
			case AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES:
				setInstances((array)null);
				return;
			case AppenginePackage.LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken(NEXT_PAGE_TOKEN_EDEFAULT);
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
			case AppenginePackage.LISTINSTANCESRESPONSE__INSTANCES:
				return instances != null;
			case AppenginePackage.LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN:
				return NEXT_PAGE_TOKEN_EDEFAULT == null ? nextPageToken != null : !NEXT_PAGE_TOKEN_EDEFAULT.equals(nextPageToken);
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
		result.append(" (nextPageToken: ");
		result.append(nextPageToken);
		result.append(')');
		return result.toString();
	}

} //ListinstancesresponseImpl
