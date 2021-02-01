package org.sysadl.util.builder.pkg;

import org.sysadl.AbstractComponentDef;
import org.sysadl.AbstractConnectorDef;
import org.sysadl.Invariant;
import org.sysadl.NamedElement;
import org.sysadl.Style;

public class StylePipeFilterBuilder extends ElementBuilder {

	@Override
	public NamedElement build() {
		Style s = factory.createStyle();
		s.setName("PipesFilters");

		AbstractConnectorDef pipe = factory.createAbstractConnectorDef();
		pipe.setName("APipe");
		AbstractComponentDef filter = factory.createAbstractComponentDef();
		filter.setName("AFilter");
		
		s.getDefinitions().add(pipe);
		s.getDefinitions().add(filter);
		
		Invariant pipesBetweenFilters = factory.createInvariant();
		pipesBetweenFilters.setName("OnlyPipesConnectsFilters");
		pipesBetweenFilters.setExpr("self.connectors->forall(cn | cn.definition.abstractConnector.name<>'APipe' or (cn.definition.abstractConnector.name='APipe' and (checkPortUseAbstractComponent(cn.bindings->first().destination,'AFilter') and checkPortUseAbstractComponent(cn.bindings->first().source, 'AFilter'))))");
		//pipesBetweenFilters.setExpr("let filters = self.components->select(cp | cp.definition.abstractComponent.name='AFilter') in self.connectors->forall(cn | cn.)");

		s.getInvariants().add(pipesBetweenFilters);
		return s;
	}

}
