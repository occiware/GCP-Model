package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class ActionData {
	
	public final String nameOfKind;
	public final String id;
	public final String description;
	public final List<AttributeData> attributes;
	
	public ActionData(String nameOfKind, String id, String description) {
		this.nameOfKind = nameOfKind;
		this.id = id;
		this.description = description;
		this.attributes = new ArrayList<AttributeData>();
	}
	
	public Action toActionOcci(Extension extension) {
		final Action action = OCCIFactory.eINSTANCE.createAction();
		action.setName(this.id);
		action.setTitle(this.description);
		for (AttributeData attribute : this.attributes) {
			action.getAttributes().add(attribute.toAttributeOcci(null, extension));	
		}
		action.setScheme(extension.getScheme().split("#")[0] + "/" + this.nameOfKind.toLowerCase() + "/action#");
		return action;
	}
}
