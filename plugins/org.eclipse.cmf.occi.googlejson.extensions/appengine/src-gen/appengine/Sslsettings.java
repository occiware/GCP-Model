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
 * A representation of the model object '<em><b>Sslsettings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SSL configuration for a DomainMapping resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Sslsettings#getCertificateId <em>Certificate Id</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getSslsettings()
 * @model
 * @generated
 */
public interface Sslsettings extends Resource {
	/**
	 * Returns the value of the '<em><b>Certificate Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support. Example: 12345.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Certificate Id</em>' attribute.
	 * @see #setCertificateId(String)
	 * @see appengine.AppenginePackage#getSslsettings_CertificateId()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getCertificateId();

	/**
	 * Sets the value of the '{@link appengine.Sslsettings#getCertificateId <em>Certificate Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Id</em>' attribute.
	 * @see #getCertificateId()
	 * @generated
	 */
	void setCertificateId(String value);

} // Sslsettings
