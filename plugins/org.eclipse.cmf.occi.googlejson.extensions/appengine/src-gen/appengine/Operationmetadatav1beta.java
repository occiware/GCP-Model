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
 * A representation of the model object '<em><b>Operationmetadatav1beta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Metadata for the given google.longrunning.Operation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Operationmetadatav1beta#getUser <em>User</em>}</li>
 *   <li>{@link appengine.Operationmetadatav1beta#getTarget <em>Target</em>}</li>
 *   <li>{@link appengine.Operationmetadatav1beta#getEphemeralMessage <em>Ephemeral Message</em>}</li>
 *   <li>{@link appengine.Operationmetadatav1beta#getMethod <em>Method</em>}</li>
 *   <li>{@link appengine.Operationmetadatav1beta#getEndTime <em>End Time</em>}</li>
 *   <li>{@link appengine.Operationmetadatav1beta#getWarning <em>Warning</em>}</li>
 *   <li>{@link appengine.Operationmetadatav1beta#getInsertTime <em>Insert Time</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getOperationmetadatav1beta()
 * @model
 * @generated
 */
public interface Operationmetadatav1beta extends Resource {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User who requested this operation.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_User()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_Target()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Ephemeral Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ephemeral message that may change every time the operation is polled. @OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ephemeral Message</em>' attribute.
	 * @see #setEphemeralMessage(String)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_EphemeralMessage()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getEphemeralMessage();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getEphemeralMessage <em>Ephemeral Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ephemeral Message</em>' attribute.
	 * @see #getEphemeralMessage()
	 * @generated
	 */
	void setEphemeralMessage(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * API method that initiated this operation. Example: google.appengine.v1beta.Versions.CreateVersion.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_Method()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that this operation completed.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_EndTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Warning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durable messages that persist on every operation poll. @OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Warning</em>' containment reference.
	 * @see #setWarning(array)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_Warning()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getWarning();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getWarning <em>Warning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning</em>' containment reference.
	 * @see #getWarning()
	 * @generated
	 */
	void setWarning(array value);

	/**
	 * Returns the value of the '<em><b>Insert Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that this operation was created.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert Time</em>' attribute.
	 * @see #setInsertTime(String)
	 * @see appengine.AppenginePackage#getOperationmetadatav1beta_InsertTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getInsertTime();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadatav1beta#getInsertTime <em>Insert Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Time</em>' attribute.
	 * @see #getInsertTime()
	 * @generated
	 */
	void setInsertTime(String value);

} // Operationmetadatav1beta
