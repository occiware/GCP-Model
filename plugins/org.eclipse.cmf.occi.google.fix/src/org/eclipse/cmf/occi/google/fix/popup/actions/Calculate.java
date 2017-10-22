package org.eclipse.cmf.occi.google.fix.popup.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class Calculate implements IObjectActionDelegate {
	private ISelection selection;
	private Shell shell;

	/**
	 * Constructor for Action1.
	 */
	public Calculate() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IFile occieFile = (IFile) ((IStructuredSelection) selection).getFirstElement();

		ResourceSet resourceSet = new ResourceSetImpl();
		Extension extension = (Extension) OcciHelper.getRootElement(resourceSet,
				"file:" + occieFile.getLocation().toString());
		System.out.println("extension " + extension);
		
		new FixRecord(extension).fix();
		
		// count(extension);
		

		Extension coreExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#");
		if (coreExtension == null) {
			throw new RuntimeException("Cannot load OCCI core extension!");
		}
		abstractaction(extension, coreExtension);
		
		ResourceSet resSet = new ResourceSetImpl();
		URI modelURI = URI.createURI("file:/C:/Users/schallit/runtime-EclipseApplication31072017/fixed_GCP_model/GCP-fixed.occie");
		Resource resource = resSet.createResource(modelURI);		
		resource.getContents().add(extension);
		try {
			System.out.println("Saving...");
			resource.save(Collections.emptyMap());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void abstractaction(Extension extension, Extension coreExtension ) {
		Map<String, Integer> counterPerAttribute = getCounterPerAttribute(extension);
		Map<String, Integer> counterPerAction = getCounterPerAction(extension);
		List<String> sortedAttributes = sort(counterPerAttribute);
		List<String> sortedAction = sort(counterPerAction);
		Kind abstractKind = computeAbstraction(filterExistingAbstractKind(extension), counterPerAttribute,
				sortedAttributes, 5, counterPerAction, sortedAction, 4);
		coreExtension = OcciHelper.loadExtension("http://schemas.ogf.org/occi/core#");
		if (coreExtension == null) {
			throw new RuntimeException("Cannot load OCCI core extension!");
		}
		Kind resourceKind = null;
		List<Kind> coreKinds = coreExtension.getKinds();
		for (Kind coreKind : coreKinds) {
			if (coreKind.getTerm().equals("resource")) {
				resourceKind = coreKind;
			}
		}
		abstractKind.setScheme(extension.getScheme());
		abstractKind.setParent(resourceKind);
		for (Kind kind : extension.getKinds()) {
			if (kind.getParent() != null) {
				if (kind.getParent().getTerm().equals("link")) {
					kind.setParent(resourceKind);
					System.out.println("Replaced parent for " + kind.getName());
				}
			}
			/*if (kind.getName().startsWith("AbstractKind")) {
				kind.setScheme(extension.getScheme());
				kind.setParent(resourceKind);
				List<String> kindNames = Arrays.asList(kind.getTitle().split(" "));
				for (Kind childKind : extension.getKinds()) {
					if (kindNames.contains(childKind.getName())) {
						childKind.setParent(kind);
					}
				}
			}*/
		}
		extension.getKinds().add(abstractKind);
	}

	public void count(Extension extension) {
		Map<String, Integer> counterPerAttribute = getCounterPerAttribute(extension);
		Map<String, Integer> counterPerAction = getCounterPerAction(extension);
		List<String> sortedAttributes = sort(counterPerAttribute);
		List<String> sortedAction = sort(counterPerAction);
		Kind abstractKind = computeAbstraction(filterExistingAbstractKind(extension), counterPerAttribute,
				sortedAttributes, 5, counterPerAction, sortedAction, 4);

		System.out.println(abstractKind.getName());
		System.out.println("number of child kind : " + abstractKind.getTitle().split(" ").length);
		System.out.println(abstractKind.getTitle());
		System.out.println("Attributes: " + attributesAsString(abstractKind).toString());
		System.out.println("Action: " + actionsAsString(abstractKind.getActions()).toString());

		printLatexTable(counterPerAttribute, sortedAttributes, 5, counterPerAction, sortedAction, 4,
				abstractKind.getTitle().split(" ").length, filterExistingAbstractKind(extension).size());

		// findKindWithoutGivenAction(extension, "delete");
		// findKindWithoutGivenAttribute(extension, "description");
	}

	public void printLatexTable(Map<String, Integer> counterPerAttribute, List<String> sortedAttributes,
			int numberOfAttribute, Map<String, Integer> counterPerAction, List<String> sortedAction, int numberOfAction,
			int numberOfChild, int numberTotalOfKind) {
		final String nl = System.getProperty("line.separator");
		StringBuilder buffer = new StringBuilder();
		buffer.append("\\begin{tabular}{l|rr|rr}").append(nl);
		buffer.append(
				"&\\multicolumn{2}{c|}{\\textbf{Before Abstraction}} & \\multicolumn{2}{c}{\\textbf{After Abstraction}} \\")
				.append(nl).append("\\hline");
		// Header Attributes
		buffer.append("\\hline").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}Redundant \\\\ Attributes \\end{tabular}} &").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\# \\\\ of occurrences\\end{tabular}} &").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\% \\\\ of redundancy\\end{tabular}}&").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\# \\\\ of occurrences\\end{tabular}} &").append(nl);
		buffer.append("\\multicolumn{1}{c}{")
				.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\% \\\\ of redundancy\\end{tabular}}")
				.append("} \\\\ \\hline").append(nl);

		boolean gray = false;

		// Attributes
		for (int i = 0; i < numberOfAttribute; i++) {
			String attribute = sortedAttributes.get(i);
			int counter = counterPerAttribute.get(attribute);
			String percRedundancy = String.format("%.2f", ((double) counter / (double) numberTotalOfKind) * 100.0D);
			String percRedundancyAbstract = String.format("%.2f",
					((double) (counter - numberOfChild + 1) / (double) numberTotalOfKind) * 100.0D);
			if (gray) {
				buffer.append("\\rowcolor[HTML]{EFEFEF}");
			}
			buffer.append(attribute).append("&").append(counter).append("&").append(percRedundancy).append("&")
					.append(counter - numberOfChild + 1).append("&").append(percRedundancyAbstract).append("\\\\")
					.append(nl);
			gray = !gray;
		}

		// Header Action
		buffer.append("\\hline").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}Redundant \\\\ Actions \\end{tabular}} &").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\# \\\\ of occurrences\\end{tabular}} &").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\% \\\\ of redundancy\\end{tabular}}&").append(nl);
		buffer.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\# \\\\ of occurrences\\end{tabular}} &").append(nl);
		buffer.append("\\multicolumn{1}{c}{")
				.append("\\textbf{\\begin{tabular}[c]{@{}c@{}}\\% \\\\ of redundancy\\end{tabular}}")
				.append("} \\\\ \\hline").append(nl);

		gray = false;

		// Actions
		for (int i = 0; i < numberOfAction; i++) {
			String action = sortedAction.get(i);
			int counter = counterPerAction.get(action);
			String percRedundancy = String.format("%.2f", ((double) counter / (double) numberTotalOfKind) * 100.0D);
			String percRedundancyAbstract = String.format("%.2f",
					((double) (counter - numberOfChild + 1) / (double) numberTotalOfKind) * 100.0D);
			if (gray)
				buffer.append("\\rowcolor[HTML]{EFEFEF}");
			buffer.append(action).append("&").append(counter).append("&").append(percRedundancy).append("&")
					.append(counter - numberOfChild + 1).append("&").append(percRedundancyAbstract).append("\\\\")
					.append(nl);
			gray = !gray;
		}
		buffer.append("\\hline").append(nl);
		System.out.println(buffer.toString());
	}

	/*
	 * We will take the most redundant attributes to abstract them We selected 6
	 * attributes: the most redundant.
	 */
	public Kind computeAbstraction(List<Kind> kinds, Map<String, Integer> counterPerAttribute,
			List<String> sortedAttributes, int numberOfAttribute, Map<String, Integer> counterPerAction,
			List<String> sortedAction, int numberOfAction) {
		List<Kind> kindToBeAbstract = new ArrayList<>();
		List<String> wantedAttributesToBeAbstract = sortedAttributes.subList(0, numberOfAttribute);
		List<String> wantedActionToBeAbstract = sortedAction.subList(0, numberOfAction);
		for (Kind kind : kinds) {
			List<String> attributesAsString = attributesAsString(kind);
			List<String> actionAsString = actionsAsString(kind.getActions());
			if (attributesAsString.containsAll(wantedAttributesToBeAbstract)
					&& actionAsString.containsAll(wantedActionToBeAbstract)) {
				kindToBeAbstract.add(kind);
			}
		}
		Kind abstractKind = OCCIFactory.eINSTANCE.createKind();
		abstractKind.setName("NewAbstractKind");
		abstractKind.setTitle(listOfKindToBeAbstractToString(kindToBeAbstract));
		for (Kind kind : kindToBeAbstract) {
			kind.setParent(abstractKind);
		}
		for (Attribute attribute : kindToBeAbstract.get(0).getAttributes()) {
			if (wantedAttributesToBeAbstract.contains(attribute.getName())) {
				abstractKind.getAttributes().add(copyAttribute(attribute));
			}
		}
		for (Action action : kindToBeAbstract.get(0).getActions()) {
			if (wantedActionToBeAbstract.contains(action.getName())) {
				abstractKind.getActions().add(copyAction(action));
			}
		}
		
		for (Kind kind : kinds) {
			List<Attribute> toRemoveAttribute = new ArrayList<Attribute>();
			for (Attribute attribute : kind.getAttributes()) {
				if (wantedAttributesToBeAbstract.contains(attribute.getName())) {
					toRemoveAttribute.add(attribute);
				}
			}
			kind.getAttributes().removeAll(toRemoveAttribute);
			List<Action> toRemoveAction = new ArrayList<Action>();
			for (Action action : kind.getActions()) {
				if (wantedActionToBeAbstract.contains(action.getName())) {
					toRemoveAction.add(action);
				}
			}
			kind.getActions().removeAll(toRemoveAction);
		}
		return abstractKind;
	}

	private Attribute copyAttribute(Attribute attribute) {
		Attribute copy = OCCIFactory.eINSTANCE.createAttribute();
		copy.setName(attribute.getName());
		copy.setDescription(attribute.getDescription());
		copy.setType(attribute.getType());
		return copy;
	}

	private Action copyAction(Action action) {
		Action copy = OCCIFactory.eINSTANCE.createAction();
		copy.setName(action.getName());
		copy.setScheme(action.getScheme());
		copy.setTitle(action.getTitle());
		return copy;
	}

	public String listOfKindToBeAbstractToString(List<Kind> kinds) {
		String string = "";
		for (Kind kind : kinds) {
			string += kind.getName() + " ";
		}
		return string;
	}

	public List<String> actionsAsString(List<Action> actions) {
		List<String> strings = new ArrayList<>();
		for (Action action : actions) {
			strings.add(action.getName());
		}
		return strings;
	}

	public List<String> attributesAsString(Kind kind) {
		List<String> attributesAsString = new ArrayList<>();
		for (Attribute attribute : kind.getAttributes()) {
			attributesAsString.add(attribute.getName());
		}
		return attributesAsString;
	}

	public Map<String, Integer> subtractAbstractionFromCounter(List<Kind> abstractKinds,
			Map<String, Integer> counterPerAttribute) {
		Map<String, Integer> counterPerAttributeAbtractionSubtracted = new HashMap<>(counterPerAttribute);
		for (Kind abstractKind : abstractKinds) {
			int numberOfInheritedKind = abstractKind.getTitle().split(" ").length;
			for (Attribute attribute : abstractKind.getAttributes()) {
				counterPerAttributeAbtractionSubtracted.put(attribute.getName(),
						counterPerAttribute.get(attribute.getName()) - numberOfInheritedKind);
			}
		}
		return counterPerAttributeAbtractionSubtracted;
	}

	public Map<String, Integer> getCounterPerAttribute(Extension extension) {
		Map<String, Integer> counterPerAttribute = new HashMap<>();
		for (Kind kind : extension.getKinds()) {
			for (Attribute attribute : kind.getAttributes()) {
				String key = attribute.getName(); // + ":" +
													// attribute.getType().toString();
				if (!counterPerAttribute.containsKey(key)) {
					counterPerAttribute.put(key, 0);
				}
				counterPerAttribute.put(key, counterPerAttribute.get(key) + 1);
			}
		}
		return counterPerAttribute;
	}

	public Map<String, Integer> getCounterPerAction(Extension extension) {
		Map<String, Integer> counterPerAction = new HashMap<>();
		for (Kind kind : extension.getKinds()) {
			for (Action action : kind.getActions()) {
				String key = action.getName(); // + ":" +
												// attribute.getType().toString();
				if (!counterPerAction.containsKey(key)) {
					counterPerAction.put(key, 0);
				}
				counterPerAction.put(key, counterPerAction.get(key) + 1);
			}
		}
		return counterPerAction;
	}

	public List<String> sort(Map<String, Integer> map) {
		List<String> keys = new ArrayList<String>(map.keySet());
		Collections.sort(keys, new Comparator<String>() {
			public int compare(String string1, String string2) {
				return map.get(string2) - map.get(string1);
			}
		});
		return keys;
	}

	public List<Kind> filterExistingAbstractKind(Extension extension) {
		List<Kind> kinds = new ArrayList<>(extension.getKinds());
		kinds.removeAll(getAbstractKinds(extension));
		return kinds;
	}

	public List<Kind> getAbstractKinds(Extension extension) {
		List<Kind> abstractKinds = new ArrayList<>();
		for (Kind kind : extension.getKinds()) {
			if (kind.getName().startsWith("AbstractKind")) {
				abstractKinds.add(kind);
			}
		}
		return abstractKinds;
	}

	public Map<Kind, List<Kind>> getInheritedKinds(Extension extension, List<Kind> abstractKinds) {
		Map<Kind, List<Kind>> inheritedKindPerAbstractKinds = new HashMap<>();
		for (Kind abstractKind : abstractKinds) {
			List<String> inheritedKindsNames = Arrays.asList(abstractKind.getTitle().split(" "));
			for (Kind kind : extension.getKinds()) {
				if (inheritedKindsNames.contains(kind.getName())) {
					if (!inheritedKindPerAbstractKinds.containsKey(abstractKind)) {
						inheritedKindPerAbstractKinds.put(abstractKind, new ArrayList<>());
					}
					inheritedKindPerAbstractKinds.get(abstractKind).add(kind);
				}
			}
		}
		return inheritedKindPerAbstractKinds;
	}

	public void findKindWithoutGivenAction(Extension extension, String seekedAction) {
		for (Kind kind : extension.getKinds()) {
			boolean deleteFound = false;
			for (Action action : kind.getActions()) {
				if (action.getName().equals(seekedAction)) {
					deleteFound = true;
					break;
				}
			}
			if (!deleteFound && !kind.getName().startsWith("AbstractKind")) {
				System.out.println(kind.getName());
			}
		}
	}

	public void findKindWithoutGivenAttribute(Extension extension, String seekedAttribute) {
		for (Kind kind : extension.getKinds()) {
			boolean found = false;
			for (Attribute attribute : kind.getAttributes()) {
				if (attribute.getName().equals(seekedAttribute)) {
					found = true;
					break;
				}
			}
			if (!found && !kind.getName().startsWith("AbstractKind")) {
				System.out.println(kind.getName());
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
