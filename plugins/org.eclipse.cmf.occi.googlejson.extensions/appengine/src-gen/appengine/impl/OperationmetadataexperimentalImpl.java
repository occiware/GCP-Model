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
import appengine.Operationmetadataexperimental;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operationmetadataexperimental</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.OperationmetadataexperimentalImpl#getUser <em>User</em>}</li>
 *   <li>{@link appengine.impl.OperationmetadataexperimentalImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link appengine.impl.OperationmetadataexperimentalImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link appengine.impl.OperationmetadataexperimentalImpl#getInsertTime <em>Insert Time</em>}</li>
 *   <li>{@link appengine.impl.OperationmetadataexperimentalImpl#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationmetadataexperimentalImpl extends ResourceImpl implements Operationmetadataexperimental {
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertTime() <em>Insert Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertTime()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertTime() <em>Insert Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertTime()
	 * @generated
	 * @ordered
	 */
	protected String insertTime = INSERT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected String endTime = END_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationmetadataexperimentalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getOperationmetadataexperimental();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertTime() {
		return insertTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertTime(String newInsertTime) {
		String oldInsertTime = insertTime;
		insertTime = newInsertTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME, oldInsertTime, insertTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTime(String newEndTime) {
		String oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__USER:
				return getUser();
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__TARGET:
				return getTarget();
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__METHOD:
				return getMethod();
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME:
				return getInsertTime();
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__END_TIME:
				return getEndTime();
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
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__USER:
				setUser((String)newValue);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__TARGET:
				setTarget((String)newValue);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__METHOD:
				setMethod((String)newValue);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME:
				setInsertTime((String)newValue);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__END_TIME:
				setEndTime((String)newValue);
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
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__USER:
				setUser(USER_EDEFAULT);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME:
				setInsertTime(INSERT_TIME_EDEFAULT);
				return;
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
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
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__INSERT_TIME:
				return INSERT_TIME_EDEFAULT == null ? insertTime != null : !INSERT_TIME_EDEFAULT.equals(insertTime);
			case AppenginePackage.OPERATIONMETADATAEXPERIMENTAL__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
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
		result.append(" (user: ");
		result.append(user);
		result.append(", target: ");
		result.append(target);
		result.append(", method: ");
		result.append(method);
		result.append(", insertTime: ");
		result.append(insertTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(')');
		return result.toString();
	}

} //OperationmetadataexperimentalImpl
