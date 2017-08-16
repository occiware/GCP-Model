package org.occiware.clouddesigner.google2occi.handlers.json.data;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class ActionData {
	
	public Action toActionOcci() {
		final Action action = OCCIFactory.eINSTANCE.createAction();
		return action;
	}
}
