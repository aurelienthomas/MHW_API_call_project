package m1ice.pdc.mhw.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import m1ice.pdc.mhw.xtext.services.MhwDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMhwDSLParser extends AbstractInternalAntlrParser {
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

        public InternalMhwDSLParser(TokenStream input, MhwDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Request";
       	}

       	@Override
       	protected MhwDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRequest"
    // InternalMhwDSL.g:64:1: entryRuleRequest returns [EObject current=null] : iv_ruleRequest= ruleRequest EOF ;
    public final EObject entryRuleRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequest = null;


        try {
            // InternalMhwDSL.g:64:48: (iv_ruleRequest= ruleRequest EOF )
            // InternalMhwDSL.g:65:2: iv_ruleRequest= ruleRequest EOF
            {
             newCompositeNode(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequest=ruleRequest();

            state._fsp--;

             current =iv_ruleRequest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMhwDSL.g:71:1: ruleRequest returns [EObject current=null] : ( () otherlv_1= 'Request' ( (lv_name_2_0= ruleEString ) ) ( (lv_armor_3_0= ruleArmor ) )? ( (lv_weapon_4_0= ruleWeapon ) )? ( (lv_charm_5_0= ruleCharm ) )? ( (lv_decoration_6_0= ruleDecoration ) )? ) ;
    public final EObject ruleRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_armor_3_0 = null;

        EObject lv_weapon_4_0 = null;

        EObject lv_charm_5_0 = null;

        EObject lv_decoration_6_0 = null;



        	enterRule();

        try {
            // InternalMhwDSL.g:77:2: ( ( () otherlv_1= 'Request' ( (lv_name_2_0= ruleEString ) ) ( (lv_armor_3_0= ruleArmor ) )? ( (lv_weapon_4_0= ruleWeapon ) )? ( (lv_charm_5_0= ruleCharm ) )? ( (lv_decoration_6_0= ruleDecoration ) )? ) )
            // InternalMhwDSL.g:78:2: ( () otherlv_1= 'Request' ( (lv_name_2_0= ruleEString ) ) ( (lv_armor_3_0= ruleArmor ) )? ( (lv_weapon_4_0= ruleWeapon ) )? ( (lv_charm_5_0= ruleCharm ) )? ( (lv_decoration_6_0= ruleDecoration ) )? )
            {
            // InternalMhwDSL.g:78:2: ( () otherlv_1= 'Request' ( (lv_name_2_0= ruleEString ) ) ( (lv_armor_3_0= ruleArmor ) )? ( (lv_weapon_4_0= ruleWeapon ) )? ( (lv_charm_5_0= ruleCharm ) )? ( (lv_decoration_6_0= ruleDecoration ) )? )
            // InternalMhwDSL.g:79:3: () otherlv_1= 'Request' ( (lv_name_2_0= ruleEString ) ) ( (lv_armor_3_0= ruleArmor ) )? ( (lv_weapon_4_0= ruleWeapon ) )? ( (lv_charm_5_0= ruleCharm ) )? ( (lv_decoration_6_0= ruleDecoration ) )?
            {
            // InternalMhwDSL.g:79:3: ()
            // InternalMhwDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequestAccess().getRequestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRequestAccess().getRequestKeyword_1());
            		
            // InternalMhwDSL.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMhwDSL.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMhwDSL.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMhwDSL.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequestAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequestRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"m1ice.pdc.mhw.xtext.MhwDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMhwDSL.g:109:3: ( (lv_armor_3_0= ruleArmor ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMhwDSL.g:110:4: (lv_armor_3_0= ruleArmor )
                    {
                    // InternalMhwDSL.g:110:4: (lv_armor_3_0= ruleArmor )
                    // InternalMhwDSL.g:111:5: lv_armor_3_0= ruleArmor
                    {

                    					newCompositeNode(grammarAccess.getRequestAccess().getArmorArmorParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_armor_3_0=ruleArmor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequestRule());
                    					}
                    					add(
                    						current,
                    						"armor",
                    						lv_armor_3_0,
                    						"m1ice.pdc.mhw.xtext.MhwDSL.Armor");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMhwDSL.g:128:3: ( (lv_weapon_4_0= ruleWeapon ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMhwDSL.g:129:4: (lv_weapon_4_0= ruleWeapon )
                    {
                    // InternalMhwDSL.g:129:4: (lv_weapon_4_0= ruleWeapon )
                    // InternalMhwDSL.g:130:5: lv_weapon_4_0= ruleWeapon
                    {

                    					newCompositeNode(grammarAccess.getRequestAccess().getWeaponWeaponParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_weapon_4_0=ruleWeapon();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequestRule());
                    					}
                    					add(
                    						current,
                    						"weapon",
                    						lv_weapon_4_0,
                    						"m1ice.pdc.mhw.xtext.MhwDSL.Weapon");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMhwDSL.g:147:3: ( (lv_charm_5_0= ruleCharm ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMhwDSL.g:148:4: (lv_charm_5_0= ruleCharm )
                    {
                    // InternalMhwDSL.g:148:4: (lv_charm_5_0= ruleCharm )
                    // InternalMhwDSL.g:149:5: lv_charm_5_0= ruleCharm
                    {

                    					newCompositeNode(grammarAccess.getRequestAccess().getCharmCharmParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_charm_5_0=ruleCharm();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequestRule());
                    					}
                    					add(
                    						current,
                    						"charm",
                    						lv_charm_5_0,
                    						"m1ice.pdc.mhw.xtext.MhwDSL.Charm");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMhwDSL.g:166:3: ( (lv_decoration_6_0= ruleDecoration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMhwDSL.g:167:4: (lv_decoration_6_0= ruleDecoration )
                    {
                    // InternalMhwDSL.g:167:4: (lv_decoration_6_0= ruleDecoration )
                    // InternalMhwDSL.g:168:5: lv_decoration_6_0= ruleDecoration
                    {

                    					newCompositeNode(grammarAccess.getRequestAccess().getDecorationDecorationParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_decoration_6_0=ruleDecoration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRequestRule());
                    					}
                    					add(
                    						current,
                    						"decoration",
                    						lv_decoration_6_0,
                    						"m1ice.pdc.mhw.xtext.MhwDSL.Decoration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRuleEString"
    // InternalMhwDSL.g:189:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMhwDSL.g:189:47: (iv_ruleEString= ruleEString EOF )
            // InternalMhwDSL.g:190:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMhwDSL.g:196:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMhwDSL.g:202:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMhwDSL.g:203:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMhwDSL.g:203:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMhwDSL.g:204:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMhwDSL.g:212:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDecoration"
    // InternalMhwDSL.g:223:1: entryRuleDecoration returns [EObject current=null] : iv_ruleDecoration= ruleDecoration EOF ;
    public final EObject entryRuleDecoration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecoration = null;


        try {
            // InternalMhwDSL.g:223:51: (iv_ruleDecoration= ruleDecoration EOF )
            // InternalMhwDSL.g:224:2: iv_ruleDecoration= ruleDecoration EOF
            {
             newCompositeNode(grammarAccess.getDecorationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecoration=ruleDecoration();

            state._fsp--;

             current =iv_ruleDecoration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecoration"


    // $ANTLR start "ruleDecoration"
    // InternalMhwDSL.g:230:1: ruleDecoration returns [EObject current=null] : ( () otherlv_1= 'Decoration' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDecoration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMhwDSL.g:236:2: ( ( () otherlv_1= 'Decoration' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMhwDSL.g:237:2: ( () otherlv_1= 'Decoration' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMhwDSL.g:237:2: ( () otherlv_1= 'Decoration' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMhwDSL.g:238:3: () otherlv_1= 'Decoration' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMhwDSL.g:238:3: ()
            // InternalMhwDSL.g:239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDecorationAccess().getDecorationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDecorationAccess().getDecorationKeyword_1());
            		
            // InternalMhwDSL.g:249:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMhwDSL.g:250:4: (lv_name_2_0= ruleEString )
            {
            // InternalMhwDSL.g:250:4: (lv_name_2_0= ruleEString )
            // InternalMhwDSL.g:251:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDecorationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDecorationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"m1ice.pdc.mhw.xtext.MhwDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecoration"


    // $ANTLR start "entryRuleCharm"
    // InternalMhwDSL.g:272:1: entryRuleCharm returns [EObject current=null] : iv_ruleCharm= ruleCharm EOF ;
    public final EObject entryRuleCharm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharm = null;


        try {
            // InternalMhwDSL.g:272:46: (iv_ruleCharm= ruleCharm EOF )
            // InternalMhwDSL.g:273:2: iv_ruleCharm= ruleCharm EOF
            {
             newCompositeNode(grammarAccess.getCharmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharm=ruleCharm();

            state._fsp--;

             current =iv_ruleCharm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharm"


    // $ANTLR start "ruleCharm"
    // InternalMhwDSL.g:279:1: ruleCharm returns [EObject current=null] : ( () otherlv_1= 'Charm' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleCharm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMhwDSL.g:285:2: ( ( () otherlv_1= 'Charm' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMhwDSL.g:286:2: ( () otherlv_1= 'Charm' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMhwDSL.g:286:2: ( () otherlv_1= 'Charm' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMhwDSL.g:287:3: () otherlv_1= 'Charm' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMhwDSL.g:287:3: ()
            // InternalMhwDSL.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharmAccess().getCharmAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCharmAccess().getCharmKeyword_1());
            		
            // InternalMhwDSL.g:298:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMhwDSL.g:299:4: (lv_name_2_0= ruleEString )
            {
            // InternalMhwDSL.g:299:4: (lv_name_2_0= ruleEString )
            // InternalMhwDSL.g:300:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCharmAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"m1ice.pdc.mhw.xtext.MhwDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharm"


    // $ANTLR start "entryRuleArmor"
    // InternalMhwDSL.g:321:1: entryRuleArmor returns [EObject current=null] : iv_ruleArmor= ruleArmor EOF ;
    public final EObject entryRuleArmor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArmor = null;


        try {
            // InternalMhwDSL.g:321:46: (iv_ruleArmor= ruleArmor EOF )
            // InternalMhwDSL.g:322:2: iv_ruleArmor= ruleArmor EOF
            {
             newCompositeNode(grammarAccess.getArmorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArmor=ruleArmor();

            state._fsp--;

             current =iv_ruleArmor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArmor"


    // $ANTLR start "ruleArmor"
    // InternalMhwDSL.g:328:1: ruleArmor returns [EObject current=null] : ( () otherlv_1= 'Armor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleArmor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMhwDSL.g:334:2: ( ( () otherlv_1= 'Armor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMhwDSL.g:335:2: ( () otherlv_1= 'Armor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMhwDSL.g:335:2: ( () otherlv_1= 'Armor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMhwDSL.g:336:3: () otherlv_1= 'Armor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMhwDSL.g:336:3: ()
            // InternalMhwDSL.g:337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArmorAccess().getArmorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArmorAccess().getArmorKeyword_1());
            		
            // InternalMhwDSL.g:347:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMhwDSL.g:348:4: (lv_name_2_0= ruleEString )
            {
            // InternalMhwDSL.g:348:4: (lv_name_2_0= ruleEString )
            // InternalMhwDSL.g:349:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getArmorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArmorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"m1ice.pdc.mhw.xtext.MhwDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArmor"


    // $ANTLR start "entryRuleWeapon"
    // InternalMhwDSL.g:370:1: entryRuleWeapon returns [EObject current=null] : iv_ruleWeapon= ruleWeapon EOF ;
    public final EObject entryRuleWeapon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWeapon = null;


        try {
            // InternalMhwDSL.g:370:47: (iv_ruleWeapon= ruleWeapon EOF )
            // InternalMhwDSL.g:371:2: iv_ruleWeapon= ruleWeapon EOF
            {
             newCompositeNode(grammarAccess.getWeaponRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWeapon=ruleWeapon();

            state._fsp--;

             current =iv_ruleWeapon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWeapon"


    // $ANTLR start "ruleWeapon"
    // InternalMhwDSL.g:377:1: ruleWeapon returns [EObject current=null] : ( () otherlv_1= 'Weapon' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleWeapon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMhwDSL.g:383:2: ( ( () otherlv_1= 'Weapon' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMhwDSL.g:384:2: ( () otherlv_1= 'Weapon' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMhwDSL.g:384:2: ( () otherlv_1= 'Weapon' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMhwDSL.g:385:3: () otherlv_1= 'Weapon' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMhwDSL.g:385:3: ()
            // InternalMhwDSL.g:386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWeaponAccess().getWeaponAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWeaponAccess().getWeaponKeyword_1());
            		
            // InternalMhwDSL.g:396:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMhwDSL.g:397:4: (lv_name_2_0= ruleEString )
            {
            // InternalMhwDSL.g:397:4: (lv_name_2_0= ruleEString )
            // InternalMhwDSL.g:398:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWeaponAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWeaponRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"m1ice.pdc.mhw.xtext.MhwDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWeapon"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000F002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000B002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});

}