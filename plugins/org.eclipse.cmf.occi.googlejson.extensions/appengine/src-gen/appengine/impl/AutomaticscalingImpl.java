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
import appengine.Automaticscaling;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Automaticscaling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMinPendingLatency <em>Min Pending Latency</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMaxIdleInstances <em>Max Idle Instances</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMinIdleInstances <em>Min Idle Instances</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMaxTotalInstances <em>Max Total Instances</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMinTotalInstances <em>Min Total Instances</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getCoolDownPeriod <em>Cool Down Period</em>}</li>
 *   <li>{@link appengine.impl.AutomaticscalingImpl#getMaxPendingLatency <em>Max Pending Latency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutomaticscalingImpl extends ResourceImpl implements Automaticscaling {
	/**
	 * The default value of the '{@link #getMinPendingLatency() <em>Min Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_PENDING_LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinPendingLatency() <em>Min Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected String minPendingLatency = MIN_PENDING_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxIdleInstances() <em>Max Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_IDLE_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxIdleInstances() <em>Max Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer maxIdleInstances = MAX_IDLE_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinIdleInstances() <em>Min Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_IDLE_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinIdleInstances() <em>Min Idle Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIdleInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer minIdleInstances = MIN_IDLE_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxTotalInstances() <em>Max Total Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotalInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_TOTAL_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxTotalInstances() <em>Max Total Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTotalInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer maxTotalInstances = MAX_TOTAL_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTotalInstances() <em>Min Total Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotalInstances()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_TOTAL_INSTANCES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinTotalInstances() <em>Min Total Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTotalInstances()
	 * @generated
	 * @ordered
	 */
	protected Integer minTotalInstances = MIN_TOTAL_INSTANCES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CONCURRENT_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxConcurrentRequests() <em>Max Concurrent Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxConcurrentRequests()
	 * @generated
	 * @ordered
	 */
	protected Integer maxConcurrentRequests = MAX_CONCURRENT_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoolDownPeriod() <em>Cool Down Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String COOL_DOWN_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoolDownPeriod() <em>Cool Down Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoolDownPeriod()
	 * @generated
	 * @ordered
	 */
	protected String coolDownPeriod = COOL_DOWN_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPendingLatency() <em>Max Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_PENDING_LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPendingLatency() <em>Max Pending Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPendingLatency()
	 * @generated
	 * @ordered
	 */
	protected String maxPendingLatency = MAX_PENDING_LATENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutomaticscalingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getAutomaticscaling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinPendingLatency() {
		return minPendingLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPendingLatency(String newMinPendingLatency) {
		String oldMinPendingLatency = minPendingLatency;
		minPendingLatency = newMinPendingLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MIN_PENDING_LATENCY, oldMinPendingLatency, minPendingLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxIdleInstances() {
		return maxIdleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIdleInstances(Integer newMaxIdleInstances) {
		Integer oldMaxIdleInstances = maxIdleInstances;
		maxIdleInstances = newMaxIdleInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MAX_IDLE_INSTANCES, oldMaxIdleInstances, maxIdleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinIdleInstances() {
		return minIdleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinIdleInstances(Integer newMinIdleInstances) {
		Integer oldMinIdleInstances = minIdleInstances;
		minIdleInstances = newMinIdleInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MIN_IDLE_INSTANCES, oldMinIdleInstances, minIdleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxTotalInstances() {
		return maxTotalInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTotalInstances(Integer newMaxTotalInstances) {
		Integer oldMaxTotalInstances = maxTotalInstances;
		maxTotalInstances = newMaxTotalInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MAX_TOTAL_INSTANCES, oldMaxTotalInstances, maxTotalInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinTotalInstances() {
		return minTotalInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTotalInstances(Integer newMinTotalInstances) {
		Integer oldMinTotalInstances = minTotalInstances;
		minTotalInstances = newMinTotalInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MIN_TOTAL_INSTANCES, oldMinTotalInstances, minTotalInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxConcurrentRequests() {
		return maxConcurrentRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxConcurrentRequests(Integer newMaxConcurrentRequests) {
		Integer oldMaxConcurrentRequests = maxConcurrentRequests;
		maxConcurrentRequests = newMaxConcurrentRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS, oldMaxConcurrentRequests, maxConcurrentRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoolDownPeriod() {
		return coolDownPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoolDownPeriod(String newCoolDownPeriod) {
		String oldCoolDownPeriod = coolDownPeriod;
		coolDownPeriod = newCoolDownPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__COOL_DOWN_PERIOD, oldCoolDownPeriod, coolDownPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxPendingLatency() {
		return maxPendingLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPendingLatency(String newMaxPendingLatency) {
		String oldMaxPendingLatency = maxPendingLatency;
		maxPendingLatency = newMaxPendingLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.AUTOMATICSCALING__MAX_PENDING_LATENCY, oldMaxPendingLatency, maxPendingLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.AUTOMATICSCALING__MIN_PENDING_LATENCY:
				return getMinPendingLatency();
			case AppenginePackage.AUTOMATICSCALING__MAX_IDLE_INSTANCES:
				return getMaxIdleInstances();
			case AppenginePackage.AUTOMATICSCALING__MIN_IDLE_INSTANCES:
				return getMinIdleInstances();
			case AppenginePackage.AUTOMATICSCALING__MAX_TOTAL_INSTANCES:
				return getMaxTotalInstances();
			case AppenginePackage.AUTOMATICSCALING__MIN_TOTAL_INSTANCES:
				return getMinTotalInstances();
			case AppenginePackage.AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS:
				return getMaxConcurrentRequests();
			case AppenginePackage.AUTOMATICSCALING__COOL_DOWN_PERIOD:
				return getCoolDownPeriod();
			case AppenginePackage.AUTOMATICSCALING__MAX_PENDING_LATENCY:
				return getMaxPendingLatency();
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
			case AppenginePackage.AUTOMATICSCALING__MIN_PENDING_LATENCY:
				setMinPendingLatency((String)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_IDLE_INSTANCES:
				setMaxIdleInstances((Integer)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__MIN_IDLE_INSTANCES:
				setMinIdleInstances((Integer)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_TOTAL_INSTANCES:
				setMaxTotalInstances((Integer)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__MIN_TOTAL_INSTANCES:
				setMinTotalInstances((Integer)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS:
				setMaxConcurrentRequests((Integer)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__COOL_DOWN_PERIOD:
				setCoolDownPeriod((String)newValue);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_PENDING_LATENCY:
				setMaxPendingLatency((String)newValue);
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
			case AppenginePackage.AUTOMATICSCALING__MIN_PENDING_LATENCY:
				setMinPendingLatency(MIN_PENDING_LATENCY_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_IDLE_INSTANCES:
				setMaxIdleInstances(MAX_IDLE_INSTANCES_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__MIN_IDLE_INSTANCES:
				setMinIdleInstances(MIN_IDLE_INSTANCES_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_TOTAL_INSTANCES:
				setMaxTotalInstances(MAX_TOTAL_INSTANCES_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__MIN_TOTAL_INSTANCES:
				setMinTotalInstances(MIN_TOTAL_INSTANCES_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS:
				setMaxConcurrentRequests(MAX_CONCURRENT_REQUESTS_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__COOL_DOWN_PERIOD:
				setCoolDownPeriod(COOL_DOWN_PERIOD_EDEFAULT);
				return;
			case AppenginePackage.AUTOMATICSCALING__MAX_PENDING_LATENCY:
				setMaxPendingLatency(MAX_PENDING_LATENCY_EDEFAULT);
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
			case AppenginePackage.AUTOMATICSCALING__MIN_PENDING_LATENCY:
				return MIN_PENDING_LATENCY_EDEFAULT == null ? minPendingLatency != null : !MIN_PENDING_LATENCY_EDEFAULT.equals(minPendingLatency);
			case AppenginePackage.AUTOMATICSCALING__MAX_IDLE_INSTANCES:
				return MAX_IDLE_INSTANCES_EDEFAULT == null ? maxIdleInstances != null : !MAX_IDLE_INSTANCES_EDEFAULT.equals(maxIdleInstances);
			case AppenginePackage.AUTOMATICSCALING__MIN_IDLE_INSTANCES:
				return MIN_IDLE_INSTANCES_EDEFAULT == null ? minIdleInstances != null : !MIN_IDLE_INSTANCES_EDEFAULT.equals(minIdleInstances);
			case AppenginePackage.AUTOMATICSCALING__MAX_TOTAL_INSTANCES:
				return MAX_TOTAL_INSTANCES_EDEFAULT == null ? maxTotalInstances != null : !MAX_TOTAL_INSTANCES_EDEFAULT.equals(maxTotalInstances);
			case AppenginePackage.AUTOMATICSCALING__MIN_TOTAL_INSTANCES:
				return MIN_TOTAL_INSTANCES_EDEFAULT == null ? minTotalInstances != null : !MIN_TOTAL_INSTANCES_EDEFAULT.equals(minTotalInstances);
			case AppenginePackage.AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS:
				return MAX_CONCURRENT_REQUESTS_EDEFAULT == null ? maxConcurrentRequests != null : !MAX_CONCURRENT_REQUESTS_EDEFAULT.equals(maxConcurrentRequests);
			case AppenginePackage.AUTOMATICSCALING__COOL_DOWN_PERIOD:
				return COOL_DOWN_PERIOD_EDEFAULT == null ? coolDownPeriod != null : !COOL_DOWN_PERIOD_EDEFAULT.equals(coolDownPeriod);
			case AppenginePackage.AUTOMATICSCALING__MAX_PENDING_LATENCY:
				return MAX_PENDING_LATENCY_EDEFAULT == null ? maxPendingLatency != null : !MAX_PENDING_LATENCY_EDEFAULT.equals(maxPendingLatency);
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
		result.append(" (minPendingLatency: ");
		result.append(minPendingLatency);
		result.append(", maxIdleInstances: ");
		result.append(maxIdleInstances);
		result.append(", minIdleInstances: ");
		result.append(minIdleInstances);
		result.append(", maxTotalInstances: ");
		result.append(maxTotalInstances);
		result.append(", minTotalInstances: ");
		result.append(minTotalInstances);
		result.append(", maxConcurrentRequests: ");
		result.append(maxConcurrentRequests);
		result.append(", coolDownPeriod: ");
		result.append(coolDownPeriod);
		result.append(", maxPendingLatency: ");
		result.append(maxPendingLatency);
		result.append(')');
		return result.toString();
	}

} //AutomaticscalingImpl
