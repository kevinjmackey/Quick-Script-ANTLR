// Generated from d:\projects\YRC\QuickScript\antlr\qsParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CMPR=1, CRSR=2, DVAR=3, EQUALS=4, EXIT=5, GOTO=6, INFO=7, LABL=8, NOOP=9, 
		NUMPARAMS=10, NUMSTMTS=11, PARAM=12, PRMT=13, PPUP=14, REFCOUNT=15, RUNM=16, 
		RVAR=17, SNDK=18, STMT=19, STMTID=20, SVAR=21, VERSION=22, WTXT=23, LBRACK=24, 
		RBRACK=25, ELSE=26, THEN=27, STRING_LITERAL=28, NUMBER_INT=29, IDENTIFIER=30, 
		SPACE=31, COMMENT=32, LINE_COMMENT=33;
	public static final int
		RULE_qscript_file = 0, RULE_info_statement = 1, RULE_version_clause = 2, 
		RULE_num_stmts_clause = 3, RULE_statements = 4, RULE_statement = 5, RULE_statement_type = 6, 
		RULE_statement_CMPR = 7, RULE_statement_CRSR = 8, RULE_statement_DVAR = 9, 
		RULE_statement_EXIT = 10, RULE_statement_GOTO = 11, RULE_statement_LABL = 12, 
		RULE_statement_NOOP = 13, RULE_statement_PRMT = 14, RULE_statement_PPUP = 15, 
		RULE_statement_RUNM = 16, RULE_statement_RVAR = 17, RULE_statement_SNDK = 18, 
		RULE_statement_SVAR = 19, RULE_statement_WTXT = 20, RULE_params = 21, 
		RULE_param = 22, RULE_parameter_count = 23, RULE_reference_count = 24, 
		RULE_integer_value = 25, RULE_then_clause = 26, RULE_else_clause = 27, 
		RULE_identifier = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"qscript_file", "info_statement", "version_clause", "num_stmts_clause", 
			"statements", "statement", "statement_type", "statement_CMPR", "statement_CRSR", 
			"statement_DVAR", "statement_EXIT", "statement_GOTO", "statement_LABL", 
			"statement_NOOP", "statement_PRMT", "statement_PPUP", "statement_RUNM", 
			"statement_RVAR", "statement_SNDK", "statement_SVAR", "statement_WTXT", 
			"params", "param", "parameter_count", "reference_count", "integer_value", 
			"then_clause", "else_clause", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'='", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CMPR", "CRSR", "DVAR", "EQUALS", "EXIT", "GOTO", "INFO", "LABL", 
			"NOOP", "NUMPARAMS", "NUMSTMTS", "PARAM", "PRMT", "PPUP", "REFCOUNT", 
			"RUNM", "RVAR", "SNDK", "STMT", "STMTID", "SVAR", "VERSION", "WTXT", 
			"LBRACK", "RBRACK", "ELSE", "THEN", "STRING_LITERAL", "NUMBER_INT", "IDENTIFIER", 
			"SPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "qsParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Qscript_fileContext extends ParserRuleContext {
		public Info_statementContext info_statement() {
			return getRuleContext(Info_statementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(qsParser.EOF, 0); }
		public Qscript_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qscript_file; }
	}

	public final Qscript_fileContext qscript_file() throws RecognitionException {
		Qscript_fileContext _localctx = new Qscript_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_qscript_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			info_statement();
			setState(59);
			statements();
			setState(60);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Info_statementContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(qsParser.LBRACK, 0); }
		public TerminalNode INFO() { return getToken(qsParser.INFO, 0); }
		public TerminalNode RBRACK() { return getToken(qsParser.RBRACK, 0); }
		public Version_clauseContext version_clause() {
			return getRuleContext(Version_clauseContext.class,0);
		}
		public Num_stmts_clauseContext num_stmts_clause() {
			return getRuleContext(Num_stmts_clauseContext.class,0);
		}
		public Info_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_statement; }
	}

	public final Info_statementContext info_statement() throws RecognitionException {
		Info_statementContext _localctx = new Info_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LBRACK);
			setState(63);
			match(INFO);
			setState(64);
			match(RBRACK);
			setState(65);
			version_clause();
			setState(66);
			num_stmts_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Version_clauseContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(qsParser.VERSION, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public Version_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_clause; }
	}

	public final Version_clauseContext version_clause() throws RecognitionException {
		Version_clauseContext _localctx = new Version_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VERSION);
			setState(69);
			match(EQUALS);
			setState(70);
			integer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_stmts_clauseContext extends ParserRuleContext {
		public TerminalNode NUMSTMTS() { return getToken(qsParser.NUMSTMTS, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public Num_stmts_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_stmts_clause; }
	}

	public final Num_stmts_clauseContext num_stmts_clause() throws RecognitionException {
		Num_stmts_clauseContext _localctx = new Num_stmts_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_num_stmts_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(NUMSTMTS);
			setState(73);
			match(EQUALS);
			setState(74);
			integer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(qsParser.LBRACK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(qsParser.RBRACK, 0); }
		public Statement_typeContext statement_type() {
			return getRuleContext(Statement_typeContext.class,0);
		}
		public Reference_countContext reference_count() {
			return getRuleContext(Reference_countContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(LBRACK);
			setState(82);
			identifier();
			setState(83);
			match(RBRACK);
			setState(84);
			statement_type();
			setState(85);
			reference_count();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_typeContext extends ParserRuleContext {
		public Statement_CRSRContext statement_CRSR() {
			return getRuleContext(Statement_CRSRContext.class,0);
		}
		public Parameter_countContext parameter_count() {
			return getRuleContext(Parameter_countContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Statement_CMPRContext statement_CMPR() {
			return getRuleContext(Statement_CMPRContext.class,0);
		}
		public Then_clauseContext then_clause() {
			return getRuleContext(Then_clauseContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Statement_DVARContext statement_DVAR() {
			return getRuleContext(Statement_DVARContext.class,0);
		}
		public Statement_EXITContext statement_EXIT() {
			return getRuleContext(Statement_EXITContext.class,0);
		}
		public Statement_GOTOContext statement_GOTO() {
			return getRuleContext(Statement_GOTOContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Statement_LABLContext statement_LABL() {
			return getRuleContext(Statement_LABLContext.class,0);
		}
		public Statement_NOOPContext statement_NOOP() {
			return getRuleContext(Statement_NOOPContext.class,0);
		}
		public Statement_PPUPContext statement_PPUP() {
			return getRuleContext(Statement_PPUPContext.class,0);
		}
		public Statement_PRMTContext statement_PRMT() {
			return getRuleContext(Statement_PRMTContext.class,0);
		}
		public Statement_RUNMContext statement_RUNM() {
			return getRuleContext(Statement_RUNMContext.class,0);
		}
		public Statement_RVARContext statement_RVAR() {
			return getRuleContext(Statement_RVARContext.class,0);
		}
		public Statement_SNDKContext statement_SNDK() {
			return getRuleContext(Statement_SNDKContext.class,0);
		}
		public Statement_SVARContext statement_SVAR() {
			return getRuleContext(Statement_SVARContext.class,0);
		}
		public Statement_WTXTContext statement_WTXT() {
			return getRuleContext(Statement_WTXTContext.class,0);
		}
		public Statement_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_type; }
	}

	public final Statement_typeContext statement_type() throws RecognitionException {
		Statement_typeContext _localctx = new Statement_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement_type);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				statement_CRSR();
				setState(88);
				parameter_count();
				setState(89);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				statement_CMPR();
				setState(92);
				parameter_count();
				setState(93);
				params();
				setState(94);
				then_clause();
				setState(95);
				else_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				statement_DVAR();
				setState(98);
				parameter_count();
				setState(99);
				params();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				statement_EXIT();
				setState(102);
				parameter_count();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				statement_GOTO();
				setState(105);
				parameter_count();
				setState(106);
				param();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				statement_LABL();
				setState(109);
				parameter_count();
				setState(110);
				params();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				statement_NOOP();
				setState(113);
				parameter_count();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				statement_PPUP();
				setState(116);
				parameter_count();
				setState(117);
				params();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				statement_PRMT();
				setState(120);
				parameter_count();
				setState(121);
				params();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(123);
				statement_RUNM();
				setState(124);
				parameter_count();
				setState(125);
				params();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(127);
				statement_RVAR();
				setState(128);
				parameter_count();
				setState(129);
				params();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(131);
				statement_SNDK();
				setState(132);
				parameter_count();
				setState(133);
				params();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(135);
				statement_SVAR();
				setState(136);
				parameter_count();
				setState(137);
				params();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(139);
				statement_WTXT();
				setState(140);
				parameter_count();
				setState(141);
				params();
				setState(142);
				then_clause();
				setState(143);
				else_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_CMPRContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode CMPR() { return getToken(qsParser.CMPR, 0); }
		public Statement_CMPRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_CMPR; }
	}

	public final Statement_CMPRContext statement_CMPR() throws RecognitionException {
		Statement_CMPRContext _localctx = new Statement_CMPRContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement_CMPR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(STMTID);
			setState(148);
			match(EQUALS);
			setState(149);
			match(CMPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_CRSRContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode CRSR() { return getToken(qsParser.CRSR, 0); }
		public Statement_CRSRContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_CRSR; }
	}

	public final Statement_CRSRContext statement_CRSR() throws RecognitionException {
		Statement_CRSRContext _localctx = new Statement_CRSRContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement_CRSR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(STMTID);
			setState(152);
			match(EQUALS);
			setState(153);
			match(CRSR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_DVARContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode DVAR() { return getToken(qsParser.DVAR, 0); }
		public Statement_DVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_DVAR; }
	}

	public final Statement_DVARContext statement_DVAR() throws RecognitionException {
		Statement_DVARContext _localctx = new Statement_DVARContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement_DVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(STMTID);
			setState(156);
			match(EQUALS);
			setState(157);
			match(DVAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_EXITContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode EXIT() { return getToken(qsParser.EXIT, 0); }
		public Statement_EXITContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_EXIT; }
	}

	public final Statement_EXITContext statement_EXIT() throws RecognitionException {
		Statement_EXITContext _localctx = new Statement_EXITContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement_EXIT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(STMTID);
			setState(160);
			match(EQUALS);
			setState(161);
			match(EXIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_GOTOContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode GOTO() { return getToken(qsParser.GOTO, 0); }
		public Statement_GOTOContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_GOTO; }
	}

	public final Statement_GOTOContext statement_GOTO() throws RecognitionException {
		Statement_GOTOContext _localctx = new Statement_GOTOContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_GOTO);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(STMTID);
			setState(164);
			match(EQUALS);
			setState(165);
			match(GOTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_LABLContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode LABL() { return getToken(qsParser.LABL, 0); }
		public Statement_LABLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_LABL; }
	}

	public final Statement_LABLContext statement_LABL() throws RecognitionException {
		Statement_LABLContext _localctx = new Statement_LABLContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement_LABL);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(STMTID);
			setState(168);
			match(EQUALS);
			setState(169);
			match(LABL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_NOOPContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode NOOP() { return getToken(qsParser.NOOP, 0); }
		public Statement_NOOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_NOOP; }
	}

	public final Statement_NOOPContext statement_NOOP() throws RecognitionException {
		Statement_NOOPContext _localctx = new Statement_NOOPContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement_NOOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(STMTID);
			setState(172);
			match(EQUALS);
			setState(173);
			match(NOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_PRMTContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode PRMT() { return getToken(qsParser.PRMT, 0); }
		public Statement_PRMTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_PRMT; }
	}

	public final Statement_PRMTContext statement_PRMT() throws RecognitionException {
		Statement_PRMTContext _localctx = new Statement_PRMTContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement_PRMT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(STMTID);
			setState(176);
			match(EQUALS);
			setState(177);
			match(PRMT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_PPUPContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode PPUP() { return getToken(qsParser.PPUP, 0); }
		public Statement_PPUPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_PPUP; }
	}

	public final Statement_PPUPContext statement_PPUP() throws RecognitionException {
		Statement_PPUPContext _localctx = new Statement_PPUPContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement_PPUP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(STMTID);
			setState(180);
			match(EQUALS);
			setState(181);
			match(PPUP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_RUNMContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode RUNM() { return getToken(qsParser.RUNM, 0); }
		public Statement_RUNMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_RUNM; }
	}

	public final Statement_RUNMContext statement_RUNM() throws RecognitionException {
		Statement_RUNMContext _localctx = new Statement_RUNMContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement_RUNM);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(STMTID);
			setState(184);
			match(EQUALS);
			setState(185);
			match(RUNM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_RVARContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode RVAR() { return getToken(qsParser.RVAR, 0); }
		public Statement_RVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_RVAR; }
	}

	public final Statement_RVARContext statement_RVAR() throws RecognitionException {
		Statement_RVARContext _localctx = new Statement_RVARContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement_RVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(STMTID);
			setState(188);
			match(EQUALS);
			setState(189);
			match(RVAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_SNDKContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode SNDK() { return getToken(qsParser.SNDK, 0); }
		public Statement_SNDKContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_SNDK; }
	}

	public final Statement_SNDKContext statement_SNDK() throws RecognitionException {
		Statement_SNDKContext _localctx = new Statement_SNDKContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement_SNDK);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(STMTID);
			setState(192);
			match(EQUALS);
			setState(193);
			match(SNDK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_SVARContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode SVAR() { return getToken(qsParser.SVAR, 0); }
		public Statement_SVARContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_SVAR; }
	}

	public final Statement_SVARContext statement_SVAR() throws RecognitionException {
		Statement_SVARContext _localctx = new Statement_SVARContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement_SVAR);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(STMTID);
			setState(196);
			match(EQUALS);
			setState(197);
			match(SVAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statement_WTXTContext extends ParserRuleContext {
		public TerminalNode STMTID() { return getToken(qsParser.STMTID, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public TerminalNode WTXT() { return getToken(qsParser.WTXT, 0); }
		public Statement_WTXTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_WTXT; }
	}

	public final Statement_WTXTContext statement_WTXT() throws RecognitionException {
		Statement_WTXTContext _localctx = new Statement_WTXTContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement_WTXT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(STMTID);
			setState(200);
			match(EQUALS);
			setState(201);
			match(WTXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				param();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PARAM );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(qsParser.PARAM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(qsParser.STRING_LITERAL, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(PARAM);
			setState(209);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_countContext extends ParserRuleContext {
		public TerminalNode NUMPARAMS() { return getToken(qsParser.NUMPARAMS, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public Parameter_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_count; }
	}

	public final Parameter_countContext parameter_count() throws RecognitionException {
		Parameter_countContext _localctx = new Parameter_countContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parameter_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(NUMPARAMS);
			setState(212);
			match(EQUALS);
			setState(213);
			integer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_countContext extends ParserRuleContext {
		public TerminalNode REFCOUNT() { return getToken(qsParser.REFCOUNT, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public Integer_valueContext integer_value() {
			return getRuleContext(Integer_valueContext.class,0);
		}
		public Reference_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_count; }
	}

	public final Reference_countContext reference_count() throws RecognitionException {
		Reference_countContext _localctx = new Reference_countContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_reference_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(REFCOUNT);
			setState(216);
			match(EQUALS);
			setState(217);
			integer_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_valueContext extends ParserRuleContext {
		public TerminalNode NUMBER_INT() { return getToken(qsParser.NUMBER_INT, 0); }
		public Integer_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_value; }
	}

	public final Integer_valueContext integer_value() throws RecognitionException {
		Integer_valueContext _localctx = new Integer_valueContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_integer_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(NUMBER_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Then_clauseContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(qsParser.THEN, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Then_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then_clause; }
	}

	public final Then_clauseContext then_clause() throws RecognitionException {
		Then_clauseContext _localctx = new Then_clauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_then_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(THEN);
			setState(222);
			match(EQUALS);
			setState(223);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(qsParser.ELSE, 0); }
		public TerminalNode EQUALS() { return getToken(qsParser.EQUALS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ELSE);
			setState(226);
			match(EQUALS);
			setState(227);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(qsParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\6\6P\n\6\r\6"+
		"\16\6Q\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u00cf\n\27"+
		"\r\27\16\27\u00d0\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\2"+
		"\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2"+
		"\2\2\u00db\2<\3\2\2\2\4@\3\2\2\2\6F\3\2\2\2\bJ\3\2\2\2\nO\3\2\2\2\fS\3"+
		"\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22\u0099\3\2\2\2\24\u009d\3\2"+
		"\2\2\26\u00a1\3\2\2\2\30\u00a5\3\2\2\2\32\u00a9\3\2\2\2\34\u00ad\3\2\2"+
		"\2\36\u00b1\3\2\2\2 \u00b5\3\2\2\2\"\u00b9\3\2\2\2$\u00bd\3\2\2\2&\u00c1"+
		"\3\2\2\2(\u00c5\3\2\2\2*\u00c9\3\2\2\2,\u00ce\3\2\2\2.\u00d2\3\2\2\2\60"+
		"\u00d5\3\2\2\2\62\u00d9\3\2\2\2\64\u00dd\3\2\2\2\66\u00df\3\2\2\28\u00e3"+
		"\3\2\2\2:\u00e7\3\2\2\2<=\5\4\3\2=>\5\n\6\2>?\7\2\2\3?\3\3\2\2\2@A\7\32"+
		"\2\2AB\7\t\2\2BC\7\33\2\2CD\5\6\4\2DE\5\b\5\2E\5\3\2\2\2FG\7\30\2\2GH"+
		"\7\6\2\2HI\5\64\33\2I\7\3\2\2\2JK\7\r\2\2KL\7\6\2\2LM\5\64\33\2M\t\3\2"+
		"\2\2NP\5\f\7\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\13\3\2\2\2ST\7"+
		"\32\2\2TU\5:\36\2UV\7\33\2\2VW\5\16\b\2WX\5\62\32\2X\r\3\2\2\2YZ\5\22"+
		"\n\2Z[\5\60\31\2[\\\5,\27\2\\\u0094\3\2\2\2]^\5\20\t\2^_\5\60\31\2_`\5"+
		",\27\2`a\5\66\34\2ab\58\35\2b\u0094\3\2\2\2cd\5\24\13\2de\5\60\31\2ef"+
		"\5,\27\2f\u0094\3\2\2\2gh\5\26\f\2hi\5\60\31\2i\u0094\3\2\2\2jk\5\30\r"+
		"\2kl\5\60\31\2lm\5.\30\2m\u0094\3\2\2\2no\5\32\16\2op\5\60\31\2pq\5,\27"+
		"\2q\u0094\3\2\2\2rs\5\34\17\2st\5\60\31\2t\u0094\3\2\2\2uv\5 \21\2vw\5"+
		"\60\31\2wx\5,\27\2x\u0094\3\2\2\2yz\5\36\20\2z{\5\60\31\2{|\5,\27\2|\u0094"+
		"\3\2\2\2}~\5\"\22\2~\177\5\60\31\2\177\u0080\5,\27\2\u0080\u0094\3\2\2"+
		"\2\u0081\u0082\5$\23\2\u0082\u0083\5\60\31\2\u0083\u0084\5,\27\2\u0084"+
		"\u0094\3\2\2\2\u0085\u0086\5&\24\2\u0086\u0087\5\60\31\2\u0087\u0088\5"+
		",\27\2\u0088\u0094\3\2\2\2\u0089\u008a\5(\25\2\u008a\u008b\5\60\31\2\u008b"+
		"\u008c\5,\27\2\u008c\u0094\3\2\2\2\u008d\u008e\5*\26\2\u008e\u008f\5\60"+
		"\31\2\u008f\u0090\5,\27\2\u0090\u0091\5\66\34\2\u0091\u0092\58\35\2\u0092"+
		"\u0094\3\2\2\2\u0093Y\3\2\2\2\u0093]\3\2\2\2\u0093c\3\2\2\2\u0093g\3\2"+
		"\2\2\u0093j\3\2\2\2\u0093n\3\2\2\2\u0093r\3\2\2\2\u0093u\3\2\2\2\u0093"+
		"y\3\2\2\2\u0093}\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u0085\3\2\2\2\u0093"+
		"\u0089\3\2\2\2\u0093\u008d\3\2\2\2\u0094\17\3\2\2\2\u0095\u0096\7\26\2"+
		"\2\u0096\u0097\7\6\2\2\u0097\u0098\7\3\2\2\u0098\21\3\2\2\2\u0099\u009a"+
		"\7\26\2\2\u009a\u009b\7\6\2\2\u009b\u009c\7\4\2\2\u009c\23\3\2\2\2\u009d"+
		"\u009e\7\26\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\7\5\2\2\u00a0\25\3\2\2"+
		"\2\u00a1\u00a2\7\26\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\7\7\2\2\u00a4"+
		"\27\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\7\b\2"+
		"\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac"+
		"\7\n\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\7\6"+
		"\2\2\u00b3\u00b4\7\17\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\7\26\2\2\u00b6"+
		"\u00b7\7\6\2\2\u00b7\u00b8\7\20\2\2\u00b8!\3\2\2\2\u00b9\u00ba\7\26\2"+
		"\2\u00ba\u00bb\7\6\2\2\u00bb\u00bc\7\22\2\2\u00bc#\3\2\2\2\u00bd\u00be"+
		"\7\26\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\7\23\2\2\u00c0%\3\2\2\2\u00c1"+
		"\u00c2\7\26\2\2\u00c2\u00c3\7\6\2\2\u00c3\u00c4\7\24\2\2\u00c4\'\3\2\2"+
		"\2\u00c5\u00c6\7\26\2\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\7\27\2\2\u00c8"+
		")\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\7\31\2"+
		"\2\u00cc+\3\2\2\2\u00cd\u00cf\5.\30\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1-\3\2\2\2\u00d2"+
		"\u00d3\7\16\2\2\u00d3\u00d4\7\36\2\2\u00d4/\3\2\2\2\u00d5\u00d6\7\f\2"+
		"\2\u00d6\u00d7\7\6\2\2\u00d7\u00d8\5\64\33\2\u00d8\61\3\2\2\2\u00d9\u00da"+
		"\7\21\2\2\u00da\u00db\7\6\2\2\u00db\u00dc\5\64\33\2\u00dc\63\3\2\2\2\u00dd"+
		"\u00de\7\37\2\2\u00de\65\3\2\2\2\u00df\u00e0\7\35\2\2\u00e0\u00e1\7\6"+
		"\2\2\u00e1\u00e2\5:\36\2\u00e2\67\3\2\2\2\u00e3\u00e4\7\34\2\2\u00e4\u00e5"+
		"\7\6\2\2\u00e5\u00e6\5:\36\2\u00e69\3\2\2\2\u00e7\u00e8\7 \2\2\u00e8;"+
		"\3\2\2\2\5Q\u0093\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}