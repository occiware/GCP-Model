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
 * A representation of the model object '<em><b>Zipinfo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The zip file information for a zip deployment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Zipinfo#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link appengine.Zipinfo#getFilesCount <em>Files Count</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getZipinfo()
 * @model
 * @generated
 */
public interface Zipinfo extends Resource {
	/**
	 * Returns the value of the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com/<bucket>/<object>'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Url</em>' attribute.
	 * @see #setSourceUrl(String)
	 * @see appengine.AppenginePackage#getZipinfo_SourceUrl()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Zipinfo!sourceUrl'"
	 * @generated
	 */
	String getSourceUrl();

	/**
	 * Sets the value of the '{@link appengine.Zipinfo#getSourceUrl <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Url</em>' attribute.
	 * @see #getSourceUrl()
	 * @generated
	 */
	void setSourceUrl(String value);

	/**
	 * Returns the value of the '<em><b>Files Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Files Count</em>' attribute.
	 * @see #setFilesCount(Integer)
	 * @see appengine.AppenginePackage#getZipinfo_FilesCount()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Zipinfo!filesCount'"
	 * @generated
	 */
	Integer getFilesCount();

	/**
	 * Sets the value of the '{@link appengine.Zipinfo#getFilesCount <em>Files Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files Count</em>' attribute.
	 * @see #getFilesCount()
	 * @generated
	 */
	void setFilesCount(Integer value);

} // Zipinfo
