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
import appengine.Urlmap;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Urlmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.UrlmapImpl#getRedirectHttpResponseCode <em>Redirect Http Response Code</em>}</li>
 *   <li>{@link appengine.impl.UrlmapImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link appengine.impl.UrlmapImpl#getAuthFailAction <em>Auth Fail Action</em>}</li>
 *   <li>{@link appengine.impl.UrlmapImpl#getUrlRegex <em>Url Regex</em>}</li>
 *   <li>{@link appengine.impl.UrlmapImpl#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UrlmapImpl extends ResourceImpl implements Urlmap {
	/**
	 * The default value of the '{@link #getRedirectHttpResponseCode() <em>Redirect Http Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectHttpResponseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String REDIRECT_HTTP_RESPONSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedirectHttpResponseCode() <em>Redirect Http Response Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectHttpResponseCode()
	 * @generated
	 * @ordered
	 */
	protected String redirectHttpResponseCode = REDIRECT_HTTP_RESPONSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityLevel() <em>Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected String securityLevel = SECURITY_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthFailAction() <em>Auth Fail Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthFailAction()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_FAIL_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthFailAction() <em>Auth Fail Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthFailAction()
	 * @generated
	 * @ordered
	 */
	protected String authFailAction = AUTH_FAIL_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrlRegex() <em>Url Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlRegex() <em>Url Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlRegex()
	 * @generated
	 * @ordered
	 */
	protected String urlRegex = URL_REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getUrlmap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedirectHttpResponseCode() {
		return redirectHttpResponseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedirectHttpResponseCode(String newRedirectHttpResponseCode) {
		String oldRedirectHttpResponseCode = redirectHttpResponseCode;
		redirectHttpResponseCode = newRedirectHttpResponseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.URLMAP__REDIRECT_HTTP_RESPONSE_CODE, oldRedirectHttpResponseCode, redirectHttpResponseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityLevel() {
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityLevel(String newSecurityLevel) {
		String oldSecurityLevel = securityLevel;
		securityLevel = newSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.URLMAP__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthFailAction() {
		return authFailAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthFailAction(String newAuthFailAction) {
		String oldAuthFailAction = authFailAction;
		authFailAction = newAuthFailAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.URLMAP__AUTH_FAIL_ACTION, oldAuthFailAction, authFailAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlRegex() {
		return urlRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlRegex(String newUrlRegex) {
		String oldUrlRegex = urlRegex;
		urlRegex = newUrlRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.URLMAP__URL_REGEX, oldUrlRegex, urlRegex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.URLMAP__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.URLMAP__REDIRECT_HTTP_RESPONSE_CODE:
				return getRedirectHttpResponseCode();
			case AppenginePackage.URLMAP__SECURITY_LEVEL:
				return getSecurityLevel();
			case AppenginePackage.URLMAP__AUTH_FAIL_ACTION:
				return getAuthFailAction();
			case AppenginePackage.URLMAP__URL_REGEX:
				return getUrlRegex();
			case AppenginePackage.URLMAP__LOGIN:
				return getLogin();
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
			case AppenginePackage.URLMAP__REDIRECT_HTTP_RESPONSE_CODE:
				setRedirectHttpResponseCode((String)newValue);
				return;
			case AppenginePackage.URLMAP__SECURITY_LEVEL:
				setSecurityLevel((String)newValue);
				return;
			case AppenginePackage.URLMAP__AUTH_FAIL_ACTION:
				setAuthFailAction((String)newValue);
				return;
			case AppenginePackage.URLMAP__URL_REGEX:
				setUrlRegex((String)newValue);
				return;
			case AppenginePackage.URLMAP__LOGIN:
				setLogin((String)newValue);
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
			case AppenginePackage.URLMAP__REDIRECT_HTTP_RESPONSE_CODE:
				setRedirectHttpResponseCode(REDIRECT_HTTP_RESPONSE_CODE_EDEFAULT);
				return;
			case AppenginePackage.URLMAP__SECURITY_LEVEL:
				setSecurityLevel(SECURITY_LEVEL_EDEFAULT);
				return;
			case AppenginePackage.URLMAP__AUTH_FAIL_ACTION:
				setAuthFailAction(AUTH_FAIL_ACTION_EDEFAULT);
				return;
			case AppenginePackage.URLMAP__URL_REGEX:
				setUrlRegex(URL_REGEX_EDEFAULT);
				return;
			case AppenginePackage.URLMAP__LOGIN:
				setLogin(LOGIN_EDEFAULT);
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
			case AppenginePackage.URLMAP__REDIRECT_HTTP_RESPONSE_CODE:
				return REDIRECT_HTTP_RESPONSE_CODE_EDEFAULT == null ? redirectHttpResponseCode != null : !REDIRECT_HTTP_RESPONSE_CODE_EDEFAULT.equals(redirectHttpResponseCode);
			case AppenginePackage.URLMAP__SECURITY_LEVEL:
				return SECURITY_LEVEL_EDEFAULT == null ? securityLevel != null : !SECURITY_LEVEL_EDEFAULT.equals(securityLevel);
			case AppenginePackage.URLMAP__AUTH_FAIL_ACTION:
				return AUTH_FAIL_ACTION_EDEFAULT == null ? authFailAction != null : !AUTH_FAIL_ACTION_EDEFAULT.equals(authFailAction);
			case AppenginePackage.URLMAP__URL_REGEX:
				return URL_REGEX_EDEFAULT == null ? urlRegex != null : !URL_REGEX_EDEFAULT.equals(urlRegex);
			case AppenginePackage.URLMAP__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
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
		result.append(" (redirectHttpResponseCode: ");
		result.append(redirectHttpResponseCode);
		result.append(", securityLevel: ");
		result.append(securityLevel);
		result.append(", authFailAction: ");
		result.append(authFailAction);
		result.append(", urlRegex: ");
		result.append(urlRegex);
		result.append(", login: ");
		result.append(login);
		result.append(')');
		return result.toString();
	}

} //UrlmapImpl
