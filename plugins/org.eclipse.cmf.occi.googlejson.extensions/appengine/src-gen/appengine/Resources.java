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
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Machine resources for a version.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Resources#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link appengine.Resources#getDiskGb <em>Disk Gb</em>}</li>
 *   <li>{@link appengine.Resources#getCpu <em>Cpu</em>}</li>
 *   <li>{@link appengine.Resources#getMemoryGb <em>Memory Gb</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends Resource {
	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User specified volumes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference.
	 * @see #setVolumes(array)
	 * @see appengine.AppenginePackage#getResources_Volumes()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Resources!volumes'"
	 * @generated
	 */
	array getVolumes();

	/**
	 * Sets the value of the '{@link appengine.Resources#getVolumes <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes</em>' containment reference.
	 * @see #getVolumes()
	 * @generated
	 */
	void setVolumes(array value);

	/**
	 * Returns the value of the '<em><b>Disk Gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disk size (GB) needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Gb</em>' attribute.
	 * @see #setDiskGb(Integer)
	 * @see appengine.AppenginePackage#getResources_DiskGb()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Resources!diskGb'"
	 * @generated
	 */
	Integer getDiskGb();

	/**
	 * Sets the value of the '{@link appengine.Resources#getDiskGb <em>Disk Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Gb</em>' attribute.
	 * @see #getDiskGb()
	 * @generated
	 */
	void setDiskGb(Integer value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of CPU cores needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(Integer)
	 * @see appengine.AppenginePackage#getResources_Cpu()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Resources!cpu'"
	 * @generated
	 */
	Integer getCpu();

	/**
	 * Sets the value of the '{@link appengine.Resources#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(Integer value);

	/**
	 * Returns the value of the '<em><b>Memory Gb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Memory (GB) needed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Memory Gb</em>' attribute.
	 * @see #setMemoryGb(Integer)
	 * @see appengine.AppenginePackage#getResources_MemoryGb()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Resources!memoryGb'"
	 * @generated
	 */
	Integer getMemoryGb();

	/**
	 * Sets the value of the '{@link appengine.Resources#getMemoryGb <em>Memory Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Gb</em>' attribute.
	 * @see #getMemoryGb()
	 * @generated
	 */
	void setMemoryGb(Integer value);

} // Resources
