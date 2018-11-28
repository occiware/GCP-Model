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

import appengine.Action;
import appengine.ApiConfigHandlerAuthfailaction;
import appengine.ApiConfigHandlerLogin;
import appengine.ApiConfigHandlerSecuritylevel;
import appengine.Apiconfighandler;
import appengine.Apiconfighandlerlink;
import appengine.Apiendpointhandler;
import appengine.Apiendpointhandlerlink;
import appengine.AppengineFactory;
import appengine.AppenginePackage;
import appengine.Application;
import appengine.Authfailaction;
import appengine.Authorizedcertificate;
import appengine.Authorizeddomain;
import appengine.Automaticscaling;
import appengine.Automaticscalinglink;
import appengine.Availability;
import appengine.Basicscaling;
import appengine.Basicscalinglink;
import appengine.Batchupdateingressrulesrequest;
import appengine.Batchupdateingressrulesresponse;
import appengine.Certificaterawdata;
import appengine.Certificaterawdatalink;
import appengine.Containerinfo;
import appengine.Containerinfolink;
import appengine.Cpuutilization;
import appengine.Cpuutilizationlink;
import appengine.Debuginstancerequest;
import appengine.Deployment;
import appengine.Deploymentlink;
import appengine.Diskutilization;
import appengine.Diskutilizationlink;
import appengine.Domainmapping;
import appengine.Empty;
import appengine.Endpointsapiservice;
import appengine.Endpointsapiservicelink;
import appengine.Errorcode;
import appengine.Errorhandler;
import appengine.Featuresettings;
import appengine.Featuresettingslink;
import appengine.Fileinfo;
import appengine.Firewallrule;
import appengine.Healthcheck;
import appengine.Healthchecklink;
import appengine.Identityawareproxy;
import appengine.Identityawareproxylink;
import appengine.Instance;
import appengine.Library;
import appengine.Listauthorizedcertificatesresponse;
import appengine.Listauthorizeddomainsresponse;
import appengine.Listdomainmappingsresponse;
import appengine.Listingressrulesresponse;
import appengine.Listinstancesresponse;
import appengine.Listlocationsresponse;
import appengine.Listoperationsresponse;
import appengine.Listservicesresponse;
import appengine.Listversionsresponse;
import appengine.Livenesscheck;
import appengine.Livenesschecklink;
import appengine.Location;
import appengine.Locationmetadata;
import appengine.Login;
import appengine.Manualscaling;
import appengine.Manualscalinglink;
import appengine.Network;
import appengine.Networklink;
import appengine.Networkutilization;
import appengine.Networkutilizationlink;
import appengine.Operation;
import appengine.Operationmetadata;
import appengine.Operationmetadataexperimental;
import appengine.Operationmetadatav1;
import appengine.Operationmetadatav1alpha;
import appengine.Operationmetadatav1beta;
import appengine.Operationmetadatav1beta5;
import appengine.Readinesscheck;
import appengine.Readinesschecklink;
import appengine.Redirecthttpresponsecode;
import appengine.Repairapplicationrequest;
import appengine.Requestutilization;
import appengine.Requestutilizationlink;
import appengine.Resourcerecord;
import appengine.Resources;
import appengine.Resourceslink;
import appengine.Scripthandler;
import appengine.Scripthandlerlink;
import appengine.Securitylevel;
import appengine.Service;
import appengine.Servingstatus;
import appengine.Shardby;
import appengine.Sslsettings;
import appengine.Sslsettingslink;
import appengine.Staticfileshandler;
import appengine.Staticfileshandlerlink;
import appengine.Status;
import appengine.Statuslink;
import appengine.Trafficsplit;
import appengine.Trafficsplitlink;
import appengine.Type;
import appengine.Urldispatchrule;
import appengine.Urlmap;
import appengine.Version;
import appengine.VersionServingstatus;
import appengine.Volume;
import appengine.Zipinfo;
import appengine.Zipinfolink;
import appengine.array;

import appengine.util.AppengineValidator;

