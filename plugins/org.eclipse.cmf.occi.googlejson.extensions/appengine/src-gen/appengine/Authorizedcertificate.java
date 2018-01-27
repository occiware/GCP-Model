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
 * A representation of the model object '<em><b>Authorizedcertificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An SSL certificate that a user has been authorized to administer. A user is authorized to administer any certificate that applies to one of their authorized domains.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Authorizedcertificate#getDomainMappingsCount <em>Domain Mappings Count</em>}</li>
 *   <li>{@link appengine.Authorizedcertificate#getDomainNames <em>Domain Names</em>}</li>
 *   <li>{@link appengine.Authorizedcertificate#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link appengine.Authorizedcertificate#getVisibleDomainMappings <em>Visible Domain Mappings</em>}</li>
 *   <li>{@link appengine.Authorizedcertificate#getExpireTime <em>Expire Time</em>}</li>
 *   <li>{@link appengine.Authorizedcertificate#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getAuthorizedcertificate()
 * @model
 * @generated
 */
public interface Authorizedcertificate extends Resource {
	/**
	 * Returns the value of the '<em><b>Domain Mappings Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aggregate count of the domain mappings with this certificate mapped. This count includes domain mappings on applications for which the user does not have VIEWER permissions.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Mappings Count</em>' attribute.
	 * @see #setDomainMappingsCount(Integer)
	 * @see appengine.AppenginePackage#getAuthorizedcertificate_DomainMappingsCount()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!domainMappingsCount'"
	 * @generated
	 */
	Integer getDomainMappingsCount();

	/**
	 * Sets the value of the '{@link appengine.Authorizedcertificate#getDomainMappingsCount <em>Domain Mappings Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Mappings Count</em>' attribute.
	 * @see #getDomainMappingsCount()
	 * @generated
	 */
	void setDomainMappingsCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Domain Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Topmost applicable domains of this certificate. This certificate applies to these domains and their subdomains. Example: example.com.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Names</em>' containment reference.
	 * @see #setDomainNames(array)
	 * @see appengine.AppenginePackage#getAuthorizedcertificate_DomainNames()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!domainNames'"
	 * @generated
	 */
	array getDomainNames();

	/**
	 * Sets the value of the '{@link appengine.Authorizedcertificate#getDomainNames <em>Domain Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Names</em>' containment reference.
	 * @see #getDomainNames()
	 * @generated
	 */
	void setDomainNames(array value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see appengine.AppenginePackage#getAuthorizedcertificate_DisplayName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!displayName'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link appengine.Authorizedcertificate#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Visible Domain Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The full paths to user visible Domain Mapping resources that have this certificate mapped. Example: apps/myapp/domainMappings/example.com.This may not represent the full list of mapped domain mappings if the user does not have VIEWER permissions on all of the applications that have this certificate mapped. See domain_mappings_count for a complete count.Only returned by GET or LIST requests when specifically requested by the view=FULL_CERTIFICATE option.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible Domain Mappings</em>' containment reference.
	 * @see #setVisibleDomainMappings(array)
	 * @see appengine.AppenginePackage#getAuthorizedcertificate_VisibleDomainMappings()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!visibleDomainMappings'"
	 * @generated
	 */
	array getVisibleDomainMappings();

	/**
	 * Sets the value of the '{@link appengine.Authorizedcertificate#getVisibleDomainMappings <em>Visible Domain Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Domain Mappings</em>' containment reference.
	 * @see #getVisibleDomainMappings()
	 * @generated
	 */
	void setVisibleDomainMappings(array value);

	/**
	 * Returns the value of the '<em><b>Expire Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time when this certificate expires. To update the renewal time on this certificate, upload an SSL certificate with a different expiration time using AuthorizedCertificates.UpdateAuthorizedCertificate.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expire Time</em>' attribute.
	 * @see #setExpireTime(String)
	 * @see appengine.AppenginePackage#getAuthorizedcertificate_ExpireTime()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!expireTime'"
	 * @generated
	 */
	String getExpireTime();

	/**
	 * Sets the value of the '{@link appengine.Authorizedcertificate#getExpireTime <em>Expire Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expire Time</em>' attribute.
	 * @see #getExpireTime()
	 * @generated
	 */
	void setExpireTime(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Full path to the AuthorizedCertificate resource in the API. Example: apps/myapp/authorizedCertificates/12345.@OutputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getAuthorizedcertificate_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Authorizedcertificate#getName <em>Name</em>}' attribute.
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
	 * Deletes the specified SSL certificate.
	 * @param authorizedCertificatesId Part of `name`. See documentation of `appsId`.
	 * @param appsId Part of `name`. Name of the resource to delete. Example: apps/myapp/authorizedCertificates/12345.
	 * <!-- end-model-doc -->
	 * @model authorizedCertificatesIdDataType="org.eclipse.cmf.occi.core.String" authorizedCertificatesIdRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!delete(String,String)'"
	 * @generated
	 */
	void delete(String authorizedCertificatesId, String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists all SSL certificates the user is authorized to administer.
	 * @param appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * @param pageSize Maximum results to return per page.
	 * @param view Controls the set of fields returned in the LIST response.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true" pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true" viewDataType="org.eclipse.cmf.occi.core.String" viewRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!list(String,String,Integer,String)'"
	 * @generated
	 */
	void list(String appsId, String pageToken, Integer pageSize, String view);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the specified SSL certificate.
	 * @param appsId Part of `name`. Name of the resource requested. Example: apps/myapp/authorizedCertificates/12345.
	 * @param view Controls the set of fields returned in the GET response.
	 * @param authorizedCertificatesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" viewDataType="org.eclipse.cmf.occi.core.String" viewRequired="true" authorizedCertificatesIdDataType="org.eclipse.cmf.occi.core.String" authorizedCertificatesIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!get(String,String,String)'"
	 * @generated
	 */
	void get(String appsId, String view, String authorizedCertificatesId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the specified SSL certificate. To renew a certificate and maintain its existing domain mappings, update certificate_data with a new certificate. The new certificate must be applicable to the same domains as the original certificate. The certificate display_name may also be updated.
	 * @param authorizedCertificatesId Part of `name`. See documentation of `appsId`.
	 * @param updateMask Standard field mask for the set of fields to be updated. Updates are only supported on the certificate_raw_data and display_name fields.
	 * @param appsId Part of `name`. Name of the resource to update. Example: apps/myapp/authorizedCertificates/12345.
	 * <!-- end-model-doc -->
	 * @model authorizedCertificatesIdDataType="org.eclipse.cmf.occi.core.String" authorizedCertificatesIdRequired="true" updateMaskDataType="org.eclipse.cmf.occi.core.String" updateMaskRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!patch(String,String,String)'"
	 * @generated
	 */
	void patch(String authorizedCertificatesId, String updateMask, String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Uploads the specified SSL certificate.
	 * @param appsId Part of `parent`. Name of the parent Application resource. Example: apps/myapp.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Authorizedcertificate!create(String)'"
	 * @generated
	 */
	void create(String appsId);

} // Authorizedcertificate
