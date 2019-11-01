package org.sysadl.verification.transformation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.csp.translater.main.Generate;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.sysadl.ComponentDef;
import org.sysadl.Model;




public class PerformTransformation {

	public static void run(IFile file,Model model, Object architecture) {
		ComponentDef component = (ComponentDef) architecture;
	
		URI modelURI = URI.createFileURI(file.getLocation().toString());//modelo sysadl
        File folder = new File("C:\\Users\\Fagne\\OneDrive\\Documentos\\output");//folder de saída
        
        List<String> arguments = new ArrayList<String>();
        
		try {
			
			Generate generator = new Generate(modelURI, folder, arguments);
			
			//for (int i = 2; i < args.length; i++) {
            generator.addPropertiesFile(file.getName());
            //}
            generator.doGenerate(new BasicMonitor()); 
            
            
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

}
