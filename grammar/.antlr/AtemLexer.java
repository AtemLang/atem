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
		Whitespace=1, Newline=2, LineComment=3, InnerLineDocComment=4, OuterLineDocComment=5, 
		BlockComment=6, InnerBlockComment=7, OuterBlockComment=8, BlockCommentOrDoc=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Whitespace", "Newline", "LineComment", "InnerLineDocComment", "OuterLineDocComment", 
			"BlockComment", "InnerBlockComment", "OuterBlockComment", "BlockCommentOrDoc"
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
			null, "Whitespace", "Newline", "LineComment", "InnerLineDocComment", 
			"OuterLineDocComment", "BlockComment", "InnerBlockComment", "OuterBlockComment", 
			"BlockCommentOrDoc"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\6\2\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3"+
		"\4\3\4\5\4\66\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\5\6R\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\7\3\7\7\7b\n\7\f\7"+
		"\16\7e\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\t\3\t\7\t\u0092\n\t\f"+
		"\t\16\t\u0095\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00a1\n"+
		"\n\3\n\3\n\5c|\u0093\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2"+
		"\b\5\2\13\f\16\17\"\"\4\2##\61\61\4\2\f\f\17\17\3\2\61\61\4\2##,,\3\2"+
		",,\2\u00b8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\26\3\2\2\2\5!"+
		"\3\2\2\2\7\65\3\2\2\2\t9\3\2\2\2\13E\3\2\2\2\ro\3\2\2\2\17s\3\2\2\2\21"+
		"\u0085\3\2\2\2\23\u00a0\3\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30\3\2"+
		"\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\32\33\b\2\2\2\33\4\3\2"+
		"\2\2\34\36\7\17\2\2\35\37\7\f\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37\"\3\2"+
		"\2\2 \"\7\f\2\2!\34\3\2\2\2! \3\2\2\2\"#\3\2\2\2#$\b\3\2\2$\6\3\2\2\2"+
		"%&\7\61\2\2&\'\7\61\2\2\'+\3\2\2\2(,\n\3\2\2)*\7\61\2\2*,\7\61\2\2+(\3"+
		"\2\2\2+)\3\2\2\2,\60\3\2\2\2-/\n\4\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2"+
		"\2\60\61\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2\63\64\7\61\2\2\64\66\7\61"+
		"\2\2\65%\3\2\2\2\65\63\3\2\2\2\66\67\3\2\2\2\678\b\4\2\28\b\3\2\2\29:"+
		"\7\61\2\2:;\7\61\2\2;<\7#\2\2<@\3\2\2\2=?\n\4\2\2>=\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\b\5\2\2D\n\3\2\2\2EF\7\61\2"+
		"\2FG\7\61\2\2GH\7\61\2\2HI\7#\2\2IQ\3\2\2\2JN\n\5\2\2KM\n\4\2\2LK\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QJ\3\2\2\2QR\3\2"+
		"\2\2RS\3\2\2\2ST\b\6\2\2T\f\3\2\2\2UV\7\61\2\2VW\7\61\2\2WX\7}\2\2X]\3"+
		"\2\2\2Y^\n\6\2\2Z[\7,\2\2[^\7,\2\2\\^\5\23\n\2]Y\3\2\2\2]Z\3\2\2\2]\\"+
		"\3\2\2\2^c\3\2\2\2_b\5\23\n\2`b\n\7\2\2a_\3\2\2\2a`\3\2\2\2be\3\2\2\2"+
		"cd\3\2\2\2ca\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\177\2\2gh\7\61\2\2hp\7\61"+
		"\2\2ij\7\61\2\2jk\7\61\2\2kl\7}\2\2lm\7\177\2\2mn\7\61\2\2np\7\61\2\2"+
		"oU\3\2\2\2oi\3\2\2\2pq\3\2\2\2qr\b\7\2\2r\16\3\2\2\2st\7\61\2\2tu\7\61"+
		"\2\2uv\7#\2\2vw\7}\2\2w|\3\2\2\2x{\5\23\n\2y{\n\7\2\2zx\3\2\2\2zy\3\2"+
		"\2\2{~\3\2\2\2|}\3\2\2\2|z\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7"+
		"\177\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7\61\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0084\b\b\2\2\u0084\20\3\2\2\2\u0085\u0086\7\61\2\2\u0086\u0087"+
		"\7\61\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7#\2\2\u0089\u008a\7}\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008e\n\7\2\2\u008c\u008e\5\23\n\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008c\3\2\2\2\u008e\u0093\3\2\2\2\u008f\u0092\5\23\n\2\u0090"+
		"\u0092\n\7\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7\177\2\2\u0097\u0098\7\61\2\2\u0098\u0099"+
		"\7\61\2\2\u0099\u009a\7\61\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\t\2\2"+
		"\u009c\22\3\2\2\2\u009d\u00a1\5\r\7\2\u009e\u00a1\5\17\b\2\u009f\u00a1"+
		"\5\21\t\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\n\2\2\u00a3\24\3\2\2\2\26\2\30\36!"+
		"+\60\65@NQ]acoz|\u008d\u0091\u0093\u00a0\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}