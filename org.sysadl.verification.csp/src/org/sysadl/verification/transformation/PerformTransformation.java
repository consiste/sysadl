package org.sysadl.verification.transformation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.csp.translater.main.Generate;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.sysadl.Model;

import uk.ac.ox.cs.fdr.Assertion;
import uk.ac.ox.cs.fdr.Session;
import uk.ac.ox.cs.fdr.fdr;


public class PerformTransformation {

	public static void run(Model model, Object architecture) {	
		Resource r = model.eResource();
		URI modelURI = r.getURI();
		String path = modelURI.path();
		path = path.replace(modelURI.lastSegment(), "");
        File folder = new File(path+ "output");
        
        List<String> arguments = new ArrayList<String>();
        
		try {
			
			Generate generator = new Generate(modelURI, folder, arguments);
			
			//for (int i = 2; i < args.length; i++) {
            generator.addPropertiesFile(model.getName()); // was file
            //}
            generator.doGenerate(new BasicMonitor()); 
            
//            try {
            	Session session = new Session();
              session.loadFile(folder.getAbsolutePath() + "\\sysadl2csp.csp");
              //session.loadFile("C:\\Users\\Fagne\\OneDrive\\Documentos\\SysADL_CSP\\Samples\\RTC\\RTC_Asserts.csp");              
//                session.loadFile("C:\\Users\\Fagne\\OneDrive\\Documentos\\SysADL_CSP\\Samples\\AGV\\AGV.csp");
//            	session.loadFile("C:\\Users\\Fagne\\OneDrive\\Documentos\\SysADL_CSP\\Samples\\RTC\\RTC_Ex.csp");
                
                for (Assertion assertion : session.assertions()) {
                    assertion.execute(null);
                    System.out.println(assertion.toString()+" "+
                        (assertion.passed() ? "Passed" : "Failed"));
                }
//			} catch (InputFileError error) {
//		        System.out.println(error);
//		    }
//		    catch (FileLoadError error) {
//		        System.out.println(error);
//		    }

		    fdr.libraryExit();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

}
