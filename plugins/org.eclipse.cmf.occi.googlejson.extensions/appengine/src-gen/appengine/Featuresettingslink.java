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

import org.eclipse.cmf.occi.core.Link;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Featuresettingslink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The feature specific settings to be used in the application.
 * <!-- end-model-doc -->
 *
 *
 * @see appengine.AppenginePackage#getFeaturesettingslink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceConstraint targetConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sourceConstraint='self.source.oclIsKindOf(appengine::Application)' targetConstraint='self.target.oclIsKindOf(appengine::Featuresettings)'"
 * @generated
 */
public interface Featuresettingslink extends Link {
} // Featuresettingslink
