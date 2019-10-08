package org.sysadl.util.builder;

import org.sysadl.util.builder.pkg.ElementBuilder;
import org.sysadl.util.builder.pkg.StyleClientServerBuilder;
import org.sysadl.util.builder.pkg.StyleIoTBuilder;
import org.sysadl.util.builder.pkg.PackageTypesBuilder;
/**
 * This enum lists all possible model builder options
 * It is used to build SysADL Model
 * Any changes in the enum automatically impacts in the builder
 * @author Eduardo
 *
 */
public enum ModelBuilderOption {
	TYPES ("Package Basic Types", new PackageTypesBuilder(), true),
	CLIENT_SERVER("Style Client-Server", new StyleClientServerBuilder()),
	IOT("Style IoT", new StyleIoTBuilder());
	
	private ElementBuilder builder;
	private String str;
	private Boolean mandatory;
	ModelBuilderOption(final String str, ElementBuilder p) {
		this.builder = p;
		this.str = str;
		this.mandatory = false;
	}
	ModelBuilderOption(final String str, ElementBuilder p, Boolean mandatory) {
		this.builder = p;
		this.str = str;
		this.mandatory = mandatory;
	}
	
	public ElementBuilder getBuilder() {
		return builder;
	}
	public String getStr() {
		return str;
	}

	public boolean isMandatory() {
		return this.mandatory;
	}
	
}
