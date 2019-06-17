// Generated from Shift.g4 by ANTLR 4.7.1
package main.java.sample;
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
		T__0=1, T__1=2, T__2=3, Booleanliteral=4, Identifer=5, Identifernodigit=6, 
		Integerliteral=7, Floatingliteral=8, Nonzerodigit=9, Digit=10, Character=11, 
		Stringliteral=12, Characterliteral=13, Whitespace=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Booleanliteral", "Identifer", "Identifernodigit", 
		"Integerliteral", "Floatingliteral", "Nonzerodigit", "Digit", "Character", 
		"Stringliteral", "Characterliteral", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'cout'", "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Booleanliteral", "Identifer", "Identifernodigit", 
		"Integerliteral", "Floatingliteral", "Nonzerodigit", "Digit", "Character", 
		"Stringliteral", "Characterliteral", "Whitespace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6\3\6"+
		"\7\68\n\6\f\6\16\6;\13\6\3\7\3\7\3\b\3\b\3\b\7\bB\n\b\f\b\16\bE\13\b\5"+
		"\bG\n\b\3\t\7\tJ\n\t\f\t\16\tM\13\t\3\t\3\t\7\tQ\n\t\f\t\16\tT\13\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r`\n\r\f\r\16\rc\13\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\6\17l\n\17\r\17\16\17m\3\17\3\17\2\2\20\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3"+
		"\2\7\5\2C\\aac|\3\2\63;\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2{\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7&\3\2\2\2\t\62"+
		"\3\2\2\2\13\64\3\2\2\2\r<\3\2\2\2\17F\3\2\2\2\21K\3\2\2\2\23U\3\2\2\2"+
		"\25W\3\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33f\3\2\2\2\35k\3\2\2\2\37 \7=\2"+
		"\2 \4\3\2\2\2!\"\7e\2\2\"#\7q\2\2#$\7w\2\2$%\7v\2\2%\6\3\2\2\2&\'\7>\2"+
		"\2\'(\7>\2\2(\b\3\2\2\2)*\7v\2\2*+\7t\2\2+,\7w\2\2,\63\7g\2\2-.\7h\2\2"+
		"./\7c\2\2/\60\7n\2\2\60\61\7u\2\2\61\63\7g\2\2\62)\3\2\2\2\62-\3\2\2\2"+
		"\63\n\3\2\2\2\649\5\r\7\2\658\5\r\7\2\668\5\25\13\2\67\65\3\2\2\2\67\66"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\f\3\2\2\2;9\3\2\2\2<=\t\2\2"+
		"\2=\16\3\2\2\2>G\5\25\13\2?C\5\23\n\2@B\5\25\13\2A@\3\2\2\2BE\3\2\2\2"+
		"CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2F?\3\2\2\2G\20\3\2\2"+
		"\2HJ\5\25\13\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2"+
		"\2\2NR\7\60\2\2OQ\5\25\13\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\22"+
		"\3\2\2\2TR\3\2\2\2UV\t\3\2\2V\24\3\2\2\2WX\t\4\2\2X\26\3\2\2\2YZ\t\5\2"+
		"\2Z\30\3\2\2\2[a\7$\2\2\\`\5\27\f\2]`\5\25\13\2^`\5\35\17\2_\\\3\2\2\2"+
		"_]\3\2\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2"+
		"de\7$\2\2e\32\3\2\2\2fg\7)\2\2gh\5\27\f\2hi\7)\2\2i\34\3\2\2\2jl\t\6\2"+
		"\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\b\17\2\2p\36\3"+
		"\2\2\2\r\2\62\679CFKR_am\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}