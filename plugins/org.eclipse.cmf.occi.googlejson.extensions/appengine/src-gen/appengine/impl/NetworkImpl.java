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
package appengine.impl;

import appengine.AppenginePackage;
import appengine.Network;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.NetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link appengine.impl.NetworkImpl#getForwardedPorts <em>Forwarded Ports</em>}</li>
 *   <li>{@link appengine.impl.NetworkImpl#getInstanceTag <em>Instance Tag</em>}</li>
 *   <li>{@link appengine.impl.NetworkImpl#getSubnetworkName <em>Subnetwork Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends ResourceImpl implements Network {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForwardedPorts() <em>Forwarded Ports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForwardedPorts()
	 * @generated
	 * @ordered
	 */
	protected array forwardedPorts;

	/**
	 * The default value of the '{@link #getInstanceTag() <em>Instance Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTag()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceTag() <em>Instance Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceTag()
	 * @generated
	 * @ordered
	 */
	protected String instanceTag = INSTANCE_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetworkName() <em>Subnetwork Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetworkName() <em>Subnetwork Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetworkName()
	 * @generated
	 * @ordered
	 */
	protected String subnetworkName = SUBNETWORK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getNetwork();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getForwardedPorts() {
		return forwardedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardedPorts(array newForwardedPorts, NotificationChain msgs) {
		array oldForwardedPorts = forwardedPorts;
		forwardedPorts = newForwardedPorts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORK__FORWARDED_PORTS, oldForwardedPorts, newForwardedPorts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardedPorts(array newForwardedPorts) {
		if (newForwardedPorts != forwardedPorts) {
			NotificationChain msgs = null;
			if (forwardedPorts != null)
				msgs = ((InternalEObject)forwardedPorts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.NETWORK__FORWARDED_PORTS, null, msgs);
			if (newForwardedPorts != null)
				msgs = ((InternalEObject)newForwardedPorts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.NETWORK__FORWARDED_PORTS, null, msgs);
			msgs = basicSetForwardedPorts(newForwardedPorts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORK__FORWARDED_PORTS, newForwardedPorts, newForwardedPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceTag() {
		return instanceTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceTag(String newInstanceTag) {
		String oldInstanceTag = instanceTag;
		instanceTag = newInstanceTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORK__INSTANCE_TAG, oldInstanceTag, instanceTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetworkName() {
		return subnetworkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetworkName(String newSubnetworkName) {
		String oldSubnetworkName = subnetworkName;
		subnetworkName = newSubnetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.NETWORK__SUBNETWORK_NAME, oldSubnetworkName, subnetworkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.NETWORK__FORWARDED_PORTS:
				return basicSetForwardedPorts(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.NETWORK__NAME:
				return getName();
			case AppenginePackage.NETWORK__FORWARDED_PORTS:
				return getForwardedPorts();
			case AppenginePackage.NETWORK__INSTANCE_TAG:
				return getInstanceTag();
			case AppenginePackage.NETWORK__SUBNETWORK_NAME:
				return getSubnetworkName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppenginePackage.NETWORK__NAME:
				setName((String)newValue);
				return;
			case AppenginePackage.NETWORK__FORWARDED_PORTS:
				setForwardedPorts((array)newValue);
				return;
			case AppenginePackage.NETWORK__INSTANCE_TAG:
				setInstanceTag((String)newValue);
				return;
			case AppenginePackage.NETWORK__SUBNETWORK_NAME:
				setSubnetworkName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AppenginePackage.NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AppenginePackage.NETWORK__FORWARDED_PORTS:
				setForwardedPorts((array)null);
				return;
			case AppenginePackage.NETWORK__INSTANCE_TAG:
				setInstanceTag(INSTANCE_TAG_EDEFAULT);
				return;
			case AppenginePackage.NETWORK__SUBNETWORK_NAME:
				setSubnetworkName(SUBNETWORK_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AppenginePackage.NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AppenginePackage.NETWORK__FORWARDED_PORTS:
				return forwardedPorts != null;
			case AppenginePackage.NETWORK__INSTANCE_TAG:
				return INSTANCE_TAG_EDEFAULT == null ? instanceTag != null : !INSTANCE_TAG_EDEFAULT.equals(instanceTag);
			case AppenginePackage.NETWORK__SUBNETWORK_NAME:
				return SUBNETWORK_NAME_EDEFAULT == null ? subnetworkName != null : !SUBNETWORK_NAME_EDEFAULT.equals(subnetworkName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", instanceTag: ");
		result.append(instanceTag);
		result.append(", subnetworkName: ");
		result.append(subnetworkName);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
