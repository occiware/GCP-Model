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
import appengine.Listauthorizeddomainsresponse;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listauthorizeddomainsresponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ListauthorizeddomainsresponseImpl#getDomains <em>Domains</em>}</li>
 *   <li>{@link appengine.impl.ListauthorizeddomainsresponseImpl#getNextPageToken <em>Next Page Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListauthorizeddomainsresponseImpl extends ResourceImpl implements Listauthorizeddomainsresponse {
	/**
	 * The cached value of the '{@link #getDomains() <em>Domains</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomains()
	 * @generated
	 * @ordered
	 */
	protected array domains;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListauthorizeddomainsresponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getListauthorizeddomainsresponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getDomains() {
		return domains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomains(array newDomains, NotificationChain msgs) {
		array oldDomains = domains;
		domains = newDomains;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS, oldDomains, newDomains);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomains(array newDomains) {
		if (newDomains != domains) {
			NotificationChain msgs = null;
			if (domains != null)
				msgs = ((InternalEObject)domains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS, null, msgs);
			if (newDomains != null)
				msgs = ((InternalEObject)newDomains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS, null, msgs);
			msgs = basicSetDomains(newDomains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS, newDomains, newDomains));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN, oldNextPageToken, nextPageToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS:
				return basicSetDomains(null, msgs);
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
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS:
				return getDomains();
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN:
				return getNextPageToken();
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
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS:
				setDomains((array)newValue);
				return;
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken((String)newValue);
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
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS:
				setDomains((array)null);
				return;
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken(NEXT_PAGE_TOKEN_EDEFAULT);
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
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS:
				return domains != null;
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN:
				return NEXT_PAGE_TOKEN_EDEFAULT == null ? nextPageToken != null : !NEXT_PAGE_TOKEN_EDEFAULT.equals(nextPageToken);
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

} //ListauthorizeddomainsresponseImpl
