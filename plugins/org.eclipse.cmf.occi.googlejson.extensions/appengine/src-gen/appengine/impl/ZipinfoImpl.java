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
import appengine.Zipinfo;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zipinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ZipinfoImpl#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link appengine.impl.ZipinfoImpl#getFilesCount <em>Files Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipinfoImpl extends ResourceImpl implements Zipinfo {
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
	 * The default value of the '{@link #getFilesCount() <em>Files Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILES_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilesCount() <em>Files Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesCount()
	 * @generated
	 * @ordered
	 */
	protected Integer filesCount = FILES_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZipinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getZipinfo();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.ZIPINFO__SOURCE_URL, oldSourceUrl, sourceUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFilesCount() {
		return filesCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesCount(Integer newFilesCount) {
		Integer oldFilesCount = filesCount;
		filesCount = newFilesCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.ZIPINFO__FILES_COUNT, oldFilesCount, filesCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.ZIPINFO__SOURCE_URL:
				return getSourceUrl();
			case AppenginePackage.ZIPINFO__FILES_COUNT:
				return getFilesCount();
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
			case AppenginePackage.ZIPINFO__SOURCE_URL:
				setSourceUrl((String)newValue);
				return;
			case AppenginePackage.ZIPINFO__FILES_COUNT:
				setFilesCount((Integer)newValue);
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
			case AppenginePackage.ZIPINFO__SOURCE_URL:
				setSourceUrl(SOURCE_URL_EDEFAULT);
				return;
			case AppenginePackage.ZIPINFO__FILES_COUNT:
				setFilesCount(FILES_COUNT_EDEFAULT);
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
			case AppenginePackage.ZIPINFO__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? sourceUrl != null : !SOURCE_URL_EDEFAULT.equals(sourceUrl);
			case AppenginePackage.ZIPINFO__FILES_COUNT:
				return FILES_COUNT_EDEFAULT == null ? filesCount != null : !FILES_COUNT_EDEFAULT.equals(filesCount);
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
		result.append(", filesCount: ");
		result.append(filesCount);
		result.append(')');
		return result.toString();
	}

} //ZipinfoImpl
