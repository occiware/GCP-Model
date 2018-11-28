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
package appengine.impl;

import appengine.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppengineFactoryImpl extends EFactoryImpl implements AppengineFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppengineFactory init() {
		try {
			AppengineFactory theAppengineFactory = (AppengineFactory)EPackage.Registry.INSTANCE.getEFactory(AppenginePackage.eNS_URI);
			if (theAppengineFactory != null) {
				return theAppengineFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppengineFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppengineFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AppenginePackage.ARRAY: return createarray();
			case AppenginePackage.CPUUTILIZATION: return createCpuutilization();
			case AppenginePackage.STATUS: return createStatus();
			case AppenginePackage.IDENTITYAWAREPROXY: return createIdentityawareproxy();
			case AppenginePackage.MANUALSCALING: return createManualscaling();
			case AppenginePackage.LOCATIONMETADATA: return createLocationmetadata();
			case AppenginePackage.TRAFFICSPLITLINK: return createTrafficsplitlink();
			case AppenginePackage.SERVICE: return createService();
			case AppenginePackage.LISTOPERATIONSRESPONSE: return createListoperationsresponse();
			case AppenginePackage.OPERATIONMETADATA: return createOperationmetadata();
			case AppenginePackage.FIREWALLRULE: return createFirewallrule();
			case AppenginePackage.LISTAUTHORIZEDCERTIFICATESRESPONSE: return createListauthorizedcertificatesresponse();
			case AppenginePackage.FEATURESETTINGS: return createFeaturesettings();
			case AppenginePackage.ERRORHANDLER: return createErrorhandler();
			case AppenginePackage.SSLSETTINGS: return createSslsettings();
			case AppenginePackage.OPERATIONMETADATAV1: return createOperationmetadatav1();
			case AppenginePackage.FEATURESETTINGSLINK: return createFeaturesettingslink();
			case AppenginePackage.IDENTITYAWAREPROXYLINK: return createIdentityawareproxylink();
			case AppenginePackage.APPLICATION: return createApplication();
			case AppenginePackage.NETWORK: return createNetwork();
			case AppenginePackage.INSTANCE: return createInstance();
			case AppenginePackage.LIVENESSCHECK: return createLivenesscheck();
			case AppenginePackage.BATCHUPDATEINGRESSRULESREQUEST: return createBatchupdateingressrulesrequest();
			case AppenginePackage.NETWORKUTILIZATION: return createNetworkutilization();
			case AppenginePackage.LOCATION: return createLocation();
			case AppenginePackage.HEALTHCHECK: return createHealthcheck();
			case AppenginePackage.READINESSCHECK: return createReadinesscheck();
			case AppenginePackage.DEBUGINSTANCEREQUEST: return createDebuginstancerequest();
			case AppenginePackage.OPERATIONMETADATAV1BETA5: return createOperationmetadatav1beta5();
			case AppenginePackage.AUTOMATICSCALINGLINK: return createAutomaticscalinglink();
			case AppenginePackage.HEALTHCHECKLINK: return createHealthchecklink();
			case AppenginePackage.READINESSCHECKLINK: return createReadinesschecklink();
			case AppenginePackage.MANUALSCALINGLINK: return createManualscalinglink();
			case AppenginePackage.APICONFIGHANDLERLINK: return createApiconfighandlerlink();
			case AppenginePackage.ENDPOINTSAPISERVICELINK: return createEndpointsapiservicelink();
			case AppenginePackage.DEPLOYMENTLINK: return createDeploymentlink();
			case AppenginePackage.RESOURCESLINK: return createResourceslink();
			case AppenginePackage.BASICSCALINGLINK: return createBasicscalinglink();
			case AppenginePackage.LIVENESSCHECKLINK: return createLivenesschecklink();
			case AppenginePackage.NETWORKLINK: return createNetworklink();
			case AppenginePackage.VERSION: return createVersion();
			case AppenginePackage.REPAIRAPPLICATIONREQUEST: return createRepairapplicationrequest();
			case AppenginePackage.CERTIFICATERAWDATA: return createCertificaterawdata();
			case AppenginePackage.FILEINFO: return createFileinfo();
			case AppenginePackage.SCRIPTHANDLER: return createScripthandler();
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL: return createOperationmetadataexperimental();
			case AppenginePackage.AUTHORIZEDDOMAIN: return createAuthorizeddomain();
			case AppenginePackage.TRAFFICSPLIT: return createTrafficsplit();
			case AppenginePackage.OPERATIONMETADATAV1BETA: return createOperationmetadatav1beta();
			case AppenginePackage.LISTSERVICESRESPONSE: return createListservicesresponse();
			case AppenginePackage.LISTINGRESSRULESRESPONSE: return createListingressrulesresponse();
			case AppenginePackage.RESOURCES: return createResources();
			case AppenginePackage.ZIPINFOLINK: return createZipinfolink();
			case AppenginePackage.CONTAINERINFOLINK: return createContainerinfolink();
			case AppenginePackage.DEPLOYMENT: return createDeployment();
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE: return createBatchupdateingressrulesresponse();
			case AppenginePackage.VOLUME: return createVolume();
			case AppenginePackage.LISTINSTANCESRESPONSE: return createListinstancesresponse();
			case AppenginePackage.LISTDOMAINMAPPINGSRESPONSE: return createListdomainmappingsresponse();
			case AppenginePackage.OPERATIONMETADATAV1ALPHA: return createOperationmetadatav1alpha();
			case AppenginePackage.URLDISPATCHRULE: return createUrldispatchrule();
			case AppenginePackage.LISTVERSIONSRESPONSE: return createListversionsresponse();
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE: return createListauthorizeddomainsresponse();
			case AppenginePackage.EMPTY: return createEmpty();
			case AppenginePackage.APIENDPOINTHANDLER: return createApiendpointhandler();
			case AppenginePackage.SSLSETTINGSLINK: return createSslsettingslink();
			case AppenginePackage.DOMAINMAPPING: return createDomainmapping();
			case AppenginePackage.REQUESTUTILIZATIONLINK: return createRequestutilizationlink();
			case AppenginePackage.NETWORKUTILIZATIONLINK: return createNetworkutilizationlink();
			case AppenginePackage.CPUUTILIZATIONLINK: return createCpuutilizationlink();
			case AppenginePackage.DISKUTILIZATIONLINK: return createDiskutilizationlink();
			case AppenginePackage.AUTOMATICSCALING: return createAutomaticscaling();
			case AppenginePackage.ZIPINFO: return createZipinfo();
			case AppenginePackage.CERTIFICATERAWDATALINK: return createCertificaterawdatalink();
			case AppenginePackage.AUTHORIZEDCERTIFICATE: return createAuthorizedcertificate();
			case AppenginePackage.RESOURCERECORD: return createResourcerecord();
			case AppenginePackage.LIBRARY: return createLibrary();
			case AppenginePackage.LISTLOCATIONSRESPONSE: return createListlocationsresponse();
			case AppenginePackage.CONTAINERINFO: return createContainerinfo();
			case AppenginePackage.REQUESTUTILIZATION: return createRequestutilization();
			case AppenginePackage.APIENDPOINTHANDLERLINK: return createApiendpointhandlerlink();
			case AppenginePackage.STATICFILESHANDLERLINK: return createStaticfileshandlerlink();
			case AppenginePackage.SCRIPTHANDLERLINK: return createScripthandlerlink();
			case AppenginePackage.URLMAP: return createUrlmap();
			case AppenginePackage.ENDPOINTSAPISERVICE: return createEndpointsapiservice();
			case AppenginePackage.STATUSLINK: return createStatuslink();
			case AppenginePackage.OPERATION: return createOperation();
			case AppenginePackage.APICONFIGHANDLER: return createApiconfighandler();
			case AppenginePackage.STATICFILESHANDLER: return createStaticfileshandler();
			case AppenginePackage.BASICSCALING: return createBasicscaling();
			case AppenginePackage.DISKUTILIZATION: return createDiskutilization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AppenginePackage.ACTION:
				return createActionFromString(eDataType, initialValue);
			case AppenginePackage.ERRORCODE:
				return createErrorcodeFromString(eDataType, initialValue);
			case AppenginePackage.SERVINGSTATUS:
				return createServingstatusFromString(eDataType, initialValue);
			case AppenginePackage.AVAILABILITY:
				return createAvailabilityFromString(eDataType, initialValue);
			case AppenginePackage.VERSION_SERVINGSTATUS:
				return createVersionServingstatusFromString(eDataType, initialValue);
			case AppenginePackage.SHARDBY:
				return createShardbyFromString(eDataType, initialValue);
			case AppenginePackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case AppenginePackage.REDIRECTHTTPRESPONSECODE:
				return createRedirecthttpresponsecodeFromString(eDataType, initialValue);
			case AppenginePackage.SECURITYLEVEL:
				return createSecuritylevelFromString(eDataType, initialValue);
			case AppenginePackage.AUTHFAILACTION:
				return createAuthfailactionFromString(eDataType, initialValue);
			case AppenginePackage.LOGIN:
				return createLoginFromString(eDataType, initialValue);
			case AppenginePackage.API_CONFIG_HANDLER_SECURITYLEVEL:
				return createApiConfigHandlerSecuritylevelFromString(eDataType, initialValue);
			case AppenginePackage.API_CONFIG_HANDLER_AUTHFAILACTION:
				return createApiConfigHandlerAuthfailactionFromString(eDataType, initialValue);
			case AppenginePackage.API_CONFIG_HANDLER_LOGIN:
				return createApiConfigHandlerLoginFromString(eDataType, initialValue);
			case AppenginePackage.FLOAT:
				return createfloatFromString(eDataType, initialValue);
			case AppenginePackage.BYTE:
				return createbyteFromString(eDataType, initialValue);
			case AppenginePackage.DOUBLE:
				return createdoubleFromString(eDataType, initialValue);
			case AppenginePackage.OBJECT:
				return createobjectFromString(eDataType, initialValue);
			case AppenginePackage.LONG:
				return createlongFromString(eDataType, initialValue);
			case AppenginePackage.MAP:
				return createmapFromString(eDataType, initialValue);
			case AppenginePackage.ANY:
				return createanyFromString(eDataType, initialValue);
			case AppenginePackage.SHORT:
				return createshortFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AppenginePackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			case AppenginePackage.ERRORCODE:
				return convertErrorcodeToString(eDataType, instanceValue);
			case AppenginePackage.SERVINGSTATUS:
				return convertServingstatusToString(eDataType, instanceValue);
			case AppenginePackage.AVAILABILITY:
				return convertAvailabilityToString(eDataType, instanceValue);
			case AppenginePackage.VERSION_SERVINGSTATUS:
				return convertVersionServingstatusToString(eDataType, instanceValue);
			case AppenginePackage.SHARDBY:
				return convertShardbyToString(eDataType, instanceValue);
			case AppenginePackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case AppenginePackage.REDIRECTHTTPRESPONSECODE:
				return convertRedirecthttpresponsecodeToString(eDataType, instanceValue);
			case AppenginePackage.SECURITYLEVEL:
				return convertSecuritylevelToString(eDataType, instanceValue);
			case AppenginePackage.AUTHFAILACTION:
				return convertAuthfailactionToString(eDataType, instanceValue);
			case AppenginePackage.LOGIN:
				return convertLoginToString(eDataType, instanceValue);
			case AppenginePackage.API_CONFIG_HANDLER_SECURITYLEVEL:
				return convertApiConfigHandlerSecuritylevelToString(eDataType, instanceValue);
			case AppenginePackage.API_CONFIG_HANDLER_AUTHFAILACTION:
				return convertApiConfigHandlerAuthfailactionToString(eDataType, instanceValue);
			case AppenginePackage.API_CONFIG_HANDLER_LOGIN:
				return convertApiConfigHandlerLoginToString(eDataType, instanceValue);
			case AppenginePackage.FLOAT:
				return convertfloatToString(eDataType, instanceValue);
			case AppenginePackage.BYTE:
				return convertbyteToString(eDataType, instanceValue);
			case AppenginePackage.DOUBLE:
				return convertdoubleToString(eDataType, instanceValue);
			case AppenginePackage.OBJECT:
				return convertobjectToString(eDataType, instanceValue);
			case AppenginePackage.LONG:
				return convertlongToString(eDataType, instanceValue);
			case AppenginePackage.MAP:
				return convertmapToString(eDataType, instanceValue);
			case AppenginePackage.ANY:
				return convertanyToString(eDataType, instanceValue);
			case AppenginePackage.SHORT:
				return convertshortToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array createarray() {
		arrayImpl array = new arrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpuutilization createCpuutilization() {
		CpuutilizationImpl cpuutilization = new CpuutilizationImpl();
		return cpuutilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identityawareproxy createIdentityawareproxy() {
		IdentityawareproxyImpl identityawareproxy = new IdentityawareproxyImpl();
		return identityawareproxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manualscaling createManualscaling() {
		ManualscalingImpl manualscaling = new ManualscalingImpl();
		return manualscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locationmetadata createLocationmetadata() {
		LocationmetadataImpl locationmetadata = new LocationmetadataImpl();
		return locationmetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trafficsplitlink createTrafficsplitlink() {
		TrafficsplitlinkImpl trafficsplitlink = new TrafficsplitlinkImpl();
		return trafficsplitlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listoperationsresponse createListoperationsresponse() {
		ListoperationsresponseImpl listoperationsresponse = new ListoperationsresponseImpl();
		return listoperationsresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmetadata createOperationmetadata() {
		OperationmetadataImpl operationmetadata = new OperationmetadataImpl();
		return operationmetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Firewallrule createFirewallrule() {
		FirewallruleImpl firewallrule = new FirewallruleImpl();
		return firewallrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listauthorizedcertificatesresponse createListauthorizedcertificatesresponse() {
		ListauthorizedcertificatesresponseImpl listauthorizedcertificatesresponse = new ListauthorizedcertificatesresponseImpl();
		return listauthorizedcertificatesresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Featuresettings createFeaturesettings() {
		FeaturesettingsImpl featuresettings = new FeaturesettingsImpl();
		return featuresettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Errorhandler createErrorhandler() {
		ErrorhandlerImpl errorhandler = new ErrorhandlerImpl();
		return errorhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sslsettings createSslsettings() {
		SslsettingsImpl sslsettings = new SslsettingsImpl();
		return sslsettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmetadatav1 createOperationmetadatav1() {
		Operationmetadatav1Impl operationmetadatav1 = new Operationmetadatav1Impl();
		return operationmetadatav1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Featuresettingslink createFeaturesettingslink() {
		FeaturesettingslinkImpl featuresettingslink = new FeaturesettingslinkImpl();
		return featuresettingslink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identityawareproxylink createIdentityawareproxylink() {
		IdentityawareproxylinkImpl identityawareproxylink = new IdentityawareproxylinkImpl();
		return identityawareproxylink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livenesscheck createLivenesscheck() {
		LivenesscheckImpl livenesscheck = new LivenesscheckImpl();
		return livenesscheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batchupdateingressrulesrequest createBatchupdateingressrulesrequest() {
		BatchupdateingressrulesrequestImpl batchupdateingressrulesrequest = new BatchupdateingressrulesrequestImpl();
		return batchupdateingressrulesrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networkutilization createNetworkutilization() {
		NetworkutilizationImpl networkutilization = new NetworkutilizationImpl();
		return networkutilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Healthcheck createHealthcheck() {
		HealthcheckImpl healthcheck = new HealthcheckImpl();
		return healthcheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Readinesscheck createReadinesscheck() {
		ReadinesscheckImpl readinesscheck = new ReadinesscheckImpl();
		return readinesscheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Debuginstancerequest createDebuginstancerequest() {
		DebuginstancerequestImpl debuginstancerequest = new DebuginstancerequestImpl();
		return debuginstancerequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmetadatav1beta5 createOperationmetadatav1beta5() {
		Operationmetadatav1beta5Impl operationmetadatav1beta5 = new Operationmetadatav1beta5Impl();
		return operationmetadatav1beta5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automaticscalinglink createAutomaticscalinglink() {
		AutomaticscalinglinkImpl automaticscalinglink = new AutomaticscalinglinkImpl();
		return automaticscalinglink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Healthchecklink createHealthchecklink() {
		HealthchecklinkImpl healthchecklink = new HealthchecklinkImpl();
		return healthchecklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Readinesschecklink createReadinesschecklink() {
		ReadinesschecklinkImpl readinesschecklink = new ReadinesschecklinkImpl();
		return readinesschecklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manualscalinglink createManualscalinglink() {
		ManualscalinglinkImpl manualscalinglink = new ManualscalinglinkImpl();
		return manualscalinglink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apiconfighandlerlink createApiconfighandlerlink() {
		ApiconfighandlerlinkImpl apiconfighandlerlink = new ApiconfighandlerlinkImpl();
		return apiconfighandlerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpointsapiservicelink createEndpointsapiservicelink() {
		EndpointsapiservicelinkImpl endpointsapiservicelink = new EndpointsapiservicelinkImpl();
		return endpointsapiservicelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deploymentlink createDeploymentlink() {
		DeploymentlinkImpl deploymentlink = new DeploymentlinkImpl();
		return deploymentlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourceslink createResourceslink() {
		ResourceslinkImpl resourceslink = new ResourceslinkImpl();
		return resourceslink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basicscalinglink createBasicscalinglink() {
		BasicscalinglinkImpl basicscalinglink = new BasicscalinglinkImpl();
		return basicscalinglink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livenesschecklink createLivenesschecklink() {
		LivenesschecklinkImpl livenesschecklink = new LivenesschecklinkImpl();
		return livenesschecklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networklink createNetworklink() {
		NetworklinkImpl networklink = new NetworklinkImpl();
		return networklink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repairapplicationrequest createRepairapplicationrequest() {
		RepairapplicationrequestImpl repairapplicationrequest = new RepairapplicationrequestImpl();
		return repairapplicationrequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificaterawdata createCertificaterawdata() {
		CertificaterawdataImpl certificaterawdata = new CertificaterawdataImpl();
		return certificaterawdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fileinfo createFileinfo() {
		FileinfoImpl fileinfo = new FileinfoImpl();
		return fileinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripthandler createScripthandler() {
		ScripthandlerImpl scripthandler = new ScripthandlerImpl();
		return scripthandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmetadataexperimental createOperationmetadataexperimental() {
		OperationmetadataexperimentalImpl operationmetadataexperimental = new OperationmetadataexperimentalImpl();
		return operationmetadataexperimental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizeddomain createAuthorizeddomain() {
		AuthorizeddomainImpl authorizeddomain = new AuthorizeddomainImpl();
		return authorizeddomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trafficsplit createTrafficsplit() {
		TrafficsplitImpl trafficsplit = new TrafficsplitImpl();
		return trafficsplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmetadatav1beta createOperationmetadatav1beta() {
		Operationmetadatav1betaImpl operationmetadatav1beta = new Operationmetadatav1betaImpl();
		return operationmetadatav1beta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listservicesresponse createListservicesresponse() {
		ListservicesresponseImpl listservicesresponse = new ListservicesresponseImpl();
		return listservicesresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listingressrulesresponse createListingressrulesresponse() {
		ListingressrulesresponseImpl listingressrulesresponse = new ListingressrulesresponseImpl();
		return listingressrulesresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zipinfolink createZipinfolink() {
		ZipinfolinkImpl zipinfolink = new ZipinfolinkImpl();
		return zipinfolink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containerinfolink createContainerinfolink() {
		ContainerinfolinkImpl containerinfolink = new ContainerinfolinkImpl();
		return containerinfolink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Batchupdateingressrulesresponse createBatchupdateingressrulesresponse() {
		BatchupdateingressrulesresponseImpl batchupdateingressrulesresponse = new BatchupdateingressrulesresponseImpl();
		return batchupdateingressrulesresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listinstancesresponse createListinstancesresponse() {
		ListinstancesresponseImpl listinstancesresponse = new ListinstancesresponseImpl();
		return listinstancesresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listdomainmappingsresponse createListdomainmappingsresponse() {
		ListdomainmappingsresponseImpl listdomainmappingsresponse = new ListdomainmappingsresponseImpl();
		return listdomainmappingsresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operationmetadatav1alpha createOperationmetadatav1alpha() {
		Operationmetadatav1alphaImpl operationmetadatav1alpha = new Operationmetadatav1alphaImpl();
		return operationmetadatav1alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Urldispatchrule createUrldispatchrule() {
		UrldispatchruleImpl urldispatchrule = new UrldispatchruleImpl();
		return urldispatchrule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listversionsresponse createListversionsresponse() {
		ListversionsresponseImpl listversionsresponse = new ListversionsresponseImpl();
		return listversionsresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listauthorizeddomainsresponse createListauthorizeddomainsresponse() {
		ListauthorizeddomainsresponseImpl listauthorizeddomainsresponse = new ListauthorizeddomainsresponseImpl();
		return listauthorizeddomainsresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apiendpointhandler createApiendpointhandler() {
		ApiendpointhandlerImpl apiendpointhandler = new ApiendpointhandlerImpl();
		return apiendpointhandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sslsettingslink createSslsettingslink() {
		SslsettingslinkImpl sslsettingslink = new SslsettingslinkImpl();
		return sslsettingslink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domainmapping createDomainmapping() {
		DomainmappingImpl domainmapping = new DomainmappingImpl();
		return domainmapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requestutilizationlink createRequestutilizationlink() {
		RequestutilizationlinkImpl requestutilizationlink = new RequestutilizationlinkImpl();
		return requestutilizationlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networkutilizationlink createNetworkutilizationlink() {
		NetworkutilizationlinkImpl networkutilizationlink = new NetworkutilizationlinkImpl();
		return networkutilizationlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpuutilizationlink createCpuutilizationlink() {
		CpuutilizationlinkImpl cpuutilizationlink = new CpuutilizationlinkImpl();
		return cpuutilizationlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diskutilizationlink createDiskutilizationlink() {
		DiskutilizationlinkImpl diskutilizationlink = new DiskutilizationlinkImpl();
		return diskutilizationlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Automaticscaling createAutomaticscaling() {
		AutomaticscalingImpl automaticscaling = new AutomaticscalingImpl();
		return automaticscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zipinfo createZipinfo() {
		ZipinfoImpl zipinfo = new ZipinfoImpl();
		return zipinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificaterawdatalink createCertificaterawdatalink() {
		CertificaterawdatalinkImpl certificaterawdatalink = new CertificaterawdatalinkImpl();
		return certificaterawdatalink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authorizedcertificate createAuthorizedcertificate() {
		AuthorizedcertificateImpl authorizedcertificate = new AuthorizedcertificateImpl();
		return authorizedcertificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resourcerecord createResourcerecord() {
		ResourcerecordImpl resourcerecord = new ResourcerecordImpl();
		return resourcerecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Listlocationsresponse createListlocationsresponse() {
		ListlocationsresponseImpl listlocationsresponse = new ListlocationsresponseImpl();
		return listlocationsresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Containerinfo createContainerinfo() {
		ContainerinfoImpl containerinfo = new ContainerinfoImpl();
		return containerinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requestutilization createRequestutilization() {
		RequestutilizationImpl requestutilization = new RequestutilizationImpl();
		return requestutilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apiendpointhandlerlink createApiendpointhandlerlink() {
		ApiendpointhandlerlinkImpl apiendpointhandlerlink = new ApiendpointhandlerlinkImpl();
		return apiendpointhandlerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staticfileshandlerlink createStaticfileshandlerlink() {
		StaticfileshandlerlinkImpl staticfileshandlerlink = new StaticfileshandlerlinkImpl();
		return staticfileshandlerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scripthandlerlink createScripthandlerlink() {
		ScripthandlerlinkImpl scripthandlerlink = new ScripthandlerlinkImpl();
		return scripthandlerlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Urlmap createUrlmap() {
		UrlmapImpl urlmap = new UrlmapImpl();
		return urlmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpointsapiservice createEndpointsapiservice() {
		EndpointsapiserviceImpl endpointsapiservice = new EndpointsapiserviceImpl();
		return endpointsapiservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statuslink createStatuslink() {
		StatuslinkImpl statuslink = new StatuslinkImpl();
		return statuslink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apiconfighandler createApiconfighandler() {
		ApiconfighandlerImpl apiconfighandler = new ApiconfighandlerImpl();
		return apiconfighandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staticfileshandler createStaticfileshandler() {
		StaticfileshandlerImpl staticfileshandler = new StaticfileshandlerImpl();
		return staticfileshandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basicscaling createBasicscaling() {
		BasicscalingImpl basicscaling = new BasicscalingImpl();
		return basicscaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diskutilization createDiskutilization() {
		DiskutilizationImpl diskutilization = new DiskutilizationImpl();
		return diskutilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Errorcode createErrorcodeFromString(EDataType eDataType, String initialValue) {
		Errorcode result = Errorcode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertErrorcodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Servingstatus createServingstatusFromString(EDataType eDataType, String initialValue) {
		Servingstatus result = Servingstatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServingstatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailabilityFromString(EDataType eDataType, String initialValue) {
		Availability result = Availability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAvailabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionServingstatus createVersionServingstatusFromString(EDataType eDataType, String initialValue) {
		VersionServingstatus result = VersionServingstatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionServingstatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shardby createShardbyFromString(EDataType eDataType, String initialValue) {
		Shardby result = Shardby.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShardbyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Redirecthttpresponsecode createRedirecthttpresponsecodeFromString(EDataType eDataType, String initialValue) {
		Redirecthttpresponsecode result = Redirecthttpresponsecode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRedirecthttpresponsecodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Securitylevel createSecuritylevelFromString(EDataType eDataType, String initialValue) {
		Securitylevel result = Securitylevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuritylevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authfailaction createAuthfailactionFromString(EDataType eDataType, String initialValue) {
		Authfailaction result = Authfailaction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthfailactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Login createLoginFromString(EDataType eDataType, String initialValue) {
		Login result = Login.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiConfigHandlerSecuritylevel createApiConfigHandlerSecuritylevelFromString(EDataType eDataType, String initialValue) {
		ApiConfigHandlerSecuritylevel result = ApiConfigHandlerSecuritylevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiConfigHandlerSecuritylevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiConfigHandlerAuthfailaction createApiConfigHandlerAuthfailactionFromString(EDataType eDataType, String initialValue) {
		ApiConfigHandlerAuthfailaction result = ApiConfigHandlerAuthfailaction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiConfigHandlerAuthfailactionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApiConfigHandlerLogin createApiConfigHandlerLoginFromString(EDataType eDataType, String initialValue) {
		ApiConfigHandlerLogin result = ApiConfigHandlerLogin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApiConfigHandlerLoginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createfloatFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertfloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte createbyteFromString(EDataType eDataType, String initialValue) {
		return (Byte)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertbyteToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createdoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createobjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertobjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createlongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createmapFromString(EDataType eDataType, String initialValue) {
		return (Map)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertmapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createanyFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertanyToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createshortFromString(EDataType eDataType, String initialValue) {
		return (Short)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertshortToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppenginePackage getAppenginePackage() {
		return (AppenginePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppenginePackage getPackage() {
		return AppenginePackage.eINSTANCE;
	}

} //AppengineFactoryImpl
