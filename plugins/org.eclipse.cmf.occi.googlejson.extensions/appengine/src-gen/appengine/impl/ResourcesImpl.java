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
import appengine.Resources;
import appengine.array;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.ResourcesImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link appengine.impl.ResourcesImpl#getDiskGb <em>Disk Gb</em>}</li>
 *   <li>{@link appengine.impl.ResourcesImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link appengine.impl.ResourcesImpl#getMemoryGb <em>Memory Gb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcesImpl extends ResourceImpl implements Resources {
	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected array volumes;

	/**
	 * The default value of the '{@link #getDiskGb() <em>Disk Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskGb()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISK_GB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiskGb() <em>Disk Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiskGb()
	 * @generated
	 * @ordered
	 */
	protected Integer diskGb = DISK_GB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CPU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected Integer cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryGb() <em>Memory Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryGb()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MEMORY_GB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemoryGb() <em>Memory Gb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryGb()
	 * @generated
	 * @ordered
	 */
	protected Integer memoryGb = MEMORY_GB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getResources();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public array getVolumes() {
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumes(array newVolumes, NotificationChain msgs) {
		array oldVolumes = volumes;
		volumes = newVolumes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppenginePackage.RESOURCES__VOLUMES, oldVolumes, newVolumes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumes(array newVolumes) {
		if (newVolumes != volumes) {
			NotificationChain msgs = null;
			if (volumes != null)
				msgs = ((InternalEObject)volumes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.RESOURCES__VOLUMES, null, msgs);
			if (newVolumes != null)
				msgs = ((InternalEObject)newVolumes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppenginePackage.RESOURCES__VOLUMES, null, msgs);
			msgs = basicSetVolumes(newVolumes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.RESOURCES__VOLUMES, newVolumes, newVolumes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDiskGb() {
		return diskGb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiskGb(Integer newDiskGb) {
		Integer oldDiskGb = diskGb;
		diskGb = newDiskGb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.RESOURCES__DISK_GB, oldDiskGb, diskGb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(Integer newCpu) {
		Integer oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.RESOURCES__CPU, oldCpu, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMemoryGb() {
		return memoryGb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryGb(Integer newMemoryGb) {
		Integer oldMemoryGb = memoryGb;
		memoryGb = newMemoryGb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.RESOURCES__MEMORY_GB, oldMemoryGb, memoryGb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppenginePackage.RESOURCES__VOLUMES:
				return basicSetVolumes(null, msgs);
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
			case AppenginePackage.RESOURCES__VOLUMES:
				return getVolumes();
			case AppenginePackage.RESOURCES__DISK_GB:
				return getDiskGb();
			case AppenginePackage.RESOURCES__CPU:
				return getCpu();
			case AppenginePackage.RESOURCES__MEMORY_GB:
				return getMemoryGb();
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
			case AppenginePackage.RESOURCES__VOLUMES:
				setVolumes((array)newValue);
				return;
			case AppenginePackage.RESOURCES__DISK_GB:
				setDiskGb((Integer)newValue);
				return;
			case AppenginePackage.RESOURCES__CPU:
				setCpu((Integer)newValue);
				return;
			case AppenginePackage.RESOURCES__MEMORY_GB:
				setMemoryGb((Integer)newValue);
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
			case AppenginePackage.RESOURCES__VOLUMES:
				setVolumes((array)null);
				return;
			case AppenginePackage.RESOURCES__DISK_GB:
				setDiskGb(DISK_GB_EDEFAULT);
				return;
			case AppenginePackage.RESOURCES__CPU:
				setCpu(CPU_EDEFAULT);
				return;
			case AppenginePackage.RESOURCES__MEMORY_GB:
				setMemoryGb(MEMORY_GB_EDEFAULT);
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
			case AppenginePackage.RESOURCES__VOLUMES:
				return volumes != null;
			case AppenginePackage.RESOURCES__DISK_GB:
				return DISK_GB_EDEFAULT == null ? diskGb != null : !DISK_GB_EDEFAULT.equals(diskGb);
			case AppenginePackage.RESOURCES__CPU:
				return CPU_EDEFAULT == null ? cpu != null : !CPU_EDEFAULT.equals(cpu);
			case AppenginePackage.RESOURCES__MEMORY_GB:
				return MEMORY_GB_EDEFAULT == null ? memoryGb != null : !MEMORY_GB_EDEFAULT.equals(memoryGb);
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
		result.append(" (diskGb: ");
		result.append(diskGb);
		result.append(", cpu: ");
		result.append(cpu);
		result.append(", memoryGb: ");
		result.append(memoryGb);
		result.append(')');
		return result.toString();
	}

} //ResourcesImpl
