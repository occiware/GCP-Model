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
 * A representation of the model object '<em><b>Locationmetadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Metadata for the given google.cloud.location.Location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Locationmetadata#isFlexibleEnvironmentAvailable <em>Flexible Environment Available</em>}</li>
 *   <li>{@link appengine.Locationmetadata#isStandardEnvironmentAvailable <em>Standard Environment Available</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getLocationmetadata()
 * @model
 * @generated
 */
public interface Locationmetadata extends Resource {
	/**
	 * Returns the value of the '<em><b>Flexible Environment Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * App Engine Flexible Environment is available in the given location.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flexible Environment Available</em>' attribute.
	 * @see #setFlexibleEnvironmentAvailable(boolean)
	 * @see appengine.AppenginePackage#getLocationmetadata_FlexibleEnvironmentAvailable()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isFlexibleEnvironmentAvailable();

	/**
	 * Sets the value of the '{@link appengine.Locationmetadata#isFlexibleEnvironmentAvailable <em>Flexible Environment Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flexible Environment Available</em>' attribute.
	 * @see #isFlexibleEnvironmentAvailable()
	 * @generated
	 */
	void setFlexibleEnvironmentAvailable(boolean value);

	/**
	 * Returns the value of the '<em><b>Standard Environment Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * App Engine Standard Environment is available in the given location.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Environment Available</em>' attribute.
	 * @see #setStandardEnvironmentAvailable(boolean)
	 * @see appengine.AppenginePackage#getLocationmetadata_StandardEnvironmentAvailable()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isStandardEnvironmentAvailable();

	/**
	 * Sets the value of the '{@link appengine.Locationmetadata#isStandardEnvironmentAvailable <em>Standard Environment Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Environment Available</em>' attribute.
	 * @see #isStandardEnvironmentAvailable()
	 * @generated
	 */
	void setStandardEnvironmentAvailable(boolean value);

} // Locationmetadata
