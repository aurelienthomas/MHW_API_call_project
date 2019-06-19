package m1ice.pdc.mhw.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import m1ice.pdc.mhw.xtext.services.MhwDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMhwDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Request'", "'Decoration'", "'Charm'", "'Armor'", "'Weapon'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMhwDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMhwDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMhwDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMhwDSL.g"; }


    	private MhwDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(MhwDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRequest"
    // InternalMhwDSL.g:53:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMhwDSL.g:54:1: ( ruleRequest EOF )
            // InternalMhwDSL.g:55:1: ruleRequest EOF
            {
             before(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRequestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMhwDSL.g:62:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:66:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMhwDSL.g:67:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMhwDSL.g:67:2: ( ( rule__Request__Group__0 ) )
            // InternalMhwDSL.g:68:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMhwDSL.g:69:3: ( rule__Request__Group__0 )
            // InternalMhwDSL.g:69:4: rule__Request__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleEString"
    // InternalMhwDSL.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMhwDSL.g:79:1: ( ruleEString EOF )
            // InternalMhwDSL.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMhwDSL.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMhwDSL.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMhwDSL.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMhwDSL.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMhwDSL.g:94:3: ( rule__EString__Alternatives )
            // InternalMhwDSL.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDecoration"
    // InternalMhwDSL.g:103:1: entryRuleDecoration : ruleDecoration EOF ;
    public final void entryRuleDecoration() throws RecognitionException {
        try {
            // InternalMhwDSL.g:104:1: ( ruleDecoration EOF )
            // InternalMhwDSL.g:105:1: ruleDecoration EOF
            {
             before(grammarAccess.getDecorationRule()); 
            pushFollow(FOLLOW_1);
            ruleDecoration();

            state._fsp--;

             after(grammarAccess.getDecorationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecoration"


    // $ANTLR start "ruleDecoration"
    // InternalMhwDSL.g:112:1: ruleDecoration : ( ( rule__Decoration__Group__0 ) ) ;
    public final void ruleDecoration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:116:2: ( ( ( rule__Decoration__Group__0 ) ) )
            // InternalMhwDSL.g:117:2: ( ( rule__Decoration__Group__0 ) )
            {
            // InternalMhwDSL.g:117:2: ( ( rule__Decoration__Group__0 ) )
            // InternalMhwDSL.g:118:3: ( rule__Decoration__Group__0 )
            {
             before(grammarAccess.getDecorationAccess().getGroup()); 
            // InternalMhwDSL.g:119:3: ( rule__Decoration__Group__0 )
            // InternalMhwDSL.g:119:4: rule__Decoration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Decoration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDecorationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecoration"


    // $ANTLR start "entryRuleCharm"
    // InternalMhwDSL.g:128:1: entryRuleCharm : ruleCharm EOF ;
    public final void entryRuleCharm() throws RecognitionException {
        try {
            // InternalMhwDSL.g:129:1: ( ruleCharm EOF )
            // InternalMhwDSL.g:130:1: ruleCharm EOF
            {
             before(grammarAccess.getCharmRule()); 
            pushFollow(FOLLOW_1);
            ruleCharm();

            state._fsp--;

             after(grammarAccess.getCharmRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharm"


    // $ANTLR start "ruleCharm"
    // InternalMhwDSL.g:137:1: ruleCharm : ( ( rule__Charm__Group__0 ) ) ;
    public final void ruleCharm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:141:2: ( ( ( rule__Charm__Group__0 ) ) )
            // InternalMhwDSL.g:142:2: ( ( rule__Charm__Group__0 ) )
            {
            // InternalMhwDSL.g:142:2: ( ( rule__Charm__Group__0 ) )
            // InternalMhwDSL.g:143:3: ( rule__Charm__Group__0 )
            {
             before(grammarAccess.getCharmAccess().getGroup()); 
            // InternalMhwDSL.g:144:3: ( rule__Charm__Group__0 )
            // InternalMhwDSL.g:144:4: rule__Charm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Charm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharmAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharm"


    // $ANTLR start "entryRuleArmor"
    // InternalMhwDSL.g:153:1: entryRuleArmor : ruleArmor EOF ;
    public final void entryRuleArmor() throws RecognitionException {
        try {
            // InternalMhwDSL.g:154:1: ( ruleArmor EOF )
            // InternalMhwDSL.g:155:1: ruleArmor EOF
            {
             before(grammarAccess.getArmorRule()); 
            pushFollow(FOLLOW_1);
            ruleArmor();

            state._fsp--;

             after(grammarAccess.getArmorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArmor"


    // $ANTLR start "ruleArmor"
    // InternalMhwDSL.g:162:1: ruleArmor : ( ( rule__Armor__Group__0 ) ) ;
    public final void ruleArmor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:166:2: ( ( ( rule__Armor__Group__0 ) ) )
            // InternalMhwDSL.g:167:2: ( ( rule__Armor__Group__0 ) )
            {
            // InternalMhwDSL.g:167:2: ( ( rule__Armor__Group__0 ) )
            // InternalMhwDSL.g:168:3: ( rule__Armor__Group__0 )
            {
             before(grammarAccess.getArmorAccess().getGroup()); 
            // InternalMhwDSL.g:169:3: ( rule__Armor__Group__0 )
            // InternalMhwDSL.g:169:4: rule__Armor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Armor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArmorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArmor"


    // $ANTLR start "entryRuleWeapon"
    // InternalMhwDSL.g:178:1: entryRuleWeapon : ruleWeapon EOF ;
    public final void entryRuleWeapon() throws RecognitionException {
        try {
            // InternalMhwDSL.g:179:1: ( ruleWeapon EOF )
            // InternalMhwDSL.g:180:1: ruleWeapon EOF
            {
             before(grammarAccess.getWeaponRule()); 
            pushFollow(FOLLOW_1);
            ruleWeapon();

            state._fsp--;

             after(grammarAccess.getWeaponRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWeapon"


    // $ANTLR start "ruleWeapon"
    // InternalMhwDSL.g:187:1: ruleWeapon : ( ( rule__Weapon__Group__0 ) ) ;
    public final void ruleWeapon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:191:2: ( ( ( rule__Weapon__Group__0 ) ) )
            // InternalMhwDSL.g:192:2: ( ( rule__Weapon__Group__0 ) )
            {
            // InternalMhwDSL.g:192:2: ( ( rule__Weapon__Group__0 ) )
            // InternalMhwDSL.g:193:3: ( rule__Weapon__Group__0 )
            {
             before(grammarAccess.getWeaponAccess().getGroup()); 
            // InternalMhwDSL.g:194:3: ( rule__Weapon__Group__0 )
            // InternalMhwDSL.g:194:4: rule__Weapon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Weapon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWeaponAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWeapon"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMhwDSL.g:202:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:206:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMhwDSL.g:207:2: ( RULE_STRING )
                    {
                    // InternalMhwDSL.g:207:2: ( RULE_STRING )
                    // InternalMhwDSL.g:208:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMhwDSL.g:213:2: ( RULE_ID )
                    {
                    // InternalMhwDSL.g:213:2: ( RULE_ID )
                    // InternalMhwDSL.g:214:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Request__Group__0"
    // InternalMhwDSL.g:223:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:227:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMhwDSL.g:228:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Request__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0"


    // $ANTLR start "rule__Request__Group__0__Impl"
    // InternalMhwDSL.g:235:1: rule__Request__Group__0__Impl : ( () ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:239:1: ( ( () ) )
            // InternalMhwDSL.g:240:1: ( () )
            {
            // InternalMhwDSL.g:240:1: ( () )
            // InternalMhwDSL.g:241:2: ()
            {
             before(grammarAccess.getRequestAccess().getRequestAction_0()); 
            // InternalMhwDSL.g:242:2: ()
            // InternalMhwDSL.g:242:3: 
            {
            }

             after(grammarAccess.getRequestAccess().getRequestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0__Impl"


    // $ANTLR start "rule__Request__Group__1"
    // InternalMhwDSL.g:250:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:254:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMhwDSL.g:255:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Request__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1"


    // $ANTLR start "rule__Request__Group__1__Impl"
    // InternalMhwDSL.g:262:1: rule__Request__Group__1__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:266:1: ( ( 'Request' ) )
            // InternalMhwDSL.g:267:1: ( 'Request' )
            {
            // InternalMhwDSL.g:267:1: ( 'Request' )
            // InternalMhwDSL.g:268:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRequestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1__Impl"


    // $ANTLR start "rule__Request__Group__2"
    // InternalMhwDSL.g:277:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:281:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMhwDSL.g:282:2: rule__Request__Group__2__Impl rule__Request__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Request__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2"


    // $ANTLR start "rule__Request__Group__2__Impl"
    // InternalMhwDSL.g:289:1: rule__Request__Group__2__Impl : ( ( rule__Request__NameAssignment_2 ) ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:293:1: ( ( ( rule__Request__NameAssignment_2 ) ) )
            // InternalMhwDSL.g:294:1: ( ( rule__Request__NameAssignment_2 ) )
            {
            // InternalMhwDSL.g:294:1: ( ( rule__Request__NameAssignment_2 ) )
            // InternalMhwDSL.g:295:2: ( rule__Request__NameAssignment_2 )
            {
             before(grammarAccess.getRequestAccess().getNameAssignment_2()); 
            // InternalMhwDSL.g:296:2: ( rule__Request__NameAssignment_2 )
            // InternalMhwDSL.g:296:3: rule__Request__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Request__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2__Impl"


    // $ANTLR start "rule__Request__Group__3"
    // InternalMhwDSL.g:304:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:308:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMhwDSL.g:309:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Request__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3"


    // $ANTLR start "rule__Request__Group__3__Impl"
    // InternalMhwDSL.g:316:1: rule__Request__Group__3__Impl : ( ( rule__Request__ArmorAssignment_3 )? ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:320:1: ( ( ( rule__Request__ArmorAssignment_3 )? ) )
            // InternalMhwDSL.g:321:1: ( ( rule__Request__ArmorAssignment_3 )? )
            {
            // InternalMhwDSL.g:321:1: ( ( rule__Request__ArmorAssignment_3 )? )
            // InternalMhwDSL.g:322:2: ( rule__Request__ArmorAssignment_3 )?
            {
             before(grammarAccess.getRequestAccess().getArmorAssignment_3()); 
            // InternalMhwDSL.g:323:2: ( rule__Request__ArmorAssignment_3 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMhwDSL.g:323:3: rule__Request__ArmorAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__ArmorAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getArmorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3__Impl"


    // $ANTLR start "rule__Request__Group__4"
    // InternalMhwDSL.g:331:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:335:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMhwDSL.g:336:2: rule__Request__Group__4__Impl rule__Request__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Request__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4"


    // $ANTLR start "rule__Request__Group__4__Impl"
    // InternalMhwDSL.g:343:1: rule__Request__Group__4__Impl : ( ( rule__Request__WeaponAssignment_4 )? ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:347:1: ( ( ( rule__Request__WeaponAssignment_4 )? ) )
            // InternalMhwDSL.g:348:1: ( ( rule__Request__WeaponAssignment_4 )? )
            {
            // InternalMhwDSL.g:348:1: ( ( rule__Request__WeaponAssignment_4 )? )
            // InternalMhwDSL.g:349:2: ( rule__Request__WeaponAssignment_4 )?
            {
             before(grammarAccess.getRequestAccess().getWeaponAssignment_4()); 
            // InternalMhwDSL.g:350:2: ( rule__Request__WeaponAssignment_4 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMhwDSL.g:350:3: rule__Request__WeaponAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__WeaponAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getWeaponAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4__Impl"


    // $ANTLR start "rule__Request__Group__5"
    // InternalMhwDSL.g:358:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:362:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMhwDSL.g:363:2: rule__Request__Group__5__Impl rule__Request__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Request__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__5"


    // $ANTLR start "rule__Request__Group__5__Impl"
    // InternalMhwDSL.g:370:1: rule__Request__Group__5__Impl : ( ( rule__Request__CharmAssignment_5 )? ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:374:1: ( ( ( rule__Request__CharmAssignment_5 )? ) )
            // InternalMhwDSL.g:375:1: ( ( rule__Request__CharmAssignment_5 )? )
            {
            // InternalMhwDSL.g:375:1: ( ( rule__Request__CharmAssignment_5 )? )
            // InternalMhwDSL.g:376:2: ( rule__Request__CharmAssignment_5 )?
            {
             before(grammarAccess.getRequestAccess().getCharmAssignment_5()); 
            // InternalMhwDSL.g:377:2: ( rule__Request__CharmAssignment_5 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMhwDSL.g:377:3: rule__Request__CharmAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__CharmAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getCharmAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__5__Impl"


    // $ANTLR start "rule__Request__Group__6"
    // InternalMhwDSL.g:385:1: rule__Request__Group__6 : rule__Request__Group__6__Impl ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:389:1: ( rule__Request__Group__6__Impl )
            // InternalMhwDSL.g:390:2: rule__Request__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__6"


    // $ANTLR start "rule__Request__Group__6__Impl"
    // InternalMhwDSL.g:396:1: rule__Request__Group__6__Impl : ( ( rule__Request__DecorationAssignment_6 )? ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:400:1: ( ( ( rule__Request__DecorationAssignment_6 )? ) )
            // InternalMhwDSL.g:401:1: ( ( rule__Request__DecorationAssignment_6 )? )
            {
            // InternalMhwDSL.g:401:1: ( ( rule__Request__DecorationAssignment_6 )? )
            // InternalMhwDSL.g:402:2: ( rule__Request__DecorationAssignment_6 )?
            {
             before(grammarAccess.getRequestAccess().getDecorationAssignment_6()); 
            // InternalMhwDSL.g:403:2: ( rule__Request__DecorationAssignment_6 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMhwDSL.g:403:3: rule__Request__DecorationAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__DecorationAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getDecorationAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__6__Impl"


    // $ANTLR start "rule__Decoration__Group__0"
    // InternalMhwDSL.g:412:1: rule__Decoration__Group__0 : rule__Decoration__Group__0__Impl rule__Decoration__Group__1 ;
    public final void rule__Decoration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:416:1: ( rule__Decoration__Group__0__Impl rule__Decoration__Group__1 )
            // InternalMhwDSL.g:417:2: rule__Decoration__Group__0__Impl rule__Decoration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Decoration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decoration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__0"


    // $ANTLR start "rule__Decoration__Group__0__Impl"
    // InternalMhwDSL.g:424:1: rule__Decoration__Group__0__Impl : ( () ) ;
    public final void rule__Decoration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:428:1: ( ( () ) )
            // InternalMhwDSL.g:429:1: ( () )
            {
            // InternalMhwDSL.g:429:1: ( () )
            // InternalMhwDSL.g:430:2: ()
            {
             before(grammarAccess.getDecorationAccess().getDecorationAction_0()); 
            // InternalMhwDSL.g:431:2: ()
            // InternalMhwDSL.g:431:3: 
            {
            }

             after(grammarAccess.getDecorationAccess().getDecorationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__0__Impl"


    // $ANTLR start "rule__Decoration__Group__1"
    // InternalMhwDSL.g:439:1: rule__Decoration__Group__1 : rule__Decoration__Group__1__Impl rule__Decoration__Group__2 ;
    public final void rule__Decoration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:443:1: ( rule__Decoration__Group__1__Impl rule__Decoration__Group__2 )
            // InternalMhwDSL.g:444:2: rule__Decoration__Group__1__Impl rule__Decoration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Decoration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Decoration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__1"


    // $ANTLR start "rule__Decoration__Group__1__Impl"
    // InternalMhwDSL.g:451:1: rule__Decoration__Group__1__Impl : ( 'Decoration' ) ;
    public final void rule__Decoration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:455:1: ( ( 'Decoration' ) )
            // InternalMhwDSL.g:456:1: ( 'Decoration' )
            {
            // InternalMhwDSL.g:456:1: ( 'Decoration' )
            // InternalMhwDSL.g:457:2: 'Decoration'
            {
             before(grammarAccess.getDecorationAccess().getDecorationKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDecorationAccess().getDecorationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__1__Impl"


    // $ANTLR start "rule__Decoration__Group__2"
    // InternalMhwDSL.g:466:1: rule__Decoration__Group__2 : rule__Decoration__Group__2__Impl ;
    public final void rule__Decoration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:470:1: ( rule__Decoration__Group__2__Impl )
            // InternalMhwDSL.g:471:2: rule__Decoration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Decoration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__2"


    // $ANTLR start "rule__Decoration__Group__2__Impl"
    // InternalMhwDSL.g:477:1: rule__Decoration__Group__2__Impl : ( ( rule__Decoration__NameAssignment_2 ) ) ;
    public final void rule__Decoration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:481:1: ( ( ( rule__Decoration__NameAssignment_2 ) ) )
            // InternalMhwDSL.g:482:1: ( ( rule__Decoration__NameAssignment_2 ) )
            {
            // InternalMhwDSL.g:482:1: ( ( rule__Decoration__NameAssignment_2 ) )
            // InternalMhwDSL.g:483:2: ( rule__Decoration__NameAssignment_2 )
            {
             before(grammarAccess.getDecorationAccess().getNameAssignment_2()); 
            // InternalMhwDSL.g:484:2: ( rule__Decoration__NameAssignment_2 )
            // InternalMhwDSL.g:484:3: rule__Decoration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Decoration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDecorationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__Group__2__Impl"


    // $ANTLR start "rule__Charm__Group__0"
    // InternalMhwDSL.g:493:1: rule__Charm__Group__0 : rule__Charm__Group__0__Impl rule__Charm__Group__1 ;
    public final void rule__Charm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:497:1: ( rule__Charm__Group__0__Impl rule__Charm__Group__1 )
            // InternalMhwDSL.g:498:2: rule__Charm__Group__0__Impl rule__Charm__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Charm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Charm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__Group__0"


    // $ANTLR start "rule__Charm__Group__0__Impl"
    // InternalMhwDSL.g:505:1: rule__Charm__Group__0__Impl : ( () ) ;
    public final void rule__Charm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:509:1: ( ( () ) )
            // InternalMhwDSL.g:510:1: ( () )
            {
            // InternalMhwDSL.g:510:1: ( () )
            // InternalMhwDSL.g:511:2: ()
            {
             before(grammarAccess.getCharmAccess().getCharmAction_0()); 
            // InternalMhwDSL.g:512:2: ()
            // InternalMhwDSL.g:512:3: 
            {
            }

             after(grammarAccess.getCharmAccess().getCharmAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__Group__0__Impl"


    // $ANTLR start "rule__Charm__Group__1"
    // InternalMhwDSL.g:520:1: rule__Charm__Group__1 : rule__Charm__Group__1__Impl rule__Charm__Group__2 ;
    public final void rule__Charm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:524:1: ( rule__Charm__Group__1__Impl rule__Charm__Group__2 )
            // InternalMhwDSL.g:525:2: rule__Charm__Group__1__Impl rule__Charm__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Charm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Charm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__Group__1"


    // $ANTLR start "rule__Charm__Group__1__Impl"
    // InternalMhwDSL.g:532:1: rule__Charm__Group__1__Impl : ( 'Charm' ) ;
    public final void rule__Charm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:536:1: ( ( 'Charm' ) )
            // InternalMhwDSL.g:537:1: ( 'Charm' )
            {
            // InternalMhwDSL.g:537:1: ( 'Charm' )
            // InternalMhwDSL.g:538:2: 'Charm'
            {
             before(grammarAccess.getCharmAccess().getCharmKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCharmAccess().getCharmKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__Group__1__Impl"


    // $ANTLR start "rule__Charm__Group__2"
    // InternalMhwDSL.g:547:1: rule__Charm__Group__2 : rule__Charm__Group__2__Impl ;
    public final void rule__Charm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:551:1: ( rule__Charm__Group__2__Impl )
            // InternalMhwDSL.g:552:2: rule__Charm__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Charm__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__Group__2"


    // $ANTLR start "rule__Charm__Group__2__Impl"
    // InternalMhwDSL.g:558:1: rule__Charm__Group__2__Impl : ( ( rule__Charm__NameAssignment_2 ) ) ;
    public final void rule__Charm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:562:1: ( ( ( rule__Charm__NameAssignment_2 ) ) )
            // InternalMhwDSL.g:563:1: ( ( rule__Charm__NameAssignment_2 ) )
            {
            // InternalMhwDSL.g:563:1: ( ( rule__Charm__NameAssignment_2 ) )
            // InternalMhwDSL.g:564:2: ( rule__Charm__NameAssignment_2 )
            {
             before(grammarAccess.getCharmAccess().getNameAssignment_2()); 
            // InternalMhwDSL.g:565:2: ( rule__Charm__NameAssignment_2 )
            // InternalMhwDSL.g:565:3: rule__Charm__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Charm__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharmAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__Group__2__Impl"


    // $ANTLR start "rule__Armor__Group__0"
    // InternalMhwDSL.g:574:1: rule__Armor__Group__0 : rule__Armor__Group__0__Impl rule__Armor__Group__1 ;
    public final void rule__Armor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:578:1: ( rule__Armor__Group__0__Impl rule__Armor__Group__1 )
            // InternalMhwDSL.g:579:2: rule__Armor__Group__0__Impl rule__Armor__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Armor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Armor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__Group__0"


    // $ANTLR start "rule__Armor__Group__0__Impl"
    // InternalMhwDSL.g:586:1: rule__Armor__Group__0__Impl : ( () ) ;
    public final void rule__Armor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:590:1: ( ( () ) )
            // InternalMhwDSL.g:591:1: ( () )
            {
            // InternalMhwDSL.g:591:1: ( () )
            // InternalMhwDSL.g:592:2: ()
            {
             before(grammarAccess.getArmorAccess().getArmorAction_0()); 
            // InternalMhwDSL.g:593:2: ()
            // InternalMhwDSL.g:593:3: 
            {
            }

             after(grammarAccess.getArmorAccess().getArmorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__Group__0__Impl"


    // $ANTLR start "rule__Armor__Group__1"
    // InternalMhwDSL.g:601:1: rule__Armor__Group__1 : rule__Armor__Group__1__Impl rule__Armor__Group__2 ;
    public final void rule__Armor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:605:1: ( rule__Armor__Group__1__Impl rule__Armor__Group__2 )
            // InternalMhwDSL.g:606:2: rule__Armor__Group__1__Impl rule__Armor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Armor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Armor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__Group__1"


    // $ANTLR start "rule__Armor__Group__1__Impl"
    // InternalMhwDSL.g:613:1: rule__Armor__Group__1__Impl : ( 'Armor' ) ;
    public final void rule__Armor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:617:1: ( ( 'Armor' ) )
            // InternalMhwDSL.g:618:1: ( 'Armor' )
            {
            // InternalMhwDSL.g:618:1: ( 'Armor' )
            // InternalMhwDSL.g:619:2: 'Armor'
            {
             before(grammarAccess.getArmorAccess().getArmorKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getArmorAccess().getArmorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__Group__1__Impl"


    // $ANTLR start "rule__Armor__Group__2"
    // InternalMhwDSL.g:628:1: rule__Armor__Group__2 : rule__Armor__Group__2__Impl ;
    public final void rule__Armor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:632:1: ( rule__Armor__Group__2__Impl )
            // InternalMhwDSL.g:633:2: rule__Armor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Armor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__Group__2"


    // $ANTLR start "rule__Armor__Group__2__Impl"
    // InternalMhwDSL.g:639:1: rule__Armor__Group__2__Impl : ( ( rule__Armor__NameAssignment_2 ) ) ;
    public final void rule__Armor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:643:1: ( ( ( rule__Armor__NameAssignment_2 ) ) )
            // InternalMhwDSL.g:644:1: ( ( rule__Armor__NameAssignment_2 ) )
            {
            // InternalMhwDSL.g:644:1: ( ( rule__Armor__NameAssignment_2 ) )
            // InternalMhwDSL.g:645:2: ( rule__Armor__NameAssignment_2 )
            {
             before(grammarAccess.getArmorAccess().getNameAssignment_2()); 
            // InternalMhwDSL.g:646:2: ( rule__Armor__NameAssignment_2 )
            // InternalMhwDSL.g:646:3: rule__Armor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Armor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArmorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__Group__2__Impl"


    // $ANTLR start "rule__Weapon__Group__0"
    // InternalMhwDSL.g:655:1: rule__Weapon__Group__0 : rule__Weapon__Group__0__Impl rule__Weapon__Group__1 ;
    public final void rule__Weapon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:659:1: ( rule__Weapon__Group__0__Impl rule__Weapon__Group__1 )
            // InternalMhwDSL.g:660:2: rule__Weapon__Group__0__Impl rule__Weapon__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Weapon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Weapon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__Group__0"


    // $ANTLR start "rule__Weapon__Group__0__Impl"
    // InternalMhwDSL.g:667:1: rule__Weapon__Group__0__Impl : ( () ) ;
    public final void rule__Weapon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:671:1: ( ( () ) )
            // InternalMhwDSL.g:672:1: ( () )
            {
            // InternalMhwDSL.g:672:1: ( () )
            // InternalMhwDSL.g:673:2: ()
            {
             before(grammarAccess.getWeaponAccess().getWeaponAction_0()); 
            // InternalMhwDSL.g:674:2: ()
            // InternalMhwDSL.g:674:3: 
            {
            }

             after(grammarAccess.getWeaponAccess().getWeaponAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__Group__0__Impl"


    // $ANTLR start "rule__Weapon__Group__1"
    // InternalMhwDSL.g:682:1: rule__Weapon__Group__1 : rule__Weapon__Group__1__Impl rule__Weapon__Group__2 ;
    public final void rule__Weapon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:686:1: ( rule__Weapon__Group__1__Impl rule__Weapon__Group__2 )
            // InternalMhwDSL.g:687:2: rule__Weapon__Group__1__Impl rule__Weapon__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Weapon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Weapon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__Group__1"


    // $ANTLR start "rule__Weapon__Group__1__Impl"
    // InternalMhwDSL.g:694:1: rule__Weapon__Group__1__Impl : ( 'Weapon' ) ;
    public final void rule__Weapon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:698:1: ( ( 'Weapon' ) )
            // InternalMhwDSL.g:699:1: ( 'Weapon' )
            {
            // InternalMhwDSL.g:699:1: ( 'Weapon' )
            // InternalMhwDSL.g:700:2: 'Weapon'
            {
             before(grammarAccess.getWeaponAccess().getWeaponKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWeaponAccess().getWeaponKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__Group__1__Impl"


    // $ANTLR start "rule__Weapon__Group__2"
    // InternalMhwDSL.g:709:1: rule__Weapon__Group__2 : rule__Weapon__Group__2__Impl ;
    public final void rule__Weapon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:713:1: ( rule__Weapon__Group__2__Impl )
            // InternalMhwDSL.g:714:2: rule__Weapon__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Weapon__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__Group__2"


    // $ANTLR start "rule__Weapon__Group__2__Impl"
    // InternalMhwDSL.g:720:1: rule__Weapon__Group__2__Impl : ( ( rule__Weapon__NameAssignment_2 ) ) ;
    public final void rule__Weapon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:724:1: ( ( ( rule__Weapon__NameAssignment_2 ) ) )
            // InternalMhwDSL.g:725:1: ( ( rule__Weapon__NameAssignment_2 ) )
            {
            // InternalMhwDSL.g:725:1: ( ( rule__Weapon__NameAssignment_2 ) )
            // InternalMhwDSL.g:726:2: ( rule__Weapon__NameAssignment_2 )
            {
             before(grammarAccess.getWeaponAccess().getNameAssignment_2()); 
            // InternalMhwDSL.g:727:2: ( rule__Weapon__NameAssignment_2 )
            // InternalMhwDSL.g:727:3: rule__Weapon__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Weapon__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWeaponAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__Group__2__Impl"


    // $ANTLR start "rule__Request__NameAssignment_2"
    // InternalMhwDSL.g:736:1: rule__Request__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Request__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:740:1: ( ( ruleEString ) )
            // InternalMhwDSL.g:741:2: ( ruleEString )
            {
            // InternalMhwDSL.g:741:2: ( ruleEString )
            // InternalMhwDSL.g:742:3: ruleEString
            {
             before(grammarAccess.getRequestAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__NameAssignment_2"


    // $ANTLR start "rule__Request__ArmorAssignment_3"
    // InternalMhwDSL.g:751:1: rule__Request__ArmorAssignment_3 : ( ruleArmor ) ;
    public final void rule__Request__ArmorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:755:1: ( ( ruleArmor ) )
            // InternalMhwDSL.g:756:2: ( ruleArmor )
            {
            // InternalMhwDSL.g:756:2: ( ruleArmor )
            // InternalMhwDSL.g:757:3: ruleArmor
            {
             before(grammarAccess.getRequestAccess().getArmorArmorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleArmor();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getArmorArmorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__ArmorAssignment_3"


    // $ANTLR start "rule__Request__WeaponAssignment_4"
    // InternalMhwDSL.g:766:1: rule__Request__WeaponAssignment_4 : ( ruleWeapon ) ;
    public final void rule__Request__WeaponAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:770:1: ( ( ruleWeapon ) )
            // InternalMhwDSL.g:771:2: ( ruleWeapon )
            {
            // InternalMhwDSL.g:771:2: ( ruleWeapon )
            // InternalMhwDSL.g:772:3: ruleWeapon
            {
             before(grammarAccess.getRequestAccess().getWeaponWeaponParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWeapon();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getWeaponWeaponParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__WeaponAssignment_4"


    // $ANTLR start "rule__Request__CharmAssignment_5"
    // InternalMhwDSL.g:781:1: rule__Request__CharmAssignment_5 : ( ruleCharm ) ;
    public final void rule__Request__CharmAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:785:1: ( ( ruleCharm ) )
            // InternalMhwDSL.g:786:2: ( ruleCharm )
            {
            // InternalMhwDSL.g:786:2: ( ruleCharm )
            // InternalMhwDSL.g:787:3: ruleCharm
            {
             before(grammarAccess.getRequestAccess().getCharmCharmParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCharm();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getCharmCharmParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__CharmAssignment_5"


    // $ANTLR start "rule__Request__DecorationAssignment_6"
    // InternalMhwDSL.g:796:1: rule__Request__DecorationAssignment_6 : ( ruleDecoration ) ;
    public final void rule__Request__DecorationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:800:1: ( ( ruleDecoration ) )
            // InternalMhwDSL.g:801:2: ( ruleDecoration )
            {
            // InternalMhwDSL.g:801:2: ( ruleDecoration )
            // InternalMhwDSL.g:802:3: ruleDecoration
            {
             before(grammarAccess.getRequestAccess().getDecorationDecorationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDecoration();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getDecorationDecorationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__DecorationAssignment_6"


    // $ANTLR start "rule__Decoration__NameAssignment_2"
    // InternalMhwDSL.g:811:1: rule__Decoration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Decoration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:815:1: ( ( ruleEString ) )
            // InternalMhwDSL.g:816:2: ( ruleEString )
            {
            // InternalMhwDSL.g:816:2: ( ruleEString )
            // InternalMhwDSL.g:817:3: ruleEString
            {
             before(grammarAccess.getDecorationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDecorationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decoration__NameAssignment_2"


    // $ANTLR start "rule__Charm__NameAssignment_2"
    // InternalMhwDSL.g:826:1: rule__Charm__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Charm__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:830:1: ( ( ruleEString ) )
            // InternalMhwDSL.g:831:2: ( ruleEString )
            {
            // InternalMhwDSL.g:831:2: ( ruleEString )
            // InternalMhwDSL.g:832:3: ruleEString
            {
             before(grammarAccess.getCharmAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCharmAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charm__NameAssignment_2"


    // $ANTLR start "rule__Armor__NameAssignment_2"
    // InternalMhwDSL.g:841:1: rule__Armor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Armor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:845:1: ( ( ruleEString ) )
            // InternalMhwDSL.g:846:2: ( ruleEString )
            {
            // InternalMhwDSL.g:846:2: ( ruleEString )
            // InternalMhwDSL.g:847:3: ruleEString
            {
             before(grammarAccess.getArmorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArmorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Armor__NameAssignment_2"


    // $ANTLR start "rule__Weapon__NameAssignment_2"
    // InternalMhwDSL.g:856:1: rule__Weapon__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Weapon__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMhwDSL.g:860:1: ( ( ruleEString ) )
            // InternalMhwDSL.g:861:2: ( ruleEString )
            {
            // InternalMhwDSL.g:861:2: ( ruleEString )
            // InternalMhwDSL.g:862:3: ruleEString
            {
             before(grammarAccess.getWeaponAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWeaponAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Weapon__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}