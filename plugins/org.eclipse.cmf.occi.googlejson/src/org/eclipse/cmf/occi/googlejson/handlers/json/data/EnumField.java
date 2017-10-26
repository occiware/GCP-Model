package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import org.eclipse.cmf.occi.core.EnumerationLiteral;
import org.eclipse.cmf.occi.core.EnumerationType;
import org.eclipse.cmf.occi.core.OCCIFactory;

public class EnumField {

    public final String name;
    public final String description;

    public EnumField(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public EnumerationLiteral toOcci(EnumerationType type) {
    	EnumerationLiteral literal = OCCIFactory.eINSTANCE.createEnumerationLiteral();
    	literal.setName(this.name);
    	literal.setDocumentation(this.description);
    	literal.setEnumerationType(type);
    	return literal;
    }
}
