package org.sysadl.verification.transformation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import org.csp.translater.main.Generate;
import org.csp.translater.query.AuxiliarsQuery;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.sysadl.ConstraintDef;
import org.sysadl.DataTypeDef;
import org.sysadl.ElementDef;
import org.sysadl.Enumeration;
import org.sysadl.Model;
import org.sysadl.Pin;
import org.sysadl.TypeDef;
import org.sysadl.ValueTypeDef;
import org.sysadl.grammar.util.SysADLGrammarUtil;
import org.sysadl.verification.csp.ParserAnswerCSP;
import org.sysadl.verification.csp.VerificationAnwserDialog;

import uk.ac.ox.cs.fdr.Assertion;
import uk.ac.ox.cs.fdr.Behaviour;
import uk.ac.ox.cs.fdr.Counterexample;
import uk.ac.ox.cs.fdr.DeadlockCounterexample;
import uk.ac.ox.cs.fdr.DebugContext;
import uk.ac.ox.cs.fdr.DeterminismCounterexample;
import uk.ac.ox.cs.fdr.DivergenceCounterexample;
import uk.ac.ox.cs.fdr.ExplicitDivergenceBehaviour;
import uk.ac.ox.cs.fdr.FileLoadError;
import uk.ac.ox.cs.fdr.InputFileError;
import uk.ac.ox.cs.fdr.IrrelevantBehaviour;
import uk.ac.ox.cs.fdr.LoopBehaviour;
import uk.ac.ox.cs.fdr.MinAcceptanceBehaviour;
import uk.ac.ox.cs.fdr.MinAcceptanceCounterexample;
import uk.ac.ox.cs.fdr.Node;
import uk.ac.ox.cs.fdr.PrintStatement;
import uk.ac.ox.cs.fdr.ProcessName;
import uk.ac.ox.cs.fdr.PropertyCounterexample;
import uk.ac.ox.cs.fdr.RefinementCounterexample;
import uk.ac.ox.cs.fdr.SegmentedBehaviour;
import uk.ac.ox.cs.fdr.Session;
import uk.ac.ox.cs.fdr.TraceBehaviour;
import uk.ac.ox.cs.fdr.TraceCounterexample;
import uk.ac.ox.cs.fdr.fdr;


public class PerformTransformation {

