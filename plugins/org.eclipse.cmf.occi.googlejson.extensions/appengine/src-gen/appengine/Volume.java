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
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Volumes mounted within the app container. Only applicable for VM runtimes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Volume#getVolumeType <em>Volume Type</em>}</li>
 *   <li>{@link appengine.Volume#getSizeGb <em>Size Gb</em>}</li>
 *   <li>{@link appengine.Volume#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends Resource {
	/**
	 * Returns the value of the '<em><b>Volume Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Underlying volume type, e.g. 'tmpfs'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Type</em>' attribute.
	 * @see #setVolumeType(String)
	 * @see appengine.AppenginePackage#getVolume_VolumeType()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getVolumeType();

	/**
	 * Sets the value of the '{@link appengine.Volume#getVolumeType <em>Volume Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Type</em>' attribute.
	 * @see #getVolumeType()
	 * @generated
	 */
	void setVolumeType(String value);

	/**
	 * Returns the value of the '<em><b>Size Gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volume size in gigabytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Gb</em>' attribute.
	 * @see #setSizeGb(Integer)
	 * @see appengine.AppenginePackage#getVolume_SizeGb()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getSizeGb();

	/**
	 * Sets the value of the '{@link appengine.Volume#getSizeGb <em>Size Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Gb</em>' attribute.
	 * @see #getSizeGb()
	 * @generated
	 */
	void setSizeGb(Integer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique name for the volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getVolume_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Volume#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Volume
