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
package appengine;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fileinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Single source file that is part of the version to be deployed. Each source file that is deployed must be specified separately.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Fileinfo#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link appengine.Fileinfo#getSha1Sum <em>Sha1 Sum</em>}</li>
 *   <li>{@link appengine.Fileinfo#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getFileinfo()
 * @model
 * @generated
 */
public interface Fileinfo extends Resource {
	/**
	 * Returns the value of the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL source to use to fetch this file. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com/<bucket>/<object>'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Url</em>' attribute.
	 * @see #setSourceUrl(String)
	 * @see appengine.AppenginePackage#getFileinfo_SourceUrl()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Fileinfo!sourceUrl'"
	 * @generated
	 */
	String getSourceUrl();

	/**
	 * Sets the value of the '{@link appengine.Fileinfo#getSourceUrl <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Url</em>' attribute.
	 * @see #getSourceUrl()
	 * @generated
	 */
	void setSourceUrl(String value);

	/**
	 * Returns the value of the '<em><b>Sha1 Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SHA1 hash of the file, in hex.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sha1 Sum</em>' attribute.
	 * @see #setSha1Sum(String)
	 * @see appengine.AppenginePackage#getFileinfo_Sha1Sum()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Fileinfo!sha1Sum'"
	 * @generated
	 */
	String getSha1Sum();

	/**
	 * Sets the value of the '{@link appengine.Fileinfo#getSha1Sum <em>Sha1 Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sha1 Sum</em>' attribute.
	 * @see #getSha1Sum()
	 * @generated
	 */
	void setSha1Sum(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The MIME type of the file.Defaults to the value from Google Cloud Storage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see appengine.AppenginePackage#getFileinfo_MimeType()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Fileinfo!mimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link appengine.Fileinfo#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // Fileinfo