	public static void run(IFile file,Model model, Object architecture) {
		PrintStream out = System.out;
		URI modelURI = URI.createFileURI(file.getLocation().toString());//sysadl model
		String path = file.getLocation().toString();
		path = path.replace(file.getLocation().lastSegment(), "");
        File folder = new File(path+ "output");
        HashMap<String, String> mapAnwser = new HashMap<String, String>();
        HashMap<String, String> falseCase = new HashMap<String, String>();
        List<String> arguments = new ArrayList<String>();
        AuxiliarsQuery query = new AuxiliarsQuery();
        ParserAnswerCSP parser = new ParserAnswerCSP();
        JFrame progress = new JFrame();
        JPanel panel = new JPanel();
        JProgressBar checkpoint = new JProgressBar();
        if (query.CheckPortsAndPinsNames(model).startsWith("Sucess") && query.ExistEqualsNames(model).startsWith("Fail")) {		
			try {
				int progressValue = 0;
				checkpoint.setValue(progressValue);				
				checkpoint.setStringPainted(true);
				panel.add(checkpoint);
				progress.add(panel);
				progress.setSize(500, 100);
				progress.setLocationRelativeTo(null);
				progress.setVisible(true);
				checkpoint.setString("Making file CSP ...");
				Generate generator = new Generate(modelURI, folder, arguments);
							
	            generator.addPropertiesFile(file.getName());         
	            generator.doGenerate(new BasicMonitor()); 
	            Session session = new Session();
	            try {            	
	            	session.loadFile(folder.getAbsolutePath() + "\\sysadl2csp.csp");
	            	checkpoint.setValue(progressValue + 25);
	            	checkpoint.setString("Verifying the Statements ...");
	            	for (PrintStatement stm : session.printStatements()) {	            			            		
	            		
	            		String result = session.evaluateExpression(stm.expression(), null).result();	            			            		
	            		mapAnwser.put(stm.expression().toString(), result);
	            		
	            		if (result.equals("false")) {
							if (stm.expression().toString().contains("subset")) {
								String[] sets = stm.expression().replace("subset(", "").replace(")\r", "").split(",");
								String diffResult =  session.evaluateExpression("diff(" + sets[0]+ ","+sets[1]+")", null).result();
								falseCase.put(stm.expression().toString(), diffResult);
							}
							else {
								stm.expression().toString();
								String check = session.evaluateExpression(stm.expression().toString().replace("check", "case_false"), null).result();								
								ConstraintDef constraintEQ = getEquation(model,stm.expression().toString().replace("_check", " "));
								String equation = SysADLGrammarUtil.getInstance().nodeText(constraintEQ.getEquation());
								String types = getTypes(constraintEQ);								
								falseCase.put(stm.expression().toString(), check+";"+equation+";"+types);
							}
						}
	            		
					
					}
	            	checkpoint.setValue(progressValue + 50);
	            	checkpoint.setString("Verifying the assertions ...");
	            	for (Assertion assertion : session.assertions()) {
	    	            assertion.execute(null);    	
	    	            mapAnwser.put(assertion.toString(), (assertion.passed() ? "Passed" : "Failed"));
	    	            
	    	            System.out.println(assertion.toString()+" "+
	    	                (assertion.passed() ? "Passed" : "Failed"));
	    	            
	    	         // Pretty print the counterexamples
	    	            for (Counterexample counterexample : assertion.counterexamples()) {
	    	                describeCounterexample(out, session, counterexample);
	    	                
	    	                parser.getTrace(out.toString(), assertion.toString());
	    	            }
	    	        }
	            	
	                
				} catch (InputFileError error) {
			        System.out.println(error);
			    }
			    catch (FileLoadError error) {
			        System.out.println(error);
			    }
	
			    fdr.libraryExit();	
			    checkpoint.setValue(progressValue + 90);
			    checkpoint.setString("Show the results ...");
			    checkpoint.setValue(progressValue + 100);
			    progress.setVisible(false);
			    VerificationAnwserDialog dialog = new VerificationAnwserDialog(new JFrame(), "Results", mapAnwser, falseCase, false);
			
	            
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
        }
        else {
        	if (query.CheckPortsAndPinsNames(model).startsWith("Fail")) {
        		String[] aux = query.CheckPortsAndPinsNames(model).split("-");
        		mapAnwser.put(aux[0], aux[1]);
        		VerificationAnwserDialog dialog = new VerificationAnwserDialog(new JFrame(), "Error", mapAnwser,falseCase, true);
			}
        	else if (query.ExistEqualsNames(model).startsWith("Sucess")) {
        		String[] aux = query.ExistEqualsNames(model).split("-");
        		mapAnwser.put(aux[0], aux[1]);
        		VerificationAnwserDialog dialog = new VerificationAnwserDialog(new JFrame(), "Error", mapAnwser,falseCase, true);
			}
        	
        }
		// TODO Auto-generated method stub
	}
	
	private static String getTypes(ConstraintDef constraintEQ) {
		String result = "";
		TypeDef type = null;
		int cont =0;
		EList<Pin> Inparans = constraintEQ.getInParameters();
		EList<Pin> Outparans = constraintEQ.getOutParameters();
		result += "In: ";
		for (Pin pin : Inparans) {
			type = pin.getDefinition();
			result += pin.getName() + "= ";
			
			if (type instanceof ValueTypeDef) {
				while (! (((ValueTypeDef)type).getSuperType() == null) && cont < 100) {
					type = ((ValueTypeDef)type).getSuperType();			
				}
			}
			else if (type instanceof Enumeration) {
				return ((Enumeration)type).getLiterals().get(((Enumeration)type).getLiterals().size()-1).getName();
				
			}
			else if (type instanceof DataTypeDef) {
				return ((DataTypeDef)type).getName();
				
			}
			if ( type.getName().equals("Boolean") || type.getName().equals("void")) 
				result += type.getName();		
			else
				result += getTypesCSP(type.getName());
			result += "; ";
		}
		
		result += "Out: ";
		for (Pin pin : Outparans) {
			type = pin.getDefinition();
			result += pin.getName() + "= ";
			
			if (type instanceof ValueTypeDef) {
				while (! (((ValueTypeDef)type).getSuperType() == null) && cont < 100) {
					type = ((ValueTypeDef)type).getSuperType();			
				}
			}
			else if (type instanceof Enumeration) {
				return ((Enumeration)type).getLiterals().get(((Enumeration)type).getLiterals().size()-1).getName();
				
			}			
			result += getTypesCSP(type.getName());
			result += "; ";
		}
				
		return result;
	}
	
	
	private static String getTypesCSP(String type) {
		String result = "";
		switch (type) {
		case "Int":
			result = "{0 .. 5}";
			break;
		case "Real":
			result =  "{32 .. 41}";
			break;
		default:
			break;
		}
		return result;
	}

	private static ConstraintDef getEquation(Model model, String constraint) {
		ConstraintDef result = null;
		for (org.sysadl.Package pck : model.getPackages()) {
			for (ElementDef elem : pck.getDefinitions()) {
				if (elem instanceof ConstraintDef) {
					if (((ConstraintDef)elem).getName().equals(constraint.trim())) {
						result = ((ConstraintDef)elem); 
					}
					
							
				}
			}
		}
		
		return result;
	}
	
	
	
	private static void describeCounterexample(PrintStream out, Session session,
		    Counterexample counterexample)
		{
		    // Firstly, just print a simple description of the counterexample
		    //
		    // This uses dynamic casting to check the assertion type.
		    out.print("Counterexample type: ");
		    if (counterexample instanceof DeadlockCounterexample)
		        out.println("deadlock");
		    else if (counterexample instanceof DeterminismCounterexample)
		        out.println("determinism");
		    else if (counterexample instanceof DivergenceCounterexample)
		        out.println("divergence");
		    else if (counterexample instanceof MinAcceptanceCounterexample)
		    {
		        MinAcceptanceCounterexample minAcceptance =
		            (MinAcceptanceCounterexample) counterexample;
		        out.print("minimal acceptance refusing {");
		        for (Long event : minAcceptance.minAcceptance())
		            out.print(session.uncompileEvent(event).toString() + ", ");
		        out.println("}");
		    }
		    else if (counterexample instanceof TraceCounterexample)
		    {
		        TraceCounterexample trace = (TraceCounterexample) counterexample;
		        out.println("trace with event "+ session.uncompileEvent(
		            trace.errorEvent()).toString());
		    }
		    else
		        out.println("unknown");

		    out.println("Children:");

		    // In order to print the children we use a DebugContext. This allows for
		    // division of behaviours into their component behaviours, and also ensures
		    // proper alignment amongst the child components.
		    DebugContext debugContext = null;

		    if (counterexample instanceof RefinementCounterexample)
		        debugContext = new DebugContext((RefinementCounterexample) counterexample, false);
		    else if (counterexample instanceof PropertyCounterexample)
		        debugContext = new DebugContext((PropertyCounterexample) counterexample, false);

		    debugContext.initialise(null);
		    for (Behaviour root : debugContext.rootBehaviours())
		        describeBehaviour(out, session, debugContext, root, 2, true);
		}

	/**
	 * Prints a vaguely human readable description of the given behaviour to out.
	 */
	private static void describeBehaviour(PrintStream out, Session session,
	    DebugContext debugContext, Behaviour behaviour, int indent,
	    boolean recurse)
	{
	    // Describe the behaviour type
	    printIndent(out, indent); out.print("behaviour type: ");
	    indent += 2;
	    if (behaviour instanceof ExplicitDivergenceBehaviour)
	        out.println("explicit divergence after trace");
	    else if (behaviour instanceof IrrelevantBehaviour)
	        out.println("irrelevant");
	    else if (behaviour instanceof LoopBehaviour)
	    {
	        LoopBehaviour loop = (LoopBehaviour) behaviour;
	        out.println("loops after index " + loop.loopIndex());
	    }
	    else if (behaviour instanceof MinAcceptanceBehaviour)
	    {
	        MinAcceptanceBehaviour minAcceptance = (MinAcceptanceBehaviour) behaviour;
	        out.print("minimal acceptance refusing {");
	        for (Long event : minAcceptance.minAcceptance())
	            out.print(session.uncompileEvent(event).toString() + ", ");
	        out.println("}");
	    }
	    else if (behaviour instanceof SegmentedBehaviour)
	    {
	        SegmentedBehaviour segmented = (SegmentedBehaviour) behaviour;
	        out.println("Segmented behaviour consisting of:");
	        // Describe the sections of this behaviour. Note that it is very
	        // important that false is passed to the the descibe methods below
	        // because segments themselves cannot be divded via the DebugContext.
	        // That is, asking for behaviourChildren for a behaviour of a
	        // SegmentedBehaviour is not allowed.
	        for (TraceBehaviour child : segmented.priorSections())
	            describeBehaviour(out, session, debugContext, child, indent + 2, false);
	        describeBehaviour(out, session, debugContext, segmented.last(),
	            indent + 2, false);
	    }
	    else if (behaviour instanceof TraceBehaviour)
	    {
	        TraceBehaviour trace = (TraceBehaviour) behaviour;
	        out.println("performs event " +
	            session.uncompileEvent(trace.errorEvent()).toString());
	    }

	    // Describe the trace of the behaviour
	    printIndent(out, indent); out.print("Trace: ");
	    String trace = "";
	    for (Long event : behaviour.trace())
	    {
	        // INVALIDEVENT indiciates that this machine did not perform an event at
	        // the specified index (i.e. it was not synchronised with the machines
	        // that actually did perform the event).
	        if (event == fdr.INVALIDEVENT) {
	            out.print("-, ");
	            trace += "-, ";
	        }
	        else {
	            out.print(session.uncompileEvent(event).toString() + ", ");
	            trace += session.uncompileEvent(event).toString() + ", ";
	        }
	            
	    }
	    out.println();
	     

	    // Describe any named states of the behaviour
	    printIndent(out, indent); out.print("States: ");
	    String path = System.getProperty("user.dir");
	    try {
    		FileWriter file = new FileWriter(path+"//trace");		
			file.append(trace);
			file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    for (Node node : behaviour.nodePath())
	    {
	        if (node == null)
	            out.print("-, ");
	        else
	        {
	            ProcessName processName = session.machineNodeName(behaviour.machine(), node);
	            if (processName == null)
	                out.print("(unknown), ");
	            else
	                out.print(processName.toString()+", ");
	        }
	    }
	    out.println();

	    // Describe our own children recursively
	    if (recurse) {
	        for (Behaviour child : debugContext.behaviourChildren(behaviour))
	            describeBehaviour(out, session, debugContext, child, indent + 2, true);
	    }
	}

	/**
	 * Prints a number of spaces to out.
	 */
	private static void printIndent(PrintStream out, int indent) {
	    for (int i = 0; i < indent; ++i)
	        out.print(' ');
	}
		
}
