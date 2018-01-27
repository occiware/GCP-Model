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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extra network settings. Only applicable for App Engine flexible environment versions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Network#getName <em>Name</em>}</li>
 *   <li>{@link appengine.Network#getForwardedPorts <em>Forwarded Ports</em>}</li>
 *   <li>{@link appengine.Network#getInstanceTag <em>Instance Tag</em>}</li>
 *   <li>{@link appengine.Network#getSubnetworkName <em>Subnetwork Name</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends Resource {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Google Compute Engine network where the virtual machines are created. Specify the short name, not the resource path.Defaults to default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see appengine.AppenginePackage#getNetwork_Name()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Network!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link appengine.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Forwarded Ports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of ports, or port pairs, to forward from the virtual machine to the application container. Only applicable for App Engine flexible environment versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forwarded Ports</em>' containment reference.
	 * @see #setForwardedPorts(array)
	 * @see appengine.AppenginePackage#getNetwork_ForwardedPorts()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Network!forwardedPorts'"
	 * @generated
	 */
	array getForwardedPorts();

	/**
	 * Sets the value of the '{@link appengine.Network#getForwardedPorts <em>Forwarded Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forwarded Ports</em>' containment reference.
	 * @see #getForwardedPorts()
	 * @generated
	 */
	void setForwardedPorts(array value);

	/**
	 * Returns the value of the '<em><b>Instance Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tag to apply to the VM instance during creation. Only applicable for for App Engine flexible environment versions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Tag</em>' attribute.
	 * @see #setInstanceTag(String)
	 * @see appengine.AppenginePackage#getNetwork_InstanceTag()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Network!instanceTag'"
	 * @generated
	 */
	String getInstanceTag();

	/**
	 * Sets the value of the '{@link appengine.Network#getInstanceTag <em>Instance Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Tag</em>' attribute.
	 * @see #getInstanceTag()
	 * @generated
	 */
	void setInstanceTag(String value);

	/**
	 * Returns the value of the '<em><b>Subnetwork Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Google Cloud Platform sub-network where the virtual machines are created. Specify the short name, not the resource path.If a subnetwork name is specified, a network name will also be required unless it is for the default network.
	 * If the network the VM instance is being created in is a Legacy network, then the IP address is allocated from the IPv4Range.
	 * If the network the VM instance is being created in is an auto Subnet Mode Network, then only network name should be specified (not the subnetwork_name) and the IP address is created from the IPCidrRange of the subnetwork that exists in that zone for that network.
	 * If the network the VM instance is being created in is a custom Subnet Mode Network, then the subnetwork_name must be specified and the IP address is created from the IPCidrRange of the subnetwork.If specified, the subnetwork must exist in the same region as the App Engine flexible environment application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subnetwork Name</em>' attribute.
	 * @see #setSubnetworkName(String)
	 * @see appengine.AppenginePackage#getNetwork_SubnetworkName()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Network!subnetworkName'"
	 * @generated
	 */
	String getSubnetworkName();

	/**
	 * Sets the value of the '{@link appengine.Network#getSubnetworkName <em>Subnetwork Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnetwork Name</em>' attribute.
	 * @see #getSubnetworkName()
	 * @generated
	 */
	void setSubnetworkName(String value);

} // Network
