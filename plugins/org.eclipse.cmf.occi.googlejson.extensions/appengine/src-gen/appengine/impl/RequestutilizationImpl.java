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
import appengine.Requestutilization;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requestutilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.RequestutilizationImpl#getTargetRequestCountPerSecond <em>Target Request Count Per Second</em>}</li>
 *   <li>{@link appengine.impl.RequestutilizationImpl#getTargetConcurrentRequests <em>Target Concurrent Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestutilizationImpl extends ResourceImpl implements Requestutilization {
	/**
	 * The default value of the '{@link #getTargetRequestCountPerSecond() <em>Target Request Count Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRequestCountPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_REQUEST_COUNT_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRequestCountPerSecond() <em>Target Request Count Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRequestCountPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetRequestCountPerSecond = TARGET_REQUEST_COUNT_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetConcurrentRequests() <em>Target Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_CONCURRENT_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetConcurrentRequests() <em>Target Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected Integer targetConcurrentRequests = TARGET_CONCURRENT_REQUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestutilizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getRequestutilization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetRequestCountPerSecond() {
		return targetRequestCountPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRequestCountPerSecond(Integer newTargetRequestCountPerSecond) {
		Integer oldTargetRequestCountPerSecond = targetRequestCountPerSecond;
		targetRequestCountPerSecond = newTargetRequestCountPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND, oldTargetRequestCountPerSecond, targetRequestCountPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetConcurrentRequests() {
		return targetConcurrentRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetConcurrentRequests(Integer newTargetConcurrentRequests) {
		Integer oldTargetConcurrentRequests = targetConcurrentRequests;
		targetConcurrentRequests = newTargetConcurrentRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS, oldTargetConcurrentRequests, targetConcurrentRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND:
				return getTargetRequestCountPerSecond();
			case AppenginePackage.REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS:
				return getTargetConcurrentRequests();
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
			case AppenginePackage.REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND:
				setTargetRequestCountPerSecond((Integer)newValue);
				return;
			case AppenginePackage.REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS:
				setTargetConcurrentRequests((Integer)newValue);
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
			case AppenginePackage.REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND:
				setTargetRequestCountPerSecond(TARGET_REQUEST_COUNT_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS:
				setTargetConcurrentRequests(TARGET_CONCURRENT_REQUESTS_EDEFAULT);
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
			case AppenginePackage.REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND:
				return TARGET_REQUEST_COUNT_PER_SECOND_EDEFAULT == null ? targetRequestCountPerSecond != null : !TARGET_REQUEST_COUNT_PER_SECOND_EDEFAULT.equals(targetRequestCountPerSecond);
			case AppenginePackage.REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS:
				return TARGET_CONCURRENT_REQUESTS_EDEFAULT == null ? targetConcurrentRequests != null : !TARGET_CONCURRENT_REQUESTS_EDEFAULT.equals(targetConcurrentRequests);
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
		result.append(" (targetRequestCountPerSecond: ");
		result.append(targetRequestCountPerSecond);
		result.append(", targetConcurrentRequests: ");
		result.append(targetConcurrentRequests);
		result.append(')');
		return result.toString();
	}

} //RequestutilizationImpl
