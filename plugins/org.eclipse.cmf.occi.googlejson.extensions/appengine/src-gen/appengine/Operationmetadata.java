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
 * A representation of the model object '<em><b>Operationmetadata</b></em>'.
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
 *   <li>{@link appengine.Operationmetadata#getUser <em>User</em>}</li>
 *   <li>{@link appengine.Operationmetadata#getTarget <em>Target</em>}</li>
 *   <li>{@link appengine.Operationmetadata#getMethod <em>Method</em>}</li>
 *   <li>{@link appengine.Operationmetadata#getEndTime <em>End Time</em>}</li>
 *   <li>{@link appengine.Operationmetadata#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link appengine.Operationmetadata#getInsertTime <em>Insert Time</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getOperationmetadata()
 * @model
 * @generated
 */
public interface Operationmetadata extends Resource {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User who requested this operation.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see appengine.AppenginePackage#getOperationmetadata_User()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Operationmetadata!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadata#getUser <em>User</em>}' attribute.
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
	 * Name of the resource that this operation is acting on. Example: apps/myapp/modules/default.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see appengine.AppenginePackage#getOperationmetadata_Target()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Operationmetadata!target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadata#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * API method that initiated this operation. Example: google.appengine.v1beta4.Version.CreateVersion.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see appengine.AppenginePackage#getOperationmetadata_Method()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Operationmetadata!method'"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadata#getMethod <em>Method</em>}' attribute.
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
	 * Timestamp that this operation completed.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see appengine.AppenginePackage#getOperationmetadata_EndTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Operationmetadata!endTime'"
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadata#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of this operation. Deprecated, use method field instead. Example: "create_version".@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see #setOperationType(String)
	 * @see appengine.AppenginePackage#getOperationmetadata_OperationType()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Operationmetadata!operationType'"
	 * @generated
	 */
	String getOperationType();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadata#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(String value);

	/**
	 * Returns the value of the '<em><b>Insert Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp that this operation was created.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Insert Time</em>' attribute.
	 * @see #setInsertTime(String)
	 * @see appengine.AppenginePackage#getOperationmetadata_InsertTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Operationmetadata!insertTime'"
	 * @generated
	 */
	String getInsertTime();

	/**
	 * Sets the value of the '{@link appengine.Operationmetadata#getInsertTime <em>Insert Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert Time</em>' attribute.
	 * @see #getInsertTime()
	 * @generated
	 */
	void setInsertTime(String value);

} // Operationmetadata
