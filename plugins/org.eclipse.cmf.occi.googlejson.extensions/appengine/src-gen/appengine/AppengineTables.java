/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /appengine/model/appengine.ecore
 * using:
 *   /appengine/model/appengine.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package appengine;

import appengine.AppengineTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * AppengineTables provides the dispatch tables for the appengine for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class AppengineTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AppenginePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://occi/gcpappengine/ecore", null, appengine.AppenginePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Apiconfighandler = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Apiconfighandler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Apiconfighandlerlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Apiconfighandlerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Apiendpointhandler = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Apiendpointhandler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Apiendpointhandlerlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Apiendpointhandlerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Application = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Application", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Authorizedcertificate = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Authorizedcertificate", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Automaticscaling = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Automaticscaling", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Automaticscalinglink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Automaticscalinglink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Basicscaling = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Basicscaling", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Basicscalinglink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Basicscalinglink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Batchupdateingressrulesrequest = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Batchupdateingressrulesrequest", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Batchupdateingressrulesresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Batchupdateingressrulesresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Certificaterawdata = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Certificaterawdata", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Certificaterawdatalink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Certificaterawdatalink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = appengine.AppengineTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Containerinfo = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Containerinfo", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Containerinfolink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Containerinfolink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cpuutilization = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Cpuutilization", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cpuutilizationlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Cpuutilizationlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Deployment = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Deployment", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Deploymentlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Deploymentlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Diskutilization = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Diskutilization", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Diskutilizationlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Diskutilizationlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Domainmapping = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Domainmapping", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Endpointsapiservice = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Endpointsapiservice", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Endpointsapiservicelink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Endpointsapiservicelink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Featuresettings = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Featuresettings", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Featuresettingslink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Featuresettingslink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Healthcheck = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Healthcheck", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Healthchecklink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Healthchecklink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Identityawareproxy = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Identityawareproxy", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Identityawareproxylink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Identityawareproxylink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listauthorizedcertificatesresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listauthorizedcertificatesresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listauthorizeddomainsresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listauthorizeddomainsresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listdomainmappingsresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listdomainmappingsresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listingressrulesresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listingressrulesresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listinstancesresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listinstancesresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listlocationsresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listlocationsresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listoperationsresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listoperationsresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listservicesresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listservicesresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Listversionsresponse = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Listversionsresponse", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Livenesscheck = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Livenesscheck", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Livenesschecklink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Livenesschecklink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Manualscaling = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Manualscaling", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Manualscalinglink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Manualscalinglink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Network = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Network", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networklink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Networklink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkutilization = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Networkutilization", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Networkutilizationlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Networkutilizationlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Operation = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Operation", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Operationmetadatav1 = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Operationmetadatav1", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Operationmetadatav1alpha = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Operationmetadatav1alpha", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Operationmetadatav1beta = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Operationmetadatav1beta", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Readinesscheck = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Readinesscheck", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Readinesschecklink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Readinesschecklink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Requestutilization = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Requestutilization", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Requestutilizationlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Requestutilizationlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = appengine.AppengineTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resources = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Resources", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resourceslink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Resourceslink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Scripthandler = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Scripthandler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Scripthandlerlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Scripthandlerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Service = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Service", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sslsettings = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Sslsettings", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sslsettingslink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Sslsettingslink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Staticfileshandler = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Staticfileshandler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Staticfileshandlerlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Staticfileshandlerlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Status = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Status", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Statuslink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Statuslink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Trafficsplit = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Trafficsplit", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Trafficsplitlink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Trafficsplitlink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Urlmap = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Urlmap", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Version = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Version", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zipinfo = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Zipinfo", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Zipinfolink = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("Zipinfolink", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_array = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getClassId("array", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_map = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getDataTypeId("map", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_object = appengine.AppengineTables.PACKid_http_c_s_s_occi_s_gcpappengine_s_ecore.getDataTypeId("object", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Apiconfighandlerlink_c_c_sourceConstraint = "Apiconfighandlerlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Apiconfighandlerlink_c_c_targetConstraint = "Apiconfighandlerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Apiendpointhandlerlink_c_c_sourceConstraint = "Apiendpointhandlerlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Apiendpointhandlerlink_c_c_targetConstraint = "Apiendpointhandlerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Automaticscalinglink_c_c_sourceConstraint = "Automaticscalinglink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Automaticscalinglink_c_c_targetConstraint = "Automaticscalinglink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Basicscalinglink_c_c_sourceConstraint = "Basicscalinglink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Basicscalinglink_c_c_targetConstraint = "Basicscalinglink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Certificaterawdatalink_c_c_sourceConstraint = "Certificaterawdatalink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Certificaterawdatalink_c_c_targetConstraint = "Certificaterawdatalink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Containerinfolink_c_c_sourceConstraint = "Containerinfolink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Containerinfolink_c_c_targetConstraint = "Containerinfolink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Cpuutilizationlink_c_c_sourceConstraint = "Cpuutilizationlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Cpuutilizationlink_c_c_targetConstraint = "Cpuutilizationlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Deploymentlink_c_c_sourceConstraint = "Deploymentlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Deploymentlink_c_c_targetConstraint = "Deploymentlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Diskutilizationlink_c_c_sourceConstraint = "Diskutilizationlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Diskutilizationlink_c_c_targetConstraint = "Diskutilizationlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Endpointsapiservicelink_c_c_sourceConstraint = "Endpointsapiservicelink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Endpointsapiservicelink_c_c_targetConstraint = "Endpointsapiservicelink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Featuresettingslink_c_c_sourceConstraint = "Featuresettingslink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Featuresettingslink_c_c_targetConstraint = "Featuresettingslink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Healthchecklink_c_c_sourceConstraint = "Healthchecklink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Healthchecklink_c_c_targetConstraint = "Healthchecklink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Identityawareproxylink_c_c_sourceConstraint = "Identityawareproxylink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Identityawareproxylink_c_c_targetConstraint = "Identityawareproxylink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Livenesschecklink_c_c_sourceConstraint = "Livenesschecklink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Livenesschecklink_c_c_targetConstraint = "Livenesschecklink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Manualscalinglink_c_c_sourceConstraint = "Manualscalinglink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Manualscalinglink_c_c_targetConstraint = "Manualscalinglink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networklink_c_c_sourceConstraint = "Networklink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networklink_c_c_targetConstraint = "Networklink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networkutilizationlink_c_c_sourceConstraint = "Networkutilizationlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Networkutilizationlink_c_c_targetConstraint = "Networkutilizationlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Readinesschecklink_c_c_sourceConstraint = "Readinesschecklink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Readinesschecklink_c_c_targetConstraint = "Readinesschecklink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Requestutilizationlink_c_c_sourceConstraint = "Requestutilizationlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Requestutilizationlink_c_c_targetConstraint = "Requestutilizationlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Resourceslink_c_c_sourceConstraint = "Resourceslink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Resourceslink_c_c_targetConstraint = "Resourceslink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Scripthandlerlink_c_c_sourceConstraint = "Scripthandlerlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Scripthandlerlink_c_c_targetConstraint = "Scripthandlerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sslsettingslink_c_c_sourceConstraint = "Sslsettingslink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sslsettingslink_c_c_targetConstraint = "Sslsettingslink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Staticfileshandlerlink_c_c_sourceConstraint = "Staticfileshandlerlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Staticfileshandlerlink_c_c_targetConstraint = "Staticfileshandlerlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Statuslink_c_c_sourceConstraint = "Statuslink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Statuslink_c_c_targetConstraint = "Statuslink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Trafficsplitlink_c_c_sourceConstraint = "Trafficsplitlink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Trafficsplitlink_c_c_targetConstraint = "Trafficsplitlink::targetConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Zipinfolink_c_c_sourceConstraint = "Zipinfolink::sourceConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Zipinfolink_c_c_targetConstraint = "Zipinfolink::targetConstraint";
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.CollectionTypeId SEQ_DATAid_object = org.eclipse.ocl.pivot.ids.TypeId.SEQUENCE.getSpecializedId(appengine.AppengineTables.DATAid_object);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AppengineTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumeration _Action = new EcoreExecutorEnumeration(AppenginePackage.Literals.ACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ApiConfigHandlerAuthfailaction = new EcoreExecutorEnumeration(AppenginePackage.Literals.API_CONFIG_HANDLER_AUTHFAILACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ApiConfigHandlerLogin = new EcoreExecutorEnumeration(AppenginePackage.Literals.API_CONFIG_HANDLER_LOGIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _ApiConfigHandlerSecuritylevel = new EcoreExecutorEnumeration(AppenginePackage.Literals.API_CONFIG_HANDLER_SECURITYLEVEL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apiconfighandler = new EcoreExecutorType(AppenginePackage.Literals.APICONFIGHANDLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apiconfighandlerlink = new EcoreExecutorType(AppenginePackage.Literals.APICONFIGHANDLERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apiendpointhandler = new EcoreExecutorType(AppenginePackage.Literals.APIENDPOINTHANDLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Apiendpointhandlerlink = new EcoreExecutorType(AppenginePackage.Literals.APIENDPOINTHANDLERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Application = new EcoreExecutorType(AppenginePackage.Literals.APPLICATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Authfailaction = new EcoreExecutorEnumeration(AppenginePackage.Literals.AUTHFAILACTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Authorizedcertificate = new EcoreExecutorType(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Authorizeddomain = new EcoreExecutorType(AppenginePackage.Literals.AUTHORIZEDDOMAIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Automaticscaling = new EcoreExecutorType(AppenginePackage.Literals.AUTOMATICSCALING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Automaticscalinglink = new EcoreExecutorType(AppenginePackage.Literals.AUTOMATICSCALINGLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Availability = new EcoreExecutorEnumeration(AppenginePackage.Literals.AVAILABILITY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Basicscaling = new EcoreExecutorType(AppenginePackage.Literals.BASICSCALING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Basicscalinglink = new EcoreExecutorType(AppenginePackage.Literals.BASICSCALINGLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Batchupdateingressrulesrequest = new EcoreExecutorType(AppenginePackage.Literals.BATCHUPDATEINGRESSRULESREQUEST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Batchupdateingressrulesresponse = new EcoreExecutorType(AppenginePackage.Literals.BATCHUPDATEINGRESSRULESRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Certificaterawdata = new EcoreExecutorType(AppenginePackage.Literals.CERTIFICATERAWDATA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Certificaterawdatalink = new EcoreExecutorType(AppenginePackage.Literals.CERTIFICATERAWDATALINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Containerinfo = new EcoreExecutorType(AppenginePackage.Literals.CONTAINERINFO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Containerinfolink = new EcoreExecutorType(AppenginePackage.Literals.CONTAINERINFOLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cpuutilization = new EcoreExecutorType(AppenginePackage.Literals.CPUUTILIZATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cpuutilizationlink = new EcoreExecutorType(AppenginePackage.Literals.CPUUTILIZATIONLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Debuginstancerequest = new EcoreExecutorType(AppenginePackage.Literals.DEBUGINSTANCEREQUEST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Deployment = new EcoreExecutorType(AppenginePackage.Literals.DEPLOYMENT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Deploymentlink = new EcoreExecutorType(AppenginePackage.Literals.DEPLOYMENTLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Diskutilization = new EcoreExecutorType(AppenginePackage.Literals.DISKUTILIZATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Diskutilizationlink = new EcoreExecutorType(AppenginePackage.Literals.DISKUTILIZATIONLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Domainmapping = new EcoreExecutorType(AppenginePackage.Literals.DOMAINMAPPING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Empty = new EcoreExecutorType(AppenginePackage.Literals.EMPTY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Endpointsapiservice = new EcoreExecutorType(AppenginePackage.Literals.ENDPOINTSAPISERVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Endpointsapiservicelink = new EcoreExecutorType(AppenginePackage.Literals.ENDPOINTSAPISERVICELINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Errorcode = new EcoreExecutorEnumeration(AppenginePackage.Literals.ERRORCODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Errorhandler = new EcoreExecutorType(AppenginePackage.Literals.ERRORHANDLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Featuresettings = new EcoreExecutorType(AppenginePackage.Literals.FEATURESETTINGS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Featuresettingslink = new EcoreExecutorType(AppenginePackage.Literals.FEATURESETTINGSLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Fileinfo = new EcoreExecutorType(AppenginePackage.Literals.FILEINFO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Firewallrule = new EcoreExecutorType(AppenginePackage.Literals.FIREWALLRULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Healthcheck = new EcoreExecutorType(AppenginePackage.Literals.HEALTHCHECK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Healthchecklink = new EcoreExecutorType(AppenginePackage.Literals.HEALTHCHECKLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Identityawareproxy = new EcoreExecutorType(AppenginePackage.Literals.IDENTITYAWAREPROXY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Identityawareproxylink = new EcoreExecutorType(AppenginePackage.Literals.IDENTITYAWAREPROXYLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Instance = new EcoreExecutorType(AppenginePackage.Literals.INSTANCE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Library = new EcoreExecutorType(AppenginePackage.Literals.LIBRARY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listauthorizedcertificatesresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTAUTHORIZEDCERTIFICATESRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listauthorizeddomainsresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTAUTHORIZEDDOMAINSRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listdomainmappingsresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTDOMAINMAPPINGSRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listingressrulesresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTINGRESSRULESRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listinstancesresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTINSTANCESRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listlocationsresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTLOCATIONSRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listoperationsresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTOPERATIONSRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listservicesresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTSERVICESRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Listversionsresponse = new EcoreExecutorType(AppenginePackage.Literals.LISTVERSIONSRESPONSE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Livenesscheck = new EcoreExecutorType(AppenginePackage.Literals.LIVENESSCHECK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Livenesschecklink = new EcoreExecutorType(AppenginePackage.Literals.LIVENESSCHECKLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Location = new EcoreExecutorType(AppenginePackage.Literals.LOCATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Locationmetadata = new EcoreExecutorType(AppenginePackage.Literals.LOCATIONMETADATA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Login = new EcoreExecutorEnumeration(AppenginePackage.Literals.LOGIN, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manualscaling = new EcoreExecutorType(AppenginePackage.Literals.MANUALSCALING, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Manualscalinglink = new EcoreExecutorType(AppenginePackage.Literals.MANUALSCALINGLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Network = new EcoreExecutorType(AppenginePackage.Literals.NETWORK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networklink = new EcoreExecutorType(AppenginePackage.Literals.NETWORKLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networkutilization = new EcoreExecutorType(AppenginePackage.Literals.NETWORKUTILIZATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networkutilizationlink = new EcoreExecutorType(AppenginePackage.Literals.NETWORKUTILIZATIONLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operation = new EcoreExecutorType(AppenginePackage.Literals.OPERATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operationmetadata = new EcoreExecutorType(AppenginePackage.Literals.OPERATIONMETADATA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operationmetadataexperimental = new EcoreExecutorType(AppenginePackage.Literals.OPERATIONMETADATAEXPERIMENTAL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operationmetadatav1 = new EcoreExecutorType(AppenginePackage.Literals.OPERATIONMETADATAV1, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operationmetadatav1alpha = new EcoreExecutorType(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operationmetadatav1beta = new EcoreExecutorType(AppenginePackage.Literals.OPERATIONMETADATAV1BETA, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Operationmetadatav1beta5 = new EcoreExecutorType(AppenginePackage.Literals.OPERATIONMETADATAV1BETA5, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Readinesscheck = new EcoreExecutorType(AppenginePackage.Literals.READINESSCHECK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Readinesschecklink = new EcoreExecutorType(AppenginePackage.Literals.READINESSCHECKLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Redirecthttpresponsecode = new EcoreExecutorEnumeration(AppenginePackage.Literals.REDIRECTHTTPRESPONSECODE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Repairapplicationrequest = new EcoreExecutorType(AppenginePackage.Literals.REPAIRAPPLICATIONREQUEST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Requestutilization = new EcoreExecutorType(AppenginePackage.Literals.REQUESTUTILIZATION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Requestutilizationlink = new EcoreExecutorType(AppenginePackage.Literals.REQUESTUTILIZATIONLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resourcerecord = new EcoreExecutorType(AppenginePackage.Literals.RESOURCERECORD, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resources = new EcoreExecutorType(AppenginePackage.Literals.RESOURCES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Resourceslink = new EcoreExecutorType(AppenginePackage.Literals.RESOURCESLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scripthandler = new EcoreExecutorType(AppenginePackage.Literals.SCRIPTHANDLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Scripthandlerlink = new EcoreExecutorType(AppenginePackage.Literals.SCRIPTHANDLERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Securitylevel = new EcoreExecutorEnumeration(AppenginePackage.Literals.SECURITYLEVEL, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Service = new EcoreExecutorType(AppenginePackage.Literals.SERVICE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Servingstatus = new EcoreExecutorEnumeration(AppenginePackage.Literals.SERVINGSTATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Shardby = new EcoreExecutorEnumeration(AppenginePackage.Literals.SHARDBY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sslsettings = new EcoreExecutorType(AppenginePackage.Literals.SSLSETTINGS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sslsettingslink = new EcoreExecutorType(AppenginePackage.Literals.SSLSETTINGSLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Staticfileshandler = new EcoreExecutorType(AppenginePackage.Literals.STATICFILESHANDLER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Staticfileshandlerlink = new EcoreExecutorType(AppenginePackage.Literals.STATICFILESHANDLERLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Status = new EcoreExecutorType(AppenginePackage.Literals.STATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Statuslink = new EcoreExecutorType(AppenginePackage.Literals.STATUSLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Trafficsplit = new EcoreExecutorType(AppenginePackage.Literals.TRAFFICSPLIT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Trafficsplitlink = new EcoreExecutorType(AppenginePackage.Literals.TRAFFICSPLITLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _Type = new EcoreExecutorEnumeration(AppenginePackage.Literals.TYPE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Urldispatchrule = new EcoreExecutorType(AppenginePackage.Literals.URLDISPATCHRULE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Urlmap = new EcoreExecutorType(AppenginePackage.Literals.URLMAP, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Version = new EcoreExecutorType(AppenginePackage.Literals.VERSION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _VersionServingstatus = new EcoreExecutorEnumeration(AppenginePackage.Literals.VERSION_SERVINGSTATUS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Volume = new EcoreExecutorType(AppenginePackage.Literals.VOLUME, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zipinfo = new EcoreExecutorType(AppenginePackage.Literals.ZIPINFO, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Zipinfolink = new EcoreExecutorType(AppenginePackage.Literals.ZIPINFOLINK, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _any = new EcoreExecutorType("any", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _array = new EcoreExecutorType(AppenginePackage.Literals.ARRAY, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _byte = new EcoreExecutorType("byte", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _double = new EcoreExecutorType("double", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _float = new EcoreExecutorType("float", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _long = new EcoreExecutorType("long", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _map = new EcoreExecutorType("map", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _object = new EcoreExecutorType("object", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _short = new EcoreExecutorType("short", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_ApiConfigHandlerAuthfailaction,
			_ApiConfigHandlerLogin,
			_ApiConfigHandlerSecuritylevel,
			_Apiconfighandler,
			_Apiconfighandlerlink,
			_Apiendpointhandler,
			_Apiendpointhandlerlink,
			_Application,
			_Authfailaction,
			_Authorizedcertificate,
			_Authorizeddomain,
			_Automaticscaling,
			_Automaticscalinglink,
			_Availability,
			_Basicscaling,
			_Basicscalinglink,
			_Batchupdateingressrulesrequest,
			_Batchupdateingressrulesresponse,
			_Certificaterawdata,
			_Certificaterawdatalink,
			_Containerinfo,
			_Containerinfolink,
			_Cpuutilization,
			_Cpuutilizationlink,
			_Debuginstancerequest,
			_Deployment,
			_Deploymentlink,
			_Diskutilization,
			_Diskutilizationlink,
			_Domainmapping,
			_Empty,
			_Endpointsapiservice,
			_Endpointsapiservicelink,
			_Errorcode,
			_Errorhandler,
			_Featuresettings,
			_Featuresettingslink,
			_Fileinfo,
			_Firewallrule,
			_Healthcheck,
			_Healthchecklink,
			_Identityawareproxy,
			_Identityawareproxylink,
			_Instance,
			_Library,
			_Listauthorizedcertificatesresponse,
			_Listauthorizeddomainsresponse,
			_Listdomainmappingsresponse,
			_Listingressrulesresponse,
			_Listinstancesresponse,
			_Listlocationsresponse,
			_Listoperationsresponse,
			_Listservicesresponse,
			_Listversionsresponse,
			_Livenesscheck,
			_Livenesschecklink,
			_Location,
			_Locationmetadata,
			_Login,
			_Manualscaling,
			_Manualscalinglink,
			_Network,
			_Networklink,
			_Networkutilization,
			_Networkutilizationlink,
			_Operation,
			_Operationmetadata,
			_Operationmetadataexperimental,
			_Operationmetadatav1,
			_Operationmetadatav1alpha,
			_Operationmetadatav1beta,
			_Operationmetadatav1beta5,
			_Readinesscheck,
			_Readinesschecklink,
			_Redirecthttpresponsecode,
			_Repairapplicationrequest,
			_Requestutilization,
			_Requestutilizationlink,
			_Resourcerecord,
			_Resources,
			_Resourceslink,
			_Scripthandler,
			_Scripthandlerlink,
			_Securitylevel,
			_Service,
			_Servingstatus,
			_Shardby,
			_Sslsettings,
			_Sslsettingslink,
			_Staticfileshandler,
			_Staticfileshandlerlink,
			_Status,
			_Statuslink,
			_Trafficsplit,
			_Trafficsplitlink,
			_Type,
			_Urldispatchrule,
			_Urlmap,
			_Version,
			_VersionServingstatus,
			_Volume,
			_Zipinfo,
			_Zipinfolink,
			_any,
			_array,
			_byte,
			_double,
			_float,
			_long,
			_map,
			_object,
			_short
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, AppengineTables.Types._Action);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclEnumeration = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Action__OclType = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerAuthfailaction__ApiConfigHandlerAuthfailaction = new ExecutorFragment(Types._ApiConfigHandlerAuthfailaction, AppengineTables.Types._ApiConfigHandlerAuthfailaction);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerAuthfailaction__OclAny = new ExecutorFragment(Types._ApiConfigHandlerAuthfailaction, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerAuthfailaction__OclElement = new ExecutorFragment(Types._ApiConfigHandlerAuthfailaction, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerAuthfailaction__OclEnumeration = new ExecutorFragment(Types._ApiConfigHandlerAuthfailaction, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerAuthfailaction__OclType = new ExecutorFragment(Types._ApiConfigHandlerAuthfailaction, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerLogin__ApiConfigHandlerLogin = new ExecutorFragment(Types._ApiConfigHandlerLogin, AppengineTables.Types._ApiConfigHandlerLogin);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerLogin__OclAny = new ExecutorFragment(Types._ApiConfigHandlerLogin, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerLogin__OclElement = new ExecutorFragment(Types._ApiConfigHandlerLogin, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerLogin__OclEnumeration = new ExecutorFragment(Types._ApiConfigHandlerLogin, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerLogin__OclType = new ExecutorFragment(Types._ApiConfigHandlerLogin, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerSecuritylevel__ApiConfigHandlerSecuritylevel = new ExecutorFragment(Types._ApiConfigHandlerSecuritylevel, AppengineTables.Types._ApiConfigHandlerSecuritylevel);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerSecuritylevel__OclAny = new ExecutorFragment(Types._ApiConfigHandlerSecuritylevel, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerSecuritylevel__OclElement = new ExecutorFragment(Types._ApiConfigHandlerSecuritylevel, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerSecuritylevel__OclEnumeration = new ExecutorFragment(Types._ApiConfigHandlerSecuritylevel, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _ApiConfigHandlerSecuritylevel__OclType = new ExecutorFragment(Types._ApiConfigHandlerSecuritylevel, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandler__Apiconfighandler = new ExecutorFragment(Types._Apiconfighandler, AppengineTables.Types._Apiconfighandler);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandler__Entity = new ExecutorFragment(Types._Apiconfighandler, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandler__OclAny = new ExecutorFragment(Types._Apiconfighandler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandler__OclElement = new ExecutorFragment(Types._Apiconfighandler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandler__Resource = new ExecutorFragment(Types._Apiconfighandler, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandlerlink__Apiconfighandlerlink = new ExecutorFragment(Types._Apiconfighandlerlink, AppengineTables.Types._Apiconfighandlerlink);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandlerlink__Entity = new ExecutorFragment(Types._Apiconfighandlerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandlerlink__Link = new ExecutorFragment(Types._Apiconfighandlerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandlerlink__OclAny = new ExecutorFragment(Types._Apiconfighandlerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apiconfighandlerlink__OclElement = new ExecutorFragment(Types._Apiconfighandlerlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandler__Apiendpointhandler = new ExecutorFragment(Types._Apiendpointhandler, AppengineTables.Types._Apiendpointhandler);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandler__Entity = new ExecutorFragment(Types._Apiendpointhandler, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandler__OclAny = new ExecutorFragment(Types._Apiendpointhandler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandler__OclElement = new ExecutorFragment(Types._Apiendpointhandler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandler__Resource = new ExecutorFragment(Types._Apiendpointhandler, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandlerlink__Apiendpointhandlerlink = new ExecutorFragment(Types._Apiendpointhandlerlink, AppengineTables.Types._Apiendpointhandlerlink);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandlerlink__Entity = new ExecutorFragment(Types._Apiendpointhandlerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandlerlink__Link = new ExecutorFragment(Types._Apiendpointhandlerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandlerlink__OclAny = new ExecutorFragment(Types._Apiendpointhandlerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Apiendpointhandlerlink__OclElement = new ExecutorFragment(Types._Apiendpointhandlerlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Application__Application = new ExecutorFragment(Types._Application, AppengineTables.Types._Application);
		private static final /*@NonNull*/ ExecutorFragment _Application__Entity = new ExecutorFragment(Types._Application, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Application__OclAny = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Application__OclElement = new ExecutorFragment(Types._Application, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Application__Resource = new ExecutorFragment(Types._Application, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Authfailaction__Authfailaction = new ExecutorFragment(Types._Authfailaction, AppengineTables.Types._Authfailaction);
		private static final /*@NonNull*/ ExecutorFragment _Authfailaction__OclAny = new ExecutorFragment(Types._Authfailaction, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Authfailaction__OclElement = new ExecutorFragment(Types._Authfailaction, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Authfailaction__OclEnumeration = new ExecutorFragment(Types._Authfailaction, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Authfailaction__OclType = new ExecutorFragment(Types._Authfailaction, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Authorizedcertificate__Authorizedcertificate = new ExecutorFragment(Types._Authorizedcertificate, AppengineTables.Types._Authorizedcertificate);
		private static final /*@NonNull*/ ExecutorFragment _Authorizedcertificate__Entity = new ExecutorFragment(Types._Authorizedcertificate, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Authorizedcertificate__OclAny = new ExecutorFragment(Types._Authorizedcertificate, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Authorizedcertificate__OclElement = new ExecutorFragment(Types._Authorizedcertificate, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Authorizedcertificate__Resource = new ExecutorFragment(Types._Authorizedcertificate, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Authorizeddomain__Authorizeddomain = new ExecutorFragment(Types._Authorizeddomain, AppengineTables.Types._Authorizeddomain);
		private static final /*@NonNull*/ ExecutorFragment _Authorizeddomain__Entity = new ExecutorFragment(Types._Authorizeddomain, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Authorizeddomain__OclAny = new ExecutorFragment(Types._Authorizeddomain, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Authorizeddomain__OclElement = new ExecutorFragment(Types._Authorizeddomain, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Authorizeddomain__Resource = new ExecutorFragment(Types._Authorizeddomain, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Automaticscaling__Automaticscaling = new ExecutorFragment(Types._Automaticscaling, AppengineTables.Types._Automaticscaling);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscaling__Entity = new ExecutorFragment(Types._Automaticscaling, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscaling__OclAny = new ExecutorFragment(Types._Automaticscaling, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscaling__OclElement = new ExecutorFragment(Types._Automaticscaling, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscaling__Resource = new ExecutorFragment(Types._Automaticscaling, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Automaticscalinglink__Automaticscalinglink = new ExecutorFragment(Types._Automaticscalinglink, AppengineTables.Types._Automaticscalinglink);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscalinglink__Entity = new ExecutorFragment(Types._Automaticscalinglink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscalinglink__Link = new ExecutorFragment(Types._Automaticscalinglink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscalinglink__OclAny = new ExecutorFragment(Types._Automaticscalinglink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Automaticscalinglink__OclElement = new ExecutorFragment(Types._Automaticscalinglink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Availability__Availability = new ExecutorFragment(Types._Availability, AppengineTables.Types._Availability);
		private static final /*@NonNull*/ ExecutorFragment _Availability__OclAny = new ExecutorFragment(Types._Availability, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Availability__OclElement = new ExecutorFragment(Types._Availability, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Availability__OclEnumeration = new ExecutorFragment(Types._Availability, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Availability__OclType = new ExecutorFragment(Types._Availability, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Basicscaling__Basicscaling = new ExecutorFragment(Types._Basicscaling, AppengineTables.Types._Basicscaling);
		private static final /*@NonNull*/ ExecutorFragment _Basicscaling__Entity = new ExecutorFragment(Types._Basicscaling, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Basicscaling__OclAny = new ExecutorFragment(Types._Basicscaling, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Basicscaling__OclElement = new ExecutorFragment(Types._Basicscaling, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Basicscaling__Resource = new ExecutorFragment(Types._Basicscaling, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Basicscalinglink__Basicscalinglink = new ExecutorFragment(Types._Basicscalinglink, AppengineTables.Types._Basicscalinglink);
		private static final /*@NonNull*/ ExecutorFragment _Basicscalinglink__Entity = new ExecutorFragment(Types._Basicscalinglink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Basicscalinglink__Link = new ExecutorFragment(Types._Basicscalinglink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Basicscalinglink__OclAny = new ExecutorFragment(Types._Basicscalinglink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Basicscalinglink__OclElement = new ExecutorFragment(Types._Basicscalinglink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesrequest__Batchupdateingressrulesrequest = new ExecutorFragment(Types._Batchupdateingressrulesrequest, AppengineTables.Types._Batchupdateingressrulesrequest);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesrequest__Entity = new ExecutorFragment(Types._Batchupdateingressrulesrequest, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesrequest__OclAny = new ExecutorFragment(Types._Batchupdateingressrulesrequest, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesrequest__OclElement = new ExecutorFragment(Types._Batchupdateingressrulesrequest, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesrequest__Resource = new ExecutorFragment(Types._Batchupdateingressrulesrequest, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesresponse__Batchupdateingressrulesresponse = new ExecutorFragment(Types._Batchupdateingressrulesresponse, AppengineTables.Types._Batchupdateingressrulesresponse);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesresponse__Entity = new ExecutorFragment(Types._Batchupdateingressrulesresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesresponse__OclAny = new ExecutorFragment(Types._Batchupdateingressrulesresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesresponse__OclElement = new ExecutorFragment(Types._Batchupdateingressrulesresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Batchupdateingressrulesresponse__Resource = new ExecutorFragment(Types._Batchupdateingressrulesresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdata__Certificaterawdata = new ExecutorFragment(Types._Certificaterawdata, AppengineTables.Types._Certificaterawdata);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdata__Entity = new ExecutorFragment(Types._Certificaterawdata, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdata__OclAny = new ExecutorFragment(Types._Certificaterawdata, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdata__OclElement = new ExecutorFragment(Types._Certificaterawdata, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdata__Resource = new ExecutorFragment(Types._Certificaterawdata, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdatalink__Certificaterawdatalink = new ExecutorFragment(Types._Certificaterawdatalink, AppengineTables.Types._Certificaterawdatalink);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdatalink__Entity = new ExecutorFragment(Types._Certificaterawdatalink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdatalink__Link = new ExecutorFragment(Types._Certificaterawdatalink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdatalink__OclAny = new ExecutorFragment(Types._Certificaterawdatalink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Certificaterawdatalink__OclElement = new ExecutorFragment(Types._Certificaterawdatalink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Containerinfo__Containerinfo = new ExecutorFragment(Types._Containerinfo, AppengineTables.Types._Containerinfo);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfo__Entity = new ExecutorFragment(Types._Containerinfo, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfo__OclAny = new ExecutorFragment(Types._Containerinfo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfo__OclElement = new ExecutorFragment(Types._Containerinfo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfo__Resource = new ExecutorFragment(Types._Containerinfo, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Containerinfolink__Containerinfolink = new ExecutorFragment(Types._Containerinfolink, AppengineTables.Types._Containerinfolink);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfolink__Entity = new ExecutorFragment(Types._Containerinfolink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfolink__Link = new ExecutorFragment(Types._Containerinfolink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfolink__OclAny = new ExecutorFragment(Types._Containerinfolink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Containerinfolink__OclElement = new ExecutorFragment(Types._Containerinfolink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Cpuutilization__Cpuutilization = new ExecutorFragment(Types._Cpuutilization, AppengineTables.Types._Cpuutilization);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilization__Entity = new ExecutorFragment(Types._Cpuutilization, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilization__OclAny = new ExecutorFragment(Types._Cpuutilization, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilization__OclElement = new ExecutorFragment(Types._Cpuutilization, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilization__Resource = new ExecutorFragment(Types._Cpuutilization, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Cpuutilizationlink__Cpuutilizationlink = new ExecutorFragment(Types._Cpuutilizationlink, AppengineTables.Types._Cpuutilizationlink);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilizationlink__Entity = new ExecutorFragment(Types._Cpuutilizationlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilizationlink__Link = new ExecutorFragment(Types._Cpuutilizationlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilizationlink__OclAny = new ExecutorFragment(Types._Cpuutilizationlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cpuutilizationlink__OclElement = new ExecutorFragment(Types._Cpuutilizationlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Debuginstancerequest__Debuginstancerequest = new ExecutorFragment(Types._Debuginstancerequest, AppengineTables.Types._Debuginstancerequest);
		private static final /*@NonNull*/ ExecutorFragment _Debuginstancerequest__Entity = new ExecutorFragment(Types._Debuginstancerequest, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Debuginstancerequest__OclAny = new ExecutorFragment(Types._Debuginstancerequest, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Debuginstancerequest__OclElement = new ExecutorFragment(Types._Debuginstancerequest, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Debuginstancerequest__Resource = new ExecutorFragment(Types._Debuginstancerequest, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Deployment__Deployment = new ExecutorFragment(Types._Deployment, AppengineTables.Types._Deployment);
		private static final /*@NonNull*/ ExecutorFragment _Deployment__Entity = new ExecutorFragment(Types._Deployment, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Deployment__OclAny = new ExecutorFragment(Types._Deployment, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Deployment__OclElement = new ExecutorFragment(Types._Deployment, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Deployment__Resource = new ExecutorFragment(Types._Deployment, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Deploymentlink__Deploymentlink = new ExecutorFragment(Types._Deploymentlink, AppengineTables.Types._Deploymentlink);
		private static final /*@NonNull*/ ExecutorFragment _Deploymentlink__Entity = new ExecutorFragment(Types._Deploymentlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Deploymentlink__Link = new ExecutorFragment(Types._Deploymentlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Deploymentlink__OclAny = new ExecutorFragment(Types._Deploymentlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Deploymentlink__OclElement = new ExecutorFragment(Types._Deploymentlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Diskutilization__Diskutilization = new ExecutorFragment(Types._Diskutilization, AppengineTables.Types._Diskutilization);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilization__Entity = new ExecutorFragment(Types._Diskutilization, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilization__OclAny = new ExecutorFragment(Types._Diskutilization, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilization__OclElement = new ExecutorFragment(Types._Diskutilization, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilization__Resource = new ExecutorFragment(Types._Diskutilization, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Diskutilizationlink__Diskutilizationlink = new ExecutorFragment(Types._Diskutilizationlink, AppengineTables.Types._Diskutilizationlink);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilizationlink__Entity = new ExecutorFragment(Types._Diskutilizationlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilizationlink__Link = new ExecutorFragment(Types._Diskutilizationlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilizationlink__OclAny = new ExecutorFragment(Types._Diskutilizationlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Diskutilizationlink__OclElement = new ExecutorFragment(Types._Diskutilizationlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Domainmapping__Domainmapping = new ExecutorFragment(Types._Domainmapping, AppengineTables.Types._Domainmapping);
		private static final /*@NonNull*/ ExecutorFragment _Domainmapping__Entity = new ExecutorFragment(Types._Domainmapping, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Domainmapping__OclAny = new ExecutorFragment(Types._Domainmapping, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Domainmapping__OclElement = new ExecutorFragment(Types._Domainmapping, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Domainmapping__Resource = new ExecutorFragment(Types._Domainmapping, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Empty__Empty = new ExecutorFragment(Types._Empty, AppengineTables.Types._Empty);
		private static final /*@NonNull*/ ExecutorFragment _Empty__Entity = new ExecutorFragment(Types._Empty, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Empty__OclAny = new ExecutorFragment(Types._Empty, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Empty__OclElement = new ExecutorFragment(Types._Empty, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Empty__Resource = new ExecutorFragment(Types._Empty, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservice__Endpointsapiservice = new ExecutorFragment(Types._Endpointsapiservice, AppengineTables.Types._Endpointsapiservice);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservice__Entity = new ExecutorFragment(Types._Endpointsapiservice, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservice__OclAny = new ExecutorFragment(Types._Endpointsapiservice, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservice__OclElement = new ExecutorFragment(Types._Endpointsapiservice, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservice__Resource = new ExecutorFragment(Types._Endpointsapiservice, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservicelink__Endpointsapiservicelink = new ExecutorFragment(Types._Endpointsapiservicelink, AppengineTables.Types._Endpointsapiservicelink);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservicelink__Entity = new ExecutorFragment(Types._Endpointsapiservicelink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservicelink__Link = new ExecutorFragment(Types._Endpointsapiservicelink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservicelink__OclAny = new ExecutorFragment(Types._Endpointsapiservicelink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Endpointsapiservicelink__OclElement = new ExecutorFragment(Types._Endpointsapiservicelink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Errorcode__Errorcode = new ExecutorFragment(Types._Errorcode, AppengineTables.Types._Errorcode);
		private static final /*@NonNull*/ ExecutorFragment _Errorcode__OclAny = new ExecutorFragment(Types._Errorcode, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Errorcode__OclElement = new ExecutorFragment(Types._Errorcode, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Errorcode__OclEnumeration = new ExecutorFragment(Types._Errorcode, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Errorcode__OclType = new ExecutorFragment(Types._Errorcode, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Errorhandler__Entity = new ExecutorFragment(Types._Errorhandler, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Errorhandler__Errorhandler = new ExecutorFragment(Types._Errorhandler, AppengineTables.Types._Errorhandler);
		private static final /*@NonNull*/ ExecutorFragment _Errorhandler__OclAny = new ExecutorFragment(Types._Errorhandler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Errorhandler__OclElement = new ExecutorFragment(Types._Errorhandler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Errorhandler__Resource = new ExecutorFragment(Types._Errorhandler, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Featuresettings__Entity = new ExecutorFragment(Types._Featuresettings, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettings__Featuresettings = new ExecutorFragment(Types._Featuresettings, AppengineTables.Types._Featuresettings);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettings__OclAny = new ExecutorFragment(Types._Featuresettings, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettings__OclElement = new ExecutorFragment(Types._Featuresettings, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettings__Resource = new ExecutorFragment(Types._Featuresettings, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Featuresettingslink__Entity = new ExecutorFragment(Types._Featuresettingslink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettingslink__Featuresettingslink = new ExecutorFragment(Types._Featuresettingslink, AppengineTables.Types._Featuresettingslink);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettingslink__Link = new ExecutorFragment(Types._Featuresettingslink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettingslink__OclAny = new ExecutorFragment(Types._Featuresettingslink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Featuresettingslink__OclElement = new ExecutorFragment(Types._Featuresettingslink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Fileinfo__Entity = new ExecutorFragment(Types._Fileinfo, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Fileinfo__Fileinfo = new ExecutorFragment(Types._Fileinfo, AppengineTables.Types._Fileinfo);
		private static final /*@NonNull*/ ExecutorFragment _Fileinfo__OclAny = new ExecutorFragment(Types._Fileinfo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Fileinfo__OclElement = new ExecutorFragment(Types._Fileinfo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Fileinfo__Resource = new ExecutorFragment(Types._Fileinfo, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Firewallrule__Entity = new ExecutorFragment(Types._Firewallrule, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Firewallrule__Firewallrule = new ExecutorFragment(Types._Firewallrule, AppengineTables.Types._Firewallrule);
		private static final /*@NonNull*/ ExecutorFragment _Firewallrule__OclAny = new ExecutorFragment(Types._Firewallrule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Firewallrule__OclElement = new ExecutorFragment(Types._Firewallrule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Firewallrule__Resource = new ExecutorFragment(Types._Firewallrule, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Healthcheck__Entity = new ExecutorFragment(Types._Healthcheck, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Healthcheck__Healthcheck = new ExecutorFragment(Types._Healthcheck, AppengineTables.Types._Healthcheck);
		private static final /*@NonNull*/ ExecutorFragment _Healthcheck__OclAny = new ExecutorFragment(Types._Healthcheck, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Healthcheck__OclElement = new ExecutorFragment(Types._Healthcheck, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Healthcheck__Resource = new ExecutorFragment(Types._Healthcheck, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Healthchecklink__Entity = new ExecutorFragment(Types._Healthchecklink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Healthchecklink__Healthchecklink = new ExecutorFragment(Types._Healthchecklink, AppengineTables.Types._Healthchecklink);
		private static final /*@NonNull*/ ExecutorFragment _Healthchecklink__Link = new ExecutorFragment(Types._Healthchecklink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Healthchecklink__OclAny = new ExecutorFragment(Types._Healthchecklink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Healthchecklink__OclElement = new ExecutorFragment(Types._Healthchecklink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxy__Entity = new ExecutorFragment(Types._Identityawareproxy, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxy__Identityawareproxy = new ExecutorFragment(Types._Identityawareproxy, AppengineTables.Types._Identityawareproxy);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxy__OclAny = new ExecutorFragment(Types._Identityawareproxy, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxy__OclElement = new ExecutorFragment(Types._Identityawareproxy, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxy__Resource = new ExecutorFragment(Types._Identityawareproxy, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxylink__Entity = new ExecutorFragment(Types._Identityawareproxylink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxylink__Identityawareproxylink = new ExecutorFragment(Types._Identityawareproxylink, AppengineTables.Types._Identityawareproxylink);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxylink__Link = new ExecutorFragment(Types._Identityawareproxylink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxylink__OclAny = new ExecutorFragment(Types._Identityawareproxylink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Identityawareproxylink__OclElement = new ExecutorFragment(Types._Identityawareproxylink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Instance__Entity = new ExecutorFragment(Types._Instance, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Instance__Instance = new ExecutorFragment(Types._Instance, AppengineTables.Types._Instance);
		private static final /*@NonNull*/ ExecutorFragment _Instance__OclAny = new ExecutorFragment(Types._Instance, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Instance__OclElement = new ExecutorFragment(Types._Instance, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Instance__Resource = new ExecutorFragment(Types._Instance, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Library__Entity = new ExecutorFragment(Types._Library, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Library__Library = new ExecutorFragment(Types._Library, AppengineTables.Types._Library);
		private static final /*@NonNull*/ ExecutorFragment _Library__OclAny = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Library__OclElement = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Library__Resource = new ExecutorFragment(Types._Library, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listauthorizedcertificatesresponse__Entity = new ExecutorFragment(Types._Listauthorizedcertificatesresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizedcertificatesresponse__Listauthorizedcertificatesresponse = new ExecutorFragment(Types._Listauthorizedcertificatesresponse, AppengineTables.Types._Listauthorizedcertificatesresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizedcertificatesresponse__OclAny = new ExecutorFragment(Types._Listauthorizedcertificatesresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizedcertificatesresponse__OclElement = new ExecutorFragment(Types._Listauthorizedcertificatesresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizedcertificatesresponse__Resource = new ExecutorFragment(Types._Listauthorizedcertificatesresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listauthorizeddomainsresponse__Entity = new ExecutorFragment(Types._Listauthorizeddomainsresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizeddomainsresponse__Listauthorizeddomainsresponse = new ExecutorFragment(Types._Listauthorizeddomainsresponse, AppengineTables.Types._Listauthorizeddomainsresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizeddomainsresponse__OclAny = new ExecutorFragment(Types._Listauthorizeddomainsresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizeddomainsresponse__OclElement = new ExecutorFragment(Types._Listauthorizeddomainsresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listauthorizeddomainsresponse__Resource = new ExecutorFragment(Types._Listauthorizeddomainsresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listdomainmappingsresponse__Entity = new ExecutorFragment(Types._Listdomainmappingsresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listdomainmappingsresponse__Listdomainmappingsresponse = new ExecutorFragment(Types._Listdomainmappingsresponse, AppengineTables.Types._Listdomainmappingsresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listdomainmappingsresponse__OclAny = new ExecutorFragment(Types._Listdomainmappingsresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listdomainmappingsresponse__OclElement = new ExecutorFragment(Types._Listdomainmappingsresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listdomainmappingsresponse__Resource = new ExecutorFragment(Types._Listdomainmappingsresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listingressrulesresponse__Entity = new ExecutorFragment(Types._Listingressrulesresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listingressrulesresponse__Listingressrulesresponse = new ExecutorFragment(Types._Listingressrulesresponse, AppengineTables.Types._Listingressrulesresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listingressrulesresponse__OclAny = new ExecutorFragment(Types._Listingressrulesresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listingressrulesresponse__OclElement = new ExecutorFragment(Types._Listingressrulesresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listingressrulesresponse__Resource = new ExecutorFragment(Types._Listingressrulesresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listinstancesresponse__Entity = new ExecutorFragment(Types._Listinstancesresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listinstancesresponse__Listinstancesresponse = new ExecutorFragment(Types._Listinstancesresponse, AppengineTables.Types._Listinstancesresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listinstancesresponse__OclAny = new ExecutorFragment(Types._Listinstancesresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listinstancesresponse__OclElement = new ExecutorFragment(Types._Listinstancesresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listinstancesresponse__Resource = new ExecutorFragment(Types._Listinstancesresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listlocationsresponse__Entity = new ExecutorFragment(Types._Listlocationsresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listlocationsresponse__Listlocationsresponse = new ExecutorFragment(Types._Listlocationsresponse, AppengineTables.Types._Listlocationsresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listlocationsresponse__OclAny = new ExecutorFragment(Types._Listlocationsresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listlocationsresponse__OclElement = new ExecutorFragment(Types._Listlocationsresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listlocationsresponse__Resource = new ExecutorFragment(Types._Listlocationsresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listoperationsresponse__Entity = new ExecutorFragment(Types._Listoperationsresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listoperationsresponse__Listoperationsresponse = new ExecutorFragment(Types._Listoperationsresponse, AppengineTables.Types._Listoperationsresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listoperationsresponse__OclAny = new ExecutorFragment(Types._Listoperationsresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listoperationsresponse__OclElement = new ExecutorFragment(Types._Listoperationsresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listoperationsresponse__Resource = new ExecutorFragment(Types._Listoperationsresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listservicesresponse__Entity = new ExecutorFragment(Types._Listservicesresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listservicesresponse__Listservicesresponse = new ExecutorFragment(Types._Listservicesresponse, AppengineTables.Types._Listservicesresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listservicesresponse__OclAny = new ExecutorFragment(Types._Listservicesresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listservicesresponse__OclElement = new ExecutorFragment(Types._Listservicesresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listservicesresponse__Resource = new ExecutorFragment(Types._Listservicesresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Listversionsresponse__Entity = new ExecutorFragment(Types._Listversionsresponse, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Listversionsresponse__Listversionsresponse = new ExecutorFragment(Types._Listversionsresponse, AppengineTables.Types._Listversionsresponse);
		private static final /*@NonNull*/ ExecutorFragment _Listversionsresponse__OclAny = new ExecutorFragment(Types._Listversionsresponse, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Listversionsresponse__OclElement = new ExecutorFragment(Types._Listversionsresponse, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Listversionsresponse__Resource = new ExecutorFragment(Types._Listversionsresponse, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Livenesscheck__Entity = new ExecutorFragment(Types._Livenesscheck, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Livenesscheck__Livenesscheck = new ExecutorFragment(Types._Livenesscheck, AppengineTables.Types._Livenesscheck);
		private static final /*@NonNull*/ ExecutorFragment _Livenesscheck__OclAny = new ExecutorFragment(Types._Livenesscheck, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Livenesscheck__OclElement = new ExecutorFragment(Types._Livenesscheck, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Livenesscheck__Resource = new ExecutorFragment(Types._Livenesscheck, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Livenesschecklink__Entity = new ExecutorFragment(Types._Livenesschecklink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Livenesschecklink__Link = new ExecutorFragment(Types._Livenesschecklink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Livenesschecklink__Livenesschecklink = new ExecutorFragment(Types._Livenesschecklink, AppengineTables.Types._Livenesschecklink);
		private static final /*@NonNull*/ ExecutorFragment _Livenesschecklink__OclAny = new ExecutorFragment(Types._Livenesschecklink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Livenesschecklink__OclElement = new ExecutorFragment(Types._Livenesschecklink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Location__Entity = new ExecutorFragment(Types._Location, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, AppengineTables.Types._Location);
		private static final /*@NonNull*/ ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Location__Resource = new ExecutorFragment(Types._Location, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Locationmetadata__Entity = new ExecutorFragment(Types._Locationmetadata, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Locationmetadata__Locationmetadata = new ExecutorFragment(Types._Locationmetadata, AppengineTables.Types._Locationmetadata);
		private static final /*@NonNull*/ ExecutorFragment _Locationmetadata__OclAny = new ExecutorFragment(Types._Locationmetadata, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Locationmetadata__OclElement = new ExecutorFragment(Types._Locationmetadata, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Locationmetadata__Resource = new ExecutorFragment(Types._Locationmetadata, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Login__Login = new ExecutorFragment(Types._Login, AppengineTables.Types._Login);
		private static final /*@NonNull*/ ExecutorFragment _Login__OclAny = new ExecutorFragment(Types._Login, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Login__OclElement = new ExecutorFragment(Types._Login, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Login__OclEnumeration = new ExecutorFragment(Types._Login, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Login__OclType = new ExecutorFragment(Types._Login, OCLstdlibTables.Types._OclType);

		private static final /*@NonNull*/ ExecutorFragment _Manualscaling__Entity = new ExecutorFragment(Types._Manualscaling, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Manualscaling__Manualscaling = new ExecutorFragment(Types._Manualscaling, AppengineTables.Types._Manualscaling);
		private static final /*@NonNull*/ ExecutorFragment _Manualscaling__OclAny = new ExecutorFragment(Types._Manualscaling, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manualscaling__OclElement = new ExecutorFragment(Types._Manualscaling, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Manualscaling__Resource = new ExecutorFragment(Types._Manualscaling, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Manualscalinglink__Entity = new ExecutorFragment(Types._Manualscalinglink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalinglink__Link = new ExecutorFragment(Types._Manualscalinglink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalinglink__Manualscalinglink = new ExecutorFragment(Types._Manualscalinglink, AppengineTables.Types._Manualscalinglink);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalinglink__OclAny = new ExecutorFragment(Types._Manualscalinglink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Manualscalinglink__OclElement = new ExecutorFragment(Types._Manualscalinglink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Network__Entity = new ExecutorFragment(Types._Network, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Network__Network = new ExecutorFragment(Types._Network, AppengineTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclAny = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Network__OclElement = new ExecutorFragment(Types._Network, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Network__Resource = new ExecutorFragment(Types._Network, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Networklink__Entity = new ExecutorFragment(Types._Networklink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__Link = new ExecutorFragment(Types._Networklink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__Networklink = new ExecutorFragment(Types._Networklink, AppengineTables.Types._Networklink);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__OclAny = new ExecutorFragment(Types._Networklink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networklink__OclElement = new ExecutorFragment(Types._Networklink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Networkutilization__Entity = new ExecutorFragment(Types._Networkutilization, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilization__Networkutilization = new ExecutorFragment(Types._Networkutilization, AppengineTables.Types._Networkutilization);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilization__OclAny = new ExecutorFragment(Types._Networkutilization, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilization__OclElement = new ExecutorFragment(Types._Networkutilization, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilization__Resource = new ExecutorFragment(Types._Networkutilization, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Networkutilizationlink__Entity = new ExecutorFragment(Types._Networkutilizationlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilizationlink__Link = new ExecutorFragment(Types._Networkutilizationlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilizationlink__Networkutilizationlink = new ExecutorFragment(Types._Networkutilizationlink, AppengineTables.Types._Networkutilizationlink);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilizationlink__OclAny = new ExecutorFragment(Types._Networkutilizationlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networkutilizationlink__OclElement = new ExecutorFragment(Types._Networkutilizationlink, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Operation__Entity = new ExecutorFragment(Types._Operation, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, AppengineTables.Types._Operation);
		private static final /*@NonNull*/ ExecutorFragment _Operation__Resource = new ExecutorFragment(Types._Operation, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Operationmetadata__Entity = new ExecutorFragment(Types._Operationmetadata, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadata__OclAny = new ExecutorFragment(Types._Operationmetadata, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadata__OclElement = new ExecutorFragment(Types._Operationmetadata, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadata__Operationmetadata = new ExecutorFragment(Types._Operationmetadata, AppengineTables.Types._Operationmetadata);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadata__Resource = new ExecutorFragment(Types._Operationmetadata, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Operationmetadataexperimental__Entity = new ExecutorFragment(Types._Operationmetadataexperimental, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadataexperimental__OclAny = new ExecutorFragment(Types._Operationmetadataexperimental, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadataexperimental__OclElement = new ExecutorFragment(Types._Operationmetadataexperimental, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadataexperimental__Operationmetadataexperimental = new ExecutorFragment(Types._Operationmetadataexperimental, AppengineTables.Types._Operationmetadataexperimental);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadataexperimental__Resource = new ExecutorFragment(Types._Operationmetadataexperimental, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1__Entity = new ExecutorFragment(Types._Operationmetadatav1, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1__OclAny = new ExecutorFragment(Types._Operationmetadatav1, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1__OclElement = new ExecutorFragment(Types._Operationmetadatav1, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1__Operationmetadatav1 = new ExecutorFragment(Types._Operationmetadatav1, AppengineTables.Types._Operationmetadatav1);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1__Resource = new ExecutorFragment(Types._Operationmetadatav1, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1alpha__Entity = new ExecutorFragment(Types._Operationmetadatav1alpha, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1alpha__OclAny = new ExecutorFragment(Types._Operationmetadatav1alpha, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1alpha__OclElement = new ExecutorFragment(Types._Operationmetadatav1alpha, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1alpha__Operationmetadatav1alpha = new ExecutorFragment(Types._Operationmetadatav1alpha, AppengineTables.Types._Operationmetadatav1alpha);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1alpha__Resource = new ExecutorFragment(Types._Operationmetadatav1alpha, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta__Entity = new ExecutorFragment(Types._Operationmetadatav1beta, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta__OclAny = new ExecutorFragment(Types._Operationmetadatav1beta, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta__OclElement = new ExecutorFragment(Types._Operationmetadatav1beta, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta__Operationmetadatav1beta = new ExecutorFragment(Types._Operationmetadatav1beta, AppengineTables.Types._Operationmetadatav1beta);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta__Resource = new ExecutorFragment(Types._Operationmetadatav1beta, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta5__Entity = new ExecutorFragment(Types._Operationmetadatav1beta5, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta5__OclAny = new ExecutorFragment(Types._Operationmetadatav1beta5, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta5__OclElement = new ExecutorFragment(Types._Operationmetadatav1beta5, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta5__Operationmetadatav1beta5 = new ExecutorFragment(Types._Operationmetadatav1beta5, AppengineTables.Types._Operationmetadatav1beta5);
		private static final /*@NonNull*/ ExecutorFragment _Operationmetadatav1beta5__Resource = new ExecutorFragment(Types._Operationmetadatav1beta5, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Readinesscheck__Entity = new ExecutorFragment(Types._Readinesscheck, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Readinesscheck__OclAny = new ExecutorFragment(Types._Readinesscheck, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Readinesscheck__OclElement = new ExecutorFragment(Types._Readinesscheck, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Readinesscheck__Readinesscheck = new ExecutorFragment(Types._Readinesscheck, AppengineTables.Types._Readinesscheck);
		private static final /*@NonNull*/ ExecutorFragment _Readinesscheck__Resource = new ExecutorFragment(Types._Readinesscheck, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Readinesschecklink__Entity = new ExecutorFragment(Types._Readinesschecklink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Readinesschecklink__Link = new ExecutorFragment(Types._Readinesschecklink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Readinesschecklink__OclAny = new ExecutorFragment(Types._Readinesschecklink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Readinesschecklink__OclElement = new ExecutorFragment(Types._Readinesschecklink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Readinesschecklink__Readinesschecklink = new ExecutorFragment(Types._Readinesschecklink, AppengineTables.Types._Readinesschecklink);

		private static final /*@NonNull*/ ExecutorFragment _Redirecthttpresponsecode__OclAny = new ExecutorFragment(Types._Redirecthttpresponsecode, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Redirecthttpresponsecode__OclElement = new ExecutorFragment(Types._Redirecthttpresponsecode, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Redirecthttpresponsecode__OclEnumeration = new ExecutorFragment(Types._Redirecthttpresponsecode, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Redirecthttpresponsecode__OclType = new ExecutorFragment(Types._Redirecthttpresponsecode, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Redirecthttpresponsecode__Redirecthttpresponsecode = new ExecutorFragment(Types._Redirecthttpresponsecode, AppengineTables.Types._Redirecthttpresponsecode);

		private static final /*@NonNull*/ ExecutorFragment _Repairapplicationrequest__Entity = new ExecutorFragment(Types._Repairapplicationrequest, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Repairapplicationrequest__OclAny = new ExecutorFragment(Types._Repairapplicationrequest, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Repairapplicationrequest__OclElement = new ExecutorFragment(Types._Repairapplicationrequest, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Repairapplicationrequest__Repairapplicationrequest = new ExecutorFragment(Types._Repairapplicationrequest, AppengineTables.Types._Repairapplicationrequest);
		private static final /*@NonNull*/ ExecutorFragment _Repairapplicationrequest__Resource = new ExecutorFragment(Types._Repairapplicationrequest, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Requestutilization__Entity = new ExecutorFragment(Types._Requestutilization, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilization__OclAny = new ExecutorFragment(Types._Requestutilization, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilization__OclElement = new ExecutorFragment(Types._Requestutilization, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilization__Requestutilization = new ExecutorFragment(Types._Requestutilization, AppengineTables.Types._Requestutilization);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilization__Resource = new ExecutorFragment(Types._Requestutilization, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Requestutilizationlink__Entity = new ExecutorFragment(Types._Requestutilizationlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilizationlink__Link = new ExecutorFragment(Types._Requestutilizationlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilizationlink__OclAny = new ExecutorFragment(Types._Requestutilizationlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilizationlink__OclElement = new ExecutorFragment(Types._Requestutilizationlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Requestutilizationlink__Requestutilizationlink = new ExecutorFragment(Types._Requestutilizationlink, AppengineTables.Types._Requestutilizationlink);

		private static final /*@NonNull*/ ExecutorFragment _Resourcerecord__Entity = new ExecutorFragment(Types._Resourcerecord, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Resourcerecord__OclAny = new ExecutorFragment(Types._Resourcerecord, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Resourcerecord__OclElement = new ExecutorFragment(Types._Resourcerecord, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Resourcerecord__Resource = new ExecutorFragment(Types._Resourcerecord, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Resourcerecord__Resourcerecord = new ExecutorFragment(Types._Resourcerecord, AppengineTables.Types._Resourcerecord);

		private static final /*@NonNull*/ ExecutorFragment _Resources__Entity = new ExecutorFragment(Types._Resources, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Resources__OclAny = new ExecutorFragment(Types._Resources, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Resources__OclElement = new ExecutorFragment(Types._Resources, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Resources__Resource = new ExecutorFragment(Types._Resources, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Resources__Resources = new ExecutorFragment(Types._Resources, AppengineTables.Types._Resources);

		private static final /*@NonNull*/ ExecutorFragment _Resourceslink__Entity = new ExecutorFragment(Types._Resourceslink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Resourceslink__Link = new ExecutorFragment(Types._Resourceslink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Resourceslink__OclAny = new ExecutorFragment(Types._Resourceslink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Resourceslink__OclElement = new ExecutorFragment(Types._Resourceslink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Resourceslink__Resourceslink = new ExecutorFragment(Types._Resourceslink, AppengineTables.Types._Resourceslink);

		private static final /*@NonNull*/ ExecutorFragment _Scripthandler__Entity = new ExecutorFragment(Types._Scripthandler, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandler__OclAny = new ExecutorFragment(Types._Scripthandler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandler__OclElement = new ExecutorFragment(Types._Scripthandler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandler__Resource = new ExecutorFragment(Types._Scripthandler, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandler__Scripthandler = new ExecutorFragment(Types._Scripthandler, AppengineTables.Types._Scripthandler);

		private static final /*@NonNull*/ ExecutorFragment _Scripthandlerlink__Entity = new ExecutorFragment(Types._Scripthandlerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandlerlink__Link = new ExecutorFragment(Types._Scripthandlerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandlerlink__OclAny = new ExecutorFragment(Types._Scripthandlerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandlerlink__OclElement = new ExecutorFragment(Types._Scripthandlerlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Scripthandlerlink__Scripthandlerlink = new ExecutorFragment(Types._Scripthandlerlink, AppengineTables.Types._Scripthandlerlink);

		private static final /*@NonNull*/ ExecutorFragment _Securitylevel__OclAny = new ExecutorFragment(Types._Securitylevel, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Securitylevel__OclElement = new ExecutorFragment(Types._Securitylevel, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Securitylevel__OclEnumeration = new ExecutorFragment(Types._Securitylevel, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Securitylevel__OclType = new ExecutorFragment(Types._Securitylevel, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Securitylevel__Securitylevel = new ExecutorFragment(Types._Securitylevel, AppengineTables.Types._Securitylevel);

		private static final /*@NonNull*/ ExecutorFragment _Service__Entity = new ExecutorFragment(Types._Service, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Service__OclAny = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Service__OclElement = new ExecutorFragment(Types._Service, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Service__Resource = new ExecutorFragment(Types._Service, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Service__Service = new ExecutorFragment(Types._Service, AppengineTables.Types._Service);

		private static final /*@NonNull*/ ExecutorFragment _Servingstatus__OclAny = new ExecutorFragment(Types._Servingstatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Servingstatus__OclElement = new ExecutorFragment(Types._Servingstatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Servingstatus__OclEnumeration = new ExecutorFragment(Types._Servingstatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Servingstatus__OclType = new ExecutorFragment(Types._Servingstatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Servingstatus__Servingstatus = new ExecutorFragment(Types._Servingstatus, AppengineTables.Types._Servingstatus);

		private static final /*@NonNull*/ ExecutorFragment _Shardby__OclAny = new ExecutorFragment(Types._Shardby, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Shardby__OclElement = new ExecutorFragment(Types._Shardby, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Shardby__OclEnumeration = new ExecutorFragment(Types._Shardby, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Shardby__OclType = new ExecutorFragment(Types._Shardby, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Shardby__Shardby = new ExecutorFragment(Types._Shardby, AppengineTables.Types._Shardby);

		private static final /*@NonNull*/ ExecutorFragment _Sslsettings__Entity = new ExecutorFragment(Types._Sslsettings, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettings__OclAny = new ExecutorFragment(Types._Sslsettings, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettings__OclElement = new ExecutorFragment(Types._Sslsettings, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettings__Resource = new ExecutorFragment(Types._Sslsettings, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettings__Sslsettings = new ExecutorFragment(Types._Sslsettings, AppengineTables.Types._Sslsettings);

		private static final /*@NonNull*/ ExecutorFragment _Sslsettingslink__Entity = new ExecutorFragment(Types._Sslsettingslink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettingslink__Link = new ExecutorFragment(Types._Sslsettingslink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettingslink__OclAny = new ExecutorFragment(Types._Sslsettingslink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettingslink__OclElement = new ExecutorFragment(Types._Sslsettingslink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sslsettingslink__Sslsettingslink = new ExecutorFragment(Types._Sslsettingslink, AppengineTables.Types._Sslsettingslink);

		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandler__Entity = new ExecutorFragment(Types._Staticfileshandler, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandler__OclAny = new ExecutorFragment(Types._Staticfileshandler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandler__OclElement = new ExecutorFragment(Types._Staticfileshandler, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandler__Resource = new ExecutorFragment(Types._Staticfileshandler, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandler__Staticfileshandler = new ExecutorFragment(Types._Staticfileshandler, AppengineTables.Types._Staticfileshandler);

		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandlerlink__Entity = new ExecutorFragment(Types._Staticfileshandlerlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandlerlink__Link = new ExecutorFragment(Types._Staticfileshandlerlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandlerlink__OclAny = new ExecutorFragment(Types._Staticfileshandlerlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandlerlink__OclElement = new ExecutorFragment(Types._Staticfileshandlerlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Staticfileshandlerlink__Staticfileshandlerlink = new ExecutorFragment(Types._Staticfileshandlerlink, AppengineTables.Types._Staticfileshandlerlink);

		private static final /*@NonNull*/ ExecutorFragment _Status__Entity = new ExecutorFragment(Types._Status, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Status__OclAny = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Status__OclElement = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Status__Resource = new ExecutorFragment(Types._Status, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Status__Status = new ExecutorFragment(Types._Status, AppengineTables.Types._Status);

		private static final /*@NonNull*/ ExecutorFragment _Statuslink__Entity = new ExecutorFragment(Types._Statuslink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Statuslink__Link = new ExecutorFragment(Types._Statuslink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Statuslink__OclAny = new ExecutorFragment(Types._Statuslink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Statuslink__OclElement = new ExecutorFragment(Types._Statuslink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Statuslink__Statuslink = new ExecutorFragment(Types._Statuslink, AppengineTables.Types._Statuslink);

		private static final /*@NonNull*/ ExecutorFragment _Trafficsplit__Entity = new ExecutorFragment(Types._Trafficsplit, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplit__OclAny = new ExecutorFragment(Types._Trafficsplit, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplit__OclElement = new ExecutorFragment(Types._Trafficsplit, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplit__Resource = new ExecutorFragment(Types._Trafficsplit, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplit__Trafficsplit = new ExecutorFragment(Types._Trafficsplit, AppengineTables.Types._Trafficsplit);

		private static final /*@NonNull*/ ExecutorFragment _Trafficsplitlink__Entity = new ExecutorFragment(Types._Trafficsplitlink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplitlink__Link = new ExecutorFragment(Types._Trafficsplitlink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplitlink__OclAny = new ExecutorFragment(Types._Trafficsplitlink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplitlink__OclElement = new ExecutorFragment(Types._Trafficsplitlink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Trafficsplitlink__Trafficsplitlink = new ExecutorFragment(Types._Trafficsplitlink, AppengineTables.Types._Trafficsplitlink);

		private static final /*@NonNull*/ ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclEnumeration = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _Type__OclType = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, AppengineTables.Types._Type);

		private static final /*@NonNull*/ ExecutorFragment _Urldispatchrule__Entity = new ExecutorFragment(Types._Urldispatchrule, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Urldispatchrule__OclAny = new ExecutorFragment(Types._Urldispatchrule, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Urldispatchrule__OclElement = new ExecutorFragment(Types._Urldispatchrule, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Urldispatchrule__Resource = new ExecutorFragment(Types._Urldispatchrule, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Urldispatchrule__Urldispatchrule = new ExecutorFragment(Types._Urldispatchrule, AppengineTables.Types._Urldispatchrule);

		private static final /*@NonNull*/ ExecutorFragment _Urlmap__Entity = new ExecutorFragment(Types._Urlmap, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Urlmap__OclAny = new ExecutorFragment(Types._Urlmap, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Urlmap__OclElement = new ExecutorFragment(Types._Urlmap, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Urlmap__Resource = new ExecutorFragment(Types._Urlmap, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Urlmap__Urlmap = new ExecutorFragment(Types._Urlmap, AppengineTables.Types._Urlmap);

		private static final /*@NonNull*/ ExecutorFragment _Version__Entity = new ExecutorFragment(Types._Version, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Version__OclAny = new ExecutorFragment(Types._Version, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Version__OclElement = new ExecutorFragment(Types._Version, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Version__Resource = new ExecutorFragment(Types._Version, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Version__Version = new ExecutorFragment(Types._Version, AppengineTables.Types._Version);

		private static final /*@NonNull*/ ExecutorFragment _VersionServingstatus__OclAny = new ExecutorFragment(Types._VersionServingstatus, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VersionServingstatus__OclElement = new ExecutorFragment(Types._VersionServingstatus, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _VersionServingstatus__OclEnumeration = new ExecutorFragment(Types._VersionServingstatus, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _VersionServingstatus__OclType = new ExecutorFragment(Types._VersionServingstatus, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _VersionServingstatus__VersionServingstatus = new ExecutorFragment(Types._VersionServingstatus, AppengineTables.Types._VersionServingstatus);

		private static final /*@NonNull*/ ExecutorFragment _Volume__Entity = new ExecutorFragment(Types._Volume, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Volume__OclAny = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Volume__OclElement = new ExecutorFragment(Types._Volume, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Volume__Resource = new ExecutorFragment(Types._Volume, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Volume__Volume = new ExecutorFragment(Types._Volume, AppengineTables.Types._Volume);

		private static final /*@NonNull*/ ExecutorFragment _Zipinfo__Entity = new ExecutorFragment(Types._Zipinfo, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfo__OclAny = new ExecutorFragment(Types._Zipinfo, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfo__OclElement = new ExecutorFragment(Types._Zipinfo, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfo__Resource = new ExecutorFragment(Types._Zipinfo, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfo__Zipinfo = new ExecutorFragment(Types._Zipinfo, AppengineTables.Types._Zipinfo);

		private static final /*@NonNull*/ ExecutorFragment _Zipinfolink__Entity = new ExecutorFragment(Types._Zipinfolink, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfolink__Link = new ExecutorFragment(Types._Zipinfolink, OCCITables.Types._Link);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfolink__OclAny = new ExecutorFragment(Types._Zipinfolink, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfolink__OclElement = new ExecutorFragment(Types._Zipinfolink, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Zipinfolink__Zipinfolink = new ExecutorFragment(Types._Zipinfolink, AppengineTables.Types._Zipinfolink);

		private static final /*@NonNull*/ ExecutorFragment _any__OclAny = new ExecutorFragment(Types._any, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _any__any = new ExecutorFragment(Types._any, AppengineTables.Types._any);

		private static final /*@NonNull*/ ExecutorFragment _array__OclAny = new ExecutorFragment(Types._array, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _array__OclElement = new ExecutorFragment(Types._array, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _array__array = new ExecutorFragment(Types._array, AppengineTables.Types._array);

		private static final /*@NonNull*/ ExecutorFragment _byte__OclAny = new ExecutorFragment(Types._byte, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _byte__byte = new ExecutorFragment(Types._byte, AppengineTables.Types._byte);

		private static final /*@NonNull*/ ExecutorFragment _double__OclAny = new ExecutorFragment(Types._double, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _double__double = new ExecutorFragment(Types._double, AppengineTables.Types._double);

		private static final /*@NonNull*/ ExecutorFragment _float__OclAny = new ExecutorFragment(Types._float, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _float__float = new ExecutorFragment(Types._float, AppengineTables.Types._float);

		private static final /*@NonNull*/ ExecutorFragment _long__OclAny = new ExecutorFragment(Types._long, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _long__long = new ExecutorFragment(Types._long, AppengineTables.Types._long);

		private static final /*@NonNull*/ ExecutorFragment _map__OclAny = new ExecutorFragment(Types._map, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _map__map = new ExecutorFragment(Types._map, AppengineTables.Types._map);

		private static final /*@NonNull*/ ExecutorFragment _object__OclAny = new ExecutorFragment(Types._object, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _object__object = new ExecutorFragment(Types._object, AppengineTables.Types._object);

		private static final /*@NonNull*/ ExecutorFragment _short__OclAny = new ExecutorFragment(Types._short, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _short__short = new ExecutorFragment(Types._short, AppengineTables.Types._short);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final /*@NonNull*/ ParameterTypes _Integer___String___String___String = TypeUtil.createParameterTypes(OCCITables.Types._Integer, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _Integer___String___String___String___String = TypeUtil.createParameterTypes(OCCITables.Types._Integer, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String = TypeUtil.createParameterTypes(OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___String = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___String___Integer = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _String___String___Integer___String = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._Integer, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___String___String = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___String___String___Boolean = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._Boolean);
		public static final /*@NonNull*/ ParameterTypes _String___String___String___Integer = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._Integer);
		public static final /*@NonNull*/ ParameterTypes _String___String___String___Integer___String = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._Integer, OCCITables.Types._String);
		public static final /*@NonNull*/ ParameterTypes _String___String___String___String = TypeUtil.createParameterTypes(OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String, OCCITables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Application__create = new ExecutorOperation("create", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Application,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Application__get = new ExecutorOperation("get", Parameters._String, Types._Application,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Application__patch = new ExecutorOperation("patch", Parameters._String___String, Types._Application,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Application__repair = new ExecutorOperation("repair", Parameters._String, Types._Application,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Authorizedcertificate__create = new ExecutorOperation("create", Parameters._String, Types._Authorizedcertificate,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Authorizedcertificate__delete = new ExecutorOperation("delete", Parameters._String___String, Types._Authorizedcertificate,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Authorizedcertificate__get = new ExecutorOperation("get", Parameters._String___String___String, Types._Authorizedcertificate,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Authorizedcertificate__list = new ExecutorOperation("list", Parameters._String___String___Integer___String, Types._Authorizedcertificate,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Authorizedcertificate__patch = new ExecutorOperation("patch", Parameters._String___String___String, Types._Authorizedcertificate,
			4, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Authorizeddomain__list = new ExecutorOperation("list", Parameters._String___String___Integer, Types._Authorizeddomain,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Domainmapping__create = new ExecutorOperation("create", Parameters._String, Types._Domainmapping,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Domainmapping__delete = new ExecutorOperation("delete", Parameters._String___String, Types._Domainmapping,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Domainmapping__get = new ExecutorOperation("get", Parameters._String___String, Types._Domainmapping,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Domainmapping__list = new ExecutorOperation("list", Parameters._String___String___Integer, Types._Domainmapping,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Domainmapping__patch = new ExecutorOperation("patch", Parameters._String___String___String, Types._Domainmapping,
			4, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Firewallrule__batchupdate = new ExecutorOperation("batchupdate", Parameters._String, Types._Firewallrule,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Firewallrule__create = new ExecutorOperation("create", Parameters._String, Types._Firewallrule,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Firewallrule__delete = new ExecutorOperation("delete", Parameters._String___String, Types._Firewallrule,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Firewallrule__get = new ExecutorOperation("get", Parameters._String___String, Types._Firewallrule,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Firewallrule__list = new ExecutorOperation("list", Parameters._Integer___String___String___String, Types._Firewallrule,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Firewallrule__patch = new ExecutorOperation("patch", Parameters._String___String___String, Types._Firewallrule,
			5, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Instance__debug = new ExecutorOperation("debug", Parameters._String___String___String___String, Types._Instance,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Instance__delete = new ExecutorOperation("delete", Parameters._String___String___String___String, Types._Instance,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Instance__get = new ExecutorOperation("get", Parameters._String___String___String___String, Types._Instance,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Instance__list = new ExecutorOperation("list", Parameters._String___String___String___Integer___String, Types._Instance,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Location__get = new ExecutorOperation("get", Parameters._String___String, Types._Location,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Location__list = new ExecutorOperation("list", Parameters._Integer___String___String___String, Types._Location,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Operation__get = new ExecutorOperation("get", Parameters._String___String, Types._Operation,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Operation__list = new ExecutorOperation("list", Parameters._String___String___String___Integer, Types._Operation,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Service__delete = new ExecutorOperation("delete", Parameters._String___String, Types._Service,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Service__get = new ExecutorOperation("get", Parameters._String___String, Types._Service,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Service__list = new ExecutorOperation("list", Parameters._String___String___Integer, Types._Service,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Service__patch = new ExecutorOperation("patch", Parameters._String___String___String___Boolean, Types._Service,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Version__create = new ExecutorOperation("create", Parameters._String___String, Types._Version,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Version__delete = new ExecutorOperation("delete", Parameters._String___String___String, Types._Version,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Version__get = new ExecutorOperation("get", Parameters._String___String___String___String, Types._Version,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Version__list = new ExecutorOperation("list", Parameters._Integer___String___String___String___String, Types._Version,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Version__patch = new ExecutorOperation("patch", Parameters._String___String___String___String, Types._Version,
			4, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Apiconfighandler__authFailAction = new EcoreExecutorProperty(AppenginePackage.Literals.APICONFIGHANDLER__AUTH_FAIL_ACTION, Types._Apiconfighandler, 0);
		public static final /*@NonNull*/ ExecutorProperty _Apiconfighandler__login = new EcoreExecutorProperty(AppenginePackage.Literals.APICONFIGHANDLER__LOGIN, Types._Apiconfighandler, 1);
		public static final /*@NonNull*/ ExecutorProperty _Apiconfighandler__script = new EcoreExecutorProperty(AppenginePackage.Literals.APICONFIGHANDLER__SCRIPT, Types._Apiconfighandler, 2);
		public static final /*@NonNull*/ ExecutorProperty _Apiconfighandler__securityLevel = new EcoreExecutorProperty(AppenginePackage.Literals.APICONFIGHANDLER__SECURITY_LEVEL, Types._Apiconfighandler, 3);
		public static final /*@NonNull*/ ExecutorProperty _Apiconfighandler__url = new EcoreExecutorProperty(AppenginePackage.Literals.APICONFIGHANDLER__URL, Types._Apiconfighandler, 4);

		public static final /*@NonNull*/ ExecutorProperty _Apiendpointhandler__scriptPath = new EcoreExecutorProperty(AppenginePackage.Literals.APIENDPOINTHANDLER__SCRIPT_PATH, Types._Apiendpointhandler, 0);

		public static final /*@NonNull*/ ExecutorProperty _Application__authDomain = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__AUTH_DOMAIN, Types._Application, 0);
		public static final /*@NonNull*/ ExecutorProperty _Application__codeBucket = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__CODE_BUCKET, Types._Application, 1);
		public static final /*@NonNull*/ ExecutorProperty _Application__defaultBucket = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__DEFAULT_BUCKET, Types._Application, 2);
		public static final /*@NonNull*/ ExecutorProperty _Application__defaultCookieExpiration = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__DEFAULT_COOKIE_EXPIRATION, Types._Application, 3);
		public static final /*@NonNull*/ ExecutorProperty _Application__defaultHostname = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__DEFAULT_HOSTNAME, Types._Application, 4);
		public static final /*@NonNull*/ ExecutorProperty _Application__dispatchRules = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__DISPATCH_RULES, Types._Application, 5);
		public static final /*@NonNull*/ ExecutorProperty _Application__gcrDomain = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__GCR_DOMAIN, Types._Application, 6);
		public static final /*@NonNull*/ ExecutorProperty _Application__locationId = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__LOCATION_ID, Types._Application, 7);
		public static final /*@NonNull*/ ExecutorProperty _Application__name = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__NAME, Types._Application, 8);
		public static final /*@NonNull*/ ExecutorProperty _Application__servingStatus = new EcoreExecutorProperty(AppenginePackage.Literals.APPLICATION__SERVING_STATUS, Types._Application, 9);

		public static final /*@NonNull*/ ExecutorProperty _Authorizedcertificate__displayName = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__DISPLAY_NAME, Types._Authorizedcertificate, 0);
		public static final /*@NonNull*/ ExecutorProperty _Authorizedcertificate__domainMappingsCount = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT, Types._Authorizedcertificate, 1);
		public static final /*@NonNull*/ ExecutorProperty _Authorizedcertificate__domainNames = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES, Types._Authorizedcertificate, 2);
		public static final /*@NonNull*/ ExecutorProperty _Authorizedcertificate__expireTime = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__EXPIRE_TIME, Types._Authorizedcertificate, 3);
		public static final /*@NonNull*/ ExecutorProperty _Authorizedcertificate__name = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__NAME, Types._Authorizedcertificate, 4);
		public static final /*@NonNull*/ ExecutorProperty _Authorizedcertificate__visibleDomainMappings = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS, Types._Authorizedcertificate, 5);

		public static final /*@NonNull*/ ExecutorProperty _Authorizeddomain__name = new EcoreExecutorProperty(AppenginePackage.Literals.AUTHORIZEDDOMAIN__NAME, Types._Authorizeddomain, 0);

		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__coolDownPeriod = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__COOL_DOWN_PERIOD, Types._Automaticscaling, 0);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__maxConcurrentRequests = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS, Types._Automaticscaling, 1);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__maxIdleInstances = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MAX_IDLE_INSTANCES, Types._Automaticscaling, 2);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__maxPendingLatency = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MAX_PENDING_LATENCY, Types._Automaticscaling, 3);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__maxTotalInstances = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MAX_TOTAL_INSTANCES, Types._Automaticscaling, 4);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__minIdleInstances = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MIN_IDLE_INSTANCES, Types._Automaticscaling, 5);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__minPendingLatency = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MIN_PENDING_LATENCY, Types._Automaticscaling, 6);
		public static final /*@NonNull*/ ExecutorProperty _Automaticscaling__minTotalInstances = new EcoreExecutorProperty(AppenginePackage.Literals.AUTOMATICSCALING__MIN_TOTAL_INSTANCES, Types._Automaticscaling, 7);

		public static final /*@NonNull*/ ExecutorProperty _Basicscaling__idleTimeout = new EcoreExecutorProperty(AppenginePackage.Literals.BASICSCALING__IDLE_TIMEOUT, Types._Basicscaling, 0);
		public static final /*@NonNull*/ ExecutorProperty _Basicscaling__maxInstances = new EcoreExecutorProperty(AppenginePackage.Literals.BASICSCALING__MAX_INSTANCES, Types._Basicscaling, 1);

		public static final /*@NonNull*/ ExecutorProperty _Batchupdateingressrulesrequest__ingressRules = new EcoreExecutorProperty(AppenginePackage.Literals.BATCHUPDATEINGRESSRULESREQUEST__INGRESS_RULES, Types._Batchupdateingressrulesrequest, 0);

		public static final /*@NonNull*/ ExecutorProperty _Batchupdateingressrulesresponse__ingressRules = new EcoreExecutorProperty(AppenginePackage.Literals.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES, Types._Batchupdateingressrulesresponse, 0);

		public static final /*@NonNull*/ ExecutorProperty _Certificaterawdata__privateKey = new EcoreExecutorProperty(AppenginePackage.Literals.CERTIFICATERAWDATA__PRIVATE_KEY, Types._Certificaterawdata, 0);
		public static final /*@NonNull*/ ExecutorProperty _Certificaterawdata__publicCertificate = new EcoreExecutorProperty(AppenginePackage.Literals.CERTIFICATERAWDATA__PUBLIC_CERTIFICATE, Types._Certificaterawdata, 1);

		public static final /*@NonNull*/ ExecutorProperty _Containerinfo__image = new EcoreExecutorProperty(AppenginePackage.Literals.CONTAINERINFO__IMAGE, Types._Containerinfo, 0);

		public static final /*@NonNull*/ ExecutorProperty _Cpuutilization__aggregationWindowLength = new EcoreExecutorProperty(AppenginePackage.Literals.CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH, Types._Cpuutilization, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cpuutilization__targetUtilization = new EcoreExecutorProperty(AppenginePackage.Literals.CPUUTILIZATION__TARGET_UTILIZATION, Types._Cpuutilization, 1);

		public static final /*@NonNull*/ ExecutorProperty _Debuginstancerequest__sshKey = new EcoreExecutorProperty(AppenginePackage.Literals.DEBUGINSTANCEREQUEST__SSH_KEY, Types._Debuginstancerequest, 0);

		public static final /*@NonNull*/ ExecutorProperty _Deployment__files = new EcoreExecutorProperty(AppenginePackage.Literals.DEPLOYMENT__FILES, Types._Deployment, 0);

		public static final /*@NonNull*/ ExecutorProperty _Diskutilization__targetReadBytesPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND, Types._Diskutilization, 0);
		public static final /*@NonNull*/ ExecutorProperty _Diskutilization__targetReadOpsPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND, Types._Diskutilization, 1);
		public static final /*@NonNull*/ ExecutorProperty _Diskutilization__targetWriteBytesPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND, Types._Diskutilization, 2);
		public static final /*@NonNull*/ ExecutorProperty _Diskutilization__targetWriteOpsPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND, Types._Diskutilization, 3);

		public static final /*@NonNull*/ ExecutorProperty _Domainmapping__name = new EcoreExecutorProperty(AppenginePackage.Literals.DOMAINMAPPING__NAME, Types._Domainmapping, 0);
		public static final /*@NonNull*/ ExecutorProperty _Domainmapping__resourceRecords = new EcoreExecutorProperty(AppenginePackage.Literals.DOMAINMAPPING__RESOURCE_RECORDS, Types._Domainmapping, 1);

		public static final /*@NonNull*/ ExecutorProperty _Endpointsapiservice__configId = new EcoreExecutorProperty(AppenginePackage.Literals.ENDPOINTSAPISERVICE__CONFIG_ID, Types._Endpointsapiservice, 0);
		public static final /*@NonNull*/ ExecutorProperty _Endpointsapiservice__name = new EcoreExecutorProperty(AppenginePackage.Literals.ENDPOINTSAPISERVICE__NAME, Types._Endpointsapiservice, 1);

		public static final /*@NonNull*/ ExecutorProperty _Errorhandler__errorCode = new EcoreExecutorProperty(AppenginePackage.Literals.ERRORHANDLER__ERROR_CODE, Types._Errorhandler, 0);
		public static final /*@NonNull*/ ExecutorProperty _Errorhandler__mimeType = new EcoreExecutorProperty(AppenginePackage.Literals.ERRORHANDLER__MIME_TYPE, Types._Errorhandler, 1);
		public static final /*@NonNull*/ ExecutorProperty _Errorhandler__staticFile = new EcoreExecutorProperty(AppenginePackage.Literals.ERRORHANDLER__STATIC_FILE, Types._Errorhandler, 2);

		public static final /*@NonNull*/ ExecutorProperty _Featuresettings__splitHealthChecks = new EcoreExecutorProperty(AppenginePackage.Literals.FEATURESETTINGS__SPLIT_HEALTH_CHECKS, Types._Featuresettings, 0);

		public static final /*@NonNull*/ ExecutorProperty _Fileinfo__mimeType = new EcoreExecutorProperty(AppenginePackage.Literals.FILEINFO__MIME_TYPE, Types._Fileinfo, 0);
		public static final /*@NonNull*/ ExecutorProperty _Fileinfo__sha1Sum = new EcoreExecutorProperty(AppenginePackage.Literals.FILEINFO__SHA1_SUM, Types._Fileinfo, 1);
		public static final /*@NonNull*/ ExecutorProperty _Fileinfo__sourceUrl = new EcoreExecutorProperty(AppenginePackage.Literals.FILEINFO__SOURCE_URL, Types._Fileinfo, 2);

		public static final /*@NonNull*/ ExecutorProperty _Firewallrule__action = new EcoreExecutorProperty(AppenginePackage.Literals.FIREWALLRULE__ACTION, Types._Firewallrule, 0);
		public static final /*@NonNull*/ ExecutorProperty _Firewallrule__description = new EcoreExecutorProperty(AppenginePackage.Literals.FIREWALLRULE__DESCRIPTION, Types._Firewallrule, 1);
		public static final /*@NonNull*/ ExecutorProperty _Firewallrule__priority = new EcoreExecutorProperty(AppenginePackage.Literals.FIREWALLRULE__PRIORITY, Types._Firewallrule, 2);
		public static final /*@NonNull*/ ExecutorProperty _Firewallrule__sourceRange = new EcoreExecutorProperty(AppenginePackage.Literals.FIREWALLRULE__SOURCE_RANGE, Types._Firewallrule, 3);

		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__checkInterval = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__CHECK_INTERVAL, Types._Healthcheck, 0);
		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__disableHealthCheck = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__DISABLE_HEALTH_CHECK, Types._Healthcheck, 1);
		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__healthyThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__HEALTHY_THRESHOLD, Types._Healthcheck, 2);
		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__host = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__HOST, Types._Healthcheck, 3);
		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__restartThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__RESTART_THRESHOLD, Types._Healthcheck, 4);
		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__timeout = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__TIMEOUT, Types._Healthcheck, 5);
		public static final /*@NonNull*/ ExecutorProperty _Healthcheck__unhealthyThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.HEALTHCHECK__UNHEALTHY_THRESHOLD, Types._Healthcheck, 6);

		public static final /*@NonNull*/ ExecutorProperty _Identityawareproxy__enabled = new EcoreExecutorProperty(AppenginePackage.Literals.IDENTITYAWAREPROXY__ENABLED, Types._Identityawareproxy, 0);
		public static final /*@NonNull*/ ExecutorProperty _Identityawareproxy__oauth2ClientId = new EcoreExecutorProperty(AppenginePackage.Literals.IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID, Types._Identityawareproxy, 1);
		public static final /*@NonNull*/ ExecutorProperty _Identityawareproxy__oauth2ClientSecret = new EcoreExecutorProperty(AppenginePackage.Literals.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET, Types._Identityawareproxy, 2);
		public static final /*@NonNull*/ ExecutorProperty _Identityawareproxy__oauth2ClientSecretSha256 = new EcoreExecutorProperty(AppenginePackage.Literals.IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256, Types._Identityawareproxy, 3);

		public static final /*@NonNull*/ ExecutorProperty _Instance__appEngineRelease = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__APP_ENGINE_RELEASE, Types._Instance, 0);
		public static final /*@NonNull*/ ExecutorProperty _Instance__availability = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__AVAILABILITY, Types._Instance, 1);
		public static final /*@NonNull*/ ExecutorProperty _Instance__averageLatency = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__AVERAGE_LATENCY, Types._Instance, 2);
		public static final /*@NonNull*/ ExecutorProperty _Instance__errors = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__ERRORS, Types._Instance, 3);
		public static final /*@NonNull*/ ExecutorProperty _Instance__memoryUsage = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__MEMORY_USAGE, Types._Instance, 4);
		public static final /*@NonNull*/ ExecutorProperty _Instance__name = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__NAME, Types._Instance, 5);
		public static final /*@NonNull*/ ExecutorProperty _Instance__qps = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__QPS, Types._Instance, 6);
		public static final /*@NonNull*/ ExecutorProperty _Instance__requests = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__REQUESTS, Types._Instance, 7);
		public static final /*@NonNull*/ ExecutorProperty _Instance__startTime = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__START_TIME, Types._Instance, 8);
		public static final /*@NonNull*/ ExecutorProperty _Instance__vmDebugEnabled = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__VM_DEBUG_ENABLED, Types._Instance, 9);
		public static final /*@NonNull*/ ExecutorProperty _Instance__vmId = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__VM_ID, Types._Instance, 10);
		public static final /*@NonNull*/ ExecutorProperty _Instance__vmIp = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__VM_IP, Types._Instance, 11);
		public static final /*@NonNull*/ ExecutorProperty _Instance__vmName = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__VM_NAME, Types._Instance, 12);
		public static final /*@NonNull*/ ExecutorProperty _Instance__vmStatus = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__VM_STATUS, Types._Instance, 13);
		public static final /*@NonNull*/ ExecutorProperty _Instance__vmZoneName = new EcoreExecutorProperty(AppenginePackage.Literals.INSTANCE__VM_ZONE_NAME, Types._Instance, 14);

		public static final /*@NonNull*/ ExecutorProperty _Library__name = new EcoreExecutorProperty(AppenginePackage.Literals.LIBRARY__NAME, Types._Library, 0);
		public static final /*@NonNull*/ ExecutorProperty _Library__version = new EcoreExecutorProperty(AppenginePackage.Literals.LIBRARY__VERSION, Types._Library, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listauthorizedcertificatesresponse__certificates = new EcoreExecutorProperty(AppenginePackage.Literals.LISTAUTHORIZEDCERTIFICATESRESPONSE__CERTIFICATES, Types._Listauthorizedcertificatesresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listauthorizedcertificatesresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTAUTHORIZEDCERTIFICATESRESPONSE__NEXT_PAGE_TOKEN, Types._Listauthorizedcertificatesresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listauthorizeddomainsresponse__domains = new EcoreExecutorProperty(AppenginePackage.Literals.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS, Types._Listauthorizeddomainsresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listauthorizeddomainsresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN, Types._Listauthorizeddomainsresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listdomainmappingsresponse__domainMappings = new EcoreExecutorProperty(AppenginePackage.Literals.LISTDOMAINMAPPINGSRESPONSE__DOMAIN_MAPPINGS, Types._Listdomainmappingsresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listdomainmappingsresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTDOMAINMAPPINGSRESPONSE__NEXT_PAGE_TOKEN, Types._Listdomainmappingsresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listingressrulesresponse__ingressRules = new EcoreExecutorProperty(AppenginePackage.Literals.LISTINGRESSRULESRESPONSE__INGRESS_RULES, Types._Listingressrulesresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listingressrulesresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN, Types._Listingressrulesresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listinstancesresponse__instances = new EcoreExecutorProperty(AppenginePackage.Literals.LISTINSTANCESRESPONSE__INSTANCES, Types._Listinstancesresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listinstancesresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN, Types._Listinstancesresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listlocationsresponse__locations = new EcoreExecutorProperty(AppenginePackage.Literals.LISTLOCATIONSRESPONSE__LOCATIONS, Types._Listlocationsresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listlocationsresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN, Types._Listlocationsresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listoperationsresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTOPERATIONSRESPONSE__NEXT_PAGE_TOKEN, Types._Listoperationsresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listoperationsresponse__operations = new EcoreExecutorProperty(AppenginePackage.Literals.LISTOPERATIONSRESPONSE__OPERATIONS, Types._Listoperationsresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listservicesresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTSERVICESRESPONSE__NEXT_PAGE_TOKEN, Types._Listservicesresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listservicesresponse__services = new EcoreExecutorProperty(AppenginePackage.Literals.LISTSERVICESRESPONSE__SERVICES, Types._Listservicesresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Listversionsresponse__nextPageToken = new EcoreExecutorProperty(AppenginePackage.Literals.LISTVERSIONSRESPONSE__NEXT_PAGE_TOKEN, Types._Listversionsresponse, 0);
		public static final /*@NonNull*/ ExecutorProperty _Listversionsresponse__versions = new EcoreExecutorProperty(AppenginePackage.Literals.LISTVERSIONSRESPONSE__VERSIONS, Types._Listversionsresponse, 1);

		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__checkInterval = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__CHECK_INTERVAL, Types._Livenesscheck, 0);
		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__failureThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__FAILURE_THRESHOLD, Types._Livenesscheck, 1);
		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__host = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__HOST, Types._Livenesscheck, 2);
		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__initialDelay = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__INITIAL_DELAY, Types._Livenesscheck, 3);
		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__path = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__PATH, Types._Livenesscheck, 4);
		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__successThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__SUCCESS_THRESHOLD, Types._Livenesscheck, 5);
		public static final /*@NonNull*/ ExecutorProperty _Livenesscheck__timeout = new EcoreExecutorProperty(AppenginePackage.Literals.LIVENESSCHECK__TIMEOUT, Types._Livenesscheck, 6);

		public static final /*@NonNull*/ ExecutorProperty _Location__labels = new EcoreExecutorProperty(AppenginePackage.Literals.LOCATION__LABELS, Types._Location, 0);
		public static final /*@NonNull*/ ExecutorProperty _Location__locationId = new EcoreExecutorProperty(AppenginePackage.Literals.LOCATION__LOCATION_ID, Types._Location, 1);
		public static final /*@NonNull*/ ExecutorProperty _Location__metadata = new EcoreExecutorProperty(AppenginePackage.Literals.LOCATION__METADATA, Types._Location, 2);
		public static final /*@NonNull*/ ExecutorProperty _Location__name = new EcoreExecutorProperty(AppenginePackage.Literals.LOCATION__NAME, Types._Location, 3);

		public static final /*@NonNull*/ ExecutorProperty _Locationmetadata__flexibleEnvironmentAvailable = new EcoreExecutorProperty(AppenginePackage.Literals.LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE, Types._Locationmetadata, 0);
		public static final /*@NonNull*/ ExecutorProperty _Locationmetadata__standardEnvironmentAvailable = new EcoreExecutorProperty(AppenginePackage.Literals.LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE, Types._Locationmetadata, 1);

		public static final /*@NonNull*/ ExecutorProperty _Manualscaling__instances = new EcoreExecutorProperty(AppenginePackage.Literals.MANUALSCALING__INSTANCES, Types._Manualscaling, 0);

		public static final /*@NonNull*/ ExecutorProperty _Network__forwardedPorts = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORK__FORWARDED_PORTS, Types._Network, 0);
		public static final /*@NonNull*/ ExecutorProperty _Network__instanceTag = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORK__INSTANCE_TAG, Types._Network, 1);
		public static final /*@NonNull*/ ExecutorProperty _Network__name = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORK__NAME, Types._Network, 2);
		public static final /*@NonNull*/ ExecutorProperty _Network__subnetworkName = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORK__SUBNETWORK_NAME, Types._Network, 3);

		public static final /*@NonNull*/ ExecutorProperty _Networkutilization__targetReceivedBytesPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND, Types._Networkutilization, 0);
		public static final /*@NonNull*/ ExecutorProperty _Networkutilization__targetReceivedPacketsPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND, Types._Networkutilization, 1);
		public static final /*@NonNull*/ ExecutorProperty _Networkutilization__targetSentBytesPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND, Types._Networkutilization, 2);
		public static final /*@NonNull*/ ExecutorProperty _Networkutilization__targetSentPacketsPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND, Types._Networkutilization, 3);

		public static final /*@NonNull*/ ExecutorProperty _Operation__done = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATION__DONE, Types._Operation, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operation__metadata = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATION__METADATA, Types._Operation, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operation__name = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATION__NAME, Types._Operation, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operation__response = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATION__RESPONSE, Types._Operation, 3);

		public static final /*@NonNull*/ ExecutorProperty _Operationmetadata__endTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATA__END_TIME, Types._Operationmetadata, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadata__insertTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATA__INSERT_TIME, Types._Operationmetadata, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadata__method = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATA__METHOD, Types._Operationmetadata, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadata__operationType = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATA__OPERATION_TYPE, Types._Operationmetadata, 3);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadata__target = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATA__TARGET, Types._Operationmetadata, 4);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadata__user = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATA__USER, Types._Operationmetadata, 5);

		public static final /*@NonNull*/ ExecutorProperty _Operationmetadataexperimental__endTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAEXPERIMENTAL__END_TIME, Types._Operationmetadataexperimental, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadataexperimental__insertTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME, Types._Operationmetadataexperimental, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadataexperimental__method = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAEXPERIMENTAL__METHOD, Types._Operationmetadataexperimental, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadataexperimental__target = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAEXPERIMENTAL__TARGET, Types._Operationmetadataexperimental, 3);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadataexperimental__user = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAEXPERIMENTAL__USER, Types._Operationmetadataexperimental, 4);

		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__endTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__END_TIME, Types._Operationmetadatav1, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__ephemeralMessage = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__EPHEMERAL_MESSAGE, Types._Operationmetadatav1, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__insertTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__INSERT_TIME, Types._Operationmetadatav1, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__method = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__METHOD, Types._Operationmetadatav1, 3);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__target = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__TARGET, Types._Operationmetadatav1, 4);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__user = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__USER, Types._Operationmetadatav1, 5);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1__warning = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__WARNING, Types._Operationmetadatav1, 6);

		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__endTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__END_TIME, Types._Operationmetadatav1alpha, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__ephemeralMessage = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__EPHEMERAL_MESSAGE, Types._Operationmetadatav1alpha, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__insertTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__INSERT_TIME, Types._Operationmetadatav1alpha, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__method = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__METHOD, Types._Operationmetadatav1alpha, 3);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__target = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__TARGET, Types._Operationmetadatav1alpha, 4);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__user = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__USER, Types._Operationmetadatav1alpha, 5);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1alpha__warning = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__WARNING, Types._Operationmetadatav1alpha, 6);

		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__endTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__END_TIME, Types._Operationmetadatav1beta, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__ephemeralMessage = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__EPHEMERAL_MESSAGE, Types._Operationmetadatav1beta, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__insertTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__INSERT_TIME, Types._Operationmetadatav1beta, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__method = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__METHOD, Types._Operationmetadatav1beta, 3);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__target = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__TARGET, Types._Operationmetadatav1beta, 4);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__user = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__USER, Types._Operationmetadatav1beta, 5);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta__warning = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__WARNING, Types._Operationmetadatav1beta, 6);

		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta5__endTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA5__END_TIME, Types._Operationmetadatav1beta5, 0);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta5__insertTime = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA5__INSERT_TIME, Types._Operationmetadatav1beta5, 1);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta5__method = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA5__METHOD, Types._Operationmetadatav1beta5, 2);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta5__target = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA5__TARGET, Types._Operationmetadatav1beta5, 3);
		public static final /*@NonNull*/ ExecutorProperty _Operationmetadatav1beta5__user = new EcoreExecutorProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA5__USER, Types._Operationmetadatav1beta5, 4);

		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__appStartTimeout = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__APP_START_TIMEOUT, Types._Readinesscheck, 0);
		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__checkInterval = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__CHECK_INTERVAL, Types._Readinesscheck, 1);
		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__failureThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__FAILURE_THRESHOLD, Types._Readinesscheck, 2);
		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__host = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__HOST, Types._Readinesscheck, 3);
		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__path = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__PATH, Types._Readinesscheck, 4);
		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__successThreshold = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__SUCCESS_THRESHOLD, Types._Readinesscheck, 5);
		public static final /*@NonNull*/ ExecutorProperty _Readinesscheck__timeout = new EcoreExecutorProperty(AppenginePackage.Literals.READINESSCHECK__TIMEOUT, Types._Readinesscheck, 6);

		public static final /*@NonNull*/ ExecutorProperty _Requestutilization__targetConcurrentRequests = new EcoreExecutorProperty(AppenginePackage.Literals.REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS, Types._Requestutilization, 0);
		public static final /*@NonNull*/ ExecutorProperty _Requestutilization__targetRequestCountPerSecond = new EcoreExecutorProperty(AppenginePackage.Literals.REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND, Types._Requestutilization, 1);

		public static final /*@NonNull*/ ExecutorProperty _Resourcerecord__name = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCERECORD__NAME, Types._Resourcerecord, 0);
		public static final /*@NonNull*/ ExecutorProperty _Resourcerecord__rrdata = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCERECORD__RRDATA, Types._Resourcerecord, 1);
		public static final /*@NonNull*/ ExecutorProperty _Resourcerecord__type = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCERECORD__TYPE, Types._Resourcerecord, 2);

		public static final /*@NonNull*/ ExecutorProperty _Resources__cpu = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCES__CPU, Types._Resources, 0);
		public static final /*@NonNull*/ ExecutorProperty _Resources__diskGb = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCES__DISK_GB, Types._Resources, 1);
		public static final /*@NonNull*/ ExecutorProperty _Resources__memoryGb = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCES__MEMORY_GB, Types._Resources, 2);
		public static final /*@NonNull*/ ExecutorProperty _Resources__volumes = new EcoreExecutorProperty(AppenginePackage.Literals.RESOURCES__VOLUMES, Types._Resources, 3);

		public static final /*@NonNull*/ ExecutorProperty _Scripthandler__scriptPath = new EcoreExecutorProperty(AppenginePackage.Literals.SCRIPTHANDLER__SCRIPT_PATH, Types._Scripthandler, 0);

		public static final /*@NonNull*/ ExecutorProperty _Service__name = new EcoreExecutorProperty(AppenginePackage.Literals.SERVICE__NAME, Types._Service, 0);

		public static final /*@NonNull*/ ExecutorProperty _Sslsettings__certificateId = new EcoreExecutorProperty(AppenginePackage.Literals.SSLSETTINGS__CERTIFICATE_ID, Types._Sslsettings, 0);

		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__applicationReadable = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__APPLICATION_READABLE, Types._Staticfileshandler, 0);
		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__expiration = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__EXPIRATION, Types._Staticfileshandler, 1);
		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__httpHeaders = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__HTTP_HEADERS, Types._Staticfileshandler, 2);
		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__mimeType = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__MIME_TYPE, Types._Staticfileshandler, 3);
		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__path = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__PATH, Types._Staticfileshandler, 4);
		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__requireMatchingFile = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__REQUIRE_MATCHING_FILE, Types._Staticfileshandler, 5);
		public static final /*@NonNull*/ ExecutorProperty _Staticfileshandler__uploadPathRegex = new EcoreExecutorProperty(AppenginePackage.Literals.STATICFILESHANDLER__UPLOAD_PATH_REGEX, Types._Staticfileshandler, 6);

		public static final /*@NonNull*/ ExecutorProperty _Status__code = new EcoreExecutorProperty(AppenginePackage.Literals.STATUS__CODE, Types._Status, 0);
		public static final /*@NonNull*/ ExecutorProperty _Status__details = new EcoreExecutorProperty(AppenginePackage.Literals.STATUS__DETAILS, Types._Status, 1);
		public static final /*@NonNull*/ ExecutorProperty _Status__message = new EcoreExecutorProperty(AppenginePackage.Literals.STATUS__MESSAGE, Types._Status, 2);

		public static final /*@NonNull*/ ExecutorProperty _Trafficsplit__allocations = new EcoreExecutorProperty(AppenginePackage.Literals.TRAFFICSPLIT__ALLOCATIONS, Types._Trafficsplit, 0);
		public static final /*@NonNull*/ ExecutorProperty _Trafficsplit__shardBy = new EcoreExecutorProperty(AppenginePackage.Literals.TRAFFICSPLIT__SHARD_BY, Types._Trafficsplit, 1);

		public static final /*@NonNull*/ ExecutorProperty _Urldispatchrule__domain = new EcoreExecutorProperty(AppenginePackage.Literals.URLDISPATCHRULE__DOMAIN, Types._Urldispatchrule, 0);
		public static final /*@NonNull*/ ExecutorProperty _Urldispatchrule__path = new EcoreExecutorProperty(AppenginePackage.Literals.URLDISPATCHRULE__PATH, Types._Urldispatchrule, 1);
		public static final /*@NonNull*/ ExecutorProperty _Urldispatchrule__service = new EcoreExecutorProperty(AppenginePackage.Literals.URLDISPATCHRULE__SERVICE, Types._Urldispatchrule, 2);

		public static final /*@NonNull*/ ExecutorProperty _Urlmap__authFailAction = new EcoreExecutorProperty(AppenginePackage.Literals.URLMAP__AUTH_FAIL_ACTION, Types._Urlmap, 0);
		public static final /*@NonNull*/ ExecutorProperty _Urlmap__login = new EcoreExecutorProperty(AppenginePackage.Literals.URLMAP__LOGIN, Types._Urlmap, 1);
		public static final /*@NonNull*/ ExecutorProperty _Urlmap__redirectHttpResponseCode = new EcoreExecutorProperty(AppenginePackage.Literals.URLMAP__REDIRECT_HTTP_RESPONSE_CODE, Types._Urlmap, 2);
		public static final /*@NonNull*/ ExecutorProperty _Urlmap__securityLevel = new EcoreExecutorProperty(AppenginePackage.Literals.URLMAP__SECURITY_LEVEL, Types._Urlmap, 3);
		public static final /*@NonNull*/ ExecutorProperty _Urlmap__urlRegex = new EcoreExecutorProperty(AppenginePackage.Literals.URLMAP__URL_REGEX, Types._Urlmap, 4);

		public static final /*@NonNull*/ ExecutorProperty _Version__betaSettings = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__BETA_SETTINGS, Types._Version, 0);
		public static final /*@NonNull*/ ExecutorProperty _Version__createTime = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__CREATE_TIME, Types._Version, 1);
		public static final /*@NonNull*/ ExecutorProperty _Version__createdBy = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__CREATED_BY, Types._Version, 2);
		public static final /*@NonNull*/ ExecutorProperty _Version__defaultExpiration = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__DEFAULT_EXPIRATION, Types._Version, 3);
		public static final /*@NonNull*/ ExecutorProperty _Version__diskUsageBytes = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__DISK_USAGE_BYTES, Types._Version, 4);
		public static final /*@NonNull*/ ExecutorProperty _Version__env = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__ENV, Types._Version, 5);
		public static final /*@NonNull*/ ExecutorProperty _Version__envVariables = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__ENV_VARIABLES, Types._Version, 6);
		public static final /*@NonNull*/ ExecutorProperty _Version__errorHandlers = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__ERROR_HANDLERS, Types._Version, 7);
		public static final /*@NonNull*/ ExecutorProperty _Version__handlers = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__HANDLERS, Types._Version, 8);
		public static final /*@NonNull*/ ExecutorProperty _Version__inboundServices = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__INBOUND_SERVICES, Types._Version, 9);
		public static final /*@NonNull*/ ExecutorProperty _Version__instanceClass = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__INSTANCE_CLASS, Types._Version, 10);
		public static final /*@NonNull*/ ExecutorProperty _Version__libraries = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__LIBRARIES, Types._Version, 11);
		public static final /*@NonNull*/ ExecutorProperty _Version__name = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__NAME, Types._Version, 12);
		public static final /*@NonNull*/ ExecutorProperty _Version__nobuildFilesRegex = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__NOBUILD_FILES_REGEX, Types._Version, 13);
		public static final /*@NonNull*/ ExecutorProperty _Version__runtime = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__RUNTIME, Types._Version, 14);
		public static final /*@NonNull*/ ExecutorProperty _Version__runtimeApiVersion = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__RUNTIME_API_VERSION, Types._Version, 15);
		public static final /*@NonNull*/ ExecutorProperty _Version__servingStatus = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__SERVING_STATUS, Types._Version, 16);
		public static final /*@NonNull*/ ExecutorProperty _Version__threadsafe = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__THREADSAFE, Types._Version, 17);
		public static final /*@NonNull*/ ExecutorProperty _Version__versionUrl = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__VERSION_URL, Types._Version, 18);
		public static final /*@NonNull*/ ExecutorProperty _Version__vm = new EcoreExecutorProperty(AppenginePackage.Literals.VERSION__VM, Types._Version, 19);

		public static final /*@NonNull*/ ExecutorProperty _Volume__name = new EcoreExecutorProperty(AppenginePackage.Literals.VOLUME__NAME, Types._Volume, 0);
		public static final /*@NonNull*/ ExecutorProperty _Volume__sizeGb = new EcoreExecutorProperty(AppenginePackage.Literals.VOLUME__SIZE_GB, Types._Volume, 1);
		public static final /*@NonNull*/ ExecutorProperty _Volume__volumeType = new EcoreExecutorProperty(AppenginePackage.Literals.VOLUME__VOLUME_TYPE, Types._Volume, 2);

		public static final /*@NonNull*/ ExecutorProperty _Zipinfo__filesCount = new EcoreExecutorProperty(AppenginePackage.Literals.ZIPINFO__FILES_COUNT, Types._Zipinfo, 0);
		public static final /*@NonNull*/ ExecutorProperty _Zipinfo__sourceUrl = new EcoreExecutorProperty(AppenginePackage.Literals.ZIPINFO__SOURCE_URL, Types._Zipinfo, 1);

		public static final /*@NonNull*/ ExecutorProperty _array__values = new EcoreExecutorProperty(AppenginePackage.Literals.ARRAY__VALUES, Types._array, 0);
		public static final /*@NonNull*/ ExecutorProperty _array__Application__dispatchRules = new ExecutorPropertyWithImplementation("Application", Types._array, 1, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.APPLICATION__DISPATCH_RULES));
		public static final /*@NonNull*/ ExecutorProperty _array__Authorizedcertificate__domainNames = new ExecutorPropertyWithImplementation("Authorizedcertificate", Types._array, 2, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__DOMAIN_NAMES));
		public static final /*@NonNull*/ ExecutorProperty _array__Authorizedcertificate__visibleDomainMappings = new ExecutorPropertyWithImplementation("Authorizedcertificate", Types._array, 3, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS));
		public static final /*@NonNull*/ ExecutorProperty _array__Batchupdateingressrulesrequest__ingressRules = new ExecutorPropertyWithImplementation("Batchupdateingressrulesrequest", Types._array, 4, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.BATCHUPDATEINGRESSRULESREQUEST__INGRESS_RULES));
		public static final /*@NonNull*/ ExecutorProperty _array__Batchupdateingressrulesresponse__ingressRules = new ExecutorPropertyWithImplementation("Batchupdateingressrulesresponse", Types._array, 5, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES));
		public static final /*@NonNull*/ ExecutorProperty _array__Domainmapping__resourceRecords = new ExecutorPropertyWithImplementation("Domainmapping", Types._array, 6, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.DOMAINMAPPING__RESOURCE_RECORDS));
		public static final /*@NonNull*/ ExecutorProperty _array__Listauthorizedcertificatesresponse__certificates = new ExecutorPropertyWithImplementation("Listauthorizedcertificatesresponse", Types._array, 7, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTAUTHORIZEDCERTIFICATESRESPONSE__CERTIFICATES));
		public static final /*@NonNull*/ ExecutorProperty _array__Listauthorizeddomainsresponse__domains = new ExecutorPropertyWithImplementation("Listauthorizeddomainsresponse", Types._array, 8, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS));
		public static final /*@NonNull*/ ExecutorProperty _array__Listdomainmappingsresponse__domainMappings = new ExecutorPropertyWithImplementation("Listdomainmappingsresponse", Types._array, 9, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTDOMAINMAPPINGSRESPONSE__DOMAIN_MAPPINGS));
		public static final /*@NonNull*/ ExecutorProperty _array__Listingressrulesresponse__ingressRules = new ExecutorPropertyWithImplementation("Listingressrulesresponse", Types._array, 10, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTINGRESSRULESRESPONSE__INGRESS_RULES));
		public static final /*@NonNull*/ ExecutorProperty _array__Listinstancesresponse__instances = new ExecutorPropertyWithImplementation("Listinstancesresponse", Types._array, 11, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTINSTANCESRESPONSE__INSTANCES));
		public static final /*@NonNull*/ ExecutorProperty _array__Listlocationsresponse__locations = new ExecutorPropertyWithImplementation("Listlocationsresponse", Types._array, 12, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTLOCATIONSRESPONSE__LOCATIONS));
		public static final /*@NonNull*/ ExecutorProperty _array__Listoperationsresponse__operations = new ExecutorPropertyWithImplementation("Listoperationsresponse", Types._array, 13, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTOPERATIONSRESPONSE__OPERATIONS));
		public static final /*@NonNull*/ ExecutorProperty _array__Listservicesresponse__services = new ExecutorPropertyWithImplementation("Listservicesresponse", Types._array, 14, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTSERVICESRESPONSE__SERVICES));
		public static final /*@NonNull*/ ExecutorProperty _array__Listversionsresponse__versions = new ExecutorPropertyWithImplementation("Listversionsresponse", Types._array, 15, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.LISTVERSIONSRESPONSE__VERSIONS));
		public static final /*@NonNull*/ ExecutorProperty _array__Network__forwardedPorts = new ExecutorPropertyWithImplementation("Network", Types._array, 16, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.NETWORK__FORWARDED_PORTS));
		public static final /*@NonNull*/ ExecutorProperty _array__Operationmetadatav1__warning = new ExecutorPropertyWithImplementation("Operationmetadatav1", Types._array, 17, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.OPERATIONMETADATAV1__WARNING));
		public static final /*@NonNull*/ ExecutorProperty _array__Operationmetadatav1alpha__warning = new ExecutorPropertyWithImplementation("Operationmetadatav1alpha", Types._array, 18, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.OPERATIONMETADATAV1ALPHA__WARNING));
		public static final /*@NonNull*/ ExecutorProperty _array__Operationmetadatav1beta__warning = new ExecutorPropertyWithImplementation("Operationmetadatav1beta", Types._array, 19, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.OPERATIONMETADATAV1BETA__WARNING));
		public static final /*@NonNull*/ ExecutorProperty _array__Resources__volumes = new ExecutorPropertyWithImplementation("Resources", Types._array, 20, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.RESOURCES__VOLUMES));
		public static final /*@NonNull*/ ExecutorProperty _array__Status__details = new ExecutorPropertyWithImplementation("Status", Types._array, 21, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.STATUS__DETAILS));
		public static final /*@NonNull*/ ExecutorProperty _array__Version__errorHandlers = new ExecutorPropertyWithImplementation("Version", Types._array, 22, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.VERSION__ERROR_HANDLERS));
		public static final /*@NonNull*/ ExecutorProperty _array__Version__handlers = new ExecutorPropertyWithImplementation("Version", Types._array, 23, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.VERSION__HANDLERS));
		public static final /*@NonNull*/ ExecutorProperty _array__Version__inboundServices = new ExecutorPropertyWithImplementation("Version", Types._array, 24, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.VERSION__INBOUND_SERVICES));
		public static final /*@NonNull*/ ExecutorProperty _array__Version__libraries = new ExecutorPropertyWithImplementation("Version", Types._array, 25, new EcoreLibraryOppositeProperty(AppenginePackage.Literals.VERSION__LIBRARIES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Action =
		{
			Fragments._Action__OclAny /* 0 */,
			Fragments._Action__OclElement /* 1 */,
			Fragments._Action__OclType /* 2 */,
			Fragments._Action__OclEnumeration /* 3 */,
			Fragments._Action__Action /* 4 */
		};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction =
		{
			Fragments._ApiConfigHandlerAuthfailaction__OclAny /* 0 */,
			Fragments._ApiConfigHandlerAuthfailaction__OclElement /* 1 */,
			Fragments._ApiConfigHandlerAuthfailaction__OclType /* 2 */,
			Fragments._ApiConfigHandlerAuthfailaction__OclEnumeration /* 3 */,
			Fragments._ApiConfigHandlerAuthfailaction__ApiConfigHandlerAuthfailaction /* 4 */
		};
		private static final int /*@NonNull*/ [] __ApiConfigHandlerAuthfailaction = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ApiConfigHandlerLogin =
		{
			Fragments._ApiConfigHandlerLogin__OclAny /* 0 */,
			Fragments._ApiConfigHandlerLogin__OclElement /* 1 */,
			Fragments._ApiConfigHandlerLogin__OclType /* 2 */,
			Fragments._ApiConfigHandlerLogin__OclEnumeration /* 3 */,
			Fragments._ApiConfigHandlerLogin__ApiConfigHandlerLogin /* 4 */
		};
		private static final int /*@NonNull*/ [] __ApiConfigHandlerLogin = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel =
		{
			Fragments._ApiConfigHandlerSecuritylevel__OclAny /* 0 */,
			Fragments._ApiConfigHandlerSecuritylevel__OclElement /* 1 */,
			Fragments._ApiConfigHandlerSecuritylevel__OclType /* 2 */,
			Fragments._ApiConfigHandlerSecuritylevel__OclEnumeration /* 3 */,
			Fragments._ApiConfigHandlerSecuritylevel__ApiConfigHandlerSecuritylevel /* 4 */
		};
		private static final int /*@NonNull*/ [] __ApiConfigHandlerSecuritylevel = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apiconfighandler =
		{
			Fragments._Apiconfighandler__OclAny /* 0 */,
			Fragments._Apiconfighandler__OclElement /* 1 */,
			Fragments._Apiconfighandler__Entity /* 2 */,
			Fragments._Apiconfighandler__Resource /* 3 */,
			Fragments._Apiconfighandler__Apiconfighandler /* 4 */
		};
		private static final int /*@NonNull*/ [] __Apiconfighandler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apiconfighandlerlink =
		{
			Fragments._Apiconfighandlerlink__OclAny /* 0 */,
			Fragments._Apiconfighandlerlink__OclElement /* 1 */,
			Fragments._Apiconfighandlerlink__Entity /* 2 */,
			Fragments._Apiconfighandlerlink__Link /* 3 */,
			Fragments._Apiconfighandlerlink__Apiconfighandlerlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Apiconfighandlerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apiendpointhandler =
		{
			Fragments._Apiendpointhandler__OclAny /* 0 */,
			Fragments._Apiendpointhandler__OclElement /* 1 */,
			Fragments._Apiendpointhandler__Entity /* 2 */,
			Fragments._Apiendpointhandler__Resource /* 3 */,
			Fragments._Apiendpointhandler__Apiendpointhandler /* 4 */
		};
		private static final int /*@NonNull*/ [] __Apiendpointhandler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Apiendpointhandlerlink =
		{
			Fragments._Apiendpointhandlerlink__OclAny /* 0 */,
			Fragments._Apiendpointhandlerlink__OclElement /* 1 */,
			Fragments._Apiendpointhandlerlink__Entity /* 2 */,
			Fragments._Apiendpointhandlerlink__Link /* 3 */,
			Fragments._Apiendpointhandlerlink__Apiendpointhandlerlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Apiendpointhandlerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Application =
		{
			Fragments._Application__OclAny /* 0 */,
			Fragments._Application__OclElement /* 1 */,
			Fragments._Application__Entity /* 2 */,
			Fragments._Application__Resource /* 3 */,
			Fragments._Application__Application /* 4 */
		};
		private static final int /*@NonNull*/ [] __Application = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Authfailaction =
		{
			Fragments._Authfailaction__OclAny /* 0 */,
			Fragments._Authfailaction__OclElement /* 1 */,
			Fragments._Authfailaction__OclType /* 2 */,
			Fragments._Authfailaction__OclEnumeration /* 3 */,
			Fragments._Authfailaction__Authfailaction /* 4 */
		};
		private static final int /*@NonNull*/ [] __Authfailaction = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Authorizedcertificate =
		{
			Fragments._Authorizedcertificate__OclAny /* 0 */,
			Fragments._Authorizedcertificate__OclElement /* 1 */,
			Fragments._Authorizedcertificate__Entity /* 2 */,
			Fragments._Authorizedcertificate__Resource /* 3 */,
			Fragments._Authorizedcertificate__Authorizedcertificate /* 4 */
		};
		private static final int /*@NonNull*/ [] __Authorizedcertificate = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Authorizeddomain =
		{
			Fragments._Authorizeddomain__OclAny /* 0 */,
			Fragments._Authorizeddomain__OclElement /* 1 */,
			Fragments._Authorizeddomain__Entity /* 2 */,
			Fragments._Authorizeddomain__Resource /* 3 */,
			Fragments._Authorizeddomain__Authorizeddomain /* 4 */
		};
		private static final int /*@NonNull*/ [] __Authorizeddomain = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Automaticscaling =
		{
			Fragments._Automaticscaling__OclAny /* 0 */,
			Fragments._Automaticscaling__OclElement /* 1 */,
			Fragments._Automaticscaling__Entity /* 2 */,
			Fragments._Automaticscaling__Resource /* 3 */,
			Fragments._Automaticscaling__Automaticscaling /* 4 */
		};
		private static final int /*@NonNull*/ [] __Automaticscaling = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Automaticscalinglink =
		{
			Fragments._Automaticscalinglink__OclAny /* 0 */,
			Fragments._Automaticscalinglink__OclElement /* 1 */,
			Fragments._Automaticscalinglink__Entity /* 2 */,
			Fragments._Automaticscalinglink__Link /* 3 */,
			Fragments._Automaticscalinglink__Automaticscalinglink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Automaticscalinglink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Availability =
		{
			Fragments._Availability__OclAny /* 0 */,
			Fragments._Availability__OclElement /* 1 */,
			Fragments._Availability__OclType /* 2 */,
			Fragments._Availability__OclEnumeration /* 3 */,
			Fragments._Availability__Availability /* 4 */
		};
		private static final int /*@NonNull*/ [] __Availability = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Basicscaling =
		{
			Fragments._Basicscaling__OclAny /* 0 */,
			Fragments._Basicscaling__OclElement /* 1 */,
			Fragments._Basicscaling__Entity /* 2 */,
			Fragments._Basicscaling__Resource /* 3 */,
			Fragments._Basicscaling__Basicscaling /* 4 */
		};
		private static final int /*@NonNull*/ [] __Basicscaling = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Basicscalinglink =
		{
			Fragments._Basicscalinglink__OclAny /* 0 */,
			Fragments._Basicscalinglink__OclElement /* 1 */,
			Fragments._Basicscalinglink__Entity /* 2 */,
			Fragments._Basicscalinglink__Link /* 3 */,
			Fragments._Basicscalinglink__Basicscalinglink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Basicscalinglink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Batchupdateingressrulesrequest =
		{
			Fragments._Batchupdateingressrulesrequest__OclAny /* 0 */,
			Fragments._Batchupdateingressrulesrequest__OclElement /* 1 */,
			Fragments._Batchupdateingressrulesrequest__Entity /* 2 */,
			Fragments._Batchupdateingressrulesrequest__Resource /* 3 */,
			Fragments._Batchupdateingressrulesrequest__Batchupdateingressrulesrequest /* 4 */
		};
		private static final int /*@NonNull*/ [] __Batchupdateingressrulesrequest = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Batchupdateingressrulesresponse =
		{
			Fragments._Batchupdateingressrulesresponse__OclAny /* 0 */,
			Fragments._Batchupdateingressrulesresponse__OclElement /* 1 */,
			Fragments._Batchupdateingressrulesresponse__Entity /* 2 */,
			Fragments._Batchupdateingressrulesresponse__Resource /* 3 */,
			Fragments._Batchupdateingressrulesresponse__Batchupdateingressrulesresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Batchupdateingressrulesresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Certificaterawdata =
		{
			Fragments._Certificaterawdata__OclAny /* 0 */,
			Fragments._Certificaterawdata__OclElement /* 1 */,
			Fragments._Certificaterawdata__Entity /* 2 */,
			Fragments._Certificaterawdata__Resource /* 3 */,
			Fragments._Certificaterawdata__Certificaterawdata /* 4 */
		};
		private static final int /*@NonNull*/ [] __Certificaterawdata = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Certificaterawdatalink =
		{
			Fragments._Certificaterawdatalink__OclAny /* 0 */,
			Fragments._Certificaterawdatalink__OclElement /* 1 */,
			Fragments._Certificaterawdatalink__Entity /* 2 */,
			Fragments._Certificaterawdatalink__Link /* 3 */,
			Fragments._Certificaterawdatalink__Certificaterawdatalink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Certificaterawdatalink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Containerinfo =
		{
			Fragments._Containerinfo__OclAny /* 0 */,
			Fragments._Containerinfo__OclElement /* 1 */,
			Fragments._Containerinfo__Entity /* 2 */,
			Fragments._Containerinfo__Resource /* 3 */,
			Fragments._Containerinfo__Containerinfo /* 4 */
		};
		private static final int /*@NonNull*/ [] __Containerinfo = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Containerinfolink =
		{
			Fragments._Containerinfolink__OclAny /* 0 */,
			Fragments._Containerinfolink__OclElement /* 1 */,
			Fragments._Containerinfolink__Entity /* 2 */,
			Fragments._Containerinfolink__Link /* 3 */,
			Fragments._Containerinfolink__Containerinfolink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Containerinfolink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cpuutilization =
		{
			Fragments._Cpuutilization__OclAny /* 0 */,
			Fragments._Cpuutilization__OclElement /* 1 */,
			Fragments._Cpuutilization__Entity /* 2 */,
			Fragments._Cpuutilization__Resource /* 3 */,
			Fragments._Cpuutilization__Cpuutilization /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cpuutilization = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cpuutilizationlink =
		{
			Fragments._Cpuutilizationlink__OclAny /* 0 */,
			Fragments._Cpuutilizationlink__OclElement /* 1 */,
			Fragments._Cpuutilizationlink__Entity /* 2 */,
			Fragments._Cpuutilizationlink__Link /* 3 */,
			Fragments._Cpuutilizationlink__Cpuutilizationlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Cpuutilizationlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Debuginstancerequest =
		{
			Fragments._Debuginstancerequest__OclAny /* 0 */,
			Fragments._Debuginstancerequest__OclElement /* 1 */,
			Fragments._Debuginstancerequest__Entity /* 2 */,
			Fragments._Debuginstancerequest__Resource /* 3 */,
			Fragments._Debuginstancerequest__Debuginstancerequest /* 4 */
		};
		private static final int /*@NonNull*/ [] __Debuginstancerequest = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Deployment =
		{
			Fragments._Deployment__OclAny /* 0 */,
			Fragments._Deployment__OclElement /* 1 */,
			Fragments._Deployment__Entity /* 2 */,
			Fragments._Deployment__Resource /* 3 */,
			Fragments._Deployment__Deployment /* 4 */
		};
		private static final int /*@NonNull*/ [] __Deployment = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Deploymentlink =
		{
			Fragments._Deploymentlink__OclAny /* 0 */,
			Fragments._Deploymentlink__OclElement /* 1 */,
			Fragments._Deploymentlink__Entity /* 2 */,
			Fragments._Deploymentlink__Link /* 3 */,
			Fragments._Deploymentlink__Deploymentlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Deploymentlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Diskutilization =
		{
			Fragments._Diskutilization__OclAny /* 0 */,
			Fragments._Diskutilization__OclElement /* 1 */,
			Fragments._Diskutilization__Entity /* 2 */,
			Fragments._Diskutilization__Resource /* 3 */,
			Fragments._Diskutilization__Diskutilization /* 4 */
		};
		private static final int /*@NonNull*/ [] __Diskutilization = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Diskutilizationlink =
		{
			Fragments._Diskutilizationlink__OclAny /* 0 */,
			Fragments._Diskutilizationlink__OclElement /* 1 */,
			Fragments._Diskutilizationlink__Entity /* 2 */,
			Fragments._Diskutilizationlink__Link /* 3 */,
			Fragments._Diskutilizationlink__Diskutilizationlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Diskutilizationlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Domainmapping =
		{
			Fragments._Domainmapping__OclAny /* 0 */,
			Fragments._Domainmapping__OclElement /* 1 */,
			Fragments._Domainmapping__Entity /* 2 */,
			Fragments._Domainmapping__Resource /* 3 */,
			Fragments._Domainmapping__Domainmapping /* 4 */
		};
		private static final int /*@NonNull*/ [] __Domainmapping = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Empty =
		{
			Fragments._Empty__OclAny /* 0 */,
			Fragments._Empty__OclElement /* 1 */,
			Fragments._Empty__Entity /* 2 */,
			Fragments._Empty__Resource /* 3 */,
			Fragments._Empty__Empty /* 4 */
		};
		private static final int /*@NonNull*/ [] __Empty = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Endpointsapiservice =
		{
			Fragments._Endpointsapiservice__OclAny /* 0 */,
			Fragments._Endpointsapiservice__OclElement /* 1 */,
			Fragments._Endpointsapiservice__Entity /* 2 */,
			Fragments._Endpointsapiservice__Resource /* 3 */,
			Fragments._Endpointsapiservice__Endpointsapiservice /* 4 */
		};
		private static final int /*@NonNull*/ [] __Endpointsapiservice = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Endpointsapiservicelink =
		{
			Fragments._Endpointsapiservicelink__OclAny /* 0 */,
			Fragments._Endpointsapiservicelink__OclElement /* 1 */,
			Fragments._Endpointsapiservicelink__Entity /* 2 */,
			Fragments._Endpointsapiservicelink__Link /* 3 */,
			Fragments._Endpointsapiservicelink__Endpointsapiservicelink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Endpointsapiservicelink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Errorcode =
		{
			Fragments._Errorcode__OclAny /* 0 */,
			Fragments._Errorcode__OclElement /* 1 */,
			Fragments._Errorcode__OclType /* 2 */,
			Fragments._Errorcode__OclEnumeration /* 3 */,
			Fragments._Errorcode__Errorcode /* 4 */
		};
		private static final int /*@NonNull*/ [] __Errorcode = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Errorhandler =
		{
			Fragments._Errorhandler__OclAny /* 0 */,
			Fragments._Errorhandler__OclElement /* 1 */,
			Fragments._Errorhandler__Entity /* 2 */,
			Fragments._Errorhandler__Resource /* 3 */,
			Fragments._Errorhandler__Errorhandler /* 4 */
		};
		private static final int /*@NonNull*/ [] __Errorhandler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Featuresettings =
		{
			Fragments._Featuresettings__OclAny /* 0 */,
			Fragments._Featuresettings__OclElement /* 1 */,
			Fragments._Featuresettings__Entity /* 2 */,
			Fragments._Featuresettings__Resource /* 3 */,
			Fragments._Featuresettings__Featuresettings /* 4 */
		};
		private static final int /*@NonNull*/ [] __Featuresettings = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Featuresettingslink =
		{
			Fragments._Featuresettingslink__OclAny /* 0 */,
			Fragments._Featuresettingslink__OclElement /* 1 */,
			Fragments._Featuresettingslink__Entity /* 2 */,
			Fragments._Featuresettingslink__Link /* 3 */,
			Fragments._Featuresettingslink__Featuresettingslink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Featuresettingslink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Fileinfo =
		{
			Fragments._Fileinfo__OclAny /* 0 */,
			Fragments._Fileinfo__OclElement /* 1 */,
			Fragments._Fileinfo__Entity /* 2 */,
			Fragments._Fileinfo__Resource /* 3 */,
			Fragments._Fileinfo__Fileinfo /* 4 */
		};
		private static final int /*@NonNull*/ [] __Fileinfo = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Firewallrule =
		{
			Fragments._Firewallrule__OclAny /* 0 */,
			Fragments._Firewallrule__OclElement /* 1 */,
			Fragments._Firewallrule__Entity /* 2 */,
			Fragments._Firewallrule__Resource /* 3 */,
			Fragments._Firewallrule__Firewallrule /* 4 */
		};
		private static final int /*@NonNull*/ [] __Firewallrule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Healthcheck =
		{
			Fragments._Healthcheck__OclAny /* 0 */,
			Fragments._Healthcheck__OclElement /* 1 */,
			Fragments._Healthcheck__Entity /* 2 */,
			Fragments._Healthcheck__Resource /* 3 */,
			Fragments._Healthcheck__Healthcheck /* 4 */
		};
		private static final int /*@NonNull*/ [] __Healthcheck = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Healthchecklink =
		{
			Fragments._Healthchecklink__OclAny /* 0 */,
			Fragments._Healthchecklink__OclElement /* 1 */,
			Fragments._Healthchecklink__Entity /* 2 */,
			Fragments._Healthchecklink__Link /* 3 */,
			Fragments._Healthchecklink__Healthchecklink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Healthchecklink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Identityawareproxy =
		{
			Fragments._Identityawareproxy__OclAny /* 0 */,
			Fragments._Identityawareproxy__OclElement /* 1 */,
			Fragments._Identityawareproxy__Entity /* 2 */,
			Fragments._Identityawareproxy__Resource /* 3 */,
			Fragments._Identityawareproxy__Identityawareproxy /* 4 */
		};
		private static final int /*@NonNull*/ [] __Identityawareproxy = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Identityawareproxylink =
		{
			Fragments._Identityawareproxylink__OclAny /* 0 */,
			Fragments._Identityawareproxylink__OclElement /* 1 */,
			Fragments._Identityawareproxylink__Entity /* 2 */,
			Fragments._Identityawareproxylink__Link /* 3 */,
			Fragments._Identityawareproxylink__Identityawareproxylink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Identityawareproxylink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Instance =
		{
			Fragments._Instance__OclAny /* 0 */,
			Fragments._Instance__OclElement /* 1 */,
			Fragments._Instance__Entity /* 2 */,
			Fragments._Instance__Resource /* 3 */,
			Fragments._Instance__Instance /* 4 */
		};
		private static final int /*@NonNull*/ [] __Instance = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Library =
		{
			Fragments._Library__OclAny /* 0 */,
			Fragments._Library__OclElement /* 1 */,
			Fragments._Library__Entity /* 2 */,
			Fragments._Library__Resource /* 3 */,
			Fragments._Library__Library /* 4 */
		};
		private static final int /*@NonNull*/ [] __Library = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listauthorizedcertificatesresponse =
		{
			Fragments._Listauthorizedcertificatesresponse__OclAny /* 0 */,
			Fragments._Listauthorizedcertificatesresponse__OclElement /* 1 */,
			Fragments._Listauthorizedcertificatesresponse__Entity /* 2 */,
			Fragments._Listauthorizedcertificatesresponse__Resource /* 3 */,
			Fragments._Listauthorizedcertificatesresponse__Listauthorizedcertificatesresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listauthorizedcertificatesresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listauthorizeddomainsresponse =
		{
			Fragments._Listauthorizeddomainsresponse__OclAny /* 0 */,
			Fragments._Listauthorizeddomainsresponse__OclElement /* 1 */,
			Fragments._Listauthorizeddomainsresponse__Entity /* 2 */,
			Fragments._Listauthorizeddomainsresponse__Resource /* 3 */,
			Fragments._Listauthorizeddomainsresponse__Listauthorizeddomainsresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listauthorizeddomainsresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listdomainmappingsresponse =
		{
			Fragments._Listdomainmappingsresponse__OclAny /* 0 */,
			Fragments._Listdomainmappingsresponse__OclElement /* 1 */,
			Fragments._Listdomainmappingsresponse__Entity /* 2 */,
			Fragments._Listdomainmappingsresponse__Resource /* 3 */,
			Fragments._Listdomainmappingsresponse__Listdomainmappingsresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listdomainmappingsresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listingressrulesresponse =
		{
			Fragments._Listingressrulesresponse__OclAny /* 0 */,
			Fragments._Listingressrulesresponse__OclElement /* 1 */,
			Fragments._Listingressrulesresponse__Entity /* 2 */,
			Fragments._Listingressrulesresponse__Resource /* 3 */,
			Fragments._Listingressrulesresponse__Listingressrulesresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listingressrulesresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listinstancesresponse =
		{
			Fragments._Listinstancesresponse__OclAny /* 0 */,
			Fragments._Listinstancesresponse__OclElement /* 1 */,
			Fragments._Listinstancesresponse__Entity /* 2 */,
			Fragments._Listinstancesresponse__Resource /* 3 */,
			Fragments._Listinstancesresponse__Listinstancesresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listinstancesresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listlocationsresponse =
		{
			Fragments._Listlocationsresponse__OclAny /* 0 */,
			Fragments._Listlocationsresponse__OclElement /* 1 */,
			Fragments._Listlocationsresponse__Entity /* 2 */,
			Fragments._Listlocationsresponse__Resource /* 3 */,
			Fragments._Listlocationsresponse__Listlocationsresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listlocationsresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listoperationsresponse =
		{
			Fragments._Listoperationsresponse__OclAny /* 0 */,
			Fragments._Listoperationsresponse__OclElement /* 1 */,
			Fragments._Listoperationsresponse__Entity /* 2 */,
			Fragments._Listoperationsresponse__Resource /* 3 */,
			Fragments._Listoperationsresponse__Listoperationsresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listoperationsresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listservicesresponse =
		{
			Fragments._Listservicesresponse__OclAny /* 0 */,
			Fragments._Listservicesresponse__OclElement /* 1 */,
			Fragments._Listservicesresponse__Entity /* 2 */,
			Fragments._Listservicesresponse__Resource /* 3 */,
			Fragments._Listservicesresponse__Listservicesresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listservicesresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Listversionsresponse =
		{
			Fragments._Listversionsresponse__OclAny /* 0 */,
			Fragments._Listversionsresponse__OclElement /* 1 */,
			Fragments._Listversionsresponse__Entity /* 2 */,
			Fragments._Listversionsresponse__Resource /* 3 */,
			Fragments._Listversionsresponse__Listversionsresponse /* 4 */
		};
		private static final int /*@NonNull*/ [] __Listversionsresponse = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Livenesscheck =
		{
			Fragments._Livenesscheck__OclAny /* 0 */,
			Fragments._Livenesscheck__OclElement /* 1 */,
			Fragments._Livenesscheck__Entity /* 2 */,
			Fragments._Livenesscheck__Resource /* 3 */,
			Fragments._Livenesscheck__Livenesscheck /* 4 */
		};
		private static final int /*@NonNull*/ [] __Livenesscheck = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Livenesschecklink =
		{
			Fragments._Livenesschecklink__OclAny /* 0 */,
			Fragments._Livenesschecklink__OclElement /* 1 */,
			Fragments._Livenesschecklink__Entity /* 2 */,
			Fragments._Livenesschecklink__Link /* 3 */,
			Fragments._Livenesschecklink__Livenesschecklink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Livenesschecklink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Location =
		{
			Fragments._Location__OclAny /* 0 */,
			Fragments._Location__OclElement /* 1 */,
			Fragments._Location__Entity /* 2 */,
			Fragments._Location__Resource /* 3 */,
			Fragments._Location__Location /* 4 */
		};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Locationmetadata =
		{
			Fragments._Locationmetadata__OclAny /* 0 */,
			Fragments._Locationmetadata__OclElement /* 1 */,
			Fragments._Locationmetadata__Entity /* 2 */,
			Fragments._Locationmetadata__Resource /* 3 */,
			Fragments._Locationmetadata__Locationmetadata /* 4 */
		};
		private static final int /*@NonNull*/ [] __Locationmetadata = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Login =
		{
			Fragments._Login__OclAny /* 0 */,
			Fragments._Login__OclElement /* 1 */,
			Fragments._Login__OclType /* 2 */,
			Fragments._Login__OclEnumeration /* 3 */,
			Fragments._Login__Login /* 4 */
		};
		private static final int /*@NonNull*/ [] __Login = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manualscaling =
		{
			Fragments._Manualscaling__OclAny /* 0 */,
			Fragments._Manualscaling__OclElement /* 1 */,
			Fragments._Manualscaling__Entity /* 2 */,
			Fragments._Manualscaling__Resource /* 3 */,
			Fragments._Manualscaling__Manualscaling /* 4 */
		};
		private static final int /*@NonNull*/ [] __Manualscaling = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Manualscalinglink =
		{
			Fragments._Manualscalinglink__OclAny /* 0 */,
			Fragments._Manualscalinglink__OclElement /* 1 */,
			Fragments._Manualscalinglink__Entity /* 2 */,
			Fragments._Manualscalinglink__Link /* 3 */,
			Fragments._Manualscalinglink__Manualscalinglink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Manualscalinglink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Network =
		{
			Fragments._Network__OclAny /* 0 */,
			Fragments._Network__OclElement /* 1 */,
			Fragments._Network__Entity /* 2 */,
			Fragments._Network__Resource /* 3 */,
			Fragments._Network__Network /* 4 */
		};
		private static final int /*@NonNull*/ [] __Network = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networklink =
		{
			Fragments._Networklink__OclAny /* 0 */,
			Fragments._Networklink__OclElement /* 1 */,
			Fragments._Networklink__Entity /* 2 */,
			Fragments._Networklink__Link /* 3 */,
			Fragments._Networklink__Networklink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Networklink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networkutilization =
		{
			Fragments._Networkutilization__OclAny /* 0 */,
			Fragments._Networkutilization__OclElement /* 1 */,
			Fragments._Networkutilization__Entity /* 2 */,
			Fragments._Networkutilization__Resource /* 3 */,
			Fragments._Networkutilization__Networkutilization /* 4 */
		};
		private static final int /*@NonNull*/ [] __Networkutilization = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networkutilizationlink =
		{
			Fragments._Networkutilizationlink__OclAny /* 0 */,
			Fragments._Networkutilizationlink__OclElement /* 1 */,
			Fragments._Networkutilizationlink__Entity /* 2 */,
			Fragments._Networkutilizationlink__Link /* 3 */,
			Fragments._Networkutilizationlink__Networkutilizationlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Networkutilizationlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operation =
		{
			Fragments._Operation__OclAny /* 0 */,
			Fragments._Operation__OclElement /* 1 */,
			Fragments._Operation__Entity /* 2 */,
			Fragments._Operation__Resource /* 3 */,
			Fragments._Operation__Operation /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operation = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operationmetadata =
		{
			Fragments._Operationmetadata__OclAny /* 0 */,
			Fragments._Operationmetadata__OclElement /* 1 */,
			Fragments._Operationmetadata__Entity /* 2 */,
			Fragments._Operationmetadata__Resource /* 3 */,
			Fragments._Operationmetadata__Operationmetadata /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operationmetadata = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operationmetadataexperimental =
		{
			Fragments._Operationmetadataexperimental__OclAny /* 0 */,
			Fragments._Operationmetadataexperimental__OclElement /* 1 */,
			Fragments._Operationmetadataexperimental__Entity /* 2 */,
			Fragments._Operationmetadataexperimental__Resource /* 3 */,
			Fragments._Operationmetadataexperimental__Operationmetadataexperimental /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operationmetadataexperimental = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operationmetadatav1 =
		{
			Fragments._Operationmetadatav1__OclAny /* 0 */,
			Fragments._Operationmetadatav1__OclElement /* 1 */,
			Fragments._Operationmetadatav1__Entity /* 2 */,
			Fragments._Operationmetadatav1__Resource /* 3 */,
			Fragments._Operationmetadatav1__Operationmetadatav1 /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operationmetadatav1 = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operationmetadatav1alpha =
		{
			Fragments._Operationmetadatav1alpha__OclAny /* 0 */,
			Fragments._Operationmetadatav1alpha__OclElement /* 1 */,
			Fragments._Operationmetadatav1alpha__Entity /* 2 */,
			Fragments._Operationmetadatav1alpha__Resource /* 3 */,
			Fragments._Operationmetadatav1alpha__Operationmetadatav1alpha /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operationmetadatav1alpha = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operationmetadatav1beta =
		{
			Fragments._Operationmetadatav1beta__OclAny /* 0 */,
			Fragments._Operationmetadatav1beta__OclElement /* 1 */,
			Fragments._Operationmetadatav1beta__Entity /* 2 */,
			Fragments._Operationmetadatav1beta__Resource /* 3 */,
			Fragments._Operationmetadatav1beta__Operationmetadatav1beta /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operationmetadatav1beta = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Operationmetadatav1beta5 =
		{
			Fragments._Operationmetadatav1beta5__OclAny /* 0 */,
			Fragments._Operationmetadatav1beta5__OclElement /* 1 */,
			Fragments._Operationmetadatav1beta5__Entity /* 2 */,
			Fragments._Operationmetadatav1beta5__Resource /* 3 */,
			Fragments._Operationmetadatav1beta5__Operationmetadatav1beta5 /* 4 */
		};
		private static final int /*@NonNull*/ [] __Operationmetadatav1beta5 = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Readinesscheck =
		{
			Fragments._Readinesscheck__OclAny /* 0 */,
			Fragments._Readinesscheck__OclElement /* 1 */,
			Fragments._Readinesscheck__Entity /* 2 */,
			Fragments._Readinesscheck__Resource /* 3 */,
			Fragments._Readinesscheck__Readinesscheck /* 4 */
		};
		private static final int /*@NonNull*/ [] __Readinesscheck = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Readinesschecklink =
		{
			Fragments._Readinesschecklink__OclAny /* 0 */,
			Fragments._Readinesschecklink__OclElement /* 1 */,
			Fragments._Readinesschecklink__Entity /* 2 */,
			Fragments._Readinesschecklink__Link /* 3 */,
			Fragments._Readinesschecklink__Readinesschecklink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Readinesschecklink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Redirecthttpresponsecode =
		{
			Fragments._Redirecthttpresponsecode__OclAny /* 0 */,
			Fragments._Redirecthttpresponsecode__OclElement /* 1 */,
			Fragments._Redirecthttpresponsecode__OclType /* 2 */,
			Fragments._Redirecthttpresponsecode__OclEnumeration /* 3 */,
			Fragments._Redirecthttpresponsecode__Redirecthttpresponsecode /* 4 */
		};
		private static final int /*@NonNull*/ [] __Redirecthttpresponsecode = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Repairapplicationrequest =
		{
			Fragments._Repairapplicationrequest__OclAny /* 0 */,
			Fragments._Repairapplicationrequest__OclElement /* 1 */,
			Fragments._Repairapplicationrequest__Entity /* 2 */,
			Fragments._Repairapplicationrequest__Resource /* 3 */,
			Fragments._Repairapplicationrequest__Repairapplicationrequest /* 4 */
		};
		private static final int /*@NonNull*/ [] __Repairapplicationrequest = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Requestutilization =
		{
			Fragments._Requestutilization__OclAny /* 0 */,
			Fragments._Requestutilization__OclElement /* 1 */,
			Fragments._Requestutilization__Entity /* 2 */,
			Fragments._Requestutilization__Resource /* 3 */,
			Fragments._Requestutilization__Requestutilization /* 4 */
		};
		private static final int /*@NonNull*/ [] __Requestutilization = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Requestutilizationlink =
		{
			Fragments._Requestutilizationlink__OclAny /* 0 */,
			Fragments._Requestutilizationlink__OclElement /* 1 */,
			Fragments._Requestutilizationlink__Entity /* 2 */,
			Fragments._Requestutilizationlink__Link /* 3 */,
			Fragments._Requestutilizationlink__Requestutilizationlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Requestutilizationlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Resourcerecord =
		{
			Fragments._Resourcerecord__OclAny /* 0 */,
			Fragments._Resourcerecord__OclElement /* 1 */,
			Fragments._Resourcerecord__Entity /* 2 */,
			Fragments._Resourcerecord__Resource /* 3 */,
			Fragments._Resourcerecord__Resourcerecord /* 4 */
		};
		private static final int /*@NonNull*/ [] __Resourcerecord = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Resources =
		{
			Fragments._Resources__OclAny /* 0 */,
			Fragments._Resources__OclElement /* 1 */,
			Fragments._Resources__Entity /* 2 */,
			Fragments._Resources__Resource /* 3 */,
			Fragments._Resources__Resources /* 4 */
		};
		private static final int /*@NonNull*/ [] __Resources = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Resourceslink =
		{
			Fragments._Resourceslink__OclAny /* 0 */,
			Fragments._Resourceslink__OclElement /* 1 */,
			Fragments._Resourceslink__Entity /* 2 */,
			Fragments._Resourceslink__Link /* 3 */,
			Fragments._Resourceslink__Resourceslink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Resourceslink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scripthandler =
		{
			Fragments._Scripthandler__OclAny /* 0 */,
			Fragments._Scripthandler__OclElement /* 1 */,
			Fragments._Scripthandler__Entity /* 2 */,
			Fragments._Scripthandler__Resource /* 3 */,
			Fragments._Scripthandler__Scripthandler /* 4 */
		};
		private static final int /*@NonNull*/ [] __Scripthandler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Scripthandlerlink =
		{
			Fragments._Scripthandlerlink__OclAny /* 0 */,
			Fragments._Scripthandlerlink__OclElement /* 1 */,
			Fragments._Scripthandlerlink__Entity /* 2 */,
			Fragments._Scripthandlerlink__Link /* 3 */,
			Fragments._Scripthandlerlink__Scripthandlerlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Scripthandlerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Securitylevel =
		{
			Fragments._Securitylevel__OclAny /* 0 */,
			Fragments._Securitylevel__OclElement /* 1 */,
			Fragments._Securitylevel__OclType /* 2 */,
			Fragments._Securitylevel__OclEnumeration /* 3 */,
			Fragments._Securitylevel__Securitylevel /* 4 */
		};
		private static final int /*@NonNull*/ [] __Securitylevel = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Service =
		{
			Fragments._Service__OclAny /* 0 */,
			Fragments._Service__OclElement /* 1 */,
			Fragments._Service__Entity /* 2 */,
			Fragments._Service__Resource /* 3 */,
			Fragments._Service__Service /* 4 */
		};
		private static final int /*@NonNull*/ [] __Service = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Servingstatus =
		{
			Fragments._Servingstatus__OclAny /* 0 */,
			Fragments._Servingstatus__OclElement /* 1 */,
			Fragments._Servingstatus__OclType /* 2 */,
			Fragments._Servingstatus__OclEnumeration /* 3 */,
			Fragments._Servingstatus__Servingstatus /* 4 */
		};
		private static final int /*@NonNull*/ [] __Servingstatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Shardby =
		{
			Fragments._Shardby__OclAny /* 0 */,
			Fragments._Shardby__OclElement /* 1 */,
			Fragments._Shardby__OclType /* 2 */,
			Fragments._Shardby__OclEnumeration /* 3 */,
			Fragments._Shardby__Shardby /* 4 */
		};
		private static final int /*@NonNull*/ [] __Shardby = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sslsettings =
		{
			Fragments._Sslsettings__OclAny /* 0 */,
			Fragments._Sslsettings__OclElement /* 1 */,
			Fragments._Sslsettings__Entity /* 2 */,
			Fragments._Sslsettings__Resource /* 3 */,
			Fragments._Sslsettings__Sslsettings /* 4 */
		};
		private static final int /*@NonNull*/ [] __Sslsettings = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sslsettingslink =
		{
			Fragments._Sslsettingslink__OclAny /* 0 */,
			Fragments._Sslsettingslink__OclElement /* 1 */,
			Fragments._Sslsettingslink__Entity /* 2 */,
			Fragments._Sslsettingslink__Link /* 3 */,
			Fragments._Sslsettingslink__Sslsettingslink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Sslsettingslink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Staticfileshandler =
		{
			Fragments._Staticfileshandler__OclAny /* 0 */,
			Fragments._Staticfileshandler__OclElement /* 1 */,
			Fragments._Staticfileshandler__Entity /* 2 */,
			Fragments._Staticfileshandler__Resource /* 3 */,
			Fragments._Staticfileshandler__Staticfileshandler /* 4 */
		};
		private static final int /*@NonNull*/ [] __Staticfileshandler = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Staticfileshandlerlink =
		{
			Fragments._Staticfileshandlerlink__OclAny /* 0 */,
			Fragments._Staticfileshandlerlink__OclElement /* 1 */,
			Fragments._Staticfileshandlerlink__Entity /* 2 */,
			Fragments._Staticfileshandlerlink__Link /* 3 */,
			Fragments._Staticfileshandlerlink__Staticfileshandlerlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Staticfileshandlerlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Status =
		{
			Fragments._Status__OclAny /* 0 */,
			Fragments._Status__OclElement /* 1 */,
			Fragments._Status__Entity /* 2 */,
			Fragments._Status__Resource /* 3 */,
			Fragments._Status__Status /* 4 */
		};
		private static final int /*@NonNull*/ [] __Status = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Statuslink =
		{
			Fragments._Statuslink__OclAny /* 0 */,
			Fragments._Statuslink__OclElement /* 1 */,
			Fragments._Statuslink__Entity /* 2 */,
			Fragments._Statuslink__Link /* 3 */,
			Fragments._Statuslink__Statuslink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Statuslink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Trafficsplit =
		{
			Fragments._Trafficsplit__OclAny /* 0 */,
			Fragments._Trafficsplit__OclElement /* 1 */,
			Fragments._Trafficsplit__Entity /* 2 */,
			Fragments._Trafficsplit__Resource /* 3 */,
			Fragments._Trafficsplit__Trafficsplit /* 4 */
		};
		private static final int /*@NonNull*/ [] __Trafficsplit = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Trafficsplitlink =
		{
			Fragments._Trafficsplitlink__OclAny /* 0 */,
			Fragments._Trafficsplitlink__OclElement /* 1 */,
			Fragments._Trafficsplitlink__Entity /* 2 */,
			Fragments._Trafficsplitlink__Link /* 3 */,
			Fragments._Trafficsplitlink__Trafficsplitlink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Trafficsplitlink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Type =
		{
			Fragments._Type__OclAny /* 0 */,
			Fragments._Type__OclElement /* 1 */,
			Fragments._Type__OclType /* 2 */,
			Fragments._Type__OclEnumeration /* 3 */,
			Fragments._Type__Type /* 4 */
		};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Urldispatchrule =
		{
			Fragments._Urldispatchrule__OclAny /* 0 */,
			Fragments._Urldispatchrule__OclElement /* 1 */,
			Fragments._Urldispatchrule__Entity /* 2 */,
			Fragments._Urldispatchrule__Resource /* 3 */,
			Fragments._Urldispatchrule__Urldispatchrule /* 4 */
		};
		private static final int /*@NonNull*/ [] __Urldispatchrule = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Urlmap =
		{
			Fragments._Urlmap__OclAny /* 0 */,
			Fragments._Urlmap__OclElement /* 1 */,
			Fragments._Urlmap__Entity /* 2 */,
			Fragments._Urlmap__Resource /* 3 */,
			Fragments._Urlmap__Urlmap /* 4 */
		};
		private static final int /*@NonNull*/ [] __Urlmap = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Version =
		{
			Fragments._Version__OclAny /* 0 */,
			Fragments._Version__OclElement /* 1 */,
			Fragments._Version__Entity /* 2 */,
			Fragments._Version__Resource /* 3 */,
			Fragments._Version__Version /* 4 */
		};
		private static final int /*@NonNull*/ [] __Version = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VersionServingstatus =
		{
			Fragments._VersionServingstatus__OclAny /* 0 */,
			Fragments._VersionServingstatus__OclElement /* 1 */,
			Fragments._VersionServingstatus__OclType /* 2 */,
			Fragments._VersionServingstatus__OclEnumeration /* 3 */,
			Fragments._VersionServingstatus__VersionServingstatus /* 4 */
		};
		private static final int /*@NonNull*/ [] __VersionServingstatus = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Volume =
		{
			Fragments._Volume__OclAny /* 0 */,
			Fragments._Volume__OclElement /* 1 */,
			Fragments._Volume__Entity /* 2 */,
			Fragments._Volume__Resource /* 3 */,
			Fragments._Volume__Volume /* 4 */
		};
		private static final int /*@NonNull*/ [] __Volume = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zipinfo =
		{
			Fragments._Zipinfo__OclAny /* 0 */,
			Fragments._Zipinfo__OclElement /* 1 */,
			Fragments._Zipinfo__Entity /* 2 */,
			Fragments._Zipinfo__Resource /* 3 */,
			Fragments._Zipinfo__Zipinfo /* 4 */
		};
		private static final int /*@NonNull*/ [] __Zipinfo = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Zipinfolink =
		{
			Fragments._Zipinfolink__OclAny /* 0 */,
			Fragments._Zipinfolink__OclElement /* 1 */,
			Fragments._Zipinfolink__Entity /* 2 */,
			Fragments._Zipinfolink__Link /* 3 */,
			Fragments._Zipinfolink__Zipinfolink /* 4 */
		};
		private static final int /*@NonNull*/ [] __Zipinfolink = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _any =
		{
			Fragments._any__OclAny /* 0 */,
			Fragments._any__any /* 1 */
		};
		private static final int /*@NonNull*/ [] __any = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _array =
		{
			Fragments._array__OclAny /* 0 */,
			Fragments._array__OclElement /* 1 */,
			Fragments._array__array /* 2 */
		};
		private static final int /*@NonNull*/ [] __array = { 1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _byte =
		{
			Fragments._byte__OclAny /* 0 */,
			Fragments._byte__byte /* 1 */
		};
		private static final int /*@NonNull*/ [] __byte = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _double =
		{
			Fragments._double__OclAny /* 0 */,
			Fragments._double__double /* 1 */
		};
		private static final int /*@NonNull*/ [] __double = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _float =
		{
			Fragments._float__OclAny /* 0 */,
			Fragments._float__float /* 1 */
		};
		private static final int /*@NonNull*/ [] __float = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _long =
		{
			Fragments._long__OclAny /* 0 */,
			Fragments._long__long /* 1 */
		};
		private static final int /*@NonNull*/ [] __long = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _map =
		{
			Fragments._map__OclAny /* 0 */,
			Fragments._map__map /* 1 */
		};
		private static final int /*@NonNull*/ [] __map = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _object =
		{
			Fragments._object__OclAny /* 0 */,
			Fragments._object__object /* 1 */
		};
		private static final int /*@NonNull*/ [] __object = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _short =
		{
			Fragments._short__OclAny /* 0 */,
			Fragments._short__short /* 1 */
		};
		private static final int /*@NonNull*/ [] __short = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._ApiConfigHandlerAuthfailaction.initFragments(_ApiConfigHandlerAuthfailaction, __ApiConfigHandlerAuthfailaction);
			Types._ApiConfigHandlerLogin.initFragments(_ApiConfigHandlerLogin, __ApiConfigHandlerLogin);
			Types._ApiConfigHandlerSecuritylevel.initFragments(_ApiConfigHandlerSecuritylevel, __ApiConfigHandlerSecuritylevel);
			Types._Apiconfighandler.initFragments(_Apiconfighandler, __Apiconfighandler);
			Types._Apiconfighandlerlink.initFragments(_Apiconfighandlerlink, __Apiconfighandlerlink);
			Types._Apiendpointhandler.initFragments(_Apiendpointhandler, __Apiendpointhandler);
			Types._Apiendpointhandlerlink.initFragments(_Apiendpointhandlerlink, __Apiendpointhandlerlink);
			Types._Application.initFragments(_Application, __Application);
			Types._Authfailaction.initFragments(_Authfailaction, __Authfailaction);
			Types._Authorizedcertificate.initFragments(_Authorizedcertificate, __Authorizedcertificate);
			Types._Authorizeddomain.initFragments(_Authorizeddomain, __Authorizeddomain);
			Types._Automaticscaling.initFragments(_Automaticscaling, __Automaticscaling);
			Types._Automaticscalinglink.initFragments(_Automaticscalinglink, __Automaticscalinglink);
			Types._Availability.initFragments(_Availability, __Availability);
			Types._Basicscaling.initFragments(_Basicscaling, __Basicscaling);
			Types._Basicscalinglink.initFragments(_Basicscalinglink, __Basicscalinglink);
			Types._Batchupdateingressrulesrequest.initFragments(_Batchupdateingressrulesrequest, __Batchupdateingressrulesrequest);
			Types._Batchupdateingressrulesresponse.initFragments(_Batchupdateingressrulesresponse, __Batchupdateingressrulesresponse);
			Types._Certificaterawdata.initFragments(_Certificaterawdata, __Certificaterawdata);
			Types._Certificaterawdatalink.initFragments(_Certificaterawdatalink, __Certificaterawdatalink);
			Types._Containerinfo.initFragments(_Containerinfo, __Containerinfo);
			Types._Containerinfolink.initFragments(_Containerinfolink, __Containerinfolink);
			Types._Cpuutilization.initFragments(_Cpuutilization, __Cpuutilization);
			Types._Cpuutilizationlink.initFragments(_Cpuutilizationlink, __Cpuutilizationlink);
			Types._Debuginstancerequest.initFragments(_Debuginstancerequest, __Debuginstancerequest);
			Types._Deployment.initFragments(_Deployment, __Deployment);
			Types._Deploymentlink.initFragments(_Deploymentlink, __Deploymentlink);
			Types._Diskutilization.initFragments(_Diskutilization, __Diskutilization);
			Types._Diskutilizationlink.initFragments(_Diskutilizationlink, __Diskutilizationlink);
			Types._Domainmapping.initFragments(_Domainmapping, __Domainmapping);
			Types._Empty.initFragments(_Empty, __Empty);
			Types._Endpointsapiservice.initFragments(_Endpointsapiservice, __Endpointsapiservice);
			Types._Endpointsapiservicelink.initFragments(_Endpointsapiservicelink, __Endpointsapiservicelink);
			Types._Errorcode.initFragments(_Errorcode, __Errorcode);
			Types._Errorhandler.initFragments(_Errorhandler, __Errorhandler);
			Types._Featuresettings.initFragments(_Featuresettings, __Featuresettings);
			Types._Featuresettingslink.initFragments(_Featuresettingslink, __Featuresettingslink);
			Types._Fileinfo.initFragments(_Fileinfo, __Fileinfo);
			Types._Firewallrule.initFragments(_Firewallrule, __Firewallrule);
			Types._Healthcheck.initFragments(_Healthcheck, __Healthcheck);
			Types._Healthchecklink.initFragments(_Healthchecklink, __Healthchecklink);
			Types._Identityawareproxy.initFragments(_Identityawareproxy, __Identityawareproxy);
			Types._Identityawareproxylink.initFragments(_Identityawareproxylink, __Identityawareproxylink);
			Types._Instance.initFragments(_Instance, __Instance);
			Types._Library.initFragments(_Library, __Library);
			Types._Listauthorizedcertificatesresponse.initFragments(_Listauthorizedcertificatesresponse, __Listauthorizedcertificatesresponse);
			Types._Listauthorizeddomainsresponse.initFragments(_Listauthorizeddomainsresponse, __Listauthorizeddomainsresponse);
			Types._Listdomainmappingsresponse.initFragments(_Listdomainmappingsresponse, __Listdomainmappingsresponse);
			Types._Listingressrulesresponse.initFragments(_Listingressrulesresponse, __Listingressrulesresponse);
			Types._Listinstancesresponse.initFragments(_Listinstancesresponse, __Listinstancesresponse);
			Types._Listlocationsresponse.initFragments(_Listlocationsresponse, __Listlocationsresponse);
			Types._Listoperationsresponse.initFragments(_Listoperationsresponse, __Listoperationsresponse);
			Types._Listservicesresponse.initFragments(_Listservicesresponse, __Listservicesresponse);
			Types._Listversionsresponse.initFragments(_Listversionsresponse, __Listversionsresponse);
			Types._Livenesscheck.initFragments(_Livenesscheck, __Livenesscheck);
			Types._Livenesschecklink.initFragments(_Livenesschecklink, __Livenesschecklink);
			Types._Location.initFragments(_Location, __Location);
			Types._Locationmetadata.initFragments(_Locationmetadata, __Locationmetadata);
			Types._Login.initFragments(_Login, __Login);
			Types._Manualscaling.initFragments(_Manualscaling, __Manualscaling);
			Types._Manualscalinglink.initFragments(_Manualscalinglink, __Manualscalinglink);
			Types._Network.initFragments(_Network, __Network);
			Types._Networklink.initFragments(_Networklink, __Networklink);
			Types._Networkutilization.initFragments(_Networkutilization, __Networkutilization);
			Types._Networkutilizationlink.initFragments(_Networkutilizationlink, __Networkutilizationlink);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._Operationmetadata.initFragments(_Operationmetadata, __Operationmetadata);
			Types._Operationmetadataexperimental.initFragments(_Operationmetadataexperimental, __Operationmetadataexperimental);
			Types._Operationmetadatav1.initFragments(_Operationmetadatav1, __Operationmetadatav1);
			Types._Operationmetadatav1alpha.initFragments(_Operationmetadatav1alpha, __Operationmetadatav1alpha);
			Types._Operationmetadatav1beta.initFragments(_Operationmetadatav1beta, __Operationmetadatav1beta);
			Types._Operationmetadatav1beta5.initFragments(_Operationmetadatav1beta5, __Operationmetadatav1beta5);
			Types._Readinesscheck.initFragments(_Readinesscheck, __Readinesscheck);
			Types._Readinesschecklink.initFragments(_Readinesschecklink, __Readinesschecklink);
			Types._Redirecthttpresponsecode.initFragments(_Redirecthttpresponsecode, __Redirecthttpresponsecode);
			Types._Repairapplicationrequest.initFragments(_Repairapplicationrequest, __Repairapplicationrequest);
			Types._Requestutilization.initFragments(_Requestutilization, __Requestutilization);
			Types._Requestutilizationlink.initFragments(_Requestutilizationlink, __Requestutilizationlink);
			Types._Resourcerecord.initFragments(_Resourcerecord, __Resourcerecord);
			Types._Resources.initFragments(_Resources, __Resources);
			Types._Resourceslink.initFragments(_Resourceslink, __Resourceslink);
			Types._Scripthandler.initFragments(_Scripthandler, __Scripthandler);
			Types._Scripthandlerlink.initFragments(_Scripthandlerlink, __Scripthandlerlink);
			Types._Securitylevel.initFragments(_Securitylevel, __Securitylevel);
			Types._Service.initFragments(_Service, __Service);
			Types._Servingstatus.initFragments(_Servingstatus, __Servingstatus);
			Types._Shardby.initFragments(_Shardby, __Shardby);
			Types._Sslsettings.initFragments(_Sslsettings, __Sslsettings);
			Types._Sslsettingslink.initFragments(_Sslsettingslink, __Sslsettingslink);
			Types._Staticfileshandler.initFragments(_Staticfileshandler, __Staticfileshandler);
			Types._Staticfileshandlerlink.initFragments(_Staticfileshandlerlink, __Staticfileshandlerlink);
			Types._Status.initFragments(_Status, __Status);
			Types._Statuslink.initFragments(_Statuslink, __Statuslink);
			Types._Trafficsplit.initFragments(_Trafficsplit, __Trafficsplit);
			Types._Trafficsplitlink.initFragments(_Trafficsplitlink, __Trafficsplitlink);
			Types._Type.initFragments(_Type, __Type);
			Types._Urldispatchrule.initFragments(_Urldispatchrule, __Urldispatchrule);
			Types._Urlmap.initFragments(_Urlmap, __Urlmap);
			Types._Version.initFragments(_Version, __Version);
			Types._VersionServingstatus.initFragments(_VersionServingstatus, __VersionServingstatus);
			Types._Volume.initFragments(_Volume, __Volume);
			Types._Zipinfo.initFragments(_Zipinfo, __Zipinfo);
			Types._Zipinfolink.initFragments(_Zipinfolink, __Zipinfolink);
			Types._any.initFragments(_any, __any);
			Types._array.initFragments(_array, __array);
			Types._byte.initFragments(_byte, __byte);
			Types._double.initFragments(_double, __double);
			Types._float.initFragments(_float, __float);
			Types._long.initFragments(_long, __long);
			Types._map.initFragments(_map, __map);
			Types._object.initFragments(_object, __object);
			Types._short.initFragments(_short, __short);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Action__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction__ApiConfigHandlerAuthfailaction = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerLogin__ApiConfigHandlerLogin = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerLogin__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerLogin__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerLogin__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerLogin__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel__ApiConfigHandlerSecuritylevel = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandler__Apiconfighandler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandler__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandler__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandlerlink__Apiconfighandlerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandlerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandlerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandlerlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiconfighandlerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandler__Apiendpointhandler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandler__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandler__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandlerlink__Apiendpointhandlerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandlerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandlerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandlerlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Apiendpointhandlerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Application = {
			AppengineTables.Operations._Application__create /* create() */,
			AppengineTables.Operations._Application__get /* get(String[1]) */,
			AppengineTables.Operations._Application__patch /* patch(String[1],String[1]) */,
			AppengineTables.Operations._Application__repair /* repair(String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Application__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authfailaction__Authfailaction = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authfailaction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authfailaction__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authfailaction__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authfailaction__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizedcertificate__Authorizedcertificate = {
			AppengineTables.Operations._Authorizedcertificate__create /* create(String[1]) */,
			AppengineTables.Operations._Authorizedcertificate__delete /* delete(String[1],String[1]) */,
			AppengineTables.Operations._Authorizedcertificate__get /* get(String[1],String[1],String[1]) */,
			AppengineTables.Operations._Authorizedcertificate__list /* list(String[1],String[1],Integer[1],String[1]) */,
			AppengineTables.Operations._Authorizedcertificate__patch /* patch(String[1],String[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizedcertificate__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizedcertificate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizedcertificate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizedcertificate__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizeddomain__Authorizeddomain = {
			AppengineTables.Operations._Authorizeddomain__list /* list(String[1],String[1],Integer[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizeddomain__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizeddomain__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizeddomain__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Authorizeddomain__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscaling__Automaticscaling = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscaling__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscaling__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscaling__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscaling__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscalinglink__Automaticscalinglink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscalinglink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscalinglink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscalinglink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Automaticscalinglink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availability__Availability = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availability__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availability__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availability__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Availability__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscaling__Basicscaling = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscaling__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscaling__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscaling__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscaling__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscalinglink__Basicscalinglink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscalinglink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscalinglink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscalinglink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Basicscalinglink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesrequest__Batchupdateingressrulesrequest = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesrequest__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesrequest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesrequest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesrequest__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesresponse__Batchupdateingressrulesresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Batchupdateingressrulesresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdata__Certificaterawdata = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdata__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdata__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdata__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdata__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdatalink__Certificaterawdatalink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdatalink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdatalink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdatalink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Certificaterawdatalink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfo__Containerinfo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfo__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfo__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfolink__Containerinfolink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfolink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfolink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfolink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Containerinfolink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilization__Cpuutilization = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilization__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilization__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilizationlink__Cpuutilizationlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilizationlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilizationlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilizationlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cpuutilizationlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Debuginstancerequest__Debuginstancerequest = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Debuginstancerequest__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Debuginstancerequest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Debuginstancerequest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Debuginstancerequest__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deployment__Deployment = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deployment__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deployment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deployment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deployment__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploymentlink__Deploymentlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploymentlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploymentlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploymentlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Deploymentlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilization__Diskutilization = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilization__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilization__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilizationlink__Diskutilizationlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilizationlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilizationlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilizationlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Diskutilizationlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Domainmapping__Domainmapping = {
			AppengineTables.Operations._Domainmapping__create /* create(String[1]) */,
			AppengineTables.Operations._Domainmapping__delete /* delete(String[1],String[1]) */,
			AppengineTables.Operations._Domainmapping__get /* get(String[1],String[1]) */,
			AppengineTables.Operations._Domainmapping__list /* list(String[1],String[1],Integer[1]) */,
			AppengineTables.Operations._Domainmapping__patch /* patch(String[1],String[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Domainmapping__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Domainmapping__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Domainmapping__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Domainmapping__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Empty__Empty = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Empty__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Empty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Empty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Empty__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservice__Endpointsapiservice = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservice__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservice__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservicelink__Endpointsapiservicelink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservicelink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservicelink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservicelink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Endpointsapiservicelink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorcode__Errorcode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorcode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorcode__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorcode__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorcode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorhandler__Errorhandler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorhandler__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorhandler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorhandler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Errorhandler__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettings__Featuresettings = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettings__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettings__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettings__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettings__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettingslink__Featuresettingslink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettingslink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettingslink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettingslink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Featuresettingslink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Fileinfo__Fileinfo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Fileinfo__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Fileinfo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Fileinfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Fileinfo__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Firewallrule__Firewallrule = {
			AppengineTables.Operations._Firewallrule__batchupdate /* batchupdate(String[1]) */,
			AppengineTables.Operations._Firewallrule__create /* create(String[1]) */,
			AppengineTables.Operations._Firewallrule__delete /* delete(String[1],String[1]) */,
			AppengineTables.Operations._Firewallrule__get /* get(String[1],String[1]) */,
			AppengineTables.Operations._Firewallrule__list /* list(Integer[1],String[1],String[1],String[1]) */,
			AppengineTables.Operations._Firewallrule__patch /* patch(String[1],String[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Firewallrule__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Firewallrule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Firewallrule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Firewallrule__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthcheck__Healthcheck = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthcheck__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthcheck__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthcheck__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthcheck__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthchecklink__Healthchecklink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthchecklink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthchecklink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthchecklink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Healthchecklink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxy__Identityawareproxy = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxy__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxy__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxy__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxy__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxylink__Identityawareproxylink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxylink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxylink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxylink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Identityawareproxylink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instance__Instance = {
			AppengineTables.Operations._Instance__debug /* debug(String[1],String[1],String[1],String[1]) */,
			AppengineTables.Operations._Instance__delete /* delete(String[1],String[1],String[1],String[1]) */,
			AppengineTables.Operations._Instance__get /* get(String[1],String[1],String[1],String[1]) */,
			AppengineTables.Operations._Instance__list /* list(String[1],String[1],String[1],Integer[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instance__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Instance__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Library__Library = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Library__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Library__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Library__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Library__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizedcertificatesresponse__Listauthorizedcertificatesresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizedcertificatesresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizedcertificatesresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizedcertificatesresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizedcertificatesresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizeddomainsresponse__Listauthorizeddomainsresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizeddomainsresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizeddomainsresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizeddomainsresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listauthorizeddomainsresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listdomainmappingsresponse__Listdomainmappingsresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listdomainmappingsresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listdomainmappingsresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listdomainmappingsresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listdomainmappingsresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listingressrulesresponse__Listingressrulesresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listingressrulesresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listingressrulesresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listingressrulesresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listingressrulesresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listinstancesresponse__Listinstancesresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listinstancesresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listinstancesresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listinstancesresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listinstancesresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listlocationsresponse__Listlocationsresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listlocationsresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listlocationsresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listlocationsresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listlocationsresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listoperationsresponse__Listoperationsresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listoperationsresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listoperationsresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listoperationsresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listoperationsresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listservicesresponse__Listservicesresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listservicesresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listservicesresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listservicesresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listservicesresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listversionsresponse__Listversionsresponse = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listversionsresponse__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listversionsresponse__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listversionsresponse__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Listversionsresponse__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesscheck__Livenesscheck = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesscheck__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesscheck__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesscheck__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesscheck__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesschecklink__Livenesschecklink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesschecklink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesschecklink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesschecklink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Livenesschecklink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Location__Location = {
			AppengineTables.Operations._Location__get /* get(String[1],String[1]) */,
			AppengineTables.Operations._Location__list /* list(Integer[1],String[1],String[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Location__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Location__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Locationmetadata__Locationmetadata = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Locationmetadata__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Locationmetadata__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Locationmetadata__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Locationmetadata__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Login__Login = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Login__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Login__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Login__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Login__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscaling__Manualscaling = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscaling__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscaling__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscaling__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscaling__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalinglink__Manualscalinglink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalinglink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalinglink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalinglink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Manualscalinglink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Network = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Network__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Networklink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networklink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilization__Networkutilization = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilization__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilization__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilizationlink__Networkutilizationlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilizationlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilizationlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilizationlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networkutilizationlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operation__Operation = {
			AppengineTables.Operations._Operation__get /* get(String[1],String[1]) */,
			AppengineTables.Operations._Operation__list /* list(String[1],String[1],String[1],Integer[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operation__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operation__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadata__Operationmetadata = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadata__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadata__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadata__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadata__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadataexperimental__Operationmetadataexperimental = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadataexperimental__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadataexperimental__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadataexperimental__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadataexperimental__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1__Operationmetadatav1 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1alpha__Operationmetadatav1alpha = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1alpha__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1alpha__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1alpha__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1alpha__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta__Operationmetadatav1beta = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta5__Operationmetadatav1beta5 = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta5__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta5__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta5__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Operationmetadatav1beta5__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesscheck__Readinesscheck = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesscheck__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesscheck__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesscheck__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesscheck__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesschecklink__Readinesschecklink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesschecklink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesschecklink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesschecklink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Readinesschecklink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Redirecthttpresponsecode__Redirecthttpresponsecode = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Redirecthttpresponsecode__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Redirecthttpresponsecode__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Redirecthttpresponsecode__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Redirecthttpresponsecode__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repairapplicationrequest__Repairapplicationrequest = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repairapplicationrequest__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repairapplicationrequest__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repairapplicationrequest__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Repairapplicationrequest__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilization__Requestutilization = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilization__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilization__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilization__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilization__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilizationlink__Requestutilizationlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilizationlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilizationlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilizationlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Requestutilizationlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourcerecord__Resourcerecord = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourcerecord__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourcerecord__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourcerecord__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourcerecord__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resources__Resources = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resources__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resources__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resources__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resources__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourceslink__Resourceslink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourceslink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourceslink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourceslink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Resourceslink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandler__Scripthandler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandler__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandler__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandlerlink__Scripthandlerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandlerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandlerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandlerlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Scripthandlerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Securitylevel__Securitylevel = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Securitylevel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Securitylevel__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Securitylevel__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Securitylevel__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Service__Service = {
			AppengineTables.Operations._Service__delete /* delete(String[1],String[1]) */,
			AppengineTables.Operations._Service__get /* get(String[1],String[1]) */,
			AppengineTables.Operations._Service__list /* list(String[1],String[1],Integer[1]) */,
			AppengineTables.Operations._Service__patch /* patch(String[1],String[1],String[1],Boolean[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Service__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Service__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Service__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Service__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Servingstatus__Servingstatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Servingstatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Servingstatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Servingstatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Servingstatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shardby__Shardby = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shardby__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shardby__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shardby__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Shardby__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettings__Sslsettings = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettings__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettings__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettings__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettings__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettingslink__Sslsettingslink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettingslink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettingslink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettingslink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sslsettingslink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandler__Staticfileshandler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandler__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandler__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandler__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandlerlink__Staticfileshandlerlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandlerlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandlerlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandlerlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Staticfileshandlerlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__Status = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Status__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statuslink__Statuslink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statuslink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statuslink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statuslink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Statuslink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplit__Trafficsplit = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplit__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplit__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplit__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplit__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplitlink__Trafficsplitlink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplitlink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplitlink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplitlink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Trafficsplitlink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Type__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urldispatchrule__Urldispatchrule = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urldispatchrule__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urldispatchrule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urldispatchrule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urldispatchrule__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urlmap__Urlmap = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urlmap__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urlmap__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urlmap__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Urlmap__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__Version = {
			AppengineTables.Operations._Version__create /* create(String[1],String[1]) */,
			AppengineTables.Operations._Version__delete /* delete(String[1],String[1],String[1]) */,
			AppengineTables.Operations._Version__get /* get(String[1],String[1],String[1],String[1]) */,
			AppengineTables.Operations._Version__list /* list(Integer[1],String[1],String[1],String[1],String[1]) */,
			AppengineTables.Operations._Version__patch /* patch(String[1],String[1],String[1],String[1]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Version__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VersionServingstatus__VersionServingstatus = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VersionServingstatus__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VersionServingstatus__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VersionServingstatus__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VersionServingstatus__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Volume = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Volume__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfo__Zipinfo = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfo__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfo__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfolink__Zipinfolink = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfolink__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfolink__Link = {
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkSourceInvariant /* LinkSourceInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */,
			OCCITables.Operations._Link__LinkTargetInvariant /* LinkTargetInvariant(Kind[?],Kind[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfolink__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Zipinfolink__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _any__any = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _any__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _array__array = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _array__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _array__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _byte__byte = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _byte__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__double = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _float__float = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _float__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _long__long = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _long__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _map__map = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _map__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _object__object = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _object__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _short__short = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _short__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);
			Fragments._Action__OclEnumeration.initOperations(_Action__OclEnumeration);
			Fragments._Action__OclType.initOperations(_Action__OclType);

			Fragments._ApiConfigHandlerAuthfailaction__ApiConfigHandlerAuthfailaction.initOperations(_ApiConfigHandlerAuthfailaction__ApiConfigHandlerAuthfailaction);
			Fragments._ApiConfigHandlerAuthfailaction__OclAny.initOperations(_ApiConfigHandlerAuthfailaction__OclAny);
			Fragments._ApiConfigHandlerAuthfailaction__OclElement.initOperations(_ApiConfigHandlerAuthfailaction__OclElement);
			Fragments._ApiConfigHandlerAuthfailaction__OclEnumeration.initOperations(_ApiConfigHandlerAuthfailaction__OclEnumeration);
			Fragments._ApiConfigHandlerAuthfailaction__OclType.initOperations(_ApiConfigHandlerAuthfailaction__OclType);

			Fragments._ApiConfigHandlerLogin__ApiConfigHandlerLogin.initOperations(_ApiConfigHandlerLogin__ApiConfigHandlerLogin);
			Fragments._ApiConfigHandlerLogin__OclAny.initOperations(_ApiConfigHandlerLogin__OclAny);
			Fragments._ApiConfigHandlerLogin__OclElement.initOperations(_ApiConfigHandlerLogin__OclElement);
			Fragments._ApiConfigHandlerLogin__OclEnumeration.initOperations(_ApiConfigHandlerLogin__OclEnumeration);
			Fragments._ApiConfigHandlerLogin__OclType.initOperations(_ApiConfigHandlerLogin__OclType);

			Fragments._ApiConfigHandlerSecuritylevel__ApiConfigHandlerSecuritylevel.initOperations(_ApiConfigHandlerSecuritylevel__ApiConfigHandlerSecuritylevel);
			Fragments._ApiConfigHandlerSecuritylevel__OclAny.initOperations(_ApiConfigHandlerSecuritylevel__OclAny);
			Fragments._ApiConfigHandlerSecuritylevel__OclElement.initOperations(_ApiConfigHandlerSecuritylevel__OclElement);
			Fragments._ApiConfigHandlerSecuritylevel__OclEnumeration.initOperations(_ApiConfigHandlerSecuritylevel__OclEnumeration);
			Fragments._ApiConfigHandlerSecuritylevel__OclType.initOperations(_ApiConfigHandlerSecuritylevel__OclType);

			Fragments._Apiconfighandler__Apiconfighandler.initOperations(_Apiconfighandler__Apiconfighandler);
			Fragments._Apiconfighandler__Entity.initOperations(_Apiconfighandler__Entity);
			Fragments._Apiconfighandler__OclAny.initOperations(_Apiconfighandler__OclAny);
			Fragments._Apiconfighandler__OclElement.initOperations(_Apiconfighandler__OclElement);
			Fragments._Apiconfighandler__Resource.initOperations(_Apiconfighandler__Resource);

			Fragments._Apiconfighandlerlink__Apiconfighandlerlink.initOperations(_Apiconfighandlerlink__Apiconfighandlerlink);
			Fragments._Apiconfighandlerlink__Entity.initOperations(_Apiconfighandlerlink__Entity);
			Fragments._Apiconfighandlerlink__Link.initOperations(_Apiconfighandlerlink__Link);
			Fragments._Apiconfighandlerlink__OclAny.initOperations(_Apiconfighandlerlink__OclAny);
			Fragments._Apiconfighandlerlink__OclElement.initOperations(_Apiconfighandlerlink__OclElement);

			Fragments._Apiendpointhandler__Apiendpointhandler.initOperations(_Apiendpointhandler__Apiendpointhandler);
			Fragments._Apiendpointhandler__Entity.initOperations(_Apiendpointhandler__Entity);
			Fragments._Apiendpointhandler__OclAny.initOperations(_Apiendpointhandler__OclAny);
			Fragments._Apiendpointhandler__OclElement.initOperations(_Apiendpointhandler__OclElement);
			Fragments._Apiendpointhandler__Resource.initOperations(_Apiendpointhandler__Resource);

			Fragments._Apiendpointhandlerlink__Apiendpointhandlerlink.initOperations(_Apiendpointhandlerlink__Apiendpointhandlerlink);
			Fragments._Apiendpointhandlerlink__Entity.initOperations(_Apiendpointhandlerlink__Entity);
			Fragments._Apiendpointhandlerlink__Link.initOperations(_Apiendpointhandlerlink__Link);
			Fragments._Apiendpointhandlerlink__OclAny.initOperations(_Apiendpointhandlerlink__OclAny);
			Fragments._Apiendpointhandlerlink__OclElement.initOperations(_Apiendpointhandlerlink__OclElement);

			Fragments._Application__Application.initOperations(_Application__Application);
			Fragments._Application__Entity.initOperations(_Application__Entity);
			Fragments._Application__OclAny.initOperations(_Application__OclAny);
			Fragments._Application__OclElement.initOperations(_Application__OclElement);
			Fragments._Application__Resource.initOperations(_Application__Resource);

			Fragments._Authfailaction__Authfailaction.initOperations(_Authfailaction__Authfailaction);
			Fragments._Authfailaction__OclAny.initOperations(_Authfailaction__OclAny);
			Fragments._Authfailaction__OclElement.initOperations(_Authfailaction__OclElement);
			Fragments._Authfailaction__OclEnumeration.initOperations(_Authfailaction__OclEnumeration);
			Fragments._Authfailaction__OclType.initOperations(_Authfailaction__OclType);

			Fragments._Authorizedcertificate__Authorizedcertificate.initOperations(_Authorizedcertificate__Authorizedcertificate);
			Fragments._Authorizedcertificate__Entity.initOperations(_Authorizedcertificate__Entity);
			Fragments._Authorizedcertificate__OclAny.initOperations(_Authorizedcertificate__OclAny);
			Fragments._Authorizedcertificate__OclElement.initOperations(_Authorizedcertificate__OclElement);
			Fragments._Authorizedcertificate__Resource.initOperations(_Authorizedcertificate__Resource);

			Fragments._Authorizeddomain__Authorizeddomain.initOperations(_Authorizeddomain__Authorizeddomain);
			Fragments._Authorizeddomain__Entity.initOperations(_Authorizeddomain__Entity);
			Fragments._Authorizeddomain__OclAny.initOperations(_Authorizeddomain__OclAny);
			Fragments._Authorizeddomain__OclElement.initOperations(_Authorizeddomain__OclElement);
			Fragments._Authorizeddomain__Resource.initOperations(_Authorizeddomain__Resource);

			Fragments._Automaticscaling__Automaticscaling.initOperations(_Automaticscaling__Automaticscaling);
			Fragments._Automaticscaling__Entity.initOperations(_Automaticscaling__Entity);
			Fragments._Automaticscaling__OclAny.initOperations(_Automaticscaling__OclAny);
			Fragments._Automaticscaling__OclElement.initOperations(_Automaticscaling__OclElement);
			Fragments._Automaticscaling__Resource.initOperations(_Automaticscaling__Resource);

			Fragments._Automaticscalinglink__Automaticscalinglink.initOperations(_Automaticscalinglink__Automaticscalinglink);
			Fragments._Automaticscalinglink__Entity.initOperations(_Automaticscalinglink__Entity);
			Fragments._Automaticscalinglink__Link.initOperations(_Automaticscalinglink__Link);
			Fragments._Automaticscalinglink__OclAny.initOperations(_Automaticscalinglink__OclAny);
			Fragments._Automaticscalinglink__OclElement.initOperations(_Automaticscalinglink__OclElement);

			Fragments._Availability__Availability.initOperations(_Availability__Availability);
			Fragments._Availability__OclAny.initOperations(_Availability__OclAny);
			Fragments._Availability__OclElement.initOperations(_Availability__OclElement);
			Fragments._Availability__OclEnumeration.initOperations(_Availability__OclEnumeration);
			Fragments._Availability__OclType.initOperations(_Availability__OclType);

			Fragments._Basicscaling__Basicscaling.initOperations(_Basicscaling__Basicscaling);
			Fragments._Basicscaling__Entity.initOperations(_Basicscaling__Entity);
			Fragments._Basicscaling__OclAny.initOperations(_Basicscaling__OclAny);
			Fragments._Basicscaling__OclElement.initOperations(_Basicscaling__OclElement);
			Fragments._Basicscaling__Resource.initOperations(_Basicscaling__Resource);

			Fragments._Basicscalinglink__Basicscalinglink.initOperations(_Basicscalinglink__Basicscalinglink);
			Fragments._Basicscalinglink__Entity.initOperations(_Basicscalinglink__Entity);
			Fragments._Basicscalinglink__Link.initOperations(_Basicscalinglink__Link);
			Fragments._Basicscalinglink__OclAny.initOperations(_Basicscalinglink__OclAny);
			Fragments._Basicscalinglink__OclElement.initOperations(_Basicscalinglink__OclElement);

			Fragments._Batchupdateingressrulesrequest__Batchupdateingressrulesrequest.initOperations(_Batchupdateingressrulesrequest__Batchupdateingressrulesrequest);
			Fragments._Batchupdateingressrulesrequest__Entity.initOperations(_Batchupdateingressrulesrequest__Entity);
			Fragments._Batchupdateingressrulesrequest__OclAny.initOperations(_Batchupdateingressrulesrequest__OclAny);
			Fragments._Batchupdateingressrulesrequest__OclElement.initOperations(_Batchupdateingressrulesrequest__OclElement);
			Fragments._Batchupdateingressrulesrequest__Resource.initOperations(_Batchupdateingressrulesrequest__Resource);

			Fragments._Batchupdateingressrulesresponse__Batchupdateingressrulesresponse.initOperations(_Batchupdateingressrulesresponse__Batchupdateingressrulesresponse);
			Fragments._Batchupdateingressrulesresponse__Entity.initOperations(_Batchupdateingressrulesresponse__Entity);
			Fragments._Batchupdateingressrulesresponse__OclAny.initOperations(_Batchupdateingressrulesresponse__OclAny);
			Fragments._Batchupdateingressrulesresponse__OclElement.initOperations(_Batchupdateingressrulesresponse__OclElement);
			Fragments._Batchupdateingressrulesresponse__Resource.initOperations(_Batchupdateingressrulesresponse__Resource);

			Fragments._Certificaterawdata__Certificaterawdata.initOperations(_Certificaterawdata__Certificaterawdata);
			Fragments._Certificaterawdata__Entity.initOperations(_Certificaterawdata__Entity);
			Fragments._Certificaterawdata__OclAny.initOperations(_Certificaterawdata__OclAny);
			Fragments._Certificaterawdata__OclElement.initOperations(_Certificaterawdata__OclElement);
			Fragments._Certificaterawdata__Resource.initOperations(_Certificaterawdata__Resource);

			Fragments._Certificaterawdatalink__Certificaterawdatalink.initOperations(_Certificaterawdatalink__Certificaterawdatalink);
			Fragments._Certificaterawdatalink__Entity.initOperations(_Certificaterawdatalink__Entity);
			Fragments._Certificaterawdatalink__Link.initOperations(_Certificaterawdatalink__Link);
			Fragments._Certificaterawdatalink__OclAny.initOperations(_Certificaterawdatalink__OclAny);
			Fragments._Certificaterawdatalink__OclElement.initOperations(_Certificaterawdatalink__OclElement);

			Fragments._Containerinfo__Containerinfo.initOperations(_Containerinfo__Containerinfo);
			Fragments._Containerinfo__Entity.initOperations(_Containerinfo__Entity);
			Fragments._Containerinfo__OclAny.initOperations(_Containerinfo__OclAny);
			Fragments._Containerinfo__OclElement.initOperations(_Containerinfo__OclElement);
			Fragments._Containerinfo__Resource.initOperations(_Containerinfo__Resource);

			Fragments._Containerinfolink__Containerinfolink.initOperations(_Containerinfolink__Containerinfolink);
			Fragments._Containerinfolink__Entity.initOperations(_Containerinfolink__Entity);
			Fragments._Containerinfolink__Link.initOperations(_Containerinfolink__Link);
			Fragments._Containerinfolink__OclAny.initOperations(_Containerinfolink__OclAny);
			Fragments._Containerinfolink__OclElement.initOperations(_Containerinfolink__OclElement);

			Fragments._Cpuutilization__Cpuutilization.initOperations(_Cpuutilization__Cpuutilization);
			Fragments._Cpuutilization__Entity.initOperations(_Cpuutilization__Entity);
			Fragments._Cpuutilization__OclAny.initOperations(_Cpuutilization__OclAny);
			Fragments._Cpuutilization__OclElement.initOperations(_Cpuutilization__OclElement);
			Fragments._Cpuutilization__Resource.initOperations(_Cpuutilization__Resource);

			Fragments._Cpuutilizationlink__Cpuutilizationlink.initOperations(_Cpuutilizationlink__Cpuutilizationlink);
			Fragments._Cpuutilizationlink__Entity.initOperations(_Cpuutilizationlink__Entity);
			Fragments._Cpuutilizationlink__Link.initOperations(_Cpuutilizationlink__Link);
			Fragments._Cpuutilizationlink__OclAny.initOperations(_Cpuutilizationlink__OclAny);
			Fragments._Cpuutilizationlink__OclElement.initOperations(_Cpuutilizationlink__OclElement);

			Fragments._Debuginstancerequest__Debuginstancerequest.initOperations(_Debuginstancerequest__Debuginstancerequest);
			Fragments._Debuginstancerequest__Entity.initOperations(_Debuginstancerequest__Entity);
			Fragments._Debuginstancerequest__OclAny.initOperations(_Debuginstancerequest__OclAny);
			Fragments._Debuginstancerequest__OclElement.initOperations(_Debuginstancerequest__OclElement);
			Fragments._Debuginstancerequest__Resource.initOperations(_Debuginstancerequest__Resource);

			Fragments._Deployment__Deployment.initOperations(_Deployment__Deployment);
			Fragments._Deployment__Entity.initOperations(_Deployment__Entity);
			Fragments._Deployment__OclAny.initOperations(_Deployment__OclAny);
			Fragments._Deployment__OclElement.initOperations(_Deployment__OclElement);
			Fragments._Deployment__Resource.initOperations(_Deployment__Resource);

			Fragments._Deploymentlink__Deploymentlink.initOperations(_Deploymentlink__Deploymentlink);
			Fragments._Deploymentlink__Entity.initOperations(_Deploymentlink__Entity);
			Fragments._Deploymentlink__Link.initOperations(_Deploymentlink__Link);
			Fragments._Deploymentlink__OclAny.initOperations(_Deploymentlink__OclAny);
			Fragments._Deploymentlink__OclElement.initOperations(_Deploymentlink__OclElement);

			Fragments._Diskutilization__Diskutilization.initOperations(_Diskutilization__Diskutilization);
			Fragments._Diskutilization__Entity.initOperations(_Diskutilization__Entity);
			Fragments._Diskutilization__OclAny.initOperations(_Diskutilization__OclAny);
			Fragments._Diskutilization__OclElement.initOperations(_Diskutilization__OclElement);
			Fragments._Diskutilization__Resource.initOperations(_Diskutilization__Resource);

			Fragments._Diskutilizationlink__Diskutilizationlink.initOperations(_Diskutilizationlink__Diskutilizationlink);
			Fragments._Diskutilizationlink__Entity.initOperations(_Diskutilizationlink__Entity);
			Fragments._Diskutilizationlink__Link.initOperations(_Diskutilizationlink__Link);
			Fragments._Diskutilizationlink__OclAny.initOperations(_Diskutilizationlink__OclAny);
			Fragments._Diskutilizationlink__OclElement.initOperations(_Diskutilizationlink__OclElement);

			Fragments._Domainmapping__Domainmapping.initOperations(_Domainmapping__Domainmapping);
			Fragments._Domainmapping__Entity.initOperations(_Domainmapping__Entity);
			Fragments._Domainmapping__OclAny.initOperations(_Domainmapping__OclAny);
			Fragments._Domainmapping__OclElement.initOperations(_Domainmapping__OclElement);
			Fragments._Domainmapping__Resource.initOperations(_Domainmapping__Resource);

			Fragments._Empty__Empty.initOperations(_Empty__Empty);
			Fragments._Empty__Entity.initOperations(_Empty__Entity);
			Fragments._Empty__OclAny.initOperations(_Empty__OclAny);
			Fragments._Empty__OclElement.initOperations(_Empty__OclElement);
			Fragments._Empty__Resource.initOperations(_Empty__Resource);

			Fragments._Endpointsapiservice__Endpointsapiservice.initOperations(_Endpointsapiservice__Endpointsapiservice);
			Fragments._Endpointsapiservice__Entity.initOperations(_Endpointsapiservice__Entity);
			Fragments._Endpointsapiservice__OclAny.initOperations(_Endpointsapiservice__OclAny);
			Fragments._Endpointsapiservice__OclElement.initOperations(_Endpointsapiservice__OclElement);
			Fragments._Endpointsapiservice__Resource.initOperations(_Endpointsapiservice__Resource);

			Fragments._Endpointsapiservicelink__Endpointsapiservicelink.initOperations(_Endpointsapiservicelink__Endpointsapiservicelink);
			Fragments._Endpointsapiservicelink__Entity.initOperations(_Endpointsapiservicelink__Entity);
			Fragments._Endpointsapiservicelink__Link.initOperations(_Endpointsapiservicelink__Link);
			Fragments._Endpointsapiservicelink__OclAny.initOperations(_Endpointsapiservicelink__OclAny);
			Fragments._Endpointsapiservicelink__OclElement.initOperations(_Endpointsapiservicelink__OclElement);

			Fragments._Errorcode__Errorcode.initOperations(_Errorcode__Errorcode);
			Fragments._Errorcode__OclAny.initOperations(_Errorcode__OclAny);
			Fragments._Errorcode__OclElement.initOperations(_Errorcode__OclElement);
			Fragments._Errorcode__OclEnumeration.initOperations(_Errorcode__OclEnumeration);
			Fragments._Errorcode__OclType.initOperations(_Errorcode__OclType);

			Fragments._Errorhandler__Entity.initOperations(_Errorhandler__Entity);
			Fragments._Errorhandler__Errorhandler.initOperations(_Errorhandler__Errorhandler);
			Fragments._Errorhandler__OclAny.initOperations(_Errorhandler__OclAny);
			Fragments._Errorhandler__OclElement.initOperations(_Errorhandler__OclElement);
			Fragments._Errorhandler__Resource.initOperations(_Errorhandler__Resource);

			Fragments._Featuresettings__Entity.initOperations(_Featuresettings__Entity);
			Fragments._Featuresettings__Featuresettings.initOperations(_Featuresettings__Featuresettings);
			Fragments._Featuresettings__OclAny.initOperations(_Featuresettings__OclAny);
			Fragments._Featuresettings__OclElement.initOperations(_Featuresettings__OclElement);
			Fragments._Featuresettings__Resource.initOperations(_Featuresettings__Resource);

			Fragments._Featuresettingslink__Entity.initOperations(_Featuresettingslink__Entity);
			Fragments._Featuresettingslink__Featuresettingslink.initOperations(_Featuresettingslink__Featuresettingslink);
			Fragments._Featuresettingslink__Link.initOperations(_Featuresettingslink__Link);
			Fragments._Featuresettingslink__OclAny.initOperations(_Featuresettingslink__OclAny);
			Fragments._Featuresettingslink__OclElement.initOperations(_Featuresettingslink__OclElement);

			Fragments._Fileinfo__Entity.initOperations(_Fileinfo__Entity);
			Fragments._Fileinfo__Fileinfo.initOperations(_Fileinfo__Fileinfo);
			Fragments._Fileinfo__OclAny.initOperations(_Fileinfo__OclAny);
			Fragments._Fileinfo__OclElement.initOperations(_Fileinfo__OclElement);
			Fragments._Fileinfo__Resource.initOperations(_Fileinfo__Resource);

			Fragments._Firewallrule__Entity.initOperations(_Firewallrule__Entity);
			Fragments._Firewallrule__Firewallrule.initOperations(_Firewallrule__Firewallrule);
			Fragments._Firewallrule__OclAny.initOperations(_Firewallrule__OclAny);
			Fragments._Firewallrule__OclElement.initOperations(_Firewallrule__OclElement);
			Fragments._Firewallrule__Resource.initOperations(_Firewallrule__Resource);

			Fragments._Healthcheck__Entity.initOperations(_Healthcheck__Entity);
			Fragments._Healthcheck__Healthcheck.initOperations(_Healthcheck__Healthcheck);
			Fragments._Healthcheck__OclAny.initOperations(_Healthcheck__OclAny);
			Fragments._Healthcheck__OclElement.initOperations(_Healthcheck__OclElement);
			Fragments._Healthcheck__Resource.initOperations(_Healthcheck__Resource);

			Fragments._Healthchecklink__Entity.initOperations(_Healthchecklink__Entity);
			Fragments._Healthchecklink__Healthchecklink.initOperations(_Healthchecklink__Healthchecklink);
			Fragments._Healthchecklink__Link.initOperations(_Healthchecklink__Link);
			Fragments._Healthchecklink__OclAny.initOperations(_Healthchecklink__OclAny);
			Fragments._Healthchecklink__OclElement.initOperations(_Healthchecklink__OclElement);

			Fragments._Identityawareproxy__Entity.initOperations(_Identityawareproxy__Entity);
			Fragments._Identityawareproxy__Identityawareproxy.initOperations(_Identityawareproxy__Identityawareproxy);
			Fragments._Identityawareproxy__OclAny.initOperations(_Identityawareproxy__OclAny);
			Fragments._Identityawareproxy__OclElement.initOperations(_Identityawareproxy__OclElement);
			Fragments._Identityawareproxy__Resource.initOperations(_Identityawareproxy__Resource);

			Fragments._Identityawareproxylink__Entity.initOperations(_Identityawareproxylink__Entity);
			Fragments._Identityawareproxylink__Identityawareproxylink.initOperations(_Identityawareproxylink__Identityawareproxylink);
			Fragments._Identityawareproxylink__Link.initOperations(_Identityawareproxylink__Link);
			Fragments._Identityawareproxylink__OclAny.initOperations(_Identityawareproxylink__OclAny);
			Fragments._Identityawareproxylink__OclElement.initOperations(_Identityawareproxylink__OclElement);

			Fragments._Instance__Entity.initOperations(_Instance__Entity);
			Fragments._Instance__Instance.initOperations(_Instance__Instance);
			Fragments._Instance__OclAny.initOperations(_Instance__OclAny);
			Fragments._Instance__OclElement.initOperations(_Instance__OclElement);
			Fragments._Instance__Resource.initOperations(_Instance__Resource);

			Fragments._Library__Entity.initOperations(_Library__Entity);
			Fragments._Library__Library.initOperations(_Library__Library);
			Fragments._Library__OclAny.initOperations(_Library__OclAny);
			Fragments._Library__OclElement.initOperations(_Library__OclElement);
			Fragments._Library__Resource.initOperations(_Library__Resource);

			Fragments._Listauthorizedcertificatesresponse__Entity.initOperations(_Listauthorizedcertificatesresponse__Entity);
			Fragments._Listauthorizedcertificatesresponse__Listauthorizedcertificatesresponse.initOperations(_Listauthorizedcertificatesresponse__Listauthorizedcertificatesresponse);
			Fragments._Listauthorizedcertificatesresponse__OclAny.initOperations(_Listauthorizedcertificatesresponse__OclAny);
			Fragments._Listauthorizedcertificatesresponse__OclElement.initOperations(_Listauthorizedcertificatesresponse__OclElement);
			Fragments._Listauthorizedcertificatesresponse__Resource.initOperations(_Listauthorizedcertificatesresponse__Resource);

			Fragments._Listauthorizeddomainsresponse__Entity.initOperations(_Listauthorizeddomainsresponse__Entity);
			Fragments._Listauthorizeddomainsresponse__Listauthorizeddomainsresponse.initOperations(_Listauthorizeddomainsresponse__Listauthorizeddomainsresponse);
			Fragments._Listauthorizeddomainsresponse__OclAny.initOperations(_Listauthorizeddomainsresponse__OclAny);
			Fragments._Listauthorizeddomainsresponse__OclElement.initOperations(_Listauthorizeddomainsresponse__OclElement);
			Fragments._Listauthorizeddomainsresponse__Resource.initOperations(_Listauthorizeddomainsresponse__Resource);

			Fragments._Listdomainmappingsresponse__Entity.initOperations(_Listdomainmappingsresponse__Entity);
			Fragments._Listdomainmappingsresponse__Listdomainmappingsresponse.initOperations(_Listdomainmappingsresponse__Listdomainmappingsresponse);
			Fragments._Listdomainmappingsresponse__OclAny.initOperations(_Listdomainmappingsresponse__OclAny);
			Fragments._Listdomainmappingsresponse__OclElement.initOperations(_Listdomainmappingsresponse__OclElement);
			Fragments._Listdomainmappingsresponse__Resource.initOperations(_Listdomainmappingsresponse__Resource);

			Fragments._Listingressrulesresponse__Entity.initOperations(_Listingressrulesresponse__Entity);
			Fragments._Listingressrulesresponse__Listingressrulesresponse.initOperations(_Listingressrulesresponse__Listingressrulesresponse);
			Fragments._Listingressrulesresponse__OclAny.initOperations(_Listingressrulesresponse__OclAny);
			Fragments._Listingressrulesresponse__OclElement.initOperations(_Listingressrulesresponse__OclElement);
			Fragments._Listingressrulesresponse__Resource.initOperations(_Listingressrulesresponse__Resource);

			Fragments._Listinstancesresponse__Entity.initOperations(_Listinstancesresponse__Entity);
			Fragments._Listinstancesresponse__Listinstancesresponse.initOperations(_Listinstancesresponse__Listinstancesresponse);
			Fragments._Listinstancesresponse__OclAny.initOperations(_Listinstancesresponse__OclAny);
			Fragments._Listinstancesresponse__OclElement.initOperations(_Listinstancesresponse__OclElement);
			Fragments._Listinstancesresponse__Resource.initOperations(_Listinstancesresponse__Resource);

			Fragments._Listlocationsresponse__Entity.initOperations(_Listlocationsresponse__Entity);
			Fragments._Listlocationsresponse__Listlocationsresponse.initOperations(_Listlocationsresponse__Listlocationsresponse);
			Fragments._Listlocationsresponse__OclAny.initOperations(_Listlocationsresponse__OclAny);
			Fragments._Listlocationsresponse__OclElement.initOperations(_Listlocationsresponse__OclElement);
			Fragments._Listlocationsresponse__Resource.initOperations(_Listlocationsresponse__Resource);

			Fragments._Listoperationsresponse__Entity.initOperations(_Listoperationsresponse__Entity);
			Fragments._Listoperationsresponse__Listoperationsresponse.initOperations(_Listoperationsresponse__Listoperationsresponse);
			Fragments._Listoperationsresponse__OclAny.initOperations(_Listoperationsresponse__OclAny);
			Fragments._Listoperationsresponse__OclElement.initOperations(_Listoperationsresponse__OclElement);
			Fragments._Listoperationsresponse__Resource.initOperations(_Listoperationsresponse__Resource);

			Fragments._Listservicesresponse__Entity.initOperations(_Listservicesresponse__Entity);
			Fragments._Listservicesresponse__Listservicesresponse.initOperations(_Listservicesresponse__Listservicesresponse);
			Fragments._Listservicesresponse__OclAny.initOperations(_Listservicesresponse__OclAny);
			Fragments._Listservicesresponse__OclElement.initOperations(_Listservicesresponse__OclElement);
			Fragments._Listservicesresponse__Resource.initOperations(_Listservicesresponse__Resource);

			Fragments._Listversionsresponse__Entity.initOperations(_Listversionsresponse__Entity);
			Fragments._Listversionsresponse__Listversionsresponse.initOperations(_Listversionsresponse__Listversionsresponse);
			Fragments._Listversionsresponse__OclAny.initOperations(_Listversionsresponse__OclAny);
			Fragments._Listversionsresponse__OclElement.initOperations(_Listversionsresponse__OclElement);
			Fragments._Listversionsresponse__Resource.initOperations(_Listversionsresponse__Resource);

			Fragments._Livenesscheck__Entity.initOperations(_Livenesscheck__Entity);
			Fragments._Livenesscheck__Livenesscheck.initOperations(_Livenesscheck__Livenesscheck);
			Fragments._Livenesscheck__OclAny.initOperations(_Livenesscheck__OclAny);
			Fragments._Livenesscheck__OclElement.initOperations(_Livenesscheck__OclElement);
			Fragments._Livenesscheck__Resource.initOperations(_Livenesscheck__Resource);

			Fragments._Livenesschecklink__Entity.initOperations(_Livenesschecklink__Entity);
			Fragments._Livenesschecklink__Link.initOperations(_Livenesschecklink__Link);
			Fragments._Livenesschecklink__Livenesschecklink.initOperations(_Livenesschecklink__Livenesschecklink);
			Fragments._Livenesschecklink__OclAny.initOperations(_Livenesschecklink__OclAny);
			Fragments._Livenesschecklink__OclElement.initOperations(_Livenesschecklink__OclElement);

			Fragments._Location__Entity.initOperations(_Location__Entity);
			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);
			Fragments._Location__Resource.initOperations(_Location__Resource);

			Fragments._Locationmetadata__Entity.initOperations(_Locationmetadata__Entity);
			Fragments._Locationmetadata__Locationmetadata.initOperations(_Locationmetadata__Locationmetadata);
			Fragments._Locationmetadata__OclAny.initOperations(_Locationmetadata__OclAny);
			Fragments._Locationmetadata__OclElement.initOperations(_Locationmetadata__OclElement);
			Fragments._Locationmetadata__Resource.initOperations(_Locationmetadata__Resource);

			Fragments._Login__Login.initOperations(_Login__Login);
			Fragments._Login__OclAny.initOperations(_Login__OclAny);
			Fragments._Login__OclElement.initOperations(_Login__OclElement);
			Fragments._Login__OclEnumeration.initOperations(_Login__OclEnumeration);
			Fragments._Login__OclType.initOperations(_Login__OclType);

			Fragments._Manualscaling__Entity.initOperations(_Manualscaling__Entity);
			Fragments._Manualscaling__Manualscaling.initOperations(_Manualscaling__Manualscaling);
			Fragments._Manualscaling__OclAny.initOperations(_Manualscaling__OclAny);
			Fragments._Manualscaling__OclElement.initOperations(_Manualscaling__OclElement);
			Fragments._Manualscaling__Resource.initOperations(_Manualscaling__Resource);

			Fragments._Manualscalinglink__Entity.initOperations(_Manualscalinglink__Entity);
			Fragments._Manualscalinglink__Link.initOperations(_Manualscalinglink__Link);
			Fragments._Manualscalinglink__Manualscalinglink.initOperations(_Manualscalinglink__Manualscalinglink);
			Fragments._Manualscalinglink__OclAny.initOperations(_Manualscalinglink__OclAny);
			Fragments._Manualscalinglink__OclElement.initOperations(_Manualscalinglink__OclElement);

			Fragments._Network__Entity.initOperations(_Network__Entity);
			Fragments._Network__Network.initOperations(_Network__Network);
			Fragments._Network__OclAny.initOperations(_Network__OclAny);
			Fragments._Network__OclElement.initOperations(_Network__OclElement);
			Fragments._Network__Resource.initOperations(_Network__Resource);

			Fragments._Networklink__Entity.initOperations(_Networklink__Entity);
			Fragments._Networklink__Link.initOperations(_Networklink__Link);
			Fragments._Networklink__Networklink.initOperations(_Networklink__Networklink);
			Fragments._Networklink__OclAny.initOperations(_Networklink__OclAny);
			Fragments._Networklink__OclElement.initOperations(_Networklink__OclElement);

			Fragments._Networkutilization__Entity.initOperations(_Networkutilization__Entity);
			Fragments._Networkutilization__Networkutilization.initOperations(_Networkutilization__Networkutilization);
			Fragments._Networkutilization__OclAny.initOperations(_Networkutilization__OclAny);
			Fragments._Networkutilization__OclElement.initOperations(_Networkutilization__OclElement);
			Fragments._Networkutilization__Resource.initOperations(_Networkutilization__Resource);

			Fragments._Networkutilizationlink__Entity.initOperations(_Networkutilizationlink__Entity);
			Fragments._Networkutilizationlink__Link.initOperations(_Networkutilizationlink__Link);
			Fragments._Networkutilizationlink__Networkutilizationlink.initOperations(_Networkutilizationlink__Networkutilizationlink);
			Fragments._Networkutilizationlink__OclAny.initOperations(_Networkutilizationlink__OclAny);
			Fragments._Networkutilizationlink__OclElement.initOperations(_Networkutilizationlink__OclElement);

			Fragments._Operation__Entity.initOperations(_Operation__Entity);
			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);
			Fragments._Operation__Resource.initOperations(_Operation__Resource);

			Fragments._Operationmetadata__Entity.initOperations(_Operationmetadata__Entity);
			Fragments._Operationmetadata__OclAny.initOperations(_Operationmetadata__OclAny);
			Fragments._Operationmetadata__OclElement.initOperations(_Operationmetadata__OclElement);
			Fragments._Operationmetadata__Operationmetadata.initOperations(_Operationmetadata__Operationmetadata);
			Fragments._Operationmetadata__Resource.initOperations(_Operationmetadata__Resource);

			Fragments._Operationmetadataexperimental__Entity.initOperations(_Operationmetadataexperimental__Entity);
			Fragments._Operationmetadataexperimental__OclAny.initOperations(_Operationmetadataexperimental__OclAny);
			Fragments._Operationmetadataexperimental__OclElement.initOperations(_Operationmetadataexperimental__OclElement);
			Fragments._Operationmetadataexperimental__Operationmetadataexperimental.initOperations(_Operationmetadataexperimental__Operationmetadataexperimental);
			Fragments._Operationmetadataexperimental__Resource.initOperations(_Operationmetadataexperimental__Resource);

			Fragments._Operationmetadatav1__Entity.initOperations(_Operationmetadatav1__Entity);
			Fragments._Operationmetadatav1__OclAny.initOperations(_Operationmetadatav1__OclAny);
			Fragments._Operationmetadatav1__OclElement.initOperations(_Operationmetadatav1__OclElement);
			Fragments._Operationmetadatav1__Operationmetadatav1.initOperations(_Operationmetadatav1__Operationmetadatav1);
			Fragments._Operationmetadatav1__Resource.initOperations(_Operationmetadatav1__Resource);

			Fragments._Operationmetadatav1alpha__Entity.initOperations(_Operationmetadatav1alpha__Entity);
			Fragments._Operationmetadatav1alpha__OclAny.initOperations(_Operationmetadatav1alpha__OclAny);
			Fragments._Operationmetadatav1alpha__OclElement.initOperations(_Operationmetadatav1alpha__OclElement);
			Fragments._Operationmetadatav1alpha__Operationmetadatav1alpha.initOperations(_Operationmetadatav1alpha__Operationmetadatav1alpha);
			Fragments._Operationmetadatav1alpha__Resource.initOperations(_Operationmetadatav1alpha__Resource);

			Fragments._Operationmetadatav1beta__Entity.initOperations(_Operationmetadatav1beta__Entity);
			Fragments._Operationmetadatav1beta__OclAny.initOperations(_Operationmetadatav1beta__OclAny);
			Fragments._Operationmetadatav1beta__OclElement.initOperations(_Operationmetadatav1beta__OclElement);
			Fragments._Operationmetadatav1beta__Operationmetadatav1beta.initOperations(_Operationmetadatav1beta__Operationmetadatav1beta);
			Fragments._Operationmetadatav1beta__Resource.initOperations(_Operationmetadatav1beta__Resource);

			Fragments._Operationmetadatav1beta5__Entity.initOperations(_Operationmetadatav1beta5__Entity);
			Fragments._Operationmetadatav1beta5__OclAny.initOperations(_Operationmetadatav1beta5__OclAny);
			Fragments._Operationmetadatav1beta5__OclElement.initOperations(_Operationmetadatav1beta5__OclElement);
			Fragments._Operationmetadatav1beta5__Operationmetadatav1beta5.initOperations(_Operationmetadatav1beta5__Operationmetadatav1beta5);
			Fragments._Operationmetadatav1beta5__Resource.initOperations(_Operationmetadatav1beta5__Resource);

			Fragments._Readinesscheck__Entity.initOperations(_Readinesscheck__Entity);
			Fragments._Readinesscheck__OclAny.initOperations(_Readinesscheck__OclAny);
			Fragments._Readinesscheck__OclElement.initOperations(_Readinesscheck__OclElement);
			Fragments._Readinesscheck__Readinesscheck.initOperations(_Readinesscheck__Readinesscheck);
			Fragments._Readinesscheck__Resource.initOperations(_Readinesscheck__Resource);

			Fragments._Readinesschecklink__Entity.initOperations(_Readinesschecklink__Entity);
			Fragments._Readinesschecklink__Link.initOperations(_Readinesschecklink__Link);
			Fragments._Readinesschecklink__OclAny.initOperations(_Readinesschecklink__OclAny);
			Fragments._Readinesschecklink__OclElement.initOperations(_Readinesschecklink__OclElement);
			Fragments._Readinesschecklink__Readinesschecklink.initOperations(_Readinesschecklink__Readinesschecklink);

			Fragments._Redirecthttpresponsecode__OclAny.initOperations(_Redirecthttpresponsecode__OclAny);
			Fragments._Redirecthttpresponsecode__OclElement.initOperations(_Redirecthttpresponsecode__OclElement);
			Fragments._Redirecthttpresponsecode__OclEnumeration.initOperations(_Redirecthttpresponsecode__OclEnumeration);
			Fragments._Redirecthttpresponsecode__OclType.initOperations(_Redirecthttpresponsecode__OclType);
			Fragments._Redirecthttpresponsecode__Redirecthttpresponsecode.initOperations(_Redirecthttpresponsecode__Redirecthttpresponsecode);

			Fragments._Repairapplicationrequest__Entity.initOperations(_Repairapplicationrequest__Entity);
			Fragments._Repairapplicationrequest__OclAny.initOperations(_Repairapplicationrequest__OclAny);
			Fragments._Repairapplicationrequest__OclElement.initOperations(_Repairapplicationrequest__OclElement);
			Fragments._Repairapplicationrequest__Repairapplicationrequest.initOperations(_Repairapplicationrequest__Repairapplicationrequest);
			Fragments._Repairapplicationrequest__Resource.initOperations(_Repairapplicationrequest__Resource);

			Fragments._Requestutilization__Entity.initOperations(_Requestutilization__Entity);
			Fragments._Requestutilization__OclAny.initOperations(_Requestutilization__OclAny);
			Fragments._Requestutilization__OclElement.initOperations(_Requestutilization__OclElement);
			Fragments._Requestutilization__Requestutilization.initOperations(_Requestutilization__Requestutilization);
			Fragments._Requestutilization__Resource.initOperations(_Requestutilization__Resource);

			Fragments._Requestutilizationlink__Entity.initOperations(_Requestutilizationlink__Entity);
			Fragments._Requestutilizationlink__Link.initOperations(_Requestutilizationlink__Link);
			Fragments._Requestutilizationlink__OclAny.initOperations(_Requestutilizationlink__OclAny);
			Fragments._Requestutilizationlink__OclElement.initOperations(_Requestutilizationlink__OclElement);
			Fragments._Requestutilizationlink__Requestutilizationlink.initOperations(_Requestutilizationlink__Requestutilizationlink);

			Fragments._Resourcerecord__Entity.initOperations(_Resourcerecord__Entity);
			Fragments._Resourcerecord__OclAny.initOperations(_Resourcerecord__OclAny);
			Fragments._Resourcerecord__OclElement.initOperations(_Resourcerecord__OclElement);
			Fragments._Resourcerecord__Resource.initOperations(_Resourcerecord__Resource);
			Fragments._Resourcerecord__Resourcerecord.initOperations(_Resourcerecord__Resourcerecord);

			Fragments._Resources__Entity.initOperations(_Resources__Entity);
			Fragments._Resources__OclAny.initOperations(_Resources__OclAny);
			Fragments._Resources__OclElement.initOperations(_Resources__OclElement);
			Fragments._Resources__Resource.initOperations(_Resources__Resource);
			Fragments._Resources__Resources.initOperations(_Resources__Resources);

			Fragments._Resourceslink__Entity.initOperations(_Resourceslink__Entity);
			Fragments._Resourceslink__Link.initOperations(_Resourceslink__Link);
			Fragments._Resourceslink__OclAny.initOperations(_Resourceslink__OclAny);
			Fragments._Resourceslink__OclElement.initOperations(_Resourceslink__OclElement);
			Fragments._Resourceslink__Resourceslink.initOperations(_Resourceslink__Resourceslink);

			Fragments._Scripthandler__Entity.initOperations(_Scripthandler__Entity);
			Fragments._Scripthandler__OclAny.initOperations(_Scripthandler__OclAny);
			Fragments._Scripthandler__OclElement.initOperations(_Scripthandler__OclElement);
			Fragments._Scripthandler__Resource.initOperations(_Scripthandler__Resource);
			Fragments._Scripthandler__Scripthandler.initOperations(_Scripthandler__Scripthandler);

			Fragments._Scripthandlerlink__Entity.initOperations(_Scripthandlerlink__Entity);
			Fragments._Scripthandlerlink__Link.initOperations(_Scripthandlerlink__Link);
			Fragments._Scripthandlerlink__OclAny.initOperations(_Scripthandlerlink__OclAny);
			Fragments._Scripthandlerlink__OclElement.initOperations(_Scripthandlerlink__OclElement);
			Fragments._Scripthandlerlink__Scripthandlerlink.initOperations(_Scripthandlerlink__Scripthandlerlink);

			Fragments._Securitylevel__OclAny.initOperations(_Securitylevel__OclAny);
			Fragments._Securitylevel__OclElement.initOperations(_Securitylevel__OclElement);
			Fragments._Securitylevel__OclEnumeration.initOperations(_Securitylevel__OclEnumeration);
			Fragments._Securitylevel__OclType.initOperations(_Securitylevel__OclType);
			Fragments._Securitylevel__Securitylevel.initOperations(_Securitylevel__Securitylevel);

			Fragments._Service__Entity.initOperations(_Service__Entity);
			Fragments._Service__OclAny.initOperations(_Service__OclAny);
			Fragments._Service__OclElement.initOperations(_Service__OclElement);
			Fragments._Service__Resource.initOperations(_Service__Resource);
			Fragments._Service__Service.initOperations(_Service__Service);

			Fragments._Servingstatus__OclAny.initOperations(_Servingstatus__OclAny);
			Fragments._Servingstatus__OclElement.initOperations(_Servingstatus__OclElement);
			Fragments._Servingstatus__OclEnumeration.initOperations(_Servingstatus__OclEnumeration);
			Fragments._Servingstatus__OclType.initOperations(_Servingstatus__OclType);
			Fragments._Servingstatus__Servingstatus.initOperations(_Servingstatus__Servingstatus);

			Fragments._Shardby__OclAny.initOperations(_Shardby__OclAny);
			Fragments._Shardby__OclElement.initOperations(_Shardby__OclElement);
			Fragments._Shardby__OclEnumeration.initOperations(_Shardby__OclEnumeration);
			Fragments._Shardby__OclType.initOperations(_Shardby__OclType);
			Fragments._Shardby__Shardby.initOperations(_Shardby__Shardby);

			Fragments._Sslsettings__Entity.initOperations(_Sslsettings__Entity);
			Fragments._Sslsettings__OclAny.initOperations(_Sslsettings__OclAny);
			Fragments._Sslsettings__OclElement.initOperations(_Sslsettings__OclElement);
			Fragments._Sslsettings__Resource.initOperations(_Sslsettings__Resource);
			Fragments._Sslsettings__Sslsettings.initOperations(_Sslsettings__Sslsettings);

			Fragments._Sslsettingslink__Entity.initOperations(_Sslsettingslink__Entity);
			Fragments._Sslsettingslink__Link.initOperations(_Sslsettingslink__Link);
			Fragments._Sslsettingslink__OclAny.initOperations(_Sslsettingslink__OclAny);
			Fragments._Sslsettingslink__OclElement.initOperations(_Sslsettingslink__OclElement);
			Fragments._Sslsettingslink__Sslsettingslink.initOperations(_Sslsettingslink__Sslsettingslink);

			Fragments._Staticfileshandler__Entity.initOperations(_Staticfileshandler__Entity);
			Fragments._Staticfileshandler__OclAny.initOperations(_Staticfileshandler__OclAny);
			Fragments._Staticfileshandler__OclElement.initOperations(_Staticfileshandler__OclElement);
			Fragments._Staticfileshandler__Resource.initOperations(_Staticfileshandler__Resource);
			Fragments._Staticfileshandler__Staticfileshandler.initOperations(_Staticfileshandler__Staticfileshandler);

			Fragments._Staticfileshandlerlink__Entity.initOperations(_Staticfileshandlerlink__Entity);
			Fragments._Staticfileshandlerlink__Link.initOperations(_Staticfileshandlerlink__Link);
			Fragments._Staticfileshandlerlink__OclAny.initOperations(_Staticfileshandlerlink__OclAny);
			Fragments._Staticfileshandlerlink__OclElement.initOperations(_Staticfileshandlerlink__OclElement);
			Fragments._Staticfileshandlerlink__Staticfileshandlerlink.initOperations(_Staticfileshandlerlink__Staticfileshandlerlink);

			Fragments._Status__Entity.initOperations(_Status__Entity);
			Fragments._Status__OclAny.initOperations(_Status__OclAny);
			Fragments._Status__OclElement.initOperations(_Status__OclElement);
			Fragments._Status__Resource.initOperations(_Status__Resource);
			Fragments._Status__Status.initOperations(_Status__Status);

			Fragments._Statuslink__Entity.initOperations(_Statuslink__Entity);
			Fragments._Statuslink__Link.initOperations(_Statuslink__Link);
			Fragments._Statuslink__OclAny.initOperations(_Statuslink__OclAny);
			Fragments._Statuslink__OclElement.initOperations(_Statuslink__OclElement);
			Fragments._Statuslink__Statuslink.initOperations(_Statuslink__Statuslink);

			Fragments._Trafficsplit__Entity.initOperations(_Trafficsplit__Entity);
			Fragments._Trafficsplit__OclAny.initOperations(_Trafficsplit__OclAny);
			Fragments._Trafficsplit__OclElement.initOperations(_Trafficsplit__OclElement);
			Fragments._Trafficsplit__Resource.initOperations(_Trafficsplit__Resource);
			Fragments._Trafficsplit__Trafficsplit.initOperations(_Trafficsplit__Trafficsplit);

			Fragments._Trafficsplitlink__Entity.initOperations(_Trafficsplitlink__Entity);
			Fragments._Trafficsplitlink__Link.initOperations(_Trafficsplitlink__Link);
			Fragments._Trafficsplitlink__OclAny.initOperations(_Trafficsplitlink__OclAny);
			Fragments._Trafficsplitlink__OclElement.initOperations(_Trafficsplitlink__OclElement);
			Fragments._Trafficsplitlink__Trafficsplitlink.initOperations(_Trafficsplitlink__Trafficsplitlink);

			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__OclEnumeration.initOperations(_Type__OclEnumeration);
			Fragments._Type__OclType.initOperations(_Type__OclType);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._Urldispatchrule__Entity.initOperations(_Urldispatchrule__Entity);
			Fragments._Urldispatchrule__OclAny.initOperations(_Urldispatchrule__OclAny);
			Fragments._Urldispatchrule__OclElement.initOperations(_Urldispatchrule__OclElement);
			Fragments._Urldispatchrule__Resource.initOperations(_Urldispatchrule__Resource);
			Fragments._Urldispatchrule__Urldispatchrule.initOperations(_Urldispatchrule__Urldispatchrule);

			Fragments._Urlmap__Entity.initOperations(_Urlmap__Entity);
			Fragments._Urlmap__OclAny.initOperations(_Urlmap__OclAny);
			Fragments._Urlmap__OclElement.initOperations(_Urlmap__OclElement);
			Fragments._Urlmap__Resource.initOperations(_Urlmap__Resource);
			Fragments._Urlmap__Urlmap.initOperations(_Urlmap__Urlmap);

			Fragments._Version__Entity.initOperations(_Version__Entity);
			Fragments._Version__OclAny.initOperations(_Version__OclAny);
			Fragments._Version__OclElement.initOperations(_Version__OclElement);
			Fragments._Version__Resource.initOperations(_Version__Resource);
			Fragments._Version__Version.initOperations(_Version__Version);

			Fragments._VersionServingstatus__OclAny.initOperations(_VersionServingstatus__OclAny);
			Fragments._VersionServingstatus__OclElement.initOperations(_VersionServingstatus__OclElement);
			Fragments._VersionServingstatus__OclEnumeration.initOperations(_VersionServingstatus__OclEnumeration);
			Fragments._VersionServingstatus__OclType.initOperations(_VersionServingstatus__OclType);
			Fragments._VersionServingstatus__VersionServingstatus.initOperations(_VersionServingstatus__VersionServingstatus);

			Fragments._Volume__Entity.initOperations(_Volume__Entity);
			Fragments._Volume__OclAny.initOperations(_Volume__OclAny);
			Fragments._Volume__OclElement.initOperations(_Volume__OclElement);
			Fragments._Volume__Resource.initOperations(_Volume__Resource);
			Fragments._Volume__Volume.initOperations(_Volume__Volume);

			Fragments._Zipinfo__Entity.initOperations(_Zipinfo__Entity);
			Fragments._Zipinfo__OclAny.initOperations(_Zipinfo__OclAny);
			Fragments._Zipinfo__OclElement.initOperations(_Zipinfo__OclElement);
			Fragments._Zipinfo__Resource.initOperations(_Zipinfo__Resource);
			Fragments._Zipinfo__Zipinfo.initOperations(_Zipinfo__Zipinfo);

			Fragments._Zipinfolink__Entity.initOperations(_Zipinfolink__Entity);
			Fragments._Zipinfolink__Link.initOperations(_Zipinfolink__Link);
			Fragments._Zipinfolink__OclAny.initOperations(_Zipinfolink__OclAny);
			Fragments._Zipinfolink__OclElement.initOperations(_Zipinfolink__OclElement);
			Fragments._Zipinfolink__Zipinfolink.initOperations(_Zipinfolink__Zipinfolink);

			Fragments._any__OclAny.initOperations(_any__OclAny);
			Fragments._any__any.initOperations(_any__any);

			Fragments._array__OclAny.initOperations(_array__OclAny);
			Fragments._array__OclElement.initOperations(_array__OclElement);
			Fragments._array__array.initOperations(_array__array);

			Fragments._byte__OclAny.initOperations(_byte__OclAny);
			Fragments._byte__byte.initOperations(_byte__byte);

			Fragments._double__OclAny.initOperations(_double__OclAny);
			Fragments._double__double.initOperations(_double__double);

			Fragments._float__OclAny.initOperations(_float__OclAny);
			Fragments._float__float.initOperations(_float__float);

			Fragments._long__OclAny.initOperations(_long__OclAny);
			Fragments._long__long.initOperations(_long__long);

			Fragments._map__OclAny.initOperations(_map__OclAny);
			Fragments._map__map.initOperations(_map__map);

			Fragments._object__OclAny.initOperations(_object__OclAny);
			Fragments._object__object.initOperations(_object__object);

			Fragments._short__OclAny.initOperations(_short__OclAny);
			Fragments._short__short.initOperations(_short__short);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Action = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ApiConfigHandlerLogin = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apiconfighandler = {
			AppengineTables.Properties._Apiconfighandler__authFailAction,
			AppengineTables.Properties._Apiconfighandler__login,
			AppengineTables.Properties._Apiconfighandler__script,
			AppengineTables.Properties._Apiconfighandler__securityLevel,
			AppengineTables.Properties._Apiconfighandler__url
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apiconfighandlerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apiendpointhandler = {
			AppengineTables.Properties._Apiendpointhandler__scriptPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Apiendpointhandlerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Application = {
			AppengineTables.Properties._Application__authDomain,
			AppengineTables.Properties._Application__codeBucket,
			AppengineTables.Properties._Application__defaultBucket,
			AppengineTables.Properties._Application__defaultCookieExpiration,
			AppengineTables.Properties._Application__defaultHostname,
			AppengineTables.Properties._Application__dispatchRules,
			AppengineTables.Properties._Application__gcrDomain,
			AppengineTables.Properties._Application__locationId,
			AppengineTables.Properties._Application__name,
			AppengineTables.Properties._Application__servingStatus
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Authfailaction = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Authorizedcertificate = {
			AppengineTables.Properties._Authorizedcertificate__displayName,
			AppengineTables.Properties._Authorizedcertificate__domainMappingsCount,
			AppengineTables.Properties._Authorizedcertificate__domainNames,
			AppengineTables.Properties._Authorizedcertificate__expireTime,
			AppengineTables.Properties._Authorizedcertificate__name,
			AppengineTables.Properties._Authorizedcertificate__visibleDomainMappings
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Authorizeddomain = {
			AppengineTables.Properties._Authorizeddomain__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Automaticscaling = {
			AppengineTables.Properties._Automaticscaling__coolDownPeriod,
			AppengineTables.Properties._Automaticscaling__maxConcurrentRequests,
			AppengineTables.Properties._Automaticscaling__maxIdleInstances,
			AppengineTables.Properties._Automaticscaling__maxPendingLatency,
			AppengineTables.Properties._Automaticscaling__maxTotalInstances,
			AppengineTables.Properties._Automaticscaling__minIdleInstances,
			AppengineTables.Properties._Automaticscaling__minPendingLatency,
			AppengineTables.Properties._Automaticscaling__minTotalInstances
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Automaticscalinglink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Availability = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Basicscaling = {
			AppengineTables.Properties._Basicscaling__idleTimeout,
			AppengineTables.Properties._Basicscaling__maxInstances
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Basicscalinglink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Batchupdateingressrulesrequest = {
			AppengineTables.Properties._Batchupdateingressrulesrequest__ingressRules
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Batchupdateingressrulesresponse = {
			AppengineTables.Properties._Batchupdateingressrulesresponse__ingressRules
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Certificaterawdata = {
			AppengineTables.Properties._Certificaterawdata__privateKey,
			AppengineTables.Properties._Certificaterawdata__publicCertificate
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Certificaterawdatalink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Containerinfo = {
			AppengineTables.Properties._Containerinfo__image
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Containerinfolink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cpuutilization = {
			AppengineTables.Properties._Cpuutilization__aggregationWindowLength,
			AppengineTables.Properties._Cpuutilization__targetUtilization
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cpuutilizationlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Debuginstancerequest = {
			AppengineTables.Properties._Debuginstancerequest__sshKey
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Deployment = {
			AppengineTables.Properties._Deployment__files
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Deploymentlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Diskutilization = {
			AppengineTables.Properties._Diskutilization__targetReadBytesPerSecond,
			AppengineTables.Properties._Diskutilization__targetReadOpsPerSecond,
			AppengineTables.Properties._Diskutilization__targetWriteBytesPerSecond,
			AppengineTables.Properties._Diskutilization__targetWriteOpsPerSecond
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Diskutilizationlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Domainmapping = {
			AppengineTables.Properties._Domainmapping__name,
			AppengineTables.Properties._Domainmapping__resourceRecords
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Empty = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Endpointsapiservice = {
			AppengineTables.Properties._Endpointsapiservice__configId,
			AppengineTables.Properties._Endpointsapiservice__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Endpointsapiservicelink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Errorcode = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Errorhandler = {
			AppengineTables.Properties._Errorhandler__errorCode,
			AppengineTables.Properties._Errorhandler__mimeType,
			AppengineTables.Properties._Errorhandler__staticFile
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Featuresettings = {
			AppengineTables.Properties._Featuresettings__splitHealthChecks
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Featuresettingslink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Fileinfo = {
			AppengineTables.Properties._Fileinfo__mimeType,
			AppengineTables.Properties._Fileinfo__sha1Sum,
			AppengineTables.Properties._Fileinfo__sourceUrl
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Firewallrule = {
			AppengineTables.Properties._Firewallrule__action,
			AppengineTables.Properties._Firewallrule__description,
			AppengineTables.Properties._Firewallrule__priority,
			AppengineTables.Properties._Firewallrule__sourceRange
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Healthcheck = {
			AppengineTables.Properties._Healthcheck__checkInterval,
			AppengineTables.Properties._Healthcheck__disableHealthCheck,
			AppengineTables.Properties._Healthcheck__healthyThreshold,
			AppengineTables.Properties._Healthcheck__host,
			AppengineTables.Properties._Healthcheck__restartThreshold,
			AppengineTables.Properties._Healthcheck__timeout,
			AppengineTables.Properties._Healthcheck__unhealthyThreshold
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Healthchecklink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Identityawareproxy = {
			AppengineTables.Properties._Identityawareproxy__enabled,
			AppengineTables.Properties._Identityawareproxy__oauth2ClientId,
			AppengineTables.Properties._Identityawareproxy__oauth2ClientSecret,
			AppengineTables.Properties._Identityawareproxy__oauth2ClientSecretSha256
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Identityawareproxylink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Instance = {
			AppengineTables.Properties._Instance__appEngineRelease,
			AppengineTables.Properties._Instance__availability,
			AppengineTables.Properties._Instance__averageLatency,
			AppengineTables.Properties._Instance__errors,
			AppengineTables.Properties._Instance__memoryUsage,
			AppengineTables.Properties._Instance__name,
			AppengineTables.Properties._Instance__qps,
			AppengineTables.Properties._Instance__requests,
			AppengineTables.Properties._Instance__startTime,
			AppengineTables.Properties._Instance__vmDebugEnabled,
			AppengineTables.Properties._Instance__vmId,
			AppengineTables.Properties._Instance__vmIp,
			AppengineTables.Properties._Instance__vmName,
			AppengineTables.Properties._Instance__vmStatus,
			AppengineTables.Properties._Instance__vmZoneName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Library = {
			AppengineTables.Properties._Library__name,
			AppengineTables.Properties._Library__version
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listauthorizedcertificatesresponse = {
			AppengineTables.Properties._Listauthorizedcertificatesresponse__certificates,
			AppengineTables.Properties._Listauthorizedcertificatesresponse__nextPageToken
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listauthorizeddomainsresponse = {
			AppengineTables.Properties._Listauthorizeddomainsresponse__domains,
			AppengineTables.Properties._Listauthorizeddomainsresponse__nextPageToken
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listdomainmappingsresponse = {
			AppengineTables.Properties._Listdomainmappingsresponse__domainMappings,
			AppengineTables.Properties._Listdomainmappingsresponse__nextPageToken
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listingressrulesresponse = {
			AppengineTables.Properties._Listingressrulesresponse__ingressRules,
			AppengineTables.Properties._Listingressrulesresponse__nextPageToken
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listinstancesresponse = {
			AppengineTables.Properties._Listinstancesresponse__instances,
			AppengineTables.Properties._Listinstancesresponse__nextPageToken
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listlocationsresponse = {
			AppengineTables.Properties._Listlocationsresponse__locations,
			AppengineTables.Properties._Listlocationsresponse__nextPageToken
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listoperationsresponse = {
			AppengineTables.Properties._Listoperationsresponse__nextPageToken,
			AppengineTables.Properties._Listoperationsresponse__operations
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listservicesresponse = {
			AppengineTables.Properties._Listservicesresponse__nextPageToken,
			AppengineTables.Properties._Listservicesresponse__services
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Listversionsresponse = {
			AppengineTables.Properties._Listversionsresponse__nextPageToken,
			AppengineTables.Properties._Listversionsresponse__versions
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Livenesscheck = {
			AppengineTables.Properties._Livenesscheck__checkInterval,
			AppengineTables.Properties._Livenesscheck__failureThreshold,
			AppengineTables.Properties._Livenesscheck__host,
			AppengineTables.Properties._Livenesscheck__initialDelay,
			AppengineTables.Properties._Livenesscheck__path,
			AppengineTables.Properties._Livenesscheck__successThreshold,
			AppengineTables.Properties._Livenesscheck__timeout
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Livenesschecklink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Location = {
			AppengineTables.Properties._Location__labels,
			AppengineTables.Properties._Location__locationId,
			AppengineTables.Properties._Location__metadata,
			AppengineTables.Properties._Location__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Locationmetadata = {
			AppengineTables.Properties._Locationmetadata__flexibleEnvironmentAvailable,
			AppengineTables.Properties._Locationmetadata__standardEnvironmentAvailable
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Login = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manualscaling = {
			AppengineTables.Properties._Manualscaling__instances
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Manualscalinglink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Network = {
			AppengineTables.Properties._Network__forwardedPorts,
			AppengineTables.Properties._Network__instanceTag,
			AppengineTables.Properties._Network__name,
			AppengineTables.Properties._Network__subnetworkName
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networklink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networkutilization = {
			AppengineTables.Properties._Networkutilization__targetReceivedBytesPerSecond,
			AppengineTables.Properties._Networkutilization__targetReceivedPacketsPerSecond,
			AppengineTables.Properties._Networkutilization__targetSentBytesPerSecond,
			AppengineTables.Properties._Networkutilization__targetSentPacketsPerSecond
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networkutilizationlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operation = {
			AppengineTables.Properties._Operation__done,
			AppengineTables.Properties._Operation__metadata,
			AppengineTables.Properties._Operation__name,
			AppengineTables.Properties._Operation__response
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operationmetadata = {
			AppengineTables.Properties._Operationmetadata__endTime,
			AppengineTables.Properties._Operationmetadata__insertTime,
			AppengineTables.Properties._Operationmetadata__method,
			AppengineTables.Properties._Operationmetadata__operationType,
			AppengineTables.Properties._Operationmetadata__target,
			AppengineTables.Properties._Operationmetadata__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operationmetadataexperimental = {
			AppengineTables.Properties._Operationmetadataexperimental__endTime,
			AppengineTables.Properties._Operationmetadataexperimental__insertTime,
			AppengineTables.Properties._Operationmetadataexperimental__method,
			AppengineTables.Properties._Operationmetadataexperimental__target,
			AppengineTables.Properties._Operationmetadataexperimental__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operationmetadatav1 = {
			AppengineTables.Properties._Operationmetadatav1__endTime,
			AppengineTables.Properties._Operationmetadatav1__ephemeralMessage,
			AppengineTables.Properties._Operationmetadatav1__insertTime,
			AppengineTables.Properties._Operationmetadatav1__method,
			AppengineTables.Properties._Operationmetadatav1__target,
			AppengineTables.Properties._Operationmetadatav1__user,
			AppengineTables.Properties._Operationmetadatav1__warning
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operationmetadatav1alpha = {
			AppengineTables.Properties._Operationmetadatav1alpha__endTime,
			AppengineTables.Properties._Operationmetadatav1alpha__ephemeralMessage,
			AppengineTables.Properties._Operationmetadatav1alpha__insertTime,
			AppengineTables.Properties._Operationmetadatav1alpha__method,
			AppengineTables.Properties._Operationmetadatav1alpha__target,
			AppengineTables.Properties._Operationmetadatav1alpha__user,
			AppengineTables.Properties._Operationmetadatav1alpha__warning
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operationmetadatav1beta = {
			AppengineTables.Properties._Operationmetadatav1beta__endTime,
			AppengineTables.Properties._Operationmetadatav1beta__ephemeralMessage,
			AppengineTables.Properties._Operationmetadatav1beta__insertTime,
			AppengineTables.Properties._Operationmetadatav1beta__method,
			AppengineTables.Properties._Operationmetadatav1beta__target,
			AppengineTables.Properties._Operationmetadatav1beta__user,
			AppengineTables.Properties._Operationmetadatav1beta__warning
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Operationmetadatav1beta5 = {
			AppengineTables.Properties._Operationmetadatav1beta5__endTime,
			AppengineTables.Properties._Operationmetadatav1beta5__insertTime,
			AppengineTables.Properties._Operationmetadatav1beta5__method,
			AppengineTables.Properties._Operationmetadatav1beta5__target,
			AppengineTables.Properties._Operationmetadatav1beta5__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Readinesscheck = {
			AppengineTables.Properties._Readinesscheck__appStartTimeout,
			AppengineTables.Properties._Readinesscheck__checkInterval,
			AppengineTables.Properties._Readinesscheck__failureThreshold,
			AppengineTables.Properties._Readinesscheck__host,
			AppengineTables.Properties._Readinesscheck__path,
			AppengineTables.Properties._Readinesscheck__successThreshold,
			AppengineTables.Properties._Readinesscheck__timeout
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Readinesschecklink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Redirecthttpresponsecode = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Repairapplicationrequest = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Requestutilization = {
			AppengineTables.Properties._Requestutilization__targetConcurrentRequests,
			AppengineTables.Properties._Requestutilization__targetRequestCountPerSecond
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Requestutilizationlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Resourcerecord = {
			AppengineTables.Properties._Resourcerecord__name,
			AppengineTables.Properties._Resourcerecord__rrdata,
			AppengineTables.Properties._Resourcerecord__type
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Resources = {
			AppengineTables.Properties._Resources__cpu,
			AppengineTables.Properties._Resources__diskGb,
			AppengineTables.Properties._Resources__memoryGb,
			AppengineTables.Properties._Resources__volumes
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Resourceslink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scripthandler = {
			AppengineTables.Properties._Scripthandler__scriptPath
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Scripthandlerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Securitylevel = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Service = {
			AppengineTables.Properties._Service__name
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Servingstatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Shardby = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sslsettings = {
			AppengineTables.Properties._Sslsettings__certificateId
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sslsettingslink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Staticfileshandler = {
			AppengineTables.Properties._Staticfileshandler__applicationReadable,
			AppengineTables.Properties._Staticfileshandler__expiration,
			AppengineTables.Properties._Staticfileshandler__httpHeaders,
			AppengineTables.Properties._Staticfileshandler__mimeType,
			AppengineTables.Properties._Staticfileshandler__path,
			AppengineTables.Properties._Staticfileshandler__requireMatchingFile,
			AppengineTables.Properties._Staticfileshandler__uploadPathRegex
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Staticfileshandlerlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Status = {
			AppengineTables.Properties._Status__code,
			AppengineTables.Properties._Status__details,
			AppengineTables.Properties._Status__message
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Statuslink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Trafficsplit = {
			AppengineTables.Properties._Trafficsplit__allocations,
			AppengineTables.Properties._Trafficsplit__shardBy
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Trafficsplitlink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Type = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Urldispatchrule = {
			AppengineTables.Properties._Urldispatchrule__domain,
			AppengineTables.Properties._Urldispatchrule__path,
			AppengineTables.Properties._Urldispatchrule__service
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Urlmap = {
			AppengineTables.Properties._Urlmap__authFailAction,
			AppengineTables.Properties._Urlmap__login,
			AppengineTables.Properties._Urlmap__redirectHttpResponseCode,
			AppengineTables.Properties._Urlmap__securityLevel,
			AppengineTables.Properties._Urlmap__urlRegex
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Version = {
			AppengineTables.Properties._Version__betaSettings,
			AppengineTables.Properties._Version__createTime,
			AppengineTables.Properties._Version__createdBy,
			AppengineTables.Properties._Version__defaultExpiration,
			AppengineTables.Properties._Version__diskUsageBytes,
			AppengineTables.Properties._Version__env,
			AppengineTables.Properties._Version__envVariables,
			AppengineTables.Properties._Version__errorHandlers,
			AppengineTables.Properties._Version__handlers,
			AppengineTables.Properties._Version__inboundServices,
			AppengineTables.Properties._Version__instanceClass,
			AppengineTables.Properties._Version__libraries,
			AppengineTables.Properties._Version__name,
			AppengineTables.Properties._Version__nobuildFilesRegex,
			AppengineTables.Properties._Version__runtime,
			AppengineTables.Properties._Version__runtimeApiVersion,
			AppengineTables.Properties._Version__servingStatus,
			AppengineTables.Properties._Version__threadsafe,
			AppengineTables.Properties._Version__versionUrl,
			AppengineTables.Properties._Version__vm
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VersionServingstatus = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Volume = {
			AppengineTables.Properties._Volume__name,
			AppengineTables.Properties._Volume__sizeGb,
			AppengineTables.Properties._Volume__volumeType
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zipinfo = {
			AppengineTables.Properties._Zipinfo__filesCount,
			AppengineTables.Properties._Zipinfo__sourceUrl
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Zipinfolink = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _any = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _array = {
			AppengineTables.Properties._array__values
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _byte = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _double = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _float = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _long = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _map = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _object = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _short = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._ApiConfigHandlerAuthfailaction__ApiConfigHandlerAuthfailaction.initProperties(_ApiConfigHandlerAuthfailaction);
			Fragments._ApiConfigHandlerLogin__ApiConfigHandlerLogin.initProperties(_ApiConfigHandlerLogin);
			Fragments._ApiConfigHandlerSecuritylevel__ApiConfigHandlerSecuritylevel.initProperties(_ApiConfigHandlerSecuritylevel);
			Fragments._Apiconfighandler__Apiconfighandler.initProperties(_Apiconfighandler);
			Fragments._Apiconfighandlerlink__Apiconfighandlerlink.initProperties(_Apiconfighandlerlink);
			Fragments._Apiendpointhandler__Apiendpointhandler.initProperties(_Apiendpointhandler);
			Fragments._Apiendpointhandlerlink__Apiendpointhandlerlink.initProperties(_Apiendpointhandlerlink);
			Fragments._Application__Application.initProperties(_Application);
			Fragments._Authfailaction__Authfailaction.initProperties(_Authfailaction);
			Fragments._Authorizedcertificate__Authorizedcertificate.initProperties(_Authorizedcertificate);
			Fragments._Authorizeddomain__Authorizeddomain.initProperties(_Authorizeddomain);
			Fragments._Automaticscaling__Automaticscaling.initProperties(_Automaticscaling);
			Fragments._Automaticscalinglink__Automaticscalinglink.initProperties(_Automaticscalinglink);
			Fragments._Availability__Availability.initProperties(_Availability);
			Fragments._Basicscaling__Basicscaling.initProperties(_Basicscaling);
			Fragments._Basicscalinglink__Basicscalinglink.initProperties(_Basicscalinglink);
			Fragments._Batchupdateingressrulesrequest__Batchupdateingressrulesrequest.initProperties(_Batchupdateingressrulesrequest);
			Fragments._Batchupdateingressrulesresponse__Batchupdateingressrulesresponse.initProperties(_Batchupdateingressrulesresponse);
			Fragments._Certificaterawdata__Certificaterawdata.initProperties(_Certificaterawdata);
			Fragments._Certificaterawdatalink__Certificaterawdatalink.initProperties(_Certificaterawdatalink);
			Fragments._Containerinfo__Containerinfo.initProperties(_Containerinfo);
			Fragments._Containerinfolink__Containerinfolink.initProperties(_Containerinfolink);
			Fragments._Cpuutilization__Cpuutilization.initProperties(_Cpuutilization);
			Fragments._Cpuutilizationlink__Cpuutilizationlink.initProperties(_Cpuutilizationlink);
			Fragments._Debuginstancerequest__Debuginstancerequest.initProperties(_Debuginstancerequest);
			Fragments._Deployment__Deployment.initProperties(_Deployment);
			Fragments._Deploymentlink__Deploymentlink.initProperties(_Deploymentlink);
			Fragments._Diskutilization__Diskutilization.initProperties(_Diskutilization);
			Fragments._Diskutilizationlink__Diskutilizationlink.initProperties(_Diskutilizationlink);
			Fragments._Domainmapping__Domainmapping.initProperties(_Domainmapping);
			Fragments._Empty__Empty.initProperties(_Empty);
			Fragments._Endpointsapiservice__Endpointsapiservice.initProperties(_Endpointsapiservice);
			Fragments._Endpointsapiservicelink__Endpointsapiservicelink.initProperties(_Endpointsapiservicelink);
			Fragments._Errorcode__Errorcode.initProperties(_Errorcode);
			Fragments._Errorhandler__Errorhandler.initProperties(_Errorhandler);
			Fragments._Featuresettings__Featuresettings.initProperties(_Featuresettings);
			Fragments._Featuresettingslink__Featuresettingslink.initProperties(_Featuresettingslink);
			Fragments._Fileinfo__Fileinfo.initProperties(_Fileinfo);
			Fragments._Firewallrule__Firewallrule.initProperties(_Firewallrule);
			Fragments._Healthcheck__Healthcheck.initProperties(_Healthcheck);
			Fragments._Healthchecklink__Healthchecklink.initProperties(_Healthchecklink);
			Fragments._Identityawareproxy__Identityawareproxy.initProperties(_Identityawareproxy);
			Fragments._Identityawareproxylink__Identityawareproxylink.initProperties(_Identityawareproxylink);
			Fragments._Instance__Instance.initProperties(_Instance);
			Fragments._Library__Library.initProperties(_Library);
			Fragments._Listauthorizedcertificatesresponse__Listauthorizedcertificatesresponse.initProperties(_Listauthorizedcertificatesresponse);
			Fragments._Listauthorizeddomainsresponse__Listauthorizeddomainsresponse.initProperties(_Listauthorizeddomainsresponse);
			Fragments._Listdomainmappingsresponse__Listdomainmappingsresponse.initProperties(_Listdomainmappingsresponse);
			Fragments._Listingressrulesresponse__Listingressrulesresponse.initProperties(_Listingressrulesresponse);
			Fragments._Listinstancesresponse__Listinstancesresponse.initProperties(_Listinstancesresponse);
			Fragments._Listlocationsresponse__Listlocationsresponse.initProperties(_Listlocationsresponse);
			Fragments._Listoperationsresponse__Listoperationsresponse.initProperties(_Listoperationsresponse);
			Fragments._Listservicesresponse__Listservicesresponse.initProperties(_Listservicesresponse);
			Fragments._Listversionsresponse__Listversionsresponse.initProperties(_Listversionsresponse);
			Fragments._Livenesscheck__Livenesscheck.initProperties(_Livenesscheck);
			Fragments._Livenesschecklink__Livenesschecklink.initProperties(_Livenesschecklink);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._Locationmetadata__Locationmetadata.initProperties(_Locationmetadata);
			Fragments._Login__Login.initProperties(_Login);
			Fragments._Manualscaling__Manualscaling.initProperties(_Manualscaling);
			Fragments._Manualscalinglink__Manualscalinglink.initProperties(_Manualscalinglink);
			Fragments._Network__Network.initProperties(_Network);
			Fragments._Networklink__Networklink.initProperties(_Networklink);
			Fragments._Networkutilization__Networkutilization.initProperties(_Networkutilization);
			Fragments._Networkutilizationlink__Networkutilizationlink.initProperties(_Networkutilizationlink);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._Operationmetadata__Operationmetadata.initProperties(_Operationmetadata);
			Fragments._Operationmetadataexperimental__Operationmetadataexperimental.initProperties(_Operationmetadataexperimental);
			Fragments._Operationmetadatav1__Operationmetadatav1.initProperties(_Operationmetadatav1);
			Fragments._Operationmetadatav1alpha__Operationmetadatav1alpha.initProperties(_Operationmetadatav1alpha);
			Fragments._Operationmetadatav1beta__Operationmetadatav1beta.initProperties(_Operationmetadatav1beta);
			Fragments._Operationmetadatav1beta5__Operationmetadatav1beta5.initProperties(_Operationmetadatav1beta5);
			Fragments._Readinesscheck__Readinesscheck.initProperties(_Readinesscheck);
			Fragments._Readinesschecklink__Readinesschecklink.initProperties(_Readinesschecklink);
			Fragments._Redirecthttpresponsecode__Redirecthttpresponsecode.initProperties(_Redirecthttpresponsecode);
			Fragments._Repairapplicationrequest__Repairapplicationrequest.initProperties(_Repairapplicationrequest);
			Fragments._Requestutilization__Requestutilization.initProperties(_Requestutilization);
			Fragments._Requestutilizationlink__Requestutilizationlink.initProperties(_Requestutilizationlink);
			Fragments._Resourcerecord__Resourcerecord.initProperties(_Resourcerecord);
			Fragments._Resources__Resources.initProperties(_Resources);
			Fragments._Resourceslink__Resourceslink.initProperties(_Resourceslink);
			Fragments._Scripthandler__Scripthandler.initProperties(_Scripthandler);
			Fragments._Scripthandlerlink__Scripthandlerlink.initProperties(_Scripthandlerlink);
			Fragments._Securitylevel__Securitylevel.initProperties(_Securitylevel);
			Fragments._Service__Service.initProperties(_Service);
			Fragments._Servingstatus__Servingstatus.initProperties(_Servingstatus);
			Fragments._Shardby__Shardby.initProperties(_Shardby);
			Fragments._Sslsettings__Sslsettings.initProperties(_Sslsettings);
			Fragments._Sslsettingslink__Sslsettingslink.initProperties(_Sslsettingslink);
			Fragments._Staticfileshandler__Staticfileshandler.initProperties(_Staticfileshandler);
			Fragments._Staticfileshandlerlink__Staticfileshandlerlink.initProperties(_Staticfileshandlerlink);
			Fragments._Status__Status.initProperties(_Status);
			Fragments._Statuslink__Statuslink.initProperties(_Statuslink);
			Fragments._Trafficsplit__Trafficsplit.initProperties(_Trafficsplit);
			Fragments._Trafficsplitlink__Trafficsplitlink.initProperties(_Trafficsplitlink);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._Urldispatchrule__Urldispatchrule.initProperties(_Urldispatchrule);
			Fragments._Urlmap__Urlmap.initProperties(_Urlmap);
			Fragments._Version__Version.initProperties(_Version);
			Fragments._VersionServingstatus__VersionServingstatus.initProperties(_VersionServingstatus);
			Fragments._Volume__Volume.initProperties(_Volume);
			Fragments._Zipinfo__Zipinfo.initProperties(_Zipinfo);
			Fragments._Zipinfolink__Zipinfolink.initProperties(_Zipinfolink);
			Fragments._any__any.initProperties(_any);
			Fragments._array__array.initProperties(_array);
			Fragments._byte__byte.initProperties(_byte);
			Fragments._double__double.initProperties(_double);
			Fragments._float__float.initProperties(_float);
			Fragments._long__long.initProperties(_long);
			Fragments._map__map.initProperties(_map);
			Fragments._object__object.initProperties(_object);
			Fragments._short__short.initProperties(_short);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Action__UNSPECIFIED_ACTION = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ACTION.getEEnumLiteral("UNSPECIFIED_ACTION"), Types._Action, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Action__ALLOW = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ACTION.getEEnumLiteral("ALLOW"), Types._Action, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Action__DENY = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ACTION.getEEnumLiteral("DENY"), Types._Action, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Action = {
			_Action__UNSPECIFIED_ACTION,
			_Action__ALLOW,
			_Action__DENY
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerAuthfailaction__AUTH_FAIL_ACTION_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_AUTHFAILACTION.getEEnumLiteral("AUTH_FAIL_ACTION_UNSPECIFIED"), Types._ApiConfigHandlerAuthfailaction, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerAuthfailaction__AUTH_FAIL_ACTION_REDIRECT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_AUTHFAILACTION.getEEnumLiteral("AUTH_FAIL_ACTION_REDIRECT"), Types._ApiConfigHandlerAuthfailaction, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerAuthfailaction__AUTH_FAIL_ACTION_UNAUTHORIZED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_AUTHFAILACTION.getEEnumLiteral("AUTH_FAIL_ACTION_UNAUTHORIZED"), Types._ApiConfigHandlerAuthfailaction, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ApiConfigHandlerAuthfailaction = {
			_ApiConfigHandlerAuthfailaction__AUTH_FAIL_ACTION_UNSPECIFIED,
			_ApiConfigHandlerAuthfailaction__AUTH_FAIL_ACTION_REDIRECT,
			_ApiConfigHandlerAuthfailaction__AUTH_FAIL_ACTION_UNAUTHORIZED
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerLogin__LOGIN_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_LOGIN.getEEnumLiteral("LOGIN_UNSPECIFIED"), Types._ApiConfigHandlerLogin, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerLogin__LOGIN_OPTIONAL = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_LOGIN.getEEnumLiteral("LOGIN_OPTIONAL"), Types._ApiConfigHandlerLogin, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerLogin__LOGIN_ADMIN = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_LOGIN.getEEnumLiteral("LOGIN_ADMIN"), Types._ApiConfigHandlerLogin, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerLogin__LOGIN_REQUIRED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_LOGIN.getEEnumLiteral("LOGIN_REQUIRED"), Types._ApiConfigHandlerLogin, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ApiConfigHandlerLogin = {
			_ApiConfigHandlerLogin__LOGIN_UNSPECIFIED,
			_ApiConfigHandlerLogin__LOGIN_OPTIONAL,
			_ApiConfigHandlerLogin__LOGIN_ADMIN,
			_ApiConfigHandlerLogin__LOGIN_REQUIRED
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerSecuritylevel__SECURE_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_SECURITYLEVEL.getEEnumLiteral("SECURE_UNSPECIFIED"), Types._ApiConfigHandlerSecuritylevel, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerSecuritylevel__SECURE_DEFAULT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_SECURITYLEVEL.getEEnumLiteral("SECURE_DEFAULT"), Types._ApiConfigHandlerSecuritylevel, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerSecuritylevel__SECURE_NEVER = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_SECURITYLEVEL.getEEnumLiteral("SECURE_NEVER"), Types._ApiConfigHandlerSecuritylevel, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerSecuritylevel__SECURE_OPTIONAL = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_SECURITYLEVEL.getEEnumLiteral("SECURE_OPTIONAL"), Types._ApiConfigHandlerSecuritylevel, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _ApiConfigHandlerSecuritylevel__SECURE_ALWAYS = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.API_CONFIG_HANDLER_SECURITYLEVEL.getEEnumLiteral("SECURE_ALWAYS"), Types._ApiConfigHandlerSecuritylevel, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ApiConfigHandlerSecuritylevel = {
			_ApiConfigHandlerSecuritylevel__SECURE_UNSPECIFIED,
			_ApiConfigHandlerSecuritylevel__SECURE_DEFAULT,
			_ApiConfigHandlerSecuritylevel__SECURE_NEVER,
			_ApiConfigHandlerSecuritylevel__SECURE_OPTIONAL,
			_ApiConfigHandlerSecuritylevel__SECURE_ALWAYS
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Authfailaction__AUTH_FAIL_ACTION_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.AUTHFAILACTION.getEEnumLiteral("AUTH_FAIL_ACTION_UNSPECIFIED"), Types._Authfailaction, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Authfailaction__AUTH_FAIL_ACTION_REDIRECT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.AUTHFAILACTION.getEEnumLiteral("AUTH_FAIL_ACTION_REDIRECT"), Types._Authfailaction, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Authfailaction__AUTH_FAIL_ACTION_UNAUTHORIZED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.AUTHFAILACTION.getEEnumLiteral("AUTH_FAIL_ACTION_UNAUTHORIZED"), Types._Authfailaction, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Authfailaction = {
			_Authfailaction__AUTH_FAIL_ACTION_UNSPECIFIED,
			_Authfailaction__AUTH_FAIL_ACTION_REDIRECT,
			_Authfailaction__AUTH_FAIL_ACTION_UNAUTHORIZED
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Availability__UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.AVAILABILITY.getEEnumLiteral("UNSPECIFIED"), Types._Availability, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Availability__RESIDENT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.AVAILABILITY.getEEnumLiteral("RESIDENT"), Types._Availability, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Availability__DYNAMIC = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.AVAILABILITY.getEEnumLiteral("DYNAMIC"), Types._Availability, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Availability = {
			_Availability__UNSPECIFIED,
			_Availability__RESIDENT,
			_Availability__DYNAMIC
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Errorcode__ERROR_CODE_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ERRORCODE.getEEnumLiteral("ERROR_CODE_UNSPECIFIED"), Types._Errorcode, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Errorcode__ERROR_CODE_DEFAULT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ERRORCODE.getEEnumLiteral("ERROR_CODE_DEFAULT"), Types._Errorcode, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Errorcode__ERROR_CODE_OVER_QUOTA = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ERRORCODE.getEEnumLiteral("ERROR_CODE_OVER_QUOTA"), Types._Errorcode, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Errorcode__ERROR_CODE_DOS_API_DENIAL = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ERRORCODE.getEEnumLiteral("ERROR_CODE_DOS_API_DENIAL"), Types._Errorcode, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Errorcode__ERROR_CODE_TIMEOUT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.ERRORCODE.getEEnumLiteral("ERROR_CODE_TIMEOUT"), Types._Errorcode, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Errorcode = {
			_Errorcode__ERROR_CODE_UNSPECIFIED,
			_Errorcode__ERROR_CODE_DEFAULT,
			_Errorcode__ERROR_CODE_OVER_QUOTA,
			_Errorcode__ERROR_CODE_DOS_API_DENIAL,
			_Errorcode__ERROR_CODE_TIMEOUT
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Login__LOGIN_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.LOGIN.getEEnumLiteral("LOGIN_UNSPECIFIED"), Types._Login, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Login__LOGIN_OPTIONAL = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.LOGIN.getEEnumLiteral("LOGIN_OPTIONAL"), Types._Login, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Login__LOGIN_ADMIN = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.LOGIN.getEEnumLiteral("LOGIN_ADMIN"), Types._Login, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Login__LOGIN_REQUIRED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.LOGIN.getEEnumLiteral("LOGIN_REQUIRED"), Types._Login, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Login = {
			_Login__LOGIN_UNSPECIFIED,
			_Login__LOGIN_OPTIONAL,
			_Login__LOGIN_ADMIN,
			_Login__LOGIN_REQUIRED
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.REDIRECTHTTPRESPONSECODE.getEEnumLiteral("REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED"), Types._Redirecthttpresponsecode, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_301 = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.REDIRECTHTTPRESPONSECODE.getEEnumLiteral("REDIRECT_HTTP_RESPONSE_CODE_301"), Types._Redirecthttpresponsecode, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_302 = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.REDIRECTHTTPRESPONSECODE.getEEnumLiteral("REDIRECT_HTTP_RESPONSE_CODE_302"), Types._Redirecthttpresponsecode, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_303 = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.REDIRECTHTTPRESPONSECODE.getEEnumLiteral("REDIRECT_HTTP_RESPONSE_CODE_303"), Types._Redirecthttpresponsecode, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_307 = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.REDIRECTHTTPRESPONSECODE.getEEnumLiteral("REDIRECT_HTTP_RESPONSE_CODE_307"), Types._Redirecthttpresponsecode, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Redirecthttpresponsecode = {
			_Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED,
			_Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_301,
			_Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_302,
			_Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_303,
			_Redirecthttpresponsecode__REDIRECT_HTTP_RESPONSE_CODE_307
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Securitylevel__SECURE_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SECURITYLEVEL.getEEnumLiteral("SECURE_UNSPECIFIED"), Types._Securitylevel, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Securitylevel__SECURE_DEFAULT = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SECURITYLEVEL.getEEnumLiteral("SECURE_DEFAULT"), Types._Securitylevel, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Securitylevel__SECURE_NEVER = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SECURITYLEVEL.getEEnumLiteral("SECURE_NEVER"), Types._Securitylevel, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Securitylevel__SECURE_OPTIONAL = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SECURITYLEVEL.getEEnumLiteral("SECURE_OPTIONAL"), Types._Securitylevel, 3);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Securitylevel__SECURE_ALWAYS = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SECURITYLEVEL.getEEnumLiteral("SECURE_ALWAYS"), Types._Securitylevel, 4);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Securitylevel = {
			_Securitylevel__SECURE_UNSPECIFIED,
			_Securitylevel__SECURE_DEFAULT,
			_Securitylevel__SECURE_NEVER,
			_Securitylevel__SECURE_OPTIONAL,
			_Securitylevel__SECURE_ALWAYS
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Servingstatus__UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SERVINGSTATUS.getEEnumLiteral("UNSPECIFIED"), Types._Servingstatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Servingstatus__SERVING = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SERVINGSTATUS.getEEnumLiteral("SERVING"), Types._Servingstatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Servingstatus__USER_DISABLED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SERVINGSTATUS.getEEnumLiteral("USER_DISABLED"), Types._Servingstatus, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Servingstatus__SYSTEM_DISABLED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SERVINGSTATUS.getEEnumLiteral("SYSTEM_DISABLED"), Types._Servingstatus, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Servingstatus = {
			_Servingstatus__UNSPECIFIED,
			_Servingstatus__SERVING,
			_Servingstatus__USER_DISABLED,
			_Servingstatus__SYSTEM_DISABLED
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Shardby__UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SHARDBY.getEEnumLiteral("UNSPECIFIED"), Types._Shardby, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Shardby__COOKIE = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SHARDBY.getEEnumLiteral("COOKIE"), Types._Shardby, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Shardby__IP = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SHARDBY.getEEnumLiteral("IP"), Types._Shardby, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Shardby__RANDOM = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.SHARDBY.getEEnumLiteral("RANDOM"), Types._Shardby, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Shardby = {
			_Shardby__UNSPECIFIED,
			_Shardby__COOKIE,
			_Shardby__IP,
			_Shardby__RANDOM
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Type__RECORD_TYPE_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.TYPE.getEEnumLiteral("RECORD_TYPE_UNSPECIFIED"), Types._Type, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Type__A = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.TYPE.getEEnumLiteral("A"), Types._Type, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Type__AAAA = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.TYPE.getEEnumLiteral("AAAA"), Types._Type, 2);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _Type__CNAME = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.TYPE.getEEnumLiteral("CNAME"), Types._Type, 3);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Type = {
			_Type__RECORD_TYPE_UNSPECIFIED,
			_Type__A,
			_Type__AAAA,
			_Type__CNAME
		};

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VersionServingstatus__SERVING_STATUS_UNSPECIFIED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.VERSION_SERVINGSTATUS.getEEnumLiteral("SERVING_STATUS_UNSPECIFIED"), Types._VersionServingstatus, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VersionServingstatus__SERVING = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.VERSION_SERVINGSTATUS.getEEnumLiteral("SERVING"), Types._VersionServingstatus, 1);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _VersionServingstatus__STOPPED = new EcoreExecutorEnumerationLiteral(AppenginePackage.Literals.VERSION_SERVINGSTATUS.getEEnumLiteral("STOPPED"), Types._VersionServingstatus, 2);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _VersionServingstatus = {
			_VersionServingstatus__SERVING_STATUS_UNSPECIFIED,
			_VersionServingstatus__SERVING,
			_VersionServingstatus__STOPPED
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Action.initLiterals(_Action);
			Types._ApiConfigHandlerAuthfailaction.initLiterals(_ApiConfigHandlerAuthfailaction);
			Types._ApiConfigHandlerLogin.initLiterals(_ApiConfigHandlerLogin);
			Types._ApiConfigHandlerSecuritylevel.initLiterals(_ApiConfigHandlerSecuritylevel);
			Types._Authfailaction.initLiterals(_Authfailaction);
			Types._Availability.initLiterals(_Availability);
			Types._Errorcode.initLiterals(_Errorcode);
			Types._Login.initLiterals(_Login);
			Types._Redirecthttpresponsecode.initLiterals(_Redirecthttpresponsecode);
			Types._Securitylevel.initLiterals(_Securitylevel);
			Types._Servingstatus.initLiterals(_Servingstatus);
			Types._Shardby.initLiterals(_Shardby);
			Types._Type.initLiterals(_Type);
			Types._VersionServingstatus.initLiterals(_VersionServingstatus);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AppengineTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
