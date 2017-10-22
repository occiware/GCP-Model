package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class ActionData {
	
	public final String id;
	public final String description;
	
	public ActionData(String id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public Action toActionOcci() {
		final Action action = OCCIFactory.eINSTANCE.createAction();
		action.setName(this.id);
		action.setTitle(this.description);
		return action;
	}
}
