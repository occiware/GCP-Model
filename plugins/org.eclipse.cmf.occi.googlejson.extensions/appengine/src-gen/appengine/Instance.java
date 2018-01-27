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
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Instance resource is the computing unit that App Engine uses to automatically scale an application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Instance#getAverageLatency <em>Average Latency</em>}</li>
 *   <li>{@link appengine.Instance#getMemoryUsage <em>Memory Usage</em>}</li>
 *   <li>{@link appengine.Instance#getVmIp <em>Vm Ip</em>}</li>
 *   <li>{@link appengine.Instance#getAvailability <em>Availability</em>}</li>
 *   <li>{@link appengine.Instance#getVmStatus <em>Vm Status</em>}</li>
 *   <li>{@link appengine.Instance#getErrors <em>Errors</em>}</li>
 *   <li>{@link appengine.Instance#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link appengine.Instance#isVmDebugEnabled <em>Vm Debug Enabled</em>}</li>
 *   <li>{@link appengine.Instance#getRequests <em>Requests</em>}</li>
 *   <li>{@link appengine.Instance#getAppEngineRelease <em>App Engine Release</em>}</li>
 *   <li>{@link appengine.Instance#getVmName <em>Vm Name</em>}</li>
 *   <li>{@link appengine.Instance#getQps <em>Qps</em>}</li>
 *   <li>{@link appengine.Instance#getVmId <em>Vm Id</em>}</li>
 *   <li>{@link appengine.Instance#getVmZoneName <em>Vm Zone Name</em>}</li>
 *   <li>{@link appengine.Instance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Resource {
	/**
	 * Returns the value of the '<em><b>Average Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Average latency (ms) over the last minute.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Average Latency</em>' attribute.
	 * @see #setAverageLatency(Integer)
	 * @see appengine.AppenginePackage#getInstance_AverageLatency()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!averageLatency'"
	 * @generated
	 */
	Integer getAverageLatency();

	/**
	 * Sets the value of the '{@link appengine.Instance#getAverageLatency <em>Average Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Latency</em>' attribute.
	 * @see #getAverageLatency()
	 * @generated
	 */
	void setAverageLatency(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total memory in use (bytes).@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Usage</em>' attribute.
	 * @see #setMemoryUsage(String)
	 * @see appengine.AppenginePackage#getInstance_MemoryUsage()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!memoryUsage'"
	 * @generated
	 */
	String getMemoryUsage();

	/**
	 * Sets the value of the '{@link appengine.Instance#getMemoryUsage <em>Memory Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Usage</em>' attribute.
	 * @see #getMemoryUsage()
	 * @generated
	 */
	void setMemoryUsage(String value);

	/**
	 * Returns the value of the '<em><b>Vm Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Ip</em>' attribute.
	 * @see #setVmIp(String)
	 * @see appengine.AppenginePackage#getInstance_VmIp()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!vmIp'"
	 * @generated
	 */
	String getVmIp();

	/**
	 * Sets the value of the '{@link appengine.Instance#getVmIp <em>Vm Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Ip</em>' attribute.
	 * @see #getVmIp()
	 * @generated
	 */
	void setVmIp(String value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability of the instance.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(String)
	 * @see appengine.AppenginePackage#getInstance_Availability()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!availability'"
	 * @generated
	 */
	String getAvailability();

	/**
	 * Sets the value of the '{@link appengine.Instance#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(String value);

	/**
	 * Returns the value of the '<em><b>Vm Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Status</em>' attribute.
	 * @see #setVmStatus(String)
	 * @see appengine.AppenginePackage#getInstance_VmStatus()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!vmStatus'"
	 * @generated
	 */
	String getVmStatus();

	/**
	 * Sets the value of the '{@link appengine.Instance#getVmStatus <em>Vm Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Status</em>' attribute.
	 * @see #getVmStatus()
	 * @generated
	 */
	void setVmStatus(String value);

	/**
	 * Returns the value of the '<em><b>Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of errors since this instance was started.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Errors</em>' attribute.
	 * @see #setErrors(Integer)
	 * @see appengine.AppenginePackage#getInstance_Errors()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!errors'"
	 * @generated
	 */
	Integer getErrors();

	/**
	 * Sets the value of the '{@link appengine.Instance#getErrors <em>Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Errors</em>' attribute.
	 * @see #getErrors()
	 * @generated
	 */
	void setErrors(Integer value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time that this instance was started.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see appengine.AppenginePackage#getInstance_StartTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!startTime'"
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link appengine.Instance#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Vm Debug Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Debug Enabled</em>' attribute.
	 * @see #setVmDebugEnabled(boolean)
	 * @see appengine.AppenginePackage#getInstance_VmDebugEnabled()
	 * @model dataType="org.eclipse.cmf.occi.core.Boolean" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!vmDebugEnabled'"
	 * @generated
	 */
	boolean isVmDebugEnabled();

	/**
	 * Sets the value of the '{@link appengine.Instance#isVmDebugEnabled <em>Vm Debug Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Debug Enabled</em>' attribute.
	 * @see #isVmDebugEnabled()
	 * @generated
	 */
	void setVmDebugEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of requests since this instance was started.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requests</em>' attribute.
	 * @see #setRequests(Integer)
	 * @see appengine.AppenginePackage#getInstance_Requests()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!requests'"
	 * @generated
	 */
	Integer getRequests();

	/**
	 * Sets the value of the '{@link appengine.Instance#getRequests <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requests</em>' attribute.
	 * @see #getRequests()
	 * @generated
	 */
	void setRequests(Integer value);

	/**
	 * Returns the value of the '<em><b>App Engine Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * App Engine release this instance is running on.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>App Engine Release</em>' attribute.
	 * @see #setAppEngineRelease(String)
	 * @see appengine.AppenginePackage#getInstance_AppEngineRelease()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!appEngineRelease'"
	 * @generated
	 */
	String getAppEngineRelease();

	/**
	 * Sets the value of the '{@link appengine.Instance#getAppEngineRelease <em>App Engine Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App Engine Release</em>' attribute.
	 * @see #getAppEngineRelease()
	 * @generated
	 */
	void setAppEngineRelease(String value);

	/**
	 * Returns the value of the '<em><b>Vm Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Name</em>' attribute.
	 * @see #setVmName(String)
	 * @see appengine.AppenginePackage#getInstance_VmName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!vmName'"
	 * @generated
	 */
	String getVmName();

	/**
	 * Sets the value of the '{@link appengine.Instance#getVmName <em>Vm Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Name</em>' attribute.
	 * @see #getVmName()
	 * @generated
	 */
	void setVmName(String value);

	/**
	 * Returns the value of the '<em><b>Qps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Average queries per second (QPS) over the last minute.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qps</em>' attribute.
	 * @see #setQps(Integer)
	 * @see appengine.AppenginePackage#getInstance_Qps()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!qps'"
	 * @generated
	 */
	Integer getQps();

	/**
	 * Sets the value of the '{@link appengine.Instance#getQps <em>Qps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qps</em>' attribute.
	 * @see #getQps()
	 * @generated
	 */
	void setQps(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Id</em>' attribute.
	 * @see #setVmId(String)
	 * @see appengine.AppenginePackage#getInstance_VmId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!vmId'"
	 * @generated
	 */
	String getVmId();

	/**
	 * Sets the value of the '{@link appengine.Instance#getVmId <em>Vm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Id</em>' attribute.
	 * @see #getVmId()
	 * @generated
	 */
	void setVmId(String value);

	/**
	 * Returns the value of the '<em><b>Vm Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Zone Name</em>' attribute.
	 * @see #setVmZoneName(String)
	 * @see appengine.AppenginePackage#getInstance_VmZoneName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!vmZoneName'"
	 * @generated
	 */
	String getVmZoneName();

	/**
	 * Sets the value of the '{@link appengine.Instance#getVmZoneName <em>Vm Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Zone Name</em>' attribute.
	 * @see #getVmZoneName()
	 * @generated
	 */
	void setVmZoneName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getInstance_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Instance#getName <em>Name</em>}' attribute.
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
	 * Lists the instances of a version.Tip: To aggregate details about instances over time, see the Stackdriver Monitoring API (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list).
	 * @param servicesId Part of `parent`. See documentation of `appsId`.
	 * @param appsId Part of `parent`. Name of the parent Version resource. Example: apps/myapp/services/default/versions/v1.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * @param pageSize Maximum results to return per page.
	 * @param versionsId Part of `parent`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true" pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true" versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!list(String,String,String,Integer,String)'"
	 * @generated
	 */
	void list(String servicesId, String appsId, String pageToken, Integer pageSize, String versionsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets instance information.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
	 * @param instancesId Part of `name`. See documentation of `appsId`.
	 * @param versionsId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" instancesIdDataType="org.eclipse.cmf.occi.core.String" instancesIdRequired="true" versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!get(String,String,String,String)'"
	 * @generated
	 */
	void get(String servicesId, String appsId, String instancesId, String versionsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enables debugging on a VM instance. This allows you to use the SSH command to connect to the virtual machine where the instance lives. While in "debug mode", the instance continues to serve live traffic. You should delete the instance when you are done debugging and then allow the system to take over and determine if another instance should be started.Only applicable for instances in App Engine flexible environment.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
	 * @param instancesId Part of `name`. See documentation of `appsId`.
	 * @param versionsId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" instancesIdDataType="org.eclipse.cmf.occi.core.String" instancesIdRequired="true" versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!debug(String,String,String,String)'"
	 * @generated
	 */
	void debug(String servicesId, String appsId, String instancesId, String versionsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops a running instance.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1.
	 * @param instancesId Part of `name`. See documentation of `appsId`.
	 * @param versionsId Part of `name`. See documentation of `appsId`.
	 * @param servicesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" instancesIdDataType="org.eclipse.cmf.occi.core.String" instancesIdRequired="true" versionsIdDataType="org.eclipse.cmf.occi.core.String" versionsIdRequired="true" servicesIdDataType="org.eclipse.cmf.occi.core.String" servicesIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Instance!delete(String,String,String,String)'"
	 * @generated
	 */
	void delete(String appsId, String instancesId, String versionsId, String servicesId);

} // Instance
