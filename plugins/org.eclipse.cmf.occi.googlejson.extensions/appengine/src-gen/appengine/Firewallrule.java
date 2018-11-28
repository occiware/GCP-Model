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
 * A representation of the model object '<em><b>Firewallrule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single firewall rule that is evaluated against incoming traffic and provides an action to take on matched requests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link appengine.Firewallrule#getSourceRange <em>Source Range</em>}</li>
 *   <li>{@link appengine.Firewallrule#getPriority <em>Priority</em>}</li>
 *   <li>{@link appengine.Firewallrule#getAction <em>Action</em>}</li>
 *   <li>{@link appengine.Firewallrule#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see appengine.AppenginePackage#getFirewallrule()
 * @model
 * @generated
 */
public interface Firewallrule extends Resource {
	/**
	 * Returns the value of the '<em><b>Source Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP address or range, defined using CIDR notation, of requests that this rule applies to. You can use the wildcard character "*" to match all IPs equivalent to "0/0" and "::/0" together. Examples: 192.168.1.1 or 192.168.0.0/16 or 2001:db8::/32  or 2001:0db8:0000:0042:0000:8a2e:0370:7334.<p>Truncation will be silently performed on addresses which are not properly truncated. For example, 1.2.3.4/24 is accepted as the same address as 1.2.3.0/24. Similarly, for IPv6, 2001:db8::1/32 is accepted as the same address as 2001:db8::/32.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Range</em>' attribute.
	 * @see #setSourceRange(String)
	 * @see appengine.AppenginePackage#getFirewallrule_SourceRange()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getSourceRange();

	/**
	 * Sets the value of the '{@link appengine.Firewallrule#getSourceRange <em>Source Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Range</em>' attribute.
	 * @see #getSourceRange()
	 * @generated
	 */
	void setSourceRange(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A positive integer between 1, Int32.MaxValue-1 that defines the order of rule evaluation. Rules with the lowest priority are evaluated first.A default rule at priority Int32.MaxValue matches all IPv4 and IPv6 traffic when no previous rule matches. Only the action of this rule can be modified by the user.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Integer)
	 * @see appengine.AppenginePackage#getFirewallrule_Priority()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer" required="true"
	 * @generated
	 */
	Integer getPriority();

	/**
	 * Sets the value of the '{@link appengine.Firewallrule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Integer value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The action to take on matched requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see appengine.AppenginePackage#getFirewallrule_Action()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link appengine.Firewallrule#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional string description of this rule. This field has a maximum length of 100 characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see appengine.AppenginePackage#getFirewallrule_Description()
	 * @model dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link appengine.Firewallrule#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets the specified firewall rule.
	 * @param appsId Part of `name`. Name of the Firewall resource to retrieve. Example: apps/myapp/firewall/ingressRules/100.
	 * @param ingressRulesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" ingressRulesIdDataType="org.eclipse.cmf.occi.core.String" ingressRulesIdRequired="true"
	 * @generated
	 */
	void get(String appsId, String ingressRulesId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the specified firewall rule.
	 * @param updateMask Standard field mask for the set of fields to be updated.
	 * @param appsId Part of `name`. Name of the Firewall resource to update. Example: apps/myapp/firewall/ingressRules/100.
	 * @param ingressRulesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model updateMaskDataType="org.eclipse.cmf.occi.core.String" updateMaskRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" ingressRulesIdDataType="org.eclipse.cmf.occi.core.String" ingressRulesIdRequired="true"
	 * @generated
	 */
	void patch(String updateMask, String appsId, String ingressRulesId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replaces the entire firewall ruleset in one bulk operation. This overrides and replaces the rules of an existing firewall with the new rules.If the final rule does not match traffic with the '*' wildcard IP range, then an "allow all" rule is explicitly added to the end of the list.
	 * @param appsId Part of `name`. Name of the Firewall collection to set. Example: apps/myapp/firewall/ingressRules.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 * @generated
	 */
	void batchupdate(String appsId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deletes the specified firewall rule.
	 * @param appsId Part of `name`. Name of the Firewall resource to delete. Example: apps/myapp/firewall/ingressRules/100.
	 * @param ingressRulesId Part of `name`. See documentation of `appsId`.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" ingressRulesIdDataType="org.eclipse.cmf.occi.core.String" ingressRulesIdRequired="true"
	 * @generated
	 */
	void delete(String appsId, String ingressRulesId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists the firewall rules of an application.
	 * @param pageSize Maximum results to return per page.
	 * @param matchingAddress A valid IP Address. If set, only rules matching this address will be returned. The first returned rule will be the rule that fires on requests from this IP.
	 * @param appsId Part of `parent`. Name of the Firewall collection to retrieve. Example: apps/myapp/firewall/ingressRules.
	 * @param pageToken Continuation token for fetching the next page of results.
	 * <!-- end-model-doc -->
	 * @model pageSizeDataType="org.eclipse.cmf.occi.core.Integer" pageSizeRequired="true" matchingAddressDataType="org.eclipse.cmf.occi.core.String" matchingAddressRequired="true" appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true" pageTokenDataType="org.eclipse.cmf.occi.core.String" pageTokenRequired="true"
	 * @generated
	 */
	void list(Integer pageSize, String matchingAddress, String appsId, String pageToken);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a firewall rule for the application.
	 * @param appsId Part of `parent`. Name of the parent Firewall collection in which to create a new rule. Example: apps/myapp/firewall/ingressRules.
	 * <!-- end-model-doc -->
	 * @model appsIdDataType="org.eclipse.cmf.occi.core.String" appsIdRequired="true"
	 * @generated
	 */
	void create(String appsId);

} // Firewallrule
