package org.eclipse.cmf.occi.googlejson.handlers.json.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.core.util.OcciRegistry;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;

public class API {

	public final String name;
	public final String description;
	public final String title;
	public final String id;
	public final List<KindData> kinds;
	public final String nameByJSON;

	public API(String name, String description, String title, String id, String nameByJSON) {
		this.name = name;
		this.description = description;
		this.title = title;
		this.id = id;
		this.kinds = new ArrayList<>();
		this.nameByJSON = nameByJSON;
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
		createOCCIExtensionProject();
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI("file:/C:/Users/schallit/workspace-gcp/plugins/org.eclipse.cmf.occi.googlejson.extensions/" + this.nameByJSON
				+ "/model/" + this.nameByJSON + ".occie");
		Resource resource = resSet.createResource(modelURI);
		Extension extension = OCCIFactory.eINSTANCE.createExtension();
		extension.getImport().add(OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#"));
		extension.setDescription(this.description);
		extension.setScheme("http://occi/gcp" + this.name + "#");
		extension.setName(this.name);
		for (String key : StringToDataType.map.keySet()) {
			extension.getTypes().add(StringToDataType.map.get(key));
		}
		for (KindData kind : this.kinds) {
			for (AttributeData attribute : kind.attributes) {
				if (attribute.isAnotherKind) {

				}
			}
			extension.getKinds().add(kind.toKindOcci(extension));
		}
		
		// post process for setting target of Links...
		
		for (Kind kind : AttributeData.linkKindToTermOfTarget.keySet()) {
			kind.setTarget(OcciHelper.getKindByTerm(extension, AttributeData.linkKindToTermOfTarget.get(kind)));
		}
		AttributeData.linkKindToTermOfTarget.clear();

		System.out.println("Saving API " + this.name + " ...");
		try {
			resource.getContents().add(extension);
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		// Register this new OCCI extension.
		OcciRegistry.getInstance().registerExtension(extension.getScheme(), modelURI.toString());
	}

	private void createOCCIExtensionProject() {
		try {
			IProgressMonitor progressMonitor = new NullProgressMonitor();
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(this.nameByJSON);
			if (project.exists()) { // delete the existing version to rebuild it
				project.delete(true, progressMonitor);
			}
			project = ModelingProjectManager.INSTANCE.createNewModelingProject(this.nameByJSON,
					new Path("/C:/Users/schallit/workspace-gcp/plugins/org.eclipse.cmf.occi.googlejson.extensions/" + this.nameByJSON)
					, true, progressMonitor);
			ModelingProject.asModelingProject(project).get().getSession().getSelectedViewpoints(false);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}

}
