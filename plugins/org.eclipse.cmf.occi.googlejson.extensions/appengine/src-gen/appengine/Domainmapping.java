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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A domain serving an App Engine application.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Domainmapping#getResourceRecords <em>Resource Records</em>}</li>
 *   <li>{@link appengine.Domainmapping#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getDomainmapping()
 * @model
 * @generated
 */
public interface Domainmapping extends Resource {
	/**
	 * Returns the value of the '<em><b>Resource Records</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the application via this domain mapping.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Records</em>' containment reference.
	 * @see #setResourceRecords(array)
	 * @see appengine.AppenginePackage#getDomainmapping_ResourceRecords()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!resourceRecords'"
	 * @generated
	 */
	array getResourceRecords();

	/**
	 * Sets the value of the '{@link appengine.Domainmapping#getResourceRecords <em>Resource Records</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Records</em>' containment reference.
	 * @see #getResourceRecords()
	 * @generated
	 */
	void setResourceRecords(array value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getDomainmapping_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Domainmapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deletes the specified domain mapping. A user must be authorized to administer the associated domain in order to delete a DomainMapping resource.
	 * @param appsId Part of `name`. Name of the resource to delete. Example: apps/myapp/domainMappings/example.com.
	 * @param domainMappingsId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" domainMappingsIdDataType="org.eclipse.cmf.occi.core.String" domainMappingsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!delete(String,String)'"
	 * @generated
	 */
	void delete(String appsId, String domainMappingsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists the domain mappings on an application.
	 * @param appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * @param pageSize Maximum results to return per page.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true" pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!list(String,String,Integer)'"
	 * @generated
	 */
	void list(String appsId, String pageToken, Integer pageSize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the specified domain mapping.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/domainMappings/example.com.
	 * @param domainMappingsId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" domainMappingsIdDataType="org.eclipse.cmf.occi.core.String" domainMappingsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!get(String,String)'"
	 * @generated
	 */
	void get(String appsId, String domainMappingsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the specified domain mapping. To map an SSL certificate to a domain mapping, update certificate_id to point to an AuthorizedCertificate resource. A user must be authorized to administer the associated domain in order to update a DomainMapping resource.
	 * @param updateMask Standard field mask for the set of fields to be updated.
	 * @param appsId Part of `name`. Name of the resource to update. Example: apps/myapp/domainMappings/example.com.
	 * @param domainMappingsId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model updateMaskDataType="org.eclipse.cmf.occi.core.String" updateMaskRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" domainMappingsIdDataType="org.eclipse.cmf.occi.core.String" domainMappingsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!patch(String,String,String)'"
	 * @generated
	 */
	void patch(String updateMask, String appsId, String domainMappingsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps a domain to an application. A user must be authorized to administer a domain in order to map it to an application. For a list of available authorized domains, see AuthorizedDomains.ListAuthorizedDomains.
	 * @param appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Domainmapping!create(String)'"
	 * @generated
	 */
	void create(String appsId);

} // Domainmapping
