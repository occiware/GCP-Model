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
import appengine.Errorhandler;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Errorhandler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ErrorhandlerImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link appengine.impl.ErrorhandlerImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link appengine.impl.ErrorhandlerImpl#getStaticFile <em>Static File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorhandlerImpl extends ResourceImpl implements Errorhandler {
	/**
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected String errorCode = ERROR_CODE_EDEFAULT;

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
	 * The default value of the '{@link #getStaticFile() <em>Static File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticFile()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticFile() <em>Static File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticFile()
	 * @generated
	 * @ordered
	 */
	protected String staticFile = STATIC_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorhandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getErrorhandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(String newErrorCode) {
		String oldErrorCode = errorCode;
		errorCode = newErrorCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.ERRORHANDLER__ERROR_CODE, oldErrorCode, errorCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.ERRORHANDLER__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticFile() {
		return staticFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticFile(String newStaticFile) {
		String oldStaticFile = staticFile;
		staticFile = newStaticFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.ERRORHANDLER__STATIC_FILE, oldStaticFile, staticFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.ERRORHANDLER__ERROR_CODE:
				return getErrorCode();
			case AppenginePackage.ERRORHANDLER__MIME_TYPE:
				return getMimeType();
			case AppenginePackage.ERRORHANDLER__STATIC_FILE:
				return getStaticFile();
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
			case AppenginePackage.ERRORHANDLER__ERROR_CODE:
				setErrorCode((String)newValue);
				return;
			case AppenginePackage.ERRORHANDLER__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case AppenginePackage.ERRORHANDLER__STATIC_FILE:
				setStaticFile((String)newValue);
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
			case AppenginePackage.ERRORHANDLER__ERROR_CODE:
				setErrorCode(ERROR_CODE_EDEFAULT);
				return;
			case AppenginePackage.ERRORHANDLER__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case AppenginePackage.ERRORHANDLER__STATIC_FILE:
				setStaticFile(STATIC_FILE_EDEFAULT);
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
			case AppenginePackage.ERRORHANDLER__ERROR_CODE:
				return ERROR_CODE_EDEFAULT == null ? errorCode != null : !ERROR_CODE_EDEFAULT.equals(errorCode);
			case AppenginePackage.ERRORHANDLER__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case AppenginePackage.ERRORHANDLER__STATIC_FILE:
				return STATIC_FILE_EDEFAULT == null ? staticFile != null : !STATIC_FILE_EDEFAULT.equals(staticFile);
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
		result.append(" (errorCode: ");
		result.append(errorCode);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", staticFile: ");
		result.append(staticFile);
		result.append(')');
		return result.toString();
	}

} //ErrorhandlerImpl
