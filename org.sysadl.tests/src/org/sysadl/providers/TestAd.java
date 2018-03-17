package org.sysadl.providers;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import sysADL_Sintax.ActivityDef;
import sysADL_Sintax.Model;
import sysADL_Sintax.Pin;
import sysADL_Sintax.SysADLFactory;
import sysADL_Sintax.TypeDef;
import sysADL_Sintax.impl.SysADLFactoryImpl;
import sysADL_Sintax.util.SysADLCreationTools;
import sysADL_Sintax.Package;

public class TestAd {
	public static ActivityDef testActivity() {
		Model model = SysADLCreationTools.getInitialModelObject();
		SysADLFactory fac = SysADLFactoryImpl.eINSTANCE; 
		ActivityDef ad = fac.createActivityDef();
		
		ad.setName("NewActivity");
		
		EList<EObject> pinsIn = new BasicEList<EObject>();
		
		Package sysadlTypes = (Package) model.getPackages().get(0);
		
		for (Object t : sysadlTypes.getArchitectures()) {
			if (t instanceof TypeDef) {
				TypeDef type = (TypeDef) t;
				
				Pin np = fac.createPin();
				np.setName("in"+type.getName()+"1");
				np.setDefinition(type);
				
				Pin np2 = fac.createPin();
				np2.setName("in"+type.getName()+"2");
				np2.setDefinition(type);
				
				pinsIn.add(np);
				pinsIn.add(np2);
			}
		}
		ad.getInParameters().addAll(pinsIn);
		
		return ad;
	}
}
