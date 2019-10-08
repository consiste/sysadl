package org.sysadl.util.builder;

import java.util.Set;

import org.sysadl.Model;
import org.sysadl.NamedElement;
import org.sysadl.Package;
import org.sysadl.Style;
import org.sysadl.SysADLFactory;

public class ModelBuilder {
	private Set<ModelBuilderOption> options;
	
	public void setOption(Set<ModelBuilderOption> builderOptions) {
		this.options = builderOptions;
	}
	
	public Model build() {
		Model m = SysADLFactory.eINSTANCE.createModel();
		m.setName("SysADLModel");
		
		for (ModelBuilderOption opt : options) {
			NamedElement ele = opt.getBuilder().build();
			if (ele instanceof org.sysadl.Package) m.getPackages().add((Package) ele); 
			else m.getStyles().add((Style) ele);	
		}
		return m;
	}
}
