package main.java.sample;
// Generated from Shift.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShiftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Booleanliteral=3, Identifer=4, Identifernodigit=5, Integerliteral=6, 
		Floatingliteral=7, Nonzerodigit=8, Digit=9, Stringliteral=10, Characterliteral=11, 
		Whitespace=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Booleanliteral", "Identifer", "Identifernodigit", "Integerliteral", 
		"Floatingliteral", "Nonzerodigit", "Digit", "Stringliteral", "Characterliteral", 
		"Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Booleanliteral", "Identifer", "Identifernodigit", "Integerliteral", 
		"Floatingliteral", "Nonzerodigit", "Digit", "Stringliteral", "Characterliteral", 
		"Whitespace"
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


	public ShiftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Shift.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4*\n\4\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6\3\6\3\7\3\7"+
		"\3\7\7\79\n\7\f\7\16\7<\13\7\5\7>\n\7\3\b\7\bA\n\b\f\b\16\bD\13\b\3\b"+
		"\3\b\7\bH\n\b\f\b\16\bK\13\b\3\t\3\t\3\n\3\n\3\13\3\13\7\13S\n\13\f\13"+
		"\16\13V\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\6\r_\n\r\r\r\16\r`\3\r\3\r"+
		"\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\b"+
		"\5\2C\\aac|\3\2\63;\3\2\62;\6\2\f\f\17\17$$^^\6\2\f\f\17\17))^^\5\2\13"+
		"\f\17\17\"\"\2l\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7)\3\2\2\2\t+\3\2"+
		"\2\2\13\63\3\2\2\2\r=\3\2\2\2\17B\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P"+
		"\3\2\2\2\27Y\3\2\2\2\31^\3\2\2\2\33\34\7=\2\2\34\4\3\2\2\2\35\36\7>\2"+
		"\2\36\37\7>\2\2\37\6\3\2\2\2 !\7v\2\2!\"\7t\2\2\"#\7w\2\2#*\7g\2\2$%\7"+
		"h\2\2%&\7c\2\2&\'\7n\2\2\'(\7u\2\2(*\7g\2\2) \3\2\2\2)$\3\2\2\2*\b\3\2"+
		"\2\2+\60\5\13\6\2,/\5\13\6\2-/\5\23\n\2.,\3\2\2\2.-\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\n\3\2\2\2\62\60\3\2\2\2\63\64\t\2\2\2"+
		"\64\f\3\2\2\2\65>\5\23\n\2\66:\5\21\t\2\679\5\23\n\28\67\3\2\2\29<\3\2"+
		"\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=\65\3\2\2\2=\66\3\2\2\2>"+
		"\16\3\2\2\2?A\5\23\n\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2"+
		"\2DB\3\2\2\2EI\7\60\2\2FH\5\23\n\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\20\3\2\2\2KI\3\2\2\2LM\t\3\2\2M\22\3\2\2\2NO\t\4\2\2O\24\3\2\2\2"+
		"PT\7$\2\2QS\n\5\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2"+
		"VT\3\2\2\2WX\7$\2\2X\26\3\2\2\2YZ\7)\2\2Z[\n\6\2\2[\\\7)\2\2\\\30\3\2"+
		"\2\2]_\t\7\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\r"+
		"\2\2c\32\3\2\2\2\f\2).\60:=BIT`\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}