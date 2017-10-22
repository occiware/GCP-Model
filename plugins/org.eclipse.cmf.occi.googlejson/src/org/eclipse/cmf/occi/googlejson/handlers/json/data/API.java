package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.util.ArrayList;
import java.util.List;

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
}
