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
import appengine.Trafficsplit;

import java.util.Map;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trafficsplit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.TrafficsplitImpl#getShardBy <em>Shard By</em>}</li>
 *   <li>{@link appengine.impl.TrafficsplitImpl#getAllocations <em>Allocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrafficsplitImpl extends ResourceImpl implements Trafficsplit {
	/**
	 * The default value of the '{@link #getShardBy() <em>Shard By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShardBy()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARD_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShardBy() <em>Shard By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShardBy()
	 * @generated
	 * @ordered
	 */
	protected String shardBy = SHARD_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllocations() <em>Allocations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected static final Map ALLOCATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllocations() <em>Allocations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocations()
	 * @generated
	 * @ordered
	 */
	protected Map allocations = ALLOCATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrafficsplitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getTrafficsplit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShardBy() {
		return shardBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShardBy(String newShardBy) {
		String oldShardBy = shardBy;
		shardBy = newShardBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.TRAFFICSPLIT__SHARD_BY, oldShardBy, shardBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getAllocations() {
		return allocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocations(Map newAllocations) {
		Map oldAllocations = allocations;
		allocations = newAllocations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.TRAFFICSPLIT__ALLOCATIONS, oldAllocations, allocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.TRAFFICSPLIT__SHARD_BY:
				return getShardBy();
			case AppenginePackage.TRAFFICSPLIT__ALLOCATIONS:
				return getAllocations();
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
			case AppenginePackage.TRAFFICSPLIT__SHARD_BY:
				setShardBy((String)newValue);
				return;
			case AppenginePackage.TRAFFICSPLIT__ALLOCATIONS:
				setAllocations((Map)newValue);
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
			case AppenginePackage.TRAFFICSPLIT__SHARD_BY:
				setShardBy(SHARD_BY_EDEFAULT);
				return;
			case AppenginePackage.TRAFFICSPLIT__ALLOCATIONS:
				setAllocations(ALLOCATIONS_EDEFAULT);
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
			case AppenginePackage.TRAFFICSPLIT__SHARD_BY:
				return SHARD_BY_EDEFAULT == null ? shardBy != null : !SHARD_BY_EDEFAULT.equals(shardBy);
			case AppenginePackage.TRAFFICSPLIT__ALLOCATIONS:
				return ALLOCATIONS_EDEFAULT == null ? allocations != null : !ALLOCATIONS_EDEFAULT.equals(allocations);
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
		result.append(" (shardBy: ");
		result.append(shardBy);
		result.append(", allocations: ");
		result.append(allocations);
		result.append(')');
		return result.toString();
	}

} //TrafficsplitImpl
