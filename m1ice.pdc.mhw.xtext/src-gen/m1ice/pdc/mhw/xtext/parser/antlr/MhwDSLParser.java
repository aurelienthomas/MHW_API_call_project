/*
 * generated by Xtext 2.16.0
 */
package m1ice.pdc.mhw.xtext.parser.antlr;

import com.google.inject.Inject;
import m1ice.pdc.mhw.xtext.parser.antlr.internal.InternalMhwDSLParser;
import m1ice.pdc.mhw.xtext.services.MhwDSLGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MhwDSLParser extends AbstractAntlrParser {

	@Inject
	private MhwDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMhwDSLParser createParser(XtextTokenStream stream) {
		return new InternalMhwDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Request";
	}

	public MhwDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MhwDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}