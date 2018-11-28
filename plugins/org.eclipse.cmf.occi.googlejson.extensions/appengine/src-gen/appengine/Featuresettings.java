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
 * A representation of the model object '<em><b>Featuresettings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The feature specific settings to be used in the application. These define behaviors that are user configurable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Featuresettings#isSplitHealthChecks <em>Split Health Checks</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getFeaturesettings()
 * @model
 * @generated
 */
public interface Featuresettings extends Resource {
	/**
	 * Returns the value of the '<em><b>Split Health Checks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is always true, this setting can be removed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Split Health Checks</em>' attribute.
	 * @see #setSplitHealthChecks(boolean)
	 * @see appengine.AppenginePackage#getFeaturesettings_SplitHealthChecks()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isSplitHealthChecks();

	/**
	 * Sets the value of the '{@link appengine.Featuresettings#isSplitHealthChecks <em>Split Health Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Health Checks</em>' attribute.
	 * @see #isSplitHealthChecks()
	 * @generated
	 */
	void setSplitHealthChecks(boolean value);

} // Featuresettings
