// Generated from /Users/keegan/IdeaProjects/Compiler/Little.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LittleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		INTLITERAL=32, FLOATLITERAL=33, STRINGLITERAL=34, KEYWORD=35, IDENTIFIER=36, 
		OPERATOR=37, WHITESPACE=38, COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "UPPER", "LOWER", 
		"DIGIT", "LETTER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "KEYWORD", 
		"IDENTIFIER", "OPERATOR", "WHITESPACE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "';'", "'FLOAT'", 
		"'INT'", "'VOID'", "','", "'FUNCTION'", "'('", "')'", "'READ'", "'WRITE'", 
		"'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", "'<'", 
		"'>'", "'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INTLITERAL", "FLOATLITERAL", 
		"STRINGLITERAL", "KEYWORD", "IDENTIFIER", "OPERATOR", "WHITESPACE", "COMMENT"
	};
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


	public LittleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Little.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\5$\u00e4\n$\3%\6%\u00e7"+
		"\n%\r%\16%\u00e8\3&\5&\u00ec\n&\3&\3&\6&\u00f0\n&\r&\16&\u00f1\3\'\3\'"+
		"\7\'\u00f6\n\'\f\'\16\'\u00f9\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0155\n(\3)\3)\3)\7)\u015a\n)\f)\16"+
		")\u015d\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0169\n*\3+\6+\u016c\n+\r"+
		"+\16+\u016d\3+\3+\3,\3,\3,\3,\7,\u0176\n,\f,\16,\u0179\13,\3,\3,\2\2-"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\2C\2E\2G\2I\"K#M$O%Q&S\'U(W)\3\2\n\3\2C\\\3\2c|\3\2\62;\5\2\f\f"+
		"\17\17$$\6\2,-//\61\61??\6\2*+..=>@@\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\2\u0197\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5a"+
		"\3\2\2\2\7g\3\2\2\2\tk\3\2\2\2\13r\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21}"+
		"\3\2\2\2\23\u0081\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3\2\2\2\31\u0091\3"+
		"\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3\2\2\2!\u00a0\3\2\2"+
		"\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ab\3\2\2\2)\u00ad\3\2\2\2+\u00af"+
		"\3\2\2\2-\u00b2\3\2\2\2/\u00b8\3\2\2\2\61\u00bd\3\2\2\2\63\u00bf\3\2\2"+
		"\2\65\u00c1\3\2\2\2\67\u00c3\3\2\2\29\u00c6\3\2\2\2;\u00c9\3\2\2\2=\u00cc"+
		"\3\2\2\2?\u00d2\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G"+
		"\u00e3\3\2\2\2I\u00e6\3\2\2\2K\u00eb\3\2\2\2M\u00f3\3\2\2\2O\u0154\3\2"+
		"\2\2Q\u0156\3\2\2\2S\u0168\3\2\2\2U\u016b\3\2\2\2W\u0171\3\2\2\2YZ\7R"+
		"\2\2Z[\7T\2\2[\\\7Q\2\2\\]\7I\2\2]^\7T\2\2^_\7C\2\2_`\7O\2\2`\4\3\2\2"+
		"\2ab\7D\2\2bc\7G\2\2cd\7I\2\2de\7K\2\2ef\7P\2\2f\6\3\2\2\2gh\7G\2\2hi"+
		"\7P\2\2ij\7F\2\2j\b\3\2\2\2kl\7U\2\2lm\7V\2\2mn\7T\2\2no\7K\2\2op\7P\2"+
		"\2pq\7I\2\2q\n\3\2\2\2rs\7<\2\2st\7?\2\2t\f\3\2\2\2uv\7=\2\2v\16\3\2\2"+
		"\2wx\7H\2\2xy\7N\2\2yz\7Q\2\2z{\7C\2\2{|\7V\2\2|\20\3\2\2\2}~\7K\2\2~"+
		"\177\7P\2\2\177\u0080\7V\2\2\u0080\22\3\2\2\2\u0081\u0082\7X\2\2\u0082"+
		"\u0083\7Q\2\2\u0083\u0084\7K\2\2\u0084\u0085\7F\2\2\u0085\24\3\2\2\2\u0086"+
		"\u0087\7.\2\2\u0087\26\3\2\2\2\u0088\u0089\7H\2\2\u0089\u008a\7W\2\2\u008a"+
		"\u008b\7P\2\2\u008b\u008c\7E\2\2\u008c\u008d\7V\2\2\u008d\u008e\7K\2\2"+
		"\u008e\u008f\7Q\2\2\u008f\u0090\7P\2\2\u0090\30\3\2\2\2\u0091\u0092\7"+
		"*\2\2\u0092\32\3\2\2\2\u0093\u0094\7+\2\2\u0094\34\3\2\2\2\u0095\u0096"+
		"\7T\2\2\u0096\u0097\7G\2\2\u0097\u0098\7C\2\2\u0098\u0099\7F\2\2\u0099"+
		"\36\3\2\2\2\u009a\u009b\7Y\2\2\u009b\u009c\7T\2\2\u009c\u009d\7K\2\2\u009d"+
		"\u009e\7V\2\2\u009e\u009f\7G\2\2\u009f \3\2\2\2\u00a0\u00a1\7T\2\2\u00a1"+
		"\u00a2\7G\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7W\2\2\u00a4\u00a5\7T\2\2"+
		"\u00a5\u00a6\7P\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8$\3\2\2\2"+
		"\u00a9\u00aa\7/\2\2\u00aa&\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac(\3\2\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae*\3\2\2\2\u00af\u00b0\7K\2\2\u00b0\u00b1\7H\2\2\u00b1"+
		",\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3\u00b4\7P\2\2\u00b4\u00b5\7F\2\2\u00b5"+
		"\u00b6\7K\2\2\u00b6\u00b7\7H\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7G\2\2\u00b9"+
		"\u00ba\7N\2\2\u00ba\u00bb\7U\2\2\u00bb\u00bc\7G\2\2\u00bc\60\3\2\2\2\u00bd"+
		"\u00be\7>\2\2\u00be\62\3\2\2\2\u00bf\u00c0\7@\2\2\u00c0\64\3\2\2\2\u00c1"+
		"\u00c2\7?\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c5\7?\2\2\u00c5"+
		"8\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8\7?\2\2\u00c8:\3\2\2\2\u00c9\u00ca"+
		"\7@\2\2\u00ca\u00cb\7?\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7Y\2\2\u00cd\u00ce"+
		"\7J\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7N\2\2\u00d0\u00d1\7G\2\2\u00d1"+
		">\3\2\2\2\u00d2\u00d3\7G\2\2\u00d3\u00d4\7P\2\2\u00d4\u00d5\7F\2\2\u00d5"+
		"\u00d6\7Y\2\2\u00d6\u00d7\7J\2\2\u00d7\u00d8\7K\2\2\u00d8\u00d9\7N\2\2"+
		"\u00d9\u00da\7G\2\2\u00da@\3\2\2\2\u00db\u00dc\t\2\2\2\u00dcB\3\2\2\2"+
		"\u00dd\u00de\t\3\2\2\u00deD\3\2\2\2\u00df\u00e0\t\4\2\2\u00e0F\3\2\2\2"+
		"\u00e1\u00e4\5A!\2\u00e2\u00e4\5C\"\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4H\3\2\2\2\u00e5\u00e7\5E#\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9J\3\2\2\2\u00ea"+
		"\u00ec\5E#\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2"+
		"\2\u00ed\u00ef\7\60\2\2\u00ee\u00f0\5E#\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2L\3\2\2\2\u00f3"+
		"\u00f7\7$\2\2\u00f4\u00f6\n\5\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fb\7$\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7R\2\2\u00fd"+
		"\u00fe\7T\2\2\u00fe\u00ff\7Q\2\2\u00ff\u0100\7I\2\2\u0100\u0101\7T\2\2"+
		"\u0101\u0102\7C\2\2\u0102\u0155\7O\2\2\u0103\u0104\7D\2\2\u0104\u0105"+
		"\7G\2\2\u0105\u0106\7I\2\2\u0106\u0107\7K\2\2\u0107\u0155\7P\2\2\u0108"+
		"\u0109\7G\2\2\u0109\u010a\7P\2\2\u010a\u0155\7F\2\2\u010b\u010c\7H\2\2"+
		"\u010c\u010d\7W\2\2\u010d\u010e\7P\2\2\u010e\u010f\7E\2\2\u010f\u0110"+
		"\7V\2\2\u0110\u0111\7K\2\2\u0111\u0112\7Q\2\2\u0112\u0155\7P\2\2\u0113"+
		"\u0114\7T\2\2\u0114\u0115\7G\2\2\u0115\u0116\7C\2\2\u0116\u0155\7F\2\2"+
		"\u0117\u0118\7Y\2\2\u0118\u0119\7T\2\2\u0119\u011a\7K\2\2\u011a\u011b"+
		"\7V\2\2\u011b\u0155\7G\2\2\u011c\u011d\7K\2\2\u011d\u0155\7H\2\2\u011e"+
		"\u011f\7G\2\2\u011f\u0120\7N\2\2\u0120\u0121\7U\2\2\u0121\u0155\7G\2\2"+
		"\u0122\u0123\7H\2\2\u0123\u0155\7K\2\2\u0124\u0125\7H\2\2\u0125\u0126"+
		"\7Q\2\2\u0126\u0155\7T\2\2\u0127\u0128\7T\2\2\u0128\u0129\7Q\2\2\u0129"+
		"\u0155\7H\2\2\u012a\u012b\7T\2\2\u012b\u012c\7G\2\2\u012c\u012d\7V\2\2"+
		"\u012d\u012e\7W\2\2\u012e\u012f\7T\2\2\u012f\u0155\7P\2\2\u0130\u0131"+
		"\7K\2\2\u0131\u0132\7P\2\2\u0132\u0155\7V\2\2\u0133\u0134\7X\2\2\u0134"+
		"\u0135\7Q\2\2\u0135\u0136\7K\2\2\u0136\u0155\7F\2\2\u0137\u0138\7U\2\2"+
		"\u0138\u0139\7V\2\2\u0139\u013a\7T\2\2\u013a\u013b\7K\2\2\u013b\u013c"+
		"\7P\2\2\u013c\u0155\7I\2\2\u013d\u013e\7H\2\2\u013e\u013f\7N\2\2\u013f"+
		"\u0140\7Q\2\2\u0140\u0141\7C\2\2\u0141\u0155\7V\2\2\u0142\u0143\7Y\2\2"+
		"\u0143\u0144\7J\2\2\u0144\u0145\7K\2\2\u0145\u0146\7N\2\2\u0146\u0155"+
		"\7G\2\2\u0147\u0148\7G\2\2\u0148\u0149\7P\2\2\u0149\u014a\7F\2\2\u014a"+
		"\u014b\7K\2\2\u014b\u0155\7H\2\2\u014c\u014d\7G\2\2\u014d\u014e\7P\2\2"+
		"\u014e\u014f\7F\2\2\u014f\u0150\7Y\2\2\u0150\u0151\7J\2\2\u0151\u0152"+
		"\7K\2\2\u0152\u0153\7N\2\2\u0153\u0155\7G\2\2\u0154\u00fc\3\2\2\2\u0154"+
		"\u0103\3\2\2\2\u0154\u0108\3\2\2\2\u0154\u010b\3\2\2\2\u0154\u0113\3\2"+
		"\2\2\u0154\u0117\3\2\2\2\u0154\u011c\3\2\2\2\u0154\u011e\3\2\2\2\u0154"+
		"\u0122\3\2\2\2\u0154\u0124\3\2\2\2\u0154\u0127\3\2\2\2\u0154\u012a\3\2"+
		"\2\2\u0154\u0130\3\2\2\2\u0154\u0133\3\2\2\2\u0154\u0137\3\2\2\2\u0154"+
		"\u013d\3\2\2\2\u0154\u0142\3\2\2\2\u0154\u0147\3\2\2\2\u0154\u014c\3\2"+
		"\2\2\u0155P\3\2\2\2\u0156\u015b\5G$\2\u0157\u015a\5G$\2\u0158\u015a\5"+
		"E#\2\u0159\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cR\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015e\u015f\7<\2\2\u015f\u0169\7?\2\2\u0160\u0169\t\6\2\2\u0161\u0162"+
		"\7#\2\2\u0162\u0169\7?\2\2\u0163\u0169\t\7\2\2\u0164\u0165\7>\2\2\u0165"+
		"\u0169\7?\2\2\u0166\u0167\7@\2\2\u0167\u0169\7?\2\2\u0168\u015e\3\2\2"+
		"\2\u0168\u0160\3\2\2\2\u0168\u0161\3\2\2\2\u0168\u0163\3\2\2\2\u0168\u0164"+
		"\3\2\2\2\u0168\u0166\3\2\2\2\u0169T\3\2\2\2\u016a\u016c\t\b\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b+\2\2\u0170V\3\2\2\2\u0171\u0172"+
		"\7/\2\2\u0172\u0173\7/\2\2\u0173\u0177\3\2\2\2\u0174\u0176\n\t\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\b,\2\2\u017b"+
		"X\3\2\2\2\16\2\u00e3\u00e8\u00eb\u00f1\u00f7\u0154\u0159\u015b\u0168\u016d"+
		"\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}