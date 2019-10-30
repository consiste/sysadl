package org.sysadl.util.builder.pkg;

public class PackageTypesBuilder extends ElementBuilder {

	@Override
	public org.sysadl.Package build() {
		// Initial Package
		org.sysadl.Package p = factory.createPackage();
		p.setName("SysADL.types");
		
		// Basic types
		org.sysadl.ValueTypeDef typeInt = factory.createValueTypeDef();
		typeInt.setName("Int");
		p.getDefinitions().add(typeInt);
		org.sysadl.ValueTypeDef typeBool = factory.createValueTypeDef();
		typeBool.setName("Boolean");
		p.getDefinitions().add(typeBool);
		org.sysadl.ValueTypeDef typeString = factory.createValueTypeDef();
		typeString.setName("String");
		p.getDefinitions().add(typeString);
		org.sysadl.ValueTypeDef typeVoid = factory.createValueTypeDef();
		typeVoid.setName("Void");
		p.getDefinitions().add(typeVoid);
		org.sysadl.ValueTypeDef typeReal = factory.createValueTypeDef();
		typeReal.setName("Real");
		p.getDefinitions().add(typeReal);
		
		return p;
	}

}
