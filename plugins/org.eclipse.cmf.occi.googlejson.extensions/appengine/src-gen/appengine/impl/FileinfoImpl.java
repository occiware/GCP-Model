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
import appengine.Fileinfo;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fileinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.FileinfoImpl#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link appengine.impl.FileinfoImpl#getSha1Sum <em>Sha1 Sum</em>}</li>
 *   <li>{@link appengine.impl.FileinfoImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileinfoImpl extends ResourceImpl implements Fileinfo {
	/**
	 * The default value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected String sourceUrl = SOURCE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSha1Sum() <em>Sha1 Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha1Sum()
	 * @generated
	 * @ordered
	 */
	protected static final String SHA1_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSha1Sum() <em>Sha1 Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha1Sum()
	 * @generated
	 * @ordered
	 */
	protected String sha1Sum = SHA1_SUM_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getFileinfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUrl(String newSourceUrl) {
		String oldSourceUrl = sourceUrl;
		sourceUrl = newSourceUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FILEINFO__SOURCE_URL, oldSourceUrl, sourceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSha1Sum() {
		return sha1Sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSha1Sum(String newSha1Sum) {
		String oldSha1Sum = sha1Sum;
		sha1Sum = newSha1Sum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FILEINFO__SHA1_SUM, oldSha1Sum, sha1Sum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FILEINFO__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.FILEINFO__SOURCE_URL:
				return getSourceUrl();
			case AppenginePackage.FILEINFO__SHA1_SUM:
				return getSha1Sum();
			case AppenginePackage.FILEINFO__MIME_TYPE:
				return getMimeType();
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
			case AppenginePackage.FILEINFO__SOURCE_URL:
				setSourceUrl((String)newValue);
				return;
			case AppenginePackage.FILEINFO__SHA1_SUM:
				setSha1Sum((String)newValue);
				return;
			case AppenginePackage.FILEINFO__MIME_TYPE:
				setMimeType((String)newValue);
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
			case AppenginePackage.FILEINFO__SOURCE_URL:
				setSourceUrl(SOURCE_URL_EDEFAULT);
				return;
			case AppenginePackage.FILEINFO__SHA1_SUM:
				setSha1Sum(SHA1_SUM_EDEFAULT);
				return;
			case AppenginePackage.FILEINFO__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
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
			case AppenginePackage.FILEINFO__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? sourceUrl != null : !SOURCE_URL_EDEFAULT.equals(sourceUrl);
			case AppenginePackage.FILEINFO__SHA1_SUM:
				return SHA1_SUM_EDEFAULT == null ? sha1Sum != null : !SHA1_SUM_EDEFAULT.equals(sha1Sum);
			case AppenginePackage.FILEINFO__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
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
		result.append(" (sourceUrl: ");
		result.append(sourceUrl);
		result.append(", sha1Sum: ");
		result.append(sha1Sum);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(')');
		return result.toString();
	}

} //FileinfoImpl
