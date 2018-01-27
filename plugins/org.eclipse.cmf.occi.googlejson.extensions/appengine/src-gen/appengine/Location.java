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
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A resource that represents Google Cloud Platform location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Location#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link appengine.Location#getLabels <em>Labels</em>}</li>
 *   <li>{@link appengine.Location#getName <em>Name</em>}</li>
 *   <li>{@link appengine.Location#getLocationId <em>Location Id</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getLocation()
 * @model
 * @generated
 */
public interface Location extends Resource {
	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Service-specific metadata. For example the available capacity at the given location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(Map)
	 * @see appengine.AppenginePackage#getLocation_Metadata()
	 * @model dataType="appengine.map" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Location!metadata'"
	 * @generated
	 */
	Map getMetadata();

	/**
	 * Sets the value of the '{@link appengine.Location#getMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(Map value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cross-service attributes for the location. For example
	 * {"cloud.googleapis.com/region": "us-east1"}
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see #setLabels(Map)
	 * @see appengine.AppenginePackage#getLocation_Labels()
	 * @model dataType="appengine.map" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Location!labels'"
	 * @generated
	 */
	Map getLabels();

	/**
	 * Sets the value of the '{@link appengine.Location#getLabels <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(Map value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource name for the location, which may vary between implementations. For example: "projects/example-project/locations/us-east1"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getLocation_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Location!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Location#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The canonical id for this location. For example: "us-east1".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Id</em>' attribute.
	 * @see #setLocationId(String)
	 * @see appengine.AppenginePackage#getLocation_LocationId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Location!locationId'"
	 * @generated
	 */
	String getLocationId();

	/**
	 * Sets the value of the '{@link appengine.Location#getLocationId <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Id</em>' attribute.
	 * @see #getLocationId()
	 * @generated
	 */
	void setLocationId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists information about the supported locations for this service.
	 * @param pageSize The standard list page size.
	 * @param filter The standard list filter.
	 * @param appsId Part of `name`. The resource that owns the locations collection, if applicable.
	 * @param pageToken The standard list page token.
	 * <!-- end-model-doc -->
	 * @model pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true" filterDataType="org.eclipse.cmf.occi.core.String" filterRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Location!list(Integer,String,String,String)'"
	 * @generated
	 */
	void list(Integer pageSize, String filter, String appsId, String pageToken);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get information about a location.
	 * @param locationsId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Resource name for the location.
	 * <!-- end-model-doc -->
	 * @model locationsIdDataType="org.eclipse.cmf.occi.core.String" locationsIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Location!get(String,String)'"
	 * @generated
	 */
	void get(String locationsId, String appsId);

} // Location
