// Generated at Wed Nov 07 10:30:40 CET 2018 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Dynamic Semantics for OCCI Extensions 'appengine'
//
// ======================================================================

module appengine_behaviour

open util/boolean
open OCCI
open appengine

//
// Imported extensions
//
open core

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#cpuutilization'
//
// ======================================================================

//
// Equivalence predicate between two Cpuutilization atoms.
//
pred isoCpuutilization[c1, c2: Cpuutilization]
{
    // Comment following lines when this is not the expected behaviour.
    isoCpuutilization[c1, c2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#status'
//
// ======================================================================

//
// Equivalence predicate between two Status atoms.
//
pred isoStatus[s1, s2: Status]
{
    // Comment following lines when this is not the expected behaviour.
    isoStatus[s1, s2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#identityawareproxy'
//
// ======================================================================

//
// Equivalence predicate between two Identityawareproxy atoms.
//
pred isoIdentityawareproxy[i1, i2: Identityawareproxy]
{
    // Comment following lines when this is not the expected behaviour.
    isoIdentityawareproxy[i1, i2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#manualscaling'
//
// ======================================================================

//
// Equivalence predicate between two Manualscaling atoms.
//
pred isoManualscaling[m1, m2: Manualscaling]
{
    // Comment following lines when this is not the expected behaviour.
    isoManualscaling[m1, m2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#locationmetadata'
//
// ======================================================================

//
// Equivalence predicate between two Locationmetadata atoms.
//
pred isoLocationmetadata[l1, l2: Locationmetadata]
{
    // Comment following lines when this is not the expected behaviour.
    isoLocationmetadata[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#trafficsplitlink'
//
// ======================================================================

//
// Equivalence predicate between two Trafficsplitlink atoms.
//
pred isoTrafficsplitlink[t1, t2: Trafficsplitlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoTrafficsplitlink[t1, t2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#service'
//
// ======================================================================

//
// Equivalence predicate between two Service atoms.
//
pred isoService[s1, s2: Service]
{
    // Comment following lines when this is not the expected behaviour.
    isoService[s1, s2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/service/action#delete'
//



//
// OCCI Action 'http://occi/gcpappengine/service/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/service/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/service/action#patch'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listoperationsresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listoperationsresponse atoms.
//
pred isoListoperationsresponse[l1, l2: Listoperationsresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListoperationsresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadata'
//
// ======================================================================

//
// Equivalence predicate between two Operationmetadata atoms.
//
pred isoOperationmetadata[o1, o2: Operationmetadata]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperationmetadata[o1, o2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#firewallrule'
//
// ======================================================================

//
// Equivalence predicate between two Firewallrule atoms.
//
pred isoFirewallrule[f1, f2: Firewallrule]
{
    // Comment following lines when this is not the expected behaviour.
    isoFirewallrule[f1, f2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/firewallrule/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/firewallrule/action#patch'
//



//
// OCCI Action 'http://occi/gcpappengine/firewallrule/action#batchupdate'
//



//
// OCCI Action 'http://occi/gcpappengine/firewallrule/action#delete'
//



//
// OCCI Action 'http://occi/gcpappengine/firewallrule/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/firewallrule/action#create'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listauthorizedcertificatesresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listauthorizedcertificatesresponse atoms.
//
pred isoListauthorizedcertificatesresponse[l1, l2: Listauthorizedcertificatesresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListauthorizedcertificatesresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#featuresettings'
//
// ======================================================================

//
// Equivalence predicate between two Featuresettings atoms.
//
pred isoFeaturesettings[f1, f2: Featuresettings]
{
    // Comment following lines when this is not the expected behaviour.
    isoFeaturesettings[f1, f2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#errorhandler'
//
// ======================================================================

//
// Equivalence predicate between two Errorhandler atoms.
//
pred isoErrorhandler[e1, e2: Errorhandler]
{
    // Comment following lines when this is not the expected behaviour.
    isoErrorhandler[e1, e2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#sslsettings'
//
// ======================================================================

//
// Equivalence predicate between two Sslsettings atoms.
//
pred isoSslsettings[s1, s2: Sslsettings]
{
    // Comment following lines when this is not the expected behaviour.
    isoSslsettings[s1, s2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1'
//
// ======================================================================

//
// Equivalence predicate between two Operationmetadatav1 atoms.
//
pred isoOperationmetadatav1[o1, o2: Operationmetadatav1]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperationmetadatav1[o1, o2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#featuresettingslink'
//
// ======================================================================

//
// Equivalence predicate between two Featuresettingslink atoms.
//
pred isoFeaturesettingslink[f1, f2: Featuresettingslink]
{
    // Comment following lines when this is not the expected behaviour.
    isoFeaturesettingslink[f1, f2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#identityawareproxylink'
//
// ======================================================================

//
// Equivalence predicate between two Identityawareproxylink atoms.
//
pred isoIdentityawareproxylink[i1, i2: Identityawareproxylink]
{
    // Comment following lines when this is not the expected behaviour.
    isoIdentityawareproxylink[i1, i2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#application'
//
// ======================================================================

//
// Equivalence predicate between two Application atoms.
//
pred isoApplication[a1, a2: Application]
{
    // Comment following lines when this is not the expected behaviour.
    isoApplication[a1, a2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/application/action#repair'
//



//
// OCCI Action 'http://occi/gcpappengine/application/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/application/action#patch'
//



//
// OCCI Action 'http://occi/gcpappengine/application/action#create'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#network'
//
// ======================================================================

//
// Equivalence predicate between two Network atoms.
//
pred isoNetwork[n1, n2: Network]
{
    // Comment following lines when this is not the expected behaviour.
    isoNetwork[n1, n2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#instance'
//
// ======================================================================

//
// Equivalence predicate between two Instance atoms.
//
pred isoInstance[i1, i2: Instance]
{
    // Comment following lines when this is not the expected behaviour.
    isoInstance[i1, i2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/instance/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/instance/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/instance/action#debug'
//



//
// OCCI Action 'http://occi/gcpappengine/instance/action#delete'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#livenesscheck'
//
// ======================================================================

//
// Equivalence predicate between two Livenesscheck atoms.
//
pred isoLivenesscheck[l1, l2: Livenesscheck]
{
    // Comment following lines when this is not the expected behaviour.
    isoLivenesscheck[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#batchupdateingressrulesrequest'
//
// ======================================================================

//
// Equivalence predicate between two Batchupdateingressrulesrequest atoms.
//
pred isoBatchupdateingressrulesrequest[b1, b2: Batchupdateingressrulesrequest]
{
    // Comment following lines when this is not the expected behaviour.
    isoBatchupdateingressrulesrequest[b1, b2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#networkutilization'
//
// ======================================================================

//
// Equivalence predicate between two Networkutilization atoms.
//
pred isoNetworkutilization[n1, n2: Networkutilization]
{
    // Comment following lines when this is not the expected behaviour.
    isoNetworkutilization[n1, n2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#location'
//
// ======================================================================

//
// Equivalence predicate between two Location atoms.
//
pred isoLocation[l1, l2: Location]
{
    // Comment following lines when this is not the expected behaviour.
    isoLocation[l1, l2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/location/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/location/action#get'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#healthcheck'
//
// ======================================================================

//
// Equivalence predicate between two Healthcheck atoms.
//
pred isoHealthcheck[h1, h2: Healthcheck]
{
    // Comment following lines when this is not the expected behaviour.
    isoHealthcheck[h1, h2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#readinesscheck'
//
// ======================================================================

//
// Equivalence predicate between two Readinesscheck atoms.
//
pred isoReadinesscheck[r1, r2: Readinesscheck]
{
    // Comment following lines when this is not the expected behaviour.
    isoReadinesscheck[r1, r2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#debuginstancerequest'
//
// ======================================================================

//
// Equivalence predicate between two Debuginstancerequest atoms.
//
pred isoDebuginstancerequest[d1, d2: Debuginstancerequest]
{
    // Comment following lines when this is not the expected behaviour.
    isoDebuginstancerequest[d1, d2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1beta5'
//
// ======================================================================

//
// Equivalence predicate between two Operationmetadatav1beta5 atoms.
//
pred isoOperationmetadatav1beta5[o1, o2: Operationmetadatav1beta5]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperationmetadatav1beta5[o1, o2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#automaticscalinglink'
//
// ======================================================================

//
// Equivalence predicate between two Automaticscalinglink atoms.
//
pred isoAutomaticscalinglink[a1, a2: Automaticscalinglink]
{
    // Comment following lines when this is not the expected behaviour.
    isoAutomaticscalinglink[a1, a2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#healthchecklink'
//
// ======================================================================

//
// Equivalence predicate between two Healthchecklink atoms.
//
pred isoHealthchecklink[h1, h2: Healthchecklink]
{
    // Comment following lines when this is not the expected behaviour.
    isoHealthchecklink[h1, h2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#readinesschecklink'
//
// ======================================================================

//
// Equivalence predicate between two Readinesschecklink atoms.
//
pred isoReadinesschecklink[r1, r2: Readinesschecklink]
{
    // Comment following lines when this is not the expected behaviour.
    isoReadinesschecklink[r1, r2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#manualscalinglink'
//
// ======================================================================

//
// Equivalence predicate between two Manualscalinglink atoms.
//
pred isoManualscalinglink[m1, m2: Manualscalinglink]
{
    // Comment following lines when this is not the expected behaviour.
    isoManualscalinglink[m1, m2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiconfighandlerlink'
//
// ======================================================================

//
// Equivalence predicate between two Apiconfighandlerlink atoms.
//
pred isoApiconfighandlerlink[a1, a2: Apiconfighandlerlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoApiconfighandlerlink[a1, a2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#endpointsapiservicelink'
//
// ======================================================================

//
// Equivalence predicate between two Endpointsapiservicelink atoms.
//
pred isoEndpointsapiservicelink[e1, e2: Endpointsapiservicelink]
{
    // Comment following lines when this is not the expected behaviour.
    isoEndpointsapiservicelink[e1, e2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#deploymentlink'
//
// ======================================================================

//
// Equivalence predicate between two Deploymentlink atoms.
//
pred isoDeploymentlink[d1, d2: Deploymentlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoDeploymentlink[d1, d2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#resourceslink'
//
// ======================================================================

//
// Equivalence predicate between two Resourceslink atoms.
//
pred isoResourceslink[r1, r2: Resourceslink]
{
    // Comment following lines when this is not the expected behaviour.
    isoResourceslink[r1, r2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#basicscalinglink'
//
// ======================================================================

//
// Equivalence predicate between two Basicscalinglink atoms.
//
pred isoBasicscalinglink[b1, b2: Basicscalinglink]
{
    // Comment following lines when this is not the expected behaviour.
    isoBasicscalinglink[b1, b2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#livenesschecklink'
//
// ======================================================================

//
// Equivalence predicate between two Livenesschecklink atoms.
//
pred isoLivenesschecklink[l1, l2: Livenesschecklink]
{
    // Comment following lines when this is not the expected behaviour.
    isoLivenesschecklink[l1, l2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#networklink'
//
// ======================================================================

//
// Equivalence predicate between two Networklink atoms.
//
pred isoNetworklink[n1, n2: Networklink]
{
    // Comment following lines when this is not the expected behaviour.
    isoNetworklink[n1, n2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#version'
//
// ======================================================================

//
// Equivalence predicate between two Version atoms.
//
pred isoVersion[v1, v2: Version]
{
    // Comment following lines when this is not the expected behaviour.
    isoVersion[v1, v2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/version/action#delete'
//



//
// OCCI Action 'http://occi/gcpappengine/version/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/version/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/version/action#patch'
//



//
// OCCI Action 'http://occi/gcpappengine/version/action#create'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#repairapplicationrequest'
//
// ======================================================================

//
// Equivalence predicate between two Repairapplicationrequest atoms.
//
pred isoRepairapplicationrequest[r1, r2: Repairapplicationrequest]
{
    // Comment following lines when this is not the expected behaviour.
    isoRepairapplicationrequest[r1, r2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#certificaterawdata'
//
// ======================================================================

//
// Equivalence predicate between two Certificaterawdata atoms.
//
pred isoCertificaterawdata[c1, c2: Certificaterawdata]
{
    // Comment following lines when this is not the expected behaviour.
    isoCertificaterawdata[c1, c2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#fileinfo'
//
// ======================================================================

//
// Equivalence predicate between two Fileinfo atoms.
//
pred isoFileinfo[f1, f2: Fileinfo]
{
    // Comment following lines when this is not the expected behaviour.
    isoFileinfo[f1, f2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#scripthandler'
//
// ======================================================================

//
// Equivalence predicate between two Scripthandler atoms.
//
pred isoScripthandler[s1, s2: Scripthandler]
{
    // Comment following lines when this is not the expected behaviour.
    isoScripthandler[s1, s2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadataexperimental'
//
// ======================================================================

//
// Equivalence predicate between two Operationmetadataexperimental atoms.
//
pred isoOperationmetadataexperimental[o1, o2: Operationmetadataexperimental]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperationmetadataexperimental[o1, o2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#authorizeddomain'
//
// ======================================================================

//
// Equivalence predicate between two Authorizeddomain atoms.
//
pred isoAuthorizeddomain[a1, a2: Authorizeddomain]
{
    // Comment following lines when this is not the expected behaviour.
    isoAuthorizeddomain[a1, a2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/authorizeddomain/action#list'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#trafficsplit'
//
// ======================================================================

//
// Equivalence predicate between two Trafficsplit atoms.
//
pred isoTrafficsplit[t1, t2: Trafficsplit]
{
    // Comment following lines when this is not the expected behaviour.
    isoTrafficsplit[t1, t2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1beta'
//
// ======================================================================

//
// Equivalence predicate between two Operationmetadatav1beta atoms.
//
pred isoOperationmetadatav1beta[o1, o2: Operationmetadatav1beta]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperationmetadatav1beta[o1, o2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listservicesresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listservicesresponse atoms.
//
pred isoListservicesresponse[l1, l2: Listservicesresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListservicesresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listingressrulesresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listingressrulesresponse atoms.
//
pred isoListingressrulesresponse[l1, l2: Listingressrulesresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListingressrulesresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#resources'
//
// ======================================================================

//
// Equivalence predicate between two Resources atoms.
//
pred isoResources[r1, r2: Resources]
{
    // Comment following lines when this is not the expected behaviour.
    isoResources[r1, r2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#zipinfolink'
//
// ======================================================================

//
// Equivalence predicate between two Zipinfolink atoms.
//
pred isoZipinfolink[z1, z2: Zipinfolink]
{
    // Comment following lines when this is not the expected behaviour.
    isoZipinfolink[z1, z2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#containerinfolink'
//
// ======================================================================

//
// Equivalence predicate between two Containerinfolink atoms.
//
pred isoContainerinfolink[c1, c2: Containerinfolink]
{
    // Comment following lines when this is not the expected behaviour.
    isoContainerinfolink[c1, c2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#deployment'
//
// ======================================================================

//
// Equivalence predicate between two Deployment atoms.
//
pred isoDeployment[d1, d2: Deployment]
{
    // Comment following lines when this is not the expected behaviour.
    isoDeployment[d1, d2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#batchupdateingressrulesresponse'
//
// ======================================================================

//
// Equivalence predicate between two Batchupdateingressrulesresponse atoms.
//
pred isoBatchupdateingressrulesresponse[b1, b2: Batchupdateingressrulesresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoBatchupdateingressrulesresponse[b1, b2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#volume'
//
// ======================================================================

//
// Equivalence predicate between two Volume atoms.
//
pred isoVolume[v1, v2: Volume]
{
    // Comment following lines when this is not the expected behaviour.
    isoVolume[v1, v2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listinstancesresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listinstancesresponse atoms.
//
pred isoListinstancesresponse[l1, l2: Listinstancesresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListinstancesresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listdomainmappingsresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listdomainmappingsresponse atoms.
//
pred isoListdomainmappingsresponse[l1, l2: Listdomainmappingsresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListdomainmappingsresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1alpha'
//
// ======================================================================

//
// Equivalence predicate between two Operationmetadatav1alpha atoms.
//
pred isoOperationmetadatav1alpha[o1, o2: Operationmetadatav1alpha]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperationmetadatav1alpha[o1, o2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#urldispatchrule'
//
// ======================================================================

//
// Equivalence predicate between two Urldispatchrule atoms.
//
pred isoUrldispatchrule[u1, u2: Urldispatchrule]
{
    // Comment following lines when this is not the expected behaviour.
    isoUrldispatchrule[u1, u2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listversionsresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listversionsresponse atoms.
//
pred isoListversionsresponse[l1, l2: Listversionsresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListversionsresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listauthorizeddomainsresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listauthorizeddomainsresponse atoms.
//
pred isoListauthorizeddomainsresponse[l1, l2: Listauthorizeddomainsresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListauthorizeddomainsresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#empty'
//
// ======================================================================

//
// Equivalence predicate between two Empty atoms.
//
pred isoEmpty[e1, e2: Empty]
{
    // Comment following lines when this is not the expected behaviour.
    isoEmpty[e1, e2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiendpointhandler'
//
// ======================================================================

//
// Equivalence predicate between two Apiendpointhandler atoms.
//
pred isoApiendpointhandler[a1, a2: Apiendpointhandler]
{
    // Comment following lines when this is not the expected behaviour.
    isoApiendpointhandler[a1, a2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#sslsettingslink'
//
// ======================================================================

//
// Equivalence predicate between two Sslsettingslink atoms.
//
pred isoSslsettingslink[s1, s2: Sslsettingslink]
{
    // Comment following lines when this is not the expected behaviour.
    isoSslsettingslink[s1, s2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#domainmapping'
//
// ======================================================================

//
// Equivalence predicate between two Domainmapping atoms.
//
pred isoDomainmapping[d1, d2: Domainmapping]
{
    // Comment following lines when this is not the expected behaviour.
    isoDomainmapping[d1, d2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/domainmapping/action#delete'
//



//
// OCCI Action 'http://occi/gcpappengine/domainmapping/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/domainmapping/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/domainmapping/action#patch'
//



//
// OCCI Action 'http://occi/gcpappengine/domainmapping/action#create'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#requestutilizationlink'
//
// ======================================================================

//
// Equivalence predicate between two Requestutilizationlink atoms.
//
pred isoRequestutilizationlink[r1, r2: Requestutilizationlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoRequestutilizationlink[r1, r2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#networkutilizationlink'
//
// ======================================================================

//
// Equivalence predicate between two Networkutilizationlink atoms.
//
pred isoNetworkutilizationlink[n1, n2: Networkutilizationlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoNetworkutilizationlink[n1, n2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#cpuutilizationlink'
//
// ======================================================================

//
// Equivalence predicate between two Cpuutilizationlink atoms.
//
pred isoCpuutilizationlink[c1, c2: Cpuutilizationlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoCpuutilizationlink[c1, c2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#diskutilizationlink'
//
// ======================================================================

//
// Equivalence predicate between two Diskutilizationlink atoms.
//
pred isoDiskutilizationlink[d1, d2: Diskutilizationlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoDiskutilizationlink[d1, d2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#automaticscaling'
//
// ======================================================================

//
// Equivalence predicate between two Automaticscaling atoms.
//
pred isoAutomaticscaling[a1, a2: Automaticscaling]
{
    // Comment following lines when this is not the expected behaviour.
    isoAutomaticscaling[a1, a2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#zipinfo'
//
// ======================================================================

//
// Equivalence predicate between two Zipinfo atoms.
//
pred isoZipinfo[z1, z2: Zipinfo]
{
    // Comment following lines when this is not the expected behaviour.
    isoZipinfo[z1, z2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#certificaterawdatalink'
//
// ======================================================================

//
// Equivalence predicate between two Certificaterawdatalink atoms.
//
pred isoCertificaterawdatalink[c1, c2: Certificaterawdatalink]
{
    // Comment following lines when this is not the expected behaviour.
    isoCertificaterawdatalink[c1, c2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#authorizedcertificate'
//
// ======================================================================

//
// Equivalence predicate between two Authorizedcertificate atoms.
//
pred isoAuthorizedcertificate[a1, a2: Authorizedcertificate]
{
    // Comment following lines when this is not the expected behaviour.
    isoAuthorizedcertificate[a1, a2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/authorizedcertificate/action#delete'
//



//
// OCCI Action 'http://occi/gcpappengine/authorizedcertificate/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/authorizedcertificate/action#get'
//



//
// OCCI Action 'http://occi/gcpappengine/authorizedcertificate/action#patch'
//



//
// OCCI Action 'http://occi/gcpappengine/authorizedcertificate/action#create'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#resourcerecord'
//
// ======================================================================

//
// Equivalence predicate between two Resourcerecord atoms.
//
pred isoResourcerecord[r1, r2: Resourcerecord]
{
    // Comment following lines when this is not the expected behaviour.
    isoResourcerecord[r1, r2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#library'
//
// ======================================================================

//
// Equivalence predicate between two Library atoms.
//
pred isoLibrary[l1, l2: Library]
{
    // Comment following lines when this is not the expected behaviour.
    isoLibrary[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listlocationsresponse'
//
// ======================================================================

//
// Equivalence predicate between two Listlocationsresponse atoms.
//
pred isoListlocationsresponse[l1, l2: Listlocationsresponse]
{
    // Comment following lines when this is not the expected behaviour.
    isoListlocationsresponse[l1, l2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#containerinfo'
//
// ======================================================================

//
// Equivalence predicate between two Containerinfo atoms.
//
pred isoContainerinfo[c1, c2: Containerinfo]
{
    // Comment following lines when this is not the expected behaviour.
    isoContainerinfo[c1, c2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#requestutilization'
//
// ======================================================================

//
// Equivalence predicate between two Requestutilization atoms.
//
pred isoRequestutilization[r1, r2: Requestutilization]
{
    // Comment following lines when this is not the expected behaviour.
    isoRequestutilization[r1, r2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiendpointhandlerlink'
//
// ======================================================================

//
// Equivalence predicate between two Apiendpointhandlerlink atoms.
//
pred isoApiendpointhandlerlink[a1, a2: Apiendpointhandlerlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoApiendpointhandlerlink[a1, a2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#staticfileshandlerlink'
//
// ======================================================================

//
// Equivalence predicate between two Staticfileshandlerlink atoms.
//
pred isoStaticfileshandlerlink[s1, s2: Staticfileshandlerlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoStaticfileshandlerlink[s1, s2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#scripthandlerlink'
//
// ======================================================================

//
// Equivalence predicate between two Scripthandlerlink atoms.
//
pred isoScripthandlerlink[s1, s2: Scripthandlerlink]
{
    // Comment following lines when this is not the expected behaviour.
    isoScripthandlerlink[s1, s2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#urlmap'
//
// ======================================================================

//
// Equivalence predicate between two Urlmap atoms.
//
pred isoUrlmap[u1, u2: Urlmap]
{
    // Comment following lines when this is not the expected behaviour.
    isoUrlmap[u1, u2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#endpointsapiservice'
//
// ======================================================================

//
// Equivalence predicate between two Endpointsapiservice atoms.
//
pred isoEndpointsapiservice[e1, e2: Endpointsapiservice]
{
    // Comment following lines when this is not the expected behaviour.
    isoEndpointsapiservice[e1, e2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#statuslink'
//
// ======================================================================

//
// Equivalence predicate between two Statuslink atoms.
//
pred isoStatuslink[s1, s2: Statuslink]
{
    // Comment following lines when this is not the expected behaviour.
    isoStatuslink[s1, s2] // same link
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operation'
//
// ======================================================================

//
// Equivalence predicate between two Operation atoms.
//
pred isoOperation[o1, o2: Operation]
{
    // Comment following lines when this is not the expected behaviour.
    isoOperation[o1, o2] // same resource
}


//
// OCCI Action 'http://occi/gcpappengine/operation/action#list'
//



//
// OCCI Action 'http://occi/gcpappengine/operation/action#get'
//




// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiconfighandler'
//
// ======================================================================

//
// Equivalence predicate between two Apiconfighandler atoms.
//
pred isoApiconfighandler[a1, a2: Apiconfighandler]
{
    // Comment following lines when this is not the expected behaviour.
    isoApiconfighandler[a1, a2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#staticfileshandler'
//
// ======================================================================

//
// Equivalence predicate between two Staticfileshandler atoms.
//
pred isoStaticfileshandler[s1, s2: Staticfileshandler]
{
    // Comment following lines when this is not the expected behaviour.
    isoStaticfileshandler[s1, s2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#basicscaling'
//
// ======================================================================

//
// Equivalence predicate between two Basicscaling atoms.
//
pred isoBasicscaling[b1, b2: Basicscaling]
{
    // Comment following lines when this is not the expected behaviour.
    isoBasicscaling[b1, b2] // same resource
}



// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#diskutilization'
//
// ======================================================================

//
// Equivalence predicate between two Diskutilization atoms.
//
pred isoDiskutilization[d1, d2: Diskutilization]
{
    // Comment following lines when this is not the expected behaviour.
    isoDiskutilization[d1, d2] // same resource
}



// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

