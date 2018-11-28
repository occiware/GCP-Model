// Generated at Wed Nov 07 10:30:40 CET 2018 from  by org.eclipse.cmf.occi.core.gen.alloy

// ======================================================================
//
// Static Semantics for OCCI Extension 'appengine'
//
// ======================================================================

module appengine

open util/boolean
open OCCI

// ======================================================================
//
// Imported extensions
//
// ======================================================================

open core

// ======================================================================
//
// OCCI extension 'appengine'
//
// ======================================================================

one sig extension extends Extension {} {
    name = "appengine"
    scheme = "http://occi/gcpappengine#"
    import = core/extension
    kinds = cpuutilization + status + identityawareproxy + manualscaling + locationmetadata + trafficsplitlink + service + listoperationsresponse + operationmetadata + firewallrule + listauthorizedcertificatesresponse + featuresettings + errorhandler + sslsettings + operationmetadatav1 + featuresettingslink + identityawareproxylink + application + network + instance + livenesscheck + batchupdateingressrulesrequest + networkutilization + location + healthcheck + readinesscheck + debuginstancerequest + operationmetadatav1beta5 + automaticscalinglink + healthchecklink + readinesschecklink + manualscalinglink + apiconfighandlerlink + endpointsapiservicelink + deploymentlink + resourceslink + basicscalinglink + livenesschecklink + networklink + version + repairapplicationrequest + certificaterawdata + fileinfo + scripthandler + operationmetadataexperimental + authorizeddomain + trafficsplit + operationmetadatav1beta + listservicesresponse + listingressrulesresponse + resources + zipinfolink + containerinfolink + deployment + batchupdateingressrulesresponse + volume + listinstancesresponse + listdomainmappingsresponse + operationmetadatav1alpha + urldispatchrule + listversionsresponse + listauthorizeddomainsresponse + empty + apiendpointhandler + sslsettingslink + domainmapping + requestutilizationlink + networkutilizationlink + cpuutilizationlink + diskutilizationlink + automaticscaling + zipinfo + certificaterawdatalink + authorizedcertificate + resourcerecord + library + listlocationsresponse + containerinfo + requestutilization + apiendpointhandlerlink + staticfileshandlerlink + scripthandlerlink + urlmap + endpointsapiservice + statuslink + operation + apiconfighandler + staticfileshandler + basicscaling + diskutilization
    no mixins
    types = float_DataType + byte_DataType + double_DataType + object_DataType + long_DataType + array_DataType + map_DataType + any_DataType + short_DataType + Action_DataType + Errorcode_DataType + Servingstatus_DataType + Availability_DataType + VersionServingstatus_DataType + Shardby_DataType + Type_DataType + Redirecthttpresponsecode_DataType + Securitylevel_DataType + Authfailaction_DataType + Login_DataType + ApiConfigHandlerSecuritylevel_DataType + ApiConfigHandlerAuthfailaction_DataType + ApiConfigHandlerLogin_DataType
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#cpuutilization'
//
// ======================================================================

one sig cpuutilization extends Kind {} {
    term = "cpuutilization"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by CPU usage."
    parent = core/resource
    attributes = cpuutilization_aggregationWindowLength + cpuutilization_targetUtilization
    no actions
    entities in Cpuutilization
}

//
// OCCI attribute 'aggregationWindowLength'
//
one sig cpuutilization_aggregationWindowLength extends Attribute {} {
    name = "aggregationWindowLength"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Period of time over which CPU utilization is calculated."
    multiple_values = 
}

//
// OCCI attribute 'targetUtilization'
//
one sig cpuutilization_targetUtilization extends Attribute {} {
    name = "targetUtilization"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1."
    multiple_values = 
}

// ======================================================================
// Signature for Cpuutilization
// ======================================================================

sig Cpuutilization extends core/Resource {
    aggregationWindowLength : one String,
    targetUtilization : one core/Integer,
} {
    hasKind[cpuutilization]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#status'
//
// ======================================================================

one sig status extends Kind {} {
    term = "status"
    scheme = "http://occi/gcpappengine#"
    title = "The Status type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by gRPC (https://github.com/grpc). The error model is designed to be:
    Simple to use and understand for most users
    Flexible enough to meet unexpected needsOverviewThe Status message contains three pieces of data: error code, error message, and error details. The error code should be an enum value of google.rpc.Code, but it may accept additional error codes if needed. The error message should be a developer-facing English message that helps developers understand and resolve the error. If a localized user-facing error message is needed, put the localized message in the error details or localize it in the client. The optional error details may contain arbitrary information about the error. There is a predefined set of error detail types in the package google.rpc that can be used for common error conditions.Language mappingThe Status message is the logical representation of the error model, but it is not necessarily the actual wire format. When the Status message is exposed in different client libraries and different wire protocols, it can be mapped differently. For example, it will likely be mapped to some exceptions in Java, but more likely mapped to some error codes in C.Other usesThe error model and the Status message can be used in a variety of environments, either with or without APIs, to provide a consistent developer experience across different environments.Example uses of this error model include:
    Partial errors. If a service needs to return partial errors to the client, it may embed the Status in the normal response to indicate the partial errors.
    Workflow errors. A typical workflow has multiple steps. Each step may have a Status message for error reporting.
    Batch operations. If a client uses batch request and batch response, the Status message should be used directly inside batch response, one for each error sub-response.
    Asynchronous operations. If an API call embeds asynchronous operation results in its response, the status of those operations should be represented directly using the Status message.
    Logging. If some API errors are stored in logs, the message Status could be used directly after any stripping needed for security/privacy reasons."
    parent = core/resource
    attributes = status_details + status_code + status_message
    no actions
    entities in Status
}

//
// OCCI attribute 'details'
//
one sig status_details extends Attribute {} {
    name = "details"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "A list of messages that carry the error details. There is a common set of message types for APIs to use."
    multiple_values = 
}

//
// OCCI attribute 'code'
//
one sig status_code extends Attribute {} {
    name = "code"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "The status code, which should be an enum value of google.rpc.Code."
    multiple_values = 
}

//
// OCCI attribute 'message'
//
one sig status_message extends Attribute {} {
    name = "message"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client."
    multiple_values = 
}

// ======================================================================
// Signature for Status
// ======================================================================

sig Status extends core/Resource {
    details : one array,
    code : one core/Integer,
    message : one String,
} {
    hasKind[status]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#identityawareproxy'
//
// ======================================================================

one sig identityawareproxy extends Kind {} {
    term = "identityawareproxy"
    scheme = "http://occi/gcpappengine#"
    title = "Identity-Aware Proxy"
    parent = core/resource
    attributes = identityawareproxy_oauth2ClientSecret + identityawareproxy_oauth2ClientId + identityawareproxy_oauth2ClientSecretSha256 + identityawareproxy_enabled
    no actions
    entities in Identityawareproxy
}

//
// OCCI attribute 'oauth2ClientSecret'
//
one sig identityawareproxy_oauth2ClientSecret extends Attribute {} {
    name = "oauth2ClientSecret"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly"
    multiple_values = 
}

//
// OCCI attribute 'oauth2ClientId'
//
one sig identityawareproxy_oauth2ClientId extends Attribute {} {
    name = "oauth2ClientId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "OAuth2 client ID to use for the authentication flow."
    multiple_values = 
}

//
// OCCI attribute 'oauth2ClientSecretSha256'
//
one sig identityawareproxy_oauth2ClientSecretSha256 extends Attribute {} {
    name = "oauth2ClientSecretSha256"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Hex-encoded SHA-256 hash of the client secret.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'enabled'
//
one sig identityawareproxy_enabled extends Attribute {} {
    name = "enabled"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty."
    multiple_values = 
}

// ======================================================================
// Signature for Identityawareproxy
// ======================================================================

sig Identityawareproxy extends core/Resource {
    oauth2ClientSecret : one String,
    oauth2ClientId : one String,
    oauth2ClientSecretSha256 : one String,
    enabled : one core/Boolean,
} {
    hasKind[identityawareproxy]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#manualscaling'
//
// ======================================================================

one sig manualscaling extends Kind {} {
    term = "manualscaling"
    scheme = "http://occi/gcpappengine#"
    title = "A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time."
    parent = core/resource
    attributes = manualscaling_instances
    no actions
    entities in Manualscaling
}

//
// OCCI attribute 'instances'
//
one sig manualscaling_instances extends Attribute {} {
    name = "instances"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of instances to assign to the service at the start. This number can later be altered by using the Modules API (https://cloud.google.com/appengine/docs/python/modules/functions) set_num_instances() function."
    multiple_values = 
}

// ======================================================================
// Signature for Manualscaling
// ======================================================================

sig Manualscaling extends core/Resource {
    instances : one core/Integer,
} {
    hasKind[manualscaling]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#locationmetadata'
//
// ======================================================================

one sig locationmetadata extends Kind {} {
    term = "locationmetadata"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.cloud.location.Location."
    parent = core/resource
    attributes = locationmetadata_flexibleEnvironmentAvailable + locationmetadata_standardEnvironmentAvailable
    no actions
    entities in Locationmetadata
}

//
// OCCI attribute 'flexibleEnvironmentAvailable'
//
one sig locationmetadata_flexibleEnvironmentAvailable extends Attribute {} {
    name = "flexibleEnvironmentAvailable"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "App Engine Flexible Environment is available in the given location.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'standardEnvironmentAvailable'
//
one sig locationmetadata_standardEnvironmentAvailable extends Attribute {} {
    name = "standardEnvironmentAvailable"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "App Engine Standard Environment is available in the given location.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Locationmetadata
// ======================================================================

sig Locationmetadata extends core/Resource {
    flexibleEnvironmentAvailable : one core/Boolean,
    standardEnvironmentAvailable : one core/Boolean,
} {
    hasKind[locationmetadata]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#trafficsplitlink'
//
// ======================================================================

one sig trafficsplitlink extends Kind {} {
    term = "trafficsplitlink"
    scheme = "http://occi/gcpappengine#"
    title = "Mapping that defines fractional HTTP traffic diversion to different versions within the service."
    parent = core/link
    no attributes
    no actions
    entities in Trafficsplitlink
}

// ======================================================================
// Signature for Trafficsplitlink
// ======================================================================

sig Trafficsplitlink extends core/Link {
} {
    hasKind[trafficsplitlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#service'
//
// ======================================================================

one sig service extends Kind {} {
    term = "service"
    scheme = "http://occi/gcpappengine#"
    title = "A Service resource is a logical component of an application that can share state and communicate in a secure fashion with other services. For example, an application that handles customer requests might include separate services to handle tasks such as backend data analysis or API requests from mobile devices. Each service has a collection of versions that define a specific set of code used to implement the functionality of that service."
    parent = core/resource
    attributes = service_name
    actions = service_delete + service_list + service_get + service_patch
    entities in Service
}

//
// OCCI attribute 'name'
//
one sig service_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/service/action#delete'
//
one sig service_delete extends Action {} {
    term = "delete"
    scheme = "http://occi/gcpappengine/service/action#"
    title = "Deletes the specified service and all enclosed versions."
    attributes = delete_appsId + delete_servicesId
}

//
// OCCI attribute 'appsId'
//
one sig delete_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig delete_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/service/action#list'
//
one sig service_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/service/action#"
    title = "Lists all the services in the application."
    attributes = list_appsId + list_pageToken + list_pageSize
}

//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Application resource. Example: apps/myapp."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}
//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/service/action#get'
//
one sig service_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/service/action#"
    title = "Gets the current configuration of the specified service."
    attributes = get_servicesId + get_appsId
}

//
// OCCI attribute 'servicesId'
//
one sig get_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/service/action#patch'
//
one sig service_patch extends Action {} {
    term = "patch"
    scheme = "http://occi/gcpappengine/service/action#"
    title = "Updates the configuration of the specified service."
    attributes = patch_updateMask + patch_servicesId + patch_appsId + patch_migrateTraffic
}

//
// OCCI attribute 'updateMask'
//
one sig patch_updateMask extends Attribute {} {
    name = "updateMask"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard field mask for the set of fields to be updated."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig patch_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig patch_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource to update. Example: apps/myapp/services/default."
    multiple_values = 
}
//
// OCCI attribute 'migrateTraffic'
//
one sig patch_migrateTraffic extends Attribute {} {
    name = "migrateTraffic"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Set to true to gradually shift traffic to one or more versions that you specify. By default, traffic is shifted immediately. For gradual traffic migration, the target versions must be located within instances that are configured for both warmup requests (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#inboundservicetype) and automatic scaling (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#automaticscaling). You must specify the shardBy (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services#shardby) field in the Service resource. Gradual traffic migration is not supported in the App Engine flexible environment. For examples, see Migrating and Splitting Traffic (https://cloud.google.com/appengine/docs/admin-api/migrating-splitting-traffic)."
    multiple_values = 
}

// ======================================================================
// Signature for Service
// ======================================================================

sig Service extends core/Resource {
    name : one String,
} {
    hasKind[service]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listoperationsresponse'
//
// ======================================================================

one sig listoperationsresponse extends Kind {} {
    term = "listoperationsresponse"
    scheme = "http://occi/gcpappengine#"
    title = "The response message for Operations.ListOperations."
    parent = core/resource
    attributes = listoperationsresponse_nextPageToken + listoperationsresponse_operations
    no actions
    entities in Listoperationsresponse
}

//
// OCCI attribute 'nextPageToken'
//
one sig listoperationsresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The standard List next-page token."
    multiple_values = 
}

//
// OCCI attribute 'operations'
//
one sig listoperationsresponse_operations extends Attribute {} {
    name = "operations"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "A list of operations that matches the specified filter in the request."
    multiple_values = 
}

// ======================================================================
// Signature for Listoperationsresponse
// ======================================================================

sig Listoperationsresponse extends core/Resource {
    nextPageToken : one String,
    operations : one array,
} {
    hasKind[listoperationsresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadata'
//
// ======================================================================

one sig operationmetadata extends Kind {} {
    term = "operationmetadata"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.longrunning.Operation."
    parent = core/resource
    attributes = operationmetadata_user + operationmetadata_target + operationmetadata_method + operationmetadata_endTime + operationmetadata_operationType + operationmetadata_insertTime
    no actions
    entities in Operationmetadata
}

//
// OCCI attribute 'user'
//
one sig operationmetadata_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "User who requested this operation.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'target'
//
one sig operationmetadata_target extends Attribute {} {
    name = "target"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the resource that this operation is acting on. Example: apps/myapp/modules/default.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'method'
//
one sig operationmetadata_method extends Attribute {} {
    name = "method"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "API method that initiated this operation. Example: google.appengine.v1beta4.Version.CreateVersion.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'endTime'
//
one sig operationmetadata_endTime extends Attribute {} {
    name = "endTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Timestamp that this operation completed.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'operationType'
//
one sig operationmetadata_operationType extends Attribute {} {
    name = "operationType"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Type of this operation. Deprecated, use method field instead. Example: "create_version".@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'insertTime'
//
one sig operationmetadata_insertTime extends Attribute {} {
    name = "insertTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Timestamp that this operation was created.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Operationmetadata
// ======================================================================

sig Operationmetadata extends core/Resource {
    user : one String,
    target : one String,
    method : one String,
    endTime : one String,
    operationType : one String,
    insertTime : one String,
} {
    hasKind[operationmetadata]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#firewallrule'
//
// ======================================================================

one sig firewallrule extends Kind {} {
    term = "firewallrule"
    scheme = "http://occi/gcpappengine#"
    title = "A single firewall rule that is evaluated against incoming traffic and provides an action to take on matched requests."
    parent = core/resource
    attributes = firewallrule_sourceRange + firewallrule_priority + firewallrule_action + firewallrule_description
    actions = firewallrule_get + firewallrule_patch + firewallrule_batchupdate + firewallrule_delete + firewallrule_list + firewallrule_create
    entities in Firewallrule
}

//
// OCCI attribute 'sourceRange'
//
one sig firewallrule_sourceRange extends Attribute {} {
    name = "sourceRange"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32  or 2001:0db8:0000:0042:0000:8a2e:0370:7334.<p>Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32."
    multiple_values = 
}

//
// OCCI attribute 'priority'
//
one sig firewallrule_priority extends Attribute {} {
    name = "priority"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user."
    multiple_values = 
}

//
// OCCI attribute 'action'
//
one sig firewallrule_action extends Attribute {} {
    name = "action"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The action to take on matched requests."
    multiple_values = 
}

//
// OCCI attribute 'description'
//
one sig firewallrule_description extends Attribute {} {
    name = "description"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "An optional string description of this rule. This field has a maximum length of 100 characters."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/firewallrule/action#get'
//
one sig firewallrule_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/firewallrule/action#"
    title = "Gets the specified firewall rule."
    attributes = get_appsId + get_ingressRulesId
}

//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the Firewall resource to retrieve. Example: apps/myapp/firewall/ingressRules/100."
    multiple_values = 
}
//
// OCCI attribute 'ingressRulesId'
//
one sig get_ingressRulesId extends Attribute {} {
    name = "ingressRulesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/firewallrule/action#patch'
//
one sig firewallrule_patch extends Action {} {
    term = "patch"
    scheme = "http://occi/gcpappengine/firewallrule/action#"
    title = "Updates the specified firewall rule."
    attributes = patch_updateMask + patch_appsId + patch_ingressRulesId
}

//
// OCCI attribute 'updateMask'
//
one sig patch_updateMask extends Attribute {} {
    name = "updateMask"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard field mask for the set of fields to be updated."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig patch_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the Firewall resource to update. Example: apps/myapp/firewall/ingressRules/100."
    multiple_values = 
}
//
// OCCI attribute 'ingressRulesId'
//
one sig patch_ingressRulesId extends Attribute {} {
    name = "ingressRulesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/firewallrule/action#batchupdate'
//
one sig firewallrule_batchupdate extends Action {} {
    term = "batchupdate"
    scheme = "http://occi/gcpappengine/firewallrule/action#"
    title = "Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the final rule does not match traffic with the '*' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list."
    attributes = batchupdate_appsId
}

//
// OCCI attribute 'appsId'
//
one sig batchupdate_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the Firewall collection to set. Example: apps/myapp/firewall/ingressRules."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/firewallrule/action#delete'
//
one sig firewallrule_delete extends Action {} {
    term = "delete"
    scheme = "http://occi/gcpappengine/firewallrule/action#"
    title = "Deletes the specified firewall rule."
    attributes = delete_appsId + delete_ingressRulesId
}

//
// OCCI attribute 'appsId'
//
one sig delete_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the Firewall resource to delete. Example: apps/myapp/firewall/ingressRules/100."
    multiple_values = 
}
//
// OCCI attribute 'ingressRulesId'
//
one sig delete_ingressRulesId extends Attribute {} {
    name = "ingressRulesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/firewallrule/action#list'
//
one sig firewallrule_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/firewallrule/action#"
    title = "Lists the firewall rules of an application."
    attributes = list_pageSize + list_matchingAddress + list_appsId + list_pageToken
}

//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}
//
// OCCI attribute 'matchingAddress'
//
one sig list_matchingAddress extends Attribute {} {
    name = "matchingAddress"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "A valid IP Address. If set, only rules matching this address will be returned. The first returned rule will be the rule that fires on requests from this IP."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the Firewall collection to retrieve. Example: apps/myapp/firewall/ingressRules."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/firewallrule/action#create'
//
one sig firewallrule_create extends Action {} {
    term = "create"
    scheme = "http://occi/gcpappengine/firewallrule/action#"
    title = "Creates a firewall rule for the application."
    attributes = create_appsId
}

//
// OCCI attribute 'appsId'
//
one sig create_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Firewall collection in which to create a new rule. Example: apps/myapp/firewall/ingressRules."
    multiple_values = 
}

// ======================================================================
// Signature for Firewallrule
// ======================================================================

sig Firewallrule extends core/Resource {
    sourceRange : one String,
    priority : one core/Integer,
    action : one String,
    description : one String,
} {
    hasKind[firewallrule]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listauthorizedcertificatesresponse'
//
// ======================================================================

one sig listauthorizedcertificatesresponse extends Kind {} {
    term = "listauthorizedcertificatesresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for AuthorizedCertificates.ListAuthorizedCertificates."
    parent = core/resource
    attributes = listauthorizedcertificatesresponse_certificates + listauthorizedcertificatesresponse_nextPageToken
    no actions
    entities in Listauthorizedcertificatesresponse
}

//
// OCCI attribute 'certificates'
//
one sig listauthorizedcertificatesresponse_certificates extends Attribute {} {
    name = "certificates"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The SSL certificates the user is authorized to administer."
    multiple_values = 
}

//
// OCCI attribute 'nextPageToken'
//
one sig listauthorizedcertificatesresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

// ======================================================================
// Signature for Listauthorizedcertificatesresponse
// ======================================================================

sig Listauthorizedcertificatesresponse extends core/Resource {
    certificates : one array,
    nextPageToken : one String,
} {
    hasKind[listauthorizedcertificatesresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#featuresettings'
//
// ======================================================================

one sig featuresettings extends Kind {} {
    term = "featuresettings"
    scheme = "http://occi/gcpappengine#"
    title = "The feature specific settings to be used in the application. These define behaviors that are user configurable."
    parent = core/resource
    attributes = featuresettings_splitHealthChecks
    no actions
    entities in Featuresettings
}

//
// OCCI attribute 'splitHealthChecks'
//
one sig featuresettings_splitHealthChecks extends Attribute {} {
    name = "splitHealthChecks"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Boolean value indicating if split health checks should be used instead of the legacy health checks. At an app.yaml level, this means defaulting to 'readiness_check' and 'liveness_check' values instead of 'health_check' ones. Once the legacy 'health_check' behavior is deprecated, and this value is always true, this setting can be removed."
    multiple_values = 
}

// ======================================================================
// Signature for Featuresettings
// ======================================================================

sig Featuresettings extends core/Resource {
    splitHealthChecks : one core/Boolean,
} {
    hasKind[featuresettings]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#errorhandler'
//
// ======================================================================

one sig errorhandler extends Kind {} {
    term = "errorhandler"
    scheme = "http://occi/gcpappengine#"
    title = "Custom static error page to be served when an error occurs."
    parent = core/resource
    attributes = errorhandler_errorCode + errorhandler_mimeType + errorhandler_staticFile
    no actions
    entities in Errorhandler
}

//
// OCCI attribute 'errorCode'
//
one sig errorhandler_errorCode extends Attribute {} {
    name = "errorCode"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Error condition this handler applies to."
    multiple_values = 
}

//
// OCCI attribute 'mimeType'
//
one sig errorhandler_mimeType extends Attribute {} {
    name = "mimeType"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "MIME type of file. Defaults to text/html."
    multiple_values = 
}

//
// OCCI attribute 'staticFile'
//
one sig errorhandler_staticFile extends Attribute {} {
    name = "staticFile"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Static file content to be served for this error."
    multiple_values = 
}

// ======================================================================
// Signature for Errorhandler
// ======================================================================

sig Errorhandler extends core/Resource {
    errorCode : one String,
    mimeType : one String,
    staticFile : one String,
} {
    hasKind[errorhandler]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#sslsettings'
//
// ======================================================================

one sig sslsettings extends Kind {} {
    term = "sslsettings"
    scheme = "http://occi/gcpappengine#"
    title = "SSL configuration for a DomainMapping resource."
    parent = core/resource
    attributes = sslsettings_certificateId
    no actions
    entities in Sslsettings
}

//
// OCCI attribute 'certificateId'
//
one sig sslsettings_certificateId extends Attribute {} {
    name = "certificateId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support. Example: 12345."
    multiple_values = 
}

// ======================================================================
// Signature for Sslsettings
// ======================================================================

sig Sslsettings extends core/Resource {
    certificateId : one String,
} {
    hasKind[sslsettings]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1'
//
// ======================================================================

one sig operationmetadatav1 extends Kind {} {
    term = "operationmetadatav1"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.longrunning.Operation."
    parent = core/resource
    attributes = operationmetadatav1_warning + operationmetadatav1_insertTime + operationmetadatav1_target + operationmetadatav1_user + operationmetadatav1_ephemeralMessage + operationmetadatav1_method + operationmetadatav1_endTime
    no actions
    entities in Operationmetadatav1
}

//
// OCCI attribute 'warning'
//
one sig operationmetadatav1_warning extends Attribute {} {
    name = "warning"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Durable messages that persist on every operation poll. @OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'insertTime'
//
one sig operationmetadatav1_insertTime extends Attribute {} {
    name = "insertTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation was created.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'target'
//
one sig operationmetadatav1_target extends Attribute {} {
    name = "target"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'user'
//
one sig operationmetadatav1_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "User who requested this operation.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'ephemeralMessage'
//
one sig operationmetadatav1_ephemeralMessage extends Attribute {} {
    name = "ephemeralMessage"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Ephemeral message that may change every time the operation is polled. @OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'method'
//
one sig operationmetadatav1_method extends Attribute {} {
    name = "method"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "API method that initiated this operation. Example: google.appengine.v1.Versions.CreateVersion.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'endTime'
//
one sig operationmetadatav1_endTime extends Attribute {} {
    name = "endTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation completed.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Operationmetadatav1
// ======================================================================

sig Operationmetadatav1 extends core/Resource {
    warning : one array,
    insertTime : one String,
    target : one String,
    user : one String,
    ephemeralMessage : one String,
    method : one String,
    endTime : one String,
} {
    hasKind[operationmetadatav1]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#featuresettingslink'
//
// ======================================================================

one sig featuresettingslink extends Kind {} {
    term = "featuresettingslink"
    scheme = "http://occi/gcpappengine#"
    title = "The feature specific settings to be used in the application."
    parent = core/link
    no attributes
    no actions
    entities in Featuresettingslink
}

// ======================================================================
// Signature for Featuresettingslink
// ======================================================================

sig Featuresettingslink extends core/Link {
} {
    hasKind[featuresettingslink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#identityawareproxylink'
//
// ======================================================================

one sig identityawareproxylink extends Kind {} {
    term = "identityawareproxylink"
    scheme = "http://occi/gcpappengine#"
    no title
    parent = core/link
    no attributes
    no actions
    entities in Identityawareproxylink
}

// ======================================================================
// Signature for Identityawareproxylink
// ======================================================================

sig Identityawareproxylink extends core/Link {
} {
    hasKind[identityawareproxylink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#application'
//
// ======================================================================

one sig application extends Kind {} {
    term = "application"
    scheme = "http://occi/gcpappengine#"
    title = "An Application resource contains the top-level configuration of an App Engine application. Next tag: 20"
    parent = core/resource
    attributes = application_dispatchRules + application_gcrDomain + application_name + application_defaultCookieExpiration + application_locationId + application_servingStatus + application_defaultHostname + application_authDomain + application_codeBucket + application_defaultBucket
    actions = application_repair + application_get + application_patch + application_create
    entities in Application
}

//
// OCCI attribute 'dispatchRules'
//
one sig application_dispatchRules extends Attribute {} {
    name = "dispatchRules"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20 dispatch rules can be supported.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'gcrDomain'
//
one sig application_gcrDomain extends Attribute {} {
    name = "gcrDomain"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The Google Container Registry domain used for storing managed build docker images for this application."
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig application_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'defaultCookieExpiration'
//
one sig application_defaultCookieExpiration extends Attribute {} {
    name = "defaultCookieExpiration"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Cookie expiration policy for this application."
    multiple_values = 
}

//
// OCCI attribute 'locationId'
//
one sig application_locationId extends Attribute {} {
    name = "locationId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Location from which this application will be run. Application instances will run out of data centers in the chosen location, which is also where all of the application's end user content is stored.Defaults to us-central.Options are:us-central - Central USeurope-west - Western Europeus-east1 - Eastern US"
    multiple_values = 
}

//
// OCCI attribute 'servingStatus'
//
one sig application_servingStatus extends Attribute {} {
    name = "servingStatus"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Serving status of this application."
    multiple_values = 
}

//
// OCCI attribute 'defaultHostname'
//
one sig application_defaultHostname extends Attribute {} {
    name = "defaultHostname"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Hostname used to reach this application, as resolved by App Engine.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'authDomain'
//
one sig application_authDomain extends Attribute {} {
    name = "authDomain"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account."
    multiple_values = 
}

//
// OCCI attribute 'codeBucket'
//
one sig application_codeBucket extends Attribute {} {
    name = "codeBucket"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can be used by the gcloud deployment commands.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'defaultBucket'
//
one sig application_defaultBucket extends Attribute {} {
    name = "defaultBucket"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/application/action#repair'
//
one sig application_repair extends Action {} {
    term = "repair"
    scheme = "http://occi/gcpappengine/application/action#"
    title = "Recreates the required App Engine features for the specified App Engine application, for example a Cloud Storage bucket or App Engine service account. Use this method if you receive an error message about a missing feature, for example, Error retrieving the App Engine service account."
    attributes = repair_appsId
}

//
// OCCI attribute 'appsId'
//
one sig repair_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the application to repair. Example: apps/myapp"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/application/action#get'
//
one sig application_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/application/action#"
    title = "Gets information about an application."
    attributes = get_appsId
}

//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the Application resource to get. Example: apps/myapp."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/application/action#patch'
//
one sig application_patch extends Action {} {
    term = "patch"
    scheme = "http://occi/gcpappengine/application/action#"
    title = "Updates the specified Application resource. You can update the following fields:
    auth_domain - Google authentication domain for controlling user access to the application.
    default_cookie_expiration - Cookie expiration policy for the application."
    attributes = patch_updateMask + patch_appsId
}

//
// OCCI attribute 'updateMask'
//
one sig patch_updateMask extends Attribute {} {
    name = "updateMask"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard field mask for the set of fields to be updated."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig patch_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the Application resource to update. Example: apps/myapp."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/application/action#create'
//
one sig application_create extends Action {} {
    term = "create"
    scheme = "http://occi/gcpappengine/application/action#"
    title = "Creates an App Engine application for a Google Cloud Platform project. Required fields:
    id - The ID of the target Cloud Platform project.
    location - The region (https://cloud.google.com/appengine/docs/locations) where you want the App Engine application located.For more information about App Engine applications, see Managing Projects, Applications, and Billing (https://cloud.google.com/appengine/docs/python/console/)."
    no attributes
}


// ======================================================================
// Signature for Application
// ======================================================================

sig Application extends core/Resource {
    dispatchRules : one array,
    gcrDomain : one String,
    name : one String,
    defaultCookieExpiration : one String,
    locationId : one String,
    servingStatus : one String,
    defaultHostname : one String,
    authDomain : one String,
    codeBucket : one String,
    defaultBucket : one String,
} {
    hasKind[application]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#network'
//
// ======================================================================

one sig network extends Kind {} {
    term = "network"
    scheme = "http://occi/gcpappengine#"
    title = "Extra network settings. Only applicable for App Engine flexible environment versions"
    parent = core/resource
    attributes = network_name + network_forwardedPorts + network_instanceTag + network_subnetworkName
    no actions
    entities in Network
}

//
// OCCI attribute 'name'
//
one sig network_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default."
    multiple_values = 
}

//
// OCCI attribute 'forwardedPorts'
//
one sig network_forwardedPorts extends Attribute {} {
    name = "forwardedPorts"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable for App Engine flexible environment versions."
    multiple_values = 
}

//
// OCCI attribute 'instanceTag'
//
one sig network_instanceTag extends Attribute {} {
    name = "instanceTag"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Tag to apply to the VM instance during creation. Only applicable for for App Engine flexible environment versions."
    multiple_values = 
}

//
// OCCI attribute 'subnetworkName'
//
one sig network_subnetworkName extends Attribute {} {
    name = "subnetworkName"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network.
    If the network the VM instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
    If the network the VM instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
    If the network the VM instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application."
    multiple_values = 
}

// ======================================================================
// Signature for Network
// ======================================================================

sig Network extends core/Resource {
    name : one String,
    forwardedPorts : one array,
    instanceTag : one String,
    subnetworkName : one String,
} {
    hasKind[network]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#instance'
//
// ======================================================================

one sig instance extends Kind {} {
    term = "instance"
    scheme = "http://occi/gcpappengine#"
    title = "An Instance resource is the computing unit that App Engine uses to automatically scale an application."
    parent = core/resource
    attributes = instance_averageLatency + instance_memoryUsage + instance_vmIp + instance_availability + instance_vmStatus + instance_errors + instance_startTime + instance_vmDebugEnabled + instance_requests + instance_appEngineRelease + instance_vmName + instance_qps + instance_vmId + instance_vmZoneName + instance_name
    actions = instance_list + instance_get + instance_debug + instance_delete
    entities in Instance
}

//
// OCCI attribute 'averageLatency'
//
one sig instance_averageLatency extends Attribute {} {
    name = "averageLatency"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Average latency (ms) over the last minute.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'memoryUsage'
//
one sig instance_memoryUsage extends Attribute {} {
    name = "memoryUsage"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Total memory in use (bytes).@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vmIp'
//
one sig instance_vmIp extends Attribute {} {
    name = "vmIp"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The IP address of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'availability'
//
one sig instance_availability extends Attribute {} {
    name = "availability"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Availability of the instance.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vmStatus'
//
one sig instance_vmStatus extends Attribute {} {
    name = "vmStatus"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'errors'
//
one sig instance_errors extends Attribute {} {
    name = "errors"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of errors since this instance was started.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'startTime'
//
one sig instance_startTime extends Attribute {} {
    name = "startTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this instance was started.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vmDebugEnabled'
//
one sig instance_vmDebugEnabled extends Attribute {} {
    name = "vmDebugEnabled"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'requests'
//
one sig instance_requests extends Attribute {} {
    name = "requests"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of requests since this instance was started.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'appEngineRelease'
//
one sig instance_appEngineRelease extends Attribute {} {
    name = "appEngineRelease"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "App Engine release this instance is running on.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vmName'
//
one sig instance_vmName extends Attribute {} {
    name = "vmName"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'qps'
//
one sig instance_qps extends Attribute {} {
    name = "qps"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Average queries per second (QPS) over the last minute.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vmId'
//
one sig instance_vmId extends Attribute {} {
    name = "vmId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vmZoneName'
//
one sig instance_vmZoneName extends Attribute {} {
    name = "vmZoneName"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig instance_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/instance/action#list'
//
one sig instance_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/instance/action#"
    title = "Lists the instances of a version.Tip: To aggregate details about instances over time, see the Stackdriver Monitoring API (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list)."
    attributes = list_servicesId + list_appsId + list_pageToken + list_pageSize + list_versionsId
}

//
// OCCI attribute 'servicesId'
//
one sig list_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Version resource. Example: apps/myapp/services/default/versions/v1."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}
//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}
//
// OCCI attribute 'versionsId'
//
one sig list_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/instance/action#get'
//
one sig instance_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/instance/action#"
    title = "Gets instance information."
    attributes = get_servicesId + get_appsId + get_instancesId + get_versionsId
}

//
// OCCI attribute 'servicesId'
//
one sig get_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1."
    multiple_values = 
}
//
// OCCI attribute 'instancesId'
//
one sig get_instancesId extends Attribute {} {
    name = "instancesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'versionsId'
//
one sig get_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/instance/action#debug'
//
one sig instance_debug extends Action {} {
    term = "debug"
    scheme = "http://occi/gcpappengine/instance/action#"
    title = "Enables debugging on a VM instance. This allows you to use the SSH command to connect to the virtual machine where the instance lives. While in "debug mode", the instance continues to serve live traffic. You should delete the instance when you are done debugging and then allow the system to take over and determine if another instance should be started.Only applicable for instances in App Engine flexible environment."
    attributes = debug_servicesId + debug_appsId + debug_instancesId + debug_versionsId
}

//
// OCCI attribute 'servicesId'
//
one sig debug_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig debug_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1."
    multiple_values = 
}
//
// OCCI attribute 'instancesId'
//
one sig debug_instancesId extends Attribute {} {
    name = "instancesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'versionsId'
//
one sig debug_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/instance/action#delete'
//
one sig instance_delete extends Action {} {
    term = "delete"
    scheme = "http://occi/gcpappengine/instance/action#"
    title = "Stops a running instance."
    attributes = delete_appsId + delete_instancesId + delete_versionsId + delete_servicesId
}

//
// OCCI attribute 'appsId'
//
one sig delete_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1/instances/instance-1."
    multiple_values = 
}
//
// OCCI attribute 'instancesId'
//
one sig delete_instancesId extends Attribute {} {
    name = "instancesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'versionsId'
//
one sig delete_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig delete_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

// ======================================================================
// Signature for Instance
// ======================================================================

sig Instance extends core/Resource {
    averageLatency : one core/Integer,
    memoryUsage : one String,
    vmIp : one String,
    availability : one String,
    vmStatus : one String,
    errors : one core/Integer,
    startTime : one String,
    vmDebugEnabled : one core/Boolean,
    requests : one core/Integer,
    appEngineRelease : one String,
    vmName : one String,
    qps : one core/Integer,
    vmId : one String,
    vmZoneName : one String,
    name : one String,
} {
    hasKind[instance]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#livenesscheck'
//
// ======================================================================

one sig livenesscheck extends Kind {} {
    term = "livenesscheck"
    scheme = "http://occi/gcpappengine#"
    title = "Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances."
    parent = core/resource
    attributes = livenesscheck_failureThreshold + livenesscheck_timeout + livenesscheck_initialDelay + livenesscheck_path + livenesscheck_host + livenesscheck_successThreshold + livenesscheck_checkInterval
    no actions
    entities in Livenesscheck
}

//
// OCCI attribute 'failureThreshold'
//
one sig livenesscheck_failureThreshold extends Attribute {} {
    name = "failureThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive failed checks required before considering the VM unhealthy."
    multiple_values = 
}

//
// OCCI attribute 'timeout'
//
one sig livenesscheck_timeout extends Attribute {} {
    name = "timeout"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time before the check is considered failed."
    multiple_values = 
}

//
// OCCI attribute 'initialDelay'
//
one sig livenesscheck_initialDelay extends Attribute {} {
    name = "initialDelay"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The initial delay before starting to execute the checks."
    multiple_values = 
}

//
// OCCI attribute 'path'
//
one sig livenesscheck_path extends Attribute {} {
    name = "path"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The request path."
    multiple_values = 
}

//
// OCCI attribute 'host'
//
one sig livenesscheck_host extends Attribute {} {
    name = "host"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Host header to send when performing a HTTP Liveness check. Example: "myapp.appspot.com""
    multiple_values = 
}

//
// OCCI attribute 'successThreshold'
//
one sig livenesscheck_successThreshold extends Attribute {} {
    name = "successThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive successful checks required before considering the VM healthy."
    multiple_values = 
}

//
// OCCI attribute 'checkInterval'
//
one sig livenesscheck_checkInterval extends Attribute {} {
    name = "checkInterval"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Interval between health checks."
    multiple_values = 
}

// ======================================================================
// Signature for Livenesscheck
// ======================================================================

sig Livenesscheck extends core/Resource {
    failureThreshold : one core/Integer,
    timeout : one String,
    initialDelay : one String,
    path : one String,
    host : one String,
    successThreshold : one core/Integer,
    checkInterval : one String,
} {
    hasKind[livenesscheck]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#batchupdateingressrulesrequest'
//
// ======================================================================

one sig batchupdateingressrulesrequest extends Kind {} {
    term = "batchupdateingressrulesrequest"
    scheme = "http://occi/gcpappengine#"
    title = "Request message for Firewall.BatchUpdateIngressRules."
    parent = core/resource
    attributes = batchupdateingressrulesrequest_ingressRules
    no actions
    entities in Batchupdateingressrulesrequest
}

//
// OCCI attribute 'ingressRules'
//
one sig batchupdateingressrulesrequest_ingressRules extends Attribute {} {
    name = "ingressRules"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "A list of FirewallRules to replace the existing set."
    multiple_values = 
}

// ======================================================================
// Signature for Batchupdateingressrulesrequest
// ======================================================================

sig Batchupdateingressrulesrequest extends core/Resource {
    ingressRules : one array,
} {
    hasKind[batchupdateingressrulesrequest]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#networkutilization'
//
// ======================================================================

one sig networkutilization extends Kind {} {
    term = "networkutilization"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by network usage. Only applicable for VM runtimes."
    parent = core/resource
    attributes = networkutilization_targetSentPacketsPerSecond + networkutilization_targetReceivedBytesPerSecond + networkutilization_targetReceivedPacketsPerSecond + networkutilization_targetSentBytesPerSecond
    no actions
    entities in Networkutilization
}

//
// OCCI attribute 'targetSentPacketsPerSecond'
//
one sig networkutilization_targetSentPacketsPerSecond extends Attribute {} {
    name = "targetSentPacketsPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target packets sent per second."
    multiple_values = 
}

//
// OCCI attribute 'targetReceivedBytesPerSecond'
//
one sig networkutilization_targetReceivedBytesPerSecond extends Attribute {} {
    name = "targetReceivedBytesPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target bytes received per second."
    multiple_values = 
}

//
// OCCI attribute 'targetReceivedPacketsPerSecond'
//
one sig networkutilization_targetReceivedPacketsPerSecond extends Attribute {} {
    name = "targetReceivedPacketsPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target packets received per second."
    multiple_values = 
}

//
// OCCI attribute 'targetSentBytesPerSecond'
//
one sig networkutilization_targetSentBytesPerSecond extends Attribute {} {
    name = "targetSentBytesPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target bytes sent per second."
    multiple_values = 
}

// ======================================================================
// Signature for Networkutilization
// ======================================================================

sig Networkutilization extends core/Resource {
    targetSentPacketsPerSecond : one core/Integer,
    targetReceivedBytesPerSecond : one core/Integer,
    targetReceivedPacketsPerSecond : one core/Integer,
    targetSentBytesPerSecond : one core/Integer,
} {
    hasKind[networkutilization]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#location'
//
// ======================================================================

one sig location extends Kind {} {
    term = "location"
    scheme = "http://occi/gcpappengine#"
    title = "A resource that represents Google Cloud Platform location."
    parent = core/resource
    attributes = location_metadata + location_labels + location_name + location_locationId
    actions = location_list + location_get
    entities in Location
}

//
// OCCI attribute 'metadata'
//
one sig location_metadata extends Attribute {} {
    name = "metadata"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "Service-specific metadata. For example the available capacity at the given location."
    multiple_values = 
}

//
// OCCI attribute 'labels'
//
one sig location_labels extends Attribute {} {
    name = "labels"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "Cross-service attributes for the location. For example
    {"cloud.googleapis.com/region": "us-east1"}
    "
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig location_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Resource name for the location, which may vary between implementations. For example: "projects/example-project/locations/us-east1""
    multiple_values = 
}

//
// OCCI attribute 'locationId'
//
one sig location_locationId extends Attribute {} {
    name = "locationId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The canonical id for this location. For example: "us-east1"."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/location/action#list'
//
one sig location_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/location/action#"
    title = "Lists information about the supported locations for this service."
    attributes = list_pageSize + list_filter + list_appsId + list_pageToken
}

//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "The standard list page size."
    multiple_values = 
}
//
// OCCI attribute 'filter'
//
one sig list_filter extends Attribute {} {
    name = "filter"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The standard list filter."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. The resource that owns the locations collection, if applicable."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The standard list page token."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/location/action#get'
//
one sig location_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/location/action#"
    title = "Get information about a location."
    attributes = get_locationsId + get_appsId
}

//
// OCCI attribute 'locationsId'
//
one sig get_locationsId extends Attribute {} {
    name = "locationsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Resource name for the location."
    multiple_values = 
}

// ======================================================================
// Signature for Location
// ======================================================================

sig Location extends core/Resource {
    metadata : one map,
    labels : one map,
    name : one String,
    locationId : one String,
} {
    hasKind[location]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#healthcheck'
//
// ======================================================================

one sig healthcheck extends Kind {} {
    term = "healthcheck"
    scheme = "http://occi/gcpappengine#"
    title = "Health checking configuration for VM instances. Unhealthy instances are killed and replaced with new instances. Only applicable for instances in App Engine flexible environment."
    parent = core/resource
    attributes = healthcheck_timeout + healthcheck_unhealthyThreshold + healthcheck_disableHealthCheck + healthcheck_host + healthcheck_healthyThreshold + healthcheck_restartThreshold + healthcheck_checkInterval
    no actions
    entities in Healthcheck
}

//
// OCCI attribute 'timeout'
//
one sig healthcheck_timeout extends Attribute {} {
    name = "timeout"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time before the health check is considered failed."
    multiple_values = 
}

//
// OCCI attribute 'unhealthyThreshold'
//
one sig healthcheck_unhealthyThreshold extends Attribute {} {
    name = "unhealthyThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive failed health checks required before removing traffic."
    multiple_values = 
}

//
// OCCI attribute 'disableHealthCheck'
//
one sig healthcheck_disableHealthCheck extends Attribute {} {
    name = "disableHealthCheck"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether to explicitly disable health checks for this instance."
    multiple_values = 
}

//
// OCCI attribute 'host'
//
one sig healthcheck_host extends Attribute {} {
    name = "host"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Host header to send when performing an HTTP health check. Example: "myapp.appspot.com""
    multiple_values = 
}

//
// OCCI attribute 'healthyThreshold'
//
one sig healthcheck_healthyThreshold extends Attribute {} {
    name = "healthyThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive successful health checks required before receiving traffic."
    multiple_values = 
}

//
// OCCI attribute 'restartThreshold'
//
one sig healthcheck_restartThreshold extends Attribute {} {
    name = "restartThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive failed health checks required before an instance is restarted."
    multiple_values = 
}

//
// OCCI attribute 'checkInterval'
//
one sig healthcheck_checkInterval extends Attribute {} {
    name = "checkInterval"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Interval between health checks."
    multiple_values = 
}

// ======================================================================
// Signature for Healthcheck
// ======================================================================

sig Healthcheck extends core/Resource {
    timeout : one String,
    unhealthyThreshold : one core/Integer,
    disableHealthCheck : one core/Boolean,
    host : one String,
    healthyThreshold : one core/Integer,
    restartThreshold : one core/Integer,
    checkInterval : one String,
} {
    hasKind[healthcheck]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#readinesscheck'
//
// ======================================================================

one sig readinesscheck extends Kind {} {
    term = "readinesscheck"
    scheme = "http://occi/gcpappengine#"
    title = "Readiness checking configuration for VM instances. Unhealthy instances are removed from traffic rotation."
    parent = core/resource
    attributes = readinesscheck_path + readinesscheck_host + readinesscheck_successThreshold + readinesscheck_checkInterval + readinesscheck_failureThreshold + readinesscheck_timeout + readinesscheck_appStartTimeout
    no actions
    entities in Readinesscheck
}

//
// OCCI attribute 'path'
//
one sig readinesscheck_path extends Attribute {} {
    name = "path"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The request path."
    multiple_values = 
}

//
// OCCI attribute 'host'
//
one sig readinesscheck_host extends Attribute {} {
    name = "host"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Host header to send when performing a HTTP Readiness check. Example: "myapp.appspot.com""
    multiple_values = 
}

//
// OCCI attribute 'successThreshold'
//
one sig readinesscheck_successThreshold extends Attribute {} {
    name = "successThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive successful checks required before receiving traffic."
    multiple_values = 
}

//
// OCCI attribute 'checkInterval'
//
one sig readinesscheck_checkInterval extends Attribute {} {
    name = "checkInterval"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Interval between health checks."
    multiple_values = 
}

//
// OCCI attribute 'failureThreshold'
//
one sig readinesscheck_failureThreshold extends Attribute {} {
    name = "failureThreshold"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of consecutive failed checks required before removing traffic."
    multiple_values = 
}

//
// OCCI attribute 'timeout'
//
one sig readinesscheck_timeout extends Attribute {} {
    name = "timeout"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time before the check is considered failed."
    multiple_values = 
}

//
// OCCI attribute 'appStartTimeout'
//
one sig readinesscheck_appStartTimeout extends Attribute {} {
    name = "appStartTimeout"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic."
    multiple_values = 
}

// ======================================================================
// Signature for Readinesscheck
// ======================================================================

sig Readinesscheck extends core/Resource {
    path : one String,
    host : one String,
    successThreshold : one core/Integer,
    checkInterval : one String,
    failureThreshold : one core/Integer,
    timeout : one String,
    appStartTimeout : one String,
} {
    hasKind[readinesscheck]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#debuginstancerequest'
//
// ======================================================================

one sig debuginstancerequest extends Kind {} {
    term = "debuginstancerequest"
    scheme = "http://occi/gcpappengine#"
    title = "Request message for Instances.DebugInstance."
    parent = core/resource
    attributes = debuginstancerequest_sshKey
    no actions
    entities in Debuginstancerequest
}

//
// OCCI attribute 'sshKey'
//
one sig debuginstancerequest_sshKey extends Attribute {} {
    name = "sshKey"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Public SSH key to add to the instance. Examples:
    [USERNAME]:ssh-rsa [KEY_VALUE] [USERNAME]
    [USERNAME]:ssh-rsa [KEY_VALUE] google-ssh {"userName":"[USERNAME]","expireOn":"[EXPIRE_TIME]"}For more information, see Adding and Removing SSH Keys (https://cloud.google.com/compute/docs/instances/adding-removing-ssh-keys)."
    multiple_values = 
}

// ======================================================================
// Signature for Debuginstancerequest
// ======================================================================

sig Debuginstancerequest extends core/Resource {
    sshKey : one String,
} {
    hasKind[debuginstancerequest]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1beta5'
//
// ======================================================================

one sig operationmetadatav1beta5 extends Kind {} {
    term = "operationmetadatav1beta5"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.longrunning.Operation."
    parent = core/resource
    attributes = operationmetadatav1beta5_insertTime + operationmetadatav1beta5_endTime + operationmetadatav1beta5_user + operationmetadatav1beta5_target + operationmetadatav1beta5_method
    no actions
    entities in Operationmetadatav1beta5
}

//
// OCCI attribute 'insertTime'
//
one sig operationmetadatav1beta5_insertTime extends Attribute {} {
    name = "insertTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Timestamp that this operation was created.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'endTime'
//
one sig operationmetadatav1beta5_endTime extends Attribute {} {
    name = "endTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Timestamp that this operation completed.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'user'
//
one sig operationmetadatav1beta5_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "User who requested this operation.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'target'
//
one sig operationmetadatav1beta5_target extends Attribute {} {
    name = "target"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'method'
//
one sig operationmetadatav1beta5_method extends Attribute {} {
    name = "method"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "API method name that initiated this operation. Example: google.appengine.v1beta5.Version.CreateVersion.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Operationmetadatav1beta5
// ======================================================================

sig Operationmetadatav1beta5 extends core/Resource {
    insertTime : one String,
    endTime : one String,
    user : one String,
    target : one String,
    method : one String,
} {
    hasKind[operationmetadatav1beta5]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#automaticscalinglink'
//
// ======================================================================

one sig automaticscalinglink extends Kind {} {
    term = "automaticscalinglink"
    scheme = "http://occi/gcpappengine#"
    title = "Automatic scaling is based on request rate, response latencies, and other application metrics."
    parent = core/link
    no attributes
    no actions
    entities in Automaticscalinglink
}

// ======================================================================
// Signature for Automaticscalinglink
// ======================================================================

sig Automaticscalinglink extends core/Link {
} {
    hasKind[automaticscalinglink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#healthchecklink'
//
// ======================================================================

one sig healthchecklink extends Kind {} {
    term = "healthchecklink"
    scheme = "http://occi/gcpappengine#"
    title = "Configures health checking for VM instances. Unhealthy instances are stopped and replaced with new instances. Only applicable for VM runtimes.Only returned in GET requests if view=FULL is set."
    parent = core/link
    no attributes
    no actions
    entities in Healthchecklink
}

// ======================================================================
// Signature for Healthchecklink
// ======================================================================

sig Healthchecklink extends core/Link {
} {
    hasKind[healthchecklink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#readinesschecklink'
//
// ======================================================================

one sig readinesschecklink extends Kind {} {
    term = "readinesschecklink"
    scheme = "http://occi/gcpappengine#"
    title = "Configures readiness health checking for VM instances. Unhealthy instances are not put into the backend traffic rotation.Only returned in GET requests if view=FULL is set."
    parent = core/link
    no attributes
    no actions
    entities in Readinesschecklink
}

// ======================================================================
// Signature for Readinesschecklink
// ======================================================================

sig Readinesschecklink extends core/Link {
} {
    hasKind[readinesschecklink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#manualscalinglink'
//
// ======================================================================

one sig manualscalinglink extends Kind {} {
    term = "manualscalinglink"
    scheme = "http://occi/gcpappengine#"
    title = "A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time."
    parent = core/link
    no attributes
    no actions
    entities in Manualscalinglink
}

// ======================================================================
// Signature for Manualscalinglink
// ======================================================================

sig Manualscalinglink extends core/Link {
} {
    hasKind[manualscalinglink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiconfighandlerlink'
//
// ======================================================================

one sig apiconfighandlerlink extends Kind {} {
    term = "apiconfighandlerlink"
    scheme = "http://occi/gcpappengine#"
    title = "Serving configuration for Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/).Only returned in GET requests if view=FULL is set."
    parent = core/link
    no attributes
    no actions
    entities in Apiconfighandlerlink
}

// ======================================================================
// Signature for Apiconfighandlerlink
// ======================================================================

sig Apiconfighandlerlink extends core/Link {
} {
    hasKind[apiconfighandlerlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#endpointsapiservicelink'
//
// ======================================================================

one sig endpointsapiservicelink extends Kind {} {
    term = "endpointsapiservicelink"
    scheme = "http://occi/gcpappengine#"
    title = "Cloud Endpoints configuration.If endpoints_api_service is set, the Cloud Endpoints Extensible Service Proxy will be provided to serve the API implemented by the app."
    parent = core/link
    no attributes
    no actions
    entities in Endpointsapiservicelink
}

// ======================================================================
// Signature for Endpointsapiservicelink
// ======================================================================

sig Endpointsapiservicelink extends core/Link {
} {
    hasKind[endpointsapiservicelink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#deploymentlink'
//
// ======================================================================

one sig deploymentlink extends Kind {} {
    term = "deploymentlink"
    scheme = "http://occi/gcpappengine#"
    title = "Code and application artifacts that make up this version.Only returned in GET requests if view=FULL is set."
    parent = core/link
    no attributes
    no actions
    entities in Deploymentlink
}

// ======================================================================
// Signature for Deploymentlink
// ======================================================================

sig Deploymentlink extends core/Link {
} {
    hasKind[deploymentlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#resourceslink'
//
// ======================================================================

one sig resourceslink extends Kind {} {
    term = "resourceslink"
    scheme = "http://occi/gcpappengine#"
    title = "Machine resources for this version. Only applicable for VM runtimes."
    parent = core/link
    no attributes
    no actions
    entities in Resourceslink
}

// ======================================================================
// Signature for Resourceslink
// ======================================================================

sig Resourceslink extends core/Link {
} {
    hasKind[resourceslink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#basicscalinglink'
//
// ======================================================================

one sig basicscalinglink extends Kind {} {
    term = "basicscalinglink"
    scheme = "http://occi/gcpappengine#"
    title = "A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity."
    parent = core/link
    no attributes
    no actions
    entities in Basicscalinglink
}

// ======================================================================
// Signature for Basicscalinglink
// ======================================================================

sig Basicscalinglink extends core/Link {
} {
    hasKind[basicscalinglink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#livenesschecklink'
//
// ======================================================================

one sig livenesschecklink extends Kind {} {
    term = "livenesschecklink"
    scheme = "http://occi/gcpappengine#"
    title = "Configures liveness health checking for VM instances. Unhealthy instances are stopped and replaced with new instancesOnly returned in GET requests if view=FULL is set."
    parent = core/link
    no attributes
    no actions
    entities in Livenesschecklink
}

// ======================================================================
// Signature for Livenesschecklink
// ======================================================================

sig Livenesschecklink extends core/Link {
} {
    hasKind[livenesschecklink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#networklink'
//
// ======================================================================

one sig networklink extends Kind {} {
    term = "networklink"
    scheme = "http://occi/gcpappengine#"
    title = "Extra network settings. Only applicable for App Engine flexible environment versions."
    parent = core/link
    no attributes
    no actions
    entities in Networklink
}

// ======================================================================
// Signature for Networklink
// ======================================================================

sig Networklink extends core/Link {
} {
    hasKind[networklink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#version'
//
// ======================================================================

one sig version extends Kind {} {
    term = "version"
    scheme = "http://occi/gcpappengine#"
    title = "A Version resource is a specific set of source code and configuration files that are deployed into a service."
    parent = core/resource
    attributes = version_env + version_handlers + version_diskUsageBytes + version_threadsafe + version_name + version_vm + version_versionUrl + version_instanceClass + version_servingStatus + version_runtimeApiVersion + version_createTime + version_inboundServices + version_errorHandlers + version_defaultExpiration + version_libraries + version_nobuildFilesRegex + version_runtime + version_createdBy + version_envVariables + version_betaSettings
    actions = version_delete + version_list + version_get + version_patch + version_create
    entities in Version
}

//
// OCCI attribute 'env'
//
one sig version_env extends Attribute {} {
    name = "env"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "App Engine execution environment for this version.Defaults to standard."
    multiple_values = 
}

//
// OCCI attribute 'handlers'
//
one sig version_handlers extends Attribute {} {
    name = "handlers"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "An ordered list of URL-matching patterns that should be applied to incoming requests. The first matching URL handles the request and other request handlers are not attempted.Only returned in GET requests if view=FULL is set."
    multiple_values = 
}

//
// OCCI attribute 'diskUsageBytes'
//
one sig version_diskUsageBytes extends Attribute {} {
    name = "diskUsageBytes"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Total size in bytes of all the files that are included in this version and curerntly hosted on the App Engine disk.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'threadsafe'
//
one sig version_threadsafe extends Attribute {} {
    name = "threadsafe"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether multiple requests can be dispatched to this version at once."
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig version_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the Version resource in the API. Example: apps/myapp/services/default/versions/v1.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'vm'
//
one sig version_vm extends Attribute {} {
    name = "vm"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether to deploy this version in a container on a virtual machine."
    multiple_values = 
}

//
// OCCI attribute 'versionUrl'
//
one sig version_versionUrl extends Attribute {} {
    name = "versionUrl"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Serving URL for this version. Example: "https://myversion-dot-myservice-dot-myapp.appspot.com"@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'instanceClass'
//
one sig version_instanceClass extends Attribute {} {
    name = "instanceClass"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Instance class that is used to run this version. Valid values are:
    AutomaticScaling: F1, F2, F4, F4_1G
    ManualScaling or BasicScaling: B1, B2, B4, B8, B4_1GDefaults to F1 for AutomaticScaling and B1 for ManualScaling or BasicScaling."
    multiple_values = 
}

//
// OCCI attribute 'servingStatus'
//
one sig version_servingStatus extends Attribute {} {
    name = "servingStatus"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Current serving status of this version. Only the versions with a SERVING status create instances and can be billed.SERVING_STATUS_UNSPECIFIED is an invalid value. Defaults to SERVING."
    multiple_values = 
}

//
// OCCI attribute 'runtimeApiVersion'
//
one sig version_runtimeApiVersion extends Attribute {} {
    name = "runtimeApiVersion"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The version of the API in the given runtime environment. Please see the app.yaml reference for valid values at https://cloud.google.com/appengine/docs/standard/<language>/config/appref"
    multiple_values = 
}

//
// OCCI attribute 'createTime'
//
one sig version_createTime extends Attribute {} {
    name = "createTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this version was created.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'inboundServices'
//
one sig version_inboundServices extends Attribute {} {
    name = "inboundServices"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Before an application can receive email or XMPP messages, the application must be configured to enable the service."
    multiple_values = 
}

//
// OCCI attribute 'errorHandlers'
//
one sig version_errorHandlers extends Attribute {} {
    name = "errorHandlers"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Custom static error pages. Limited to 10KB per page.Only returned in GET requests if view=FULL is set."
    multiple_values = 
}

//
// OCCI attribute 'defaultExpiration'
//
one sig version_defaultExpiration extends Attribute {} {
    name = "defaultExpiration"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Duration that static files should be cached by web proxies and browsers. Only applicable if the corresponding StaticFilesHandler (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#staticfileshandler) does not specify its own expiration time.Only returned in GET requests if view=FULL is set."
    multiple_values = 
}

//
// OCCI attribute 'libraries'
//
one sig version_libraries extends Attribute {} {
    name = "libraries"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Configuration for third-party Python runtime libraries that are required by the application.Only returned in GET requests if view=FULL is set."
    multiple_values = 
}

//
// OCCI attribute 'nobuildFilesRegex'
//
one sig version_nobuildFilesRegex extends Attribute {} {
    name = "nobuildFilesRegex"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Files that match this pattern will not be built into this version. Only applicable for Go runtimes.Only returned in GET requests if view=FULL is set."
    multiple_values = 
}

//
// OCCI attribute 'runtime'
//
one sig version_runtime extends Attribute {} {
    name = "runtime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Desired runtime. Example: python27."
    multiple_values = 
}

//
// OCCI attribute 'createdBy'
//
one sig version_createdBy extends Attribute {} {
    name = "createdBy"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Email address of the user who created this version.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'envVariables'
//
one sig version_envVariables extends Attribute {} {
    name = "envVariables"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "Environment variables available to the application.Only returned in GET requests if view=FULL is set."
    multiple_values = 
}

//
// OCCI attribute 'betaSettings'
//
one sig version_betaSettings extends Attribute {} {
    name = "betaSettings"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "Metadata settings that are supplied to this version to enable beta runtime features."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/version/action#delete'
//
one sig version_delete extends Action {} {
    term = "delete"
    scheme = "http://occi/gcpappengine/version/action#"
    title = "Deletes an existing Version resource."
    attributes = delete_appsId + delete_versionsId + delete_servicesId
}

//
// OCCI attribute 'appsId'
//
one sig delete_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1."
    multiple_values = 
}
//
// OCCI attribute 'versionsId'
//
one sig delete_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig delete_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/version/action#list'
//
one sig version_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/version/action#"
    title = "Lists the versions of a service."
    attributes = list_pageSize + list_view + list_servicesId + list_appsId + list_pageToken
}

//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}
//
// OCCI attribute 'view'
//
one sig list_view extends Attribute {} {
    name = "view"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Controls the set of fields returned in the List response."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig list_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Service resource. Example: apps/myapp/services/default."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/version/action#get'
//
one sig version_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/version/action#"
    title = "Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource."
    attributes = get_versionsId + get_view + get_servicesId + get_appsId
}

//
// OCCI attribute 'versionsId'
//
one sig get_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'view'
//
one sig get_view extends Attribute {} {
    name = "view"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Controls the set of fields returned in the Get response."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig get_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/version/action#patch'
//
one sig version_patch extends Action {} {
    term = "patch"
    scheme = "http://occi/gcpappengine/version/action#"
    title = "Updates the specified Version resource. You can specify the following fields depending on the App Engine environment and type of scaling that the version resource uses:
    serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status):  For Version resources that use basic scaling, manual scaling, or run in  the App Engine flexible environment.
    instance_class (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class):  For Version resources that run in the App Engine standard environment.
    automatic_scaling.min_idle_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine standard environment.
    automatic_scaling.max_idle_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine standard environment.
    automatic_scaling.min_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
    automatic_scaling.max_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
    automatic_scaling.cool_down_period_sec (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment.
    automatic_scaling.cpu_utilization.target_utilization (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling):  For Version resources that use automatic scaling and run in the App  Engine Flexible environment."
    attributes = patch_updateMask + patch_servicesId + patch_appsId + patch_versionsId
}

//
// OCCI attribute 'updateMask'
//
one sig patch_updateMask extends Attribute {} {
    name = "updateMask"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard field mask for the set of fields to be updated."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig patch_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig patch_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource to update. Example: apps/myapp/services/default/versions/1."
    multiple_values = 
}
//
// OCCI attribute 'versionsId'
//
one sig patch_versionsId extends Attribute {} {
    name = "versionsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/version/action#create'
//
one sig version_create extends Action {} {
    term = "create"
    scheme = "http://occi/gcpappengine/version/action#"
    title = "Deploys code and resource files to a new version."
    attributes = create_appsId + create_servicesId
}

//
// OCCI attribute 'appsId'
//
one sig create_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent resource to create this version under. Example: apps/myapp/services/default."
    multiple_values = 
}
//
// OCCI attribute 'servicesId'
//
one sig create_servicesId extends Attribute {} {
    name = "servicesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. See documentation of `appsId`."
    multiple_values = 
}

// ======================================================================
// Signature for Version
// ======================================================================

sig Version extends core/Resource {
    env : one String,
    handlers : one array,
    diskUsageBytes : one String,
    threadsafe : one core/Boolean,
    name : one String,
    vm : one core/Boolean,
    versionUrl : one String,
    instanceClass : one String,
    servingStatus : one String,
    runtimeApiVersion : one String,
    createTime : one String,
    inboundServices : one array,
    errorHandlers : one array,
    defaultExpiration : one String,
    libraries : one array,
    nobuildFilesRegex : one String,
    runtime : one String,
    createdBy : one String,
    envVariables : one map,
    betaSettings : one map,
} {
    hasKind[version]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#repairapplicationrequest'
//
// ======================================================================

one sig repairapplicationrequest extends Kind {} {
    term = "repairapplicationrequest"
    scheme = "http://occi/gcpappengine#"
    title = "Request message for 'Applications.RepairApplication'."
    parent = core/resource
    no attributes
    no actions
    entities in Repairapplicationrequest
}

// ======================================================================
// Signature for Repairapplicationrequest
// ======================================================================

sig Repairapplicationrequest extends core/Resource {
} {
    hasKind[repairapplicationrequest]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#certificaterawdata'
//
// ======================================================================

one sig certificaterawdata extends Kind {} {
    term = "certificaterawdata"
    scheme = "http://occi/gcpappengine#"
    title = "An SSL certificate obtained from a certificate authority."
    parent = core/resource
    attributes = certificaterawdata_publicCertificate + certificaterawdata_privateKey
    no actions
    entities in Certificaterawdata
}

//
// OCCI attribute 'publicCertificate'
//
one sig certificaterawdata_publicCertificate extends Attribute {} {
    name = "publicCertificate"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: <pre> -----BEGIN CERTIFICATE----- <certificate_value> -----END CERTIFICATE----- </pre>"
    multiple_values = 
}

//
// OCCI attribute 'privateKey'
//
one sig certificaterawdata_privateKey extends Attribute {} {
    name = "privateKey"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: <pre> -----BEGIN RSA PRIVATE KEY----- <unencrypted_key_value> -----END RSA PRIVATE KEY----- </pre> @InputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Certificaterawdata
// ======================================================================

sig Certificaterawdata extends core/Resource {
    publicCertificate : one String,
    privateKey : one String,
} {
    hasKind[certificaterawdata]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#fileinfo'
//
// ======================================================================

one sig fileinfo extends Kind {} {
    term = "fileinfo"
    scheme = "http://occi/gcpappengine#"
    title = "Single source file that is part of the version to be deployed. Each source file that is deployed must be specified separately."
    parent = core/resource
    attributes = fileinfo_sourceUrl + fileinfo_sha1Sum + fileinfo_mimeType
    no actions
    entities in Fileinfo
}

//
// OCCI attribute 'sourceUrl'
//
one sig fileinfo_sourceUrl extends Attribute {} {
    name = "sourceUrl"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "URL source to use to fetch this file. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com/<bucket>/<object>'."
    multiple_values = 
}

//
// OCCI attribute 'sha1Sum'
//
one sig fileinfo_sha1Sum extends Attribute {} {
    name = "sha1Sum"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The SHA1 hash of the file, in hex."
    multiple_values = 
}

//
// OCCI attribute 'mimeType'
//
one sig fileinfo_mimeType extends Attribute {} {
    name = "mimeType"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The MIME type of the file.Defaults to the value from Google Cloud Storage."
    multiple_values = 
}

// ======================================================================
// Signature for Fileinfo
// ======================================================================

sig Fileinfo extends core/Resource {
    sourceUrl : one String,
    sha1Sum : one String,
    mimeType : one String,
} {
    hasKind[fileinfo]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#scripthandler'
//
// ======================================================================

one sig scripthandler extends Kind {} {
    term = "scripthandler"
    scheme = "http://occi/gcpappengine#"
    title = "Executes a script to handle the request that matches the URL pattern."
    parent = core/resource
    attributes = scripthandler_scriptPath
    no actions
    entities in Scripthandler
}

//
// OCCI attribute 'scriptPath'
//
one sig scripthandler_scriptPath extends Attribute {} {
    name = "scriptPath"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Path to the script from the application root directory."
    multiple_values = 
}

// ======================================================================
// Signature for Scripthandler
// ======================================================================

sig Scripthandler extends core/Resource {
    scriptPath : one String,
} {
    hasKind[scripthandler]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadataexperimental'
//
// ======================================================================

one sig operationmetadataexperimental extends Kind {} {
    term = "operationmetadataexperimental"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.longrunning.Operation."
    parent = core/resource
    attributes = operationmetadataexperimental_user + operationmetadataexperimental_target + operationmetadataexperimental_method + operationmetadataexperimental_insertTime + operationmetadataexperimental_endTime
    no actions
    entities in Operationmetadataexperimental
}

//
// OCCI attribute 'user'
//
one sig operationmetadataexperimental_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "User who requested this operation.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'target'
//
one sig operationmetadataexperimental_target extends Attribute {} {
    name = "target"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the resource that this operation is acting on. Example: apps/myapp/customDomains/example.com.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'method'
//
one sig operationmetadataexperimental_method extends Attribute {} {
    name = "method"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "API method that initiated this operation. Example: google.appengine.experimental.CustomDomains.CreateCustomDomain.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'insertTime'
//
one sig operationmetadataexperimental_insertTime extends Attribute {} {
    name = "insertTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation was created.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'endTime'
//
one sig operationmetadataexperimental_endTime extends Attribute {} {
    name = "endTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation completed.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Operationmetadataexperimental
// ======================================================================

sig Operationmetadataexperimental extends core/Resource {
    user : one String,
    target : one String,
    method : one String,
    insertTime : one String,
    endTime : one String,
} {
    hasKind[operationmetadataexperimental]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#authorizeddomain'
//
// ======================================================================

one sig authorizeddomain extends Kind {} {
    term = "authorizeddomain"
    scheme = "http://occi/gcpappengine#"
    title = "A domain that a user has been authorized to administer. To authorize use of a domain, verify ownership via Webmaster Central (https://www.google.com/webmasters/verification/home)."
    parent = core/resource
    attributes = authorizeddomain_name
    actions = authorizeddomain_list
    entities in Authorizeddomain
}

//
// OCCI attribute 'name'
//
one sig authorizeddomain_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the AuthorizedDomain resource in the API. Example: apps/myapp/authorizedDomains/example.com.@OutputOnly"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/authorizeddomain/action#list'
//
one sig authorizeddomain_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/authorizeddomain/action#"
    title = "Lists all domains the user is authorized to administer."
    attributes = list_appsId + list_pageToken + list_pageSize
}

//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Application resource. Example: apps/myapp."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}
//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}

// ======================================================================
// Signature for Authorizeddomain
// ======================================================================

sig Authorizeddomain extends core/Resource {
    name : one String,
} {
    hasKind[authorizeddomain]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#trafficsplit'
//
// ======================================================================

one sig trafficsplit extends Kind {} {
    term = "trafficsplit"
    scheme = "http://occi/gcpappengine#"
    title = "Traffic routing configuration for versions within a single service. Traffic splits define how traffic directed to the service is assigned to versions."
    parent = core/resource
    attributes = trafficsplit_shardBy + trafficsplit_allocations
    no actions
    entities in Trafficsplit
}

//
// OCCI attribute 'shardBy'
//
one sig trafficsplit_shardBy extends Attribute {} {
    name = "shardBy"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are changed."
    multiple_values = 
}

//
// OCCI attribute 'allocations'
//
one sig trafficsplit_allocations extends Attribute {} {
    name = "allocations"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once, but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up to three decimal places is supported for cookie-based splits."
    multiple_values = 
}

// ======================================================================
// Signature for Trafficsplit
// ======================================================================

sig Trafficsplit extends core/Resource {
    shardBy : one String,
    allocations : one map,
} {
    hasKind[trafficsplit]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1beta'
//
// ======================================================================

one sig operationmetadatav1beta extends Kind {} {
    term = "operationmetadatav1beta"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.longrunning.Operation."
    parent = core/resource
    attributes = operationmetadatav1beta_user + operationmetadatav1beta_target + operationmetadatav1beta_ephemeralMessage + operationmetadatav1beta_method + operationmetadatav1beta_endTime + operationmetadatav1beta_warning + operationmetadatav1beta_insertTime
    no actions
    entities in Operationmetadatav1beta
}

//
// OCCI attribute 'user'
//
one sig operationmetadatav1beta_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "User who requested this operation.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'target'
//
one sig operationmetadatav1beta_target extends Attribute {} {
    name = "target"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'ephemeralMessage'
//
one sig operationmetadatav1beta_ephemeralMessage extends Attribute {} {
    name = "ephemeralMessage"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Ephemeral message that may change every time the operation is polled. @OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'method'
//
one sig operationmetadatav1beta_method extends Attribute {} {
    name = "method"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "API method that initiated this operation. Example: google.appengine.v1beta.Versions.CreateVersion.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'endTime'
//
one sig operationmetadatav1beta_endTime extends Attribute {} {
    name = "endTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation completed.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'warning'
//
one sig operationmetadatav1beta_warning extends Attribute {} {
    name = "warning"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Durable messages that persist on every operation poll. @OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'insertTime'
//
one sig operationmetadatav1beta_insertTime extends Attribute {} {
    name = "insertTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation was created.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Operationmetadatav1beta
// ======================================================================

sig Operationmetadatav1beta extends core/Resource {
    user : one String,
    target : one String,
    ephemeralMessage : one String,
    method : one String,
    endTime : one String,
    warning : one array,
    insertTime : one String,
} {
    hasKind[operationmetadatav1beta]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listservicesresponse'
//
// ======================================================================

one sig listservicesresponse extends Kind {} {
    term = "listservicesresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for Services.ListServices."
    parent = core/resource
    attributes = listservicesresponse_services + listservicesresponse_nextPageToken
    no actions
    entities in Listservicesresponse
}

//
// OCCI attribute 'services'
//
one sig listservicesresponse_services extends Attribute {} {
    name = "services"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The services belonging to the requested application."
    multiple_values = 
}

//
// OCCI attribute 'nextPageToken'
//
one sig listservicesresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

// ======================================================================
// Signature for Listservicesresponse
// ======================================================================

sig Listservicesresponse extends core/Resource {
    services : one array,
    nextPageToken : one String,
} {
    hasKind[listservicesresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listingressrulesresponse'
//
// ======================================================================

one sig listingressrulesresponse extends Kind {} {
    term = "listingressrulesresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for Firewall.ListIngressRules."
    parent = core/resource
    attributes = listingressrulesresponse_nextPageToken + listingressrulesresponse_ingressRules
    no actions
    entities in Listingressrulesresponse
}

//
// OCCI attribute 'nextPageToken'
//
one sig listingressrulesresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

//
// OCCI attribute 'ingressRules'
//
one sig listingressrulesresponse_ingressRules extends Attribute {} {
    name = "ingressRules"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The ingress FirewallRules for this application."
    multiple_values = 
}

// ======================================================================
// Signature for Listingressrulesresponse
// ======================================================================

sig Listingressrulesresponse extends core/Resource {
    nextPageToken : one String,
    ingressRules : one array,
} {
    hasKind[listingressrulesresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#resources'
//
// ======================================================================

one sig resources extends Kind {} {
    term = "resources"
    scheme = "http://occi/gcpappengine#"
    title = "Machine resources for a version."
    parent = core/resource
    attributes = resources_volumes + resources_diskGb + resources_cpu + resources_memoryGb
    no actions
    entities in Resources
}

//
// OCCI attribute 'volumes'
//
one sig resources_volumes extends Attribute {} {
    name = "volumes"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "User specified volumes."
    multiple_values = 
}

//
// OCCI attribute 'diskGb'
//
one sig resources_diskGb extends Attribute {} {
    name = "diskGb"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Disk size (GB) needed."
    multiple_values = 
}

//
// OCCI attribute 'cpu'
//
one sig resources_cpu extends Attribute {} {
    name = "cpu"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of CPU cores needed."
    multiple_values = 
}

//
// OCCI attribute 'memoryGb'
//
one sig resources_memoryGb extends Attribute {} {
    name = "memoryGb"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Memory (GB) needed."
    multiple_values = 
}

// ======================================================================
// Signature for Resources
// ======================================================================

sig Resources extends core/Resource {
    volumes : one array,
    diskGb : one core/Integer,
    cpu : one core/Integer,
    memoryGb : one core/Integer,
} {
    hasKind[resources]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#zipinfolink'
//
// ======================================================================

one sig zipinfolink extends Kind {} {
    term = "zipinfolink"
    scheme = "http://occi/gcpappengine#"
    title = "The zip file for this deployment, if this is a zip deployment."
    parent = core/link
    no attributes
    no actions
    entities in Zipinfolink
}

// ======================================================================
// Signature for Zipinfolink
// ======================================================================

sig Zipinfolink extends core/Link {
} {
    hasKind[zipinfolink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#containerinfolink'
//
// ======================================================================

one sig containerinfolink extends Kind {} {
    term = "containerinfolink"
    scheme = "http://occi/gcpappengine#"
    title = "The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment."
    parent = core/link
    no attributes
    no actions
    entities in Containerinfolink
}

// ======================================================================
// Signature for Containerinfolink
// ======================================================================

sig Containerinfolink extends core/Link {
} {
    hasKind[containerinfolink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#deployment'
//
// ======================================================================

one sig deployment extends Kind {} {
    term = "deployment"
    scheme = "http://occi/gcpappengine#"
    title = "Code and application artifacts used to deploy a version to App Engine."
    parent = core/resource
    attributes = deployment_files
    no actions
    entities in Deployment
}

//
// OCCI attribute 'files'
//
one sig deployment_files extends Attribute {} {
    name = "files"
    type = object_DataType
    mutable = True
    required = True
    no default
    description = "Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call."
    multiple_values = 
}

// ======================================================================
// Signature for Deployment
// ======================================================================

sig Deployment extends core/Resource {
    files : one object,
} {
    hasKind[deployment]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#batchupdateingressrulesresponse'
//
// ======================================================================

one sig batchupdateingressrulesresponse extends Kind {} {
    term = "batchupdateingressrulesresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for Firewall.UpdateAllIngressRules."
    parent = core/resource
    attributes = batchupdateingressrulesresponse_ingressRules
    no actions
    entities in Batchupdateingressrulesresponse
}

//
// OCCI attribute 'ingressRules'
//
one sig batchupdateingressrulesresponse_ingressRules extends Attribute {} {
    name = "ingressRules"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The full list of ingress FirewallRules for this application."
    multiple_values = 
}

// ======================================================================
// Signature for Batchupdateingressrulesresponse
// ======================================================================

sig Batchupdateingressrulesresponse extends core/Resource {
    ingressRules : one array,
} {
    hasKind[batchupdateingressrulesresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#volume'
//
// ======================================================================

one sig volume extends Kind {} {
    term = "volume"
    scheme = "http://occi/gcpappengine#"
    title = "Volumes mounted within the app container. Only applicable for VM runtimes."
    parent = core/resource
    attributes = volume_volumeType + volume_sizeGb + volume_name
    no actions
    entities in Volume
}

//
// OCCI attribute 'volumeType'
//
one sig volume_volumeType extends Attribute {} {
    name = "volumeType"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Underlying volume type, e.g. 'tmpfs'."
    multiple_values = 
}

//
// OCCI attribute 'sizeGb'
//
one sig volume_sizeGb extends Attribute {} {
    name = "sizeGb"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Volume size in gigabytes."
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig volume_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Unique name for the volume."
    multiple_values = 
}

// ======================================================================
// Signature for Volume
// ======================================================================

sig Volume extends core/Resource {
    volumeType : one String,
    sizeGb : one core/Integer,
    name : one String,
} {
    hasKind[volume]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listinstancesresponse'
//
// ======================================================================

one sig listinstancesresponse extends Kind {} {
    term = "listinstancesresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for Instances.ListInstances."
    parent = core/resource
    attributes = listinstancesresponse_instances + listinstancesresponse_nextPageToken
    no actions
    entities in Listinstancesresponse
}

//
// OCCI attribute 'instances'
//
one sig listinstancesresponse_instances extends Attribute {} {
    name = "instances"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The instances belonging to the requested version."
    multiple_values = 
}

//
// OCCI attribute 'nextPageToken'
//
one sig listinstancesresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

// ======================================================================
// Signature for Listinstancesresponse
// ======================================================================

sig Listinstancesresponse extends core/Resource {
    instances : one array,
    nextPageToken : one String,
} {
    hasKind[listinstancesresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listdomainmappingsresponse'
//
// ======================================================================

one sig listdomainmappingsresponse extends Kind {} {
    term = "listdomainmappingsresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for DomainMappings.ListDomainMappings."
    parent = core/resource
    attributes = listdomainmappingsresponse_nextPageToken + listdomainmappingsresponse_domainMappings
    no actions
    entities in Listdomainmappingsresponse
}

//
// OCCI attribute 'nextPageToken'
//
one sig listdomainmappingsresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

//
// OCCI attribute 'domainMappings'
//
one sig listdomainmappingsresponse_domainMappings extends Attribute {} {
    name = "domainMappings"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The domain mappings for the application."
    multiple_values = 
}

// ======================================================================
// Signature for Listdomainmappingsresponse
// ======================================================================

sig Listdomainmappingsresponse extends core/Resource {
    nextPageToken : one String,
    domainMappings : one array,
} {
    hasKind[listdomainmappingsresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operationmetadatav1alpha'
//
// ======================================================================

one sig operationmetadatav1alpha extends Kind {} {
    term = "operationmetadatav1alpha"
    scheme = "http://occi/gcpappengine#"
    title = "Metadata for the given google.longrunning.Operation."
    parent = core/resource
    attributes = operationmetadatav1alpha_endTime + operationmetadatav1alpha_warning + operationmetadatav1alpha_insertTime + operationmetadatav1alpha_user + operationmetadatav1alpha_target + operationmetadatav1alpha_ephemeralMessage + operationmetadatav1alpha_method
    no actions
    entities in Operationmetadatav1alpha
}

//
// OCCI attribute 'endTime'
//
one sig operationmetadatav1alpha_endTime extends Attribute {} {
    name = "endTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation completed.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'warning'
//
one sig operationmetadatav1alpha_warning extends Attribute {} {
    name = "warning"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Durable messages that persist on every operation poll. @OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'insertTime'
//
one sig operationmetadatav1alpha_insertTime extends Attribute {} {
    name = "insertTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time that this operation was created.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'user'
//
one sig operationmetadatav1alpha_user extends Attribute {} {
    name = "user"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "User who requested this operation.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'target'
//
one sig operationmetadatav1alpha_target extends Attribute {} {
    name = "target"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'ephemeralMessage'
//
one sig operationmetadatav1alpha_ephemeralMessage extends Attribute {} {
    name = "ephemeralMessage"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Ephemeral message that may change every time the operation is polled. @OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'method'
//
one sig operationmetadatav1alpha_method extends Attribute {} {
    name = "method"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "API method that initiated this operation. Example: google.appengine.v1alpha.Versions.CreateVersion.@OutputOnly"
    multiple_values = 
}

// ======================================================================
// Signature for Operationmetadatav1alpha
// ======================================================================

sig Operationmetadatav1alpha extends core/Resource {
    endTime : one String,
    warning : one array,
    insertTime : one String,
    user : one String,
    target : one String,
    ephemeralMessage : one String,
    method : one String,
} {
    hasKind[operationmetadatav1alpha]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#urldispatchrule'
//
// ======================================================================

one sig urldispatchrule extends Kind {} {
    term = "urldispatchrule"
    scheme = "http://occi/gcpappengine#"
    title = "Rules to match an HTTP request and dispatch that request to a service."
    parent = core/resource
    attributes = urldispatchrule_domain + urldispatchrule_service + urldispatchrule_path
    no actions
    entities in Urldispatchrule
}

//
// OCCI attribute 'domain'
//
one sig urldispatchrule_domain extends Attribute {} {
    name = "domain"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Domain name to match against. The wildcard "*" is supported if specified before a period: "*.".Defaults to matching all domains: "*"."
    multiple_values = 
}

//
// OCCI attribute 'service'
//
one sig urldispatchrule_service extends Attribute {} {
    name = "service"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default."
    multiple_values = 
}

//
// OCCI attribute 'path'
//
one sig urldispatchrule_path extends Attribute {} {
    name = "path"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Pathname within the host. Must start with a "/". A single "*" can be included at the end of the path.The sum of the lengths of the domain and path may not exceed 100 characters."
    multiple_values = 
}

// ======================================================================
// Signature for Urldispatchrule
// ======================================================================

sig Urldispatchrule extends core/Resource {
    domain : one String,
    service : one String,
    path : one String,
} {
    hasKind[urldispatchrule]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listversionsresponse'
//
// ======================================================================

one sig listversionsresponse extends Kind {} {
    term = "listversionsresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for Versions.ListVersions."
    parent = core/resource
    attributes = listversionsresponse_nextPageToken + listversionsresponse_versions
    no actions
    entities in Listversionsresponse
}

//
// OCCI attribute 'nextPageToken'
//
one sig listversionsresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

//
// OCCI attribute 'versions'
//
one sig listversionsresponse_versions extends Attribute {} {
    name = "versions"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The versions belonging to the requested service."
    multiple_values = 
}

// ======================================================================
// Signature for Listversionsresponse
// ======================================================================

sig Listversionsresponse extends core/Resource {
    nextPageToken : one String,
    versions : one array,
} {
    hasKind[listversionsresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listauthorizeddomainsresponse'
//
// ======================================================================

one sig listauthorizeddomainsresponse extends Kind {} {
    term = "listauthorizeddomainsresponse"
    scheme = "http://occi/gcpappengine#"
    title = "Response message for AuthorizedDomains.ListAuthorizedDomains."
    parent = core/resource
    attributes = listauthorizeddomainsresponse_domains + listauthorizeddomainsresponse_nextPageToken
    no actions
    entities in Listauthorizeddomainsresponse
}

//
// OCCI attribute 'domains'
//
one sig listauthorizeddomainsresponse_domains extends Attribute {} {
    name = "domains"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The authorized domains belonging to the user."
    multiple_values = 
}

//
// OCCI attribute 'nextPageToken'
//
one sig listauthorizeddomainsresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}

// ======================================================================
// Signature for Listauthorizeddomainsresponse
// ======================================================================

sig Listauthorizeddomainsresponse extends core/Resource {
    domains : one array,
    nextPageToken : one String,
} {
    hasKind[listauthorizeddomainsresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#empty'
//
// ======================================================================

one sig empty extends Kind {} {
    term = "empty"
    scheme = "http://occi/gcpappengine#"
    title = "A generic empty message that you can re-use to avoid defining duplicated empty messages in your APIs. A typical example is to use it as the request or the response type of an API method. For instance:
    service Foo {
      rpc Bar(google.protobuf.Empty) returns (google.protobuf.Empty);
    }
    The JSON representation for Empty is empty JSON object {}."
    parent = core/resource
    no attributes
    no actions
    entities in Empty
}

// ======================================================================
// Signature for Empty
// ======================================================================

sig Empty extends core/Resource {
} {
    hasKind[empty]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiendpointhandler'
//
// ======================================================================

one sig apiendpointhandler extends Kind {} {
    term = "apiendpointhandler"
    scheme = "http://occi/gcpappengine#"
    title = "Uses Google Cloud Endpoints to handle requests."
    parent = core/resource
    attributes = apiendpointhandler_scriptPath
    no actions
    entities in Apiendpointhandler
}

//
// OCCI attribute 'scriptPath'
//
one sig apiendpointhandler_scriptPath extends Attribute {} {
    name = "scriptPath"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Path to the script from the application root directory."
    multiple_values = 
}

// ======================================================================
// Signature for Apiendpointhandler
// ======================================================================

sig Apiendpointhandler extends core/Resource {
    scriptPath : one String,
} {
    hasKind[apiendpointhandler]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#sslsettingslink'
//
// ======================================================================

one sig sslsettingslink extends Kind {} {
    term = "sslsettingslink"
    scheme = "http://occi/gcpappengine#"
    title = "SSL configuration for this domain. If unconfigured, this domain will not serve with SSL."
    parent = core/link
    no attributes
    no actions
    entities in Sslsettingslink
}

// ======================================================================
// Signature for Sslsettingslink
// ======================================================================

sig Sslsettingslink extends core/Link {
} {
    hasKind[sslsettingslink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#domainmapping'
//
// ======================================================================

one sig domainmapping extends Kind {} {
    term = "domainmapping"
    scheme = "http://occi/gcpappengine#"
    title = "A domain serving an App Engine application."
    parent = core/resource
    attributes = domainmapping_resourceRecords + domainmapping_name
    actions = domainmapping_delete + domainmapping_list + domainmapping_get + domainmapping_patch + domainmapping_create
    entities in Domainmapping
}

//
// OCCI attribute 'resourceRecords'
//
one sig domainmapping_resourceRecords extends Attribute {} {
    name = "resourceRecords"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig domainmapping_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.@OutputOnly"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/domainmapping/action#delete'
//
one sig domainmapping_delete extends Action {} {
    term = "delete"
    scheme = "http://occi/gcpappengine/domainmapping/action#"
    title = "Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource."
    attributes = delete_appsId + delete_domainMappingsId
}

//
// OCCI attribute 'appsId'
//
one sig delete_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource to delete. Example: apps/myapp/domainMappings/example.com."
    multiple_values = 
}
//
// OCCI attribute 'domainMappingsId'
//
one sig delete_domainMappingsId extends Attribute {} {
    name = "domainMappingsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/domainmapping/action#list'
//
one sig domainmapping_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/domainmapping/action#"
    title = "Lists the domain mappings on an application."
    attributes = list_appsId + list_pageToken + list_pageSize
}

//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Application resource. Example: apps/myapp."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}
//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/domainmapping/action#get'
//
one sig domainmapping_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/domainmapping/action#"
    title = "Gets the specified domain mapping."
    attributes = get_appsId + get_domainMappingsId
}

//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/domainMappings/example.com."
    multiple_values = 
}
//
// OCCI attribute 'domainMappingsId'
//
one sig get_domainMappingsId extends Attribute {} {
    name = "domainMappingsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/domainmapping/action#patch'
//
one sig domainmapping_patch extends Action {} {
    term = "patch"
    scheme = "http://occi/gcpappengine/domainmapping/action#"
    title = "Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource."
    attributes = patch_updateMask + patch_appsId + patch_domainMappingsId
}

//
// OCCI attribute 'updateMask'
//
one sig patch_updateMask extends Attribute {} {
    name = "updateMask"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard field mask for the set of fields to be updated."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig patch_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource to update. Example: apps/myapp/domainMappings/example.com."
    multiple_values = 
}
//
// OCCI attribute 'domainMappingsId'
//
one sig patch_domainMappingsId extends Attribute {} {
    name = "domainMappingsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/domainmapping/action#create'
//
one sig domainmapping_create extends Action {} {
    term = "create"
    scheme = "http://occi/gcpappengine/domainmapping/action#"
    title = "Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available authorized domains, see AuthorizedDomains.ListAuthorizedDomains."
    attributes = create_appsId
}

//
// OCCI attribute 'appsId'
//
one sig create_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Application resource. Example: apps/myapp."
    multiple_values = 
}

// ======================================================================
// Signature for Domainmapping
// ======================================================================

sig Domainmapping extends core/Resource {
    resourceRecords : one array,
    name : one String,
} {
    hasKind[domainmapping]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#requestutilizationlink'
//
// ======================================================================

one sig requestutilizationlink extends Kind {} {
    term = "requestutilizationlink"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by request utilization."
    parent = core/link
    no attributes
    no actions
    entities in Requestutilizationlink
}

// ======================================================================
// Signature for Requestutilizationlink
// ======================================================================

sig Requestutilizationlink extends core/Link {
} {
    hasKind[requestutilizationlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#networkutilizationlink'
//
// ======================================================================

one sig networkutilizationlink extends Kind {} {
    term = "networkutilizationlink"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by network usage."
    parent = core/link
    no attributes
    no actions
    entities in Networkutilizationlink
}

// ======================================================================
// Signature for Networkutilizationlink
// ======================================================================

sig Networkutilizationlink extends core/Link {
} {
    hasKind[networkutilizationlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#cpuutilizationlink'
//
// ======================================================================

one sig cpuutilizationlink extends Kind {} {
    term = "cpuutilizationlink"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by CPU usage."
    parent = core/link
    no attributes
    no actions
    entities in Cpuutilizationlink
}

// ======================================================================
// Signature for Cpuutilizationlink
// ======================================================================

sig Cpuutilizationlink extends core/Link {
} {
    hasKind[cpuutilizationlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#diskutilizationlink'
//
// ======================================================================

one sig diskutilizationlink extends Kind {} {
    term = "diskutilizationlink"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by disk usage."
    parent = core/link
    no attributes
    no actions
    entities in Diskutilizationlink
}

// ======================================================================
// Signature for Diskutilizationlink
// ======================================================================

sig Diskutilizationlink extends core/Link {
} {
    hasKind[diskutilizationlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#automaticscaling'
//
// ======================================================================

one sig automaticscaling extends Kind {} {
    term = "automaticscaling"
    scheme = "http://occi/gcpappengine#"
    title = "Automatic scaling is based on request rate, response latencies, and other application metrics."
    parent = core/resource
    attributes = automaticscaling_minPendingLatency + automaticscaling_maxIdleInstances + automaticscaling_minIdleInstances + automaticscaling_maxTotalInstances + automaticscaling_minTotalInstances + automaticscaling_maxConcurrentRequests + automaticscaling_coolDownPeriod + automaticscaling_maxPendingLatency
    no actions
    entities in Automaticscaling
}

//
// OCCI attribute 'minPendingLatency'
//
one sig automaticscaling_minPendingLatency extends Attribute {} {
    name = "minPendingLatency"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it."
    multiple_values = 
}

//
// OCCI attribute 'maxIdleInstances'
//
one sig automaticscaling_maxIdleInstances extends Attribute {} {
    name = "maxIdleInstances"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum number of idle instances that should be maintained for this version."
    multiple_values = 
}

//
// OCCI attribute 'minIdleInstances'
//
one sig automaticscaling_minIdleInstances extends Attribute {} {
    name = "minIdleInstances"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service."
    multiple_values = 
}

//
// OCCI attribute 'maxTotalInstances'
//
one sig automaticscaling_maxTotalInstances extends Attribute {} {
    name = "maxTotalInstances"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum number of instances that should be started to handle requests."
    multiple_values = 
}

//
// OCCI attribute 'minTotalInstances'
//
one sig automaticscaling_minTotalInstances extends Attribute {} {
    name = "minTotalInstances"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Minimum number of instances that should be maintained for this version."
    multiple_values = 
}

//
// OCCI attribute 'maxConcurrentRequests'
//
one sig automaticscaling_maxConcurrentRequests extends Attribute {} {
    name = "maxConcurrentRequests"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value."
    multiple_values = 
}

//
// OCCI attribute 'coolDownPeriod'
//
one sig automaticscaling_coolDownPeriod extends Attribute {} {
    name = "coolDownPeriod"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Amount of time that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait between changes to the number of virtual machines. Only applicable for VM runtimes."
    multiple_values = 
}

//
// OCCI attribute 'maxPendingLatency'
//
one sig automaticscaling_maxPendingLatency extends Attribute {} {
    name = "maxPendingLatency"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it."
    multiple_values = 
}

// ======================================================================
// Signature for Automaticscaling
// ======================================================================

sig Automaticscaling extends core/Resource {
    minPendingLatency : one String,
    maxIdleInstances : one core/Integer,
    minIdleInstances : one core/Integer,
    maxTotalInstances : one core/Integer,
    minTotalInstances : one core/Integer,
    maxConcurrentRequests : one core/Integer,
    coolDownPeriod : one String,
    maxPendingLatency : one String,
} {
    hasKind[automaticscaling]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#zipinfo'
//
// ======================================================================

one sig zipinfo extends Kind {} {
    term = "zipinfo"
    scheme = "http://occi/gcpappengine#"
    title = "The zip file information for a zip deployment."
    parent = core/resource
    attributes = zipinfo_sourceUrl + zipinfo_filesCount
    no actions
    entities in Zipinfo
}

//
// OCCI attribute 'sourceUrl'
//
one sig zipinfo_sourceUrl extends Attribute {} {
    name = "sourceUrl"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form 'http(s)://storage.googleapis.com/<bucket>/<object>'."
    multiple_values = 
}

//
// OCCI attribute 'filesCount'
//
one sig zipinfo_filesCount extends Attribute {} {
    name = "filesCount"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow."
    multiple_values = 
}

// ======================================================================
// Signature for Zipinfo
// ======================================================================

sig Zipinfo extends core/Resource {
    sourceUrl : one String,
    filesCount : one core/Integer,
} {
    hasKind[zipinfo]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#certificaterawdatalink'
//
// ======================================================================

one sig certificaterawdatalink extends Kind {} {
    term = "certificaterawdatalink"
    scheme = "http://occi/gcpappengine#"
    title = "The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority."
    parent = core/link
    no attributes
    no actions
    entities in Certificaterawdatalink
}

// ======================================================================
// Signature for Certificaterawdatalink
// ======================================================================

sig Certificaterawdatalink extends core/Link {
} {
    hasKind[certificaterawdatalink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#authorizedcertificate'
//
// ======================================================================

one sig authorizedcertificate extends Kind {} {
    term = "authorizedcertificate"
    scheme = "http://occi/gcpappengine#"
    title = "An SSL certificate that a user has been authorized to administer. A user is authorized to administer any certificate that applies to one of their authorized domains."
    parent = core/resource
    attributes = authorizedcertificate_domainMappingsCount + authorizedcertificate_domainNames + authorizedcertificate_displayName + authorizedcertificate_visibleDomainMappings + authorizedcertificate_expireTime + authorizedcertificate_name
    actions = authorizedcertificate_delete + authorizedcertificate_list + authorizedcertificate_get + authorizedcertificate_patch + authorizedcertificate_create
    entities in Authorizedcertificate
}

//
// OCCI attribute 'domainMappingsCount'
//
one sig authorizedcertificate_domainMappingsCount extends Attribute {} {
    name = "domainMappingsCount"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Aggregate count of the domain mappings with this certificate mapped. This count includes domain mappings on applications for which the user does not have VIEWER permissions.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'domainNames'
//
one sig authorizedcertificate_domainNames extends Attribute {} {
    name = "domainNames"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "Topmost applicable domains of this certificate. This certificate applies to these domains and their subdomains. Example: example.com.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'displayName'
//
one sig authorizedcertificate_displayName extends Attribute {} {
    name = "displayName"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate."
    multiple_values = 
}

//
// OCCI attribute 'visibleDomainMappings'
//
one sig authorizedcertificate_visibleDomainMappings extends Attribute {} {
    name = "visibleDomainMappings"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "The full paths to user visible Domain Mapping resources that have this certificate mapped. Example: apps/myapp/domainMappings/example.com.This may not represent the full list of mapped domain mappings if the user does not have VIEWER permissions on all of the applications that have this certificate mapped. See domain_mappings_count for a complete count.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'expireTime'
//
one sig authorizedcertificate_expireTime extends Attribute {} {
    name = "expireTime"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The time when this certificate expires. To update the renewal time on this certificate, upload an SSL certificate with a different expiration time using AuthorizedCertificates.UpdateAuthorizedCertificate.@OutputOnly"
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig authorizedcertificate_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Full path to the AuthorizedCertificate resource in the API. Example: apps/myapp/authorizedCertificates/12345.@OutputOnly"
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/authorizedcertificate/action#delete'
//
one sig authorizedcertificate_delete extends Action {} {
    term = "delete"
    scheme = "http://occi/gcpappengine/authorizedcertificate/action#"
    title = "Deletes the specified SSL certificate."
    attributes = delete_authorizedCertificatesId + delete_appsId
}

//
// OCCI attribute 'authorizedCertificatesId'
//
one sig delete_authorizedCertificatesId extends Attribute {} {
    name = "authorizedCertificatesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig delete_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource to delete. Example: apps/myapp/authorizedCertificates/12345."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/authorizedcertificate/action#list'
//
one sig authorizedcertificate_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/authorizedcertificate/action#"
    title = "Lists all SSL certificates the user is authorized to administer."
    attributes = list_appsId + list_pageToken + list_pageSize + list_view
}

//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Application resource. Example: apps/myapp."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Continuation token for fetching the next page of results."
    multiple_values = 
}
//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum results to return per page."
    multiple_values = 
}
//
// OCCI attribute 'view'
//
one sig list_view extends Attribute {} {
    name = "view"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Controls the set of fields returned in the LIST response."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/authorizedcertificate/action#get'
//
one sig authorizedcertificate_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/authorizedcertificate/action#"
    title = "Gets the specified SSL certificate."
    attributes = get_appsId + get_view + get_authorizedCertificatesId
}

//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource requested. Example: apps/myapp/authorizedCertificates/12345."
    multiple_values = 
}
//
// OCCI attribute 'view'
//
one sig get_view extends Attribute {} {
    name = "view"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Controls the set of fields returned in the GET response."
    multiple_values = 
}
//
// OCCI attribute 'authorizedCertificatesId'
//
one sig get_authorizedCertificatesId extends Attribute {} {
    name = "authorizedCertificatesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/authorizedcertificate/action#patch'
//
one sig authorizedcertificate_patch extends Action {} {
    term = "patch"
    scheme = "http://occi/gcpappengine/authorizedcertificate/action#"
    title = "Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated."
    attributes = patch_authorizedCertificatesId + patch_updateMask + patch_appsId
}

//
// OCCI attribute 'authorizedCertificatesId'
//
one sig patch_authorizedCertificatesId extends Attribute {} {
    name = "authorizedCertificatesId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}
//
// OCCI attribute 'updateMask'
//
one sig patch_updateMask extends Attribute {} {
    name = "updateMask"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Standard field mask for the set of fields to be updated. Updates are only supported on the certificate_raw_data and display_name fields."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig patch_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. Name of the resource to update. Example: apps/myapp/authorizedCertificates/12345."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/authorizedcertificate/action#create'
//
one sig authorizedcertificate_create extends Action {} {
    term = "create"
    scheme = "http://occi/gcpappengine/authorizedcertificate/action#"
    title = "Uploads the specified SSL certificate."
    attributes = create_appsId
}

//
// OCCI attribute 'appsId'
//
one sig create_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `parent`. Name of the parent Application resource. Example: apps/myapp."
    multiple_values = 
}

// ======================================================================
// Signature for Authorizedcertificate
// ======================================================================

sig Authorizedcertificate extends core/Resource {
    domainMappingsCount : one core/Integer,
    domainNames : one array,
    displayName : one String,
    visibleDomainMappings : one array,
    expireTime : one String,
    name : one String,
} {
    hasKind[authorizedcertificate]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#resourcerecord'
//
// ======================================================================

one sig resourcerecord extends Kind {} {
    term = "resourcerecord"
    scheme = "http://occi/gcpappengine#"
    title = "A DNS resource record."
    parent = core/resource
    attributes = resourcerecord_type + resourcerecord_rrdata + resourcerecord_name
    no actions
    entities in Resourcerecord
}

//
// OCCI attribute 'type'
//
one sig resourcerecord_type extends Attribute {} {
    name = "type"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Resource record type. Example: AAAA."
    multiple_values = 
}

//
// OCCI attribute 'rrdata'
//
one sig resourcerecord_rrdata extends Attribute {} {
    name = "rrdata"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1)."
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig resourcerecord_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'."
    multiple_values = 
}

// ======================================================================
// Signature for Resourcerecord
// ======================================================================

sig Resourcerecord extends core/Resource {
    type : one String,
    rrdata : one String,
    name : one String,
} {
    hasKind[resourcerecord]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#library'
//
// ======================================================================

one sig library extends Kind {} {
    term = "library"
    scheme = "http://occi/gcpappengine#"
    title = "Third-party Python runtime library that is required by the application."
    parent = core/resource
    attributes = library_version + library_name
    no actions
    entities in Library
}

//
// OCCI attribute 'version'
//
one sig library_version extends Attribute {} {
    name = "version"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Version of the library to select, or "latest"."
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig library_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Name of the library. Example: "django"."
    multiple_values = 
}

// ======================================================================
// Signature for Library
// ======================================================================

sig Library extends core/Resource {
    version : one String,
    name : one String,
} {
    hasKind[library]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#listlocationsresponse'
//
// ======================================================================

one sig listlocationsresponse extends Kind {} {
    term = "listlocationsresponse"
    scheme = "http://occi/gcpappengine#"
    title = "The response message for Locations.ListLocations."
    parent = core/resource
    attributes = listlocationsresponse_nextPageToken + listlocationsresponse_locations
    no actions
    entities in Listlocationsresponse
}

//
// OCCI attribute 'nextPageToken'
//
one sig listlocationsresponse_nextPageToken extends Attribute {} {
    name = "nextPageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The standard List next-page token."
    multiple_values = 
}

//
// OCCI attribute 'locations'
//
one sig listlocationsresponse_locations extends Attribute {} {
    name = "locations"
    type = array_DataType
    mutable = True
    required = True
    no default
    description = "A list of locations that matches the specified filter in the request."
    multiple_values = 
}

// ======================================================================
// Signature for Listlocationsresponse
// ======================================================================

sig Listlocationsresponse extends core/Resource {
    nextPageToken : one String,
    locations : one array,
} {
    hasKind[listlocationsresponse]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#containerinfo'
//
// ======================================================================

one sig containerinfo extends Kind {} {
    term = "containerinfo"
    scheme = "http://occi/gcpappengine#"
    title = "Docker image that is used to create a container and start a VM instance for the version that you deploy. Only applicable for instances running in the App Engine flexible environment."
    parent = core/resource
    attributes = containerinfo_image
    no actions
    entities in Containerinfo
}

//
// OCCI attribute 'image'
//
one sig containerinfo_image extends Attribute {} {
    name = "image"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest""
    multiple_values = 
}

// ======================================================================
// Signature for Containerinfo
// ======================================================================

sig Containerinfo extends core/Resource {
    image : one String,
} {
    hasKind[containerinfo]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#requestutilization'
//
// ======================================================================

one sig requestutilization extends Kind {} {
    term = "requestutilization"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by request utilization. Only applicable for VM runtimes."
    parent = core/resource
    attributes = requestutilization_targetRequestCountPerSecond + requestutilization_targetConcurrentRequests
    no actions
    entities in Requestutilization
}

//
// OCCI attribute 'targetRequestCountPerSecond'
//
one sig requestutilization_targetRequestCountPerSecond extends Attribute {} {
    name = "targetRequestCountPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target requests per second."
    multiple_values = 
}

//
// OCCI attribute 'targetConcurrentRequests'
//
one sig requestutilization_targetConcurrentRequests extends Attribute {} {
    name = "targetConcurrentRequests"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target number of concurrent requests."
    multiple_values = 
}

// ======================================================================
// Signature for Requestutilization
// ======================================================================

sig Requestutilization extends core/Resource {
    targetRequestCountPerSecond : one core/Integer,
    targetConcurrentRequests : one core/Integer,
} {
    hasKind[requestutilization]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiendpointhandlerlink'
//
// ======================================================================

one sig apiendpointhandlerlink extends Kind {} {
    term = "apiendpointhandlerlink"
    scheme = "http://occi/gcpappengine#"
    title = "Uses API Endpoints to handle requests."
    parent = core/link
    no attributes
    no actions
    entities in Apiendpointhandlerlink
}

// ======================================================================
// Signature for Apiendpointhandlerlink
// ======================================================================

sig Apiendpointhandlerlink extends core/Link {
} {
    hasKind[apiendpointhandlerlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#staticfileshandlerlink'
//
// ======================================================================

one sig staticfileshandlerlink extends Kind {} {
    term = "staticfileshandlerlink"
    scheme = "http://occi/gcpappengine#"
    title = "Returns the contents of a file, such as an image, as the response."
    parent = core/link
    no attributes
    no actions
    entities in Staticfileshandlerlink
}

// ======================================================================
// Signature for Staticfileshandlerlink
// ======================================================================

sig Staticfileshandlerlink extends core/Link {
} {
    hasKind[staticfileshandlerlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#scripthandlerlink'
//
// ======================================================================

one sig scripthandlerlink extends Kind {} {
    term = "scripthandlerlink"
    scheme = "http://occi/gcpappengine#"
    title = "Executes a script to handle the request that matches this URL pattern."
    parent = core/link
    no attributes
    no actions
    entities in Scripthandlerlink
}

// ======================================================================
// Signature for Scripthandlerlink
// ======================================================================

sig Scripthandlerlink extends core/Link {
} {
    hasKind[scripthandlerlink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#urlmap'
//
// ======================================================================

one sig urlmap extends Kind {} {
    term = "urlmap"
    scheme = "http://occi/gcpappengine#"
    title = "URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript."
    parent = core/resource
    attributes = urlmap_redirectHttpResponseCode + urlmap_securityLevel + urlmap_authFailAction + urlmap_urlRegex + urlmap_login
    no actions
    entities in Urlmap
}

//
// OCCI attribute 'redirectHttpResponseCode'
//
one sig urlmap_redirectHttpResponseCode extends Attribute {} {
    name = "redirectHttpResponseCode"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "30x code to use when performing redirects for the secure field. Defaults to 302."
    multiple_values = 
}

//
// OCCI attribute 'securityLevel'
//
one sig urlmap_securityLevel extends Attribute {} {
    name = "securityLevel"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Security (HTTPS) enforcement for this URL."
    multiple_values = 
}

//
// OCCI attribute 'authFailAction'
//
one sig urlmap_authFailAction extends Attribute {} {
    name = "authFailAction"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Action to take when users access resources that require authentication. Defaults to redirect."
    multiple_values = 
}

//
// OCCI attribute 'urlRegex'
//
one sig urlmap_urlRegex extends Attribute {} {
    name = "urlRegex"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path."
    multiple_values = 
}

//
// OCCI attribute 'login'
//
one sig urlmap_login extends Attribute {} {
    name = "login"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Level of login required to access this resource."
    multiple_values = 
}

// ======================================================================
// Signature for Urlmap
// ======================================================================

sig Urlmap extends core/Resource {
    redirectHttpResponseCode : one String,
    securityLevel : one String,
    authFailAction : one String,
    urlRegex : one String,
    login : one String,
} {
    hasKind[urlmap]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#endpointsapiservice'
//
// ======================================================================

one sig endpointsapiservice extends Kind {} {
    term = "endpointsapiservice"
    scheme = "http://occi/gcpappengine#"
    title = "Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The Endpoints API Service provides tooling for serving Open API and gRPC endpoints via an NGINX proxy.The fields here refer to the name and configuration id of a "service" resource in the Service Management API (https://cloud.google.com/service-management/overview)."
    parent = core/resource
    attributes = endpointsapiservice_name + endpointsapiservice_configId
    no actions
    entities in Endpointsapiservice
}

//
// OCCI attribute 'name'
//
one sig endpointsapiservice_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog""
    multiple_values = 
}

//
// OCCI attribute 'configId'
//
one sig endpointsapiservice_configId extends Attribute {} {
    name = "configId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Endpoints service configuration id as specified by the Service Management API. For example "2016-09-19r1""
    multiple_values = 
}

// ======================================================================
// Signature for Endpointsapiservice
// ======================================================================

sig Endpointsapiservice extends core/Resource {
    name : one String,
    configId : one String,
} {
    hasKind[endpointsapiservice]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#statuslink'
//
// ======================================================================

one sig statuslink extends Kind {} {
    term = "statuslink"
    scheme = "http://occi/gcpappengine#"
    title = "The error result of the operation in case of failure or cancellation."
    parent = core/link
    no attributes
    no actions
    entities in Statuslink
}

// ======================================================================
// Signature for Statuslink
// ======================================================================

sig Statuslink extends core/Link {
} {
    hasKind[statuslink]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#operation'
//
// ======================================================================

one sig operation extends Kind {} {
    term = "operation"
    scheme = "http://occi/gcpappengine#"
    title = "This resource represents a long-running operation that is the result of a network API call."
    parent = core/resource
    attributes = operation_response + operation_name + operation_metadata + operation_done
    actions = operation_list + operation_get
    entities in Operation
}

//
// OCCI attribute 'response'
//
one sig operation_response extends Attribute {} {
    name = "response"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "The normal response of the operation in case of success. If the original method returns no data on success, such as Delete, the response is google.protobuf.Empty. If the original method is standard Get/Create/Update, the response should be the resource. For other methods, the response should have the type XxxResponse, where Xxx is the original method name. For example, if the original method name is TakeSnapshot(), the inferred response type is TakeSnapshotResponse."
    multiple_values = 
}

//
// OCCI attribute 'name'
//
one sig operation_name extends Attribute {} {
    name = "name"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the name should have the format of operations/some/unique/name."
    multiple_values = 
}

//
// OCCI attribute 'metadata'
//
one sig operation_metadata extends Attribute {} {
    name = "metadata"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such metadata. Any method that returns a long-running operation should document the metadata type, if any."
    multiple_values = 
}

//
// OCCI attribute 'done'
//
one sig operation_done extends Attribute {} {
    name = "done"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "If the value is false, it means the operation is still in progress. If true, the operation is completed, and either error or response is available."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/operation/action#list'
//
one sig operation_list extends Action {} {
    term = "list"
    scheme = "http://occi/gcpappengine/operation/action#"
    title = "Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.NOTE: the name binding allows API services to override the binding to use different resource name schemes, such as users/*/operations. To override the binding, API services can add a binding such as "/v1/{name=users/*}/operations" to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection id."
    attributes = list_filter + list_appsId + list_pageToken + list_pageSize
}

//
// OCCI attribute 'filter'
//
one sig list_filter extends Attribute {} {
    name = "filter"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The standard list filter."
    multiple_values = 
}
//
// OCCI attribute 'appsId'
//
one sig list_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. The name of the operation's parent resource."
    multiple_values = 
}
//
// OCCI attribute 'pageToken'
//
one sig list_pageToken extends Attribute {} {
    name = "pageToken"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "The standard list page token."
    multiple_values = 
}
//
// OCCI attribute 'pageSize'
//
one sig list_pageSize extends Attribute {} {
    name = "pageSize"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "The standard list page size."
    multiple_values = 
}

//
// OCCI action 'http://occi/gcpappengine/operation/action#get'
//
one sig operation_get extends Action {} {
    term = "get"
    scheme = "http://occi/gcpappengine/operation/action#"
    title = "Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service."
    attributes = get_appsId + get_operationsId
}

//
// OCCI attribute 'appsId'
//
one sig get_appsId extends Attribute {} {
    name = "appsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. The name of the operation resource."
    multiple_values = 
}
//
// OCCI attribute 'operationsId'
//
one sig get_operationsId extends Attribute {} {
    name = "operationsId"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Part of `name`. See documentation of `appsId`."
    multiple_values = 
}

// ======================================================================
// Signature for Operation
// ======================================================================

sig Operation extends core/Resource {
    response : one map,
    name : one String,
    metadata : one map,
    done : one core/Boolean,
} {
    hasKind[operation]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#apiconfighandler'
//
// ======================================================================

one sig apiconfighandler extends Kind {} {
    term = "apiconfighandler"
    scheme = "http://occi/gcpappengine#"
    title = "Google Cloud Endpoints (https://cloud.google.com/appengine/docs/python/endpoints/) configuration for API handlers."
    parent = core/resource
    attributes = apiconfighandler_securityLevel + apiconfighandler_authFailAction + apiconfighandler_script + apiconfighandler_login + apiconfighandler_url
    no actions
    entities in Apiconfighandler
}

//
// OCCI attribute 'securityLevel'
//
one sig apiconfighandler_securityLevel extends Attribute {} {
    name = "securityLevel"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Security (HTTPS) enforcement for this URL."
    multiple_values = 
}

//
// OCCI attribute 'authFailAction'
//
one sig apiconfighandler_authFailAction extends Attribute {} {
    name = "authFailAction"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Action to take when users access resources that require authentication. Defaults to redirect."
    multiple_values = 
}

//
// OCCI attribute 'script'
//
one sig apiconfighandler_script extends Attribute {} {
    name = "script"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Path to the script from the application root directory."
    multiple_values = 
}

//
// OCCI attribute 'login'
//
one sig apiconfighandler_login extends Attribute {} {
    name = "login"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Level of login required to access this resource. Defaults to optional."
    multiple_values = 
}

//
// OCCI attribute 'url'
//
one sig apiconfighandler_url extends Attribute {} {
    name = "url"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "URL to serve the endpoint at."
    multiple_values = 
}

// ======================================================================
// Signature for Apiconfighandler
// ======================================================================

sig Apiconfighandler extends core/Resource {
    securityLevel : one String,
    authFailAction : one String,
    script : one String,
    login : one String,
    url : one String,
} {
    hasKind[apiconfighandler]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#staticfileshandler'
//
// ======================================================================

one sig staticfileshandler extends Kind {} {
    term = "staticfileshandler"
    scheme = "http://occi/gcpappengine#"
    title = "Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them."
    parent = core/resource
    attributes = staticfileshandler_applicationReadable + staticfileshandler_httpHeaders + staticfileshandler_uploadPathRegex + staticfileshandler_path + staticfileshandler_mimeType + staticfileshandler_requireMatchingFile + staticfileshandler_expiration
    no actions
    entities in Staticfileshandler
}

//
// OCCI attribute 'applicationReadable'
//
one sig staticfileshandler_applicationReadable extends Attribute {} {
    name = "applicationReadable"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas."
    multiple_values = 
}

//
// OCCI attribute 'httpHeaders'
//
one sig staticfileshandler_httpHeaders extends Attribute {} {
    name = "httpHeaders"
    type = map_DataType
    mutable = True
    required = True
    no default
    description = "HTTP headers to use for all responses from these URLs."
    multiple_values = 
}

//
// OCCI attribute 'uploadPathRegex'
//
one sig staticfileshandler_uploadPathRegex extends Attribute {} {
    name = "uploadPathRegex"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Regular expression that matches the file paths for all files that should be referenced by this handler."
    multiple_values = 
}

//
// OCCI attribute 'path'
//
one sig staticfileshandler_path extends Attribute {} {
    name = "path"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern."
    multiple_values = 
}

//
// OCCI attribute 'mimeType'
//
one sig staticfileshandler_mimeType extends Attribute {} {
    name = "mimeType"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension."
    multiple_values = 
}

//
// OCCI attribute 'requireMatchingFile'
//
one sig staticfileshandler_requireMatchingFile extends Attribute {} {
    name = "requireMatchingFile"
    type = core/Boolean_DataType
    mutable = True
    required = True
    no default
    description = "Whether this handler should match the request if the file referenced by the handler does not exist."
    multiple_values = 
}

//
// OCCI attribute 'expiration'
//
one sig staticfileshandler_expiration extends Attribute {} {
    name = "expiration"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Time a static file served by this handler should be cached by web proxies and browsers."
    multiple_values = 
}

// ======================================================================
// Signature for Staticfileshandler
// ======================================================================

sig Staticfileshandler extends core/Resource {
    applicationReadable : one core/Boolean,
    httpHeaders : one map,
    uploadPathRegex : one String,
    path : one String,
    mimeType : one String,
    requireMatchingFile : one core/Boolean,
    expiration : one String,
} {
    hasKind[staticfileshandler]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#basicscaling'
//
// ======================================================================

one sig basicscaling extends Kind {} {
    term = "basicscaling"
    scheme = "http://occi/gcpappengine#"
    title = "A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity."
    parent = core/resource
    attributes = basicscaling_maxInstances + basicscaling_idleTimeout
    no actions
    entities in Basicscaling
}

//
// OCCI attribute 'maxInstances'
//
one sig basicscaling_maxInstances extends Attribute {} {
    name = "maxInstances"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Maximum number of instances to create for this version."
    multiple_values = 
}

//
// OCCI attribute 'idleTimeout'
//
one sig basicscaling_idleTimeout extends Attribute {} {
    name = "idleTimeout"
    type = core/String_DataType
    mutable = True
    required = True
    no default
    description = "Duration of time after the last request that an instance must wait before the instance is shut down."
    multiple_values = 
}

// ======================================================================
// Signature for Basicscaling
// ======================================================================

sig Basicscaling extends core/Resource {
    maxInstances : one core/Integer,
    idleTimeout : one String,
} {
    hasKind[basicscaling]
}

// ======================================================================
//
// OCCI kind 'http://occi/gcpappengine#diskutilization'
//
// ======================================================================

one sig diskutilization extends Kind {} {
    term = "diskutilization"
    scheme = "http://occi/gcpappengine#"
    title = "Target scaling by disk usage. Only applicable for VM runtimes."
    parent = core/resource
    attributes = diskutilization_targetWriteBytesPerSecond + diskutilization_targetReadBytesPerSecond + diskutilization_targetReadOpsPerSecond + diskutilization_targetWriteOpsPerSecond
    no actions
    entities in Diskutilization
}

//
// OCCI attribute 'targetWriteBytesPerSecond'
//
one sig diskutilization_targetWriteBytesPerSecond extends Attribute {} {
    name = "targetWriteBytesPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target bytes written per second."
    multiple_values = 
}

//
// OCCI attribute 'targetReadBytesPerSecond'
//
one sig diskutilization_targetReadBytesPerSecond extends Attribute {} {
    name = "targetReadBytesPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target bytes read per second."
    multiple_values = 
}

//
// OCCI attribute 'targetReadOpsPerSecond'
//
one sig diskutilization_targetReadOpsPerSecond extends Attribute {} {
    name = "targetReadOpsPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target ops read per seconds."
    multiple_values = 
}

//
// OCCI attribute 'targetWriteOpsPerSecond'
//
one sig diskutilization_targetWriteOpsPerSecond extends Attribute {} {
    name = "targetWriteOpsPerSecond"
    type = core/Integer_DataType
    mutable = True
    required = True
    no default
    description = "Target ops written per second."
    multiple_values = 
}

// ======================================================================
// Signature for Diskutilization
// ======================================================================

sig Diskutilization extends core/Resource {
    targetWriteBytesPerSecond : one core/Integer,
    targetReadBytesPerSecond : one core/Integer,
    targetReadOpsPerSecond : one core/Integer,
    targetWriteOpsPerSecond : one core/Integer,
} {
    hasKind[diskutilization]
}

//
// OCCI data type float
//
one sig float_DataType extends DataType {} {
    name = "float"
}

let float=String

//
// OCCI data type byte
//
one sig byte_DataType extends DataType {} {
    name = "byte"
}

let byte=String

//
// OCCI data type double
//
one sig double_DataType extends DataType {} {
    name = "double"
}

let double=String

//
// OCCI data type object
//
one sig object_DataType extends DataType {} {
    name = "object"
}

let object=String

//
// OCCI data type long
//
one sig long_DataType extends DataType {} {
    name = "long"
}

let long=String

//
// OCCI data type array
//
one sig array_DataType extends DataType {} {
    name = "array"
}

let array=String

//
// OCCI data type map
//
one sig map_DataType extends DataType {} {
    name = "map"
}

let map=String

//
// OCCI data type any
//
one sig any_DataType extends DataType {} {
    name = "any"
}

let any=String

//
// OCCI data type short
//
one sig short_DataType extends DataType {} {
    name = "short"
}

let short=String

//
// OCCI data type Action
//
one sig Action_DataType extends DataType {} {
    name = "Action"
}

let Action=String

//
// OCCI data type Errorcode
//
one sig Errorcode_DataType extends DataType {} {
    name = "Errorcode"
}

let Errorcode=String

//
// OCCI data type Servingstatus
//
one sig Servingstatus_DataType extends DataType {} {
    name = "Servingstatus"
}

let Servingstatus=String

//
// OCCI data type Availability
//
one sig Availability_DataType extends DataType {} {
    name = "Availability"
}

let Availability=String

//
// OCCI data type VersionServingstatus
//
one sig VersionServingstatus_DataType extends DataType {} {
    name = "VersionServingstatus"
}

let VersionServingstatus=String

//
// OCCI data type Shardby
//
one sig Shardby_DataType extends DataType {} {
    name = "Shardby"
}

let Shardby=String

//
// OCCI data type Type
//
one sig Type_DataType extends DataType {} {
    name = "Type"
}

let Type=String

//
// OCCI data type Redirecthttpresponsecode
//
one sig Redirecthttpresponsecode_DataType extends DataType {} {
    name = "Redirecthttpresponsecode"
}

let Redirecthttpresponsecode=String

//
// OCCI data type Securitylevel
//
one sig Securitylevel_DataType extends DataType {} {
    name = "Securitylevel"
}

let Securitylevel=String

//
// OCCI data type Authfailaction
//
one sig Authfailaction_DataType extends DataType {} {
    name = "Authfailaction"
}

let Authfailaction=String

//
// OCCI data type Login
//
one sig Login_DataType extends DataType {} {
    name = "Login"
}

let Login=String

//
// OCCI data type ApiConfigHandlerSecuritylevel
//
one sig ApiConfigHandlerSecuritylevel_DataType extends DataType {} {
    name = "ApiConfigHandlerSecuritylevel"
}

let ApiConfigHandlerSecuritylevel=String

//
// OCCI data type ApiConfigHandlerAuthfailaction
//
one sig ApiConfigHandlerAuthfailaction_DataType extends DataType {} {
    name = "ApiConfigHandlerAuthfailaction"
}

let ApiConfigHandlerAuthfailaction=String

//
// OCCI data type ApiConfigHandlerLogin
//
one sig ApiConfigHandlerLogin_DataType extends DataType {} {
    name = "ApiConfigHandlerLogin"
}

let ApiConfigHandlerLogin=String

// ======================================================================
// Check consistency, i.e., there is at least one instance of this model.
// ======================================================================

run Consistency {} for 10

// ======================================================================
// Instance containing the OCCI Type System only.
// ======================================================================

run The_OCCI_Type_System {} for 0

