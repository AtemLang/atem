// Generated from d:\Repos\atem\grammar\AtemLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Whitespace=1, Newline=2, LineComment=3, BlockComment=4, InnerLineDocComment=5, 
		InnerBlockComment=6, OuterLineDocComment=7, OuterBlockComment=8, BlockCommentOrDoc=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Whitespace", "Newline", "LineComment", "BlockComment", "InnerLineDocComment", 
			"InnerBlockComment", "OuterLineDocComment", "OuterBlockComment", "BlockCommentOrDoc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Whitespace", "Newline", "LineComment", "BlockComment", "InnerLineDocComment", 
			"InnerBlockComment", "OuterLineDocComment", "OuterBlockComment", "BlockCommentOrDoc"
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


	public AtemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AtemLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u009b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\59\n\5\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6T\n\6\f"+
		"\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16\7e\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bt\n\b\f\b\16"+
		"\bw\13\b\5\by\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n"+
		"\t\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\5\n\u0098\n\n\3\n\3\n\5>c\u008a\2\13\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\3\2\7\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\2##,,"+
		"\3\2,,\3\2\61\61\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\26"+
		"\3\2\2\2\5!\3\2\2\2\7%\3\2\2\2\tJ\3\2\2\2\13N\3\2\2\2\rZ\3\2\2\2\17l\3"+
		"\2\2\2\21|\3\2\2\2\23\u0097\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\b\2\2\2\33\4"+
		"\3\2\2\2\34\36\7\17\2\2\35\37\7\f\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37\""+
		"\3\2\2\2 \"\7\f\2\2!\34\3\2\2\2! \3\2\2\2\"#\3\2\2\2#$\b\3\2\2$\6\3\2"+
		"\2\2%&\7\61\2\2&\'\7\61\2\2\'+\3\2\2\2(*\n\3\2\2)(\3\2\2\2*-\3\2\2\2+"+
		")\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\b\4\2\2/\b\3\2\2\2\60\61\7\61"+
		"\2\2\61\62\7\61\2\2\62\63\7}\2\2\638\3\2\2\2\649\n\4\2\2\65\66\7,\2\2"+
		"\669\7,\2\2\679\5\23\n\28\64\3\2\2\28\65\3\2\2\28\67\3\2\2\29>\3\2\2\2"+
		":=\5\23\n\2;=\n\5\2\2<:\3\2\2\2<;\3\2\2\2=@\3\2\2\2>?\3\2\2\2><\3\2\2"+
		"\2?A\3\2\2\2@>\3\2\2\2AB\7\177\2\2BC\7\61\2\2CK\7\61\2\2DE\7\61\2\2EF"+
		"\7\61\2\2FG\7}\2\2GH\7\177\2\2HI\7\61\2\2IK\7\61\2\2J\60\3\2\2\2JD\3\2"+
		"\2\2KL\3\2\2\2LM\b\5\2\2M\n\3\2\2\2NO\7\61\2\2OP\7\61\2\2PQ\7#\2\2QU\3"+
		"\2\2\2RT\n\3\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3"+
		"\2\2\2XY\b\6\2\2Y\f\3\2\2\2Z[\7\61\2\2[\\\7\61\2\2\\]\7#\2\2]^\7}\2\2"+
		"^c\3\2\2\2_b\5\23\n\2`b\n\5\2\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2"+
		"\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\177\2\2gh\7\61\2\2hi\7\61\2\2ij\3"+
		"\2\2\2jk\b\7\2\2k\16\3\2\2\2lm\7\61\2\2mn\7\61\2\2no\7\61\2\2op\7#\2\2"+
		"px\3\2\2\2qu\n\6\2\2rt\n\3\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2xq\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\b\2\2{\20\3\2\2"+
		"\2|}\7\61\2\2}~\7\61\2\2~\177\7\61\2\2\177\u0080\7#\2\2\u0080\u0081\7"+
		"}\2\2\u0081\u0084\3\2\2\2\u0082\u0085\n\5\2\2\u0083\u0085\5\23\n\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u008a\3\2\2\2\u0086\u0089\5\23"+
		"\n\2\u0087\u0089\n\5\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7\177\2\2\u008e\u008f\7\61\2\2\u008f"+
		"\u0090\7\61\2\2\u0090\u0091\7\61\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b"+
		"\t\2\2\u0093\22\3\2\2\2\u0094\u0098\5\t\5\2\u0095\u0098\5\13\6\2\u0096"+
		"\u0098\5\21\t\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\n\2\2\u009a\24\3\2\2\2\24\2\30"+
		"\36!+8<>JUacux\u0084\u0088\u008a\u0097\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}