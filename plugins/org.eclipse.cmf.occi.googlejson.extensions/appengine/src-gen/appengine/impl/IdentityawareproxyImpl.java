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
import appengine.Identityawareproxy;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identityawareproxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.IdentityawareproxyImpl#getOauth2ClientSecret <em>Oauth2 Client Secret</em>}</li>
 *   <li>{@link appengine.impl.IdentityawareproxyImpl#getOauth2ClientId <em>Oauth2 Client Id</em>}</li>
 *   <li>{@link appengine.impl.IdentityawareproxyImpl#getOauth2ClientSecretSha256 <em>Oauth2 Client Secret Sha256</em>}</li>
 *   <li>{@link appengine.impl.IdentityawareproxyImpl#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentityawareproxyImpl extends ResourceImpl implements Identityawareproxy {
	/**
	 * The default value of the '{@link #getOauth2ClientSecret() <em>Oauth2 Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauth2ClientSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH2_CLIENT_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauth2ClientSecret() <em>Oauth2 Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauth2ClientSecret()
	 * @generated
	 * @ordered
	 */
	protected String oauth2ClientSecret = OAUTH2_CLIENT_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauth2ClientId() <em>Oauth2 Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauth2ClientId()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH2_CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauth2ClientId() <em>Oauth2 Client Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauth2ClientId()
	 * @generated
	 * @ordered
	 */
	protected String oauth2ClientId = OAUTH2_CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOauth2ClientSecretSha256() <em>Oauth2 Client Secret Sha256</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauth2ClientSecretSha256()
	 * @generated
	 * @ordered
	 */
	protected static final String OAUTH2_CLIENT_SECRET_SHA256_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOauth2ClientSecretSha256() <em>Oauth2 Client Secret Sha256</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOauth2ClientSecretSha256()
	 * @generated
	 * @ordered
	 */
	protected String oauth2ClientSecretSha256 = OAUTH2_CLIENT_SECRET_SHA256_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityawareproxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getIdentityawareproxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauth2ClientSecret() {
		return oauth2ClientSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauth2ClientSecret(String newOauth2ClientSecret) {
		String oldOauth2ClientSecret = oauth2ClientSecret;
		oauth2ClientSecret = newOauth2ClientSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET, oldOauth2ClientSecret, oauth2ClientSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauth2ClientId() {
		return oauth2ClientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauth2ClientId(String newOauth2ClientId) {
		String oldOauth2ClientId = oauth2ClientId;
		oauth2ClientId = newOauth2ClientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID, oldOauth2ClientId, oauth2ClientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOauth2ClientSecretSha256() {
		return oauth2ClientSecretSha256;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOauth2ClientSecretSha256(String newOauth2ClientSecretSha256) {
		String oldOauth2ClientSecretSha256 = oauth2ClientSecretSha256;
		oauth2ClientSecretSha256 = newOauth2ClientSecretSha256;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256, oldOauth2ClientSecretSha256, oauth2ClientSecretSha256));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.IDENTITYAWAREPROXY__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET:
				return getOauth2ClientSecret();
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID:
				return getOauth2ClientId();
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256:
				return getOauth2ClientSecretSha256();
			case AppenginePackage.IDENTITYAWAREPROXY__ENABLED:
				return isEnabled();
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
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET:
				setOauth2ClientSecret((String)newValue);
				return;
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID:
				setOauth2ClientId((String)newValue);
				return;
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256:
				setOauth2ClientSecretSha256((String)newValue);
				return;
			case AppenginePackage.IDENTITYAWAREPROXY__ENABLED:
				setEnabled((Boolean)newValue);
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
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET:
				setOauth2ClientSecret(OAUTH2_CLIENT_SECRET_EDEFAULT);
				return;
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID:
				setOauth2ClientId(OAUTH2_CLIENT_ID_EDEFAULT);
				return;
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256:
				setOauth2ClientSecretSha256(OAUTH2_CLIENT_SECRET_SHA256_EDEFAULT);
				return;
			case AppenginePackage.IDENTITYAWAREPROXY__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
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
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET:
				return OAUTH2_CLIENT_SECRET_EDEFAULT == null ? oauth2ClientSecret != null : !OAUTH2_CLIENT_SECRET_EDEFAULT.equals(oauth2ClientSecret);
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID:
				return OAUTH2_CLIENT_ID_EDEFAULT == null ? oauth2ClientId != null : !OAUTH2_CLIENT_ID_EDEFAULT.equals(oauth2ClientId);
			case AppenginePackage.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256:
				return OAUTH2_CLIENT_SECRET_SHA256_EDEFAULT == null ? oauth2ClientSecretSha256 != null : !OAUTH2_CLIENT_SECRET_SHA256_EDEFAULT.equals(oauth2ClientSecretSha256);
			case AppenginePackage.IDENTITYAWAREPROXY__ENABLED:
				return enabled != ENABLED_EDEFAULT;
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
		result.append(" (oauth2ClientSecret: ");
		result.append(oauth2ClientSecret);
		result.append(", oauth2ClientId: ");
		result.append(oauth2ClientId);
		result.append(", oauth2ClientSecretSha256: ");
		result.append(oauth2ClientSecretSha256);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(')');
		return result.toString();
	}

} //IdentityawareproxyImpl
