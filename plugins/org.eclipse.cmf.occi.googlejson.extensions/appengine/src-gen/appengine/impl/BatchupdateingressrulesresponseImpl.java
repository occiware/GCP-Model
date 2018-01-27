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
import appengine.Batchupdateingressrulesresponse;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Batchupdateingressrulesresponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.BatchupdateingressrulesresponseImpl#getIngressRules <em>Ingress Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatchupdateingressrulesresponseImpl extends ResourceImpl implements Batchupdateingressrulesresponse {
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
	protected BatchupdateingressrulesresponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getBatchupdateingressrulesresponse();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES, oldIngressRules, newIngressRules);
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
				msgs = ((InternalEObject)ingressRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES, null, msgs);
			if (newIngressRules != null)
				msgs = ((InternalEObject)newIngressRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES, null, msgs);
			msgs = basicSetIngressRules(newIngressRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES, newIngressRules, newIngressRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES:
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
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES:
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
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES:
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
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES:
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
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES:
				return ingressRules != null;
		}
		return super.eIsSet(featureID);
	}

} //BatchupdateingressrulesresponseImpl
