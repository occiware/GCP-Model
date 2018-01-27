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
import appengine.Cpuutilization;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cpuutilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.CpuutilizationImpl#getAggregationWindowLength <em>Aggregation Window Length</em>}</li>
 *   <li>{@link appengine.impl.CpuutilizationImpl#getTargetUtilization <em>Target Utilization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpuutilizationImpl extends ResourceImpl implements Cpuutilization {
	/**
	 * The default value of the '{@link #getAggregationWindowLength() <em>Aggregation Window Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationWindowLength()
	 * @generated
	 * @ordered
	 */
	protected static final String AGGREGATION_WINDOW_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAggregationWindowLength() <em>Aggregation Window Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationWindowLength()
	 * @generated
	 * @ordered
	 */
	protected String aggregationWindowLength = AGGREGATION_WINDOW_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetUtilization() <em>Target Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_UTILIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetUtilization() <em>Target Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetUtilization()
	 * @generated
	 * @ordered
	 */
	protected Integer targetUtilization = TARGET_UTILIZATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CpuutilizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getCpuutilization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAggregationWindowLength() {
		return aggregationWindowLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationWindowLength(String newAggregationWindowLength) {
		String oldAggregationWindowLength = aggregationWindowLength;
		aggregationWindowLength = newAggregationWindowLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH, oldAggregationWindowLength, aggregationWindowLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetUtilization() {
		return targetUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetUtilization(Integer newTargetUtilization) {
		Integer oldTargetUtilization = targetUtilization;
		targetUtilization = newTargetUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.CPUUTILIZATION__TARGET_UTILIZATION, oldTargetUtilization, targetUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH:
				return getAggregationWindowLength();
			case AppenginePackage.CPUUTILIZATION__TARGET_UTILIZATION:
				return getTargetUtilization();
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
			case AppenginePackage.CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH:
				setAggregationWindowLength((String)newValue);
				return;
			case AppenginePackage.CPUUTILIZATION__TARGET_UTILIZATION:
				setTargetUtilization((Integer)newValue);
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
			case AppenginePackage.CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH:
				setAggregationWindowLength(AGGREGATION_WINDOW_LENGTH_EDEFAULT);
				return;
			case AppenginePackage.CPUUTILIZATION__TARGET_UTILIZATION:
				setTargetUtilization(TARGET_UTILIZATION_EDEFAULT);
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
			case AppenginePackage.CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH:
				return AGGREGATION_WINDOW_LENGTH_EDEFAULT == null ? aggregationWindowLength != null : !AGGREGATION_WINDOW_LENGTH_EDEFAULT.equals(aggregationWindowLength);
			case AppenginePackage.CPUUTILIZATION__TARGET_UTILIZATION:
				return TARGET_UTILIZATION_EDEFAULT == null ? targetUtilization != null : !TARGET_UTILIZATION_EDEFAULT.equals(targetUtilization);
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
		result.append(" (aggregationWindowLength: ");
		result.append(aggregationWindowLength);
		result.append(", targetUtilization: ");
		result.append(targetUtilization);
		result.append(')');
		return result.toString();
	}

} //CpuutilizationImpl
