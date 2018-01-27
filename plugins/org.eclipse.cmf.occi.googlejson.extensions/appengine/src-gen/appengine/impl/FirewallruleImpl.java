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
import appengine.Firewallrule;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firewallrule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link appengine.impl.FirewallruleImpl#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link appengine.impl.FirewallruleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link appengine.impl.FirewallruleImpl#getAction <em>Action</em>}</li>
 *   <li>{@link appengine.impl.FirewallruleImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirewallruleImpl extends ResourceImpl implements Firewallrule {
	/**
	 * The default value of the '{@link #getSourceRange() <em>Source Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRange()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRange() <em>Source Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRange()
	 * @generated
	 * @ordered
	 */
	protected String sourceRange = SOURCE_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Integer priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirewallruleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppenginePackage.eINSTANCE.getFirewallrule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceRange() {
		return sourceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRange(String newSourceRange) {
		String oldSourceRange = sourceRange;
		sourceRange = newSourceRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FIREWALLRULE__SOURCE_RANGE, oldSourceRange, sourceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Integer newPriority) {
		Integer oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FIREWALLRULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FIREWALLRULE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppenginePackage.FIREWALLRULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get(final String appsId, final String ingressRulesId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Firewallrule!get(String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void patch(final String updateMask, final String appsId, final String ingressRulesId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Firewallrule!patch(String,String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void batchupdate(final String appsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Firewallrule!batchupdate(String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void delete(final String appsId, final String ingressRulesId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Firewallrule!delete(String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void list(final Integer pageSize, final String matchingAddress, final String appsId, final String pageToken) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Firewallrule!list(Integer,String,String,String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void create(final String appsId) {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occi/gcpappengine/ecore!Firewallrule!create(String)
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppenginePackage.FIREWALLRULE__SOURCE_RANGE:
				return getSourceRange();
			case AppenginePackage.FIREWALLRULE__PRIORITY:
				return getPriority();
			case AppenginePackage.FIREWALLRULE__ACTION:
				return getAction();
			case AppenginePackage.FIREWALLRULE__DESCRIPTION:
				return getDescription();
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
			case AppenginePackage.FIREWALLRULE__SOURCE_RANGE:
				setSourceRange((String)newValue);
				return;
			case AppenginePackage.FIREWALLRULE__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case AppenginePackage.FIREWALLRULE__ACTION:
				setAction((String)newValue);
				return;
			case AppenginePackage.FIREWALLRULE__DESCRIPTION:
				setDescription((String)newValue);
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
			case AppenginePackage.FIREWALLRULE__SOURCE_RANGE:
				setSourceRange(SOURCE_RANGE_EDEFAULT);
				return;
			case AppenginePackage.FIREWALLRULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case AppenginePackage.FIREWALLRULE__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case AppenginePackage.FIREWALLRULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case AppenginePackage.FIREWALLRULE__SOURCE_RANGE:
				return SOURCE_RANGE_EDEFAULT == null ? sourceRange != null : !SOURCE_RANGE_EDEFAULT.equals(sourceRange);
			case AppenginePackage.FIREWALLRULE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case AppenginePackage.FIREWALLRULE__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case AppenginePackage.FIREWALLRULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppenginePackage.FIREWALLRULE___GET__STRING_STRING:
				get((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case AppenginePackage.FIREWALLRULE___PATCH__STRING_STRING_STRING:
				patch((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
			case AppenginePackage.FIREWALLRULE___BATCHUPDATE__STRING:
				batchupdate((String)arguments.get(0));
				return null;
			case AppenginePackage.FIREWALLRULE___DELETE__STRING_STRING:
				delete((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case AppenginePackage.FIREWALLRULE___LIST__INTEGER_STRING_STRING_STRING:
				list((Integer)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
				return null;
			case AppenginePackage.FIREWALLRULE___CREATE__STRING:
				create((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (sourceRange: ");
		result.append(sourceRange);
		result.append(", priority: ");
		result.append(priority);
		result.append(", action: ");
		result.append(action);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //FirewallruleImpl
