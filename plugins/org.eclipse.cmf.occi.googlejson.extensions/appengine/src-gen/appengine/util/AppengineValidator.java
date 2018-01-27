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

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see appengine.AppenginePackage
 * @generated
 */
public class AppengineValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AppengineValidator INSTANCE = new AppengineValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "appengine";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Trafficsplitlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRAFFICSPLITLINK__SOURCE_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Trafficsplitlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRAFFICSPLITLINK__TARGET_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Featuresettingslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURESETTINGSLINK__SOURCE_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Featuresettingslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURESETTINGSLINK__TARGET_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Identityawareproxylink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDENTITYAWAREPROXYLINK__SOURCE_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Identityawareproxylink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IDENTITYAWAREPROXYLINK__TARGET_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Automaticscalinglink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOMATICSCALINGLINK__SOURCE_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Automaticscalinglink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTOMATICSCALINGLINK__TARGET_CONSTRAINT = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Healthchecklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCHECKLINK__SOURCE_CONSTRAINT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Healthchecklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HEALTHCHECKLINK__TARGET_CONSTRAINT = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Readinesschecklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READINESSCHECKLINK__SOURCE_CONSTRAINT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Readinesschecklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int READINESSCHECKLINK__TARGET_CONSTRAINT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Manualscalinglink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUALSCALINGLINK__SOURCE_CONSTRAINT = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Manualscalinglink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MANUALSCALINGLINK__TARGET_CONSTRAINT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Apiconfighandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APICONFIGHANDLERLINK__SOURCE_CONSTRAINT = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Apiconfighandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APICONFIGHANDLERLINK__TARGET_CONSTRAINT = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Endpointsapiservicelink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENDPOINTSAPISERVICELINK__SOURCE_CONSTRAINT = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Endpointsapiservicelink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENDPOINTSAPISERVICELINK__TARGET_CONSTRAINT = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Deploymentlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPLOYMENTLINK__SOURCE_CONSTRAINT = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Deploymentlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPLOYMENTLINK__TARGET_CONSTRAINT = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Resourceslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCESLINK__SOURCE_CONSTRAINT = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Resourceslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCESLINK__TARGET_CONSTRAINT = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Basicscalinglink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BASICSCALINGLINK__SOURCE_CONSTRAINT = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Basicscalinglink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BASICSCALINGLINK__TARGET_CONSTRAINT = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Livenesschecklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIVENESSCHECKLINK__SOURCE_CONSTRAINT = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Livenesschecklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LIVENESSCHECKLINK__TARGET_CONSTRAINT = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Networklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKLINK__SOURCE_CONSTRAINT = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Networklink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKLINK__TARGET_CONSTRAINT = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Zipinfolink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZIPINFOLINK__SOURCE_CONSTRAINT = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Zipinfolink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ZIPINFOLINK__TARGET_CONSTRAINT = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Containerinfolink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTAINERINFOLINK__SOURCE_CONSTRAINT = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Containerinfolink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTAINERINFOLINK__TARGET_CONSTRAINT = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Sslsettingslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SSLSETTINGSLINK__SOURCE_CONSTRAINT = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Sslsettingslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SSLSETTINGSLINK__TARGET_CONSTRAINT = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Requestutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUESTUTILIZATIONLINK__SOURCE_CONSTRAINT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Requestutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REQUESTUTILIZATIONLINK__TARGET_CONSTRAINT = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Networkutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKUTILIZATIONLINK__SOURCE_CONSTRAINT = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Networkutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int NETWORKUTILIZATIONLINK__TARGET_CONSTRAINT = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Cpuutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPUUTILIZATIONLINK__SOURCE_CONSTRAINT = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Cpuutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CPUUTILIZATIONLINK__TARGET_CONSTRAINT = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Diskutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISKUTILIZATIONLINK__SOURCE_CONSTRAINT = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Diskutilizationlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DISKUTILIZATIONLINK__TARGET_CONSTRAINT = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Certificaterawdatalink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATERAWDATALINK__SOURCE_CONSTRAINT = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Certificaterawdatalink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CERTIFICATERAWDATALINK__TARGET_CONSTRAINT = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Apiendpointhandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APIENDPOINTHANDLERLINK__SOURCE_CONSTRAINT = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Apiendpointhandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int APIENDPOINTHANDLERLINK__TARGET_CONSTRAINT = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Staticfileshandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATICFILESHANDLERLINK__SOURCE_CONSTRAINT = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Staticfileshandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATICFILESHANDLERLINK__TARGET_CONSTRAINT = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Scripthandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCRIPTHANDLERLINK__SOURCE_CONSTRAINT = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Scripthandlerlink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCRIPTHANDLERLINK__TARGET_CONSTRAINT = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Source Constraint' of 'Statuslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUSLINK__SOURCE_CONSTRAINT = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Statuslink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUSLINK__TARGET_CONSTRAINT = 52;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 52;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppengineValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AppenginePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AppenginePackage.ARRAY:
				return validatearray((array)value, diagnostics, context);
			case AppenginePackage.CPUUTILIZATION:
				return validateCpuutilization((Cpuutilization)value, diagnostics, context);
			case AppenginePackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case AppenginePackage.IDENTITYAWAREPROXY:
				return validateIdentityawareproxy((Identityawareproxy)value, diagnostics, context);
			case AppenginePackage.MANUALSCALING:
				return validateManualscaling((Manualscaling)value, diagnostics, context);
			case AppenginePackage.LOCATIONMETADATA:
				return validateLocationmetadata((Locationmetadata)value, diagnostics, context);
			case AppenginePackage.TRAFFICSPLITLINK:
				return validateTrafficsplitlink((Trafficsplitlink)value, diagnostics, context);
			case AppenginePackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case AppenginePackage.LISTOPERATIONSRESPONSE:
				return validateListoperationsresponse((Listoperationsresponse)value, diagnostics, context);
			case AppenginePackage.OPERATIONMETADATA:
				return validateOperationmetadata((Operationmetadata)value, diagnostics, context);
			case AppenginePackage.FIREWALLRULE:
				return validateFirewallrule((Firewallrule)value, diagnostics, context);
			case AppenginePackage.LISTAUTHORIZEDCERTIFICATESRESPONSE:
				return validateListauthorizedcertificatesresponse((Listauthorizedcertificatesresponse)value, diagnostics, context);
			case AppenginePackage.FEATURESETTINGS:
				return validateFeaturesettings((Featuresettings)value, diagnostics, context);
			case AppenginePackage.ERRORHANDLER:
				return validateErrorhandler((Errorhandler)value, diagnostics, context);
			case AppenginePackage.SSLSETTINGS:
				return validateSslsettings((Sslsettings)value, diagnostics, context);
			case AppenginePackage.OPERATIONMETADATAV1:
				return validateOperationmetadatav1((Operationmetadatav1)value, diagnostics, context);
			case AppenginePackage.FEATURESETTINGSLINK:
				return validateFeaturesettingslink((Featuresettingslink)value, diagnostics, context);
			case AppenginePackage.IDENTITYAWAREPROXYLINK:
				return validateIdentityawareproxylink((Identityawareproxylink)value, diagnostics, context);
			case AppenginePackage.APPLICATION:
				return validateApplication((Application)value, diagnostics, context);
			case AppenginePackage.NETWORK:
				return validateNetwork((Network)value, diagnostics, context);
			case AppenginePackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case AppenginePackage.LIVENESSCHECK:
				return validateLivenesscheck((Livenesscheck)value, diagnostics, context);
			case AppenginePackage.BATCHUPDATEINGRESSRULESREQUEST:
				return validateBatchupdateingressrulesrequest((Batchupdateingressrulesrequest)value, diagnostics, context);
			case AppenginePackage.NETWORKUTILIZATION:
				return validateNetworkutilization((Networkutilization)value, diagnostics, context);
			case AppenginePackage.LOCATION:
				return validateLocation((Location)value, diagnostics, context);
			case AppenginePackage.HEALTHCHECK:
				return validateHealthcheck((Healthcheck)value, diagnostics, context);
			case AppenginePackage.READINESSCHECK:
				return validateReadinesscheck((Readinesscheck)value, diagnostics, context);
			case AppenginePackage.DEBUGINSTANCEREQUEST:
				return validateDebuginstancerequest((Debuginstancerequest)value, diagnostics, context);
			case AppenginePackage.OPERATIONMETADATAV1BETA5:
				return validateOperationmetadatav1beta5((Operationmetadatav1beta5)value, diagnostics, context);
			case AppenginePackage.AUTOMATICSCALINGLINK:
				return validateAutomaticscalinglink((Automaticscalinglink)value, diagnostics, context);
			case AppenginePackage.HEALTHCHECKLINK:
				return validateHealthchecklink((Healthchecklink)value, diagnostics, context);
			case AppenginePackage.READINESSCHECKLINK:
				return validateReadinesschecklink((Readinesschecklink)value, diagnostics, context);
			case AppenginePackage.MANUALSCALINGLINK:
				return validateManualscalinglink((Manualscalinglink)value, diagnostics, context);
			case AppenginePackage.APICONFIGHANDLERLINK:
				return validateApiconfighandlerlink((Apiconfighandlerlink)value, diagnostics, context);
			case AppenginePackage.ENDPOINTSAPISERVICELINK:
				return validateEndpointsapiservicelink((Endpointsapiservicelink)value, diagnostics, context);
			case AppenginePackage.DEPLOYMENTLINK:
				return validateDeploymentlink((Deploymentlink)value, diagnostics, context);
			case AppenginePackage.RESOURCESLINK:
				return validateResourceslink((Resourceslink)value, diagnostics, context);
			case AppenginePackage.BASICSCALINGLINK:
				return validateBasicscalinglink((Basicscalinglink)value, diagnostics, context);
			case AppenginePackage.LIVENESSCHECKLINK:
				return validateLivenesschecklink((Livenesschecklink)value, diagnostics, context);
			case AppenginePackage.NETWORKLINK:
				return validateNetworklink((Networklink)value, diagnostics, context);
			case AppenginePackage.VERSION:
				return validateVersion((Version)value, diagnostics, context);
			case AppenginePackage.REPAIRAPPLICATIONREQUEST:
				return validateRepairapplicationrequest((Repairapplicationrequest)value, diagnostics, context);
			case AppenginePackage.CERTIFICATERAWDATA:
				return validateCertificaterawdata((Certificaterawdata)value, diagnostics, context);
			case AppenginePackage.FILEINFO:
				return validateFileinfo((Fileinfo)value, diagnostics, context);
			case AppenginePackage.SCRIPTHANDLER:
				return validateScripthandler((Scripthandler)value, diagnostics, context);
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL:
				return validateOperationmetadataexperimental((Operationmetadataexperimental)value, diagnostics, context);
			case AppenginePackage.AUTHORIZEDDOMAIN:
				return validateAuthorizeddomain((Authorizeddomain)value, diagnostics, context);
			case AppenginePackage.TRAFFICSPLIT:
				return validateTrafficsplit((Trafficsplit)value, diagnostics, context);
			case AppenginePackage.OPERATIONMETADATAV1BETA:
				return validateOperationmetadatav1beta((Operationmetadatav1beta)value, diagnostics, context);
			case AppenginePackage.LISTSERVICESRESPONSE:
				return validateListservicesresponse((Listservicesresponse)value, diagnostics, context);
			case AppenginePackage.LISTINGRESSRULESRESPONSE:
				return validateListingressrulesresponse((Listingressrulesresponse)value, diagnostics, context);
			case AppenginePackage.RESOURCES:
				return validateResources((Resources)value, diagnostics, context);
			case AppenginePackage.ZIPINFOLINK:
				return validateZipinfolink((Zipinfolink)value, diagnostics, context);
			case AppenginePackage.CONTAINERINFOLINK:
				return validateContainerinfolink((Containerinfolink)value, diagnostics, context);
			case AppenginePackage.DEPLOYMENT:
				return validateDeployment((Deployment)value, diagnostics, context);
			case AppenginePackage.BATCHUPDATEINGRESSRULESRESPONSE:
				return validateBatchupdateingressrulesresponse((Batchupdateingressrulesresponse)value, diagnostics, context);
			case AppenginePackage.VOLUME:
				return validateVolume((Volume)value, diagnostics, context);
			case AppenginePackage.LISTINSTANCESRESPONSE:
				return validateListinstancesresponse((Listinstancesresponse)value, diagnostics, context);
			case AppenginePackage.LISTDOMAINMAPPINGSRESPONSE:
				return validateListdomainmappingsresponse((Listdomainmappingsresponse)value, diagnostics, context);
			case AppenginePackage.OPERATIONMETADATAV1ALPHA:
				return validateOperationmetadatav1alpha((Operationmetadatav1alpha)value, diagnostics, context);
			case AppenginePackage.URLDISPATCHRULE:
				return validateUrldispatchrule((Urldispatchrule)value, diagnostics, context);
			case AppenginePackage.LISTVERSIONSRESPONSE:
				return validateListversionsresponse((Listversionsresponse)value, diagnostics, context);
			case AppenginePackage.LISTAUTHORIZEDDOMAINSRESPONSE:
				return validateListauthorizeddomainsresponse((Listauthorizeddomainsresponse)value, diagnostics, context);
			case AppenginePackage.EMPTY:
				return validateEmpty((Empty)value, diagnostics, context);
			case AppenginePackage.APIENDPOINTHANDLER:
				return validateApiendpointhandler((Apiendpointhandler)value, diagnostics, context);
			case AppenginePackage.SSLSETTINGSLINK:
				return validateSslsettingslink((Sslsettingslink)value, diagnostics, context);
			case AppenginePackage.DOMAINMAPPING:
				return validateDomainmapping((Domainmapping)value, diagnostics, context);
			case AppenginePackage.REQUESTUTILIZATIONLINK:
				return validateRequestutilizationlink((Requestutilizationlink)value, diagnostics, context);
			case AppenginePackage.NETWORKUTILIZATIONLINK:
				return validateNetworkutilizationlink((Networkutilizationlink)value, diagnostics, context);
			case AppenginePackage.CPUUTILIZATIONLINK:
				return validateCpuutilizationlink((Cpuutilizationlink)value, diagnostics, context);
			case AppenginePackage.DISKUTILIZATIONLINK:
				return validateDiskutilizationlink((Diskutilizationlink)value, diagnostics, context);
			case AppenginePackage.AUTOMATICSCALING:
				return validateAutomaticscaling((Automaticscaling)value, diagnostics, context);
			case AppenginePackage.ZIPINFO:
				return validateZipinfo((Zipinfo)value, diagnostics, context);
			case AppenginePackage.CERTIFICATERAWDATALINK:
				return validateCertificaterawdatalink((Certificaterawdatalink)value, diagnostics, context);
			case AppenginePackage.AUTHORIZEDCERTIFICATE:
				return validateAuthorizedcertificate((Authorizedcertificate)value, diagnostics, context);
			case AppenginePackage.RESOURCERECORD:
				return validateResourcerecord((Resourcerecord)value, diagnostics, context);
			case AppenginePackage.LIBRARY:
				return validateLibrary((Library)value, diagnostics, context);
			case AppenginePackage.LISTLOCATIONSRESPONSE:
				return validateListlocationsresponse((Listlocationsresponse)value, diagnostics, context);
			case AppenginePackage.CONTAINERINFO:
				return validateContainerinfo((Containerinfo)value, diagnostics, context);
			case AppenginePackage.REQUESTUTILIZATION:
				return validateRequestutilization((Requestutilization)value, diagnostics, context);
			case AppenginePackage.APIENDPOINTHANDLERLINK:
				return validateApiendpointhandlerlink((Apiendpointhandlerlink)value, diagnostics, context);
			case AppenginePackage.STATICFILESHANDLERLINK:
				return validateStaticfileshandlerlink((Staticfileshandlerlink)value, diagnostics, context);
			case AppenginePackage.SCRIPTHANDLERLINK:
				return validateScripthandlerlink((Scripthandlerlink)value, diagnostics, context);
			case AppenginePackage.URLMAP:
				return validateUrlmap((Urlmap)value, diagnostics, context);
			case AppenginePackage.ENDPOINTSAPISERVICE:
				return validateEndpointsapiservice((Endpointsapiservice)value, diagnostics, context);
			case AppenginePackage.STATUSLINK:
				return validateStatuslink((Statuslink)value, diagnostics, context);
			case AppenginePackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case AppenginePackage.APICONFIGHANDLER:
				return validateApiconfighandler((Apiconfighandler)value, diagnostics, context);
			case AppenginePackage.STATICFILESHANDLER:
				return validateStaticfileshandler((Staticfileshandler)value, diagnostics, context);
			case AppenginePackage.BASICSCALING:
				return validateBasicscaling((Basicscaling)value, diagnostics, context);
			case AppenginePackage.DISKUTILIZATION:
				return validateDiskutilization((Diskutilization)value, diagnostics, context);
			case AppenginePackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case AppenginePackage.ERRORCODE:
				return validateErrorcode((Errorcode)value, diagnostics, context);
			case AppenginePackage.SERVINGSTATUS:
				return validateServingstatus((Servingstatus)value, diagnostics, context);
			case AppenginePackage.AVAILABILITY:
				return validateAvailability((Availability)value, diagnostics, context);
			case AppenginePackage.VERSION_SERVINGSTATUS:
				return validateVersionServingstatus((VersionServingstatus)value, diagnostics, context);
			case AppenginePackage.SHARDBY:
				return validateShardby((Shardby)value, diagnostics, context);
			case AppenginePackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case AppenginePackage.REDIRECTHTTPRESPONSECODE:
				return validateRedirecthttpresponsecode((Redirecthttpresponsecode)value, diagnostics, context);
			case AppenginePackage.SECURITYLEVEL:
				return validateSecuritylevel((Securitylevel)value, diagnostics, context);
			case AppenginePackage.AUTHFAILACTION:
				return validateAuthfailaction((Authfailaction)value, diagnostics, context);
			case AppenginePackage.LOGIN:
				return validateLogin((Login)value, diagnostics, context);
			case AppenginePackage.API_CONFIG_HANDLER_SECURITYLEVEL:
				return validateApiConfigHandlerSecuritylevel((ApiConfigHandlerSecuritylevel)value, diagnostics, context);
			case AppenginePackage.API_CONFIG_HANDLER_AUTHFAILACTION:
				return validateApiConfigHandlerAuthfailaction((ApiConfigHandlerAuthfailaction)value, diagnostics, context);
			case AppenginePackage.API_CONFIG_HANDLER_LOGIN:
				return validateApiConfigHandlerLogin((ApiConfigHandlerLogin)value, diagnostics, context);
			case AppenginePackage.BYTE:
				return validatebyte((Byte)value, diagnostics, context);
			case AppenginePackage.DOUBLE:
				return validatedouble((Double)value, diagnostics, context);
			case AppenginePackage.FLOAT:
				return validatefloat((Float)value, diagnostics, context);
			case AppenginePackage.ANY:
				return validateany(value, diagnostics, context);
			case AppenginePackage.LONG:
				return validatelong((Long)value, diagnostics, context);
			case AppenginePackage.SHORT:
				return validateshort((Short)value, diagnostics, context);
			case AppenginePackage.MAP:
				return validatemap((Map)value, diagnostics, context);
			case AppenginePackage.OBJECT:
				return validateobject(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatearray(array array, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(array, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuutilization(Cpuutilization cpuutilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpuutilization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(cpuutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(cpuutilization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(status, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(status, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(status, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(status, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(status, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(status, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(status, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityawareproxy(Identityawareproxy identityawareproxy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identityawareproxy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(identityawareproxy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(identityawareproxy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualscaling(Manualscaling manualscaling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualscaling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(manualscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(manualscaling, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationmetadata(Locationmetadata locationmetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(locationmetadata, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(locationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(locationmetadata, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrafficsplitlink(Trafficsplitlink trafficsplitlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trafficsplitlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrafficsplitlink_targetConstraint(trafficsplitlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrafficsplitlink_sourceConstraint(trafficsplitlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Trafficsplitlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrafficsplitlink_targetConstraint(Trafficsplitlink trafficsplitlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trafficsplitlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Trafficsplitlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrafficsplitlink_sourceConstraint(Trafficsplitlink trafficsplitlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return trafficsplitlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(service, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(service, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(service, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListoperationsresponse(Listoperationsresponse listoperationsresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listoperationsresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listoperationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listoperationsresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationmetadata(Operationmetadata operationmetadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationmetadata, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operationmetadata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operationmetadata, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFirewallrule(Firewallrule firewallrule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(firewallrule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(firewallrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(firewallrule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListauthorizedcertificatesresponse(Listauthorizedcertificatesresponse listauthorizedcertificatesresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listauthorizedcertificatesresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listauthorizedcertificatesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listauthorizedcertificatesresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturesettings(Featuresettings featuresettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featuresettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(featuresettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(featuresettings, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorhandler(Errorhandler errorhandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(errorhandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(errorhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(errorhandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSslsettings(Sslsettings sslsettings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sslsettings, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(sslsettings, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(sslsettings, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationmetadatav1(Operationmetadatav1 operationmetadatav1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationmetadatav1, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operationmetadatav1, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operationmetadatav1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturesettingslink(Featuresettingslink featuresettingslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featuresettingslink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeaturesettingslink_targetConstraint(featuresettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeaturesettingslink_sourceConstraint(featuresettingslink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Featuresettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturesettingslink_targetConstraint(Featuresettingslink featuresettingslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featuresettingslink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Featuresettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeaturesettingslink_sourceConstraint(Featuresettingslink featuresettingslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featuresettingslink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityawareproxylink(Identityawareproxylink identityawareproxylink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(identityawareproxylink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentityawareproxylink_targetConstraint(identityawareproxylink, diagnostics, context);
		if (result || diagnostics != null) result &= validateIdentityawareproxylink_sourceConstraint(identityawareproxylink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Identityawareproxylink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityawareproxylink_targetConstraint(Identityawareproxylink identityawareproxylink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return identityawareproxylink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Identityawareproxylink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityawareproxylink_sourceConstraint(Identityawareproxylink identityawareproxylink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return identityawareproxylink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplication(Application application, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(application, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(application, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(application, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetwork(Network network, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(network, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(network, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(network, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(instance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLivenesscheck(Livenesscheck livenesscheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(livenesscheck, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(livenesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(livenesscheck, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatchupdateingressrulesrequest(Batchupdateingressrulesrequest batchupdateingressrulesrequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(batchupdateingressrulesrequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(batchupdateingressrulesrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(batchupdateingressrulesrequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkutilization(Networkutilization networkutilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkutilization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(networkutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(networkutilization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocation(Location location, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(location, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(location, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(location, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(location, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(location, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(location, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(location, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(location, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthcheck(Healthcheck healthcheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthcheck, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(healthcheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(healthcheck, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadinesscheck(Readinesscheck readinesscheck, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readinesscheck, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(readinesscheck, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(readinesscheck, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebuginstancerequest(Debuginstancerequest debuginstancerequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(debuginstancerequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(debuginstancerequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(debuginstancerequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationmetadatav1beta5(Operationmetadatav1beta5 operationmetadatav1beta5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationmetadatav1beta5, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operationmetadatav1beta5, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operationmetadatav1beta5, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomaticscalinglink(Automaticscalinglink automaticscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(automaticscalinglink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validateAutomaticscalinglink_targetConstraint(automaticscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validateAutomaticscalinglink_sourceConstraint(automaticscalinglink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Automaticscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomaticscalinglink_targetConstraint(Automaticscalinglink automaticscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return automaticscalinglink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Automaticscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomaticscalinglink_sourceConstraint(Automaticscalinglink automaticscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return automaticscalinglink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthchecklink(Healthchecklink healthchecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthchecklink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthchecklink_targetConstraint(healthchecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateHealthchecklink_sourceConstraint(healthchecklink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Healthchecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthchecklink_targetConstraint(Healthchecklink healthchecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthchecklink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Healthchecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthchecklink_sourceConstraint(Healthchecklink healthchecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return healthchecklink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadinesschecklink(Readinesschecklink readinesschecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(readinesschecklink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadinesschecklink_targetConstraint(readinesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateReadinesschecklink_sourceConstraint(readinesschecklink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Readinesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadinesschecklink_targetConstraint(Readinesschecklink readinesschecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readinesschecklink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Readinesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadinesschecklink_sourceConstraint(Readinesschecklink readinesschecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return readinesschecklink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualscalinglink(Manualscalinglink manualscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualscalinglink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validateManualscalinglink_targetConstraint(manualscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validateManualscalinglink_sourceConstraint(manualscalinglink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Manualscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualscalinglink_targetConstraint(Manualscalinglink manualscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manualscalinglink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Manualscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualscalinglink_sourceConstraint(Manualscalinglink manualscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return manualscalinglink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiconfighandlerlink(Apiconfighandlerlink apiconfighandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiconfighandlerlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateApiconfighandlerlink_targetConstraint(apiconfighandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateApiconfighandlerlink_sourceConstraint(apiconfighandlerlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Apiconfighandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiconfighandlerlink_targetConstraint(Apiconfighandlerlink apiconfighandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apiconfighandlerlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Apiconfighandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiconfighandlerlink_sourceConstraint(Apiconfighandlerlink apiconfighandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apiconfighandlerlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointsapiservicelink(Endpointsapiservicelink endpointsapiservicelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endpointsapiservicelink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndpointsapiservicelink_targetConstraint(endpointsapiservicelink, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndpointsapiservicelink_sourceConstraint(endpointsapiservicelink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Endpointsapiservicelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointsapiservicelink_targetConstraint(Endpointsapiservicelink endpointsapiservicelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return endpointsapiservicelink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Endpointsapiservicelink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointsapiservicelink_sourceConstraint(Endpointsapiservicelink endpointsapiservicelink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return endpointsapiservicelink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentlink(Deploymentlink deploymentlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deploymentlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentlink_targetConstraint(deploymentlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateDeploymentlink_sourceConstraint(deploymentlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Deploymentlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentlink_targetConstraint(Deploymentlink deploymentlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return deploymentlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Deploymentlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeploymentlink_sourceConstraint(Deploymentlink deploymentlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return deploymentlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceslink(Resourceslink resourceslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceslink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceslink_targetConstraint(resourceslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceslink_sourceConstraint(resourceslink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Resourceslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceslink_targetConstraint(Resourceslink resourceslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceslink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Resourceslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceslink_sourceConstraint(Resourceslink resourceslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceslink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicscalinglink(Basicscalinglink basicscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicscalinglink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicscalinglink_targetConstraint(basicscalinglink, diagnostics, context);
		if (result || diagnostics != null) result &= validateBasicscalinglink_sourceConstraint(basicscalinglink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Basicscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicscalinglink_targetConstraint(Basicscalinglink basicscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return basicscalinglink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Basicscalinglink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicscalinglink_sourceConstraint(Basicscalinglink basicscalinglink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return basicscalinglink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLivenesschecklink(Livenesschecklink livenesschecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(livenesschecklink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateLivenesschecklink_targetConstraint(livenesschecklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateLivenesschecklink_sourceConstraint(livenesschecklink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Livenesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLivenesschecklink_targetConstraint(Livenesschecklink livenesschecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return livenesschecklink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Livenesschecklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLivenesschecklink_sourceConstraint(Livenesschecklink livenesschecklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return livenesschecklink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworklink(Networklink networklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networklink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworklink_targetConstraint(networklink, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworklink_sourceConstraint(networklink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Networklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworklink_targetConstraint(Networklink networklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networklink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Networklink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworklink_sourceConstraint(Networklink networklink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networklink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersion(Version version, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(version, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(version, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(version, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(version, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(version, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepairapplicationrequest(Repairapplicationrequest repairapplicationrequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repairapplicationrequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(repairapplicationrequest, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(repairapplicationrequest, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificaterawdata(Certificaterawdata certificaterawdata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(certificaterawdata, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(certificaterawdata, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(certificaterawdata, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileinfo(Fileinfo fileinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fileinfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(fileinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(fileinfo, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScripthandler(Scripthandler scripthandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scripthandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(scripthandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(scripthandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationmetadataexperimental(Operationmetadataexperimental operationmetadataexperimental, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationmetadataexperimental, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operationmetadataexperimental, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operationmetadataexperimental, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizeddomain(Authorizeddomain authorizeddomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authorizeddomain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(authorizeddomain, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(authorizeddomain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrafficsplit(Trafficsplit trafficsplit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trafficsplit, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(trafficsplit, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(trafficsplit, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationmetadatav1beta(Operationmetadatav1beta operationmetadatav1beta, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationmetadatav1beta, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operationmetadatav1beta, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operationmetadatav1beta, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListservicesresponse(Listservicesresponse listservicesresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listservicesresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listservicesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listservicesresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListingressrulesresponse(Listingressrulesresponse listingressrulesresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listingressrulesresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listingressrulesresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResources(Resources resources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resources, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resources, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resources, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(resources, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(resources, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(resources, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(resources, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(resources, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipinfolink(Zipinfolink zipinfolink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zipinfolink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validateZipinfolink_targetConstraint(zipinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validateZipinfolink_sourceConstraint(zipinfolink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Zipinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipinfolink_targetConstraint(Zipinfolink zipinfolink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zipinfolink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Zipinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipinfolink_sourceConstraint(Zipinfolink zipinfolink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return zipinfolink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerinfolink(Containerinfolink containerinfolink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containerinfolink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainerinfolink_targetConstraint(containerinfolink, diagnostics, context);
		if (result || diagnostics != null) result &= validateContainerinfolink_sourceConstraint(containerinfolink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Containerinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerinfolink_targetConstraint(Containerinfolink containerinfolink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return containerinfolink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Containerinfolink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerinfolink_sourceConstraint(Containerinfolink containerinfolink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return containerinfolink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(deployment, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(deployment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBatchupdateingressrulesresponse(Batchupdateingressrulesresponse batchupdateingressrulesresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(batchupdateingressrulesresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(batchupdateingressrulesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(batchupdateingressrulesresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolume(Volume volume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(volume, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(volume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(volume, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(volume, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(volume, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(volume, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(volume, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(volume, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListinstancesresponse(Listinstancesresponse listinstancesresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listinstancesresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listinstancesresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listinstancesresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListdomainmappingsresponse(Listdomainmappingsresponse listdomainmappingsresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listdomainmappingsresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listdomainmappingsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listdomainmappingsresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationmetadatav1alpha(Operationmetadatav1alpha operationmetadatav1alpha, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operationmetadatav1alpha, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operationmetadatav1alpha, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operationmetadatav1alpha, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrldispatchrule(Urldispatchrule urldispatchrule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(urldispatchrule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(urldispatchrule, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(urldispatchrule, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListversionsresponse(Listversionsresponse listversionsresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listversionsresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listversionsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listversionsresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListauthorizeddomainsresponse(Listauthorizeddomainsresponse listauthorizeddomainsresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listauthorizeddomainsresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listauthorizeddomainsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listauthorizeddomainsresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmpty(Empty empty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(empty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(empty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(empty, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(empty, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(empty, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(empty, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(empty, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(empty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiendpointhandler(Apiendpointhandler apiendpointhandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiendpointhandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(apiendpointhandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(apiendpointhandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSslsettingslink(Sslsettingslink sslsettingslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sslsettingslink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateSslsettingslink_targetConstraint(sslsettingslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateSslsettingslink_sourceConstraint(sslsettingslink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Sslsettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSslsettingslink_targetConstraint(Sslsettingslink sslsettingslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sslsettingslink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Sslsettingslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSslsettingslink_sourceConstraint(Sslsettingslink sslsettingslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sslsettingslink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainmapping(Domainmapping domainmapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainmapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(domainmapping, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(domainmapping, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestutilizationlink(Requestutilizationlink requestutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requestutilizationlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequestutilizationlink_targetConstraint(requestutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequestutilizationlink_sourceConstraint(requestutilizationlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Requestutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestutilizationlink_targetConstraint(Requestutilizationlink requestutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requestutilizationlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Requestutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestutilizationlink_sourceConstraint(Requestutilizationlink requestutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return requestutilizationlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkutilizationlink(Networkutilizationlink networkutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networkutilizationlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkutilizationlink_targetConstraint(networkutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateNetworkutilizationlink_sourceConstraint(networkutilizationlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Networkutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkutilizationlink_targetConstraint(Networkutilizationlink networkutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkutilizationlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Networkutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkutilizationlink_sourceConstraint(Networkutilizationlink networkutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return networkutilizationlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuutilizationlink(Cpuutilizationlink cpuutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cpuutilizationlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateCpuutilizationlink_targetConstraint(cpuutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateCpuutilizationlink_sourceConstraint(cpuutilizationlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Cpuutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuutilizationlink_targetConstraint(Cpuutilizationlink cpuutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpuutilizationlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Cpuutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuutilizationlink_sourceConstraint(Cpuutilizationlink cpuutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cpuutilizationlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiskutilizationlink(Diskutilizationlink diskutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diskutilizationlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiskutilizationlink_targetConstraint(diskutilizationlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiskutilizationlink_sourceConstraint(diskutilizationlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Diskutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiskutilizationlink_targetConstraint(Diskutilizationlink diskutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diskutilizationlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Diskutilizationlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiskutilizationlink_sourceConstraint(Diskutilizationlink diskutilizationlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diskutilizationlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomaticscaling(Automaticscaling automaticscaling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(automaticscaling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(automaticscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(automaticscaling, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZipinfo(Zipinfo zipinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(zipinfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(zipinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(zipinfo, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificaterawdatalink(Certificaterawdatalink certificaterawdatalink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(certificaterawdatalink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificaterawdatalink_targetConstraint(certificaterawdatalink, diagnostics, context);
		if (result || diagnostics != null) result &= validateCertificaterawdatalink_sourceConstraint(certificaterawdatalink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Certificaterawdatalink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificaterawdatalink_targetConstraint(Certificaterawdatalink certificaterawdatalink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificaterawdatalink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Certificaterawdatalink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificaterawdatalink_sourceConstraint(Certificaterawdatalink certificaterawdatalink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return certificaterawdatalink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizedcertificate(Authorizedcertificate authorizedcertificate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authorizedcertificate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(authorizedcertificate, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(authorizedcertificate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourcerecord(Resourcerecord resourcerecord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourcerecord, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(resourcerecord, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(resourcerecord, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLibrary(Library library, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(library, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(library, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(library, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(library, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(library, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(library, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(library, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(library, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListlocationsresponse(Listlocationsresponse listlocationsresponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listlocationsresponse, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(listlocationsresponse, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(listlocationsresponse, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerinfo(Containerinfo containerinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(containerinfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(containerinfo, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(containerinfo, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequestutilization(Requestutilization requestutilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requestutilization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(requestutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(requestutilization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiendpointhandlerlink(Apiendpointhandlerlink apiendpointhandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiendpointhandlerlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateApiendpointhandlerlink_targetConstraint(apiendpointhandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateApiendpointhandlerlink_sourceConstraint(apiendpointhandlerlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Apiendpointhandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiendpointhandlerlink_targetConstraint(Apiendpointhandlerlink apiendpointhandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apiendpointhandlerlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Apiendpointhandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiendpointhandlerlink_sourceConstraint(Apiendpointhandlerlink apiendpointhandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return apiendpointhandlerlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticfileshandlerlink(Staticfileshandlerlink staticfileshandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticfileshandlerlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticfileshandlerlink_targetConstraint(staticfileshandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateStaticfileshandlerlink_sourceConstraint(staticfileshandlerlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Staticfileshandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticfileshandlerlink_targetConstraint(Staticfileshandlerlink staticfileshandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticfileshandlerlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Staticfileshandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticfileshandlerlink_sourceConstraint(Staticfileshandlerlink staticfileshandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return staticfileshandlerlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScripthandlerlink(Scripthandlerlink scripthandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scripthandlerlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateScripthandlerlink_targetConstraint(scripthandlerlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateScripthandlerlink_sourceConstraint(scripthandlerlink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Scripthandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScripthandlerlink_targetConstraint(Scripthandlerlink scripthandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scripthandlerlink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Scripthandlerlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScripthandlerlink_sourceConstraint(Scripthandlerlink scripthandlerlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scripthandlerlink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlmap(Urlmap urlmap, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(urlmap, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(urlmap, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(urlmap, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointsapiservice(Endpointsapiservice endpointsapiservice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endpointsapiservice, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(endpointsapiservice, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(endpointsapiservice, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatuslink(Statuslink statuslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(statuslink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatuslink_targetConstraint(statuslink, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatuslink_sourceConstraint(statuslink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Statuslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatuslink_targetConstraint(Statuslink statuslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statuslink.targetConstraint(diagnostics, context);
	}

	/**
	 * Validates the sourceConstraint constraint of '<em>Statuslink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatuslink_sourceConstraint(Statuslink statuslink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statuslink.sourceConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(operation, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(operation, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(operation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiconfighandler(Apiconfighandler apiconfighandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(apiconfighandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(apiconfighandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(apiconfighandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticfileshandler(Staticfileshandler staticfileshandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(staticfileshandler, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(staticfileshandler, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(staticfileshandler, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicscaling(Basicscaling basicscaling, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basicscaling, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(basicscaling, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(basicscaling, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiskutilization(Diskutilization diskutilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(diskutilization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(diskutilization, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(diskutilization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorcode(Errorcode errorcode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServingstatus(Servingstatus servingstatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAvailability(Availability availability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionServingstatus(VersionServingstatus versionServingstatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShardby(Shardby shardby, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedirecthttpresponsecode(Redirecthttpresponsecode redirecthttpresponsecode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritylevel(Securitylevel securitylevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthfailaction(Authfailaction authfailaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogin(Login login, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiConfigHandlerSecuritylevel(ApiConfigHandlerSecuritylevel apiConfigHandlerSecuritylevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiConfigHandlerAuthfailaction(ApiConfigHandlerAuthfailaction apiConfigHandlerAuthfailaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApiConfigHandlerLogin(ApiConfigHandlerLogin apiConfigHandlerLogin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatebyte(Byte byte_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatefloat(Float float_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateany(Object any, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelong(Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateshort(Short short_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatemap(Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateobject(Object object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AppengineValidator
