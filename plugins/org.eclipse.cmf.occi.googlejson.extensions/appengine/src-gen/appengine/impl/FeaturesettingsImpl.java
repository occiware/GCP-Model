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
import appengine.Featuresettings;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Featuresettings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.FeaturesettingsImpl#isSplitHealthChecks <em>Split Health Checks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeaturesettingsImpl extends ResourceImpl implements Featuresettings {
	/**
	 * The default value of the '{@link #isSplitHealthChecks() <em>Split Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitHealthChecks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLIT_HEALTH_CHECKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSplitHealthChecks() <em>Split Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitHealthChecks()
	 * @generated
	 * @ordered
	 */
	protected boolean splitHealthChecks = SPLIT_HEALTH_CHECKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getFeaturesettings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSplitHealthChecks() {
		return splitHealthChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitHealthChecks(boolean newSplitHealthChecks) {
		boolean oldSplitHealthChecks = splitHealthChecks;
		splitHealthChecks = newSplitHealthChecks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FEATURESETTINGS__SPLIT_HEALTH_CHECKS, oldSplitHealthChecks, splitHealthChecks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.FEATURESETTINGS__SPLIT_HEALTH_CHECKS:
				return isSplitHealthChecks();
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
			case AppenginePackage.FEATURESETTINGS__SPLIT_HEALTH_CHECKS:
				setSplitHealthChecks((Boolean)newValue);
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
			case AppenginePackage.FEATURESETTINGS__SPLIT_HEALTH_CHECKS:
				setSplitHealthChecks(SPLIT_HEALTH_CHECKS_EDEFAULT);
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
			case AppenginePackage.FEATURESETTINGS__SPLIT_HEALTH_CHECKS:
				return splitHealthChecks != SPLIT_HEALTH_CHECKS_EDEFAULT;
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
		result.append(" (splitHealthChecks: ");
		result.append(splitHealthChecks);
		result.append(')');
		return result.toString();
	}

} //FeaturesettingsImpl
