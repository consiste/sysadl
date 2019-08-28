package main;

import com.google.inject.Injector;

import tradutor.FDR;
import tradutor.SysADL2CSP;

import java.awt.FileDialog;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.sysadl.Model;
import org.sysadl.SysADLPackage;
import org.sysadl.SysADLStandaloneSetup;

public class Main {

	public static void main(String[] args) {
		String filePath = null; // put here the path to the file u wanna load

		// just to be nice, select the file with a file dialog

		FileDialog dialog = new FileDialog(new JFrame());
		dialog.setTitle("Select external archive");
		dialog.setVisible(true);
		for (File f : dialog.getFiles()) {
			filePath = f.getAbsolutePath();
		}
		
		System.out.println(filePath);

		// from here on I load the model using the xtext standalonesetup (we should do
		// the same in acceleo)
		SysADLStandaloneSetup s = new SysADLStandaloneSetup();
		SysADLPackage.eINSTANCE.eClass();
		Injector i = s.createInjectorAndDoEMFRegistration();
		ResourceSet rs = i.getInstance(XtextResourceSet.class);
		Resource r = rs.getResource(URI.createFileURI(filePath), true);
		try {
			r.load(null);
			Model m = (Model) r.getContents().get(0);
			System.out.println(m.getName());
			SysADL2CSP tradutor = new SysADL2CSP(m); 
			tradutor.traduzir();
			FDR fdrRun = new FDR();
			fdrRun.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
