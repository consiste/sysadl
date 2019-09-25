package metrics;

import com.google.inject.Injector;

import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JFrame;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.sysadl.ComponentDef;
import org.sysadl.ConnectorDef;
import org.sysadl.Model;
import org.sysadl.Package;
import org.sysadl.Requirement;
import org.sysadl.SysADLPackage;
import org.sysadl.SysADLStandaloneSetup;

public class Main {

	public static void main(String[] args) {
		String filePath = null; // put here the path to the file u wanna load
		//filePath = "C:\\LIDIANE\\Estudos\\DOUTORADO\\GitHubDesktop\\sysadl\\samples\\SmartPlaceIoTStyle\\SmartPlace.sysadl";
		
		// just to be nice, select the file with a file dialog

		FileDialog dialog = new FileDialog(new JFrame());
		dialog.setTitle("Select external archive");
		dialog.setVisible(true);
		for (File f : dialog.getFiles()) {
			filePath = f.getAbsolutePath();
		}

		System.out.println(filePath);

		// from here on I load the model using the xtext standalonesetup (we should do the same in acceleo)
		SysADLStandaloneSetup s = new SysADLStandaloneSetup();
		SysADLPackage.eINSTANCE.eClass();
		Injector i = s.createInjectorAndDoEMFRegistration();
		ResourceSet rs = i.getInstance(XtextResourceSet.class);
		Resource r = rs.getResource(URI.createFileURI(filePath), true);
		try {
			r.load(null);
			Model model = (Model) r.getContents().get(0);
			//System.out.println(model.getName());
			
			List<ComponentDef> componentDefs = returnComponentDefs(model.getPackages());
			int connectors = countConnectors(model.getPackages());
			List<Requirement> finalRequirements = returnFinalRequirements(model.getRequirements());
												
			//Smart Home requirements dependences
			Hashtable<String, List<String>> tableDepReq = new Hashtable<>();
			tableDepReq.put("1.1.1", Arrays.asList("1.2"));
			tableDepReq.put("1.1.2", Arrays.asList("1.2"));
			tableDepReq.put("1.1.4", Arrays.asList("1.2"));
			tableDepReq.put("1.1.5", Arrays.asList("1.2"));
			tableDepReq.put("1.6.1.1", Arrays.asList("1.1.2"));
			tableDepReq.put("1.10", Arrays.asList("1.6.1", "1.6.1.1", "1.3.2", "1.3.1", "1.5.1", "1.5.2"));
			tableDepReq.put("1.10.1", Arrays.asList("1.6.1", "1.6.1.1", "1.3.2", "1.3.1", "1.5.1", "1.5.2"));
			tableDepReq.put("1.10.2", Arrays.asList("1.6.1", "1.6.1.1", "1.3.2", "1.3.1", "1.5.1", "1.5.2"));
			tableDepReq.put("1.10.3", Arrays.asList("1.6.1", "1.6.1.1", "1.3.2", "1.3.1", "1.5.1", "1.5.2"));
			tableDepReq.put("1.3.1", Arrays.asList("1.3.1.1", "1.3.1.2"));
			tableDepReq.put("1.3.1.1", Arrays.asList("1.1.5"));
			tableDepReq.put("1.8.2", Arrays.asList("1.8.1"));
			tableDepReq.put("1.8.3", Arrays.asList("1.8.1"));
			tableDepReq.put("1.8.4.1", Arrays.asList("1.8.1"));
			tableDepReq.put("1.8.4.2", Arrays.asList("1.8.1"));
			
			//Smart Place riquirements dependences
			/*tableDepReq.put("2.2", 2);
			tableDepReq.put("2.4", 3);
			tableDepReq.put("2.7", 2);
			tableDepReq.put("2.8", 2);
			tableDepReq.put("3", 4);
			tableDepReq.put("2.9", 4);*/
			
			System.out.println("Modularity: "+ countModularity(componentDefs.size(), connectors, finalRequirements.size()));
			System.out.println("Coupling: "+ countCoupling(componentDefs.size(), countAssociations(componentDefs)));
			System.out.println("Cohesion: "+ averageCohesion(returnTableCompReq(finalRequirements, tableDepReq), tableDepReq));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String averageCohesion(Hashtable<String, List<String>> tableCompReqs, Hashtable<String, List<String>> tableDepReq) {
		double[] averageCohesion = {0};
		
		tableCompReqs.forEach((k, v) -> {averageCohesion[0] += countCohesion(v, tableDepReq);});
		averageCohesion[0] = averageCohesion[0] / tableCompReqs.size();
		
		DecimalFormat df = new DecimalFormat("0.0000");
		return df.format(averageCohesion[0]);
	}
	
	public static double countCohesion(List<String> reqs, Hashtable<String, List<String>> tableDepReq) {
		double cohesion = 0;
		double Dtheoretical = 0;
		double Dactual = 0;
		
		for(int i = 0; i < reqs.size(); i++) {
			Dtheoretical += i;
			
			if(tableDepReq.containsKey(reqs.get(i)))
				Dactual += tableDepReq.get(reqs.get(i)).size();
		}
        
		if(Dtheoretical != 0) {
			Dtheoretical = Dtheoretical * 2;
			cohesion = Dactual / Dtheoretical;
		}else {
			cohesion = 1;
		}
		
		return cohesion;
	}
	
	public static Hashtable<String, List<String>> returnTableCompReq(List<Requirement> listReq, Hashtable<String, List<String>> tableDepReq) {
		Hashtable<String, List<String>> tableCompReqs = new Hashtable<>(); //associates each component with the requirements it implements
		List<String> reqIds = new ArrayList<String>();
		String idReq, nameCP;
		
		for (int i = 0; i < listReq.size(); i++) {
			idReq = listReq.get(i).getId();
			
			for (int j = 0; j < listReq.get(i).getSatisfiedBy().size(); j++) { //has satisfies
				nameCP = listReq.get(i).getSatisfiedBy().get(j).getName();
				reqIds = new ArrayList<String>();	
				
				if(tableCompReqs.get(nameCP) != null) { //component already exists in table
					reqIds = tableCompReqs.get(nameCP);
				}
				
				reqIds.add(idReq);
				if(tableDepReq.get(idReq) != null) { //if the requirement has dependencies ...
					reqIds.addAll(tableDepReq.get(idReq)); //add all dependencies between component internal requirements
				}
				reqIds = reqIds.stream().distinct().collect(Collectors.toList()); //remove duplicate requirements

				tableCompReqs.put(nameCP, reqIds);
			}
			
		}
		
		return tableCompReqs;
	}
	
	public static String countCoupling(double components, double associations) {
		DecimalFormat df = new DecimalFormat("0.0000");
		return df.format(associations / (Math.pow(components, 2.0) - components));
	}
	
	public static int countAssociations(List<ComponentDef> componentDefs) {
		int count=0;
		
		for (int i = 0; i < componentDefs.size(); i++) {
			if (componentDefs.get(i).getComposite() != null) {
				count = count + componentDefs.get(i).getComposite().getDelegations().size() + 
						(componentDefs.get(i).getComposite().getConnectors().size() * 2); //each connector represents two associations
			}
		}
		
		return count;
	}
	
	public static String countModularity(double components, double connectors, double requitements) {
		DecimalFormat df = new DecimalFormat("0.0000");
		return df.format(1 - ((requitements / (components + connectors)) / requitements));
	}
	
	public static List<ComponentDef> returnComponentDefs(EList<Package> p) {
		List<ComponentDef> listComponents = new ArrayList<>();
		
		for (int i = 0; i < p.size(); i++) {
			for (int j = 0; j < p.get(i).getDefinitions().size(); j++) {
				if(p.get(i).getDefinitions().get(j) instanceof ComponentDef) {
					listComponents.add((ComponentDef) p.get(i).getDefinitions().get(j));
				}
			}
		}
		
		return listComponents;
	}
	
	public static int countConnectors(EList<Package> p) {
		int count = 0;
		
		for (int i = 0; i < p.size(); i++) {
			for (int j = 0; j < p.get(i).getDefinitions().size(); j++) {
				if(p.get(i).getDefinitions().get(j) instanceof ConnectorDef) {
					count++;
				}
			}
		}
		
		return count;
	}

	public static List<Requirement> returnFinalRequirements(EList<Requirement> reqs) {
		List<Requirement> listReq = new ArrayList<Requirement>();
		
		for (int j = 0; j < reqs.size(); j++) {
			if(j == 0)
				listReq.addAll(returnFinalCompositionReq(reqs.get(j)));
			else
				listReq.add(reqs.get(j));
		}
		
		return listReq;
	}
	
	public static List<Requirement> returnFinalCompositionReq(Requirement rq) {
		List<Requirement> listReq = new ArrayList<Requirement>();
		
		if (rq.getComposition().size() == 0) { //final requirement
			listReq.add(rq);
		}
		
		for(int i=0; i<rq.getComposition().size(); i++) {
			listReq.addAll(returnFinalCompositionReq(rq.getComposition().get(i)));
		}
		
		return listReq;
	}
}