import java.util.Map;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppenginePackageImpl extends EPackageImpl implements AppenginePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuutilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityawareproxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualscalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationmetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficsplitlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listoperationsresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firewallruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listauthorizedcertificatesresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorhandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sslsettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmetadatav1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresettingslinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityawareproxylinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livenesscheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchupdateingressrulesrequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkutilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readinesscheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debuginstancerequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmetadatav1beta5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticscalinglinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthchecklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readinesschecklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualscalinglinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiconfighandlerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointsapiservicelinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceslinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicscalinglinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livenesschecklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networklinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repairapplicationrequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificaterawdataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scripthandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmetadataexperimentalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizeddomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trafficsplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmetadatav1betaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listservicesresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listingressrulesresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zipinfolinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerinfolinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batchupdateingressrulesresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listinstancesresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listdomainmappingsresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationmetadatav1alphaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urldispatchruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listversionsresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listauthorizeddomainsresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiendpointhandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sslsettingslinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainmappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestutilizationlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkutilizationlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuutilizationlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskutilizationlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticscalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zipinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificaterawdatalinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizedcertificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcerecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listlocationsresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestutilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiendpointhandlerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticfileshandlerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scripthandlerlinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointsapiserviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statuslinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiconfighandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticfileshandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicscalingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskutilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum errorcodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum servingstatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum availabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionServingstatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shardbyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum redirecthttpresponsecodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securitylevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authfailactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiConfigHandlerSecuritylevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiConfigHandlerAuthfailactionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum apiConfigHandlerLoginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anyEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see appengine.AppenginePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppenginePackageImpl() {
		super(eNS_URI, AppengineFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AppenginePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppenginePackage init() {
		if (isInited) return (AppenginePackage)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI);

		// Obtain or create and register package
		AppenginePackageImpl theAppenginePackage = (AppenginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppenginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppenginePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAppenginePackage.createPackageContents();

		// Initialize created meta-data
		theAppenginePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAppenginePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AppengineValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAppenginePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppenginePackage.eNS_URI, theAppenginePackage);
		return theAppenginePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarray_Values() {
		return (EAttribute)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuutilization() {
		return cpuutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuutilization_AggregationWindowLength() {
		return (EAttribute)cpuutilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuutilization_TargetUtilization() {
		return (EAttribute)cpuutilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatus_Details() {
		return (EReference)statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Code() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Message() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityawareproxy() {
		return identityawareproxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Oauth2ClientSecret() {
		return (EAttribute)identityawareproxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Oauth2ClientId() {
		return (EAttribute)identityawareproxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Oauth2ClientSecretSha256() {
		return (EAttribute)identityawareproxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Enabled() {
		return (EAttribute)identityawareproxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualscaling() {
		return manualscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualscaling_Instances() {
		return (EAttribute)manualscalingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationmetadata() {
		return locationmetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationmetadata_FlexibleEnvironmentAvailable() {
		return (EAttribute)locationmetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationmetadata_StandardEnvironmentAvailable() {
		return (EAttribute)locationmetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrafficsplitlink() {
		return trafficsplitlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__Delete__String_String() {
		return serviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__List__String_String_Integer() {
		return serviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__Get__String_String() {
		return serviceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__Patch__String_String_String_boolean() {
		return serviceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListoperationsresponse() {
		return listoperationsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListoperationsresponse_NextPageToken() {
		return (EAttribute)listoperationsresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListoperationsresponse_Operations() {
		return (EReference)listoperationsresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadata() {
		return operationmetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_User() {
		return (EAttribute)operationmetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_Target() {
		return (EAttribute)operationmetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_Method() {
		return (EAttribute)operationmetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_EndTime() {
		return (EAttribute)operationmetadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_OperationType() {
		return (EAttribute)operationmetadataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_InsertTime() {
		return (EAttribute)operationmetadataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirewallrule() {
		return firewallruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_SourceRange() {
		return (EAttribute)firewallruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_Priority() {
		return (EAttribute)firewallruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_Action() {
		return (EAttribute)firewallruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_Description() {
		return (EAttribute)firewallruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Get__String_String() {
		return firewallruleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Patch__String_String_String() {
		return firewallruleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Batchupdate__String() {
		return firewallruleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Delete__String_String() {
		return firewallruleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__List__Integer_String_String_String() {
		return firewallruleEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Create__String() {
		return firewallruleEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListauthorizedcertificatesresponse() {
		return listauthorizedcertificatesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListauthorizedcertificatesresponse_Certificates() {
		return (EReference)listauthorizedcertificatesresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListauthorizedcertificatesresponse_NextPageToken() {
		return (EAttribute)listauthorizedcertificatesresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesettings() {
		return featuresettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturesettings_SplitHealthChecks() {
		return (EAttribute)featuresettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorhandler() {
		return errorhandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorhandler_ErrorCode() {
		return (EAttribute)errorhandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorhandler_MimeType() {
		return (EAttribute)errorhandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorhandler_StaticFile() {
		return (EAttribute)errorhandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSslsettings() {
		return sslsettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSslsettings_CertificateId() {
		return (EAttribute)sslsettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1() {
		return operationmetadatav1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationmetadatav1_Warning() {
		return (EReference)operationmetadatav1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_InsertTime() {
		return (EAttribute)operationmetadatav1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_Target() {
		return (EAttribute)operationmetadatav1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_User() {
		return (EAttribute)operationmetadatav1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_EphemeralMessage() {
		return (EAttribute)operationmetadatav1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_Method() {
		return (EAttribute)operationmetadatav1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_EndTime() {
		return (EAttribute)operationmetadatav1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesettingslink() {
		return featuresettingslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityawareproxylink() {
		return identityawareproxylinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_DispatchRules() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_GcrDomain() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DefaultCookieExpiration() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_LocationId() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_ServingStatus() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DefaultHostname() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_AuthDomain() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_CodeBucket() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DefaultBucket() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Repair__String() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Get__String() {
		return applicationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Patch__String_String() {
		return applicationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Create() {
		return applicationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_ForwardedPorts() {
		return (EReference)networkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_InstanceTag() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_SubnetworkName() {
		return (EAttribute)networkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_AverageLatency() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_MemoryUsage() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmIp() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Availability() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmStatus() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Errors() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_StartTime() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmDebugEnabled() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Requests() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_AppEngineRelease() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmName() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Qps() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmId() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmZoneName() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Name() {
		return (EAttribute)instanceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__List__String_String_String_Integer_String() {
		return instanceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__Get__String_String_String_String() {
		return instanceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__Debug__String_String_String_String() {
		return instanceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__Delete__String_String_String_String() {
		return instanceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivenesscheck() {
		return livenesscheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_FailureThreshold() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_Timeout() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_InitialDelay() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_Path() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_Host() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_SuccessThreshold() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_CheckInterval() {
		return (EAttribute)livenesscheckEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchupdateingressrulesrequest() {
		return batchupdateingressrulesrequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchupdateingressrulesrequest_IngressRules() {
		return (EReference)batchupdateingressrulesrequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkutilization() {
		return networkutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetSentPacketsPerSecond() {
		return (EAttribute)networkutilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetReceivedBytesPerSecond() {
		return (EAttribute)networkutilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetReceivedPacketsPerSecond() {
		return (EAttribute)networkutilizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetSentBytesPerSecond() {
		return (EAttribute)networkutilizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Metadata() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Labels() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_LocationId() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__List__Integer_String_String_String() {
		return locationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Get__String_String() {
		return locationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcheck() {
		return healthcheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_Timeout() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_UnhealthyThreshold() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_DisableHealthCheck() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_Host() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_HealthyThreshold() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_RestartThreshold() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_CheckInterval() {
		return (EAttribute)healthcheckEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadinesscheck() {
		return readinesscheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_Path() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_Host() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_SuccessThreshold() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_CheckInterval() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_FailureThreshold() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_Timeout() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_AppStartTimeout() {
		return (EAttribute)readinesscheckEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebuginstancerequest() {
		return debuginstancerequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebuginstancerequest_SshKey() {
		return (EAttribute)debuginstancerequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1beta5() {
		return operationmetadatav1beta5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_InsertTime() {
		return (EAttribute)operationmetadatav1beta5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_EndTime() {
		return (EAttribute)operationmetadatav1beta5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_User() {
		return (EAttribute)operationmetadatav1beta5EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_Target() {
		return (EAttribute)operationmetadatav1beta5EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_Method() {
		return (EAttribute)operationmetadatav1beta5EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticscalinglink() {
		return automaticscalinglinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthchecklink() {
		return healthchecklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadinesschecklink() {
		return readinesschecklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualscalinglink() {
		return manualscalinglinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiconfighandlerlink() {
		return apiconfighandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointsapiservicelink() {
		return endpointsapiservicelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentlink() {
		return deploymentlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceslink() {
		return resourceslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicscalinglink() {
		return basicscalinglinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivenesschecklink() {
		return livenesschecklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworklink() {
		return networklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Env() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Handlers() {
		return (EReference)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_DiskUsageBytes() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Threadsafe() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Name() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Vm() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_VersionUrl() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_InstanceClass() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_ServingStatus() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_RuntimeApiVersion() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_CreateTime() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_InboundServices() {
		return (EReference)versionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_ErrorHandlers() {
		return (EReference)versionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_DefaultExpiration() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Libraries() {
		return (EReference)versionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_NobuildFilesRegex() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Runtime() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_CreatedBy() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_EnvVariables() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_BetaSettings() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Delete__String_String_String() {
		return versionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__List__Integer_String_String_String_String() {
		return versionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Get__String_String_String_String() {
		return versionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Patch__String_String_String_String() {
		return versionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Create__String_String() {
		return versionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepairapplicationrequest() {
		return repairapplicationrequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificaterawdata() {
		return certificaterawdataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificaterawdata_PublicCertificate() {
		return (EAttribute)certificaterawdataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificaterawdata_PrivateKey() {
		return (EAttribute)certificaterawdataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileinfo() {
		return fileinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileinfo_SourceUrl() {
		return (EAttribute)fileinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileinfo_Sha1Sum() {
		return (EAttribute)fileinfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileinfo_MimeType() {
		return (EAttribute)fileinfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripthandler() {
		return scripthandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScripthandler_ScriptPath() {
		return (EAttribute)scripthandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadataexperimental() {
		return operationmetadataexperimentalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_User() {
		return (EAttribute)operationmetadataexperimentalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_Target() {
		return (EAttribute)operationmetadataexperimentalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_Method() {
		return (EAttribute)operationmetadataexperimentalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_InsertTime() {
		return (EAttribute)operationmetadataexperimentalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_EndTime() {
		return (EAttribute)operationmetadataexperimentalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizeddomain() {
		return authorizeddomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizeddomain_Name() {
		return (EAttribute)authorizeddomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizeddomain__List__String_String_Integer() {
		return authorizeddomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrafficsplit() {
		return trafficsplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficsplit_ShardBy() {
		return (EAttribute)trafficsplitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficsplit_Allocations() {
		return (EAttribute)trafficsplitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1beta() {
		return operationmetadatav1betaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_User() {
		return (EAttribute)operationmetadatav1betaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_Target() {
		return (EAttribute)operationmetadatav1betaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_EphemeralMessage() {
		return (EAttribute)operationmetadatav1betaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_Method() {
		return (EAttribute)operationmetadatav1betaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_EndTime() {
		return (EAttribute)operationmetadatav1betaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationmetadatav1beta_Warning() {
		return (EReference)operationmetadatav1betaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_InsertTime() {
		return (EAttribute)operationmetadatav1betaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListservicesresponse() {
		return listservicesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListservicesresponse_Services() {
		return (EReference)listservicesresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListservicesresponse_NextPageToken() {
		return (EAttribute)listservicesresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListingressrulesresponse() {
		return listingressrulesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListingressrulesresponse_NextPageToken() {
		return (EAttribute)listingressrulesresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListingressrulesresponse_IngressRules() {
		return (EReference)listingressrulesresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_Volumes() {
		return (EReference)resourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_DiskGb() {
		return (EAttribute)resourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_Cpu() {
		return (EAttribute)resourcesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_MemoryGb() {
		return (EAttribute)resourcesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZipinfolink() {
		return zipinfolinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerinfolink() {
		return containerinfolinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Files() {
		return (EAttribute)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchupdateingressrulesresponse() {
		return batchupdateingressrulesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchupdateingressrulesresponse_IngressRules() {
		return (EReference)batchupdateingressrulesresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_VolumeType() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_SizeGb() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListinstancesresponse() {
		return listinstancesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListinstancesresponse_Instances() {
		return (EReference)listinstancesresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListinstancesresponse_NextPageToken() {
		return (EAttribute)listinstancesresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListdomainmappingsresponse() {
		return listdomainmappingsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListdomainmappingsresponse_NextPageToken() {
		return (EAttribute)listdomainmappingsresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListdomainmappingsresponse_DomainMappings() {
		return (EReference)listdomainmappingsresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1alpha() {
		return operationmetadatav1alphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_EndTime() {
		return (EAttribute)operationmetadatav1alphaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationmetadatav1alpha_Warning() {
		return (EReference)operationmetadatav1alphaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_InsertTime() {
		return (EAttribute)operationmetadatav1alphaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_User() {
		return (EAttribute)operationmetadatav1alphaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_Target() {
		return (EAttribute)operationmetadatav1alphaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_EphemeralMessage() {
		return (EAttribute)operationmetadatav1alphaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_Method() {
		return (EAttribute)operationmetadatav1alphaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrldispatchrule() {
		return urldispatchruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrldispatchrule_Domain() {
		return (EAttribute)urldispatchruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrldispatchrule_Service() {
		return (EAttribute)urldispatchruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrldispatchrule_Path() {
		return (EAttribute)urldispatchruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListversionsresponse() {
		return listversionsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListversionsresponse_NextPageToken() {
		return (EAttribute)listversionsresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListversionsresponse_Versions() {
		return (EReference)listversionsresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListauthorizeddomainsresponse() {
		return listauthorizeddomainsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListauthorizeddomainsresponse_Domains() {
		return (EReference)listauthorizeddomainsresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListauthorizeddomainsresponse_NextPageToken() {
		return (EAttribute)listauthorizeddomainsresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpty() {
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiendpointhandler() {
		return apiendpointhandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiendpointhandler_ScriptPath() {
		return (EAttribute)apiendpointhandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSslsettingslink() {
		return sslsettingslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainmapping() {
		return domainmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainmapping_ResourceRecords() {
		return (EReference)domainmappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainmapping_Name() {
		return (EAttribute)domainmappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Delete__String_String() {
		return domainmappingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__List__String_String_Integer() {
		return domainmappingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Get__String_String() {
		return domainmappingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Patch__String_String_String() {
		return domainmappingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Create__String() {
		return domainmappingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestutilizationlink() {
		return requestutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkutilizationlink() {
		return networkutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuutilizationlink() {
		return cpuutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiskutilizationlink() {
		return diskutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticscaling() {
		return automaticscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MinPendingLatency() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxIdleInstances() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MinIdleInstances() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxTotalInstances() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MinTotalInstances() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxConcurrentRequests() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_CoolDownPeriod() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxPendingLatency() {
		return (EAttribute)automaticscalingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZipinfo() {
		return zipinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZipinfo_SourceUrl() {
		return (EAttribute)zipinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZipinfo_FilesCount() {
		return (EAttribute)zipinfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificaterawdatalink() {
		return certificaterawdatalinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizedcertificate() {
		return authorizedcertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_DomainMappingsCount() {
		return (EAttribute)authorizedcertificateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizedcertificate_DomainNames() {
		return (EReference)authorizedcertificateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_DisplayName() {
		return (EAttribute)authorizedcertificateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizedcertificate_VisibleDomainMappings() {
		return (EReference)authorizedcertificateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_ExpireTime() {
		return (EAttribute)authorizedcertificateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_Name() {
		return (EAttribute)authorizedcertificateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Delete__String_String() {
		return authorizedcertificateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__List__String_String_Integer_String() {
		return authorizedcertificateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Get__String_String_String() {
		return authorizedcertificateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Patch__String_String_String() {
		return authorizedcertificateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Create__String() {
		return authorizedcertificateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcerecord() {
		return resourcerecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerecord_Type() {
		return (EAttribute)resourcerecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerecord_Rrdata() {
		return (EAttribute)resourcerecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerecord_Name() {
		return (EAttribute)resourcerecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_Version() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListlocationsresponse() {
		return listlocationsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListlocationsresponse_NextPageToken() {
		return (EAttribute)listlocationsresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListlocationsresponse_Locations() {
		return (EReference)listlocationsresponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerinfo() {
		return containerinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerinfo_Image() {
		return (EAttribute)containerinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestutilization() {
		return requestutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestutilization_TargetRequestCountPerSecond() {
		return (EAttribute)requestutilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestutilization_TargetConcurrentRequests() {
		return (EAttribute)requestutilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiendpointhandlerlink() {
		return apiendpointhandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticfileshandlerlink() {
		return staticfileshandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripthandlerlink() {
		return scripthandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlmap() {
		return urlmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_RedirectHttpResponseCode() {
		return (EAttribute)urlmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_SecurityLevel() {
		return (EAttribute)urlmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_AuthFailAction() {
		return (EAttribute)urlmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_UrlRegex() {
		return (EAttribute)urlmapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_Login() {
		return (EAttribute)urlmapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointsapiservice() {
		return endpointsapiserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointsapiservice_Name() {
		return (EAttribute)endpointsapiserviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointsapiservice_ConfigId() {
		return (EAttribute)endpointsapiserviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatuslink() {
		return statuslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Response() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Metadata() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Done() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__List__String_String_String_Integer() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Get__String_String() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiconfighandler() {
		return apiconfighandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_SecurityLevel() {
		return (EAttribute)apiconfighandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_AuthFailAction() {
		return (EAttribute)apiconfighandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_Script() {
		return (EAttribute)apiconfighandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_Login() {
		return (EAttribute)apiconfighandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_Url() {
		return (EAttribute)apiconfighandlerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticfileshandler() {
		return staticfileshandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_ApplicationReadable() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_HttpHeaders() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_UploadPathRegex() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_Path() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_MimeType() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_RequireMatchingFile() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_Expiration() {
		return (EAttribute)staticfileshandlerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicscaling() {
		return basicscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicscaling_MaxInstances() {
		return (EAttribute)basicscalingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicscaling_IdleTimeout() {
		return (EAttribute)basicscalingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiskutilization() {
		return diskutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetWriteBytesPerSecond() {
		return (EAttribute)diskutilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetReadBytesPerSecond() {
		return (EAttribute)diskutilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetReadOpsPerSecond() {
		return (EAttribute)diskutilizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetWriteOpsPerSecond() {
		return (EAttribute)diskutilizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorcode() {
		return errorcodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServingstatus() {
		return servingstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvailability() {
		return availabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionServingstatus() {
		return versionServingstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShardby() {
		return shardbyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRedirecthttpresponsecode() {
		return redirecthttpresponsecodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecuritylevel() {
		return securitylevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthfailaction() {
		return authfailactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogin() {
		return loginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiConfigHandlerSecuritylevel() {
		return apiConfigHandlerSecuritylevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiConfigHandlerAuthfailaction() {
		return apiConfigHandlerAuthfailactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiConfigHandlerLogin() {
		return apiConfigHandlerLoginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getfloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getbyte() {
		return byteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getobject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getlong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getmap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getany() {
		return anyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getshort() {
		return shortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppengineFactory getAppengineFactory() {
		return (AppengineFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		arrayEClass = createEClass(ARRAY);
		createEAttribute(arrayEClass, ARRAY__VALUES);

		cpuutilizationEClass = createEClass(CPUUTILIZATION);
		createEAttribute(cpuutilizationEClass, CPUUTILIZATION__AGGREGATION_WINDOW_LENGTH);
		createEAttribute(cpuutilizationEClass, CPUUTILIZATION__TARGET_UTILIZATION);

		statusEClass = createEClass(STATUS);
		createEReference(statusEClass, STATUS__DETAILS);
		createEAttribute(statusEClass, STATUS__CODE);
		createEAttribute(statusEClass, STATUS__MESSAGE);

		identityawareproxyEClass = createEClass(IDENTITYAWAREPROXY);
		createEAttribute(identityawareproxyEClass, IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET);
		createEAttribute(identityawareproxyEClass, IDENTITYAWAREPROXY__OAUTH2_CLIENT_ID);
		createEAttribute(identityawareproxyEClass, IDENTITYAWAREPROXY__OAUTH2_CLIENT_SECRET_SHA256);
		createEAttribute(identityawareproxyEClass, IDENTITYAWAREPROXY__ENABLED);

		manualscalingEClass = createEClass(MANUALSCALING);
		createEAttribute(manualscalingEClass, MANUALSCALING__INSTANCES);

		locationmetadataEClass = createEClass(LOCATIONMETADATA);
		createEAttribute(locationmetadataEClass, LOCATIONMETADATA__FLEXIBLE_ENVIRONMENT_AVAILABLE);
		createEAttribute(locationmetadataEClass, LOCATIONMETADATA__STANDARD_ENVIRONMENT_AVAILABLE);

		trafficsplitlinkEClass = createEClass(TRAFFICSPLITLINK);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEOperation(serviceEClass, SERVICE___DELETE__STRING_STRING);
		createEOperation(serviceEClass, SERVICE___LIST__STRING_STRING_INTEGER);
		createEOperation(serviceEClass, SERVICE___GET__STRING_STRING);
		createEOperation(serviceEClass, SERVICE___PATCH__STRING_STRING_STRING_BOOLEAN);

		listoperationsresponseEClass = createEClass(LISTOPERATIONSRESPONSE);
		createEAttribute(listoperationsresponseEClass, LISTOPERATIONSRESPONSE__NEXT_PAGE_TOKEN);
		createEReference(listoperationsresponseEClass, LISTOPERATIONSRESPONSE__OPERATIONS);

		operationmetadataEClass = createEClass(OPERATIONMETADATA);
		createEAttribute(operationmetadataEClass, OPERATIONMETADATA__USER);
		createEAttribute(operationmetadataEClass, OPERATIONMETADATA__TARGET);
		createEAttribute(operationmetadataEClass, OPERATIONMETADATA__METHOD);
		createEAttribute(operationmetadataEClass, OPERATIONMETADATA__END_TIME);
		createEAttribute(operationmetadataEClass, OPERATIONMETADATA__OPERATION_TYPE);
		createEAttribute(operationmetadataEClass, OPERATIONMETADATA__INSERT_TIME);

		firewallruleEClass = createEClass(FIREWALLRULE);
		createEAttribute(firewallruleEClass, FIREWALLRULE__SOURCE_RANGE);
		createEAttribute(firewallruleEClass, FIREWALLRULE__PRIORITY);
		createEAttribute(firewallruleEClass, FIREWALLRULE__ACTION);
		createEAttribute(firewallruleEClass, FIREWALLRULE__DESCRIPTION);
		createEOperation(firewallruleEClass, FIREWALLRULE___GET__STRING_STRING);
		createEOperation(firewallruleEClass, FIREWALLRULE___PATCH__STRING_STRING_STRING);
		createEOperation(firewallruleEClass, FIREWALLRULE___BATCHUPDATE__STRING);
		createEOperation(firewallruleEClass, FIREWALLRULE___DELETE__STRING_STRING);
		createEOperation(firewallruleEClass, FIREWALLRULE___LIST__INTEGER_STRING_STRING_STRING);
		createEOperation(firewallruleEClass, FIREWALLRULE___CREATE__STRING);

		listauthorizedcertificatesresponseEClass = createEClass(LISTAUTHORIZEDCERTIFICATESRESPONSE);
		createEReference(listauthorizedcertificatesresponseEClass, LISTAUTHORIZEDCERTIFICATESRESPONSE__CERTIFICATES);
		createEAttribute(listauthorizedcertificatesresponseEClass, LISTAUTHORIZEDCERTIFICATESRESPONSE__NEXT_PAGE_TOKEN);

		featuresettingsEClass = createEClass(FEATURESETTINGS);
		createEAttribute(featuresettingsEClass, FEATURESETTINGS__SPLIT_HEALTH_CHECKS);

		errorhandlerEClass = createEClass(ERRORHANDLER);
		createEAttribute(errorhandlerEClass, ERRORHANDLER__ERROR_CODE);
		createEAttribute(errorhandlerEClass, ERRORHANDLER__MIME_TYPE);
		createEAttribute(errorhandlerEClass, ERRORHANDLER__STATIC_FILE);

		sslsettingsEClass = createEClass(SSLSETTINGS);
		createEAttribute(sslsettingsEClass, SSLSETTINGS__CERTIFICATE_ID);

		operationmetadatav1EClass = createEClass(OPERATIONMETADATAV1);
		createEReference(operationmetadatav1EClass, OPERATIONMETADATAV1__WARNING);
		createEAttribute(operationmetadatav1EClass, OPERATIONMETADATAV1__INSERT_TIME);
		createEAttribute(operationmetadatav1EClass, OPERATIONMETADATAV1__TARGET);
		createEAttribute(operationmetadatav1EClass, OPERATIONMETADATAV1__USER);
		createEAttribute(operationmetadatav1EClass, OPERATIONMETADATAV1__EPHEMERAL_MESSAGE);
		createEAttribute(operationmetadatav1EClass, OPERATIONMETADATAV1__METHOD);
		createEAttribute(operationmetadatav1EClass, OPERATIONMETADATAV1__END_TIME);

		featuresettingslinkEClass = createEClass(FEATURESETTINGSLINK);

		identityawareproxylinkEClass = createEClass(IDENTITYAWAREPROXYLINK);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__DISPATCH_RULES);
		createEAttribute(applicationEClass, APPLICATION__GCR_DOMAIN);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__DEFAULT_COOKIE_EXPIRATION);
		createEAttribute(applicationEClass, APPLICATION__LOCATION_ID);
		createEAttribute(applicationEClass, APPLICATION__SERVING_STATUS);
		createEAttribute(applicationEClass, APPLICATION__DEFAULT_HOSTNAME);
		createEAttribute(applicationEClass, APPLICATION__AUTH_DOMAIN);
		createEAttribute(applicationEClass, APPLICATION__CODE_BUCKET);
		createEAttribute(applicationEClass, APPLICATION__DEFAULT_BUCKET);
		createEOperation(applicationEClass, APPLICATION___REPAIR__STRING);
		createEOperation(applicationEClass, APPLICATION___GET__STRING);
		createEOperation(applicationEClass, APPLICATION___PATCH__STRING_STRING);
		createEOperation(applicationEClass, APPLICATION___CREATE);

		networkEClass = createEClass(NETWORK);
		createEAttribute(networkEClass, NETWORK__NAME);
		createEReference(networkEClass, NETWORK__FORWARDED_PORTS);
		createEAttribute(networkEClass, NETWORK__INSTANCE_TAG);
		createEAttribute(networkEClass, NETWORK__SUBNETWORK_NAME);

		instanceEClass = createEClass(INSTANCE);
		createEAttribute(instanceEClass, INSTANCE__AVERAGE_LATENCY);
		createEAttribute(instanceEClass, INSTANCE__MEMORY_USAGE);
		createEAttribute(instanceEClass, INSTANCE__VM_IP);
		createEAttribute(instanceEClass, INSTANCE__AVAILABILITY);
		createEAttribute(instanceEClass, INSTANCE__VM_STATUS);
		createEAttribute(instanceEClass, INSTANCE__ERRORS);
		createEAttribute(instanceEClass, INSTANCE__START_TIME);
		createEAttribute(instanceEClass, INSTANCE__VM_DEBUG_ENABLED);
		createEAttribute(instanceEClass, INSTANCE__REQUESTS);
		createEAttribute(instanceEClass, INSTANCE__APP_ENGINE_RELEASE);
		createEAttribute(instanceEClass, INSTANCE__VM_NAME);
		createEAttribute(instanceEClass, INSTANCE__QPS);
		createEAttribute(instanceEClass, INSTANCE__VM_ID);
		createEAttribute(instanceEClass, INSTANCE__VM_ZONE_NAME);
		createEAttribute(instanceEClass, INSTANCE__NAME);
		createEOperation(instanceEClass, INSTANCE___LIST__STRING_STRING_STRING_INTEGER_STRING);
		createEOperation(instanceEClass, INSTANCE___GET__STRING_STRING_STRING_STRING);
		createEOperation(instanceEClass, INSTANCE___DEBUG__STRING_STRING_STRING_STRING);
		createEOperation(instanceEClass, INSTANCE___DELETE__STRING_STRING_STRING_STRING);

		livenesscheckEClass = createEClass(LIVENESSCHECK);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__FAILURE_THRESHOLD);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__TIMEOUT);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__INITIAL_DELAY);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__PATH);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__HOST);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__SUCCESS_THRESHOLD);
		createEAttribute(livenesscheckEClass, LIVENESSCHECK__CHECK_INTERVAL);

		batchupdateingressrulesrequestEClass = createEClass(BATCHUPDATEINGRESSRULESREQUEST);
		createEReference(batchupdateingressrulesrequestEClass, BATCHUPDATEINGRESSRULESREQUEST__INGRESS_RULES);

		networkutilizationEClass = createEClass(NETWORKUTILIZATION);
		createEAttribute(networkutilizationEClass, NETWORKUTILIZATION__TARGET_SENT_PACKETS_PER_SECOND);
		createEAttribute(networkutilizationEClass, NETWORKUTILIZATION__TARGET_RECEIVED_BYTES_PER_SECOND);
		createEAttribute(networkutilizationEClass, NETWORKUTILIZATION__TARGET_RECEIVED_PACKETS_PER_SECOND);
		createEAttribute(networkutilizationEClass, NETWORKUTILIZATION__TARGET_SENT_BYTES_PER_SECOND);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__METADATA);
		createEAttribute(locationEClass, LOCATION__LABELS);
		createEAttribute(locationEClass, LOCATION__NAME);
		createEAttribute(locationEClass, LOCATION__LOCATION_ID);
		createEOperation(locationEClass, LOCATION___LIST__INTEGER_STRING_STRING_STRING);
		createEOperation(locationEClass, LOCATION___GET__STRING_STRING);

		healthcheckEClass = createEClass(HEALTHCHECK);
		createEAttribute(healthcheckEClass, HEALTHCHECK__TIMEOUT);
		createEAttribute(healthcheckEClass, HEALTHCHECK__UNHEALTHY_THRESHOLD);
		createEAttribute(healthcheckEClass, HEALTHCHECK__DISABLE_HEALTH_CHECK);
		createEAttribute(healthcheckEClass, HEALTHCHECK__HOST);
		createEAttribute(healthcheckEClass, HEALTHCHECK__HEALTHY_THRESHOLD);
		createEAttribute(healthcheckEClass, HEALTHCHECK__RESTART_THRESHOLD);
		createEAttribute(healthcheckEClass, HEALTHCHECK__CHECK_INTERVAL);

		readinesscheckEClass = createEClass(READINESSCHECK);
		createEAttribute(readinesscheckEClass, READINESSCHECK__PATH);
		createEAttribute(readinesscheckEClass, READINESSCHECK__HOST);
		createEAttribute(readinesscheckEClass, READINESSCHECK__SUCCESS_THRESHOLD);
		createEAttribute(readinesscheckEClass, READINESSCHECK__CHECK_INTERVAL);
		createEAttribute(readinesscheckEClass, READINESSCHECK__FAILURE_THRESHOLD);
		createEAttribute(readinesscheckEClass, READINESSCHECK__TIMEOUT);
		createEAttribute(readinesscheckEClass, READINESSCHECK__APP_START_TIMEOUT);

		debuginstancerequestEClass = createEClass(DEBUGINSTANCEREQUEST);
		createEAttribute(debuginstancerequestEClass, DEBUGINSTANCEREQUEST__SSH_KEY);

		operationmetadatav1beta5EClass = createEClass(OPERATIONMETADATAV1BETA5);
		createEAttribute(operationmetadatav1beta5EClass, OPERATIONMETADATAV1BETA5__INSERT_TIME);
		createEAttribute(operationmetadatav1beta5EClass, OPERATIONMETADATAV1BETA5__END_TIME);
		createEAttribute(operationmetadatav1beta5EClass, OPERATIONMETADATAV1BETA5__USER);
		createEAttribute(operationmetadatav1beta5EClass, OPERATIONMETADATAV1BETA5__TARGET);
		createEAttribute(operationmetadatav1beta5EClass, OPERATIONMETADATAV1BETA5__METHOD);

		automaticscalinglinkEClass = createEClass(AUTOMATICSCALINGLINK);

		healthchecklinkEClass = createEClass(HEALTHCHECKLINK);

		readinesschecklinkEClass = createEClass(READINESSCHECKLINK);

		manualscalinglinkEClass = createEClass(MANUALSCALINGLINK);

		apiconfighandlerlinkEClass = createEClass(APICONFIGHANDLERLINK);

		endpointsapiservicelinkEClass = createEClass(ENDPOINTSAPISERVICELINK);

		deploymentlinkEClass = createEClass(DEPLOYMENTLINK);

		resourceslinkEClass = createEClass(RESOURCESLINK);

		basicscalinglinkEClass = createEClass(BASICSCALINGLINK);

		livenesschecklinkEClass = createEClass(LIVENESSCHECKLINK);

		networklinkEClass = createEClass(NETWORKLINK);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__ENV);
		createEReference(versionEClass, VERSION__HANDLERS);
		createEAttribute(versionEClass, VERSION__DISK_USAGE_BYTES);
		createEAttribute(versionEClass, VERSION__THREADSAFE);
		createEAttribute(versionEClass, VERSION__NAME);
		createEAttribute(versionEClass, VERSION__VM);
		createEAttribute(versionEClass, VERSION__VERSION_URL);
		createEAttribute(versionEClass, VERSION__INSTANCE_CLASS);
		createEAttribute(versionEClass, VERSION__SERVING_STATUS);
		createEAttribute(versionEClass, VERSION__RUNTIME_API_VERSION);
		createEAttribute(versionEClass, VERSION__CREATE_TIME);
		createEReference(versionEClass, VERSION__INBOUND_SERVICES);
		createEReference(versionEClass, VERSION__ERROR_HANDLERS);
		createEAttribute(versionEClass, VERSION__DEFAULT_EXPIRATION);
		createEReference(versionEClass, VERSION__LIBRARIES);
		createEAttribute(versionEClass, VERSION__NOBUILD_FILES_REGEX);
		createEAttribute(versionEClass, VERSION__RUNTIME);
		createEAttribute(versionEClass, VERSION__CREATED_BY);
		createEAttribute(versionEClass, VERSION__ENV_VARIABLES);
		createEAttribute(versionEClass, VERSION__BETA_SETTINGS);
		createEOperation(versionEClass, VERSION___DELETE__STRING_STRING_STRING);
		createEOperation(versionEClass, VERSION___LIST__INTEGER_STRING_STRING_STRING_STRING);
		createEOperation(versionEClass, VERSION___GET__STRING_STRING_STRING_STRING);
		createEOperation(versionEClass, VERSION___PATCH__STRING_STRING_STRING_STRING);
		createEOperation(versionEClass, VERSION___CREATE__STRING_STRING);

		repairapplicationrequestEClass = createEClass(REPAIRAPPLICATIONREQUEST);

		certificaterawdataEClass = createEClass(CERTIFICATERAWDATA);
		createEAttribute(certificaterawdataEClass, CERTIFICATERAWDATA__PUBLIC_CERTIFICATE);
		createEAttribute(certificaterawdataEClass, CERTIFICATERAWDATA__PRIVATE_KEY);

		fileinfoEClass = createEClass(FILEINFO);
		createEAttribute(fileinfoEClass, FILEINFO__SOURCE_URL);
		createEAttribute(fileinfoEClass, FILEINFO__SHA1_SUM);
		createEAttribute(fileinfoEClass, FILEINFO__MIME_TYPE);

		scripthandlerEClass = createEClass(SCRIPTHANDLER);
		createEAttribute(scripthandlerEClass, SCRIPTHANDLER__SCRIPT_PATH);

		operationmetadataexperimentalEClass = createEClass(OPERATIONMETADATAEXPERIMENTAL);
		createEAttribute(operationmetadataexperimentalEClass, OPERATIONMETADATAEXPERIMENTAL__USER);
		createEAttribute(operationmetadataexperimentalEClass, OPERATIONMETADATAEXPERIMENTAL__TARGET);
		createEAttribute(operationmetadataexperimentalEClass, OPERATIONMETADATAEXPERIMENTAL__METHOD);
		createEAttribute(operationmetadataexperimentalEClass, OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME);
		createEAttribute(operationmetadataexperimentalEClass, OPERATIONMETADATAEXPERIMENTAL__END_TIME);

		authorizeddomainEClass = createEClass(AUTHORIZEDDOMAIN);
		createEAttribute(authorizeddomainEClass, AUTHORIZEDDOMAIN__NAME);
		createEOperation(authorizeddomainEClass, AUTHORIZEDDOMAIN___LIST__STRING_STRING_INTEGER);

		trafficsplitEClass = createEClass(TRAFFICSPLIT);
		createEAttribute(trafficsplitEClass, TRAFFICSPLIT__SHARD_BY);
		createEAttribute(trafficsplitEClass, TRAFFICSPLIT__ALLOCATIONS);

		operationmetadatav1betaEClass = createEClass(OPERATIONMETADATAV1BETA);
		createEAttribute(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__USER);
		createEAttribute(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__TARGET);
		createEAttribute(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__EPHEMERAL_MESSAGE);
		createEAttribute(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__METHOD);
		createEAttribute(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__END_TIME);
		createEReference(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__WARNING);
		createEAttribute(operationmetadatav1betaEClass, OPERATIONMETADATAV1BETA__INSERT_TIME);

		listservicesresponseEClass = createEClass(LISTSERVICESRESPONSE);
		createEReference(listservicesresponseEClass, LISTSERVICESRESPONSE__SERVICES);
		createEAttribute(listservicesresponseEClass, LISTSERVICESRESPONSE__NEXT_PAGE_TOKEN);

		listingressrulesresponseEClass = createEClass(LISTINGRESSRULESRESPONSE);
		createEAttribute(listingressrulesresponseEClass, LISTINGRESSRULESRESPONSE__NEXT_PAGE_TOKEN);
		createEReference(listingressrulesresponseEClass, LISTINGRESSRULESRESPONSE__INGRESS_RULES);

		resourcesEClass = createEClass(RESOURCES);
		createEReference(resourcesEClass, RESOURCES__VOLUMES);
		createEAttribute(resourcesEClass, RESOURCES__DISK_GB);
		createEAttribute(resourcesEClass, RESOURCES__CPU);
		createEAttribute(resourcesEClass, RESOURCES__MEMORY_GB);

		zipinfolinkEClass = createEClass(ZIPINFOLINK);

		containerinfolinkEClass = createEClass(CONTAINERINFOLINK);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__FILES);

		batchupdateingressrulesresponseEClass = createEClass(BATCHUPDATEINGRESSRULESRESPONSE);
		createEReference(batchupdateingressrulesresponseEClass, BATCHUPDATEINGRESSRULESRESPONSE__INGRESS_RULES);

		volumeEClass = createEClass(VOLUME);
		createEAttribute(volumeEClass, VOLUME__VOLUME_TYPE);
		createEAttribute(volumeEClass, VOLUME__SIZE_GB);
		createEAttribute(volumeEClass, VOLUME__NAME);

		listinstancesresponseEClass = createEClass(LISTINSTANCESRESPONSE);
		createEReference(listinstancesresponseEClass, LISTINSTANCESRESPONSE__INSTANCES);
		createEAttribute(listinstancesresponseEClass, LISTINSTANCESRESPONSE__NEXT_PAGE_TOKEN);

		listdomainmappingsresponseEClass = createEClass(LISTDOMAINMAPPINGSRESPONSE);
		createEAttribute(listdomainmappingsresponseEClass, LISTDOMAINMAPPINGSRESPONSE__NEXT_PAGE_TOKEN);
		createEReference(listdomainmappingsresponseEClass, LISTDOMAINMAPPINGSRESPONSE__DOMAIN_MAPPINGS);

		operationmetadatav1alphaEClass = createEClass(OPERATIONMETADATAV1ALPHA);
		createEAttribute(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__END_TIME);
		createEReference(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__WARNING);
		createEAttribute(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__INSERT_TIME);
		createEAttribute(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__USER);
		createEAttribute(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__TARGET);
		createEAttribute(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__EPHEMERAL_MESSAGE);
		createEAttribute(operationmetadatav1alphaEClass, OPERATIONMETADATAV1ALPHA__METHOD);

		urldispatchruleEClass = createEClass(URLDISPATCHRULE);
		createEAttribute(urldispatchruleEClass, URLDISPATCHRULE__DOMAIN);
		createEAttribute(urldispatchruleEClass, URLDISPATCHRULE__SERVICE);
		createEAttribute(urldispatchruleEClass, URLDISPATCHRULE__PATH);

		listversionsresponseEClass = createEClass(LISTVERSIONSRESPONSE);
		createEAttribute(listversionsresponseEClass, LISTVERSIONSRESPONSE__NEXT_PAGE_TOKEN);
		createEReference(listversionsresponseEClass, LISTVERSIONSRESPONSE__VERSIONS);

		listauthorizeddomainsresponseEClass = createEClass(LISTAUTHORIZEDDOMAINSRESPONSE);
		createEReference(listauthorizeddomainsresponseEClass, LISTAUTHORIZEDDOMAINSRESPONSE__DOMAINS);
		createEAttribute(listauthorizeddomainsresponseEClass, LISTAUTHORIZEDDOMAINSRESPONSE__NEXT_PAGE_TOKEN);

		emptyEClass = createEClass(EMPTY);

		apiendpointhandlerEClass = createEClass(APIENDPOINTHANDLER);
		createEAttribute(apiendpointhandlerEClass, APIENDPOINTHANDLER__SCRIPT_PATH);

		sslsettingslinkEClass = createEClass(SSLSETTINGSLINK);

		domainmappingEClass = createEClass(DOMAINMAPPING);
		createEReference(domainmappingEClass, DOMAINMAPPING__RESOURCE_RECORDS);
		createEAttribute(domainmappingEClass, DOMAINMAPPING__NAME);
		createEOperation(domainmappingEClass, DOMAINMAPPING___DELETE__STRING_STRING);
		createEOperation(domainmappingEClass, DOMAINMAPPING___LIST__STRING_STRING_INTEGER);
		createEOperation(domainmappingEClass, DOMAINMAPPING___GET__STRING_STRING);
		createEOperation(domainmappingEClass, DOMAINMAPPING___PATCH__STRING_STRING_STRING);
		createEOperation(domainmappingEClass, DOMAINMAPPING___CREATE__STRING);

		requestutilizationlinkEClass = createEClass(REQUESTUTILIZATIONLINK);

		networkutilizationlinkEClass = createEClass(NETWORKUTILIZATIONLINK);

		cpuutilizationlinkEClass = createEClass(CPUUTILIZATIONLINK);

		diskutilizationlinkEClass = createEClass(DISKUTILIZATIONLINK);

		automaticscalingEClass = createEClass(AUTOMATICSCALING);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MIN_PENDING_LATENCY);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MAX_IDLE_INSTANCES);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MIN_IDLE_INSTANCES);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MAX_TOTAL_INSTANCES);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MIN_TOTAL_INSTANCES);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MAX_CONCURRENT_REQUESTS);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__COOL_DOWN_PERIOD);
		createEAttribute(automaticscalingEClass, AUTOMATICSCALING__MAX_PENDING_LATENCY);

		zipinfoEClass = createEClass(ZIPINFO);
		createEAttribute(zipinfoEClass, ZIPINFO__SOURCE_URL);
		createEAttribute(zipinfoEClass, ZIPINFO__FILES_COUNT);

		certificaterawdatalinkEClass = createEClass(CERTIFICATERAWDATALINK);

		authorizedcertificateEClass = createEClass(AUTHORIZEDCERTIFICATE);
		createEAttribute(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE__DOMAIN_MAPPINGS_COUNT);
		createEReference(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE__DOMAIN_NAMES);
		createEAttribute(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE__DISPLAY_NAME);
		createEReference(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE__VISIBLE_DOMAIN_MAPPINGS);
		createEAttribute(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE__EXPIRE_TIME);
		createEAttribute(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE__NAME);
		createEOperation(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE___DELETE__STRING_STRING);
		createEOperation(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE___LIST__STRING_STRING_INTEGER_STRING);
		createEOperation(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE___GET__STRING_STRING_STRING);
		createEOperation(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE___PATCH__STRING_STRING_STRING);
		createEOperation(authorizedcertificateEClass, AUTHORIZEDCERTIFICATE___CREATE__STRING);

		resourcerecordEClass = createEClass(RESOURCERECORD);
		createEAttribute(resourcerecordEClass, RESOURCERECORD__TYPE);
		createEAttribute(resourcerecordEClass, RESOURCERECORD__RRDATA);
		createEAttribute(resourcerecordEClass, RESOURCERECORD__NAME);

		libraryEClass = createEClass(LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__VERSION);
		createEAttribute(libraryEClass, LIBRARY__NAME);

		listlocationsresponseEClass = createEClass(LISTLOCATIONSRESPONSE);
		createEAttribute(listlocationsresponseEClass, LISTLOCATIONSRESPONSE__NEXT_PAGE_TOKEN);
		createEReference(listlocationsresponseEClass, LISTLOCATIONSRESPONSE__LOCATIONS);

		containerinfoEClass = createEClass(CONTAINERINFO);
		createEAttribute(containerinfoEClass, CONTAINERINFO__IMAGE);

		requestutilizationEClass = createEClass(REQUESTUTILIZATION);
		createEAttribute(requestutilizationEClass, REQUESTUTILIZATION__TARGET_REQUEST_COUNT_PER_SECOND);
		createEAttribute(requestutilizationEClass, REQUESTUTILIZATION__TARGET_CONCURRENT_REQUESTS);

		apiendpointhandlerlinkEClass = createEClass(APIENDPOINTHANDLERLINK);

		staticfileshandlerlinkEClass = createEClass(STATICFILESHANDLERLINK);

		scripthandlerlinkEClass = createEClass(SCRIPTHANDLERLINK);

		urlmapEClass = createEClass(URLMAP);
		createEAttribute(urlmapEClass, URLMAP__REDIRECT_HTTP_RESPONSE_CODE);
		createEAttribute(urlmapEClass, URLMAP__SECURITY_LEVEL);
		createEAttribute(urlmapEClass, URLMAP__AUTH_FAIL_ACTION);
		createEAttribute(urlmapEClass, URLMAP__URL_REGEX);
		createEAttribute(urlmapEClass, URLMAP__LOGIN);

		endpointsapiserviceEClass = createEClass(ENDPOINTSAPISERVICE);
		createEAttribute(endpointsapiserviceEClass, ENDPOINTSAPISERVICE__NAME);
		createEAttribute(endpointsapiserviceEClass, ENDPOINTSAPISERVICE__CONFIG_ID);

		statuslinkEClass = createEClass(STATUSLINK);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__RESPONSE);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEAttribute(operationEClass, OPERATION__METADATA);
		createEAttribute(operationEClass, OPERATION__DONE);
		createEOperation(operationEClass, OPERATION___LIST__STRING_STRING_STRING_INTEGER);
		createEOperation(operationEClass, OPERATION___GET__STRING_STRING);

		apiconfighandlerEClass = createEClass(APICONFIGHANDLER);
		createEAttribute(apiconfighandlerEClass, APICONFIGHANDLER__SECURITY_LEVEL);
		createEAttribute(apiconfighandlerEClass, APICONFIGHANDLER__AUTH_FAIL_ACTION);
		createEAttribute(apiconfighandlerEClass, APICONFIGHANDLER__SCRIPT);
		createEAttribute(apiconfighandlerEClass, APICONFIGHANDLER__LOGIN);
		createEAttribute(apiconfighandlerEClass, APICONFIGHANDLER__URL);

		staticfileshandlerEClass = createEClass(STATICFILESHANDLER);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__APPLICATION_READABLE);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__HTTP_HEADERS);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__UPLOAD_PATH_REGEX);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__PATH);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__MIME_TYPE);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__REQUIRE_MATCHING_FILE);
		createEAttribute(staticfileshandlerEClass, STATICFILESHANDLER__EXPIRATION);

		basicscalingEClass = createEClass(BASICSCALING);
		createEAttribute(basicscalingEClass, BASICSCALING__MAX_INSTANCES);
		createEAttribute(basicscalingEClass, BASICSCALING__IDLE_TIMEOUT);

		diskutilizationEClass = createEClass(DISKUTILIZATION);
		createEAttribute(diskutilizationEClass, DISKUTILIZATION__TARGET_WRITE_BYTES_PER_SECOND);
		createEAttribute(diskutilizationEClass, DISKUTILIZATION__TARGET_READ_BYTES_PER_SECOND);
		createEAttribute(diskutilizationEClass, DISKUTILIZATION__TARGET_READ_OPS_PER_SECOND);
		createEAttribute(diskutilizationEClass, DISKUTILIZATION__TARGET_WRITE_OPS_PER_SECOND);

		// Create enums
		actionEEnum = createEEnum(ACTION);
		errorcodeEEnum = createEEnum(ERRORCODE);
		servingstatusEEnum = createEEnum(SERVINGSTATUS);
		availabilityEEnum = createEEnum(AVAILABILITY);
		versionServingstatusEEnum = createEEnum(VERSION_SERVINGSTATUS);
		shardbyEEnum = createEEnum(SHARDBY);
		typeEEnum = createEEnum(TYPE);
		redirecthttpresponsecodeEEnum = createEEnum(REDIRECTHTTPRESPONSECODE);
		securitylevelEEnum = createEEnum(SECURITYLEVEL);
		authfailactionEEnum = createEEnum(AUTHFAILACTION);
		loginEEnum = createEEnum(LOGIN);
		apiConfigHandlerSecuritylevelEEnum = createEEnum(API_CONFIG_HANDLER_SECURITYLEVEL);
		apiConfigHandlerAuthfailactionEEnum = createEEnum(API_CONFIG_HANDLER_AUTHFAILACTION);
		apiConfigHandlerLoginEEnum = createEEnum(API_CONFIG_HANDLER_LOGIN);

		// Create data types
		floatEDataType = createEDataType(FLOAT);
		byteEDataType = createEDataType(BYTE);
		doubleEDataType = createEDataType(DOUBLE);
		objectEDataType = createEDataType(OBJECT);
		longEDataType = createEDataType(LONG);
		mapEDataType = createEDataType(MAP);
		anyEDataType = createEDataType(ANY);
		shortEDataType = createEDataType(SHORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cpuutilizationEClass.getESuperTypes().add(theOCCIPackage.getResource());
		statusEClass.getESuperTypes().add(theOCCIPackage.getResource());
		identityawareproxyEClass.getESuperTypes().add(theOCCIPackage.getResource());
		manualscalingEClass.getESuperTypes().add(theOCCIPackage.getResource());
		locationmetadataEClass.getESuperTypes().add(theOCCIPackage.getResource());
		trafficsplitlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		serviceEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listoperationsresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		operationmetadataEClass.getESuperTypes().add(theOCCIPackage.getResource());
		firewallruleEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listauthorizedcertificatesresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		featuresettingsEClass.getESuperTypes().add(theOCCIPackage.getResource());
		errorhandlerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		sslsettingsEClass.getESuperTypes().add(theOCCIPackage.getResource());
		operationmetadatav1EClass.getESuperTypes().add(theOCCIPackage.getResource());
		featuresettingslinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		identityawareproxylinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		applicationEClass.getESuperTypes().add(theOCCIPackage.getResource());
		networkEClass.getESuperTypes().add(theOCCIPackage.getResource());
		instanceEClass.getESuperTypes().add(theOCCIPackage.getResource());
		livenesscheckEClass.getESuperTypes().add(theOCCIPackage.getResource());
		batchupdateingressrulesrequestEClass.getESuperTypes().add(theOCCIPackage.getResource());
		networkutilizationEClass.getESuperTypes().add(theOCCIPackage.getResource());
		locationEClass.getESuperTypes().add(theOCCIPackage.getResource());
		healthcheckEClass.getESuperTypes().add(theOCCIPackage.getResource());
		readinesscheckEClass.getESuperTypes().add(theOCCIPackage.getResource());
		debuginstancerequestEClass.getESuperTypes().add(theOCCIPackage.getResource());
		operationmetadatav1beta5EClass.getESuperTypes().add(theOCCIPackage.getResource());
		automaticscalinglinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		healthchecklinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		readinesschecklinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		manualscalinglinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		apiconfighandlerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		endpointsapiservicelinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		deploymentlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		resourceslinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		basicscalinglinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		livenesschecklinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		networklinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		versionEClass.getESuperTypes().add(theOCCIPackage.getResource());
		repairapplicationrequestEClass.getESuperTypes().add(theOCCIPackage.getResource());
		certificaterawdataEClass.getESuperTypes().add(theOCCIPackage.getResource());
		fileinfoEClass.getESuperTypes().add(theOCCIPackage.getResource());
		scripthandlerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		operationmetadataexperimentalEClass.getESuperTypes().add(theOCCIPackage.getResource());
		authorizeddomainEClass.getESuperTypes().add(theOCCIPackage.getResource());
		trafficsplitEClass.getESuperTypes().add(theOCCIPackage.getResource());
		operationmetadatav1betaEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listservicesresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listingressrulesresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		resourcesEClass.getESuperTypes().add(theOCCIPackage.getResource());
		zipinfolinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		containerinfolinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		deploymentEClass.getESuperTypes().add(theOCCIPackage.getResource());
		batchupdateingressrulesresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		volumeEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listinstancesresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listdomainmappingsresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		operationmetadatav1alphaEClass.getESuperTypes().add(theOCCIPackage.getResource());
		urldispatchruleEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listversionsresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listauthorizeddomainsresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		emptyEClass.getESuperTypes().add(theOCCIPackage.getResource());
		apiendpointhandlerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		sslsettingslinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		domainmappingEClass.getESuperTypes().add(theOCCIPackage.getResource());
		requestutilizationlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		networkutilizationlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		cpuutilizationlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		diskutilizationlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		automaticscalingEClass.getESuperTypes().add(theOCCIPackage.getResource());
		zipinfoEClass.getESuperTypes().add(theOCCIPackage.getResource());
		certificaterawdatalinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		authorizedcertificateEClass.getESuperTypes().add(theOCCIPackage.getResource());
		resourcerecordEClass.getESuperTypes().add(theOCCIPackage.getResource());
		libraryEClass.getESuperTypes().add(theOCCIPackage.getResource());
		listlocationsresponseEClass.getESuperTypes().add(theOCCIPackage.getResource());
		containerinfoEClass.getESuperTypes().add(theOCCIPackage.getResource());
		requestutilizationEClass.getESuperTypes().add(theOCCIPackage.getResource());
		apiendpointhandlerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		staticfileshandlerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		scripthandlerlinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		urlmapEClass.getESuperTypes().add(theOCCIPackage.getResource());
		endpointsapiserviceEClass.getESuperTypes().add(theOCCIPackage.getResource());
		statuslinkEClass.getESuperTypes().add(theOCCIPackage.getLink());
		operationEClass.getESuperTypes().add(theOCCIPackage.getResource());
		apiconfighandlerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		staticfileshandlerEClass.getESuperTypes().add(theOCCIPackage.getResource());
		basicscalingEClass.getESuperTypes().add(theOCCIPackage.getResource());
		diskutilizationEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(arrayEClass, array.class, "array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getarray_Values(), this.getobject(), "values", null, 0, -1, array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuutilizationEClass, Cpuutilization.class, "Cpuutilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpuutilization_AggregationWindowLength(), theOCCIPackage.getString(), "aggregationWindowLength", null, 1, 1, Cpuutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpuutilization_TargetUtilization(), theOCCIPackage.getInteger(), "targetUtilization", null, 1, 1, Cpuutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatus_Details(), this.getarray(), null, "details", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Code(), theOCCIPackage.getInteger(), "code", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Message(), theOCCIPackage.getString(), "message", null, 1, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identityawareproxyEClass, Identityawareproxy.class, "Identityawareproxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentityawareproxy_Oauth2ClientSecret(), theOCCIPackage.getString(), "oauth2ClientSecret", null, 1, 1, Identityawareproxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentityawareproxy_Oauth2ClientId(), theOCCIPackage.getString(), "oauth2ClientId", null, 1, 1, Identityawareproxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentityawareproxy_Oauth2ClientSecretSha256(), theOCCIPackage.getString(), "oauth2ClientSecretSha256", null, 1, 1, Identityawareproxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentityawareproxy_Enabled(), theOCCIPackage.getBoolean(), "enabled", null, 1, 1, Identityawareproxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manualscalingEClass, Manualscaling.class, "Manualscaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManualscaling_Instances(), theOCCIPackage.getInteger(), "instances", null, 1, 1, Manualscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationmetadataEClass, Locationmetadata.class, "Locationmetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationmetadata_FlexibleEnvironmentAvailable(), theOCCIPackage.getBoolean(), "flexibleEnvironmentAvailable", null, 1, 1, Locationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationmetadata_StandardEnvironmentAvailable(), theOCCIPackage.getBoolean(), "standardEnvironmentAvailable", null, 1, 1, Locationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trafficsplitlinkEClass, Trafficsplitlink.class, "Trafficsplitlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getService__Delete__String_String(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__List__String_String_Integer(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Get__String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getService__Patch__String_String_String_boolean(), null, "patch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "updateMask", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getBoolean(), "migrateTraffic", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listoperationsresponseEClass, Listoperationsresponse.class, "Listoperationsresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListoperationsresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listoperationsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListoperationsresponse_Operations(), this.getarray(), null, "operations", null, 1, 1, Listoperationsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmetadataEClass, Operationmetadata.class, "Operationmetadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationmetadata_User(), theOCCIPackage.getString(), "user", null, 1, 1, Operationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadata_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Operationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadata_Method(), theOCCIPackage.getString(), "method", null, 1, 1, Operationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadata_EndTime(), theOCCIPackage.getString(), "endTime", null, 1, 1, Operationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadata_OperationType(), theOCCIPackage.getString(), "operationType", null, 1, 1, Operationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadata_InsertTime(), theOCCIPackage.getString(), "insertTime", null, 1, 1, Operationmetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(firewallruleEClass, Firewallrule.class, "Firewallrule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirewallrule_SourceRange(), theOCCIPackage.getString(), "sourceRange", null, 1, 1, Firewallrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirewallrule_Priority(), theOCCIPackage.getInteger(), "priority", null, 1, 1, Firewallrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirewallrule_Action(), theOCCIPackage.getString(), "action", null, 1, 1, Firewallrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirewallrule_Description(), theOCCIPackage.getString(), "description", null, 1, 1, Firewallrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFirewallrule__Get__String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "ingressRulesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFirewallrule__Patch__String_String_String(), null, "patch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "updateMask", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "ingressRulesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFirewallrule__Batchupdate__String(), null, "batchupdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFirewallrule__Delete__String_String(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "ingressRulesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFirewallrule__List__Integer_String_String_String(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "matchingAddress", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFirewallrule__Create__String(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listauthorizedcertificatesresponseEClass, Listauthorizedcertificatesresponse.class, "Listauthorizedcertificatesresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListauthorizedcertificatesresponse_Certificates(), this.getarray(), null, "certificates", null, 1, 1, Listauthorizedcertificatesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListauthorizedcertificatesresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listauthorizedcertificatesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresettingsEClass, Featuresettings.class, "Featuresettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeaturesettings_SplitHealthChecks(), theOCCIPackage.getBoolean(), "splitHealthChecks", null, 1, 1, Featuresettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorhandlerEClass, Errorhandler.class, "Errorhandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorhandler_ErrorCode(), theOCCIPackage.getString(), "errorCode", null, 1, 1, Errorhandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorhandler_MimeType(), theOCCIPackage.getString(), "mimeType", null, 1, 1, Errorhandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorhandler_StaticFile(), theOCCIPackage.getString(), "staticFile", null, 1, 1, Errorhandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sslsettingsEClass, Sslsettings.class, "Sslsettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSslsettings_CertificateId(), theOCCIPackage.getString(), "certificateId", null, 1, 1, Sslsettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmetadatav1EClass, Operationmetadatav1.class, "Operationmetadatav1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationmetadatav1_Warning(), this.getarray(), null, "warning", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1_InsertTime(), theOCCIPackage.getString(), "insertTime", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1_User(), theOCCIPackage.getString(), "user", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1_EphemeralMessage(), theOCCIPackage.getString(), "ephemeralMessage", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1_Method(), theOCCIPackage.getString(), "method", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1_EndTime(), theOCCIPackage.getString(), "endTime", null, 1, 1, Operationmetadatav1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresettingslinkEClass, Featuresettingslink.class, "Featuresettingslink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityawareproxylinkEClass, Identityawareproxylink.class, "Identityawareproxylink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_DispatchRules(), this.getarray(), null, "dispatchRules", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_GcrDomain(), theOCCIPackage.getString(), "gcrDomain", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_DefaultCookieExpiration(), theOCCIPackage.getString(), "defaultCookieExpiration", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_LocationId(), theOCCIPackage.getString(), "locationId", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_ServingStatus(), theOCCIPackage.getString(), "servingStatus", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_DefaultHostname(), theOCCIPackage.getString(), "defaultHostname", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_AuthDomain(), theOCCIPackage.getString(), "authDomain", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_CodeBucket(), theOCCIPackage.getString(), "codeBucket", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_DefaultBucket(), theOCCIPackage.getString(), "defaultBucket", null, 1, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getApplication__Repair__String(), null, "repair", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__Get__String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApplication__Patch__String_String(), null, "patch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "updateMask", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getApplication__Create(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetwork_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetwork_ForwardedPorts(), this.getarray(), null, "forwardedPorts", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_InstanceTag(), theOCCIPackage.getString(), "instanceTag", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetwork_SubnetworkName(), theOCCIPackage.getString(), "subnetworkName", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstance_AverageLatency(), theOCCIPackage.getInteger(), "averageLatency", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_MemoryUsage(), theOCCIPackage.getString(), "memoryUsage", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_VmIp(), theOCCIPackage.getString(), "vmIp", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Availability(), theOCCIPackage.getString(), "availability", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_VmStatus(), theOCCIPackage.getString(), "vmStatus", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Errors(), theOCCIPackage.getInteger(), "errors", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_StartTime(), theOCCIPackage.getString(), "startTime", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_VmDebugEnabled(), theOCCIPackage.getBoolean(), "vmDebugEnabled", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Requests(), theOCCIPackage.getInteger(), "requests", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_AppEngineRelease(), theOCCIPackage.getString(), "appEngineRelease", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_VmName(), theOCCIPackage.getString(), "vmName", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Qps(), theOCCIPackage.getInteger(), "qps", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_VmId(), theOCCIPackage.getString(), "vmId", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_VmZoneName(), theOCCIPackage.getString(), "vmZoneName", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstance_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInstance__List__String_String_String_Integer_String(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstance__Get__String_String_String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "instancesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstance__Debug__String_String_String_String(), null, "debug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "instancesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstance__Delete__String_String_String_String(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "instancesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(livenesscheckEClass, Livenesscheck.class, "Livenesscheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivenesscheck_FailureThreshold(), theOCCIPackage.getInteger(), "failureThreshold", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivenesscheck_Timeout(), theOCCIPackage.getString(), "timeout", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivenesscheck_InitialDelay(), theOCCIPackage.getString(), "initialDelay", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivenesscheck_Path(), theOCCIPackage.getString(), "path", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivenesscheck_Host(), theOCCIPackage.getString(), "host", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivenesscheck_SuccessThreshold(), theOCCIPackage.getInteger(), "successThreshold", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivenesscheck_CheckInterval(), theOCCIPackage.getString(), "checkInterval", null, 1, 1, Livenesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchupdateingressrulesrequestEClass, Batchupdateingressrulesrequest.class, "Batchupdateingressrulesrequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBatchupdateingressrulesrequest_IngressRules(), this.getarray(), null, "ingressRules", null, 1, 1, Batchupdateingressrulesrequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkutilizationEClass, Networkutilization.class, "Networkutilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkutilization_TargetSentPacketsPerSecond(), theOCCIPackage.getInteger(), "targetSentPacketsPerSecond", null, 1, 1, Networkutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkutilization_TargetReceivedBytesPerSecond(), theOCCIPackage.getInteger(), "targetReceivedBytesPerSecond", null, 1, 1, Networkutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkutilization_TargetReceivedPacketsPerSecond(), theOCCIPackage.getInteger(), "targetReceivedPacketsPerSecond", null, 1, 1, Networkutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkutilization_TargetSentBytesPerSecond(), theOCCIPackage.getInteger(), "targetSentBytesPerSecond", null, 1, 1, Networkutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Metadata(), this.getmap(), "metadata", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Labels(), this.getmap(), "labels", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_LocationId(), theOCCIPackage.getString(), "locationId", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLocation__List__Integer_String_String_String(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "filter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLocation__Get__String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "locationsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(healthcheckEClass, Healthcheck.class, "Healthcheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthcheck_Timeout(), theOCCIPackage.getString(), "timeout", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthcheck_UnhealthyThreshold(), theOCCIPackage.getInteger(), "unhealthyThreshold", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthcheck_DisableHealthCheck(), theOCCIPackage.getBoolean(), "disableHealthCheck", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthcheck_Host(), theOCCIPackage.getString(), "host", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthcheck_HealthyThreshold(), theOCCIPackage.getInteger(), "healthyThreshold", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthcheck_RestartThreshold(), theOCCIPackage.getInteger(), "restartThreshold", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthcheck_CheckInterval(), theOCCIPackage.getString(), "checkInterval", null, 1, 1, Healthcheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readinesscheckEClass, Readinesscheck.class, "Readinesscheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReadinesscheck_Path(), theOCCIPackage.getString(), "path", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadinesscheck_Host(), theOCCIPackage.getString(), "host", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadinesscheck_SuccessThreshold(), theOCCIPackage.getInteger(), "successThreshold", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadinesscheck_CheckInterval(), theOCCIPackage.getString(), "checkInterval", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadinesscheck_FailureThreshold(), theOCCIPackage.getInteger(), "failureThreshold", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadinesscheck_Timeout(), theOCCIPackage.getString(), "timeout", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReadinesscheck_AppStartTimeout(), theOCCIPackage.getString(), "appStartTimeout", null, 1, 1, Readinesscheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(debuginstancerequestEClass, Debuginstancerequest.class, "Debuginstancerequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDebuginstancerequest_SshKey(), theOCCIPackage.getString(), "sshKey", null, 1, 1, Debuginstancerequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmetadatav1beta5EClass, Operationmetadatav1beta5.class, "Operationmetadatav1beta5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationmetadatav1beta5_InsertTime(), theOCCIPackage.getString(), "insertTime", null, 1, 1, Operationmetadatav1beta5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta5_EndTime(), theOCCIPackage.getString(), "endTime", null, 1, 1, Operationmetadatav1beta5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta5_User(), theOCCIPackage.getString(), "user", null, 1, 1, Operationmetadatav1beta5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta5_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Operationmetadatav1beta5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta5_Method(), theOCCIPackage.getString(), "method", null, 1, 1, Operationmetadatav1beta5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automaticscalinglinkEClass, Automaticscalinglink.class, "Automaticscalinglink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(healthchecklinkEClass, Healthchecklink.class, "Healthchecklink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readinesschecklinkEClass, Readinesschecklink.class, "Readinesschecklink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualscalinglinkEClass, Manualscalinglink.class, "Manualscalinglink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apiconfighandlerlinkEClass, Apiconfighandlerlink.class, "Apiconfighandlerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endpointsapiservicelinkEClass, Endpointsapiservicelink.class, "Endpointsapiservicelink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentlinkEClass, Deploymentlink.class, "Deploymentlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceslinkEClass, Resourceslink.class, "Resourceslink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicscalinglinkEClass, Basicscalinglink.class, "Basicscalinglink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livenesschecklinkEClass, Livenesschecklink.class, "Livenesschecklink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networklinkEClass, Networklink.class, "Networklink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Env(), theOCCIPackage.getString(), "env", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Handlers(), this.getarray(), null, "handlers", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_DiskUsageBytes(), theOCCIPackage.getString(), "diskUsageBytes", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Threadsafe(), theOCCIPackage.getBoolean(), "threadsafe", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Vm(), theOCCIPackage.getBoolean(), "vm", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_VersionUrl(), theOCCIPackage.getString(), "versionUrl", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_InstanceClass(), theOCCIPackage.getString(), "instanceClass", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_ServingStatus(), theOCCIPackage.getString(), "servingStatus", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_RuntimeApiVersion(), theOCCIPackage.getString(), "runtimeApiVersion", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_CreateTime(), theOCCIPackage.getString(), "createTime", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_InboundServices(), this.getarray(), null, "inboundServices", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_ErrorHandlers(), this.getarray(), null, "errorHandlers", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_DefaultExpiration(), theOCCIPackage.getString(), "defaultExpiration", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Libraries(), this.getarray(), null, "libraries", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_NobuildFilesRegex(), theOCCIPackage.getString(), "nobuildFilesRegex", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Runtime(), theOCCIPackage.getString(), "runtime", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_CreatedBy(), theOCCIPackage.getString(), "createdBy", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_EnvVariables(), this.getmap(), "envVariables", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_BetaSettings(), this.getmap(), "betaSettings", null, 1, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVersion__Delete__String_String_String(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersion__List__Integer_String_String_String_String(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersion__Get__String_String_String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersion__Patch__String_String_String_String(), null, "patch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "updateMask", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "versionsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVersion__Create__String_String(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "servicesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(repairapplicationrequestEClass, Repairapplicationrequest.class, "Repairapplicationrequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(certificaterawdataEClass, Certificaterawdata.class, "Certificaterawdata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCertificaterawdata_PublicCertificate(), theOCCIPackage.getString(), "publicCertificate", null, 1, 1, Certificaterawdata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCertificaterawdata_PrivateKey(), theOCCIPackage.getString(), "privateKey", null, 1, 1, Certificaterawdata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileinfoEClass, Fileinfo.class, "Fileinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileinfo_SourceUrl(), theOCCIPackage.getString(), "sourceUrl", null, 1, 1, Fileinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileinfo_Sha1Sum(), theOCCIPackage.getString(), "sha1Sum", null, 1, 1, Fileinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileinfo_MimeType(), theOCCIPackage.getString(), "mimeType", null, 1, 1, Fileinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scripthandlerEClass, Scripthandler.class, "Scripthandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScripthandler_ScriptPath(), theOCCIPackage.getString(), "scriptPath", null, 1, 1, Scripthandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmetadataexperimentalEClass, Operationmetadataexperimental.class, "Operationmetadataexperimental", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationmetadataexperimental_User(), theOCCIPackage.getString(), "user", null, 1, 1, Operationmetadataexperimental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadataexperimental_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Operationmetadataexperimental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadataexperimental_Method(), theOCCIPackage.getString(), "method", null, 1, 1, Operationmetadataexperimental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadataexperimental_InsertTime(), theOCCIPackage.getString(), "insertTime", null, 1, 1, Operationmetadataexperimental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadataexperimental_EndTime(), theOCCIPackage.getString(), "endTime", null, 1, 1, Operationmetadataexperimental.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizeddomainEClass, Authorizeddomain.class, "Authorizeddomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizeddomain_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Authorizeddomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAuthorizeddomain__List__String_String_Integer(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(trafficsplitEClass, Trafficsplit.class, "Trafficsplit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrafficsplit_ShardBy(), theOCCIPackage.getString(), "shardBy", null, 1, 1, Trafficsplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrafficsplit_Allocations(), this.getmap(), "allocations", null, 1, 1, Trafficsplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmetadatav1betaEClass, Operationmetadatav1beta.class, "Operationmetadatav1beta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationmetadatav1beta_User(), theOCCIPackage.getString(), "user", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta_EphemeralMessage(), theOCCIPackage.getString(), "ephemeralMessage", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta_Method(), theOCCIPackage.getString(), "method", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta_EndTime(), theOCCIPackage.getString(), "endTime", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationmetadatav1beta_Warning(), this.getarray(), null, "warning", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1beta_InsertTime(), theOCCIPackage.getString(), "insertTime", null, 1, 1, Operationmetadatav1beta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listservicesresponseEClass, Listservicesresponse.class, "Listservicesresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListservicesresponse_Services(), this.getarray(), null, "services", null, 1, 1, Listservicesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListservicesresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listservicesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listingressrulesresponseEClass, Listingressrulesresponse.class, "Listingressrulesresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListingressrulesresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listingressrulesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListingressrulesresponse_IngressRules(), this.getarray(), null, "ingressRules", null, 1, 1, Listingressrulesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcesEClass, Resources.class, "Resources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResources_Volumes(), this.getarray(), null, "volumes", null, 1, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResources_DiskGb(), theOCCIPackage.getInteger(), "diskGb", null, 1, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResources_Cpu(), theOCCIPackage.getInteger(), "cpu", null, 1, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResources_MemoryGb(), theOCCIPackage.getInteger(), "memoryGb", null, 1, 1, Resources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zipinfolinkEClass, Zipinfolink.class, "Zipinfolink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerinfolinkEClass, Containerinfolink.class, "Containerinfolink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_Files(), this.getobject(), "files", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batchupdateingressrulesresponseEClass, Batchupdateingressrulesresponse.class, "Batchupdateingressrulesresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBatchupdateingressrulesresponse_IngressRules(), this.getarray(), null, "ingressRules", null, 1, 1, Batchupdateingressrulesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVolume_VolumeType(), theOCCIPackage.getString(), "volumeType", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_SizeGb(), theOCCIPackage.getInteger(), "sizeGb", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listinstancesresponseEClass, Listinstancesresponse.class, "Listinstancesresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListinstancesresponse_Instances(), this.getarray(), null, "instances", null, 1, 1, Listinstancesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListinstancesresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listinstancesresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listdomainmappingsresponseEClass, Listdomainmappingsresponse.class, "Listdomainmappingsresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListdomainmappingsresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listdomainmappingsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListdomainmappingsresponse_DomainMappings(), this.getarray(), null, "domainMappings", null, 1, 1, Listdomainmappingsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationmetadatav1alphaEClass, Operationmetadatav1alpha.class, "Operationmetadatav1alpha", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationmetadatav1alpha_EndTime(), theOCCIPackage.getString(), "endTime", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationmetadatav1alpha_Warning(), this.getarray(), null, "warning", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1alpha_InsertTime(), theOCCIPackage.getString(), "insertTime", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1alpha_User(), theOCCIPackage.getString(), "user", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1alpha_Target(), theOCCIPackage.getString(), "target", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1alpha_EphemeralMessage(), theOCCIPackage.getString(), "ephemeralMessage", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationmetadatav1alpha_Method(), theOCCIPackage.getString(), "method", null, 1, 1, Operationmetadatav1alpha.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urldispatchruleEClass, Urldispatchrule.class, "Urldispatchrule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrldispatchrule_Domain(), theOCCIPackage.getString(), "domain", null, 1, 1, Urldispatchrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrldispatchrule_Service(), theOCCIPackage.getString(), "service", null, 1, 1, Urldispatchrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrldispatchrule_Path(), theOCCIPackage.getString(), "path", null, 1, 1, Urldispatchrule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listversionsresponseEClass, Listversionsresponse.class, "Listversionsresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListversionsresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listversionsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListversionsresponse_Versions(), this.getarray(), null, "versions", null, 1, 1, Listversionsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listauthorizeddomainsresponseEClass, Listauthorizeddomainsresponse.class, "Listauthorizeddomainsresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListauthorizeddomainsresponse_Domains(), this.getarray(), null, "domains", null, 1, 1, Listauthorizeddomainsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListauthorizeddomainsresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listauthorizeddomainsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apiendpointhandlerEClass, Apiendpointhandler.class, "Apiendpointhandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiendpointhandler_ScriptPath(), theOCCIPackage.getString(), "scriptPath", null, 1, 1, Apiendpointhandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sslsettingslinkEClass, Sslsettingslink.class, "Sslsettingslink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainmappingEClass, Domainmapping.class, "Domainmapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainmapping_ResourceRecords(), this.getarray(), null, "resourceRecords", null, 1, 1, Domainmapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainmapping_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Domainmapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDomainmapping__Delete__String_String(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "domainMappingsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomainmapping__List__String_String_Integer(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomainmapping__Get__String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "domainMappingsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomainmapping__Patch__String_String_String(), null, "patch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "updateMask", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "domainMappingsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDomainmapping__Create__String(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requestutilizationlinkEClass, Requestutilizationlink.class, "Requestutilizationlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkutilizationlinkEClass, Networkutilizationlink.class, "Networkutilizationlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cpuutilizationlinkEClass, Cpuutilizationlink.class, "Cpuutilizationlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diskutilizationlinkEClass, Diskutilizationlink.class, "Diskutilizationlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(automaticscalingEClass, Automaticscaling.class, "Automaticscaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomaticscaling_MinPendingLatency(), theOCCIPackage.getString(), "minPendingLatency", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_MaxIdleInstances(), theOCCIPackage.getInteger(), "maxIdleInstances", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_MinIdleInstances(), theOCCIPackage.getInteger(), "minIdleInstances", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_MaxTotalInstances(), theOCCIPackage.getInteger(), "maxTotalInstances", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_MinTotalInstances(), theOCCIPackage.getInteger(), "minTotalInstances", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_MaxConcurrentRequests(), theOCCIPackage.getInteger(), "maxConcurrentRequests", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_CoolDownPeriod(), theOCCIPackage.getString(), "coolDownPeriod", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticscaling_MaxPendingLatency(), theOCCIPackage.getString(), "maxPendingLatency", null, 1, 1, Automaticscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zipinfoEClass, Zipinfo.class, "Zipinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZipinfo_SourceUrl(), theOCCIPackage.getString(), "sourceUrl", null, 1, 1, Zipinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZipinfo_FilesCount(), theOCCIPackage.getInteger(), "filesCount", null, 1, 1, Zipinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(certificaterawdatalinkEClass, Certificaterawdatalink.class, "Certificaterawdatalink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizedcertificateEClass, Authorizedcertificate.class, "Authorizedcertificate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorizedcertificate_DomainMappingsCount(), theOCCIPackage.getInteger(), "domainMappingsCount", null, 1, 1, Authorizedcertificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizedcertificate_DomainNames(), this.getarray(), null, "domainNames", null, 1, 1, Authorizedcertificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizedcertificate_DisplayName(), theOCCIPackage.getString(), "displayName", null, 1, 1, Authorizedcertificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizedcertificate_VisibleDomainMappings(), this.getarray(), null, "visibleDomainMappings", null, 1, 1, Authorizedcertificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizedcertificate_ExpireTime(), theOCCIPackage.getString(), "expireTime", null, 1, 1, Authorizedcertificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizedcertificate_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Authorizedcertificate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAuthorizedcertificate__Delete__String_String(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "authorizedCertificatesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthorizedcertificate__List__String_String_Integer_String(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthorizedcertificate__Get__String_String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "view", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "authorizedCertificatesId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthorizedcertificate__Patch__String_String_String(), null, "patch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "authorizedCertificatesId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "updateMask", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAuthorizedcertificate__Create__String(), null, "create", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resourcerecordEClass, Resourcerecord.class, "Resourcerecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourcerecord_Type(), theOCCIPackage.getString(), "type", null, 1, 1, Resourcerecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcerecord_Rrdata(), theOCCIPackage.getString(), "rrdata", null, 1, 1, Resourcerecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcerecord_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Resourcerecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibrary_Version(), theOCCIPackage.getString(), "version", null, 1, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listlocationsresponseEClass, Listlocationsresponse.class, "Listlocationsresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListlocationsresponse_NextPageToken(), theOCCIPackage.getString(), "nextPageToken", null, 1, 1, Listlocationsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListlocationsresponse_Locations(), this.getarray(), null, "locations", null, 1, 1, Listlocationsresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerinfoEClass, Containerinfo.class, "Containerinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerinfo_Image(), theOCCIPackage.getString(), "image", null, 1, 1, Containerinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestutilizationEClass, Requestutilization.class, "Requestutilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestutilization_TargetRequestCountPerSecond(), theOCCIPackage.getInteger(), "targetRequestCountPerSecond", null, 1, 1, Requestutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequestutilization_TargetConcurrentRequests(), theOCCIPackage.getInteger(), "targetConcurrentRequests", null, 1, 1, Requestutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apiendpointhandlerlinkEClass, Apiendpointhandlerlink.class, "Apiendpointhandlerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticfileshandlerlinkEClass, Staticfileshandlerlink.class, "Staticfileshandlerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scripthandlerlinkEClass, Scripthandlerlink.class, "Scripthandlerlink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlmapEClass, Urlmap.class, "Urlmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlmap_RedirectHttpResponseCode(), theOCCIPackage.getString(), "redirectHttpResponseCode", null, 1, 1, Urlmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlmap_SecurityLevel(), theOCCIPackage.getString(), "securityLevel", null, 1, 1, Urlmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlmap_AuthFailAction(), theOCCIPackage.getString(), "authFailAction", null, 1, 1, Urlmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlmap_UrlRegex(), theOCCIPackage.getString(), "urlRegex", null, 1, 1, Urlmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlmap_Login(), theOCCIPackage.getString(), "login", null, 1, 1, Urlmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointsapiserviceEClass, Endpointsapiservice.class, "Endpointsapiservice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndpointsapiservice_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Endpointsapiservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEndpointsapiservice_ConfigId(), theOCCIPackage.getString(), "configId", null, 1, 1, Endpointsapiservice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statuslinkEClass, Statuslink.class, "Statuslink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Response(), this.getmap(), "response", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Name(), theOCCIPackage.getString(), "name", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Metadata(), this.getmap(), "metadata", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Done(), theOCCIPackage.getBoolean(), "done", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOperation__List__String_String_String_Integer(), null, "list", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "filter", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "pageToken", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getInteger(), "pageSize", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__Get__String_String(), null, "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "appsId", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theOCCIPackage.getString(), "operationsId", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(apiconfighandlerEClass, Apiconfighandler.class, "Apiconfighandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApiconfighandler_SecurityLevel(), theOCCIPackage.getString(), "securityLevel", null, 1, 1, Apiconfighandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiconfighandler_AuthFailAction(), theOCCIPackage.getString(), "authFailAction", null, 1, 1, Apiconfighandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiconfighandler_Script(), theOCCIPackage.getString(), "script", null, 1, 1, Apiconfighandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiconfighandler_Login(), theOCCIPackage.getString(), "login", null, 1, 1, Apiconfighandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApiconfighandler_Url(), theOCCIPackage.getString(), "url", null, 1, 1, Apiconfighandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticfileshandlerEClass, Staticfileshandler.class, "Staticfileshandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticfileshandler_ApplicationReadable(), theOCCIPackage.getBoolean(), "applicationReadable", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticfileshandler_HttpHeaders(), this.getmap(), "httpHeaders", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticfileshandler_UploadPathRegex(), theOCCIPackage.getString(), "uploadPathRegex", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticfileshandler_Path(), theOCCIPackage.getString(), "path", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticfileshandler_MimeType(), theOCCIPackage.getString(), "mimeType", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticfileshandler_RequireMatchingFile(), theOCCIPackage.getBoolean(), "requireMatchingFile", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticfileshandler_Expiration(), theOCCIPackage.getString(), "expiration", null, 1, 1, Staticfileshandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicscalingEClass, Basicscaling.class, "Basicscaling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicscaling_MaxInstances(), theOCCIPackage.getInteger(), "maxInstances", null, 1, 1, Basicscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicscaling_IdleTimeout(), theOCCIPackage.getString(), "idleTimeout", null, 1, 1, Basicscaling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diskutilizationEClass, Diskutilization.class, "Diskutilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiskutilization_TargetWriteBytesPerSecond(), theOCCIPackage.getInteger(), "targetWriteBytesPerSecond", null, 1, 1, Diskutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiskutilization_TargetReadBytesPerSecond(), theOCCIPackage.getInteger(), "targetReadBytesPerSecond", null, 1, 1, Diskutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiskutilization_TargetReadOpsPerSecond(), theOCCIPackage.getInteger(), "targetReadOpsPerSecond", null, 1, 1, Diskutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiskutilization_TargetWriteOpsPerSecond(), theOCCIPackage.getInteger(), "targetWriteOpsPerSecond", null, 1, 1, Diskutilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(actionEEnum, Action.class, "Action");
		addEEnumLiteral(actionEEnum, Action.UNSPECIFIED_ACTION);
		addEEnumLiteral(actionEEnum, Action.ALLOW);
		addEEnumLiteral(actionEEnum, Action.DENY);

		initEEnum(errorcodeEEnum, Errorcode.class, "Errorcode");
		addEEnumLiteral(errorcodeEEnum, Errorcode.ERROR_CODE_UNSPECIFIED);
		addEEnumLiteral(errorcodeEEnum, Errorcode.ERROR_CODE_DEFAULT);
		addEEnumLiteral(errorcodeEEnum, Errorcode.ERROR_CODE_OVER_QUOTA);
		addEEnumLiteral(errorcodeEEnum, Errorcode.ERROR_CODE_DOS_API_DENIAL);
		addEEnumLiteral(errorcodeEEnum, Errorcode.ERROR_CODE_TIMEOUT);

		initEEnum(servingstatusEEnum, Servingstatus.class, "Servingstatus");
		addEEnumLiteral(servingstatusEEnum, Servingstatus.UNSPECIFIED);
		addEEnumLiteral(servingstatusEEnum, Servingstatus.SERVING);
		addEEnumLiteral(servingstatusEEnum, Servingstatus.USER_DISABLED);
		addEEnumLiteral(servingstatusEEnum, Servingstatus.SYSTEM_DISABLED);

		initEEnum(availabilityEEnum, Availability.class, "Availability");
		addEEnumLiteral(availabilityEEnum, Availability.UNSPECIFIED);
		addEEnumLiteral(availabilityEEnum, Availability.RESIDENT);
		addEEnumLiteral(availabilityEEnum, Availability.DYNAMIC);

		initEEnum(versionServingstatusEEnum, VersionServingstatus.class, "VersionServingstatus");
		addEEnumLiteral(versionServingstatusEEnum, VersionServingstatus.SERVING_STATUS_UNSPECIFIED);
		addEEnumLiteral(versionServingstatusEEnum, VersionServingstatus.SERVING);
		addEEnumLiteral(versionServingstatusEEnum, VersionServingstatus.STOPPED);

		initEEnum(shardbyEEnum, Shardby.class, "Shardby");
		addEEnumLiteral(shardbyEEnum, Shardby.UNSPECIFIED);
		addEEnumLiteral(shardbyEEnum, Shardby.COOKIE);
		addEEnumLiteral(shardbyEEnum, Shardby.IP);
		addEEnumLiteral(shardbyEEnum, Shardby.RANDOM);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.RECORD_TYPE_UNSPECIFIED);
		addEEnumLiteral(typeEEnum, Type.A);
		addEEnumLiteral(typeEEnum, Type.AAAA);
		addEEnumLiteral(typeEEnum, Type.CNAME);

		initEEnum(redirecthttpresponsecodeEEnum, Redirecthttpresponsecode.class, "Redirecthttpresponsecode");
		addEEnumLiteral(redirecthttpresponsecodeEEnum, Redirecthttpresponsecode.REDIRECT_HTTP_RESPONSE_CODE_UNSPECIFIED);
		addEEnumLiteral(redirecthttpresponsecodeEEnum, Redirecthttpresponsecode.REDIRECT_HTTP_RESPONSE_CODE_301);
		addEEnumLiteral(redirecthttpresponsecodeEEnum, Redirecthttpresponsecode.REDIRECT_HTTP_RESPONSE_CODE_302);
		addEEnumLiteral(redirecthttpresponsecodeEEnum, Redirecthttpresponsecode.REDIRECT_HTTP_RESPONSE_CODE_303);
		addEEnumLiteral(redirecthttpresponsecodeEEnum, Redirecthttpresponsecode.REDIRECT_HTTP_RESPONSE_CODE_307);

		initEEnum(securitylevelEEnum, Securitylevel.class, "Securitylevel");
		addEEnumLiteral(securitylevelEEnum, Securitylevel.SECURE_UNSPECIFIED);
		addEEnumLiteral(securitylevelEEnum, Securitylevel.SECURE_DEFAULT);
		addEEnumLiteral(securitylevelEEnum, Securitylevel.SECURE_NEVER);
		addEEnumLiteral(securitylevelEEnum, Securitylevel.SECURE_OPTIONAL);
		addEEnumLiteral(securitylevelEEnum, Securitylevel.SECURE_ALWAYS);

		initEEnum(authfailactionEEnum, Authfailaction.class, "Authfailaction");
		addEEnumLiteral(authfailactionEEnum, Authfailaction.AUTH_FAIL_ACTION_UNSPECIFIED);
		addEEnumLiteral(authfailactionEEnum, Authfailaction.AUTH_FAIL_ACTION_REDIRECT);
		addEEnumLiteral(authfailactionEEnum, Authfailaction.AUTH_FAIL_ACTION_UNAUTHORIZED);

		initEEnum(loginEEnum, Login.class, "Login");
		addEEnumLiteral(loginEEnum, Login.LOGIN_UNSPECIFIED);
		addEEnumLiteral(loginEEnum, Login.LOGIN_OPTIONAL);
		addEEnumLiteral(loginEEnum, Login.LOGIN_ADMIN);
		addEEnumLiteral(loginEEnum, Login.LOGIN_REQUIRED);

		initEEnum(apiConfigHandlerSecuritylevelEEnum, ApiConfigHandlerSecuritylevel.class, "ApiConfigHandlerSecuritylevel");
		addEEnumLiteral(apiConfigHandlerSecuritylevelEEnum, ApiConfigHandlerSecuritylevel.SECURE_UNSPECIFIED);
		addEEnumLiteral(apiConfigHandlerSecuritylevelEEnum, ApiConfigHandlerSecuritylevel.SECURE_DEFAULT);
		addEEnumLiteral(apiConfigHandlerSecuritylevelEEnum, ApiConfigHandlerSecuritylevel.SECURE_NEVER);
		addEEnumLiteral(apiConfigHandlerSecuritylevelEEnum, ApiConfigHandlerSecuritylevel.SECURE_OPTIONAL);
		addEEnumLiteral(apiConfigHandlerSecuritylevelEEnum, ApiConfigHandlerSecuritylevel.SECURE_ALWAYS);

		initEEnum(apiConfigHandlerAuthfailactionEEnum, ApiConfigHandlerAuthfailaction.class, "ApiConfigHandlerAuthfailaction");
		addEEnumLiteral(apiConfigHandlerAuthfailactionEEnum, ApiConfigHandlerAuthfailaction.AUTH_FAIL_ACTION_UNSPECIFIED);
		addEEnumLiteral(apiConfigHandlerAuthfailactionEEnum, ApiConfigHandlerAuthfailaction.AUTH_FAIL_ACTION_REDIRECT);
		addEEnumLiteral(apiConfigHandlerAuthfailactionEEnum, ApiConfigHandlerAuthfailaction.AUTH_FAIL_ACTION_UNAUTHORIZED);

		initEEnum(apiConfigHandlerLoginEEnum, ApiConfigHandlerLogin.class, "ApiConfigHandlerLogin");
		addEEnumLiteral(apiConfigHandlerLoginEEnum, ApiConfigHandlerLogin.LOGIN_UNSPECIFIED);
		addEEnumLiteral(apiConfigHandlerLoginEEnum, ApiConfigHandlerLogin.LOGIN_OPTIONAL);
		addEEnumLiteral(apiConfigHandlerLoginEEnum, ApiConfigHandlerLogin.LOGIN_ADMIN);
		addEEnumLiteral(apiConfigHandlerLoginEEnum, ApiConfigHandlerLogin.LOGIN_REQUIRED);

		// Initialize data types
		initEDataType(floatEDataType, Float.class, "float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(byteEDataType, Byte.class, "byte", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleEDataType, Double.class, "double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anyEDataType, Object.class, "any", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shortEDataType, Short.class, "short", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (trafficsplitlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (featuresettingslinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (identityawareproxylinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (automaticscalinglinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (healthchecklinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (readinesschecklinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (manualscalinglinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (apiconfighandlerlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (endpointsapiservicelinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (deploymentlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (resourceslinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (basicscalinglinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (livenesschecklinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (networklinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (zipinfolinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (containerinfolinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (sslsettingslinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (requestutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (networkutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (cpuutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (diskutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (certificaterawdatalinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (apiendpointhandlerlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (staticfileshandlerlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (scripthandlerlinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });	
		addAnnotation
		  (statuslinkEClass, 
		   source, 
		   new String[] {
			 "constraints", "sourceConstraint targetConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "occi", "http://schemas.ogf.org/occi/core/ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (trafficsplitlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Service)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Trafficsplit)"
		   });	
		addAnnotation
		  (featuresettingslinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Application)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Featuresettings)"
		   });	
		addAnnotation
		  (identityawareproxylinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Application)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Identityawareproxy)"
		   });	
		addAnnotation
		  (automaticscalinglinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Automaticscaling)"
		   });	
		addAnnotation
		  (healthchecklinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Healthcheck)"
		   });	
		addAnnotation
		  (readinesschecklinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Readinesscheck)"
		   });	
		addAnnotation
		  (manualscalinglinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Manualscaling)"
		   });	
		addAnnotation
		  (apiconfighandlerlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Apiconfighandler)"
		   });	
		addAnnotation
		  (endpointsapiservicelinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Endpointsapiservice)"
		   });	
		addAnnotation
		  (deploymentlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Deployment)"
		   });	
		addAnnotation
		  (resourceslinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Resources)"
		   });	
		addAnnotation
		  (basicscalinglinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Basicscaling)"
		   });	
		addAnnotation
		  (livenesschecklinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Livenesscheck)"
		   });	
		addAnnotation
		  (networklinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Version)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Network)"
		   });	
		addAnnotation
		  (zipinfolinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Deployment)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Zipinfo)"
		   });	
		addAnnotation
		  (containerinfolinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Deployment)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Containerinfo)"
		   });	
		addAnnotation
		  (sslsettingslinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Domainmapping)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Sslsettings)"
		   });	
		addAnnotation
		  (requestutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Automaticscaling)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Requestutilization)"
		   });	
		addAnnotation
		  (networkutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Automaticscaling)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Networkutilization)"
		   });	
		addAnnotation
		  (cpuutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Automaticscaling)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Cpuutilization)"
		   });	
		addAnnotation
		  (diskutilizationlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Automaticscaling)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Diskutilization)"
		   });	
		addAnnotation
		  (certificaterawdatalinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Authorizedcertificate)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Certificaterawdata)"
		   });	
		addAnnotation
		  (apiendpointhandlerlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Urlmap)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Apiendpointhandler)"
		   });	
		addAnnotation
		  (staticfileshandlerlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Urlmap)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Staticfileshandler)"
		   });	
		addAnnotation
		  (scripthandlerlinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Urlmap)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Scripthandler)"
		   });	
		addAnnotation
		  (statuslinkEClass, 
		   source, 
		   new String[] {
			 "sourceConstraint", "self.source.oclIsKindOf(appengine::Operation)",
			 "targetConstraint", "self.target.oclIsKindOf(appengine::Status)"
		   });
	}

} //AppenginePackageImpl
