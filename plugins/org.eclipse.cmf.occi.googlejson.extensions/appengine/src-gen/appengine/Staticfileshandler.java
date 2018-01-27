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

import java.util.Map;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staticfileshandler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Staticfileshandler#isApplicationReadable <em>Application Readable</em>}</li>
 *   <li>{@link appengine.Staticfileshandler#getHttpHeaders <em>Http Headers</em>}</li>
 *   <li>{@link appengine.Staticfileshandler#getUploadPathRegex <em>Upload Path Regex</em>}</li>
 *   <li>{@link appengine.Staticfileshandler#getPath <em>Path</em>}</li>
 *   <li>{@link appengine.Staticfileshandler#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link appengine.Staticfileshandler#isRequireMatchingFile <em>Require Matching File</em>}</li>
 *   <li>{@link appengine.Staticfileshandler#getExpiration <em>Expiration</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getStaticfileshandler()
 * @model
 * @generated
 */
public interface Staticfileshandler extends Resource {
	/**
	 * Returns the value of the '<em><b>Application Readable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Readable</em>' attribute.
	 * @see #setApplicationReadable(boolean)
	 * @see appengine.AppenginePackage#getStaticfileshandler_ApplicationReadable()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!applicationReadable'"
	 * @generated
	 */
	boolean isApplicationReadable();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#isApplicationReadable <em>Application Readable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Readable</em>' attribute.
	 * @see #isApplicationReadable()
	 * @generated
	 */
	void setApplicationReadable(boolean value);

	/**
	 * Returns the value of the '<em><b>Http Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP headers to use for all responses from these URLs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Http Headers</em>' attribute.
	 * @see #setHttpHeaders(Map)
	 * @see appengine.AppenginePackage#getStaticfileshandler_HttpHeaders()
	 * @model dataType="appengine.map" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!httpHeaders'"
	 * @generated
	 */
	Map getHttpHeaders();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#getHttpHeaders <em>Http Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Headers</em>' attribute.
	 * @see #getHttpHeaders()
	 * @generated
	 */
	void setHttpHeaders(Map value);

	/**
	 * Returns the value of the '<em><b>Upload Path Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regular expression that matches the file paths for all files that should be referenced by this handler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upload Path Regex</em>' attribute.
	 * @see #setUploadPathRegex(String)
	 * @see appengine.AppenginePackage#getStaticfileshandler_UploadPathRegex()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!uploadPathRegex'"
	 * @generated
	 */
	String getUploadPathRegex();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#getUploadPathRegex <em>Upload Path Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upload Path Regex</em>' attribute.
	 * @see #getUploadPathRegex()
	 * @generated
	 */
	void setUploadPathRegex(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see appengine.AppenginePackage#getStaticfileshandler_Path()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see appengine.AppenginePackage#getStaticfileshandler_MimeType()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!mimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Require Matching File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this handler should match the request if the file referenced by the handler does not exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Matching File</em>' attribute.
	 * @see #setRequireMatchingFile(boolean)
	 * @see appengine.AppenginePackage#getStaticfileshandler_RequireMatchingFile()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!requireMatchingFile'"
	 * @generated
	 */
	boolean isRequireMatchingFile();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#isRequireMatchingFile <em>Require Matching File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Matching File</em>' attribute.
	 * @see #isRequireMatchingFile()
	 * @generated
	 */
	void setRequireMatchingFile(boolean value);

	/**
	 * Returns the value of the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time a static file served by this handler should be cached by web proxies and browsers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiration</em>' attribute.
	 * @see #setExpiration(String)
	 * @see appengine.AppenginePackage#getStaticfileshandler_Expiration()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Staticfileshandler!expiration'"
	 * @generated
	 */
	String getExpiration();

	/**
	 * Sets the value of the '{@link appengine.Staticfileshandler#getExpiration <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration</em>' attribute.
	 * @see #getExpiration()
	 * @generated
	 */
	void setExpiration(String value);

} // Staticfileshandler
