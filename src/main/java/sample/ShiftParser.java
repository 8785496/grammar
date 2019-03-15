package main.java.sample;
// Generated from Shift.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShiftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Booleanliteral=3, Identifer=4, Identifernodigit=5, Integerliteral=6, 
		Floatingliteral=7, Nonzerodigit=8, Digit=9, Stringliteral=10, Characterliteral=11, 
		Whitespace=12;
	public static final int
		RULE_statementseq = 0, RULE_statement = 1, RULE_shiftexpression = 2, RULE_expression = 3, 
		RULE_literal = 4, RULE_identifer = 5;
	public static final String[] ruleNames = {
		"statementseq", "statement", "shiftexpression", "expression", "literal", 
		"identifer"
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

	@Override
	public String getGrammarFileName() { return "Shift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(15);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(16);
					statement();
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				}
				break;
			case Booleanliteral:
			case Identifer:
			case Integerliteral:
			case Floatingliteral:
			case Stringliteral:
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				shiftexpression(0);
				setState(24);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ShiftexpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(29);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
					setState(31);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(32);
					match(T__1);
					setState(33);
					expression();
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public IdentiferContext identifer() {
			return getRuleContext(IdentiferContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Booleanliteral:
			case Integerliteral:
			case Floatingliteral:
			case Stringliteral:
			case Characterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				literal();
				}
				break;
			case Identifer:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				identifer();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(ShiftParser.Integerliteral, 0); }
		public TerminalNode Booleanliteral() { return getToken(ShiftParser.Booleanliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(ShiftParser.Stringliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(ShiftParser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(ShiftParser.Floatingliteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Booleanliteral) | (1L << Integerliteral) | (1L << Floatingliteral) | (1L << Stringliteral) | (1L << Characterliteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class IdentiferContext extends ParserRuleContext {
		public TerminalNode Identifer() { return getToken(ShiftParser.Identifer, 0); }
		public IdentiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).enterIdentifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftListener ) ((ShiftListener)listener).exitIdentifer(this);
		}
	}

	public final IdentiferContext identifer() throws RecognitionException {
		IdentiferContext _localctx = new IdentiferContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(Identifer);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 2:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\7\2\24\n\2\f"+
		"\2\16\2\27\13\2\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"%\n\4\f\4\16\4(\13\4\3\5\3\5\5\5,\n\5\3\6\3\6\3\7\3\7\3\7\2\4\2\6\b\2"+
		"\4\6\b\n\f\2\3\5\2\5\5\b\t\f\r\2/\2\16\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2"+
		"\2\b+\3\2\2\2\n-\3\2\2\2\f/\3\2\2\2\16\17\b\2\1\2\17\20\5\4\3\2\20\25"+
		"\3\2\2\2\21\22\f\3\2\2\22\24\5\4\3\2\23\21\3\2\2\2\24\27\3\2\2\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3\2\2\2\30\35\7\3\2\2\31\32"+
		"\5\6\4\2\32\33\7\3\2\2\33\35\3\2\2\2\34\30\3\2\2\2\34\31\3\2\2\2\35\5"+
		"\3\2\2\2\36\37\b\4\1\2\37 \5\b\5\2 &\3\2\2\2!\"\f\3\2\2\"#\7\4\2\2#%\5"+
		"\b\5\2$!\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(&\3\2\2\2"+
		"),\5\n\6\2*,\5\f\7\2+)\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-.\t\2\2\2.\13\3\2"+
		"\2\2/\60\7\6\2\2\60\r\3\2\2\2\6\25\34&+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}