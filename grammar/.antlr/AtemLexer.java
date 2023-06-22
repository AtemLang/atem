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
		KeywordAbstract=1, KeywordAnd=2, KeywordAny=3, KeywordAs=4, KeywordAsm=5, 
		KeywordAsync=6, KeywordAt=7, KeywordAwait=8, KeywordBreak=9, KeywordCase=10, 
		KeywordCatch=11, KeywordClass=12, KeywordComptime=13, KeywordConcept=14, 
		KeywordConst=15, KeywordContinue=16, KeywordDefault=17, KeywordDefer=18, 
		KeywordDeinit=19, KeywordDelete=20, KeywordDo=21, KeywordDyn=22, KeywordEnum=23, 
		KeywordExtend=24, KeywordExtern=25, KeywordFalse=26, KeywordFilePrivate=27, 
		KeywordFinal=28, KeywordFor=29, KeywordFunc=30, KeywordGet=31, KeywordImpl=32, 
		KeywordImport=33, KeywordIn=34, KeywordInit=35, KeywordInternal=36, KeywordIs=37, 
		KeywordLazy=38, KeywordModule=39, KeywordMutable=40, KeywordNamespace=41, 
		KeywordNew=42, KeywordNot=43, KeywordNull=44, KeywordOpen=45, KeywordOr=46, 
		KeywordOuter=47, KeywordOverride=48, KeywordPackage=49, KeywordPrivate=50, 
		KeywordProject=51, KeywordPublic=52, KeywordRequire=53, KeywordReturn=54, 
		KeywordSelf=55, KeywordSet=56, KeywordSome=57, KeywordStatic=58, KeywordStruct=59, 
		KeywordSuper=60, KeywordThis=61, KeywordThrow=62, KeywordThrows=63, KeywordTrue=64, 
		KeywordTry=65, KeywordType=66, KeywordUndefined=67, KeywordUnion=68, KeywordUsing=69, 
		KeywordVirtual=70, KeywordWhile=71, Whitespace=72, Newline=73, LineComment=74, 
		InnerLineDocComment=75, OuterLineDocComment=76, BlockComment=77, InnerBlockComment=78, 
		OuterBlockComment=79, BlockCommentOrDoc=80;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KeywordAbstract", "KeywordAnd", "KeywordAny", "KeywordAs", "KeywordAsm", 
			"KeywordAsync", "KeywordAt", "KeywordAwait", "KeywordBreak", "KeywordCase", 
			"KeywordCatch", "KeywordClass", "KeywordComptime", "KeywordConcept", 
			"KeywordConst", "KeywordContinue", "KeywordDefault", "KeywordDefer", 
			"KeywordDeinit", "KeywordDelete", "KeywordDo", "KeywordDyn", "KeywordEnum", 
			"KeywordExtend", "KeywordExtern", "KeywordFalse", "KeywordFilePrivate", 
			"KeywordFinal", "KeywordFor", "KeywordFunc", "KeywordGet", "KeywordImpl", 
			"KeywordImport", "KeywordIn", "KeywordInit", "KeywordInternal", "KeywordIs", 
			"KeywordLazy", "KeywordModule", "KeywordMutable", "KeywordNamespace", 
			"KeywordNew", "KeywordNot", "KeywordNull", "KeywordOpen", "KeywordOr", 
			"KeywordOuter", "KeywordOverride", "KeywordPackage", "KeywordPrivate", 
			"KeywordProject", "KeywordPublic", "KeywordRequire", "KeywordReturn", 
			"KeywordSelf", "KeywordSet", "KeywordSome", "KeywordStatic", "KeywordStruct", 
			"KeywordSuper", "KeywordThis", "KeywordThrow", "KeywordThrows", "KeywordTrue", 
			"KeywordTry", "KeywordType", "KeywordUndefined", "KeywordUnion", "KeywordUsing", 
			"KeywordVirtual", "KeywordWhile", "Whitespace", "Newline", "LineComment", 
			"InnerLineDocComment", "OuterLineDocComment", "BlockComment", "InnerBlockComment", 
			"OuterBlockComment", "BlockCommentOrDoc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'and'", "'any'", "'as'", "'asm'", "'async'", "'at'", 
			"'await'", "'break'", "'case'", "'catch'", "'class'", "'comptime'", "'concept'", 
			"'const'", "'continue'", "'default'", "'defer'", "'deinit'", "'delete'", 
			"'do'", "'dyn'", "'enum'", "'extend'", "'extern'", "'false'", "'filePrivate'", 
			"'final'", "'for'", "'func'", "'get'", "'impl'", "'import'", "'in'", 
			"'init'", "'internal'", "'is'", "'lazy'", "'module'", "'mutable'", "'namespace'", 
			"'new'", "'not'", "'null'", "'open'", "'or'", "'outer'", "'override'", 
			"'package'", "'private'", "'project'", "'public'", "'require'", "'return'", 
			"'self'", "'set'", "'some'", "'static'", "'stuct'", "'super'", "'this'", 
			"'throw'", "'throws'", "'true'", "'try'", "'type'", "'undefined'", "'union'", 
			"'using'", "'virtual'", "'while'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KeywordAbstract", "KeywordAnd", "KeywordAny", "KeywordAs", "KeywordAsm", 
			"KeywordAsync", "KeywordAt", "KeywordAwait", "KeywordBreak", "KeywordCase", 
			"KeywordCatch", "KeywordClass", "KeywordComptime", "KeywordConcept", 
			"KeywordConst", "KeywordContinue", "KeywordDefault", "KeywordDefer", 
			"KeywordDeinit", "KeywordDelete", "KeywordDo", "KeywordDyn", "KeywordEnum", 
			"KeywordExtend", "KeywordExtern", "KeywordFalse", "KeywordFilePrivate", 
			"KeywordFinal", "KeywordFor", "KeywordFunc", "KeywordGet", "KeywordImpl", 
			"KeywordImport", "KeywordIn", "KeywordInit", "KeywordInternal", "KeywordIs", 
			"KeywordLazy", "KeywordModule", "KeywordMutable", "KeywordNamespace", 
			"KeywordNew", "KeywordNot", "KeywordNull", "KeywordOpen", "KeywordOr", 
			"KeywordOuter", "KeywordOverride", "KeywordPackage", "KeywordPrivate", 
			"KeywordProject", "KeywordPublic", "KeywordRequire", "KeywordReturn", 
			"KeywordSelf", "KeywordSet", "KeywordSome", "KeywordStatic", "KeywordStruct", 
			"KeywordSuper", "KeywordThis", "KeywordThrow", "KeywordThrows", "KeywordTrue", 
			"KeywordTry", "KeywordType", "KeywordUndefined", "KeywordUnion", "KeywordUsing", 
			"KeywordVirtual", "KeywordWhile", "Whitespace", "Newline", "LineComment", 
			"InnerLineDocComment", "OuterLineDocComment", "BlockComment", "InnerBlockComment", 
			"OuterBlockComment", "BlockCommentOrDoc"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u02e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\6I\u0253\nI\rI\16I\u0254\3"+
		"I\3I\3J\3J\5J\u025b\nJ\3J\5J\u025e\nJ\3J\3J\3K\3K\3K\3K\3K\3K\5K\u0268"+
		"\nK\3K\7K\u026b\nK\fK\16K\u026e\13K\3K\3K\5K\u0272\nK\3K\3K\3L\3L\3L\3"+
		"L\3L\7L\u027b\nL\fL\16L\u027e\13L\3L\3L\3M\3M\3M\3M\3M\3M\3M\7M\u0289"+
		"\nM\fM\16M\u028c\13M\5M\u028e\nM\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\5N\u029a"+
		"\nN\3N\3N\7N\u029e\nN\fN\16N\u02a1\13N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u02ac"+
		"\nN\3N\3N\3O\3O\3O\3O\3O\3O\3O\7O\u02b7\nO\fO\16O\u02ba\13O\3O\3O\3O\3"+
		"O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\5P\u02ca\nP\3P\3P\7P\u02ce\nP\fP\16P\u02d1"+
		"\13P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\5Q\u02dd\nQ\3Q\3Q\5\u029f\u02b8\u02cf"+
		"\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\3\2\b\5\2\13\f\16\17\"\"\4\2##\61\61\4\2\f\f\17\17\3\2\61\61\4\2##,"+
		",\3\2,,\2\u02f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2\2\5\u00ac\3\2\2\2\7\u00b0"+
		"\3\2\2\2\t\u00b4\3\2\2\2\13\u00b7\3\2\2\2\r\u00bb\3\2\2\2\17\u00c1\3\2"+
		"\2\2\21\u00c4\3\2\2\2\23\u00ca\3\2\2\2\25\u00d0\3\2\2\2\27\u00d5\3\2\2"+
		"\2\31\u00db\3\2\2\2\33\u00e1\3\2\2\2\35\u00ea\3\2\2\2\37\u00f2\3\2\2\2"+
		"!\u00f8\3\2\2\2#\u0101\3\2\2\2%\u0109\3\2\2\2\'\u010f\3\2\2\2)\u0116\3"+
		"\2\2\2+\u011d\3\2\2\2-\u0120\3\2\2\2/\u0124\3\2\2\2\61\u0129\3\2\2\2\63"+
		"\u0130\3\2\2\2\65\u0137\3\2\2\2\67\u013d\3\2\2\29\u0149\3\2\2\2;\u014f"+
		"\3\2\2\2=\u0153\3\2\2\2?\u0158\3\2\2\2A\u015c\3\2\2\2C\u0161\3\2\2\2E"+
		"\u0168\3\2\2\2G\u016b\3\2\2\2I\u0170\3\2\2\2K\u0179\3\2\2\2M\u017c\3\2"+
		"\2\2O\u0181\3\2\2\2Q\u0188\3\2\2\2S\u0190\3\2\2\2U\u019a\3\2\2\2W\u019e"+
		"\3\2\2\2Y\u01a2\3\2\2\2[\u01a7\3\2\2\2]\u01ac\3\2\2\2_\u01af\3\2\2\2a"+
		"\u01b5\3\2\2\2c\u01be\3\2\2\2e\u01c6\3\2\2\2g\u01ce\3\2\2\2i\u01d6\3\2"+
		"\2\2k\u01dd\3\2\2\2m\u01e5\3\2\2\2o\u01ec\3\2\2\2q\u01f1\3\2\2\2s\u01f5"+
		"\3\2\2\2u\u01fa\3\2\2\2w\u0201\3\2\2\2y\u0207\3\2\2\2{\u020d\3\2\2\2}"+
		"\u0212\3\2\2\2\177\u0218\3\2\2\2\u0081\u021f\3\2\2\2\u0083\u0224\3\2\2"+
		"\2\u0085\u0228\3\2\2\2\u0087\u022d\3\2\2\2\u0089\u0237\3\2\2\2\u008b\u023d"+
		"\3\2\2\2\u008d\u0243\3\2\2\2\u008f\u024b\3\2\2\2\u0091\u0252\3\2\2\2\u0093"+
		"\u025d\3\2\2\2\u0095\u0271\3\2\2\2\u0097\u0275\3\2\2\2\u0099\u0281\3\2"+
		"\2\2\u009b\u02ab\3\2\2\2\u009d\u02af\3\2\2\2\u009f\u02c1\3\2\2\2\u00a1"+
		"\u02dc\3\2\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7u\2"+
		"\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa"+
		"\7e\2\2\u00aa\u00ab\7v\2\2\u00ab\4\3\2\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae"+
		"\7p\2\2\u00ae\u00af\7f\2\2\u00af\6\3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2"+
		"\7p\2\2\u00b2\u00b3\7{\2\2\u00b3\b\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba"+
		"\7o\2\2\u00ba\f\3\2\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be"+
		"\7{\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0\7e\2\2\u00c0\16\3\2\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7v\2\2\u00c3\20\3\2\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6"+
		"\7y\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\22\3\2\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7c\2\2\u00ce\u00cf\7m\2\2\u00cf\24\3\2\2\2\u00d0\u00d1\7e\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4\26\3\2\2\2\u00d5"+
		"\u00d6\7e\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7e\2\2"+
		"\u00d9\u00da\7j\2\2\u00da\30\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7"+
		"n\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7u\2\2\u00e0\32"+
		"\3\2\2\2\u00e1\u00e2\7e\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7o\2\2\u00e4"+
		"\u00e5\7r\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7o\2\2"+
		"\u00e8\u00e9\7g\2\2\u00e9\34\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7"+
		"q\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7e\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0"+
		"\7r\2\2\u00f0\u00f1\7v\2\2\u00f1\36\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4"+
		"\7q\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		" \3\2\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7v\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7w\2\2"+
		"\u00ff\u0100\7g\2\2\u0100\"\3\2\2\2\u0101\u0102\7f\2\2\u0102\u0103\7g"+
		"\2\2\u0103\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7w\2\2\u0106\u0107"+
		"\7n\2\2\u0107\u0108\7v\2\2\u0108$\3\2\2\2\u0109\u010a\7f\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7h\2\2\u010c\u010d\7g\2\2\u010d\u010e\7t\2\2\u010e"+
		"&\3\2\2\2\u010f\u0110\7f\2\2\u0110\u0111\7g\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7k\2\2\u0114\u0115\7v\2\2\u0115(\3\2\2\2\u0116"+
		"\u0117\7f\2\2\u0117\u0118\7g\2\2\u0118\u0119\7n\2\2\u0119\u011a\7g\2\2"+
		"\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2\u011c*\3\2\2\2\u011d\u011e\7f\2"+
		"\2\u011e\u011f\7q\2\2\u011f,\3\2\2\2\u0120\u0121\7f\2\2\u0121\u0122\7"+
		"{\2\2\u0122\u0123\7p\2\2\u0123.\3\2\2\2\u0124\u0125\7g\2\2\u0125\u0126"+
		"\7p\2\2\u0126\u0127\7w\2\2\u0127\u0128\7o\2\2\u0128\60\3\2\2\2\u0129\u012a"+
		"\7g\2\2\u012a\u012b\7z\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2\u012d"+
		"\u012e\7p\2\2\u012e\u012f\7f\2\2\u012f\62\3\2\2\2\u0130\u0131\7g\2\2\u0131"+
		"\u0132\7z\2\2\u0132\u0133\7v\2\2\u0133\u0134\7g\2\2\u0134\u0135\7t\2\2"+
		"\u0135\u0136\7p\2\2\u0136\64\3\2\2\2\u0137\u0138\7h\2\2\u0138\u0139\7"+
		"c\2\2\u0139\u013a\7n\2\2\u013a\u013b\7u\2\2\u013b\u013c\7g\2\2\u013c\66"+
		"\3\2\2\2\u013d\u013e\7h\2\2\u013e\u013f\7k\2\2\u013f\u0140\7n\2\2\u0140"+
		"\u0141\7g\2\2\u0141\u0142\7R\2\2\u0142\u0143\7t\2\2\u0143\u0144\7k\2\2"+
		"\u0144\u0145\7x\2\2\u0145\u0146\7c\2\2\u0146\u0147\7v\2\2\u0147\u0148"+
		"\7g\2\2\u01488\3\2\2\2\u0149\u014a\7h\2\2\u014a\u014b\7k\2\2\u014b\u014c"+
		"\7p\2\2\u014c\u014d\7c\2\2\u014d\u014e\7n\2\2\u014e:\3\2\2\2\u014f\u0150"+
		"\7h\2\2\u0150\u0151\7q\2\2\u0151\u0152\7t\2\2\u0152<\3\2\2\2\u0153\u0154"+
		"\7h\2\2\u0154\u0155\7w\2\2\u0155\u0156\7p\2\2\u0156\u0157\7e\2\2\u0157"+
		">\3\2\2\2\u0158\u0159\7i\2\2\u0159\u015a\7g\2\2\u015a\u015b\7v\2\2\u015b"+
		"@\3\2\2\2\u015c\u015d\7k\2\2\u015d\u015e\7o\2\2\u015e\u015f\7r\2\2\u015f"+
		"\u0160\7n\2\2\u0160B\3\2\2\2\u0161\u0162\7k\2\2\u0162\u0163\7o\2\2\u0163"+
		"\u0164\7r\2\2\u0164\u0165\7q\2\2\u0165\u0166\7t\2\2\u0166\u0167\7v\2\2"+
		"\u0167D\3\2\2\2\u0168\u0169\7k\2\2\u0169\u016a\7p\2\2\u016aF\3\2\2\2\u016b"+
		"\u016c\7k\2\2\u016c\u016d\7p\2\2\u016d\u016e\7k\2\2\u016e\u016f\7v\2\2"+
		"\u016fH\3\2\2\2\u0170\u0171\7k\2\2\u0171\u0172\7p\2\2\u0172\u0173\7v\2"+
		"\2\u0173\u0174\7g\2\2\u0174\u0175\7t\2\2\u0175\u0176\7p\2\2\u0176\u0177"+
		"\7c\2\2\u0177\u0178\7n\2\2\u0178J\3\2\2\2\u0179\u017a\7k\2\2\u017a\u017b"+
		"\7u\2\2\u017bL\3\2\2\2\u017c\u017d\7n\2\2\u017d\u017e\7c\2\2\u017e\u017f"+
		"\7|\2\2\u017f\u0180\7{\2\2\u0180N\3\2\2\2\u0181\u0182\7o\2\2\u0182\u0183"+
		"\7q\2\2\u0183\u0184\7f\2\2\u0184\u0185\7w\2\2\u0185\u0186\7n\2\2\u0186"+
		"\u0187\7g\2\2\u0187P\3\2\2\2\u0188\u0189\7o\2\2\u0189\u018a\7w\2\2\u018a"+
		"\u018b\7v\2\2\u018b\u018c\7c\2\2\u018c\u018d\7d\2\2\u018d\u018e\7n\2\2"+
		"\u018e\u018f\7g\2\2\u018fR\3\2\2\2\u0190\u0191\7p\2\2\u0191\u0192\7c\2"+
		"\2\u0192\u0193\7o\2\2\u0193\u0194\7g\2\2\u0194\u0195\7u\2\2\u0195\u0196"+
		"\7r\2\2\u0196\u0197\7c\2\2\u0197\u0198\7e\2\2\u0198\u0199\7g\2\2\u0199"+
		"T\3\2\2\2\u019a\u019b\7p\2\2\u019b\u019c\7g\2\2\u019c\u019d\7y\2\2\u019d"+
		"V\3\2\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7v\2\2\u01a1"+
		"X\3\2\2\2\u01a2\u01a3\7p\2\2\u01a3\u01a4\7w\2\2\u01a4\u01a5\7n\2\2\u01a5"+
		"\u01a6\7n\2\2\u01a6Z\3\2\2\2\u01a7\u01a8\7q\2\2\u01a8\u01a9\7r\2\2\u01a9"+
		"\u01aa\7g\2\2\u01aa\u01ab\7p\2\2\u01ab\\\3\2\2\2\u01ac\u01ad\7q\2\2\u01ad"+
		"\u01ae\7t\2\2\u01ae^\3\2\2\2\u01af\u01b0\7q\2\2\u01b0\u01b1\7w\2\2\u01b1"+
		"\u01b2\7v\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7t\2\2\u01b4`\3\2\2\2\u01b5"+
		"\u01b6\7q\2\2\u01b6\u01b7\7x\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7t\2\2"+
		"\u01b9\u01ba\7t\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7f\2\2\u01bc\u01bd"+
		"\7g\2\2\u01bdb\3\2\2\2\u01be\u01bf\7r\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1"+
		"\7e\2\2\u01c1\u01c2\7m\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7i\2\2\u01c4"+
		"\u01c5\7g\2\2\u01c5d\3\2\2\2\u01c6\u01c7\7r\2\2\u01c7\u01c8\7t\2\2\u01c8"+
		"\u01c9\7k\2\2\u01c9\u01ca\7x\2\2\u01ca\u01cb\7c\2\2\u01cb\u01cc\7v\2\2"+
		"\u01cc\u01cd\7g\2\2\u01cdf\3\2\2\2\u01ce\u01cf\7r\2\2\u01cf\u01d0\7t\2"+
		"\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7l\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4"+
		"\7e\2\2\u01d4\u01d5\7v\2\2\u01d5h\3\2\2\2\u01d6\u01d7\7r\2\2\u01d7\u01d8"+
		"\7w\2\2\u01d8\u01d9\7d\2\2\u01d9\u01da\7n\2\2\u01da\u01db\7k\2\2\u01db"+
		"\u01dc\7e\2\2\u01dcj\3\2\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7g\2\2\u01df"+
		"\u01e0\7s\2\2\u01e0\u01e1\7w\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3\7t\2\2"+
		"\u01e3\u01e4\7g\2\2\u01e4l\3\2\2\2\u01e5\u01e6\7t\2\2\u01e6\u01e7\7g\2"+
		"\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7w\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb"+
		"\7p\2\2\u01ebn\3\2\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7g\2\2\u01ee\u01ef"+
		"\7n\2\2\u01ef\u01f0\7h\2\2\u01f0p\3\2\2\2\u01f1\u01f2\7u\2\2\u01f2\u01f3"+
		"\7g\2\2\u01f3\u01f4\7v\2\2\u01f4r\3\2\2\2\u01f5\u01f6\7u\2\2\u01f6\u01f7"+
		"\7q\2\2\u01f7\u01f8\7o\2\2\u01f8\u01f9\7g\2\2\u01f9t\3\2\2\2\u01fa\u01fb"+
		"\7u\2\2\u01fb\u01fc\7v\2\2\u01fc\u01fd\7c\2\2\u01fd\u01fe\7v\2\2\u01fe"+
		"\u01ff\7k\2\2\u01ff\u0200\7e\2\2\u0200v\3\2\2\2\u0201\u0202\7u\2\2\u0202"+
		"\u0203\7v\2\2\u0203\u0204\7w\2\2\u0204\u0205\7e\2\2\u0205\u0206\7v\2\2"+
		"\u0206x\3\2\2\2\u0207\u0208\7u\2\2\u0208\u0209\7w\2\2\u0209\u020a\7r\2"+
		"\2\u020a\u020b\7g\2\2\u020b\u020c\7t\2\2\u020cz\3\2\2\2\u020d\u020e\7"+
		"v\2\2\u020e\u020f\7j\2\2\u020f\u0210\7k\2\2\u0210\u0211\7u\2\2\u0211|"+
		"\3\2\2\2\u0212\u0213\7v\2\2\u0213\u0214\7j\2\2\u0214\u0215\7t\2\2\u0215"+
		"\u0216\7q\2\2\u0216\u0217\7y\2\2\u0217~\3\2\2\2\u0218\u0219\7v\2\2\u0219"+
		"\u021a\7j\2\2\u021a\u021b\7t\2\2\u021b\u021c\7q\2\2\u021c\u021d\7y\2\2"+
		"\u021d\u021e\7u\2\2\u021e\u0080\3\2\2\2\u021f\u0220\7v\2\2\u0220\u0221"+
		"\7t\2\2\u0221\u0222\7w\2\2\u0222\u0223\7g\2\2\u0223\u0082\3\2\2\2\u0224"+
		"\u0225\7v\2\2\u0225\u0226\7t\2\2\u0226\u0227\7{\2\2\u0227\u0084\3\2\2"+
		"\2\u0228\u0229\7v\2\2\u0229\u022a\7{\2\2\u022a\u022b\7r\2\2\u022b\u022c"+
		"\7g\2\2\u022c\u0086\3\2\2\2\u022d\u022e\7w\2\2\u022e\u022f\7p\2\2\u022f"+
		"\u0230\7f\2\2\u0230\u0231\7g\2\2\u0231\u0232\7h\2\2\u0232\u0233\7k\2\2"+
		"\u0233\u0234\7p\2\2\u0234\u0235\7g\2\2\u0235\u0236\7f\2\2\u0236\u0088"+
		"\3\2\2\2\u0237\u0238\7w\2\2\u0238\u0239\7p\2\2\u0239\u023a\7k\2\2\u023a"+
		"\u023b\7q\2\2\u023b\u023c\7p\2\2\u023c\u008a\3\2\2\2\u023d\u023e\7w\2"+
		"\2\u023e\u023f\7u\2\2\u023f\u0240\7k\2\2\u0240\u0241\7p\2\2\u0241\u0242"+
		"\7i\2\2\u0242\u008c\3\2\2\2\u0243\u0244\7x\2\2\u0244\u0245\7k\2\2\u0245"+
		"\u0246\7t\2\2\u0246\u0247\7v\2\2\u0247\u0248\7w\2\2\u0248\u0249\7c\2\2"+
		"\u0249\u024a\7n\2\2\u024a\u008e\3\2\2\2\u024b\u024c\7y\2\2\u024c\u024d"+
		"\7j\2\2\u024d\u024e\7k\2\2\u024e\u024f\7n\2\2\u024f\u0250\7g\2\2\u0250"+
		"\u0090\3\2\2\2\u0251\u0253\t\2\2\2\u0252\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0257\bI\2\2\u0257\u0092\3\2\2\2\u0258\u025a\7\17\2\2\u0259\u025b\7\f"+
		"\2\2\u025a\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u025e\3\2\2\2\u025c"+
		"\u025e\7\f\2\2\u025d\u0258\3\2\2\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\bJ\2\2\u0260\u0094\3\2\2\2\u0261\u0262\7\61\2\2\u0262"+
		"\u0263\7\61\2\2\u0263\u0267\3\2\2\2\u0264\u0268\n\3\2\2\u0265\u0266\7"+
		"\61\2\2\u0266\u0268\7\61\2\2\u0267\u0264\3\2\2\2\u0267\u0265\3\2\2\2\u0268"+
		"\u026c\3\2\2\2\u0269\u026b\n\4\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2"+
		"\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u0272\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0270\7\61\2\2\u0270\u0272\7\61\2\2\u0271\u0261\3"+
		"\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\bK\2\2\u0274"+
		"\u0096\3\2\2\2\u0275\u0276\7\61\2\2\u0276\u0277\7\61\2\2\u0277\u0278\7"+
		"#\2\2\u0278\u027c\3\2\2\2\u0279\u027b\n\4\2\2\u027a\u0279\3\2\2\2\u027b"+
		"\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2"+
		"\2\2\u027e\u027c\3\2\2\2\u027f\u0280\bL\2\2\u0280\u0098\3\2\2\2\u0281"+
		"\u0282\7\61\2\2\u0282\u0283\7\61\2\2\u0283\u0284\7\61\2\2\u0284\u0285"+
		"\7#\2\2\u0285\u028d\3\2\2\2\u0286\u028a\n\5\2\2\u0287\u0289\n\4\2\2\u0288"+
		"\u0287\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2"+
		"\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028d\u0286\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\bM\2\2\u0290\u009a\3\2"+
		"\2\2\u0291\u0292\7\61\2\2\u0292\u0293\7\61\2\2\u0293\u0294\7}\2\2\u0294"+
		"\u0299\3\2\2\2\u0295\u029a\n\6\2\2\u0296\u0297\7,\2\2\u0297\u029a\7,\2"+
		"\2\u0298\u029a\5\u00a1Q\2\u0299\u0295\3\2\2\2\u0299\u0296\3\2\2\2\u0299"+
		"\u0298\3\2\2\2\u029a\u029f\3\2\2\2\u029b\u029e\5\u00a1Q\2\u029c\u029e"+
		"\n\7\2\2\u029d\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a2\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a2\u02a3\7\177\2\2\u02a3\u02a4\7\61\2\2\u02a4\u02ac\7\61\2\2\u02a5"+
		"\u02a6\7\61\2\2\u02a6\u02a7\7\61\2\2\u02a7\u02a8\7}\2\2\u02a8\u02a9\7"+
		"\177\2\2\u02a9\u02aa\7\61\2\2\u02aa\u02ac\7\61\2\2\u02ab\u0291\3\2\2\2"+
		"\u02ab\u02a5\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\bN\2\2\u02ae\u009c"+
		"\3\2\2\2\u02af\u02b0\7\61\2\2\u02b0\u02b1\7\61\2\2\u02b1\u02b2\7#\2\2"+
		"\u02b2\u02b3\7}\2\2\u02b3\u02b8\3\2\2\2\u02b4\u02b7\5\u00a1Q\2\u02b5\u02b7"+
		"\n\7\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2"+
		"\2\2\u02bb\u02bc\7\177\2\2\u02bc\u02bd\7\61\2\2\u02bd\u02be\7\61\2\2\u02be"+
		"\u02bf\3\2\2\2\u02bf\u02c0\bO\2\2\u02c0\u009e\3\2\2\2\u02c1\u02c2\7\61"+
		"\2\2\u02c2\u02c3\7\61\2\2\u02c3\u02c4\7\61\2\2\u02c4\u02c5\7#\2\2\u02c5"+
		"\u02c6\7}\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02ca\n\7\2\2\u02c8\u02ca\5\u00a1"+
		"Q\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cf\3\2\2\2\u02cb"+
		"\u02ce\5\u00a1Q\2\u02cc\u02ce\n\7\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02cc"+
		"\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d2\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d3\7\177\2\2\u02d3\u02d4\7"+
		"\61\2\2\u02d4\u02d5\7\61\2\2\u02d5\u02d6\7\61\2\2\u02d6\u02d7\3\2\2\2"+
		"\u02d7\u02d8\bP\2\2\u02d8\u00a0\3\2\2\2\u02d9\u02dd\5\u009bN\2\u02da\u02dd"+
		"\5\u009dO\2\u02db\u02dd\5\u009fP\2\u02dc\u02d9\3\2\2\2\u02dc\u02da\3\2"+
		"\2\2\u02dc\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\bQ\2\2\u02df"+
		"\u00a2\3\2\2\2\26\2\u0254\u025a\u025d\u0267\u026c\u0271\u027c\u028a\u028d"+
		"\u0299\u029d\u029f\u02ab\u02b6\u02b8\u02c9\u02cd\u02cf\u02dc\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}