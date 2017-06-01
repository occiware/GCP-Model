/**
 */
package org.model.google.occi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.model.google.occi.Resource#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.model.google.occi.Resource#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.model.google.occi.OcciPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResourceKindIsInParent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ResourceKindIsInParent='kind->closure(parent)->exists(k | k.term = \'resource\' and k.scheme = \'http://schemas.ogf.org/occi/core#\')'"
 * @generated
 */
public interface Resource extends Entity {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.model.google.occi.OcciPackage#getResource_Summary()
	 * @model dataType="org.model.google.occi.String"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.model.google.occi.Resource#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.model.google.occi.Link}.
	 * It is bidirectional and its opposite is '{@link org.model.google.occi.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.model.google.occi.OcciPackage#getResource_Links()
	 * @see org.model.google.occi.Link#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Resource
