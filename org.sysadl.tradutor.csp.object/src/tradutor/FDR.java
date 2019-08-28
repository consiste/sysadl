package tradutor;

import uk.ac.ox.cs.fdr.*;

public class FDR {
	
	
	
	public void run() {
		try {
			Session session = new Session();
			session.loadFile("sysadl2csp.csp");
		}catch (InputFileError error) {
	        System.out.println(error);
	    }catch(FileLoadError error) {
			 System.out.println(error);
		}
		fdr.libraryExit();
	}
}
