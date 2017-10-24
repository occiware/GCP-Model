package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class API {

    public final String name;
    public final String description;
    public final String title;
    public final String id;
    public final List<KindData> kinds;

    public API(String name, String description, String title, String id) {
        this.name = name;
        this.description = description;
        this.title = title;
        this.id = id;
        this.kinds = new ArrayList<>();
    }
    
    public KindData getKindDataPerName(String name) {
    	for (KindData kind : this.kinds) {
    		if (name.equals(kind.name)) {
    			return kind;
    		}
    	}
    	return null;
    }
    
    public void toExtensionOcci() {
    	ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/json_model/" + this.name + ".occie");
		Resource resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.setDescription(this.description);
		extension.setScheme("http://occi/gcp" + this.name + "#");
		extension.setName(this.name);
		
		for(String key : StringToDataType.map.keySet()) {
			extension.getTypes().add(StringToDataType.map.get(key));
		}
		
		for (KindData kind : this.kinds) {
			for (AttributeData attribute : kind.attributes) {
				if (attribute.isAnotherKind) {
					
				}
			}
			extension.getKinds().add(kind.toKindOcci(extension));
		}		
		System.out.println("Saving API "+ this.name + " ...");
		try {
			resource.getContents().add(extension);
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
    }
}
