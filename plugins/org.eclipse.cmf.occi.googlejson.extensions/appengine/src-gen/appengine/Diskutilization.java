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
 * A representation of the model object '<em><b>Diskutilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target scaling by disk usage. Only applicable for VM runtimes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Diskutilization#getTargetWriteBytesPerSecond <em>Target Write Bytes Per Second</em>}</li>
 *   <li>{@link appengine.Diskutilization#getTargetReadBytesPerSecond <em>Target Read Bytes Per Second</em>}</li>
 *   <li>{@link appengine.Diskutilization#getTargetReadOpsPerSecond <em>Target Read Ops Per Second</em>}</li>
 *   <li>{@link appengine.Diskutilization#getTargetWriteOpsPerSecond <em>Target Write Ops Per Second</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getDiskutilization()
 * @model
 * @generated
 */
public interface Diskutilization extends Resource {
	/**
	 * Returns the value of the '<em><b>Target Write Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target bytes written per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Write Bytes Per Second</em>' attribute.
	 * @see #setTargetWriteBytesPerSecond(Integer)
	 * @see appengine.AppenginePackage#getDiskutilization_TargetWriteBytesPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetWriteBytesPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Diskutilization#getTargetWriteBytesPerSecond <em>Target Write Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Write Bytes Per Second</em>' attribute.
	 * @see #getTargetWriteBytesPerSecond()
	 * @generated
	 */
	void setTargetWriteBytesPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Read Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target bytes read per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Read Bytes Per Second</em>' attribute.
	 * @see #setTargetReadBytesPerSecond(Integer)
	 * @see appengine.AppenginePackage#getDiskutilization_TargetReadBytesPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetReadBytesPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Diskutilization#getTargetReadBytesPerSecond <em>Target Read Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Read Bytes Per Second</em>' attribute.
	 * @see #getTargetReadBytesPerSecond()
	 * @generated
	 */
	void setTargetReadBytesPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Read Ops Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target ops read per seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Read Ops Per Second</em>' attribute.
	 * @see #setTargetReadOpsPerSecond(Integer)
	 * @see appengine.AppenginePackage#getDiskutilization_TargetReadOpsPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetReadOpsPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Diskutilization#getTargetReadOpsPerSecond <em>Target Read Ops Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Read Ops Per Second</em>' attribute.
	 * @see #getTargetReadOpsPerSecond()
	 * @generated
	 */
	void setTargetReadOpsPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Write Ops Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target ops written per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Write Ops Per Second</em>' attribute.
	 * @see #setTargetWriteOpsPerSecond(Integer)
	 * @see appengine.AppenginePackage#getDiskutilization_TargetWriteOpsPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getTargetWriteOpsPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Diskutilization#getTargetWriteOpsPerSecond <em>Target Write Ops Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Write Ops Per Second</em>' attribute.
	 * @see #getTargetWriteOpsPerSecond()
	 * @generated
	 */
	void setTargetWriteOpsPerSecond(Integer value);

} // Diskutilization
