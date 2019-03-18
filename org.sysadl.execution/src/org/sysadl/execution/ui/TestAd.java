package org.sysadl.execution.ui;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.sysadl.ActivityDef;
import org.sysadl.Model;
import org.sysadl.Pin;
import org.sysadl.SysADLFactory;
import org.sysadl.TypeDef;
import org.sysadl.impl.SysADLFactoryImpl;
import org.sysadl.util.SysADLCreationTools;
import org.sysadl.Package;

//Nao consegui usar por dentro da package tests. muitos problemas de dependencia e classe faltando, por isso upei aqui.
public class TestAd {
	public static ActivityDef testActivity() {
		Model model = SysADLCreationTools.getInitialModelObject();
		SysADLFactory fac = SysADLFactoryImpl.eINSTANCE; 
		ActivityDef ad = fac.createActivityDef();
		
		ad.setName("NewActivity");
		
		EList<Pin> pinsIn = new BasicEList<Pin>();
		
		Package sysadlTypes = (Package) model.getPackages().get(0);
		
		for (Object t : sysadlTypes.getDefinitions()) {
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