// Generated from /Users/michaelnekrasov/Documents/workspace_ee/Interpreter/src/main/java/com/interpreter/parsers/Expr.g4 by ANTLR 4.2

  package com.interpreter.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, INT=16, WS=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'LOOP'", "'do'", "'.'", "'DUP'", "'+'", "'*'", "'-'", "'if'", 
		"'<'", "' '", "'>'", "'SWAP'", "'then'", "'/'", "'else'", "INT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_numbers = 1, RULE_operators = 2, RULE_loop = 3, RULE_loopExpr = 4, 
		RULE_ifElse = 5, RULE_ifExpr = 6, RULE_elseExpr = 7;
	public static final String[] ruleNames = {
		"prog", "numbers", "operators", "loop", "loopExpr", "ifElse", "ifExpr", 
		"elseExpr"
	};

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<OperatorsContext> operators() {
			return getRuleContexts(OperatorsContext.class);
		}
		public List<TerminalNode> WS() { return getTokens(ExprParser.WS); }
		public List<IfElseContext> ifElse() {
			return getRuleContexts(IfElseContext.class);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public OperatorsContext operators(int i) {
			return getRuleContext(OperatorsContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(ExprParser.WS, i);
		}
		public IfElseContext ifElse(int i) {
			return getRuleContext(IfElseContext.class,i);
		}
		public NumbersContext numbers(int i) {
			return getRuleContext(NumbersContext.class,i);
		}
		public List<NumbersContext> numbers() {
			return getRuleContexts(NumbersContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 12) | (1L << 14) | (1L << INT) | (1L << WS))) != 0)) {
				{
				{
				setState(17);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(16); match(WS);
					}
				}

				setState(24);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(19); numbers();
					}
					break;

				case 2:
					{
					setState(20); operators();
					}
					break;

				case 3:
					{
					setState(21); loop();
					}
					break;

				case 4:
					{
					setState(22); ifElse();
					}
					break;

				case 5:
					{
					setState(23); match(10);
					}
					break;
				}
				setState(27);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(26); match(WS);
					}
					break;
				}
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class NumbersContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public NumbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitNumbers(this);
		}
	}

	public final NumbersContext numbers() throws RecognitionException {
		NumbersContext _localctx = new NumbersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numbers);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); match(7);
				setState(35); match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(5);
				setState(37); match(INT);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); match(INT);
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

	public static class OperatorsContext extends ParserRuleContext {
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 4) | (1L << 5) | (1L << 6) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 12) | (1L << 14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class LoopContext extends ParserRuleContext {
		public LoopExprContext loopExpr() {
			return getRuleContext(LoopExprContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(2);
			setState(44); loopExpr();
			setState(45); match(1);
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

	public static class LoopExprContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public LoopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterLoopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitLoopExpr(this);
		}
	}

	public final LoopExprContext loopExpr() throws RecognitionException {
		LoopExprContext _localctx = new LoopExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); prog();
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

	public static class IfElseContext extends ParserRuleContext {
		public ElseExprContext elseExpr() {
			return getRuleContext(ElseExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfElse(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(8);
			setState(50); ifExpr();
			setState(51); match(15);
			setState(52); elseExpr();
			setState(53); match(13);
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

	public static class IfExprContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitIfExpr(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); prog();
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

	public static class ElseExprContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public ElseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterElseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitElseExpr(this);
		}
	}

	public final ElseExprContext elseExpr() throws RecognitionException {
		ElseExprContext _localctx = new ElseExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); prog();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\5\2\24\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\33\n\2\3\2\5\2\36\n\2\7\2 \n\2\f\2\16\2#\13\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\6\2\5\t\13"+
		"\13\r\16\20\20>\2!\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\61\3\2\2"+
		"\2\f\63\3\2\2\2\169\3\2\2\2\20;\3\2\2\2\22\24\7\23\2\2\23\22\3\2\2\2\23"+
		"\24\3\2\2\2\24\32\3\2\2\2\25\33\5\4\3\2\26\33\5\6\4\2\27\33\5\b\5\2\30"+
		"\33\5\f\7\2\31\33\7\f\2\2\32\25\3\2\2\2\32\26\3\2\2\2\32\27\3\2\2\2\32"+
		"\30\3\2\2\2\32\31\3\2\2\2\33\35\3\2\2\2\34\36\7\23\2\2\35\34\3\2\2\2\35"+
		"\36\3\2\2\2\36 \3\2\2\2\37\23\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2"+
		"\"\3\3\2\2\2#!\3\2\2\2$%\7\t\2\2%*\7\22\2\2&\'\7\7\2\2\'*\7\22\2\2(*\7"+
		"\22\2\2)$\3\2\2\2)&\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\t\2\2\2,\7\3\2\2\2"+
		"-.\7\4\2\2./\5\n\6\2/\60\7\3\2\2\60\t\3\2\2\2\61\62\5\2\2\2\62\13\3\2"+
		"\2\2\63\64\7\n\2\2\64\65\5\16\b\2\65\66\7\21\2\2\66\67\5\20\t\2\678\7"+
		"\17\2\28\r\3\2\2\29:\5\2\2\2:\17\3\2\2\2;<\5\2\2\2<\21\3\2\2\2\7\23\32"+
		"\35!)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}