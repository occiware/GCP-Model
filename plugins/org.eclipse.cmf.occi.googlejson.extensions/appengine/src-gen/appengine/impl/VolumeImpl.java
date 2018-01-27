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
import appengine.Volume;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.VolumeImpl#getVolumeType <em>Volume Type</em>}</li>
 *   <li>{@link appengine.impl.VolumeImpl#getSizeGb <em>Size Gb</em>}</li>
 *   <li>{@link appengine.impl.VolumeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends ResourceImpl implements Volume {
	/**
	 * The default value of the '{@link #getVolumeType() <em>Volume Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeType()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeType() <em>Volume Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeType()
	 * @generated
	 * @ordered
	 */
	protected String volumeType = VOLUME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeGb() <em>Size Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeGb()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_GB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeGb() <em>Size Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeGb()
	 * @generated
	 * @ordered
	 */
	protected Integer sizeGb = SIZE_GB_EDEFAULT;

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
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getVolume();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolumeType() {
		return volumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeType(String newVolumeType) {
		String oldVolumeType = volumeType;
		volumeType = newVolumeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VOLUME__VOLUME_TYPE, oldVolumeType, volumeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSizeGb() {
		return sizeGb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeGb(Integer newSizeGb) {
		Integer oldSizeGb = sizeGb;
		sizeGb = newSizeGb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VOLUME__SIZE_GB, oldSizeGb, sizeGb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.VOLUME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.VOLUME__VOLUME_TYPE:
				return getVolumeType();
			case AppenginePackage.VOLUME__SIZE_GB:
				return getSizeGb();
			case AppenginePackage.VOLUME__NAME:
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
			case AppenginePackage.VOLUME__VOLUME_TYPE:
				setVolumeType((String)newValue);
				return;
			case AppenginePackage.VOLUME__SIZE_GB:
				setSizeGb((Integer)newValue);
				return;
			case AppenginePackage.VOLUME__NAME:
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
			case AppenginePackage.VOLUME__VOLUME_TYPE:
				setVolumeType(VOLUME_TYPE_EDEFAULT);
				return;
			case AppenginePackage.VOLUME__SIZE_GB:
				setSizeGb(SIZE_GB_EDEFAULT);
				return;
			case AppenginePackage.VOLUME__NAME:
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
			case AppenginePackage.VOLUME__VOLUME_TYPE:
				return VOLUME_TYPE_EDEFAULT == null ? volumeType != null : !VOLUME_TYPE_EDEFAULT.equals(volumeType);
			case AppenginePackage.VOLUME__SIZE_GB:
				return SIZE_GB_EDEFAULT == null ? sizeGb != null : !SIZE_GB_EDEFAULT.equals(sizeGb);
			case AppenginePackage.VOLUME__NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (volumeType: ");
		result.append(volumeType);
		result.append(", sizeGb: ");
		result.append(sizeGb);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
