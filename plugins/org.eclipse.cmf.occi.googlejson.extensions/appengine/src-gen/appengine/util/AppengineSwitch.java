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
package appengine.util;

import appengine.*;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see appengine.AppenginePackage
 * @generated
 */
public class AppengineSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppenginePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppengineSwitch() {
		if (modelPackage == null) {
			modelPackage = AppenginePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AppenginePackage.ARRAY: {
				array array = (array)theEObject;
				T result = casearray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.CPUUTILIZATION: {
				Cpuutilization cpuutilization = (Cpuutilization)theEObject;
				T result = caseCpuutilization(cpuutilization);
				if (result == null) result = caseResource(cpuutilization);
				if (result == null) result = caseEntity(cpuutilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.STATUS: {
				Status status = (Status)theEObject;
				T result = caseStatus(status);
				if (result == null) result = caseResource(status);
				if (result == null) result = caseEntity(status);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.IDENTITYAWAREPROXY: {
				Identityawareproxy identityawareproxy = (Identityawareproxy)theEObject;
				T result = caseIdentityawareproxy(identityawareproxy);
				if (result == null) result = caseResource(identityawareproxy);
				if (result == null) result = caseEntity(identityawareproxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.MANUALSCALING: {
				Manualscaling manualscaling = (Manualscaling)theEObject;
				T result = caseManualscaling(manualscaling);
				if (result == null) result = caseResource(manualscaling);
				if (result == null) result = caseEntity(manualscaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LOCATIONMETADATA: {
				Locationmetadata locationmetadata = (Locationmetadata)theEObject;
				T result = caseLocationmetadata(locationmetadata);
				if (result == null) result = caseResource(locationmetadata);
				if (result == null) result = caseEntity(locationmetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.TRAFFICSPLITLINK: {
				Trafficsplitlink trafficsplitlink = (Trafficsplitlink)theEObject;
				T result = caseTrafficsplitlink(trafficsplitlink);
				if (result == null) result = caseLink(trafficsplitlink);
				if (result == null) result = caseEntity(trafficsplitlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseResource(service);
				if (result == null) result = caseEntity(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTOPERATIONSRESPONSE: {
				Listoperationsresponse listoperationsresponse = (Listoperationsresponse)theEObject;
				T result = caseListoperationsresponse(listoperationsresponse);
				if (result == null) result = caseResource(listoperationsresponse);
				if (result == null) result = caseEntity(listoperationsresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATIONMETADATA: {
				Operationmetadata operationmetadata = (Operationmetadata)theEObject;
				T result = caseOperationmetadata(operationmetadata);
				if (result == null) result = caseResource(operationmetadata);
				if (result == null) result = caseEntity(operationmetadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.FIREWALLRULE: {
				Firewallrule firewallrule = (Firewallrule)theEObject;
				T result = caseFirewallrule(firewallrule);
				if (result == null) result = caseResource(firewallrule);
				if (result == null) result = caseEntity(firewallrule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTAUTHORIZEDCERTIFICATESRESPONSE: {
				Listauthorizedcertificatesresponse listauthorizedcertificatesresponse = (Listauthorizedcertificatesresponse)theEObject;
				T result = caseListauthorizedcertificatesresponse(listauthorizedcertificatesresponse);
				if (result == null) result = caseResource(listauthorizedcertificatesresponse);
				if (result == null) result = caseEntity(listauthorizedcertificatesresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.FEATURESETTINGS: {
				Featuresettings featuresettings = (Featuresettings)theEObject;
				T result = caseFeaturesettings(featuresettings);
				if (result == null) result = caseResource(featuresettings);
				if (result == null) result = caseEntity(featuresettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.ERRORHANDLER: {
				Errorhandler errorhandler = (Errorhandler)theEObject;
				T result = caseErrorhandler(errorhandler);
				if (result == null) result = caseResource(errorhandler);
				if (result == null) result = caseEntity(errorhandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.SSLSETTINGS: {
				Sslsettings sslsettings = (Sslsettings)theEObject;
				T result = caseSslsettings(sslsettings);
				if (result == null) result = caseResource(sslsettings);
				if (result == null) result = caseEntity(sslsettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATIONMETADATAV1: {
				Operationmetadatav1 operationmetadatav1 = (Operationmetadatav1)theEObject;
				T result = caseOperationmetadatav1(operationmetadatav1);
				if (result == null) result = caseResource(operationmetadatav1);
				if (result == null) result = caseEntity(operationmetadatav1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.FEATURESETTINGSLINK: {
				Featuresettingslink featuresettingslink = (Featuresettingslink)theEObject;
				T result = caseFeaturesettingslink(featuresettingslink);
				if (result == null) result = caseLink(featuresettingslink);
				if (result == null) result = caseEntity(featuresettingslink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.IDENTITYAWAREPROXYLINK: {
				Identityawareproxylink identityawareproxylink = (Identityawareproxylink)theEObject;
				T result = caseIdentityawareproxylink(identityawareproxylink);
				if (result == null) result = caseLink(identityawareproxylink);
				if (result == null) result = caseEntity(identityawareproxylink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseResource(application);
				if (result == null) result = caseEntity(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseResource(network);
				if (result == null) result = caseEntity(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseResource(instance);
				if (result == null) result = caseEntity(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LIVENESSCHECK: {
				Livenesscheck livenesscheck = (Livenesscheck)theEObject;
				T result = caseLivenesscheck(livenesscheck);
				if (result == null) result = caseResource(livenesscheck);
				if (result == null) result = caseEntity(livenesscheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.BATCHUPDATEINGRESSRULESREQUEST: {
				Batchupdateingressrulesrequest batchupdateingressrulesrequest = (Batchupdateingressrulesrequest)theEObject;
				T result = caseBatchupdateingressrulesrequest(batchupdateingressrulesrequest);
				if (result == null) result = caseResource(batchupdateingressrulesrequest);
				if (result == null) result = caseEntity(batchupdateingressrulesrequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.NETWORKUTILIZATION: {
				Networkutilization networkutilization = (Networkutilization)theEObject;
				T result = caseNetworkutilization(networkutilization);
				if (result == null) result = caseResource(networkutilization);
				if (result == null) result = caseEntity(networkutilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseResource(location);
				if (result == null) result = caseEntity(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.HEALTHCHECK: {
				Healthcheck healthcheck = (Healthcheck)theEObject;
				T result = caseHealthcheck(healthcheck);
				if (result == null) result = caseResource(healthcheck);
				if (result == null) result = caseEntity(healthcheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.READINESSCHECK: {
				Readinesscheck readinesscheck = (Readinesscheck)theEObject;
				T result = caseReadinesscheck(readinesscheck);
				if (result == null) result = caseResource(readinesscheck);
				if (result == null) result = caseEntity(readinesscheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.DEBUGINSTANCEREQUEST: {
				Debuginstancerequest debuginstancerequest = (Debuginstancerequest)theEObject;
				T result = caseDebuginstancerequest(debuginstancerequest);
				if (result == null) result = caseResource(debuginstancerequest);
				if (result == null) result = caseEntity(debuginstancerequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATIONMETADATAV1BETA5: {
				Operationmetadatav1beta5 operationmetadatav1beta5 = (Operationmetadatav1beta5)theEObject;
				T result = caseOperationmetadatav1beta5(operationmetadatav1beta5);
				if (result == null) result = caseResource(operationmetadatav1beta5);
				if (result == null) result = caseEntity(operationmetadatav1beta5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.AUTOMATICSCALINGLINK: {
				Automaticscalinglink automaticscalinglink = (Automaticscalinglink)theEObject;
				T result = caseAutomaticscalinglink(automaticscalinglink);
				if (result == null) result = caseLink(automaticscalinglink);
				if (result == null) result = caseEntity(automaticscalinglink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.HEALTHCHECKLINK: {
				Healthchecklink healthchecklink = (Healthchecklink)theEObject;
				T result = caseHealthchecklink(healthchecklink);
				if (result == null) result = caseLink(healthchecklink);
				if (result == null) result = caseEntity(healthchecklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.READINESSCHECKLINK: {
				Readinesschecklink readinesschecklink = (Readinesschecklink)theEObject;
				T result = caseReadinesschecklink(readinesschecklink);
				if (result == null) result = caseLink(readinesschecklink);
				if (result == null) result = caseEntity(readinesschecklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.MANUALSCALINGLINK: {
				Manualscalinglink manualscalinglink = (Manualscalinglink)theEObject;
				T result = caseManualscalinglink(manualscalinglink);
				if (result == null) result = caseLink(manualscalinglink);
				if (result == null) result = caseEntity(manualscalinglink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.APICONFIGHANDLERLINK: {
				Apiconfighandlerlink apiconfighandlerlink = (Apiconfighandlerlink)theEObject;
				T result = caseApiconfighandlerlink(apiconfighandlerlink);
				if (result == null) result = caseLink(apiconfighandlerlink);
				if (result == null) result = caseEntity(apiconfighandlerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.ENDPOINTSAPISERVICELINK: {
				Endpointsapiservicelink endpointsapiservicelink = (Endpointsapiservicelink)theEObject;
				T result = caseEndpointsapiservicelink(endpointsapiservicelink);
				if (result == null) result = caseLink(endpointsapiservicelink);
				if (result == null) result = caseEntity(endpointsapiservicelink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.DEPLOYMENTLINK: {
				Deploymentlink deploymentlink = (Deploymentlink)theEObject;
				T result = caseDeploymentlink(deploymentlink);
				if (result == null) result = caseLink(deploymentlink);
				if (result == null) result = caseEntity(deploymentlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.RESOURCESLINK: {
				Resourceslink resourceslink = (Resourceslink)theEObject;
				T result = caseResourceslink(resourceslink);
				if (result == null) result = caseLink(resourceslink);
				if (result == null) result = caseEntity(resourceslink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.BASICSCALINGLINK: {
				Basicscalinglink basicscalinglink = (Basicscalinglink)theEObject;
				T result = caseBasicscalinglink(basicscalinglink);
				if (result == null) result = caseLink(basicscalinglink);
				if (result == null) result = caseEntity(basicscalinglink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LIVENESSCHECKLINK: {
				Livenesschecklink livenesschecklink = (Livenesschecklink)theEObject;
				T result = caseLivenesschecklink(livenesschecklink);
				if (result == null) result = caseLink(livenesschecklink);
				if (result == null) result = caseEntity(livenesschecklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.NETWORKLINK: {
				Networklink networklink = (Networklink)theEObject;
				T result = caseNetworklink(networklink);
				if (result == null) result = caseLink(networklink);
				if (result == null) result = caseEntity(networklink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.VERSION: {
				Version version = (Version)theEObject;
				T result = caseVersion(version);
				if (result == null) result = caseResource(version);
				if (result == null) result = caseEntity(version);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.REPAIRAPPLICATIONREQUEST: {
				Repairapplicationrequest repairapplicationrequest = (Repairapplicationrequest)theEObject;
				T result = caseRepairapplicationrequest(repairapplicationrequest);
				if (result == null) result = caseResource(repairapplicationrequest);
				if (result == null) result = caseEntity(repairapplicationrequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.CERTIFICATERAWDATA: {
				Certificaterawdata certificaterawdata = (Certificaterawdata)theEObject;
				T result = caseCertificaterawdata(certificaterawdata);
				if (result == null) result = caseResource(certificaterawdata);
				if (result == null) result = caseEntity(certificaterawdata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.FILEINFO: {
				Fileinfo fileinfo = (Fileinfo)theEObject;
				T result = caseFileinfo(fileinfo);
				if (result == null) result = caseResource(fileinfo);
				if (result == null) result = caseEntity(fileinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.SCRIPTHANDLER: {
				Scripthandler scripthandler = (Scripthandler)theEObject;
				T result = caseScripthandler(scripthandler);
				if (result == null) result = caseResource(scripthandler);
				if (result == null) result = caseEntity(scripthandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL: {
				Operationmetadataexperimental operationmetadataexperimental = (Operationmetadataexperimental)theEObject;
				T result = caseOperationmetadataexperimental(operationmetadataexperimental);
				if (result == null) result = caseResource(operationmetadataexperimental);
				if (result == null) result = caseEntity(operationmetadataexperimental);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.AUTHORIZEDDOMAIN: {
				Authorizeddomain authorizeddomain = (Authorizeddomain)theEObject;
				T result = caseAuthorizeddomain(authorizeddomain);
				if (result == null) result = caseResource(authorizeddomain);
				if (result == null) result = caseEntity(authorizeddomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.TRAFFICSPLIT: {
				Trafficsplit trafficsplit = (Trafficsplit)theEObject;
				T result = caseTrafficsplit(trafficsplit);
				if (result == null) result = caseResource(trafficsplit);
				if (result == null) result = caseEntity(trafficsplit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATIONMETADATAV1BETA: {
				Operationmetadatav1beta operationmetadatav1beta = (Operationmetadatav1beta)theEObject;
				T result = caseOperationmetadatav1beta(operationmetadatav1beta);
				if (result == null) result = caseResource(operationmetadatav1beta);
				if (result == null) result = caseEntity(operationmetadatav1beta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTSERVICESRESPONSE: {
				Listservicesresponse listservicesresponse = (Listservicesresponse)theEObject;
				T result = caseListservicesresponse(listservicesresponse);
				if (result == null) result = caseResource(listservicesresponse);
				if (result == null) result = caseEntity(listservicesresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTINGRESSRULESRESPONSE: {
				Listingressrulesresponse listingressrulesresponse = (Listingressrulesresponse)theEObject;
				T result = caseListingressrulesresponse(listingressrulesresponse);
				if (result == null) result = caseResource(listingressrulesresponse);
				if (result == null) result = caseEntity(listingressrulesresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.RESOURCES: {
				Resources resources = (Resources)theEObject;
				T result = caseResources(resources);
				if (result == null) result = caseResource(resources);
				if (result == null) result = caseEntity(resources);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.ZIPINFOLINK: {
				Zipinfolink zipinfolink = (Zipinfolink)theEObject;
				T result = caseZipinfolink(zipinfolink);
				if (result == null) result = caseLink(zipinfolink);
				if (result == null) result = caseEntity(zipinfolink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.CONTAINERINFOLINK: {
				Containerinfolink containerinfolink = (Containerinfolink)theEObject;
				T result = caseContainerinfolink(containerinfolink);
				if (result == null) result = caseLink(containerinfolink);
				if (result == null) result = caseEntity(containerinfolink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = caseResource(deployment);
				if (result == null) result = caseEntity(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE: {
				Batchupdateingressrulesresponse batchupdateingressrulesresponse = (Batchupdateingressrulesresponse)theEObject;
				T result = caseBatchupdateingressrulesresponse(batchupdateingressrulesresponse);
				if (result == null) result = caseResource(batchupdateingressrulesresponse);
				if (result == null) result = caseEntity(batchupdateingressrulesresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseResource(volume);
				if (result == null) result = caseEntity(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTINSTANCESRESPONSE: {
				Listinstancesresponse listinstancesresponse = (Listinstancesresponse)theEObject;
				T result = caseListinstancesresponse(listinstancesresponse);
				if (result == null) result = caseResource(listinstancesresponse);
				if (result == null) result = caseEntity(listinstancesresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTDOMAINMAPPINGSRESPONSE: {
				Listdomainmappingsresponse listdomainmappingsresponse = (Listdomainmappingsresponse)theEObject;
				T result = caseListdomainmappingsresponse(listdomainmappingsresponse);
				if (result == null) result = caseResource(listdomainmappingsresponse);
				if (result == null) result = caseEntity(listdomainmappingsresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATIONMETADATAV1ALPHA: {
				Operationmetadatav1alpha operationmetadatav1alpha = (Operationmetadatav1alpha)theEObject;
				T result = caseOperationmetadatav1alpha(operationmetadatav1alpha);
				if (result == null) result = caseResource(operationmetadatav1alpha);
				if (result == null) result = caseEntity(operationmetadatav1alpha);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.URLDISPATCHRULE: {
				Urldispatchrule urldispatchrule = (Urldispatchrule)theEObject;
				T result = caseUrldispatchrule(urldispatchrule);
				if (result == null) result = caseResource(urldispatchrule);
				if (result == null) result = caseEntity(urldispatchrule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTVERSIONSRESPONSE: {
				Listversionsresponse listversionsresponse = (Listversionsresponse)theEObject;
				T result = caseListversionsresponse(listversionsresponse);
				if (result == null) result = caseResource(listversionsresponse);
				if (result == null) result = caseEntity(listversionsresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE: {
				Listauthorizeddomainsresponse listauthorizeddomainsresponse = (Listauthorizeddomainsresponse)theEObject;
				T result = caseListauthorizeddomainsresponse(listauthorizeddomainsresponse);
				if (result == null) result = caseResource(listauthorizeddomainsresponse);
				if (result == null) result = caseEntity(listauthorizeddomainsresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.EMPTY: {
				Empty empty = (Empty)theEObject;
				T result = caseEmpty(empty);
				if (result == null) result = caseResource(empty);
				if (result == null) result = caseEntity(empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.APIENDPOINTHANDLER: {
				Apiendpointhandler apiendpointhandler = (Apiendpointhandler)theEObject;
				T result = caseApiendpointhandler(apiendpointhandler);
				if (result == null) result = caseResource(apiendpointhandler);
				if (result == null) result = caseEntity(apiendpointhandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.SSLSETTINGSLINK: {
				Sslsettingslink sslsettingslink = (Sslsettingslink)theEObject;
				T result = caseSslsettingslink(sslsettingslink);
				if (result == null) result = caseLink(sslsettingslink);
				if (result == null) result = caseEntity(sslsettingslink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.DOMAINMAPPING: {
				Domainmapping domainmapping = (Domainmapping)theEObject;
				T result = caseDomainmapping(domainmapping);
				if (result == null) result = caseResource(domainmapping);
				if (result == null) result = caseEntity(domainmapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.REQUESTUTILIZATIONLINK: {
				Requestutilizationlink requestutilizationlink = (Requestutilizationlink)theEObject;
				T result = caseRequestutilizationlink(requestutilizationlink);
				if (result == null) result = caseLink(requestutilizationlink);
				if (result == null) result = caseEntity(requestutilizationlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.NETWORKUTILIZATIONLINK: {
				Networkutilizationlink networkutilizationlink = (Networkutilizationlink)theEObject;
				T result = caseNetworkutilizationlink(networkutilizationlink);
				if (result == null) result = caseLink(networkutilizationlink);
				if (result == null) result = caseEntity(networkutilizationlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.CPUUTILIZATIONLINK: {
				Cpuutilizationlink cpuutilizationlink = (Cpuutilizationlink)theEObject;
				T result = caseCpuutilizationlink(cpuutilizationlink);
				if (result == null) result = caseLink(cpuutilizationlink);
				if (result == null) result = caseEntity(cpuutilizationlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.DISKUTILIZATIONLINK: {
				Diskutilizationlink diskutilizationlink = (Diskutilizationlink)theEObject;
				T result = caseDiskutilizationlink(diskutilizationlink);
				if (result == null) result = caseLink(diskutilizationlink);
				if (result == null) result = caseEntity(diskutilizationlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.AUTOMATICSCALING: {
				Automaticscaling automaticscaling = (Automaticscaling)theEObject;
				T result = caseAutomaticscaling(automaticscaling);
				if (result == null) result = caseResource(automaticscaling);
				if (result == null) result = caseEntity(automaticscaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.ZIPINFO: {
				Zipinfo zipinfo = (Zipinfo)theEObject;
				T result = caseZipinfo(zipinfo);
				if (result == null) result = caseResource(zipinfo);
				if (result == null) result = caseEntity(zipinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.CERTIFICATERAWDATALINK: {
				Certificaterawdatalink certificaterawdatalink = (Certificaterawdatalink)theEObject;
				T result = caseCertificaterawdatalink(certificaterawdatalink);
				if (result == null) result = caseLink(certificaterawdatalink);
				if (result == null) result = caseEntity(certificaterawdatalink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.AUTHORIZEDCERTIFICATE: {
				Authorizedcertificate authorizedcertificate = (Authorizedcertificate)theEObject;
				T result = caseAuthorizedcertificate(authorizedcertificate);
				if (result == null) result = caseResource(authorizedcertificate);
				if (result == null) result = caseEntity(authorizedcertificate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.RESOURCERECORD: {
				Resourcerecord resourcerecord = (Resourcerecord)theEObject;
				T result = caseResourcerecord(resourcerecord);
				if (result == null) result = caseResource(resourcerecord);
				if (result == null) result = caseEntity(resourcerecord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseResource(library);
				if (result == null) result = caseEntity(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.LISTLOCATIONSRESPONSE: {
				Listlocationsresponse listlocationsresponse = (Listlocationsresponse)theEObject;
				T result = caseListlocationsresponse(listlocationsresponse);
				if (result == null) result = caseResource(listlocationsresponse);
				if (result == null) result = caseEntity(listlocationsresponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.CONTAINERINFO: {
				Containerinfo containerinfo = (Containerinfo)theEObject;
				T result = caseContainerinfo(containerinfo);
				if (result == null) result = caseResource(containerinfo);
				if (result == null) result = caseEntity(containerinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.REQUESTUTILIZATION: {
				Requestutilization requestutilization = (Requestutilization)theEObject;
				T result = caseRequestutilization(requestutilization);
				if (result == null) result = caseResource(requestutilization);
				if (result == null) result = caseEntity(requestutilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.APIENDPOINTHANDLERLINK: {
				Apiendpointhandlerlink apiendpointhandlerlink = (Apiendpointhandlerlink)theEObject;
				T result = caseApiendpointhandlerlink(apiendpointhandlerlink);
				if (result == null) result = caseLink(apiendpointhandlerlink);
				if (result == null) result = caseEntity(apiendpointhandlerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.STATICFILESHANDLERLINK: {
				Staticfileshandlerlink staticfileshandlerlink = (Staticfileshandlerlink)theEObject;
				T result = caseStaticfileshandlerlink(staticfileshandlerlink);
				if (result == null) result = caseLink(staticfileshandlerlink);
				if (result == null) result = caseEntity(staticfileshandlerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.SCRIPTHANDLERLINK: {
				Scripthandlerlink scripthandlerlink = (Scripthandlerlink)theEObject;
				T result = caseScripthandlerlink(scripthandlerlink);
				if (result == null) result = caseLink(scripthandlerlink);
				if (result == null) result = caseEntity(scripthandlerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.URLMAP: {
				Urlmap urlmap = (Urlmap)theEObject;
				T result = caseUrlmap(urlmap);
				if (result == null) result = caseResource(urlmap);
				if (result == null) result = caseEntity(urlmap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.ENDPOINTSAPISERVICE: {
				Endpointsapiservice endpointsapiservice = (Endpointsapiservice)theEObject;
				T result = caseEndpointsapiservice(endpointsapiservice);
				if (result == null) result = caseResource(endpointsapiservice);
				if (result == null) result = caseEntity(endpointsapiservice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.STATUSLINK: {
				Statuslink statuslink = (Statuslink)theEObject;
				T result = caseStatuslink(statuslink);
				if (result == null) result = caseLink(statuslink);
				if (result == null) result = caseEntity(statuslink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseResource(operation);
				if (result == null) result = caseEntity(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.APICONFIGHANDLER: {
				Apiconfighandler apiconfighandler = (Apiconfighandler)theEObject;
				T result = caseApiconfighandler(apiconfighandler);
				if (result == null) result = caseResource(apiconfighandler);
				if (result == null) result = caseEntity(apiconfighandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.STATICFILESHANDLER: {
				Staticfileshandler staticfileshandler = (Staticfileshandler)theEObject;
				T result = caseStaticfileshandler(staticfileshandler);
				if (result == null) result = caseResource(staticfileshandler);
				if (result == null) result = caseEntity(staticfileshandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.BASICSCALING: {
				Basicscaling basicscaling = (Basicscaling)theEObject;
				T result = caseBasicscaling(basicscaling);
				if (result == null) result = caseResource(basicscaling);
				if (result == null) result = caseEntity(basicscaling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppenginePackage.DISKUTILIZATION: {
				Diskutilization diskutilization = (Diskutilization)theEObject;
				T result = caseDiskutilization(diskutilization);
				if (result == null) result = caseResource(diskutilization);
				if (result == null) result = caseEntity(diskutilization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearray(array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpuutilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpuutilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuutilization(Cpuutilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identityawareproxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identityawareproxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityawareproxy(Identityawareproxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manualscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manualscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualscaling(Manualscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locationmetadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locationmetadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationmetadata(Locationmetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trafficsplitlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trafficsplitlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrafficsplitlink(Trafficsplitlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listoperationsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listoperationsresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListoperationsresponse(Listoperationsresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmetadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmetadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmetadata(Operationmetadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firewallrule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firewallrule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirewallrule(Firewallrule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listauthorizedcertificatesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listauthorizedcertificatesresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListauthorizedcertificatesresponse(Listauthorizedcertificatesresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Featuresettings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Featuresettings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesettings(Featuresettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Errorhandler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Errorhandler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorhandler(Errorhandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sslsettings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sslsettings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSslsettings(Sslsettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmetadatav1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmetadatav1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmetadatav1(Operationmetadatav1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Featuresettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Featuresettingslink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesettingslink(Featuresettingslink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identityawareproxylink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identityawareproxylink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityawareproxylink(Identityawareproxylink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livenesscheck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livenesscheck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivenesscheck(Livenesscheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batchupdateingressrulesrequest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batchupdateingressrulesrequest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatchupdateingressrulesrequest(Batchupdateingressrulesrequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networkutilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networkutilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkutilization(Networkutilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcheck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcheck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcheck(Healthcheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readinesscheck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readinesscheck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadinesscheck(Readinesscheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debuginstancerequest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debuginstancerequest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebuginstancerequest(Debuginstancerequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmetadatav1beta5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmetadatav1beta5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmetadatav1beta5(Operationmetadatav1beta5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automaticscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automaticscalinglink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomaticscalinglink(Automaticscalinglink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthchecklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthchecklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthchecklink(Healthchecklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readinesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readinesschecklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadinesschecklink(Readinesschecklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manualscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manualscalinglink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualscalinglink(Manualscalinglink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apiconfighandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apiconfighandlerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiconfighandlerlink(Apiconfighandlerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpointsapiservicelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpointsapiservicelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointsapiservicelink(Endpointsapiservicelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deploymentlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deploymentlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentlink(Deploymentlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resourceslink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resourceslink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceslink(Resourceslink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basicscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basicscalinglink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicscalinglink(Basicscalinglink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Livenesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Livenesschecklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivenesschecklink(Livenesschecklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networklink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networklink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworklink(Networklink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersion(Version object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repairapplicationrequest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repairapplicationrequest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepairapplicationrequest(Repairapplicationrequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificaterawdata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificaterawdata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificaterawdata(Certificaterawdata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fileinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fileinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileinfo(Fileinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripthandler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripthandler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScripthandler(Scripthandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmetadataexperimental</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmetadataexperimental</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmetadataexperimental(Operationmetadataexperimental object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorizeddomain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorizeddomain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizeddomain(Authorizeddomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trafficsplit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trafficsplit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrafficsplit(Trafficsplit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmetadatav1beta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmetadatav1beta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmetadatav1beta(Operationmetadatav1beta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listservicesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listservicesresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListservicesresponse(Listservicesresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listingressrulesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listingressrulesresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListingressrulesresponse(Listingressrulesresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zipinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zipinfolink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZipinfolink(Zipinfolink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containerinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containerinfolink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerinfolink(Containerinfolink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Batchupdateingressrulesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Batchupdateingressrulesresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatchupdateingressrulesresponse(Batchupdateingressrulesresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listinstancesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listinstancesresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListinstancesresponse(Listinstancesresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listdomainmappingsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listdomainmappingsresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListdomainmappingsresponse(Listdomainmappingsresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationmetadatav1alpha</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationmetadatav1alpha</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationmetadatav1alpha(Operationmetadatav1alpha object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Urldispatchrule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Urldispatchrule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrldispatchrule(Urldispatchrule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listversionsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listversionsresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListversionsresponse(Listversionsresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listauthorizeddomainsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listauthorizeddomainsresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListauthorizeddomainsresponse(Listauthorizeddomainsresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpty(Empty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apiendpointhandler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apiendpointhandler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiendpointhandler(Apiendpointhandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sslsettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sslsettingslink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSslsettingslink(Sslsettingslink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domainmapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domainmapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainmapping(Domainmapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requestutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requestutilizationlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestutilizationlink(Requestutilizationlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networkutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networkutilizationlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkutilizationlink(Networkutilizationlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpuutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpuutilizationlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuutilizationlink(Cpuutilizationlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diskutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diskutilizationlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiskutilizationlink(Diskutilizationlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automaticscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automaticscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomaticscaling(Automaticscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zipinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zipinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZipinfo(Zipinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificaterawdatalink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificaterawdatalink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificaterawdatalink(Certificaterawdatalink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorizedcertificate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorizedcertificate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizedcertificate(Authorizedcertificate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resourcerecord</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resourcerecord</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcerecord(Resourcerecord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listlocationsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listlocationsresponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListlocationsresponse(Listlocationsresponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containerinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containerinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerinfo(Containerinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requestutilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requestutilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestutilization(Requestutilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apiendpointhandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apiendpointhandlerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiendpointhandlerlink(Apiendpointhandlerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staticfileshandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staticfileshandlerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticfileshandlerlink(Staticfileshandlerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripthandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripthandlerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScripthandlerlink(Scripthandlerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Urlmap</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Urlmap</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlmap(Urlmap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpointsapiservice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpointsapiservice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointsapiservice(Endpointsapiservice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statuslink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statuslink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatuslink(Statuslink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apiconfighandler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apiconfighandler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApiconfighandler(Apiconfighandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staticfileshandler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staticfileshandler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticfileshandler(Staticfileshandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basicscaling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basicscaling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicscaling(Basicscaling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diskutilization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diskutilization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiskutilization(Diskutilization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AppengineSwitch
