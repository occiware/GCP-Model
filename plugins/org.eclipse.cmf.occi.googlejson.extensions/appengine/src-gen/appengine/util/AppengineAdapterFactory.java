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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see appengine.AppenginePackage
 * @generated
 */
public class AppengineAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppenginePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppengineAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AppenginePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppengineSwitch<Adapter> modelSwitch =
		new AppengineSwitch<Adapter>() {
			@Override
			public Adapter casearray(array object) {
				return createarrayAdapter();
			}
			@Override
			public Adapter caseCpuutilization(Cpuutilization object) {
				return createCpuutilizationAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter caseIdentityawareproxy(Identityawareproxy object) {
				return createIdentityawareproxyAdapter();
			}
			@Override
			public Adapter caseManualscaling(Manualscaling object) {
				return createManualscalingAdapter();
			}
			@Override
			public Adapter caseLocationmetadata(Locationmetadata object) {
				return createLocationmetadataAdapter();
			}
			@Override
			public Adapter caseTrafficsplitlink(Trafficsplitlink object) {
				return createTrafficsplitlinkAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseListoperationsresponse(Listoperationsresponse object) {
				return createListoperationsresponseAdapter();
			}
			@Override
			public Adapter caseOperationmetadata(Operationmetadata object) {
				return createOperationmetadataAdapter();
			}
			@Override
			public Adapter caseFirewallrule(Firewallrule object) {
				return createFirewallruleAdapter();
			}
			@Override
			public Adapter caseListauthorizedcertificatesresponse(Listauthorizedcertificatesresponse object) {
				return createListauthorizedcertificatesresponseAdapter();
			}
			@Override
			public Adapter caseFeaturesettings(Featuresettings object) {
				return createFeaturesettingsAdapter();
			}
			@Override
			public Adapter caseErrorhandler(Errorhandler object) {
				return createErrorhandlerAdapter();
			}
			@Override
			public Adapter caseSslsettings(Sslsettings object) {
				return createSslsettingsAdapter();
			}
			@Override
			public Adapter caseOperationmetadatav1(Operationmetadatav1 object) {
				return createOperationmetadatav1Adapter();
			}
			@Override
			public Adapter caseFeaturesettingslink(Featuresettingslink object) {
				return createFeaturesettingslinkAdapter();
			}
			@Override
			public Adapter caseIdentityawareproxylink(Identityawareproxylink object) {
				return createIdentityawareproxylinkAdapter();
			}
			@Override
			public Adapter caseApplication(Application object) {
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseLivenesscheck(Livenesscheck object) {
				return createLivenesscheckAdapter();
			}
			@Override
			public Adapter caseBatchupdateingressrulesrequest(Batchupdateingressrulesrequest object) {
				return createBatchupdateingressrulesrequestAdapter();
			}
			@Override
			public Adapter caseNetworkutilization(Networkutilization object) {
				return createNetworkutilizationAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseHealthcheck(Healthcheck object) {
				return createHealthcheckAdapter();
			}
			@Override
			public Adapter caseReadinesscheck(Readinesscheck object) {
				return createReadinesscheckAdapter();
			}
			@Override
			public Adapter caseDebuginstancerequest(Debuginstancerequest object) {
				return createDebuginstancerequestAdapter();
			}
			@Override
			public Adapter caseOperationmetadatav1beta5(Operationmetadatav1beta5 object) {
				return createOperationmetadatav1beta5Adapter();
			}
			@Override
			public Adapter caseAutomaticscalinglink(Automaticscalinglink object) {
				return createAutomaticscalinglinkAdapter();
			}
			@Override
			public Adapter caseHealthchecklink(Healthchecklink object) {
				return createHealthchecklinkAdapter();
			}
			@Override
			public Adapter caseReadinesschecklink(Readinesschecklink object) {
				return createReadinesschecklinkAdapter();
			}
			@Override
			public Adapter caseManualscalinglink(Manualscalinglink object) {
				return createManualscalinglinkAdapter();
			}
			@Override
			public Adapter caseApiconfighandlerlink(Apiconfighandlerlink object) {
				return createApiconfighandlerlinkAdapter();
			}
			@Override
			public Adapter caseEndpointsapiservicelink(Endpointsapiservicelink object) {
				return createEndpointsapiservicelinkAdapter();
			}
			@Override
			public Adapter caseDeploymentlink(Deploymentlink object) {
				return createDeploymentlinkAdapter();
			}
			@Override
			public Adapter caseResourceslink(Resourceslink object) {
				return createResourceslinkAdapter();
			}
			@Override
			public Adapter caseBasicscalinglink(Basicscalinglink object) {
				return createBasicscalinglinkAdapter();
			}
			@Override
			public Adapter caseLivenesschecklink(Livenesschecklink object) {
				return createLivenesschecklinkAdapter();
			}
			@Override
			public Adapter caseNetworklink(Networklink object) {
				return createNetworklinkAdapter();
			}
			@Override
			public Adapter caseVersion(Version object) {
				return createVersionAdapter();
			}
			@Override
			public Adapter caseRepairapplicationrequest(Repairapplicationrequest object) {
				return createRepairapplicationrequestAdapter();
			}
			@Override
			public Adapter caseCertificaterawdata(Certificaterawdata object) {
				return createCertificaterawdataAdapter();
			}
			@Override
			public Adapter caseFileinfo(Fileinfo object) {
				return createFileinfoAdapter();
			}
			@Override
			public Adapter caseScripthandler(Scripthandler object) {
				return createScripthandlerAdapter();
			}
			@Override
			public Adapter caseOperationmetadataexperimental(Operationmetadataexperimental object) {
				return createOperationmetadataexperimentalAdapter();
			}
			@Override
			public Adapter caseAuthorizeddomain(Authorizeddomain object) {
				return createAuthorizeddomainAdapter();
			}
			@Override
			public Adapter caseTrafficsplit(Trafficsplit object) {
				return createTrafficsplitAdapter();
			}
			@Override
			public Adapter caseOperationmetadatav1beta(Operationmetadatav1beta object) {
				return createOperationmetadatav1betaAdapter();
			}
			@Override
			public Adapter caseListservicesresponse(Listservicesresponse object) {
				return createListservicesresponseAdapter();
			}
			@Override
			public Adapter caseListingressrulesresponse(Listingressrulesresponse object) {
				return createListingressrulesresponseAdapter();
			}
			@Override
			public Adapter caseResources(Resources object) {
				return createResourcesAdapter();
			}
			@Override
			public Adapter caseZipinfolink(Zipinfolink object) {
				return createZipinfolinkAdapter();
			}
			@Override
			public Adapter caseContainerinfolink(Containerinfolink object) {
				return createContainerinfolinkAdapter();
			}
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseBatchupdateingressrulesresponse(Batchupdateingressrulesresponse object) {
				return createBatchupdateingressrulesresponseAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseListinstancesresponse(Listinstancesresponse object) {
				return createListinstancesresponseAdapter();
			}
			@Override
			public Adapter caseListdomainmappingsresponse(Listdomainmappingsresponse object) {
				return createListdomainmappingsresponseAdapter();
			}
			@Override
			public Adapter caseOperationmetadatav1alpha(Operationmetadatav1alpha object) {
				return createOperationmetadatav1alphaAdapter();
			}
			@Override
			public Adapter caseUrldispatchrule(Urldispatchrule object) {
				return createUrldispatchruleAdapter();
			}
			@Override
			public Adapter caseListversionsresponse(Listversionsresponse object) {
				return createListversionsresponseAdapter();
			}
			@Override
			public Adapter caseListauthorizeddomainsresponse(Listauthorizeddomainsresponse object) {
				return createListauthorizeddomainsresponseAdapter();
			}
			@Override
			public Adapter caseEmpty(Empty object) {
				return createEmptyAdapter();
			}
			@Override
			public Adapter caseApiendpointhandler(Apiendpointhandler object) {
				return createApiendpointhandlerAdapter();
			}
			@Override
			public Adapter caseSslsettingslink(Sslsettingslink object) {
				return createSslsettingslinkAdapter();
			}
			@Override
			public Adapter caseDomainmapping(Domainmapping object) {
				return createDomainmappingAdapter();
			}
			@Override
			public Adapter caseRequestutilizationlink(Requestutilizationlink object) {
				return createRequestutilizationlinkAdapter();
			}
			@Override
			public Adapter caseNetworkutilizationlink(Networkutilizationlink object) {
				return createNetworkutilizationlinkAdapter();
			}
			@Override
			public Adapter caseCpuutilizationlink(Cpuutilizationlink object) {
				return createCpuutilizationlinkAdapter();
			}
			@Override
			public Adapter caseDiskutilizationlink(Diskutilizationlink object) {
				return createDiskutilizationlinkAdapter();
			}
			@Override
			public Adapter caseAutomaticscaling(Automaticscaling object) {
				return createAutomaticscalingAdapter();
			}
			@Override
			public Adapter caseZipinfo(Zipinfo object) {
				return createZipinfoAdapter();
			}
			@Override
			public Adapter caseCertificaterawdatalink(Certificaterawdatalink object) {
				return createCertificaterawdatalinkAdapter();
			}
			@Override
			public Adapter caseAuthorizedcertificate(Authorizedcertificate object) {
				return createAuthorizedcertificateAdapter();
			}
			@Override
			public Adapter caseResourcerecord(Resourcerecord object) {
				return createResourcerecordAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseListlocationsresponse(Listlocationsresponse object) {
				return createListlocationsresponseAdapter();
			}
			@Override
			public Adapter caseContainerinfo(Containerinfo object) {
				return createContainerinfoAdapter();
			}
			@Override
			public Adapter caseRequestutilization(Requestutilization object) {
				return createRequestutilizationAdapter();
			}
			@Override
			public Adapter caseApiendpointhandlerlink(Apiendpointhandlerlink object) {
				return createApiendpointhandlerlinkAdapter();
			}
			@Override
			public Adapter caseStaticfileshandlerlink(Staticfileshandlerlink object) {
				return createStaticfileshandlerlinkAdapter();
			}
			@Override
			public Adapter caseScripthandlerlink(Scripthandlerlink object) {
				return createScripthandlerlinkAdapter();
			}
			@Override
			public Adapter caseUrlmap(Urlmap object) {
				return createUrlmapAdapter();
			}
			@Override
			public Adapter caseEndpointsapiservice(Endpointsapiservice object) {
				return createEndpointsapiserviceAdapter();
			}
			@Override
			public Adapter caseStatuslink(Statuslink object) {
				return createStatuslinkAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseApiconfighandler(Apiconfighandler object) {
				return createApiconfighandlerAdapter();
			}
			@Override
			public Adapter caseStaticfileshandler(Staticfileshandler object) {
				return createStaticfileshandlerAdapter();
			}
			@Override
			public Adapter caseBasicscaling(Basicscaling object) {
				return createBasicscalingAdapter();
			}
			@Override
			public Adapter caseDiskutilization(Diskutilization object) {
				return createDiskutilizationAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link appengine.array <em>array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.array
	 * @generated
	 */
	public Adapter createarrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Cpuutilization <em>Cpuutilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Cpuutilization
	 * @generated
	 */
	public Adapter createCpuutilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Identityawareproxy <em>Identityawareproxy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Identityawareproxy
	 * @generated
	 */
	public Adapter createIdentityawareproxyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Manualscaling <em>Manualscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Manualscaling
	 * @generated
	 */
	public Adapter createManualscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Locationmetadata <em>Locationmetadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Locationmetadata
	 * @generated
	 */
	public Adapter createLocationmetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Trafficsplitlink <em>Trafficsplitlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Trafficsplitlink
	 * @generated
	 */
	public Adapter createTrafficsplitlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listoperationsresponse <em>Listoperationsresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listoperationsresponse
	 * @generated
	 */
	public Adapter createListoperationsresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operationmetadata <em>Operationmetadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operationmetadata
	 * @generated
	 */
	public Adapter createOperationmetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Firewallrule <em>Firewallrule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Firewallrule
	 * @generated
	 */
	public Adapter createFirewallruleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listauthorizedcertificatesresponse <em>Listauthorizedcertificatesresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listauthorizedcertificatesresponse
	 * @generated
	 */
	public Adapter createListauthorizedcertificatesresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Featuresettings <em>Featuresettings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Featuresettings
	 * @generated
	 */
	public Adapter createFeaturesettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Errorhandler <em>Errorhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Errorhandler
	 * @generated
	 */
	public Adapter createErrorhandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Sslsettings <em>Sslsettings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Sslsettings
	 * @generated
	 */
	public Adapter createSslsettingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operationmetadatav1 <em>Operationmetadatav1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operationmetadatav1
	 * @generated
	 */
	public Adapter createOperationmetadatav1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Featuresettingslink <em>Featuresettingslink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Featuresettingslink
	 * @generated
	 */
	public Adapter createFeaturesettingslinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Identityawareproxylink <em>Identityawareproxylink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Identityawareproxylink
	 * @generated
	 */
	public Adapter createIdentityawareproxylinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Livenesscheck <em>Livenesscheck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Livenesscheck
	 * @generated
	 */
	public Adapter createLivenesscheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Batchupdateingressrulesrequest <em>Batchupdateingressrulesrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Batchupdateingressrulesrequest
	 * @generated
	 */
	public Adapter createBatchupdateingressrulesrequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Networkutilization <em>Networkutilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Networkutilization
	 * @generated
	 */
	public Adapter createNetworkutilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Healthcheck <em>Healthcheck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Healthcheck
	 * @generated
	 */
	public Adapter createHealthcheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Readinesscheck <em>Readinesscheck</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Readinesscheck
	 * @generated
	 */
	public Adapter createReadinesscheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Debuginstancerequest <em>Debuginstancerequest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Debuginstancerequest
	 * @generated
	 */
	public Adapter createDebuginstancerequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operationmetadatav1beta5 <em>Operationmetadatav1beta5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operationmetadatav1beta5
	 * @generated
	 */
	public Adapter createOperationmetadatav1beta5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Automaticscalinglink <em>Automaticscalinglink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Automaticscalinglink
	 * @generated
	 */
	public Adapter createAutomaticscalinglinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Healthchecklink <em>Healthchecklink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Healthchecklink
	 * @generated
	 */
	public Adapter createHealthchecklinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Readinesschecklink <em>Readinesschecklink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Readinesschecklink
	 * @generated
	 */
	public Adapter createReadinesschecklinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Manualscalinglink <em>Manualscalinglink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Manualscalinglink
	 * @generated
	 */
	public Adapter createManualscalinglinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Apiconfighandlerlink <em>Apiconfighandlerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Apiconfighandlerlink
	 * @generated
	 */
	public Adapter createApiconfighandlerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Endpointsapiservicelink <em>Endpointsapiservicelink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Endpointsapiservicelink
	 * @generated
	 */
	public Adapter createEndpointsapiservicelinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Deploymentlink <em>Deploymentlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Deploymentlink
	 * @generated
	 */
	public Adapter createDeploymentlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Resourceslink <em>Resourceslink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Resourceslink
	 * @generated
	 */
	public Adapter createResourceslinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Basicscalinglink <em>Basicscalinglink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Basicscalinglink
	 * @generated
	 */
	public Adapter createBasicscalinglinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Livenesschecklink <em>Livenesschecklink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Livenesschecklink
	 * @generated
	 */
	public Adapter createLivenesschecklinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Networklink <em>Networklink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Networklink
	 * @generated
	 */
	public Adapter createNetworklinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Version
	 * @generated
	 */
	public Adapter createVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Repairapplicationrequest <em>Repairapplicationrequest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Repairapplicationrequest
	 * @generated
	 */
	public Adapter createRepairapplicationrequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Certificaterawdata <em>Certificaterawdata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Certificaterawdata
	 * @generated
	 */
	public Adapter createCertificaterawdataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Fileinfo <em>Fileinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Fileinfo
	 * @generated
	 */
	public Adapter createFileinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Scripthandler <em>Scripthandler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Scripthandler
	 * @generated
	 */
	public Adapter createScripthandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operationmetadataexperimental <em>Operationmetadataexperimental</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operationmetadataexperimental
	 * @generated
	 */
	public Adapter createOperationmetadataexperimentalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Authorizeddomain <em>Authorizeddomain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Authorizeddomain
	 * @generated
	 */
	public Adapter createAuthorizeddomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Trafficsplit <em>Trafficsplit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Trafficsplit
	 * @generated
	 */
	public Adapter createTrafficsplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operationmetadatav1beta <em>Operationmetadatav1beta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operationmetadatav1beta
	 * @generated
	 */
	public Adapter createOperationmetadatav1betaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listservicesresponse <em>Listservicesresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listservicesresponse
	 * @generated
	 */
	public Adapter createListservicesresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listingressrulesresponse <em>Listingressrulesresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listingressrulesresponse
	 * @generated
	 */
	public Adapter createListingressrulesresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Resources
	 * @generated
	 */
	public Adapter createResourcesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Zipinfolink <em>Zipinfolink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Zipinfolink
	 * @generated
	 */
	public Adapter createZipinfolinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Containerinfolink <em>Containerinfolink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Containerinfolink
	 * @generated
	 */
	public Adapter createContainerinfolinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Batchupdateingressrulesresponse <em>Batchupdateingressrulesresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Batchupdateingressrulesresponse
	 * @generated
	 */
	public Adapter createBatchupdateingressrulesresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listinstancesresponse <em>Listinstancesresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listinstancesresponse
	 * @generated
	 */
	public Adapter createListinstancesresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listdomainmappingsresponse <em>Listdomainmappingsresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listdomainmappingsresponse
	 * @generated
	 */
	public Adapter createListdomainmappingsresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operationmetadatav1alpha <em>Operationmetadatav1alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operationmetadatav1alpha
	 * @generated
	 */
	public Adapter createOperationmetadatav1alphaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Urldispatchrule <em>Urldispatchrule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Urldispatchrule
	 * @generated
	 */
	public Adapter createUrldispatchruleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listversionsresponse <em>Listversionsresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listversionsresponse
	 * @generated
	 */
	public Adapter createListversionsresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listauthorizeddomainsresponse <em>Listauthorizeddomainsresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listauthorizeddomainsresponse
	 * @generated
	 */
	public Adapter createListauthorizeddomainsresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Empty
	 * @generated
	 */
	public Adapter createEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Apiendpointhandler <em>Apiendpointhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Apiendpointhandler
	 * @generated
	 */
	public Adapter createApiendpointhandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Sslsettingslink <em>Sslsettingslink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Sslsettingslink
	 * @generated
	 */
	public Adapter createSslsettingslinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Domainmapping <em>Domainmapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Domainmapping
	 * @generated
	 */
	public Adapter createDomainmappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Requestutilizationlink <em>Requestutilizationlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Requestutilizationlink
	 * @generated
	 */
	public Adapter createRequestutilizationlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Networkutilizationlink <em>Networkutilizationlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Networkutilizationlink
	 * @generated
	 */
	public Adapter createNetworkutilizationlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Cpuutilizationlink <em>Cpuutilizationlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Cpuutilizationlink
	 * @generated
	 */
	public Adapter createCpuutilizationlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Diskutilizationlink <em>Diskutilizationlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Diskutilizationlink
	 * @generated
	 */
	public Adapter createDiskutilizationlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Automaticscaling <em>Automaticscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Automaticscaling
	 * @generated
	 */
	public Adapter createAutomaticscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Zipinfo <em>Zipinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Zipinfo
	 * @generated
	 */
	public Adapter createZipinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Certificaterawdatalink <em>Certificaterawdatalink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Certificaterawdatalink
	 * @generated
	 */
	public Adapter createCertificaterawdatalinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Authorizedcertificate <em>Authorizedcertificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Authorizedcertificate
	 * @generated
	 */
	public Adapter createAuthorizedcertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Resourcerecord <em>Resourcerecord</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Resourcerecord
	 * @generated
	 */
	public Adapter createResourcerecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Listlocationsresponse <em>Listlocationsresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Listlocationsresponse
	 * @generated
	 */
	public Adapter createListlocationsresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Containerinfo <em>Containerinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Containerinfo
	 * @generated
	 */
	public Adapter createContainerinfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Requestutilization <em>Requestutilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Requestutilization
	 * @generated
	 */
	public Adapter createRequestutilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Apiendpointhandlerlink <em>Apiendpointhandlerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Apiendpointhandlerlink
	 * @generated
	 */
	public Adapter createApiendpointhandlerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Staticfileshandlerlink <em>Staticfileshandlerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Staticfileshandlerlink
	 * @generated
	 */
	public Adapter createStaticfileshandlerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Scripthandlerlink <em>Scripthandlerlink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Scripthandlerlink
	 * @generated
	 */
	public Adapter createScripthandlerlinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Urlmap <em>Urlmap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Urlmap
	 * @generated
	 */
	public Adapter createUrlmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Endpointsapiservice <em>Endpointsapiservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Endpointsapiservice
	 * @generated
	 */
	public Adapter createEndpointsapiserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Statuslink <em>Statuslink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Statuslink
	 * @generated
	 */
	public Adapter createStatuslinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Apiconfighandler <em>Apiconfighandler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Apiconfighandler
	 * @generated
	 */
	public Adapter createApiconfighandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Staticfileshandler <em>Staticfileshandler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Staticfileshandler
	 * @generated
	 */
	public Adapter createStaticfileshandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Basicscaling <em>Basicscaling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Basicscaling
	 * @generated
	 */
	public Adapter createBasicscalingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link appengine.Diskutilization <em>Diskutilization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see appengine.Diskutilization
	 * @generated
	 */
	public Adapter createDiskutilizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AppengineAdapterFactory
