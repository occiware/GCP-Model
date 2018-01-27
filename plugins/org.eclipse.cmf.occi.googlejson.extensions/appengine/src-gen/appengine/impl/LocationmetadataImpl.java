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
import appengine.Locationmetadata;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locationmetadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.LocationmetadataImpl#isFlexibleEnvironmentAvailable <em>Flexible Environment Available</em>}</li>
 *   <li>{@link appengine.impl.LocationmetadataImpl#isStandardEnvironmentAvailable <em>Standard Environment Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationmetadataImpl extends ResourceImpl implements Locationmetadata {
	/**
	 * The default value of the '{@link #isFlexibleEnvironmentAvailable() <em>Flexible Environment Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlexibleEnvironmentAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLEXIBLE_ENVIRONMENT_AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlexibleEnvironmentAvailable() <em>Flexible Environment Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlexibleEnvironmentAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean flexibleEnvironmentAvailable = FLEXIBLE_ENVIRONMENT_AVAILABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStandardEnvironmentAvailable() <em>Standard Environment Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardEnvironmentAvailable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STANDARD_ENVIRONMENT_AVAILABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStandardEnvironmentAvailable() <em>Standard Environment Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandardEnvironmentAvailable()
	 * @generated
	 * @ordered
	 */
	protected boolean standardEnvironmentAvailable = STANDARD_ENVIRONMENT_AVAILABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationmetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getLocationmetadata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlexibleEnvironmentAvailable() {
		return flexibleEnvironmentAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlexibleEnvironmentAvailable(boolean newFlexibleEnvironmentAvailable) {
		boolean oldFlexibleEnvironmentAvailable = flexibleEnvironmentAvailable;
		flexibleEnvironmentAvailable = newFlexibleEnvironmentAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE, oldFlexibleEnvironmentAvailable, flexibleEnvironmentAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStandardEnvironmentAvailable() {
		return standardEnvironmentAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardEnvironmentAvailable(boolean newStandardEnvironmentAvailable) {
		boolean oldStandardEnvironmentAvailable = standardEnvironmentAvailable;
		standardEnvironmentAvailable = newStandardEnvironmentAvailable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE, oldStandardEnvironmentAvailable, standardEnvironmentAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE:
				return isFlexibleEnvironmentAvailable();
			case AppenginePackage.LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE:
				return isStandardEnvironmentAvailable();
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
			case AppenginePackage.LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE:
				setFlexibleEnvironmentAvailable((Boolean)newValue);
				return;
			case AppenginePackage.LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE:
				setStandardEnvironmentAvailable((Boolean)newValue);
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
			case AppenginePackage.LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE:
				setFlexibleEnvironmentAvailable(FLEXIBLE_ENVIRONMENT_AVAILABLE_EDEFAULT);
				return;
			case AppenginePackage.LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE:
				setStandardEnvironmentAvailable(STANDARD_ENVIRONMENT_AVAILABLE_EDEFAULT);
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
			case AppenginePackage.LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE:
				return flexibleEnvironmentAvailable != FLEXIBLE_ENVIRONMENT_AVAILABLE_EDEFAULT;
			case AppenginePackage.LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE:
				return standardEnvironmentAvailable != STANDARD_ENVIRONMENT_AVAILABLE_EDEFAULT;
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
		result.append(" (flexibleEnvironmentAvailable: ");
		result.append(flexibleEnvironmentAvailable);
		result.append(", standardEnvironmentAvailable: ");
		result.append(standardEnvironmentAvailable);
		result.append(')');
		return result.toString();
	}

} //LocationmetadataImpl
