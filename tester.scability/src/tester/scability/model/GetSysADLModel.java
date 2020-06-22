package tester.scability.model;

import java.awt.FileDialog;
import java.io.File;



import javax.swing.*;

public class GetSysADLModel {

	String filePath = null; // put here the path to the file u wanna load
	private File file;
	
	public void getModel() {		
		// just to be nice, select the file with a file dialog
		FileDialog dialogTeste = new FileDialog(new JFrame());
		dialogTeste.setTitle("Select external archive");
		dialogTeste.setVisible(true);
		for (File f : dialogTeste.getFiles()) {
			this.filePath = f.getAbsolutePath();
			this.file = new File(f.getAbsolutePath());
		}					
	}			
	

}
