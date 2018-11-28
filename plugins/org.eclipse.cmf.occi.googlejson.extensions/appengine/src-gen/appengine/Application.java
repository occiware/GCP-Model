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
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Application resource contains the top-level configuration of an App Engine application. Next tag: 20
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Application#getDispatchRules <em>Dispatch Rules</em>}</li>
 *   <li>{@link appengine.Application#getGcrDomain <em>Gcr Domain</em>}</li>
 *   <li>{@link appengine.Application#getName <em>Name</em>}</li>
 *   <li>{@link appengine.Application#getDefaultCookieExpiration <em>Default Cookie Expiration</em>}</li>
 *   <li>{@link appengine.Application#getLocationId <em>Location Id</em>}</li>
 *   <li>{@link appengine.Application#getServingStatus <em>Serving Status</em>}</li>
 *   <li>{@link appengine.Application#getDefaultHostname <em>Default Hostname</em>}</li>
 *   <li>{@link appengine.Application#getAuthDomain <em>Auth Domain</em>}</li>
 *   <li>{@link appengine.Application#getCodeBucket <em>Code Bucket</em>}</li>
 *   <li>{@link appengine.Application#getDefaultBucket <em>Default Bucket</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends Resource {
	/**
	 * Returns the value of the '<em><b>Dispatch Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dispatch Rules</em>' containment reference.
	 * @see #setDispatchRules(array)
	 * @see appengine.AppenginePackage#getApplication_DispatchRules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getDispatchRules();

	/**
	 * Sets the value of the '{@link appengine.Application#getDispatchRules <em>Dispatch Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch Rules</em>' containment reference.
	 * @see #getDispatchRules()
	 * @generated
	 */
	void setDispatchRules(array value);

	/**
	 * Returns the value of the '<em><b>Gcr Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Google Container Registry domain used for storing managed build docker images for this application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gcr Domain</em>' attribute.
	 * @see #setGcrDomain(String)
	 * @see appengine.AppenginePackage#getApplication_GcrDomain()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getGcrDomain();

	/**
	 * Sets the value of the '{@link appengine.Application#getGcrDomain <em>Gcr Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gcr Domain</em>' attribute.
	 * @see #getGcrDomain()
	 * @generated
	 */
	void setGcrDomain(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getApplication_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Default Cookie Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cookie expiration policy for this application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Cookie Expiration</em>' attribute.
	 * @see #setDefaultCookieExpiration(String)
	 * @see appengine.AppenginePackage#getApplication_DefaultCookieExpiration()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getDefaultCookieExpiration();

	/**
	 * Sets the value of the '{@link appengine.Application#getDefaultCookieExpiration <em>Default Cookie Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Cookie Expiration</em>' attribute.
	 * @see #getDefaultCookieExpiration()
	 * @generated
	 */
	void setDefaultCookieExpiration(String value);

	/**
	 * Returns the value of the '<em><b>Location Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location from which this application will be run. Application instances will run out of data centers in the chosen location, which is also where all of the application's end user content is stored.Defaults to us-central.Options are:us-central - Central USeurope-west - Western Europeus-east1 - Eastern US
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location Id</em>' attribute.
	 * @see #setLocationId(String)
	 * @see appengine.AppenginePackage#getApplication_LocationId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getLocationId();

	/**
	 * Sets the value of the '{@link appengine.Application#getLocationId <em>Location Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Id</em>' attribute.
	 * @see #getLocationId()
	 * @generated
	 */
	void setLocationId(String value);

	/**
	 * Returns the value of the '<em><b>Serving Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serving status of this application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serving Status</em>' attribute.
	 * @see #setServingStatus(String)
	 * @see appengine.AppenginePackage#getApplication_ServingStatus()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getServingStatus();

	/**
	 * Sets the value of the '{@link appengine.Application#getServingStatus <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serving Status</em>' attribute.
	 * @see #getServingStatus()
	 * @generated
	 */
	void setServingStatus(String value);

	/**
	 * Returns the value of the '<em><b>Default Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hostname used to reach this application, as resolved by App Engine.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Hostname</em>' attribute.
	 * @see #setDefaultHostname(String)
	 * @see appengine.AppenginePackage#getApplication_DefaultHostname()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getDefaultHostname();

	/**
	 * Sets the value of the '{@link appengine.Application#getDefaultHostname <em>Default Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Hostname</em>' attribute.
	 * @see #getDefaultHostname()
	 * @generated
	 */
	void setDefaultHostname(String value);

	/**
	 * Returns the value of the '<em><b>Auth Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Domain</em>' attribute.
	 * @see #setAuthDomain(String)
	 * @see appengine.AppenginePackage#getApplication_AuthDomain()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getAuthDomain();

	/**
	 * Sets the value of the '{@link appengine.Application#getAuthDomain <em>Auth Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Domain</em>' attribute.
	 * @see #getAuthDomain()
	 * @generated
	 */
	void setAuthDomain(String value);

	/**
	 * Returns the value of the '<em><b>Code Bucket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud deployment commands.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Bucket</em>' attribute.
	 * @see #setCodeBucket(String)
	 * @see appengine.AppenginePackage#getApplication_CodeBucket()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getCodeBucket();

	/**
	 * Sets the value of the '{@link appengine.Application#getCodeBucket <em>Code Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Bucket</em>' attribute.
	 * @see #getCodeBucket()
	 * @generated
	 */
	void setCodeBucket(String value);

	/**
	 * Returns the value of the '<em><b>Default Bucket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Bucket</em>' attribute.
	 * @see #setDefaultBucket(String)
	 * @see appengine.AppenginePackage#getApplication_DefaultBucket()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getDefaultBucket();

	/**
	 * Sets the value of the '{@link appengine.Application#getDefaultBucket <em>Default Bucket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Bucket</em>' attribute.
	 * @see #getDefaultBucket()
	 * @generated
	 */
	void setDefaultBucket(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account. Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account.
	 * @param appsId Part of `name`. Name of the application to repair. Example: apps/myapp
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 * @generated
	 */
	void repair(String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets information about an application.
	 * @param appsId Part of `name`. Name of the Application resource to get. Example: apps/myapp.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 * @generated
	 */
	void get(String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the specified Application resource. You can update the following fields:
	 * auth_domain - Google authentication domain for controlling user access to the application.
	 * default_cookie_expiration - Cookie expiration policy for the application.
	 * @param updateMask Standard field mask for the set of fields to be updated.
	 * @param appsId Part of `name`. Name of the Application resource to update. Example: apps/myapp.
	 * <!-- end-model-doc -->
	 * @model updateMaskDataType="org.eclipse.cmf.occi.core.String" updateMaskRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 * @generated
	 */
	void patch(String updateMask, String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an App Engine application for a Google Cloud Platform project. Required fields:
	 * id - The ID of the target Cloud Platform project.
	 * location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/python/console/).
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void create();

} // Application
