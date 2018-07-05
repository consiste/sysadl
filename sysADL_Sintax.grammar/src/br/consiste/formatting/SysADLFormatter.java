/*
 * generated by Xtext 2.10.0
 */
package br.consiste.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains custom formatting declarations.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#formatting
 * on how and when to use it.
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class SysADLFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		br.consiste.services.SysADLGrammarAccess f = (br.consiste.services.SysADLGrammarAccess) getGrammarAccess();
		for(Pair<Keyword, Keyword> pair: f.findKeywordPairs("{", "}")) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap(1).after(pair.getFirst());
			c.setLinewrap(1).before(pair.getSecond());
			c.setLinewrap(1).after(pair.getSecond());
		}
		for(Keyword comma: f.findKeywords(",")) {
			c.setNoLinewrap().before(comma);
			c.setNoSpace().before(comma);
			//c.setLinewrap().after(comma);
		}
		for(Keyword semicolon: f.findKeywords(";")) {
			c.setNoLinewrap().before(semicolon);
			c.setNoSpace().before(semicolon);
			c.setLinewrap().after(semicolon);
		}
		for(Pair<Keyword,Keyword> pairs: f.findKeywordPairs("components", ":")) {
			c.setLinewrap().before(pairs.getFirst());
			c.setNoSpace().after(pairs.getFirst());
			c.setLinewrap().after(pairs.getSecond());
		}
		for(Pair<Keyword,Keyword> pairs: f.findKeywordPairs("connectors", ":")) {
			c.setNoSpace().after(pairs.getFirst());
			c.setLinewrap().after(pairs.getSecond());
		}
		for(Pair<Keyword,Keyword> pairs: f.findKeywordPairs("delegations", ":")) {
			c.setNoSpace().after(pairs.getFirst());
			c.setLinewrap().after(pairs.getSecond());
		}
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}
