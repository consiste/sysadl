package org.sysadl.verification.transformation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;

import org.csp.translater.main.Generate;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.sysadl.Model;
import org.sysadl.verification.csp.VerificationAnwserDialog;

import uk.ac.ox.cs.fdr.Assertion;
import uk.ac.ox.cs.fdr.FileLoadError;
import uk.ac.ox.cs.fdr.InputFileError;
import uk.ac.ox.cs.fdr.Session;
import uk.ac.ox.cs.fdr.fdr;


public class PerformTransformation {

	public static void run(IFile file,Model model, Object architecture) {	
		URI modelURI = URI.createFileURI(file.getLocation().toString());//sysadl model
		String path = file.getLocation().toString();
		path = path.replace(file.getLocation().lastSegment(), "");
        File folder = new File(path+ "output");
        HashMap<String, String> mapAnwser = new HashMap<String, String>();
        List<String> arguments = new ArrayList<String>();
        
		try {
			
			Generate generator = new Generate(modelURI, folder, arguments);
						
            generator.addPropertiesFile(file.getName());         
            generator.doGenerate(new BasicMonitor()); 
            Session session = new Session();
            try {            	
            	session.loadFile(folder.getAbsolutePath() + "\\sysadl2csp.csp");
            	for (Assertion assertion : session.assertions()) {
    	            assertion.execute(null);    	
    	            mapAnwser.put(assertion.toString(), (assertion.passed() ? "Passed" : "Failed"));
    	            System.out.println(assertion.toString()+" "+
    	                (assertion.passed() ? "Passed" : "Failed"));
    	        }
                
			} catch (InputFileError error) {
		        System.out.println(error);
		    }
		    catch (FileLoadError error) {
		        System.out.println(error);
		    }

		    fdr.libraryExit();
		    VerificationAnwserDialog dialog = new VerificationAnwserDialog(new JFrame(), "Results", mapAnwser);
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
	}

}
