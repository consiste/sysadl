/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.ComponentUse;
import org.sysadl.ConnectorUse;
import org.sysadl.Delegation;

/**
 * A sample validator interface for {@link org.sysadl.Configuration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConfigurationValidator {
	boolean validate();

	boolean validateComponents(EList<ComponentUse> value);
	boolean validateConnectors(EList<ConnectorUse> value);
	boolean validateDelegations(EList<Delegation> value);
}