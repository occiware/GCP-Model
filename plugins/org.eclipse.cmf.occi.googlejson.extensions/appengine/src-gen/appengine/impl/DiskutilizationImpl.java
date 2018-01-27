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
import appengine.Diskutilization;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diskutilization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.DiskutilizationImpl#getTargetWriteBytesPerSecond <em>Target Write Bytes Per Second</em>}</li>
 *   <li>{@link appengine.impl.DiskutilizationImpl#getTargetReadBytesPerSecond <em>Target Read Bytes Per Second</em>}</li>
 *   <li>{@link appengine.impl.DiskutilizationImpl#getTargetReadOpsPerSecond <em>Target Read Ops Per Second</em>}</li>
 *   <li>{@link appengine.impl.DiskutilizationImpl#getTargetWriteOpsPerSecond <em>Target Write Ops Per Second</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiskutilizationImpl extends ResourceImpl implements Diskutilization {
	/**
	 * The default value of the '{@link #getTargetWriteBytesPerSecond() <em>Target Write Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWriteBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_WRITE_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetWriteBytesPerSecond() <em>Target Write Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWriteBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetWriteBytesPerSecond = TARGET_WRITE_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetReadBytesPerSecond() <em>Target Read Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReadBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_READ_BYTES_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetReadBytesPerSecond() <em>Target Read Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReadBytesPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetReadBytesPerSecond = TARGET_READ_BYTES_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetReadOpsPerSecond() <em>Target Read Ops Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReadOpsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_READ_OPS_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetReadOpsPerSecond() <em>Target Read Ops Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetReadOpsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetReadOpsPerSecond = TARGET_READ_OPS_PER_SECOND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetWriteOpsPerSecond() <em>Target Write Ops Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWriteOpsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_WRITE_OPS_PER_SECOND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetWriteOpsPerSecond() <em>Target Write Ops Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetWriteOpsPerSecond()
	 * @generated
	 * @ordered
	 */
	protected Integer targetWriteOpsPerSecond = TARGET_WRITE_OPS_PER_SECOND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiskutilizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getDiskutilization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetWriteBytesPerSecond() {
		return targetWriteBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetWriteBytesPerSecond(Integer newTargetWriteBytesPerSecond) {
		Integer oldTargetWriteBytesPerSecond = targetWriteBytesPerSecond;
		targetWriteBytesPerSecond = newTargetWriteBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND, oldTargetWriteBytesPerSecond, targetWriteBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetReadBytesPerSecond() {
		return targetReadBytesPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetReadBytesPerSecond(Integer newTargetReadBytesPerSecond) {
		Integer oldTargetReadBytesPerSecond = targetReadBytesPerSecond;
		targetReadBytesPerSecond = newTargetReadBytesPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND, oldTargetReadBytesPerSecond, targetReadBytesPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetReadOpsPerSecond() {
		return targetReadOpsPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetReadOpsPerSecond(Integer newTargetReadOpsPerSecond) {
		Integer oldTargetReadOpsPerSecond = targetReadOpsPerSecond;
		targetReadOpsPerSecond = newTargetReadOpsPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND, oldTargetReadOpsPerSecond, targetReadOpsPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetWriteOpsPerSecond() {
		return targetWriteOpsPerSecond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetWriteOpsPerSecond(Integer newTargetWriteOpsPerSecond) {
		Integer oldTargetWriteOpsPerSecond = targetWriteOpsPerSecond;
		targetWriteOpsPerSecond = newTargetWriteOpsPerSecond;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND, oldTargetWriteOpsPerSecond, targetWriteOpsPerSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND:
				return getTargetWriteBytesPerSecond();
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND:
				return getTargetReadBytesPerSecond();
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND:
				return getTargetReadOpsPerSecond();
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND:
				return getTargetWriteOpsPerSecond();
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
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND:
				setTargetWriteBytesPerSecond((Integer)newValue);
				return;
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND:
				setTargetReadBytesPerSecond((Integer)newValue);
				return;
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND:
				setTargetReadOpsPerSecond((Integer)newValue);
				return;
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND:
				setTargetWriteOpsPerSecond((Integer)newValue);
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
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND:
				setTargetWriteBytesPerSecond(TARGET_WRITE_BYTES_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND:
				setTargetReadBytesPerSecond(TARGET_READ_BYTES_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND:
				setTargetReadOpsPerSecond(TARGET_READ_OPS_PER_SECOND_EDEFAULT);
				return;
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND:
				setTargetWriteOpsPerSecond(TARGET_WRITE_OPS_PER_SECOND_EDEFAULT);
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
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND:
				return TARGET_WRITE_BYTES_PER_SECOND_EDEFAULT == null ? targetWriteBytesPerSecond != null : !TARGET_WRITE_BYTES_PER_SECOND_EDEFAULT.equals(targetWriteBytesPerSecond);
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND:
				return TARGET_READ_BYTES_PER_SECOND_EDEFAULT == null ? targetReadBytesPerSecond != null : !TARGET_READ_BYTES_PER_SECOND_EDEFAULT.equals(targetReadBytesPerSecond);
			case AppenginePackage.DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND:
				return TARGET_READ_OPS_PER_SECOND_EDEFAULT == null ? targetReadOpsPerSecond != null : !TARGET_READ_OPS_PER_SECOND_EDEFAULT.equals(targetReadOpsPerSecond);
			case AppenginePackage.DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND:
				return TARGET_WRITE_OPS_PER_SECOND_EDEFAULT == null ? targetWriteOpsPerSecond != null : !TARGET_WRITE_OPS_PER_SECOND_EDEFAULT.equals(targetWriteOpsPerSecond);
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
		result.append(" (targetWriteBytesPerSecond: ");
		result.append(targetWriteBytesPerSecond);
		result.append(", targetReadBytesPerSecond: ");
		result.append(targetReadBytesPerSecond);
		result.append(", targetReadOpsPerSecond: ");
		result.append(targetReadOpsPerSecond);
		result.append(", targetWriteOpsPerSecond: ");
		result.append(targetWriteOpsPerSecond);
		result.append(')');
		return result.toString();
	}

} //DiskutilizationImpl
