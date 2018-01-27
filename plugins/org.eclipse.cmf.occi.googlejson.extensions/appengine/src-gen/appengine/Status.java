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
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Status type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by gRPC (https://github.com/grpc). The error model is designed to be:
 * Simple to use and understand for most users
 * Flexible enough to meet unexpected needsOverviewThe Status message contains three pieces of data: error code, error message, and error details. The error code should be an enum value of google.rpc.Code, but it may accept additional error codes if needed. The error message should be a developer-facing English message that helps developers understand and resolve the error. If a localized user-facing error message is needed, put the localized message in the error details or localize it in the client. The optional error details may contain arbitrary information about the error. There is a predefined set of error detail types in the package google.rpc that can be used for common error conditions.Language mappingThe Status message is the logical representation of the error model, but it is not necessarily the actual wire format. When the Status message is exposed in different client libraries and different wire protocols, it can be mapped differently. For example, it will likely be mapped to some exceptions in Java, but more likely mapped to some error codes in C.Other usesThe error model and the Status message can be used in a variety of environments, either with or without APIs, to provide a consistent developer experience across different environments.Example uses of this error model include:
 * Partial errors. If a service needs to return partial errors to the client, it may embed the Status in the normal response to indicate the partial errors.
 * Workflow errors. A typical workflow has multiple steps. Each step may have a Status message for error reporting.
 * Batch operations. If a client uses batch request and batch response, the Status message should be used directly inside batch response, one for each error sub-response.
 * Asynchronous operations. If an API call embeds asynchronous operation results in its response, the status of those operations should be represented directly using the Status message.
 * Logging. If some API errors are stored in logs, the message Status could be used directly after any stripping needed for security/privacy reasons.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Status#getDetails <em>Details</em>}</li>
 *   <li>{@link appengine.Status#getCode <em>Code</em>}</li>
 *   <li>{@link appengine.Status#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends Resource {
	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of messages that carry the error details. There is a common set of message types for APIs to use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(array)
	 * @see appengine.AppenginePackage#getStatus_Details()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Status!details'"
	 * @generated
	 */
	array getDetails();

	/**
	 * Sets the value of the '{@link appengine.Status#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(array value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status code, which should be an enum value of google.rpc.Code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(Integer)
	 * @see appengine.AppenginePackage#getStatus_Code()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Status!code'"
	 * @generated
	 */
	Integer getCode();

	/**
	 * Sets the value of the '{@link appengine.Status#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see appengine.AppenginePackage#getStatus_Message()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Status!message'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link appengine.Status#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // Status
