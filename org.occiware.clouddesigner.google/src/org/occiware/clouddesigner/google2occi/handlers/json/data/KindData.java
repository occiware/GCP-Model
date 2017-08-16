package org.occiware.clouddesigner.google2occi.handlers.json.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.occiware.clouddesigner.google2occi.handlers.json.KindsBuilder;

public class KindData {

    public KindData(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.attributes = new ArrayList<>();
        this.actions = new ArrayList<>();
    }

    public final String name;
    public final String description;
    public final String type;

    public final List<AttributeData> attributes;

    public final List<ActionData> actions;
    
    public Kind toKindOcci() {
    	Kind kind = OCCIFactory.eINSTANCE.createKind();
    	kind.setName(this.name);
    	kind.setParent(KindsBuilder.resourceKind);
    	kind.setScheme(KindsBuilder.extension.getScheme());
    	kind.setTitle(this.description);
    	for (AttributeData attribute : this.attributes) {
    		kind.getAttributes().add(attribute.toAttributeOcci());
    	}
    	for (ActionData action : this.actions) {
    		kind.getActions().add(action.toActionOcci());
    	}
    	return kind;
    }

}
