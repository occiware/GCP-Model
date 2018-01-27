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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see appengine.AppenginePackage
 * @generated
 */
public interface AppengineFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppengineFactory eINSTANCE = appengine.impl.AppengineFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>array</em>'.
	 * @generated
	 */
	array createarray();

	/**
	 * Returns a new object of class '<em>Cpuutilization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpuutilization</em>'.
	 * @generated
	 */
	Cpuutilization createCpuutilization();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Identityawareproxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identityawareproxy</em>'.
	 * @generated
	 */
	Identityawareproxy createIdentityawareproxy();

	/**
	 * Returns a new object of class '<em>Manualscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manualscaling</em>'.
	 * @generated
	 */
	Manualscaling createManualscaling();

	/**
	 * Returns a new object of class '<em>Locationmetadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Locationmetadata</em>'.
	 * @generated
	 */
	Locationmetadata createLocationmetadata();

	/**
	 * Returns a new object of class '<em>Trafficsplitlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trafficsplitlink</em>'.
	 * @generated
	 */
	Trafficsplitlink createTrafficsplitlink();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Listoperationsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listoperationsresponse</em>'.
	 * @generated
	 */
	Listoperationsresponse createListoperationsresponse();

	/**
	 * Returns a new object of class '<em>Operationmetadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmetadata</em>'.
	 * @generated
	 */
	Operationmetadata createOperationmetadata();

	/**
	 * Returns a new object of class '<em>Firewallrule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firewallrule</em>'.
	 * @generated
	 */
	Firewallrule createFirewallrule();

	/**
	 * Returns a new object of class '<em>Listauthorizedcertificatesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listauthorizedcertificatesresponse</em>'.
	 * @generated
	 */
	Listauthorizedcertificatesresponse createListauthorizedcertificatesresponse();

	/**
	 * Returns a new object of class '<em>Featuresettings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Featuresettings</em>'.
	 * @generated
	 */
	Featuresettings createFeaturesettings();

	/**
	 * Returns a new object of class '<em>Errorhandler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Errorhandler</em>'.
	 * @generated
	 */
	Errorhandler createErrorhandler();

	/**
	 * Returns a new object of class '<em>Sslsettings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sslsettings</em>'.
	 * @generated
	 */
	Sslsettings createSslsettings();

	/**
	 * Returns a new object of class '<em>Operationmetadatav1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmetadatav1</em>'.
	 * @generated
	 */
	Operationmetadatav1 createOperationmetadatav1();

	/**
	 * Returns a new object of class '<em>Featuresettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Featuresettingslink</em>'.
	 * @generated
	 */
	Featuresettingslink createFeaturesettingslink();

	/**
	 * Returns a new object of class '<em>Identityawareproxylink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identityawareproxylink</em>'.
	 * @generated
	 */
	Identityawareproxylink createIdentityawareproxylink();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Livenesscheck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livenesscheck</em>'.
	 * @generated
	 */
	Livenesscheck createLivenesscheck();

	/**
	 * Returns a new object of class '<em>Batchupdateingressrulesrequest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batchupdateingressrulesrequest</em>'.
	 * @generated
	 */
	Batchupdateingressrulesrequest createBatchupdateingressrulesrequest();

	/**
	 * Returns a new object of class '<em>Networkutilization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networkutilization</em>'.
	 * @generated
	 */
	Networkutilization createNetworkutilization();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Healthcheck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcheck</em>'.
	 * @generated
	 */
	Healthcheck createHealthcheck();

	/**
	 * Returns a new object of class '<em>Readinesscheck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Readinesscheck</em>'.
	 * @generated
	 */
	Readinesscheck createReadinesscheck();

	/**
	 * Returns a new object of class '<em>Debuginstancerequest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debuginstancerequest</em>'.
	 * @generated
	 */
	Debuginstancerequest createDebuginstancerequest();

	/**
	 * Returns a new object of class '<em>Operationmetadatav1beta5</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmetadatav1beta5</em>'.
	 * @generated
	 */
	Operationmetadatav1beta5 createOperationmetadatav1beta5();

	/**
	 * Returns a new object of class '<em>Automaticscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automaticscalinglink</em>'.
	 * @generated
	 */
	Automaticscalinglink createAutomaticscalinglink();

	/**
	 * Returns a new object of class '<em>Healthchecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthchecklink</em>'.
	 * @generated
	 */
	Healthchecklink createHealthchecklink();

	/**
	 * Returns a new object of class '<em>Readinesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Readinesschecklink</em>'.
	 * @generated
	 */
	Readinesschecklink createReadinesschecklink();

	/**
	 * Returns a new object of class '<em>Manualscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manualscalinglink</em>'.
	 * @generated
	 */
	Manualscalinglink createManualscalinglink();

	/**
	 * Returns a new object of class '<em>Apiconfighandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apiconfighandlerlink</em>'.
	 * @generated
	 */
	Apiconfighandlerlink createApiconfighandlerlink();

	/**
	 * Returns a new object of class '<em>Endpointsapiservicelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpointsapiservicelink</em>'.
	 * @generated
	 */
	Endpointsapiservicelink createEndpointsapiservicelink();

	/**
	 * Returns a new object of class '<em>Deploymentlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploymentlink</em>'.
	 * @generated
	 */
	Deploymentlink createDeploymentlink();

	/**
	 * Returns a new object of class '<em>Resourceslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resourceslink</em>'.
	 * @generated
	 */
	Resourceslink createResourceslink();

	/**
	 * Returns a new object of class '<em>Basicscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basicscalinglink</em>'.
	 * @generated
	 */
	Basicscalinglink createBasicscalinglink();

	/**
	 * Returns a new object of class '<em>Livenesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Livenesschecklink</em>'.
	 * @generated
	 */
	Livenesschecklink createLivenesschecklink();

	/**
	 * Returns a new object of class '<em>Networklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networklink</em>'.
	 * @generated
	 */
	Networklink createNetworklink();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Repairapplicationrequest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repairapplicationrequest</em>'.
	 * @generated
	 */
	Repairapplicationrequest createRepairapplicationrequest();

	/**
	 * Returns a new object of class '<em>Certificaterawdata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificaterawdata</em>'.
	 * @generated
	 */
	Certificaterawdata createCertificaterawdata();

	/**
	 * Returns a new object of class '<em>Fileinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fileinfo</em>'.
	 * @generated
	 */
	Fileinfo createFileinfo();

	/**
	 * Returns a new object of class '<em>Scripthandler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripthandler</em>'.
	 * @generated
	 */
	Scripthandler createScripthandler();

	/**
	 * Returns a new object of class '<em>Operationmetadataexperimental</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmetadataexperimental</em>'.
	 * @generated
	 */
	Operationmetadataexperimental createOperationmetadataexperimental();

	/**
	 * Returns a new object of class '<em>Authorizeddomain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorizeddomain</em>'.
	 * @generated
	 */
	Authorizeddomain createAuthorizeddomain();

	/**
	 * Returns a new object of class '<em>Trafficsplit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trafficsplit</em>'.
	 * @generated
	 */
	Trafficsplit createTrafficsplit();

	/**
	 * Returns a new object of class '<em>Operationmetadatav1beta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmetadatav1beta</em>'.
	 * @generated
	 */
	Operationmetadatav1beta createOperationmetadatav1beta();

	/**
	 * Returns a new object of class '<em>Listservicesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listservicesresponse</em>'.
	 * @generated
	 */
	Listservicesresponse createListservicesresponse();

	/**
	 * Returns a new object of class '<em>Listingressrulesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listingressrulesresponse</em>'.
	 * @generated
	 */
	Listingressrulesresponse createListingressrulesresponse();

	/**
	 * Returns a new object of class '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resources</em>'.
	 * @generated
	 */
	Resources createResources();

	/**
	 * Returns a new object of class '<em>Zipinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zipinfolink</em>'.
	 * @generated
	 */
	Zipinfolink createZipinfolink();

	/**
	 * Returns a new object of class '<em>Containerinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containerinfolink</em>'.
	 * @generated
	 */
	Containerinfolink createContainerinfolink();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Batchupdateingressrulesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Batchupdateingressrulesresponse</em>'.
	 * @generated
	 */
	Batchupdateingressrulesresponse createBatchupdateingressrulesresponse();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Listinstancesresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listinstancesresponse</em>'.
	 * @generated
	 */
	Listinstancesresponse createListinstancesresponse();

	/**
	 * Returns a new object of class '<em>Listdomainmappingsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listdomainmappingsresponse</em>'.
	 * @generated
	 */
	Listdomainmappingsresponse createListdomainmappingsresponse();

	/**
	 * Returns a new object of class '<em>Operationmetadatav1alpha</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationmetadatav1alpha</em>'.
	 * @generated
	 */
	Operationmetadatav1alpha createOperationmetadatav1alpha();

	/**
	 * Returns a new object of class '<em>Urldispatchrule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Urldispatchrule</em>'.
	 * @generated
	 */
	Urldispatchrule createUrldispatchrule();

	/**
	 * Returns a new object of class '<em>Listversionsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listversionsresponse</em>'.
	 * @generated
	 */
	Listversionsresponse createListversionsresponse();

	/**
	 * Returns a new object of class '<em>Listauthorizeddomainsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listauthorizeddomainsresponse</em>'.
	 * @generated
	 */
	Listauthorizeddomainsresponse createListauthorizeddomainsresponse();

	/**
	 * Returns a new object of class '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Empty</em>'.
	 * @generated
	 */
	Empty createEmpty();

	/**
	 * Returns a new object of class '<em>Apiendpointhandler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apiendpointhandler</em>'.
	 * @generated
	 */
	Apiendpointhandler createApiendpointhandler();

	/**
	 * Returns a new object of class '<em>Sslsettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sslsettingslink</em>'.
	 * @generated
	 */
	Sslsettingslink createSslsettingslink();

	/**
	 * Returns a new object of class '<em>Domainmapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domainmapping</em>'.
	 * @generated
	 */
	Domainmapping createDomainmapping();

	/**
	 * Returns a new object of class '<em>Requestutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requestutilizationlink</em>'.
	 * @generated
	 */
	Requestutilizationlink createRequestutilizationlink();

	/**
	 * Returns a new object of class '<em>Networkutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networkutilizationlink</em>'.
	 * @generated
	 */
	Networkutilizationlink createNetworkutilizationlink();

	/**
	 * Returns a new object of class '<em>Cpuutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpuutilizationlink</em>'.
	 * @generated
	 */
	Cpuutilizationlink createCpuutilizationlink();

	/**
	 * Returns a new object of class '<em>Diskutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diskutilizationlink</em>'.
	 * @generated
	 */
	Diskutilizationlink createDiskutilizationlink();

	/**
	 * Returns a new object of class '<em>Automaticscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Automaticscaling</em>'.
	 * @generated
	 */
	Automaticscaling createAutomaticscaling();

	/**
	 * Returns a new object of class '<em>Zipinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zipinfo</em>'.
	 * @generated
	 */
	Zipinfo createZipinfo();

	/**
	 * Returns a new object of class '<em>Certificaterawdatalink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificaterawdatalink</em>'.
	 * @generated
	 */
	Certificaterawdatalink createCertificaterawdatalink();

	/**
	 * Returns a new object of class '<em>Authorizedcertificate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorizedcertificate</em>'.
	 * @generated
	 */
	Authorizedcertificate createAuthorizedcertificate();

	/**
	 * Returns a new object of class '<em>Resourcerecord</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resourcerecord</em>'.
	 * @generated
	 */
	Resourcerecord createResourcerecord();

	/**
	 * Returns a new object of class '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Library</em>'.
	 * @generated
	 */
	Library createLibrary();

	/**
	 * Returns a new object of class '<em>Listlocationsresponse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Listlocationsresponse</em>'.
	 * @generated
	 */
	Listlocationsresponse createListlocationsresponse();

	/**
	 * Returns a new object of class '<em>Containerinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Containerinfo</em>'.
	 * @generated
	 */
	Containerinfo createContainerinfo();

	/**
	 * Returns a new object of class '<em>Requestutilization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requestutilization</em>'.
	 * @generated
	 */
	Requestutilization createRequestutilization();

	/**
	 * Returns a new object of class '<em>Apiendpointhandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apiendpointhandlerlink</em>'.
	 * @generated
	 */
	Apiendpointhandlerlink createApiendpointhandlerlink();

	/**
	 * Returns a new object of class '<em>Staticfileshandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staticfileshandlerlink</em>'.
	 * @generated
	 */
	Staticfileshandlerlink createStaticfileshandlerlink();

	/**
	 * Returns a new object of class '<em>Scripthandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripthandlerlink</em>'.
	 * @generated
	 */
	Scripthandlerlink createScripthandlerlink();

	/**
	 * Returns a new object of class '<em>Urlmap</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Urlmap</em>'.
	 * @generated
	 */
	Urlmap createUrlmap();

	/**
	 * Returns a new object of class '<em>Endpointsapiservice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpointsapiservice</em>'.
	 * @generated
	 */
	Endpointsapiservice createEndpointsapiservice();

	/**
	 * Returns a new object of class '<em>Statuslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statuslink</em>'.
	 * @generated
	 */
	Statuslink createStatuslink();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Apiconfighandler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apiconfighandler</em>'.
	 * @generated
	 */
	Apiconfighandler createApiconfighandler();

	/**
	 * Returns a new object of class '<em>Staticfileshandler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staticfileshandler</em>'.
	 * @generated
	 */
	Staticfileshandler createStaticfileshandler();

	/**
	 * Returns a new object of class '<em>Basicscaling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basicscaling</em>'.
	 * @generated
	 */
	Basicscaling createBasicscaling();

	/**
	 * Returns a new object of class '<em>Diskutilization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diskutilization</em>'.
	 * @generated
	 */
	Diskutilization createDiskutilization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppenginePackage getAppenginePackage();

} //AppengineFactory
