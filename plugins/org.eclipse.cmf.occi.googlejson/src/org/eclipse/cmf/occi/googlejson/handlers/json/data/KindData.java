package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.googlejson.handlers.Main;
import org.eclipse.cmf.occi.googlejson.handlers.json.KindsBuilder;

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
    
    public Kind toKindOcci(Extension extension) {
    	Kind kind = OCCIFactory.eINSTANCE.createKind();
    	kind.setName(this.name);
    	kind.setParent(Main.RESOURCE_KIND);
    	kind.setScheme(extension.getScheme());
    	kind.setTitle(this.description);
    	for (AttributeData attribute : this.attributes) {
    		Attribute occiAttribute = attribute.toAttributeOcci(kind, extension);
    		if (occiAttribute != null) {
    			kind.getAttributes().add(occiAttribute);	
    		}
    	}
    	for (ActionData action : this.actions) {
    		kind.getActions().add(action.toActionOcci(extension));
    	}
    	return kind;
    }

}
