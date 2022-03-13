// Generated from /Users/seci/code/orch_local/rd-indexer/_/rd_indexer/rd_indexer/parse/rdlevel.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rdlevelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRING", "ESC", "UNICODE", "HEX", "SAFECODEPOINT", "NUMBER", "INT", 
			"EXP", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"NUMBER", "WS"
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


	public rdlevelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rdlevel.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\7\13H\n\13\f\13\16\13K\13\13\3\13\3\13\3\f\3\f\3\f\5\fR\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\5\20_\n\20\3\20\3\20\3"+
		"\20\6\20d\n\20\r\20\16\20e\5\20h\n\20\3\20\5\20k\n\20\3\21\3\21\3\21\7"+
		"\21p\n\21\f\21\16\21s\13\21\5\21u\n\21\3\22\3\22\5\22y\n\22\3\22\3\22"+
		"\3\23\6\23~\n\23\r\23\16\23\177\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\r!\2#\2%\16\3\2\n\n\2"+
		"$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$^^\3\2\62;\3\2\63;\4\2GGgg\4"+
		"\2--//\5\2\13\f\17\17\"\"\2\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\37\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+"+
		"\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\218\3\2\2\2"+
		"\23>\3\2\2\2\25C\3\2\2\2\27N\3\2\2\2\31S\3\2\2\2\33Y\3\2\2\2\35[\3\2\2"+
		"\2\37^\3\2\2\2!t\3\2\2\2#v\3\2\2\2%}\3\2\2\2\'(\7}\2\2(\4\3\2\2\2)*\7"+
		".\2\2*\6\3\2\2\2+,\7\177\2\2,\b\3\2\2\2-.\7<\2\2.\n\3\2\2\2/\60\7]\2\2"+
		"\60\f\3\2\2\2\61\62\7_\2\2\62\16\3\2\2\2\63\64\7v\2\2\64\65\7t\2\2\65"+
		"\66\7w\2\2\66\67\7g\2\2\67\20\3\2\2\289\7h\2\29:\7c\2\2:;\7n\2\2;<\7u"+
		"\2\2<=\7g\2\2=\22\3\2\2\2>?\7p\2\2?@\7w\2\2@A\7n\2\2AB\7n\2\2B\24\3\2"+
		"\2\2CI\7$\2\2DH\5\27\f\2EH\5\35\17\2FH\5%\23\2GD\3\2\2\2GE\3\2\2\2GF\3"+
		"\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7$\2\2M\26"+
		"\3\2\2\2NQ\7^\2\2OR\t\2\2\2PR\5\31\r\2QO\3\2\2\2QP\3\2\2\2R\30\3\2\2\2"+
		"ST\7w\2\2TU\5\33\16\2UV\5\33\16\2VW\5\33\16\2WX\5\33\16\2X\32\3\2\2\2"+
		"YZ\t\3\2\2Z\34\3\2\2\2[\\\n\4\2\2\\\36\3\2\2\2]_\7/\2\2^]\3\2\2\2^_\3"+
		"\2\2\2_`\3\2\2\2`g\5!\21\2ac\7\60\2\2bd\t\5\2\2cb\3\2\2\2de\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5#\22\2j"+
		"i\3\2\2\2jk\3\2\2\2k \3\2\2\2lu\7\62\2\2mq\t\6\2\2np\t\5\2\2on\3\2\2\2"+
		"ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tm\3\2\2\2"+
		"u\"\3\2\2\2vx\t\7\2\2wy\t\b\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\5!\21"+
		"\2{$\3\2\2\2|~\t\t\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\23\2\2\u0082&\3\2\2\2\16\2GI"+
		"Q^egjqtx\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}