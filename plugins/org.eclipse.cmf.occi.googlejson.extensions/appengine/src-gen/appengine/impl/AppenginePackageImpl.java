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

import appengine.AppengineFactory;
import appengine.AppenginePackage;

import appengine.util.AppengineValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

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
	protected String packageFilename = "appengine.ecore";

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
	private EDataType floatEDataType = null;

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
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shortEDataType = null;

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
	private EDataType objectEDataType = null;

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
	 * @generated
	 */
	public static AppenginePackage init() {
		if (isInited) return (AppenginePackage)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI);

		// Obtain or create and register package
		AppenginePackageImpl theAppenginePackage = (AppenginePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppenginePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppenginePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Load packages
		theAppenginePackage.loadPackage();

		// Fix loaded packages
		theAppenginePackage.fixPackageContents();

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
		if (arrayEClass == null) {
			arrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(5);
		}
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarray_Values() {
        return (EAttribute)getarray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuutilization() {
		if (cpuutilizationEClass == null) {
			cpuutilizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(23);
		}
		return cpuutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuutilization_AggregationWindowLength() {
        return (EAttribute)getCpuutilization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuutilization_TargetUtilization() {
        return (EAttribute)getCpuutilization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		if (statusEClass == null) {
			statusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(24);
		}
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatus_Details() {
        return (EReference)getStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Code() {
        return (EAttribute)getStatus().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Message() {
        return (EAttribute)getStatus().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityawareproxy() {
		if (identityawareproxyEClass == null) {
			identityawareproxyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(25);
		}
		return identityawareproxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Oauth2ClientSecret() {
        return (EAttribute)getIdentityawareproxy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Oauth2ClientId() {
        return (EAttribute)getIdentityawareproxy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Oauth2ClientSecretSha256() {
        return (EAttribute)getIdentityawareproxy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityawareproxy_Enabled() {
        return (EAttribute)getIdentityawareproxy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualscaling() {
		if (manualscalingEClass == null) {
			manualscalingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(26);
		}
		return manualscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualscaling_Instances() {
        return (EAttribute)getManualscaling().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationmetadata() {
		if (locationmetadataEClass == null) {
			locationmetadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(27);
		}
		return locationmetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationmetadata_FlexibleEnvironmentAvailable() {
        return (EAttribute)getLocationmetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationmetadata_StandardEnvironmentAvailable() {
        return (EAttribute)getLocationmetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrafficsplitlink() {
		if (trafficsplitlinkEClass == null) {
			trafficsplitlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(28);
		}
		return trafficsplitlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrafficsplitlink__SourceConstraint__DiagnosticChain_Map() {
        return getTrafficsplitlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrafficsplitlink__TargetConstraint__DiagnosticChain_Map() {
        return getTrafficsplitlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		if (serviceEClass == null) {
			serviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(29);
		}
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
        return (EAttribute)getService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__Delete__String_String() {
        return getService().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__List__String_String_Integer() {
        return getService().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__Get__String_String() {
        return getService().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getService__Patch__String_String_String_boolean() {
        return getService().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListoperationsresponse() {
		if (listoperationsresponseEClass == null) {
			listoperationsresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(30);
		}
		return listoperationsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListoperationsresponse_NextPageToken() {
        return (EAttribute)getListoperationsresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListoperationsresponse_Operations() {
        return (EReference)getListoperationsresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadata() {
		if (operationmetadataEClass == null) {
			operationmetadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(31);
		}
		return operationmetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_User() {
        return (EAttribute)getOperationmetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_Target() {
        return (EAttribute)getOperationmetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_Method() {
        return (EAttribute)getOperationmetadata().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_EndTime() {
        return (EAttribute)getOperationmetadata().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_OperationType() {
        return (EAttribute)getOperationmetadata().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadata_InsertTime() {
        return (EAttribute)getOperationmetadata().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirewallrule() {
		if (firewallruleEClass == null) {
			firewallruleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(32);
		}
		return firewallruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_SourceRange() {
        return (EAttribute)getFirewallrule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_Priority() {
        return (EAttribute)getFirewallrule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_Action() {
        return (EAttribute)getFirewallrule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirewallrule_Description() {
        return (EAttribute)getFirewallrule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Get__String_String() {
        return getFirewallrule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Patch__String_String_String() {
        return getFirewallrule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Batchupdate__String() {
        return getFirewallrule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Delete__String_String() {
        return getFirewallrule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__List__Integer_String_String_String() {
        return getFirewallrule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFirewallrule__Create__String() {
        return getFirewallrule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListauthorizedcertificatesresponse() {
		if (listauthorizedcertificatesresponseEClass == null) {
			listauthorizedcertificatesresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(33);
		}
		return listauthorizedcertificatesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListauthorizedcertificatesresponse_Certificates() {
        return (EReference)getListauthorizedcertificatesresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListauthorizedcertificatesresponse_NextPageToken() {
        return (EAttribute)getListauthorizedcertificatesresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesettings() {
		if (featuresettingsEClass == null) {
			featuresettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(34);
		}
		return featuresettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturesettings_SplitHealthChecks() {
        return (EAttribute)getFeaturesettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorhandler() {
		if (errorhandlerEClass == null) {
			errorhandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(35);
		}
		return errorhandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorhandler_ErrorCode() {
        return (EAttribute)getErrorhandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorhandler_MimeType() {
        return (EAttribute)getErrorhandler().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorhandler_StaticFile() {
        return (EAttribute)getErrorhandler().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSslsettings() {
		if (sslsettingsEClass == null) {
			sslsettingsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(36);
		}
		return sslsettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSslsettings_CertificateId() {
        return (EAttribute)getSslsettings().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1() {
		if (operationmetadatav1EClass == null) {
			operationmetadatav1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(37);
		}
		return operationmetadatav1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationmetadatav1_Warning() {
        return (EReference)getOperationmetadatav1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_InsertTime() {
        return (EAttribute)getOperationmetadatav1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_Target() {
        return (EAttribute)getOperationmetadatav1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_User() {
        return (EAttribute)getOperationmetadatav1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_EphemeralMessage() {
        return (EAttribute)getOperationmetadatav1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_Method() {
        return (EAttribute)getOperationmetadatav1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1_EndTime() {
        return (EAttribute)getOperationmetadatav1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesettingslink() {
		if (featuresettingslinkEClass == null) {
			featuresettingslinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(38);
		}
		return featuresettingslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeaturesettingslink__SourceConstraint__DiagnosticChain_Map() {
        return getFeaturesettingslink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFeaturesettingslink__TargetConstraint__DiagnosticChain_Map() {
        return getFeaturesettingslink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityawareproxylink() {
		if (identityawareproxylinkEClass == null) {
			identityawareproxylinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(39);
		}
		return identityawareproxylinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdentityawareproxylink__SourceConstraint__DiagnosticChain_Map() {
        return getIdentityawareproxylink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIdentityawareproxylink__TargetConstraint__DiagnosticChain_Map() {
        return getIdentityawareproxylink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		if (applicationEClass == null) {
			applicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(40);
		}
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_DispatchRules() {
        return (EReference)getApplication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_GcrDomain() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DefaultCookieExpiration() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_LocationId() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_ServingStatus() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DefaultHostname() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_AuthDomain() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_CodeBucket() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_DefaultBucket() {
        return (EAttribute)getApplication().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Repair__String() {
        return getApplication().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Get__String() {
        return getApplication().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Patch__String_String() {
        return getApplication().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__Create() {
        return getApplication().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		if (networkEClass == null) {
			networkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(41);
		}
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_Name() {
        return (EAttribute)getNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_ForwardedPorts() {
        return (EReference)getNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_InstanceTag() {
        return (EAttribute)getNetwork().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetwork_SubnetworkName() {
        return (EAttribute)getNetwork().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		if (instanceEClass == null) {
			instanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(42);
		}
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_AverageLatency() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_MemoryUsage() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmIp() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Availability() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmStatus() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Errors() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_StartTime() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmDebugEnabled() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Requests() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_AppEngineRelease() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmName() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Qps() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmId() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_VmZoneName() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstance_Name() {
        return (EAttribute)getInstance().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__List__String_String_String_Integer_String() {
        return getInstance().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__Get__String_String_String_String() {
        return getInstance().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__Debug__String_String_String_String() {
        return getInstance().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstance__Delete__String_String_String_String() {
        return getInstance().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivenesscheck() {
		if (livenesscheckEClass == null) {
			livenesscheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(43);
		}
		return livenesscheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_FailureThreshold() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_Timeout() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_InitialDelay() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_Path() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_Host() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_SuccessThreshold() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivenesscheck_CheckInterval() {
        return (EAttribute)getLivenesscheck().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchupdateingressrulesrequest() {
		if (batchupdateingressrulesrequestEClass == null) {
			batchupdateingressrulesrequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(44);
		}
		return batchupdateingressrulesrequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchupdateingressrulesrequest_IngressRules() {
        return (EReference)getBatchupdateingressrulesrequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkutilization() {
		if (networkutilizationEClass == null) {
			networkutilizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(45);
		}
		return networkutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetSentPacketsPerSecond() {
        return (EAttribute)getNetworkutilization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetReceivedBytesPerSecond() {
        return (EAttribute)getNetworkutilization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetReceivedPacketsPerSecond() {
        return (EAttribute)getNetworkutilization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkutilization_TargetSentBytesPerSecond() {
        return (EAttribute)getNetworkutilization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(46);
		}
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Metadata() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Labels() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Name() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_LocationId() {
        return (EAttribute)getLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__List__Integer_String_String_String() {
        return getLocation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLocation__Get__String_String() {
        return getLocation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcheck() {
		if (healthcheckEClass == null) {
			healthcheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(47);
		}
		return healthcheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_Timeout() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_UnhealthyThreshold() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_DisableHealthCheck() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_Host() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_HealthyThreshold() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_RestartThreshold() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthcheck_CheckInterval() {
        return (EAttribute)getHealthcheck().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadinesscheck() {
		if (readinesscheckEClass == null) {
			readinesscheckEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(48);
		}
		return readinesscheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_Path() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_Host() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_SuccessThreshold() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_CheckInterval() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_FailureThreshold() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_Timeout() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadinesscheck_AppStartTimeout() {
        return (EAttribute)getReadinesscheck().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDebuginstancerequest() {
		if (debuginstancerequestEClass == null) {
			debuginstancerequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(49);
		}
		return debuginstancerequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDebuginstancerequest_SshKey() {
        return (EAttribute)getDebuginstancerequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1beta5() {
		if (operationmetadatav1beta5EClass == null) {
			operationmetadatav1beta5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(50);
		}
		return operationmetadatav1beta5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_InsertTime() {
        return (EAttribute)getOperationmetadatav1beta5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_EndTime() {
        return (EAttribute)getOperationmetadatav1beta5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_User() {
        return (EAttribute)getOperationmetadatav1beta5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_Target() {
        return (EAttribute)getOperationmetadatav1beta5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta5_Method() {
        return (EAttribute)getOperationmetadatav1beta5().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticscalinglink() {
		if (automaticscalinglinkEClass == null) {
			automaticscalinglinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(51);
		}
		return automaticscalinglinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutomaticscalinglink__SourceConstraint__DiagnosticChain_Map() {
        return getAutomaticscalinglink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutomaticscalinglink__TargetConstraint__DiagnosticChain_Map() {
        return getAutomaticscalinglink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthchecklink() {
		if (healthchecklinkEClass == null) {
			healthchecklinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(52);
		}
		return healthchecklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHealthchecklink__SourceConstraint__DiagnosticChain_Map() {
        return getHealthchecklink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHealthchecklink__TargetConstraint__DiagnosticChain_Map() {
        return getHealthchecklink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadinesschecklink() {
		if (readinesschecklinkEClass == null) {
			readinesschecklinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(53);
		}
		return readinesschecklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadinesschecklink__SourceConstraint__DiagnosticChain_Map() {
        return getReadinesschecklink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadinesschecklink__TargetConstraint__DiagnosticChain_Map() {
        return getReadinesschecklink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualscalinglink() {
		if (manualscalinglinkEClass == null) {
			manualscalinglinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(54);
		}
		return manualscalinglinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManualscalinglink__SourceConstraint__DiagnosticChain_Map() {
        return getManualscalinglink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManualscalinglink__TargetConstraint__DiagnosticChain_Map() {
        return getManualscalinglink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiconfighandlerlink() {
		if (apiconfighandlerlinkEClass == null) {
			apiconfighandlerlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(55);
		}
		return apiconfighandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApiconfighandlerlink__SourceConstraint__DiagnosticChain_Map() {
        return getApiconfighandlerlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApiconfighandlerlink__TargetConstraint__DiagnosticChain_Map() {
        return getApiconfighandlerlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointsapiservicelink() {
		if (endpointsapiservicelinkEClass == null) {
			endpointsapiservicelinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(56);
		}
		return endpointsapiservicelinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpointsapiservicelink__SourceConstraint__DiagnosticChain_Map() {
        return getEndpointsapiservicelink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEndpointsapiservicelink__TargetConstraint__DiagnosticChain_Map() {
        return getEndpointsapiservicelink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentlink() {
		if (deploymentlinkEClass == null) {
			deploymentlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(57);
		}
		return deploymentlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentlink__SourceConstraint__DiagnosticChain_Map() {
        return getDeploymentlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentlink__TargetConstraint__DiagnosticChain_Map() {
        return getDeploymentlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceslink() {
		if (resourceslinkEClass == null) {
			resourceslinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(58);
		}
		return resourceslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceslink__SourceConstraint__DiagnosticChain_Map() {
        return getResourceslink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceslink__TargetConstraint__DiagnosticChain_Map() {
        return getResourceslink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicscalinglink() {
		if (basicscalinglinkEClass == null) {
			basicscalinglinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(59);
		}
		return basicscalinglinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasicscalinglink__SourceConstraint__DiagnosticChain_Map() {
        return getBasicscalinglink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasicscalinglink__TargetConstraint__DiagnosticChain_Map() {
        return getBasicscalinglink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivenesschecklink() {
		if (livenesschecklinkEClass == null) {
			livenesschecklinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(60);
		}
		return livenesschecklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLivenesschecklink__SourceConstraint__DiagnosticChain_Map() {
        return getLivenesschecklink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLivenesschecklink__TargetConstraint__DiagnosticChain_Map() {
        return getLivenesschecklink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworklink() {
		if (networklinkEClass == null) {
			networklinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(61);
		}
		return networklinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworklink__SourceConstraint__DiagnosticChain_Map() {
        return getNetworklink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworklink__TargetConstraint__DiagnosticChain_Map() {
        return getNetworklink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		if (versionEClass == null) {
			versionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(62);
		}
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Env() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Handlers() {
        return (EReference)getVersion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_DiskUsageBytes() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Threadsafe() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Name() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Vm() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_VersionUrl() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_InstanceClass() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_ServingStatus() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_RuntimeApiVersion() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_CreateTime() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_InboundServices() {
        return (EReference)getVersion().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_ErrorHandlers() {
        return (EReference)getVersion().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_DefaultExpiration() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Libraries() {
        return (EReference)getVersion().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_NobuildFilesRegex() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Runtime() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_CreatedBy() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_EnvVariables() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_BetaSettings() {
        return (EAttribute)getVersion().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Delete__String_String_String() {
        return getVersion().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__List__Integer_String_String_String_String() {
        return getVersion().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Get__String_String_String_String() {
        return getVersion().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Patch__String_String_String_String() {
        return getVersion().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVersion__Create__String_String() {
        return getVersion().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepairapplicationrequest() {
		if (repairapplicationrequestEClass == null) {
			repairapplicationrequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(63);
		}
		return repairapplicationrequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificaterawdata() {
		if (certificaterawdataEClass == null) {
			certificaterawdataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(64);
		}
		return certificaterawdataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificaterawdata_PublicCertificate() {
        return (EAttribute)getCertificaterawdata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCertificaterawdata_PrivateKey() {
        return (EAttribute)getCertificaterawdata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileinfo() {
		if (fileinfoEClass == null) {
			fileinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(65);
		}
		return fileinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileinfo_SourceUrl() {
        return (EAttribute)getFileinfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileinfo_Sha1Sum() {
        return (EAttribute)getFileinfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileinfo_MimeType() {
        return (EAttribute)getFileinfo().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripthandler() {
		if (scripthandlerEClass == null) {
			scripthandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(66);
		}
		return scripthandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScripthandler_ScriptPath() {
        return (EAttribute)getScripthandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadataexperimental() {
		if (operationmetadataexperimentalEClass == null) {
			operationmetadataexperimentalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(67);
		}
		return operationmetadataexperimentalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_User() {
        return (EAttribute)getOperationmetadataexperimental().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_Target() {
        return (EAttribute)getOperationmetadataexperimental().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_Method() {
        return (EAttribute)getOperationmetadataexperimental().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_InsertTime() {
        return (EAttribute)getOperationmetadataexperimental().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadataexperimental_EndTime() {
        return (EAttribute)getOperationmetadataexperimental().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizeddomain() {
		if (authorizeddomainEClass == null) {
			authorizeddomainEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(68);
		}
		return authorizeddomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizeddomain_Name() {
        return (EAttribute)getAuthorizeddomain().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizeddomain__List__String_String_Integer() {
        return getAuthorizeddomain().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrafficsplit() {
		if (trafficsplitEClass == null) {
			trafficsplitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(69);
		}
		return trafficsplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficsplit_ShardBy() {
        return (EAttribute)getTrafficsplit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrafficsplit_Allocations() {
        return (EAttribute)getTrafficsplit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1beta() {
		if (operationmetadatav1betaEClass == null) {
			operationmetadatav1betaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(70);
		}
		return operationmetadatav1betaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_User() {
        return (EAttribute)getOperationmetadatav1beta().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_Target() {
        return (EAttribute)getOperationmetadatav1beta().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_EphemeralMessage() {
        return (EAttribute)getOperationmetadatav1beta().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_Method() {
        return (EAttribute)getOperationmetadatav1beta().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_EndTime() {
        return (EAttribute)getOperationmetadatav1beta().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationmetadatav1beta_Warning() {
        return (EReference)getOperationmetadatav1beta().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1beta_InsertTime() {
        return (EAttribute)getOperationmetadatav1beta().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListservicesresponse() {
		if (listservicesresponseEClass == null) {
			listservicesresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(71);
		}
		return listservicesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListservicesresponse_Services() {
        return (EReference)getListservicesresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListservicesresponse_NextPageToken() {
        return (EAttribute)getListservicesresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListingressrulesresponse() {
		if (listingressrulesresponseEClass == null) {
			listingressrulesresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(72);
		}
		return listingressrulesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListingressrulesresponse_NextPageToken() {
        return (EAttribute)getListingressrulesresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListingressrulesresponse_IngressRules() {
        return (EReference)getListingressrulesresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResources() {
		if (resourcesEClass == null) {
			resourcesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(73);
		}
		return resourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResources_Volumes() {
        return (EReference)getResources().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_DiskGb() {
        return (EAttribute)getResources().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_Cpu() {
        return (EAttribute)getResources().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResources_MemoryGb() {
        return (EAttribute)getResources().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZipinfolink() {
		if (zipinfolinkEClass == null) {
			zipinfolinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(74);
		}
		return zipinfolinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZipinfolink__SourceConstraint__DiagnosticChain_Map() {
        return getZipinfolink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZipinfolink__TargetConstraint__DiagnosticChain_Map() {
        return getZipinfolink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerinfolink() {
		if (containerinfolinkEClass == null) {
			containerinfolinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(75);
		}
		return containerinfolinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainerinfolink__SourceConstraint__DiagnosticChain_Map() {
        return getContainerinfolink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContainerinfolink__TargetConstraint__DiagnosticChain_Map() {
        return getContainerinfolink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		if (deploymentEClass == null) {
			deploymentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(76);
		}
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_Files() {
        return (EAttribute)getDeployment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatchupdateingressrulesresponse() {
		if (batchupdateingressrulesresponseEClass == null) {
			batchupdateingressrulesresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(77);
		}
		return batchupdateingressrulesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBatchupdateingressrulesresponse_IngressRules() {
        return (EReference)getBatchupdateingressrulesresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		if (volumeEClass == null) {
			volumeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(78);
		}
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_VolumeType() {
        return (EAttribute)getVolume().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_SizeGb() {
        return (EAttribute)getVolume().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Name() {
        return (EAttribute)getVolume().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListinstancesresponse() {
		if (listinstancesresponseEClass == null) {
			listinstancesresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(79);
		}
		return listinstancesresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListinstancesresponse_Instances() {
        return (EReference)getListinstancesresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListinstancesresponse_NextPageToken() {
        return (EAttribute)getListinstancesresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListdomainmappingsresponse() {
		if (listdomainmappingsresponseEClass == null) {
			listdomainmappingsresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(80);
		}
		return listdomainmappingsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListdomainmappingsresponse_NextPageToken() {
        return (EAttribute)getListdomainmappingsresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListdomainmappingsresponse_DomainMappings() {
        return (EReference)getListdomainmappingsresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationmetadatav1alpha() {
		if (operationmetadatav1alphaEClass == null) {
			operationmetadatav1alphaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(81);
		}
		return operationmetadatav1alphaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_EndTime() {
        return (EAttribute)getOperationmetadatav1alpha().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationmetadatav1alpha_Warning() {
        return (EReference)getOperationmetadatav1alpha().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_InsertTime() {
        return (EAttribute)getOperationmetadatav1alpha().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_User() {
        return (EAttribute)getOperationmetadatav1alpha().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_Target() {
        return (EAttribute)getOperationmetadatav1alpha().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_EphemeralMessage() {
        return (EAttribute)getOperationmetadatav1alpha().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationmetadatav1alpha_Method() {
        return (EAttribute)getOperationmetadatav1alpha().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrldispatchrule() {
		if (urldispatchruleEClass == null) {
			urldispatchruleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(82);
		}
		return urldispatchruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrldispatchrule_Domain() {
        return (EAttribute)getUrldispatchrule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrldispatchrule_Service() {
        return (EAttribute)getUrldispatchrule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrldispatchrule_Path() {
        return (EAttribute)getUrldispatchrule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListversionsresponse() {
		if (listversionsresponseEClass == null) {
			listversionsresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(83);
		}
		return listversionsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListversionsresponse_NextPageToken() {
        return (EAttribute)getListversionsresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListversionsresponse_Versions() {
        return (EReference)getListversionsresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListauthorizeddomainsresponse() {
		if (listauthorizeddomainsresponseEClass == null) {
			listauthorizeddomainsresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(84);
		}
		return listauthorizeddomainsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListauthorizeddomainsresponse_Domains() {
        return (EReference)getListauthorizeddomainsresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListauthorizeddomainsresponse_NextPageToken() {
        return (EAttribute)getListauthorizeddomainsresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpty() {
		if (emptyEClass == null) {
			emptyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(85);
		}
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiendpointhandler() {
		if (apiendpointhandlerEClass == null) {
			apiendpointhandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(86);
		}
		return apiendpointhandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiendpointhandler_ScriptPath() {
        return (EAttribute)getApiendpointhandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSslsettingslink() {
		if (sslsettingslinkEClass == null) {
			sslsettingslinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(87);
		}
		return sslsettingslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSslsettingslink__SourceConstraint__DiagnosticChain_Map() {
        return getSslsettingslink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSslsettingslink__TargetConstraint__DiagnosticChain_Map() {
        return getSslsettingslink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainmapping() {
		if (domainmappingEClass == null) {
			domainmappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(88);
		}
		return domainmappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainmapping_ResourceRecords() {
        return (EReference)getDomainmapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainmapping_Name() {
        return (EAttribute)getDomainmapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Delete__String_String() {
        return getDomainmapping().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__List__String_String_Integer() {
        return getDomainmapping().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Get__String_String() {
        return getDomainmapping().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Patch__String_String_String() {
        return getDomainmapping().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDomainmapping__Create__String() {
        return getDomainmapping().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestutilizationlink() {
		if (requestutilizationlinkEClass == null) {
			requestutilizationlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(89);
		}
		return requestutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequestutilizationlink__SourceConstraint__DiagnosticChain_Map() {
        return getRequestutilizationlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRequestutilizationlink__TargetConstraint__DiagnosticChain_Map() {
        return getRequestutilizationlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkutilizationlink() {
		if (networkutilizationlinkEClass == null) {
			networkutilizationlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(90);
		}
		return networkutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworkutilizationlink__SourceConstraint__DiagnosticChain_Map() {
        return getNetworkutilizationlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworkutilizationlink__TargetConstraint__DiagnosticChain_Map() {
        return getNetworkutilizationlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuutilizationlink() {
		if (cpuutilizationlinkEClass == null) {
			cpuutilizationlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(91);
		}
		return cpuutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpuutilizationlink__SourceConstraint__DiagnosticChain_Map() {
        return getCpuutilizationlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpuutilizationlink__TargetConstraint__DiagnosticChain_Map() {
        return getCpuutilizationlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiskutilizationlink() {
		if (diskutilizationlinkEClass == null) {
			diskutilizationlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(92);
		}
		return diskutilizationlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiskutilizationlink__SourceConstraint__DiagnosticChain_Map() {
        return getDiskutilizationlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiskutilizationlink__TargetConstraint__DiagnosticChain_Map() {
        return getDiskutilizationlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticscaling() {
		if (automaticscalingEClass == null) {
			automaticscalingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(93);
		}
		return automaticscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MinPendingLatency() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxIdleInstances() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MinIdleInstances() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxTotalInstances() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MinTotalInstances() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxConcurrentRequests() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_CoolDownPeriod() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticscaling_MaxPendingLatency() {
        return (EAttribute)getAutomaticscaling().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZipinfo() {
		if (zipinfoEClass == null) {
			zipinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(94);
		}
		return zipinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZipinfo_SourceUrl() {
        return (EAttribute)getZipinfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZipinfo_FilesCount() {
        return (EAttribute)getZipinfo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCertificaterawdatalink() {
		if (certificaterawdatalinkEClass == null) {
			certificaterawdatalinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(95);
		}
		return certificaterawdatalinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCertificaterawdatalink__SourceConstraint__DiagnosticChain_Map() {
        return getCertificaterawdatalink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCertificaterawdatalink__TargetConstraint__DiagnosticChain_Map() {
        return getCertificaterawdatalink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizedcertificate() {
		if (authorizedcertificateEClass == null) {
			authorizedcertificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(96);
		}
		return authorizedcertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_DomainMappingsCount() {
        return (EAttribute)getAuthorizedcertificate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizedcertificate_DomainNames() {
        return (EReference)getAuthorizedcertificate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_DisplayName() {
        return (EAttribute)getAuthorizedcertificate().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizedcertificate_VisibleDomainMappings() {
        return (EReference)getAuthorizedcertificate().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_ExpireTime() {
        return (EAttribute)getAuthorizedcertificate().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizedcertificate_Name() {
        return (EAttribute)getAuthorizedcertificate().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Delete__String_String() {
        return getAuthorizedcertificate().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__List__String_String_Integer_String() {
        return getAuthorizedcertificate().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Get__String_String_String() {
        return getAuthorizedcertificate().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Patch__String_String_String() {
        return getAuthorizedcertificate().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAuthorizedcertificate__Create__String() {
        return getAuthorizedcertificate().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcerecord() {
		if (resourcerecordEClass == null) {
			resourcerecordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(97);
		}
		return resourcerecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerecord_Type() {
        return (EAttribute)getResourcerecord().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerecord_Rrdata() {
        return (EAttribute)getResourcerecord().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcerecord_Name() {
        return (EAttribute)getResourcerecord().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		if (libraryEClass == null) {
			libraryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(98);
		}
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_Version() {
        return (EAttribute)getLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLibrary_Name() {
        return (EAttribute)getLibrary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListlocationsresponse() {
		if (listlocationsresponseEClass == null) {
			listlocationsresponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(99);
		}
		return listlocationsresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListlocationsresponse_NextPageToken() {
        return (EAttribute)getListlocationsresponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListlocationsresponse_Locations() {
        return (EReference)getListlocationsresponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerinfo() {
		if (containerinfoEClass == null) {
			containerinfoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(100);
		}
		return containerinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerinfo_Image() {
        return (EAttribute)getContainerinfo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestutilization() {
		if (requestutilizationEClass == null) {
			requestutilizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(101);
		}
		return requestutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestutilization_TargetRequestCountPerSecond() {
        return (EAttribute)getRequestutilization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestutilization_TargetConcurrentRequests() {
        return (EAttribute)getRequestutilization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiendpointhandlerlink() {
		if (apiendpointhandlerlinkEClass == null) {
			apiendpointhandlerlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(102);
		}
		return apiendpointhandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApiendpointhandlerlink__SourceConstraint__DiagnosticChain_Map() {
        return getApiendpointhandlerlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApiendpointhandlerlink__TargetConstraint__DiagnosticChain_Map() {
        return getApiendpointhandlerlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticfileshandlerlink() {
		if (staticfileshandlerlinkEClass == null) {
			staticfileshandlerlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(103);
		}
		return staticfileshandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaticfileshandlerlink__SourceConstraint__DiagnosticChain_Map() {
        return getStaticfileshandlerlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStaticfileshandlerlink__TargetConstraint__DiagnosticChain_Map() {
        return getStaticfileshandlerlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScripthandlerlink() {
		if (scripthandlerlinkEClass == null) {
			scripthandlerlinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(104);
		}
		return scripthandlerlinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScripthandlerlink__SourceConstraint__DiagnosticChain_Map() {
        return getScripthandlerlink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScripthandlerlink__TargetConstraint__DiagnosticChain_Map() {
        return getScripthandlerlink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlmap() {
		if (urlmapEClass == null) {
			urlmapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(105);
		}
		return urlmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_RedirectHttpResponseCode() {
        return (EAttribute)getUrlmap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_SecurityLevel() {
        return (EAttribute)getUrlmap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_AuthFailAction() {
        return (EAttribute)getUrlmap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_UrlRegex() {
        return (EAttribute)getUrlmap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlmap_Login() {
        return (EAttribute)getUrlmap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointsapiservice() {
		if (endpointsapiserviceEClass == null) {
			endpointsapiserviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(106);
		}
		return endpointsapiserviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointsapiservice_Name() {
        return (EAttribute)getEndpointsapiservice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointsapiservice_ConfigId() {
        return (EAttribute)getEndpointsapiservice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatuslink() {
		if (statuslinkEClass == null) {
			statuslinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(107);
		}
		return statuslinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatuslink__SourceConstraint__DiagnosticChain_Map() {
        return getStatuslink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStatuslink__TargetConstraint__DiagnosticChain_Map() {
        return getStatuslink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		if (operationEClass == null) {
			operationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(108);
		}
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Response() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Metadata() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Done() {
        return (EAttribute)getOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__List__String_String_String_Integer() {
        return getOperation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Get__String_String() {
        return getOperation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApiconfighandler() {
		if (apiconfighandlerEClass == null) {
			apiconfighandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(109);
		}
		return apiconfighandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_SecurityLevel() {
        return (EAttribute)getApiconfighandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_AuthFailAction() {
        return (EAttribute)getApiconfighandler().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_Script() {
        return (EAttribute)getApiconfighandler().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_Login() {
        return (EAttribute)getApiconfighandler().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApiconfighandler_Url() {
        return (EAttribute)getApiconfighandler().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticfileshandler() {
		if (staticfileshandlerEClass == null) {
			staticfileshandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(110);
		}
		return staticfileshandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_ApplicationReadable() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_HttpHeaders() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_UploadPathRegex() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_Path() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_MimeType() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_RequireMatchingFile() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticfileshandler_Expiration() {
        return (EAttribute)getStaticfileshandler().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicscaling() {
		if (basicscalingEClass == null) {
			basicscalingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(111);
		}
		return basicscalingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicscaling_MaxInstances() {
        return (EAttribute)getBasicscaling().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicscaling_IdleTimeout() {
        return (EAttribute)getBasicscaling().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiskutilization() {
		if (diskutilizationEClass == null) {
			diskutilizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(112);
		}
		return diskutilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetWriteBytesPerSecond() {
        return (EAttribute)getDiskutilization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetReadBytesPerSecond() {
        return (EAttribute)getDiskutilization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetReadOpsPerSecond() {
        return (EAttribute)getDiskutilization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskutilization_TargetWriteOpsPerSecond() {
        return (EAttribute)getDiskutilization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAction() {
		if (actionEEnum == null) {
			actionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(9);
		}
		return actionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getErrorcode() {
		if (errorcodeEEnum == null) {
			errorcodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(10);
		}
		return errorcodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServingstatus() {
		if (servingstatusEEnum == null) {
			servingstatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(11);
		}
		return servingstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAvailability() {
		if (availabilityEEnum == null) {
			availabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(12);
		}
		return availabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionServingstatus() {
		if (versionServingstatusEEnum == null) {
			versionServingstatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(13);
		}
		return versionServingstatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShardby() {
		if (shardbyEEnum == null) {
			shardbyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(14);
		}
		return shardbyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		if (typeEEnum == null) {
			typeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(15);
		}
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRedirecthttpresponsecode() {
		if (redirecthttpresponsecodeEEnum == null) {
			redirecthttpresponsecodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(16);
		}
		return redirecthttpresponsecodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecuritylevel() {
		if (securitylevelEEnum == null) {
			securitylevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(17);
		}
		return securitylevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthfailaction() {
		if (authfailactionEEnum == null) {
			authfailactionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(18);
		}
		return authfailactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogin() {
		if (loginEEnum == null) {
			loginEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(19);
		}
		return loginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiConfigHandlerSecuritylevel() {
		if (apiConfigHandlerSecuritylevelEEnum == null) {
			apiConfigHandlerSecuritylevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(20);
		}
		return apiConfigHandlerSecuritylevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiConfigHandlerAuthfailaction() {
		if (apiConfigHandlerAuthfailactionEEnum == null) {
			apiConfigHandlerAuthfailactionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(21);
		}
		return apiConfigHandlerAuthfailactionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApiConfigHandlerLogin() {
		if (apiConfigHandlerLoginEEnum == null) {
			apiConfigHandlerLoginEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(22);
		}
		return apiConfigHandlerLoginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getbyte() {
		if (byteEDataType == null) {
			byteEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(0);
		}
		return byteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		if (doubleEDataType == null) {
			doubleEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(1);
		}
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getfloat() {
		if (floatEDataType == null) {
			floatEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(2);
		}
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getany() {
		if (anyEDataType == null) {
			anyEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(3);
		}
		return anyEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getlong() {
		if (longEDataType == null) {
			longEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(4);
		}
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getshort() {
		if (shortEDataType == null) {
			shortEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(6);
		}
		return shortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getmap() {
		if (mapEDataType == null) {
			mapEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(7);
		}
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getobject() {
		if (objectEDataType == null) {
			objectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AppenginePackage.eNS_URI).getEClassifiers().get(8);
		}
		return objectEDataType;
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
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("appengine." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //AppenginePackageImpl
