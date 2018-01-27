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
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Code and application artifacts used to deploy a version to App Engine.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Deployment#getFiles <em>Files</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends Resource {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Files</em>' attribute.
	 * @see #setFiles(Object)
	 * @see appengine.AppenginePackage#getDeployment_Files()
	 * @model dataType="appengine.object" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Deployment!files'"
	 * @generated
	 */
	Object getFiles();

	/**
	 * Sets the value of the '{@link appengine.Deployment#getFiles <em>Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Files</em>' attribute.
	 * @see #getFiles()
	 * @generated
	 */
	void setFiles(Object value);

} // Deployment
