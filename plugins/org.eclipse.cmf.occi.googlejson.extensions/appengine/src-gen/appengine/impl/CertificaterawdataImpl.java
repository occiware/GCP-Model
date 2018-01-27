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
import appengine.Certificaterawdata;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificaterawdata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.CertificaterawdataImpl#getPublicCertificate <em>Public Certificate</em>}</li>
 *   <li>{@link appengine.impl.CertificaterawdataImpl#getPrivateKey <em>Private Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificaterawdataImpl extends ResourceImpl implements Certificaterawdata {
	/**
	 * The default value of the '{@link #getPublicCertificate() <em>Public Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicCertificate() <em>Public Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicCertificate()
	 * @generated
	 * @ordered
	 */
	protected String publicCertificate = PUBLIC_CERTIFICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKey() <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKey()
	 * @generated
	 * @ordered
	 */
	protected String privateKey = PRIVATE_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificaterawdataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getCertificaterawdata();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicCertificate() {
		return publicCertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicCertificate(String newPublicCertificate) {
		String oldPublicCertificate = publicCertificate;
		publicCertificate = newPublicCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.CERTIFICATERAWDATA__PUBLIC_CERTIFICATE, oldPublicCertificate, publicCertificate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKey() {
		return privateKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKey(String newPrivateKey) {
		String oldPrivateKey = privateKey;
		privateKey = newPrivateKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.CERTIFICATERAWDATA__PRIVATE_KEY, oldPrivateKey, privateKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.CERTIFICATERAWDATA__PUBLIC_CERTIFICATE:
				return getPublicCertificate();
			case AppenginePackage.CERTIFICATERAWDATA__PRIVATE_KEY:
				return getPrivateKey();
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
			case AppenginePackage.CERTIFICATERAWDATA__PUBLIC_CERTIFICATE:
				setPublicCertificate((String)newValue);
				return;
			case AppenginePackage.CERTIFICATERAWDATA__PRIVATE_KEY:
				setPrivateKey((String)newValue);
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
			case AppenginePackage.CERTIFICATERAWDATA__PUBLIC_CERTIFICATE:
				setPublicCertificate(PUBLIC_CERTIFICATE_EDEFAULT);
				return;
			case AppenginePackage.CERTIFICATERAWDATA__PRIVATE_KEY:
				setPrivateKey(PRIVATE_KEY_EDEFAULT);
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
			case AppenginePackage.CERTIFICATERAWDATA__PUBLIC_CERTIFICATE:
				return PUBLIC_CERTIFICATE_EDEFAULT == null ? publicCertificate != null : !PUBLIC_CERTIFICATE_EDEFAULT.equals(publicCertificate);
			case AppenginePackage.CERTIFICATERAWDATA__PRIVATE_KEY:
				return PRIVATE_KEY_EDEFAULT == null ? privateKey != null : !PRIVATE_KEY_EDEFAULT.equals(privateKey);
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
		result.append(" (publicCertificate: ");
		result.append(publicCertificate);
		result.append(", privateKey: ");
		result.append(privateKey);
		result.append(')');
		return result.toString();
	}

} //CertificaterawdataImpl
