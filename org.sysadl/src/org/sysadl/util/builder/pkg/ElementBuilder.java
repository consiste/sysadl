package org.sysadl.util.builder.pkg;

import org.sysadl.NamedElement;
import org.sysadl.SysADLFactory;

public abstract class ElementBuilder {
	protected SysADLFactory factory = SysADLFactory.eINSTANCE;
	public abstract NamedElement build();
}
