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
 * A representation of the model object '<em><b>Certificaterawdata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An SSL certificate obtained from a certificate authority.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Certificaterawdata#getPublicCertificate <em>Public Certificate</em>}</li>
 *   <li>{@link appengine.Certificaterawdata#getPrivateKey <em>Private Key</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getCertificaterawdata()
 * @model
 * @generated
 */
public interface Certificaterawdata extends Resource {
	/**
	 * Returns the value of the '<em><b>Public Certificate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: <pre> -----BEGIN CERTIFICATE----- <certificate_value> -----END CERTIFICATE----- </pre>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Public Certificate</em>' attribute.
	 * @see #setPublicCertificate(String)
	 * @see appengine.AppenginePackage#getCertificaterawdata_PublicCertificate()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Certificaterawdata!publicCertificate'"
	 * @generated
	 */
	String getPublicCertificate();

	/**
	 * Sets the value of the '{@link appengine.Certificaterawdata#getPublicCertificate <em>Public Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Certificate</em>' attribute.
	 * @see #getPublicCertificate()
	 * @generated
	 */
	void setPublicCertificate(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: <pre> -----BEGIN RSA PRIVATE KEY----- <unencrypted_key_value> -----END RSA PRIVATE KEY----- </pre> @InputOnly
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see appengine.AppenginePackage#getCertificaterawdata_PrivateKey()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Certificaterawdata!privateKey'"
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link appengine.Certificaterawdata#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

} // Certificaterawdata
