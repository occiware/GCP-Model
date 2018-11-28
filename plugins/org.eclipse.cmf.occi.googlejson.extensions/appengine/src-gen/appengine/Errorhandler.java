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
 * A representation of the model object '<em><b>Errorhandler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Custom static error page to be served when an error occurs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Errorhandler#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link appengine.Errorhandler#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link appengine.Errorhandler#getStaticFile <em>Static File</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getErrorhandler()
 * @model
 * @generated
 */
public interface Errorhandler extends Resource {
	/**
	 * Returns the value of the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error condition this handler applies to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Code</em>' attribute.
	 * @see #setErrorCode(String)
	 * @see appengine.AppenginePackage#getErrorhandler_ErrorCode()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getErrorCode();

	/**
	 * Sets the value of the '{@link appengine.Errorhandler#getErrorCode <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Code</em>' attribute.
	 * @see #getErrorCode()
	 * @generated
	 */
	void setErrorCode(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIME type of file. Defaults to text/html.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see appengine.AppenginePackage#getErrorhandler_MimeType()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link appengine.Errorhandler#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Static File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static file content to be served for this error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static File</em>' attribute.
	 * @see #setStaticFile(String)
	 * @see appengine.AppenginePackage#getErrorhandler_StaticFile()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getStaticFile();

	/**
	 * Sets the value of the '{@link appengine.Errorhandler#getStaticFile <em>Static File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static File</em>' attribute.
	 * @see #getStaticFile()
	 * @generated
	 */
	void setStaticFile(String value);

} // Errorhandler
