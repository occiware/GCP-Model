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

import appengine.Apiconfighandler;
import appengine.AppenginePackage;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apiconfighandler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ApiconfighandlerImpl#getSecurityLevel <em>Security Level</em>}</li>
 *   <li>{@link appengine.impl.ApiconfighandlerImpl#getAuthFailAction <em>Auth Fail Action</em>}</li>
 *   <li>{@link appengine.impl.ApiconfighandlerImpl#getScript <em>Script</em>}</li>
 *   <li>{@link appengine.impl.ApiconfighandlerImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link appengine.impl.ApiconfighandlerImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiconfighandlerImpl extends ResourceImpl implements Apiconfighandler {
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
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected String script = SCRIPT_EDEFAULT;

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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiconfighandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getApiconfighandler();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APICONFIGHANDLER__SECURITY_LEVEL, oldSecurityLevel, securityLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APICONFIGHANDLER__AUTH_FAIL_ACTION, oldAuthFailAction, authFailAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		String oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APICONFIGHANDLER__SCRIPT, oldScript, script));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APICONFIGHANDLER__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.APICONFIGHANDLER__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.APICONFIGHANDLER__SECURITY_LEVEL:
				return getSecurityLevel();
			case AppenginePackage.APICONFIGHANDLER__AUTH_FAIL_ACTION:
				return getAuthFailAction();
			case AppenginePackage.APICONFIGHANDLER__SCRIPT:
				return getScript();
			case AppenginePackage.APICONFIGHANDLER__LOGIN:
				return getLogin();
			case AppenginePackage.APICONFIGHANDLER__URL:
				return getUrl();
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
			case AppenginePackage.APICONFIGHANDLER__SECURITY_LEVEL:
				setSecurityLevel((String)newValue);
				return;
			case AppenginePackage.APICONFIGHANDLER__AUTH_FAIL_ACTION:
				setAuthFailAction((String)newValue);
				return;
			case AppenginePackage.APICONFIGHANDLER__SCRIPT:
				setScript((String)newValue);
				return;
			case AppenginePackage.APICONFIGHANDLER__LOGIN:
				setLogin((String)newValue);
				return;
			case AppenginePackage.APICONFIGHANDLER__URL:
				setUrl((String)newValue);
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
			case AppenginePackage.APICONFIGHANDLER__SECURITY_LEVEL:
				setSecurityLevel(SECURITY_LEVEL_EDEFAULT);
				return;
			case AppenginePackage.APICONFIGHANDLER__AUTH_FAIL_ACTION:
				setAuthFailAction(AUTH_FAIL_ACTION_EDEFAULT);
				return;
			case AppenginePackage.APICONFIGHANDLER__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
				return;
			case AppenginePackage.APICONFIGHANDLER__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case AppenginePackage.APICONFIGHANDLER__URL:
				setUrl(URL_EDEFAULT);
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
			case AppenginePackage.APICONFIGHANDLER__SECURITY_LEVEL:
				return SECURITY_LEVEL_EDEFAULT == null ? securityLevel != null : !SECURITY_LEVEL_EDEFAULT.equals(securityLevel);
			case AppenginePackage.APICONFIGHANDLER__AUTH_FAIL_ACTION:
				return AUTH_FAIL_ACTION_EDEFAULT == null ? authFailAction != null : !AUTH_FAIL_ACTION_EDEFAULT.equals(authFailAction);
			case AppenginePackage.APICONFIGHANDLER__SCRIPT:
				return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
			case AppenginePackage.APICONFIGHANDLER__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case AppenginePackage.APICONFIGHANDLER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (securityLevel: ");
		result.append(securityLevel);
		result.append(", authFailAction: ");
		result.append(authFailAction);
		result.append(", script: ");
		result.append(script);
		result.append(", login: ");
		result.append(login);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //ApiconfighandlerImpl
