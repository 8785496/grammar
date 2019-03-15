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
		Integerliteral=7, Floatingliteral=8, Nonzerodigit=9, Digit=10, Stringliteral=11, 
		Characterliteral=12, Whitespace=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "Booleanliteral", "Identifer", "Identifernodigit", 
		"Integerliteral", "Floatingliteral", "Nonzerodigit", "Digit", "Stringliteral", 
		"Characterliteral", "Whitespace"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'cout'", "'<<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "Booleanliteral", "Identifer", "Identifernodigit", 
		"Integerliteral", "Floatingliteral", "Nonzerodigit", "Digit", "Stringliteral", 
		"Characterliteral", "Whitespace"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\7\6\66\n\6"+
		"\f\6\16\69\13\6\3\7\3\7\3\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13\b\5\bE\n\b\3"+
		"\t\7\tH\n\t\f\t\16\tK\13\t\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\6\16"+
		"f\n\16\r\16\16\16g\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\b\5\2C\\aac|\3\2\63;\3\2\62;\6\2\f\f"+
		"\17\17$$^^\6\2\f\f\17\17))^^\5\2\13\f\17\17\"\"\2s\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7$\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r"+
		":\3\2\2\2\17D\3\2\2\2\21I\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2"+
		"\31`\3\2\2\2\33e\3\2\2\2\35\36\7=\2\2\36\4\3\2\2\2\37 \7e\2\2 !\7q\2\2"+
		"!\"\7w\2\2\"#\7v\2\2#\6\3\2\2\2$%\7>\2\2%&\7>\2\2&\b\3\2\2\2\'(\7v\2\2"+
		"()\7t\2\2)*\7w\2\2*\61\7g\2\2+,\7h\2\2,-\7c\2\2-.\7n\2\2./\7u\2\2/\61"+
		"\7g\2\2\60\'\3\2\2\2\60+\3\2\2\2\61\n\3\2\2\2\62\67\5\r\7\2\63\66\5\r"+
		"\7\2\64\66\5\25\13\2\65\63\3\2\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\f\3\2\2\29\67\3\2\2\2:;\t\2\2\2;\16\3\2\2\2<E\5\25\13"+
		"\2=A\5\23\n\2>@\5\25\13\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3"+
		"\2\2\2CA\3\2\2\2D<\3\2\2\2D=\3\2\2\2E\20\3\2\2\2FH\5\25\13\2GF\3\2\2\2"+
		"HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LP\7\60\2\2MO\5\25\13"+
		"\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\22\3\2\2\2RP\3\2\2\2ST\t\3"+
		"\2\2T\24\3\2\2\2UV\t\4\2\2V\26\3\2\2\2W[\7$\2\2XZ\n\5\2\2YX\3\2\2\2Z]"+
		"\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7$\2\2_\30\3\2\2"+
		"\2`a\7)\2\2ab\n\6\2\2bc\7)\2\2c\32\3\2\2\2df\t\7\2\2ed\3\2\2\2fg\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\16\2\2j\34\3\2\2\2\f\2\60\65\67A"+
		"DIP[g\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}