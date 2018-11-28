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
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Version resource is a specific set of source code and configuration files that are deployed into a service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Version#getEnv <em>Env</em>}</li>
 *   <li>{@link appengine.Version#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link appengine.Version#getDiskUsageBytes <em>Disk Usage Bytes</em>}</li>
 *   <li>{@link appengine.Version#isThreadsafe <em>Threadsafe</em>}</li>
 *   <li>{@link appengine.Version#getName <em>Name</em>}</li>
 *   <li>{@link appengine.Version#isVm <em>Vm</em>}</li>
 *   <li>{@link appengine.Version#getVersionUrl <em>Version Url</em>}</li>
 *   <li>{@link appengine.Version#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link appengine.Version#getServingStatus <em>Serving Status</em>}</li>
 *   <li>{@link appengine.Version#getRuntimeApiVersion <em>Runtime Api Version</em>}</li>
 *   <li>{@link appengine.Version#getCreateTime <em>Create Time</em>}</li>
 *   <li>{@link appengine.Version#getInboundServices <em>Inbound Services</em>}</li>
 *   <li>{@link appengine.Version#getErrorHandlers <em>Error Handlers</em>}</li>
 *   <li>{@link appengine.Version#getDefaultExpiration <em>Default Expiration</em>}</li>
 *   <li>{@link appengine.Version#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link appengine.Version#getNobuildFilesRegex <em>Nobuild Files Regex</em>}</li>
 *   <li>{@link appengine.Version#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link appengine.Version#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link appengine.Version#getEnvVariables <em>Env Variables</em>}</li>
 *   <li>{@link appengine.Version#getBetaSettings <em>Beta Settings</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends Resource {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * App Engine execution environment for this version.Defaults to standard.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env</em>' attribute.
	 * @see #setEnv(String)
	 * @see appengine.AppenginePackage#getVersion_Env()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getEnv();

	/**
	 * Sets the value of the '{@link appengine.Version#getEnv <em>Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' attribute.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(String value);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference.
	 * @see #setHandlers(array)
	 * @see appengine.AppenginePackage#getVersion_Handlers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getHandlers();

	/**
	 * Sets the value of the '{@link appengine.Version#getHandlers <em>Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handlers</em>' containment reference.
	 * @see #getHandlers()
	 * @generated
	 */
	void setHandlers(array value);

	/**
	 * Returns the value of the '<em><b>Disk Usage Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total size in bytes of all the files that are included in this version and curerntly hosted on the App Engine disk.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Usage Bytes</em>' attribute.
	 * @see #setDiskUsageBytes(String)
	 * @see appengine.AppenginePackage#getVersion_DiskUsageBytes()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getDiskUsageBytes();

	/**
	 * Sets the value of the '{@link appengine.Version#getDiskUsageBytes <em>Disk Usage Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Usage Bytes</em>' attribute.
	 * @see #getDiskUsageBytes()
	 * @generated
	 */
	void setDiskUsageBytes(String value);

	/**
	 * Returns the value of the '<em><b>Threadsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether multiple requests can be dispatched to this version at once.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Threadsafe</em>' attribute.
	 * @see #setThreadsafe(boolean)
	 * @see appengine.AppenginePackage#getVersion_Threadsafe()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isThreadsafe();

	/**
	 * Sets the value of the '{@link appengine.Version#isThreadsafe <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threadsafe</em>' attribute.
	 * @see #isThreadsafe()
	 * @generated
	 */
	void setThreadsafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getVersion_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Version#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to deploy this version in a container on a virtual machine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm</em>' attribute.
	 * @see #setVm(boolean)
	 * @see appengine.AppenginePackage#getVersion_Vm()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 * @generated
	 */
	boolean isVm();

	/**
	 * Sets the value of the '{@link appengine.Version#isVm <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' attribute.
	 * @see #isVm()
	 * @generated
	 */
	void setVm(boolean value);

	/**
	 * Returns the value of the '<em><b>Version Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Url</em>' attribute.
	 * @see #setVersionUrl(String)
	 * @see appengine.AppenginePackage#getVersion_VersionUrl()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getVersionUrl();

	/**
	 * Sets the value of the '{@link appengine.Version#getVersionUrl <em>Version Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Url</em>' attribute.
	 * @see #getVersionUrl()
	 * @generated
	 */
	void setVersionUrl(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instance class that is used to run this version. Valid values are:
	 * AutomaticScaling: F1, F2, F4, F4_1G
	 * ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see #setInstanceClass(String)
	 * @see appengine.AppenginePackage#getVersion_InstanceClass()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getInstanceClass();

	/**
	 * Sets the value of the '{@link appengine.Version#getInstanceClass <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class</em>' attribute.
	 * @see #getInstanceClass()
	 * @generated
	 */
	void setInstanceClass(String value);

	/**
	 * Returns the value of the '<em><b>Serving Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serving Status</em>' attribute.
	 * @see #setServingStatus(String)
	 * @see appengine.AppenginePackage#getVersion_ServingStatus()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getServingStatus();

	/**
	 * Sets the value of the '{@link appengine.Version#getServingStatus <em>Serving Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serving Status</em>' attribute.
	 * @see #getServingStatus()
	 * @generated
	 */
	void setServingStatus(String value);

	/**
	 * Returns the value of the '<em><b>Runtime Api Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard/<language>/config/appref
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime Api Version</em>' attribute.
	 * @see #setRuntimeApiVersion(String)
	 * @see appengine.AppenginePackage#getVersion_RuntimeApiVersion()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getRuntimeApiVersion();

	/**
	 * Sets the value of the '{@link appengine.Version#getRuntimeApiVersion <em>Runtime Api Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Api Version</em>' attribute.
	 * @see #getRuntimeApiVersion()
	 * @generated
	 */
	void setRuntimeApiVersion(String value);

	/**
	 * Returns the value of the '<em><b>Create Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that this version was created.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Time</em>' attribute.
	 * @see #setCreateTime(String)
	 * @see appengine.AppenginePackage#getVersion_CreateTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getCreateTime();

	/**
	 * Sets the value of the '{@link appengine.Version#getCreateTime <em>Create Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Time</em>' attribute.
	 * @see #getCreateTime()
	 * @generated
	 */
	void setCreateTime(String value);

	/**
	 * Returns the value of the '<em><b>Inbound Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Before an application can receive email or XMPP messages, the application must be configured to enable the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Services</em>' containment reference.
	 * @see #setInboundServices(array)
	 * @see appengine.AppenginePackage#getVersion_InboundServices()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getInboundServices();

	/**
	 * Sets the value of the '{@link appengine.Version#getInboundServices <em>Inbound Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Services</em>' containment reference.
	 * @see #getInboundServices()
	 * @generated
	 */
	void setInboundServices(array value);

	/**
	 * Returns the value of the '<em><b>Error Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Handlers</em>' containment reference.
	 * @see #setErrorHandlers(array)
	 * @see appengine.AppenginePackage#getVersion_ErrorHandlers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getErrorHandlers();

	/**
	 * Sets the value of the '{@link appengine.Version#getErrorHandlers <em>Error Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Handlers</em>' containment reference.
	 * @see #getErrorHandlers()
	 * @generated
	 */
	void setErrorHandlers(array value);

	/**
	 * Returns the value of the '<em><b>Default Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#staticfileshandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Expiration</em>' attribute.
	 * @see #setDefaultExpiration(String)
	 * @see appengine.AppenginePackage#getVersion_DefaultExpiration()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getDefaultExpiration();

	/**
	 * Sets the value of the '{@link appengine.Version#getDefaultExpiration <em>Default Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Expiration</em>' attribute.
	 * @see #getDefaultExpiration()
	 * @generated
	 */
	void setDefaultExpiration(String value);

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference.
	 * @see #setLibraries(array)
	 * @see appengine.AppenginePackage#getVersion_Libraries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	array getLibraries();

	/**
	 * Sets the value of the '{@link appengine.Version#getLibraries <em>Libraries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libraries</em>' containment reference.
	 * @see #getLibraries()
	 * @generated
	 */
	void setLibraries(array value);

	/**
	 * Returns the value of the '<em><b>Nobuild Files Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nobuild Files Regex</em>' attribute.
	 * @see #setNobuildFilesRegex(String)
	 * @see appengine.AppenginePackage#getVersion_NobuildFilesRegex()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getNobuildFilesRegex();

	/**
	 * Sets the value of the '{@link appengine.Version#getNobuildFilesRegex <em>Nobuild Files Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nobuild Files Regex</em>' attribute.
	 * @see #getNobuildFilesRegex()
	 * @generated
	 */
	void setNobuildFilesRegex(String value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Desired runtime. Example: python27.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(String)
	 * @see appengine.AppenginePackage#getVersion_Runtime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getRuntime();

	/**
	 * Sets the value of the '{@link appengine.Version#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Email address of the user who created this version.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see appengine.AppenginePackage#getVersion_CreatedBy()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link appengine.Version#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Env Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Environment variables available to the application.Only returned in GET requests if view=FULL is set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Env Variables</em>' attribute.
	 * @see #setEnvVariables(Map)
	 * @see appengine.AppenginePackage#getVersion_EnvVariables()
	 * @model dataType="appengine.map" required="true"
	 * @generated
	 */
	Map getEnvVariables();

	/**
	 * Sets the value of the '{@link appengine.Version#getEnvVariables <em>Env Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Variables</em>' attribute.
	 * @see #getEnvVariables()
	 * @generated
	 */
	void setEnvVariables(Map value);

	/**
	 * Returns the value of the '<em><b>Beta Settings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata settings that are supplied to this version to enable beta runtime features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beta Settings</em>' attribute.
	 * @see #setBetaSettings(Map)
	 * @see appengine.AppenginePackage#getVersion_BetaSettings()
	 * @model dataType="appengine.map" required="true"
	 * @generated
	 */
	Map getBetaSettings();

	/**
	 * Sets the value of the '{@link appengine.Version#getBetaSettings <em>Beta Settings</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta Settings</em>' attribute.
	 * @see #getBetaSettings()
	 * @generated
	 */
	void setBetaSettings(Map value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deletes an existing Version resource.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
	 * @param versionsId Part of `name`. See documentation of `appsId`.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true"
	 * @generated
	 */
	void delete(String appsId, String versionsId, String servicesId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists the versions of a service.
	 * @param pageSize Maximum results to return per page.
	 * @param view Controls the set of fields returned in the List response.
	 * @param servicesId Part of `parent`. See documentation of `appsId`.
	 * @param appsId Part of `parent`. Name of the parent Service resource. Example: apps/myapp/services/default.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @model pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true" viewDataType="org.eclipse.cmf.occi.core.String" viewRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true"
	 * @generated
	 */
	void list(Integer pageSize, String view, String servicesId, String appsId, String pageToken);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
	 * @param versionsId Part of `name`. See documentation of `appsId`.
	 * @param view Controls the set of fields returned in the Get response.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
	 * <!-- end-model-doc -->
	 * @model versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true" viewDataType="org.eclipse.cmf.occi.core.String" viewRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 * @generated
	 */
	void get(String versionsId, String view, String servicesId, String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the specified Version resource. You can specify the following fields depending on the App Engine environment and type of scaling that the version resource uses:
	 * serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):  For Version resources that use basic scaling, manual scaling, or run in  the App Engine flexible environment.
	 * instance_class (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):  For Version resources that run in the App Engine standard environment.
	 * automatic_scaling.min_idle_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine standard environment.
	 * automatic_scaling.max_idle_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine standard environment.
	 * automatic_scaling.min_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
	 * automatic_scaling.max_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
	 * automatic_scaling.cool_down_period_sec (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
	 * automatic_scaling.cpu_utilization.target_utilization (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
	 * @param updateMask Standard field mask for the set of fields to be updated.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource to update. Example: apps/myapp/services/default/versions/1.
	 * @param versionsId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model updateMaskDataType="org.eclipse.cmf.occi.core.String" updateMaskRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true"
	 * @generated
	 */
	void patch(String updateMask, String servicesId, String appsId, String versionsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deploys code and resource files to a new version.
	 * @param appsId Part of `parent`. Name of the parent resource to create this version under. Example: apps/myapp/services/default.
	 * @param servicesId Part of `parent`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true"
	 * @generated
	 */
	void create(String appsId, String servicesId);

} // Version
