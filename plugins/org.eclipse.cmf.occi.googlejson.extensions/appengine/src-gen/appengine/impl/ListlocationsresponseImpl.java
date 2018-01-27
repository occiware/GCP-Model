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
import appengine.Listlocationsresponse;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listlocationsresponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ListlocationsresponseImpl#getNextPageToken <em>Next Page Token</em>}</li>
 *   <li>{@link appengine.impl.ListlocationsresponseImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListlocationsresponseImpl extends ResourceImpl implements Listlocationsresponse {
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
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected array locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListlocationsresponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getListlocationsresponse();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN, oldNextPageToken, nextPageToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(array newLocations, NotificationChain msgs) {
		array oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS, oldLocations, newLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(array newLocations) {
		if (newLocations != locations) {
			NotificationChain msgs = null;
			if (locations != null)
				msgs = ((InternalEObject)locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS, null, msgs);
			if (newLocations != null)
				msgs = ((InternalEObject)newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS, null, msgs);
			msgs = basicSetLocations(newLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS, newLocations, newLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS:
				return basicSetLocations(null, msgs);
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
			case AppenginePackage.LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN:
				return getNextPageToken();
			case AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS:
				return getLocations();
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
			case AppenginePackage.LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken((String)newValue);
				return;
			case AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS:
				setLocations((array)newValue);
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
			case AppenginePackage.LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken(NEXT_PAGE_TOKEN_EDEFAULT);
				return;
			case AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS:
				setLocations((array)null);
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
			case AppenginePackage.LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN:
				return NEXT_PAGE_TOKEN_EDEFAULT == null ? nextPageToken != null : !NEXT_PAGE_TOKEN_EDEFAULT.equals(nextPageToken);
			case AppenginePackage.LISTLOCATIONSRESPONSE__LOCATIONS:
				return locations != null;
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

} //ListlocationsresponseImpl
