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
 * A representation of the model object '<em><b>Networkutilization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Target scaling by network usage. Only applicable for VM runtimes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Networkutilization#getTargetSentPacketsPerSecond <em>Target Sent Packets Per Second</em>}</li>
 *   <li>{@link appengine.Networkutilization#getTargetReceivedBytesPerSecond <em>Target Received Bytes Per Second</em>}</li>
 *   <li>{@link appengine.Networkutilization#getTargetReceivedPacketsPerSecond <em>Target Received Packets Per Second</em>}</li>
 *   <li>{@link appengine.Networkutilization#getTargetSentBytesPerSecond <em>Target Sent Bytes Per Second</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getNetworkutilization()
 * @model
 * @generated
 */
public interface Networkutilization extends Resource {
	/**
	 * Returns the value of the '<em><b>Target Sent Packets Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target packets sent per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Sent Packets Per Second</em>' attribute.
	 * @see #setTargetSentPacketsPerSecond(Integer)
	 * @see appengine.AppenginePackage#getNetworkutilization_TargetSentPacketsPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Networkutilization!targetSentPacketsPerSecond'"
	 * @generated
	 */
	Integer getTargetSentPacketsPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Networkutilization#getTargetSentPacketsPerSecond <em>Target Sent Packets Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Sent Packets Per Second</em>' attribute.
	 * @see #getTargetSentPacketsPerSecond()
	 * @generated
	 */
	void setTargetSentPacketsPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Received Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target bytes received per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Received Bytes Per Second</em>' attribute.
	 * @see #setTargetReceivedBytesPerSecond(Integer)
	 * @see appengine.AppenginePackage#getNetworkutilization_TargetReceivedBytesPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Networkutilization!targetReceivedBytesPerSecond'"
	 * @generated
	 */
	Integer getTargetReceivedBytesPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Networkutilization#getTargetReceivedBytesPerSecond <em>Target Received Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Received Bytes Per Second</em>' attribute.
	 * @see #getTargetReceivedBytesPerSecond()
	 * @generated
	 */
	void setTargetReceivedBytesPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Received Packets Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target packets received per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Received Packets Per Second</em>' attribute.
	 * @see #setTargetReceivedPacketsPerSecond(Integer)
	 * @see appengine.AppenginePackage#getNetworkutilization_TargetReceivedPacketsPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Networkutilization!targetReceivedPacketsPerSecond'"
	 * @generated
	 */
	Integer getTargetReceivedPacketsPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Networkutilization#getTargetReceivedPacketsPerSecond <em>Target Received Packets Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Received Packets Per Second</em>' attribute.
	 * @see #getTargetReceivedPacketsPerSecond()
	 * @generated
	 */
	void setTargetReceivedPacketsPerSecond(Integer value);

	/**
	 * Returns the value of the '<em><b>Target Sent Bytes Per Second</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target bytes sent per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Sent Bytes Per Second</em>' attribute.
	 * @see #setTargetSentBytesPerSecond(Integer)
	 * @see appengine.AppenginePackage#getNetworkutilization_TargetSentBytesPerSecond()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Networkutilization!targetSentBytesPerSecond'"
	 * @generated
	 */
	Integer getTargetSentBytesPerSecond();

	/**
	 * Sets the value of the '{@link appengine.Networkutilization#getTargetSentBytesPerSecond <em>Target Sent Bytes Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Sent Bytes Per Second</em>' attribute.
	 * @see #getTargetSentBytesPerSecond()
	 * @generated
	 */
	void setTargetSentBytesPerSecond(Integer value);

} // Networkutilization
