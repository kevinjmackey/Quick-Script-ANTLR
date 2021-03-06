// Generated from d:\projects\YRC\QuickScript\antlr\qsLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qsLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CMPR", "CRSR", "DVAR", "EQUALS", "EXIT", "GOTO", "INFO", "LABL", "NOOP", 
			"NUMPARAMS", "NUMSTMTS", "PARAM", "PRMT", "PPUP", "REFCOUNT", "RUNM", 
			"RVAR", "SNDK", "STMT", "STMTID", "SVAR", "VERSION", "WTXT", "LBRACK", 
			"RBRACK", "ELSE", "THEN", "STRING_LITERAL", "NUMBER_INT", "IDENTIFIER", 
			"SPACE", "COMMENT", "LINE_COMMENT", "DEC_DOT_DEC", "HEX_DIGIT", "DEC_DIGIT", 
			"ALPHA", "ESCAPE_SEQUENCE", "UNICODE", "HEX", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z"
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


	public qsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "qsLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u01c8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u0120\n\35\f\35\16\35\u0123"+
		"\13\35\3\35\3\35\3\35\3\36\6\36\u0129\n\36\r\36\16\36\u012a\3\37\3\37"+
		"\7\37\u012f\n\37\f\37\16\37\u0132\13\37\3 \6 \u0135\n \r \16 \u0136\3"+
		" \3 \3!\3!\3!\3!\3!\7!\u0140\n!\f!\16!\u0143\13!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\7\"\u014e\n\"\f\"\16\"\u0151\13\"\3\"\3\"\3#\6#\u0156\n#\r"+
		"#\16#\u0157\3#\3#\6#\u015c\n#\r#\16#\u015d\3#\6#\u0161\n#\r#\16#\u0162"+
		"\3#\3#\3#\3#\6#\u0169\n#\r#\16#\u016a\5#\u016d\n#\3$\3$\3%\3%\3&\5&\u0174"+
		"\n&\3\'\3\'\3\'\3\'\5\'\u017a\n\'\3\'\5\'\u017d\n\'\3\'\3\'\3\'\6\'\u0182"+
		"\n\'\r\'\16\'\u0183\3\'\3\'\3\'\3\'\3\'\5\'\u018b\n\'\3(\3(\3(\3(\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3\u0141\2D\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o"+
		"\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\3\2\'\6\2\f\f\17"+
		"\17$$^^\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2\62"+
		";CH\3\2\62;\n\2$$))^^ddhhppttvv\3\2\62\65\3\2\629\5\2\62;CHch\4\2CCcc"+
		"\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2L"+
		"Lll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01b9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3\u0087\3\2\2\2\5\u008c"+
		"\3\2\2\2\7\u0091\3\2\2\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r\u009d\3\2"+
		"\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00ac\3\2\2\2\25\u00b1\3\2\2"+
		"\2\27\u00bb\3\2\2\2\31\u00c4\3\2\2\2\33\u00cc\3\2\2\2\35\u00d1\3\2\2\2"+
		"\37\u00d6\3\2\2\2!\u00df\3\2\2\2#\u00e4\3\2\2\2%\u00e9\3\2\2\2\'\u00ee"+
		"\3\2\2\2)\u00f3\3\2\2\2+\u00fa\3\2\2\2-\u00ff\3\2\2\2/\u0107\3\2\2\2\61"+
		"\u010c\3\2\2\2\63\u010e\3\2\2\2\65\u0110\3\2\2\2\67\u0115\3\2\2\29\u011a"+
		"\3\2\2\2;\u0128\3\2\2\2=\u012c\3\2\2\2?\u0134\3\2\2\2A\u013a\3\2\2\2C"+
		"\u0149\3\2\2\2E\u016c\3\2\2\2G\u016e\3\2\2\2I\u0170\3\2\2\2K\u0173\3\2"+
		"\2\2M\u018a\3\2\2\2O\u018c\3\2\2\2Q\u0192\3\2\2\2S\u0194\3\2\2\2U\u0196"+
		"\3\2\2\2W\u0198\3\2\2\2Y\u019a\3\2\2\2[\u019c\3\2\2\2]\u019e\3\2\2\2_"+
		"\u01a0\3\2\2\2a\u01a2\3\2\2\2c\u01a4\3\2\2\2e\u01a6\3\2\2\2g\u01a8\3\2"+
		"\2\2i\u01aa\3\2\2\2k\u01ac\3\2\2\2m\u01ae\3\2\2\2o\u01b0\3\2\2\2q\u01b2"+
		"\3\2\2\2s\u01b4\3\2\2\2u\u01b6\3\2\2\2w\u01b8\3\2\2\2y\u01ba\3\2\2\2{"+
		"\u01bc\3\2\2\2}\u01be\3\2\2\2\177\u01c0\3\2\2\2\u0081\u01c2\3\2\2\2\u0083"+
		"\u01c4\3\2\2\2\u0085\u01c6\3\2\2\2\u0087\u0088\5W,\2\u0088\u0089\5k\66"+
		"\2\u0089\u008a\5q9\2\u008a\u008b\5u;\2\u008b\4\3\2\2\2\u008c\u008d\5W"+
		",\2\u008d\u008e\5u;\2\u008e\u008f\5w<\2\u008f\u0090\5u;\2\u0090\6\3\2"+
		"\2\2\u0091\u0092\5Y-\2\u0092\u0093\5}?\2\u0093\u0094\5S*\2\u0094\u0095"+
		"\5u;\2\u0095\b\3\2\2\2\u0096\u0097\7?\2\2\u0097\n\3\2\2\2\u0098\u0099"+
		"\5[.\2\u0099\u009a\5\u0081A\2\u009a\u009b\5c\62\2\u009b\u009c\5y=\2\u009c"+
		"\f\3\2\2\2\u009d\u009e\5_\60\2\u009e\u009f\5o8\2\u009f\u00a0\5y=\2\u00a0"+
		"\u00a1\5o8\2\u00a1\16\3\2\2\2\u00a2\u00a3\5c\62\2\u00a3\u00a4\5m\67\2"+
		"\u00a4\u00a5\5]/\2\u00a5\u00a6\5o8\2\u00a6\20\3\2\2\2\u00a7\u00a8\5i\65"+
		"\2\u00a8\u00a9\5S*\2\u00a9\u00aa\5U+\2\u00aa\u00ab\5i\65\2\u00ab\22\3"+
		"\2\2\2\u00ac\u00ad\5m\67\2\u00ad\u00ae\5o8\2\u00ae\u00af\5o8\2\u00af\u00b0"+
		"\5q9\2\u00b0\24\3\2\2\2\u00b1\u00b2\5m\67\2\u00b2\u00b3\5{>\2\u00b3\u00b4"+
		"\5k\66\2\u00b4\u00b5\5q9\2\u00b5\u00b6\5S*\2\u00b6\u00b7\5u;\2\u00b7\u00b8"+
		"\5S*\2\u00b8\u00b9\5k\66\2\u00b9\u00ba\5w<\2\u00ba\26\3\2\2\2\u00bb\u00bc"+
		"\5m\67\2\u00bc\u00bd\5{>\2\u00bd\u00be\5k\66\2\u00be\u00bf\5w<\2\u00bf"+
		"\u00c0\5y=\2\u00c0\u00c1\5k\66\2\u00c1\u00c2\5y=\2\u00c2\u00c3\5w<\2\u00c3"+
		"\30\3\2\2\2\u00c4\u00c5\5q9\2\u00c5\u00c6\5S*\2\u00c6\u00c7\5u;\2\u00c7"+
		"\u00c8\5S*\2\u00c8\u00c9\5k\66\2\u00c9\u00ca\5;\36\2\u00ca\u00cb\5\t\5"+
		"\2\u00cb\32\3\2\2\2\u00cc\u00cd\5q9\2\u00cd\u00ce\5u;\2\u00ce\u00cf\5"+
		"k\66\2\u00cf\u00d0\5y=\2\u00d0\34\3\2\2\2\u00d1\u00d2\5q9\2\u00d2\u00d3"+
		"\5q9\2\u00d3\u00d4\5{>\2\u00d4\u00d5\5q9\2\u00d5\36\3\2\2\2\u00d6\u00d7"+
		"\5u;\2\u00d7\u00d8\5[.\2\u00d8\u00d9\5]/\2\u00d9\u00da\5W,\2\u00da\u00db"+
		"\5o8\2\u00db\u00dc\5{>\2\u00dc\u00dd\5m\67\2\u00dd\u00de\5y=\2\u00de "+
		"\3\2\2\2\u00df\u00e0\5u;\2\u00e0\u00e1\5{>\2\u00e1\u00e2\5m\67\2\u00e2"+
		"\u00e3\5k\66\2\u00e3\"\3\2\2\2\u00e4\u00e5\5u;\2\u00e5\u00e6\5}?\2\u00e6"+
		"\u00e7\5S*\2\u00e7\u00e8\5u;\2\u00e8$\3\2\2\2\u00e9\u00ea\5w<\2\u00ea"+
		"\u00eb\5m\67\2\u00eb\u00ec\5Y-\2\u00ec\u00ed\5g\64\2\u00ed&\3\2\2\2\u00ee"+
		"\u00ef\5w<\2\u00ef\u00f0\5y=\2\u00f0\u00f1\5k\66\2\u00f1\u00f2\5y=\2\u00f2"+
		"(\3\2\2\2\u00f3\u00f4\5w<\2\u00f4\u00f5\5y=\2\u00f5\u00f6\5k\66\2\u00f6"+
		"\u00f7\5y=\2\u00f7\u00f8\5c\62\2\u00f8\u00f9\5Y-\2\u00f9*\3\2\2\2\u00fa"+
		"\u00fb\5w<\2\u00fb\u00fc\5}?\2\u00fc\u00fd\5S*\2\u00fd\u00fe\5u;\2\u00fe"+
		",\3\2\2\2\u00ff\u0100\5}?\2\u0100\u0101\5[.\2\u0101\u0102\5u;\2\u0102"+
		"\u0103\5w<\2\u0103\u0104\5c\62\2\u0104\u0105\5o8\2\u0105\u0106\5m\67\2"+
		"\u0106.\3\2\2\2\u0107\u0108\5\177@\2\u0108\u0109\5y=\2\u0109\u010a\5\u0081"+
		"A\2\u010a\u010b\5y=\2\u010b\60\3\2\2\2\u010c\u010d\7]\2\2\u010d\62\3\2"+
		"\2\2\u010e\u010f\7_\2\2\u010f\64\3\2\2\2\u0110\u0111\5[.\2\u0111\u0112"+
		"\5i\65\2\u0112\u0113\5w<\2\u0113\u0114\5[.\2\u0114\66\3\2\2\2\u0115\u0116"+
		"\5y=\2\u0116\u0117\5a\61\2\u0117\u0118\5[.\2\u0118\u0119\5m\67\2\u0119"+
		"8\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\7$\2\2\u011c\u0121\3\2\2\2\u011d"+
		"\u0120\n\2\2\2\u011e\u0120\5M\'\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7$\2\2\u0125\u0126\7$\2"+
		"\2\u0126:\3\2\2\2\u0127\u0129\5I%\2\u0128\u0127\3\2\2\2\u0129\u012a\3"+
		"\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b<\3\2\2\2\u012c\u0130"+
		"\t\3\2\2\u012d\u012f\t\4\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131>\3\2\2\2\u0132\u0130\3\2\2\2"+
		"\u0133\u0135\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\b \2\2\u0139"+
		"@\3\2\2\2\u013a\u013b\7\61\2\2\u013b\u013c\7,\2\2\u013c\u0141\3\2\2\2"+
		"\u013d\u0140\5A!\2\u013e\u0140\13\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7,\2\2\u0145\u0146\7\61"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b!\3\2\u0148B\3\2\2\2\u0149\u014a"+
		"\7\61\2\2\u014a\u014b\7\61\2\2\u014b\u014f\3\2\2\2\u014c\u014e\n\6\2\2"+
		"\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\b\"\3\2\u0153"+
		"D\3\2\2\2\u0154\u0156\5I%\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\7\60"+
		"\2\2\u015a\u015c\5I%\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u016d\3\2\2\2\u015f\u0161\5I%\2\u0160"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\60\2\2\u0165\u016d\3\2\2\2\u0166"+
		"\u0168\7\60\2\2\u0167\u0169\5I%\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u0155\3\2\2\2\u016c\u0160\3\2\2\2\u016c\u0166\3\2\2\2\u016dF\3\2\2\2"+
		"\u016e\u016f\t\7\2\2\u016fH\3\2\2\2\u0170\u0171\t\b\2\2\u0171J\3\2\2\2"+
		"\u0172\u0174\t\3\2\2\u0173\u0172\3\2\2\2\u0174L\3\2\2\2\u0175\u0176\7"+
		"^\2\2\u0176\u018b\t\t\2\2\u0177\u017c\7^\2\2\u0178\u017a\t\n\2\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\t\13"+
		"\2\2\u017c\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u018b\t\13\2\2\u017f\u0181\7^\2\2\u0180\u0182\7w\2\2\u0181\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\5G$\2\u0186\u0187\5G$\2\u0187\u0188\5G$\2\u0188"+
		"\u0189\5G$\2\u0189\u018b\3\2\2\2\u018a\u0175\3\2\2\2\u018a\u0177\3\2\2"+
		"\2\u018a\u017f\3\2\2\2\u018bN\3\2\2\2\u018c\u018d\7w\2\2\u018d\u018e\5"+
		"Q)\2\u018e\u018f\5Q)\2\u018f\u0190\5Q)\2\u0190\u0191\5Q)\2\u0191P\3\2"+
		"\2\2\u0192\u0193\t\f\2\2\u0193R\3\2\2\2\u0194\u0195\t\r\2\2\u0195T\3\2"+
		"\2\2\u0196\u0197\t\16\2\2\u0197V\3\2\2\2\u0198\u0199\t\17\2\2\u0199X\3"+
		"\2\2\2\u019a\u019b\t\20\2\2\u019bZ\3\2\2\2\u019c\u019d\t\21\2\2\u019d"+
		"\\\3\2\2\2\u019e\u019f\t\22\2\2\u019f^\3\2\2\2\u01a0\u01a1\t\23\2\2\u01a1"+
		"`\3\2\2\2\u01a2\u01a3\t\24\2\2\u01a3b\3\2\2\2\u01a4\u01a5\t\25\2\2\u01a5"+
		"d\3\2\2\2\u01a6\u01a7\t\26\2\2\u01a7f\3\2\2\2\u01a8\u01a9\t\27\2\2\u01a9"+
		"h\3\2\2\2\u01aa\u01ab\t\30\2\2\u01abj\3\2\2\2\u01ac\u01ad\t\31\2\2\u01ad"+
		"l\3\2\2\2\u01ae\u01af\t\32\2\2\u01afn\3\2\2\2\u01b0\u01b1\t\33\2\2\u01b1"+
		"p\3\2\2\2\u01b2\u01b3\t\34\2\2\u01b3r\3\2\2\2\u01b4\u01b5\t\35\2\2\u01b5"+
		"t\3\2\2\2\u01b6\u01b7\t\36\2\2\u01b7v\3\2\2\2\u01b8\u01b9\t\37\2\2\u01b9"+
		"x\3\2\2\2\u01ba\u01bb\t \2\2\u01bbz\3\2\2\2\u01bc\u01bd\t!\2\2\u01bd|"+
		"\3\2\2\2\u01be\u01bf\t\"\2\2\u01bf~\3\2\2\2\u01c0\u01c1\t#\2\2\u01c1\u0080"+
		"\3\2\2\2\u01c2\u01c3\t$\2\2\u01c3\u0082\3\2\2\2\u01c4\u01c5\t%\2\2\u01c5"+
		"\u0084\3\2\2\2\u01c6\u01c7\t&\2\2\u01c7\u0086\3\2\2\2\25\2\u011f\u0121"+
		"\u012a\u0130\u0136\u013f\u0141\u014f\u0157\u015d\u0162\u016a\u016c\u0173"+
		"\u0179\u017c\u0183\u018a\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}