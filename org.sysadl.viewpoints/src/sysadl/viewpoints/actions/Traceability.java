package sysadl.viewpoints.actions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.color.RGBValuesProvider;
import org.eclipse.sirius.business.api.dialect.command.RefreshRepresentationsCommand;
import org.eclipse.sirius.diagram.BorderedStyle;
import org.eclipse.sirius.diagram.ContainerStyle;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DDiagramElementContainer;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DNodeList;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.diagram.NodeStyle;
import org.eclipse.sirius.diagram.Square;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeListSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.description.style.NodeStyleDescription;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.impl.DNodeImpl;
import org.eclipse.sirius.diagram.impl.SquareImpl;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.Decoration;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.Style;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.sirius.viewpoint.description.impl.ColorDescriptionImpl;
import org.eclipse.sirius.viewpoint.description.style.StyleDescription;
import org.eclipse.sirius.viewpoint.impl.DecorationImpl;
import org.sysadl.ComponentDef;

public class Traceability implements IExternalJavaAction{

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		// TODO Auto-generated method stub		
		DNodeContainerSpec d = (DNodeContainerSpec) arg1.get("componnet");
		ArrayList<String> structures = new ArrayList<String>();
		structures = getStructureForApplyTracebility();
		EObject container = getContainer(d);
		for (DDiagramElement node : ((DSemanticDiagramSpec)container).getOwnedDiagramElements() ) {
			if (node instanceof DNodeContainerSpec) {
				for (DDiagramElement nodeSpec : ((DNodeContainerSpec)node).getOwnedDiagramElements()) {
					if(structures.contains(((DNodeSpec)nodeSpec).getName().replace("<<component>>", "").replace("[1..1]", "").trim().split(":")[0])) {
						Style style = ((DNodeSpec)nodeSpec).getStyle();	
						style.getCustomFeatures().clear();
						((Square)style).setBorderColor(RGBValues.create(255, 0, 0));
						((Square)style).setBorderSizeComputationExpression("2");
						((Square)style).setBorderSize(2);
						((Square)style).setColor(RGBValues.create(255, 0, 0));
						SquareDescription sd = (SquareDescription) style.getDescription();
						ColorDescription desc = sd.getBorderColor();
						SystemColor sc = (SystemColor) desc;
						LineStyle ls = sd.getBorderLineStyle();					
						sd.setBorderSizeComputationExpression("2");	
						style.getCustomFeatures().clear();
						style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
						style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_LINE_STYLE.getName());
						style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE_COMPUTATION_EXPRESSION.getName());											
					}
					else {
						Style style = ((DNodeSpec)nodeSpec).getStyle();	
						style.getCustomFeatures().clear();
						((Square)style).setBorderColor(RGBValues.create(0, 0, 0));
						((Square)style).setBorderSizeComputationExpression("0");
						((Square)style).setBorderSize(0);
						((Square)style).setColor(RGBValues.create(0, 0, 0));						
						style.getCustomFeatures().clear();
						style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
						style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_LINE_STYLE.getName());
						style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_SIZE_COMPUTATION_EXPRESSION.getName());
					}
				}
				
			}
			else if (node instanceof DEdgeSpec) {
				if(structures.contains(((DEdgeSpec)node).getName())) {
					Style style = ((DEdgeSpec)node).getStyle();
					style.getCustomFeatures().clear();
					((EdgeStyle)style).setStrokeColor(RGBValues.create(255, 0, 0));
					
					style.getCustomFeatures().add(DiagramPackage.Literals.EDGE_STYLE__STROKE_COLOR.getName());
					
				}
				else {
					Style style = ((DEdgeSpec)node).getStyle();
					style.getCustomFeatures().clear();
					((EdgeStyle)style).setStrokeColor(RGBValues.create(136,136,136));
					
					style.getCustomFeatures().add(DiagramPackage.Literals.EDGE_STYLE__STROKE_COLOR.getName());
				}
			}
			
		}
				
		
		
		/*
		ColorDescription desc = d.getActualMapping().getStyle().getBorderColor();
		SystemColor sc = (SystemColor) desc;					
		sc.setBlue(225);
		sc.setGreen(225);
		sc.setRed(0);
		d.getActualMapping().getStyle().setBorderColor(sc);
		d.getActualMapping().getStyle().setBorderSizeComputationExpression("10");	
		*/	
		
	}
	
	
	
	private static EObject getContainer(DNodeContainerSpec node) {
		return node.eContainer();
	}
	
	
	private ArrayList<String> getStructureForApplyTracebility(){
		ArrayList<String> structures = new ArrayList<String>();
        String path = System.getProperty("user.dir");
		try {
			FileReader file = new FileReader(path+"//trace");
			Scanner in = new Scanner(file);
			while (in.hasNextLine()) {
			    String line = in.nextLine();
			    line = line.replaceAll("-,", "");
			    String[] lines = line.split(",");
			    for (int i = 0; i < lines.length; i++) {
			    	String comp = lines[i].split("_")[0];
			    	structures.add(comp.trim());
				}			    
			    
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		structures.add("s1:TemperatureSensorCP");
//		structures.add("s2:TemperatureSensorCP");
//		structures.add("s3:PresenceSensorCP");
//		structures.add("ui:UserInterfaceCP");
//		structures.add("c1 : FahrenheitToCelsiusCN");
//		
		return structures;
	}

}
