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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Service resource is a logical component of an application that can share state and communicate in a secure fashion with other services. For example, an application that handles customer requests might include separate services to handle tasks such as backend data analysis or API requests from mobile devices. Each service has a collection of versions that define a specific set of code used to implement the functionality of that service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Service#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getService()
 * @model
 * @generated
 */
public interface Service extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getService_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Service!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deletes the specified service and all enclosed versions.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Service!delete(String,String)'"
	 * @generated
	 */
	void delete(String appsId, String servicesId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists all the services in the application.
	 * @param appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * @param pageSize Maximum results to return per page.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true" pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Service!list(String,String,Integer)'"
	 * @generated
	 */
	void list(String appsId, String pageToken, Integer pageSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the current configuration of the specified service.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default.
	 * <!-- end-model-doc -->
	 * @model servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Service!get(String,String)'"
	 * @generated
	 */
	void get(String servicesId, String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the configuration of the specified service.
	 * @param updateMask Standard field mask for the set of fields to be updated.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource to update. Example: apps/myapp/services/default.
	 * @param migrateTraffic Set to true to gradually shift traffic to one or more versions that you specify. By default, traffic is shifted immediately. For gradual traffic migration, the target versions must be located within instances that are configured for both warmup requests (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#inboundservicetype) and automatic scaling (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#automaticscaling). You must specify the shardBy (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services#shardby) field in the Service resource. Gradual traffic migration is not supported in the App Engine flexible environment. For examples, see Migrating and Splitting Traffic (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic).
	 * <!-- end-model-doc -->
	 * @model updateMaskDataType="org.eclipse.cmf.occi.core.String" updateMaskRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" migrateTrafficDataType="org.eclipse.cmf.occi.core.Boolean" migrateTrafficRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Service!patch(String,String,String,Boolean)'"
	 * @generated
	 */
	void patch(String updateMask, String servicesId, String appsId, boolean migrateTraffic);

} // Service
