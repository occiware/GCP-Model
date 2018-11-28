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
 * A representation of the model object '<em><b>Debuginstancerequest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Request message for Instances.DebugInstance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Debuginstancerequest#getSshKey <em>Ssh Key</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getDebuginstancerequest()
 * @model
 * @generated
 */
public interface Debuginstancerequest extends Resource {
	/**
	 * Returns the value of the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Public SSH key to add to the instance. Examples:
	 * [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]
	 * [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and Removing SSH Keys (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ssh Key</em>' attribute.
	 * @see #setSshKey(String)
	 * @see appengine.AppenginePackage#getDebuginstancerequest_SshKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getSshKey();

	/**
	 * Sets the value of the '{@link appengine.Debuginstancerequest#getSshKey <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Key</em>' attribute.
	 * @see #getSshKey()
	 * @generated
	 */
	void setSshKey(String value);

} // Debuginstancerequest
