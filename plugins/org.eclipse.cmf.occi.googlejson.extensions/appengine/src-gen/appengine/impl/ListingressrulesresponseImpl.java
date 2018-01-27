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
import appengine.Listingressrulesresponse;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Listingressrulesresponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ListingressrulesresponseImpl#getNextPageToken <em>Next Page Token</em>}</li>
 *   <li>{@link appengine.impl.ListingressrulesresponseImpl#getIngressRules <em>Ingress Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListingressrulesresponseImpl extends ResourceImpl implements Listingressrulesresponse {
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
	 * The cached value of the '{@link #getIngressRules() <em>Ingress Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngressRules()
	 * @generated
	 * @ordered
	 */
	protected array ingressRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListingressrulesresponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getListingressrulesresponse();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN, oldNextPageToken, nextPageToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getIngressRules() {
		return ingressRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIngressRules(array newIngressRules, NotificationChain msgs) {
		array oldIngressRules = ingressRules;
		ingressRules = newIngressRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES, oldIngressRules, newIngressRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIngressRules(array newIngressRules) {
		if (newIngressRules != ingressRules) {
			NotificationChain msgs = null;
			if (ingressRules != null)
				msgs = ((InternalEObject)ingressRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES, null, msgs);
			if (newIngressRules != null)
				msgs = ((InternalEObject)newIngressRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES, null, msgs);
			msgs = basicSetIngressRules(newIngressRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES, newIngressRules, newIngressRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES:
				return basicSetIngressRules(null, msgs);
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
			case AppenginePackage.LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN:
				return getNextPageToken();
			case AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES:
				return getIngressRules();
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
			case AppenginePackage.LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken((String)newValue);
				return;
			case AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES:
				setIngressRules((array)newValue);
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
			case AppenginePackage.LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN:
				setNextPageToken(NEXT_PAGE_TOKEN_EDEFAULT);
				return;
			case AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES:
				setIngressRules((array)null);
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
			case AppenginePackage.LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN:
				return NEXT_PAGE_TOKEN_EDEFAULT == null ? nextPageToken != null : !NEXT_PAGE_TOKEN_EDEFAULT.equals(nextPageToken);
			case AppenginePackage.LISTINGRESSRULESRESPONSE__INGRESS_RULES:
				return ingressRules != null;
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

} //ListingressrulesresponseImpl
