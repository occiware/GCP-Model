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
import appengine.Networkutilization;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Networkutilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.NetworkutilizationImpl#getTargetSentPacketsPerSecond <em>Target Sent Packets Per Second</em>}</li>
 *   <li>{@link appengine.impl.NetworkutilizationImpl#getTargetReceivedBytesPerSecond <em>Target Received Bytes Per Second</em>}</li>
 *   <li>{@link appengine.impl.NetworkutilizationImpl#getTargetReceivedPacketsPerSecond <em>Target Received Packets Per Second</em>}</li>
 *   <li>{@link appengine.impl.NetworkutilizationImpl#getTargetSentBytesPerSecond <em>Target Sent Bytes Per Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkutilizationImpl extends ResourceImpl implements Networkutilization {
	/**
	 * The default value of the '{@link #getTargetSentPacketsPerSecond() <em>Target Sent Packets Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSentPacketsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_SENT_PACKETS_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSentPacketsPerSecond() <em>Target Sent Packets Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSentPacketsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetSentPacketsPerSecond = TARGET_SENT_PACKETS_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetReceivedBytesPerSecond() <em>Target Received Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReceivedBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_RECEIVED_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetReceivedBytesPerSecond() <em>Target Received Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReceivedBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetReceivedBytesPerSecond = TARGET_RECEIVED_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetReceivedPacketsPerSecond() <em>Target Received Packets Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReceivedPacketsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_RECEIVED_PACKETS_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetReceivedPacketsPerSecond() <em>Target Received Packets Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReceivedPacketsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetReceivedPacketsPerSecond = TARGET_RECEIVED_PACKETS_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetSentBytesPerSecond() <em>Target Sent Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSentBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_SENT_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSentBytesPerSecond() <em>Target Sent Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSentBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetSentBytesPerSecond = TARGET_SENT_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkutilizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getNetworkutilization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetSentPacketsPerSecond() {
		return targetSentPacketsPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSentPacketsPerSecond(Integer newTargetSentPacketsPerSecond) {
		Integer oldTargetSentPacketsPerSecond = targetSentPacketsPerSecond;
		targetSentPacketsPerSecond = newTargetSentPacketsPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND, oldTargetSentPacketsPerSecond, targetSentPacketsPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetReceivedBytesPerSecond() {
		return targetReceivedBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetReceivedBytesPerSecond(Integer newTargetReceivedBytesPerSecond) {
		Integer oldTargetReceivedBytesPerSecond = targetReceivedBytesPerSecond;
		targetReceivedBytesPerSecond = newTargetReceivedBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND, oldTargetReceivedBytesPerSecond, targetReceivedBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetReceivedPacketsPerSecond() {
		return targetReceivedPacketsPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetReceivedPacketsPerSecond(Integer newTargetReceivedPacketsPerSecond) {
		Integer oldTargetReceivedPacketsPerSecond = targetReceivedPacketsPerSecond;
		targetReceivedPacketsPerSecond = newTargetReceivedPacketsPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND, oldTargetReceivedPacketsPerSecond, targetReceivedPacketsPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetSentBytesPerSecond() {
		return targetSentBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSentBytesPerSecond(Integer newTargetSentBytesPerSecond) {
		Integer oldTargetSentBytesPerSecond = targetSentBytesPerSecond;
		targetSentBytesPerSecond = newTargetSentBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND, oldTargetSentBytesPerSecond, targetSentBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND:
				return getTargetSentPacketsPerSecond();
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND:
				return getTargetReceivedBytesPerSecond();
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND:
				return getTargetReceivedPacketsPerSecond();
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND:
				return getTargetSentBytesPerSecond();
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
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND:
				setTargetSentPacketsPerSecond((Integer)newValue);
				return;
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND:
				setTargetReceivedBytesPerSecond((Integer)newValue);
				return;
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND:
				setTargetReceivedPacketsPerSecond((Integer)newValue);
				return;
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND:
				setTargetSentBytesPerSecond((Integer)newValue);
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
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND:
				setTargetSentPacketsPerSecond(TARGET_SENT_PACKETS_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND:
				setTargetReceivedBytesPerSecond(TARGET_RECEIVED_BYTES_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND:
				setTargetReceivedPacketsPerSecond(TARGET_RECEIVED_PACKETS_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND:
				setTargetSentBytesPerSecond(TARGET_SENT_BYTES_PER_SECOND_EDEFAULT);
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
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND:
				return TARGET_SENT_PACKETS_PER_SECOND_EDEFAULT == null ? targetSentPacketsPerSecond != null : !TARGET_SENT_PACKETS_PER_SECOND_EDEFAULT.equals(targetSentPacketsPerSecond);
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND:
				return TARGET_RECEIVED_BYTES_PER_SECOND_EDEFAULT == null ? targetReceivedBytesPerSecond != null : !TARGET_RECEIVED_BYTES_PER_SECOND_EDEFAULT.equals(targetReceivedBytesPerSecond);
			case AppenginePackage.NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND:
				return TARGET_RECEIVED_PACKETS_PER_SECOND_EDEFAULT == null ? targetReceivedPacketsPerSecond != null : !TARGET_RECEIVED_PACKETS_PER_SECOND_EDEFAULT.equals(targetReceivedPacketsPerSecond);
			case AppenginePackage.NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND:
				return TARGET_SENT_BYTES_PER_SECOND_EDEFAULT == null ? targetSentBytesPerSecond != null : !TARGET_SENT_BYTES_PER_SECOND_EDEFAULT.equals(targetSentBytesPerSecond);
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
		result.append(" (targetSentPacketsPerSecond: ");
		result.append(targetSentPacketsPerSecond);
		result.append(", targetReceivedBytesPerSecond: ");
		result.append(targetReceivedBytesPerSecond);
		result.append(", targetReceivedPacketsPerSecond: ");
		result.append(targetReceivedPacketsPerSecond);
		result.append(", targetSentBytesPerSecond: ");
		result.append(targetSentBytesPerSecond);
		result.append(')');
		return result.toString();
	}

} //NetworkutilizationImpl
