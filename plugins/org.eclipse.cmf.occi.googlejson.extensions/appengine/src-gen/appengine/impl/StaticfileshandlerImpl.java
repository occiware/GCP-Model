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
import appengine.Staticfileshandler;

import java.util.Map;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staticfileshandler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#isApplicationReadable <em>Application Readable</em>}</li>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#getHttpHeaders <em>Http Headers</em>}</li>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#getUploadPathRegex <em>Upload Path Regex</em>}</li>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#isRequireMatchingFile <em>Require Matching File</em>}</li>
 *   <li>{@link appengine.impl.StaticfileshandlerImpl#getExpiration <em>Expiration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticfileshandlerImpl extends ResourceImpl implements Staticfileshandler {
	/**
	 * The default value of the '{@link #isApplicationReadable() <em>Application Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicationReadable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICATION_READABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicationReadable() <em>Application Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicationReadable()
	 * @generated
	 * @ordered
	 */
	protected boolean applicationReadable = APPLICATION_READABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpHeaders() <em>Http Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final Map HTTP_HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpHeaders() <em>Http Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHeaders()
	 * @generated
	 * @ordered
	 */
	protected Map httpHeaders = HTTP_HEADERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUploadPathRegex() <em>Upload Path Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadPathRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOAD_PATH_REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUploadPathRegex() <em>Upload Path Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadPathRegex()
	 * @generated
	 * @ordered
	 */
	protected String uploadPathRegex = UPLOAD_PATH_REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequireMatchingFile() <em>Require Matching File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireMatchingFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRE_MATCHING_FILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequireMatchingFile() <em>Require Matching File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequireMatchingFile()
	 * @generated
	 * @ordered
	 */
	protected boolean requireMatchingFile = REQUIRE_MATCHING_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected String expiration = EXPIRATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticfileshandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getStaticfileshandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicationReadable() {
		return applicationReadable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationReadable(boolean newApplicationReadable) {
		boolean oldApplicationReadable = applicationReadable;
		applicationReadable = newApplicationReadable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__APPLICATION_READABLE, oldApplicationReadable, applicationReadable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getHttpHeaders() {
		return httpHeaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpHeaders(Map newHttpHeaders) {
		Map oldHttpHeaders = httpHeaders;
		httpHeaders = newHttpHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__HTTP_HEADERS, oldHttpHeaders, httpHeaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUploadPathRegex() {
		return uploadPathRegex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploadPathRegex(String newUploadPathRegex) {
		String oldUploadPathRegex = uploadPathRegex;
		uploadPathRegex = newUploadPathRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__UPLOAD_PATH_REGEX, oldUploadPathRegex, uploadPathRegex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequireMatchingFile() {
		return requireMatchingFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireMatchingFile(boolean newRequireMatchingFile) {
		boolean oldRequireMatchingFile = requireMatchingFile;
		requireMatchingFile = newRequireMatchingFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__REQUIRE_MATCHING_FILE, oldRequireMatchingFile, requireMatchingFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpiration() {
		return expiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiration(String newExpiration) {
		String oldExpiration = expiration;
		expiration = newExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.STATICFILESHANDLER__EXPIRATION, oldExpiration, expiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.STATICFILESHANDLER__APPLICATION_READABLE:
				return isApplicationReadable();
			case AppenginePackage.STATICFILESHANDLER__HTTP_HEADERS:
				return getHttpHeaders();
			case AppenginePackage.STATICFILESHANDLER__UPLOAD_PATH_REGEX:
				return getUploadPathRegex();
			case AppenginePackage.STATICFILESHANDLER__PATH:
				return getPath();
			case AppenginePackage.STATICFILESHANDLER__MIME_TYPE:
				return getMimeType();
			case AppenginePackage.STATICFILESHANDLER__REQUIRE_MATCHING_FILE:
				return isRequireMatchingFile();
			case AppenginePackage.STATICFILESHANDLER__EXPIRATION:
				return getExpiration();
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
			case AppenginePackage.STATICFILESHANDLER__APPLICATION_READABLE:
				setApplicationReadable((Boolean)newValue);
				return;
			case AppenginePackage.STATICFILESHANDLER__HTTP_HEADERS:
				setHttpHeaders((Map)newValue);
				return;
			case AppenginePackage.STATICFILESHANDLER__UPLOAD_PATH_REGEX:
				setUploadPathRegex((String)newValue);
				return;
			case AppenginePackage.STATICFILESHANDLER__PATH:
				setPath((String)newValue);
				return;
			case AppenginePackage.STATICFILESHANDLER__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case AppenginePackage.STATICFILESHANDLER__REQUIRE_MATCHING_FILE:
				setRequireMatchingFile((Boolean)newValue);
				return;
			case AppenginePackage.STATICFILESHANDLER__EXPIRATION:
				setExpiration((String)newValue);
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
			case AppenginePackage.STATICFILESHANDLER__APPLICATION_READABLE:
				setApplicationReadable(APPLICATION_READABLE_EDEFAULT);
				return;
			case AppenginePackage.STATICFILESHANDLER__HTTP_HEADERS:
				setHttpHeaders(HTTP_HEADERS_EDEFAULT);
				return;
			case AppenginePackage.STATICFILESHANDLER__UPLOAD_PATH_REGEX:
				setUploadPathRegex(UPLOAD_PATH_REGEX_EDEFAULT);
				return;
			case AppenginePackage.STATICFILESHANDLER__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AppenginePackage.STATICFILESHANDLER__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case AppenginePackage.STATICFILESHANDLER__REQUIRE_MATCHING_FILE:
				setRequireMatchingFile(REQUIRE_MATCHING_FILE_EDEFAULT);
				return;
			case AppenginePackage.STATICFILESHANDLER__EXPIRATION:
				setExpiration(EXPIRATION_EDEFAULT);
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
			case AppenginePackage.STATICFILESHANDLER__APPLICATION_READABLE:
				return applicationReadable != APPLICATION_READABLE_EDEFAULT;
			case AppenginePackage.STATICFILESHANDLER__HTTP_HEADERS:
				return HTTP_HEADERS_EDEFAULT == null ? httpHeaders != null : !HTTP_HEADERS_EDEFAULT.equals(httpHeaders);
			case AppenginePackage.STATICFILESHANDLER__UPLOAD_PATH_REGEX:
				return UPLOAD_PATH_REGEX_EDEFAULT == null ? uploadPathRegex != null : !UPLOAD_PATH_REGEX_EDEFAULT.equals(uploadPathRegex);
			case AppenginePackage.STATICFILESHANDLER__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AppenginePackage.STATICFILESHANDLER__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case AppenginePackage.STATICFILESHANDLER__REQUIRE_MATCHING_FILE:
				return requireMatchingFile != REQUIRE_MATCHING_FILE_EDEFAULT;
			case AppenginePackage.STATICFILESHANDLER__EXPIRATION:
				return EXPIRATION_EDEFAULT == null ? expiration != null : !EXPIRATION_EDEFAULT.equals(expiration);
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
		result.append(" (applicationReadable: ");
		result.append(applicationReadable);
		result.append(", httpHeaders: ");
		result.append(httpHeaders);
		result.append(", uploadPathRegex: ");
		result.append(uploadPathRegex);
		result.append(", path: ");
		result.append(path);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", requireMatchingFile: ");
		result.append(requireMatchingFile);
		result.append(", expiration: ");
		result.append(expiration);
		result.append(')');
		return result.toString();
	}

} //StaticfileshandlerImpl
