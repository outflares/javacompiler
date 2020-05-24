// Generated from D:/BSUIR/3 ����/6 �������/����/compiler examples/compiler-master/src/main/java/compiler/grammar\mylang.g4 by ANTLR 4.8

package compiler.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mylangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ASSIGN=2, INT_TYPE=3, FLOAT_TYPE=4, SEMICOLON=5, OPAR=6, CPAR=7, 
		OANGLEBR=8, EQOANGLEBR=9, CANGLEBR=10, EQCANGLEBR=11, OBRACKET=12, CBRACKET=13, 
		COLON=14, NEGATION=15, INCR=16, DECR=17, EQ=18, NEQ=19, IS=20, MOD=21, 
		MUL=22, DIV=23, ADD=24, SUB=25, IN=26, POW=27, PRINT=28, PRITTY_PRINT=29, 
		CONST=30, IF=31, ELSE=32, WHILE=33, FOREACH=34, FOR=35, CASE=36, DEFAULT=37, 
		MAIN=38, FUNCTION=39, RETURN=40, INT=41, FLOAT=42, ID=43, COMMENT=44, 
		SPACES=45;
	public static final int
		RULE_parse = 0, RULE_main = 1, RULE_start = 2, RULE_instruction = 3, RULE_expr = 4, 
		RULE_create = 5, RULE_create_int = 6, RULE_create_const_int = 7, RULE_create_float = 8, 
		RULE_create_const_float = 9, RULE_name_object_int = 10, RULE_name_object_float = 11, 
		RULE_if_stat = 12, RULE_condition_block = 13, RULE_stat_block = 14, RULE_while_stat = 15, 
		RULE_for_stat = 16, RULE_condition_for = 17, RULE_condition = 18, RULE_print = 19, 
		RULE_print_expr = 20, RULE_function_call = 21, RULE_param_call = 22, RULE_arg_call = 23, 
		RULE_function = 24, RULE_stat_block_with_return = 25, RULE_return_id = 26, 
		RULE_param = 27, RULE_arg = 28, RULE_type = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "main", "start", "instruction", "expr", "create", "create_int", 
			"create_const_int", "create_float", "create_const_float", "name_object_int", 
			"name_object_float", "if_stat", "condition_block", "stat_block", "while_stat", 
			"for_stat", "condition_for", "condition", "print", "print_expr", "function_call", 
			"param_call", "arg_call", "function", "stat_block_with_return", "return_id", 
			"param", "arg", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'='", "'integer'", "'float'", "';'", "'('", "')'", "'<'", 
			"'<='", "'>'", "'>='", "'{'", "'}'", "':'", "'!'", "'++'", "'--'", "'=='", 
			"'!='", "'is'", "'%'", "'*'", "'/'", "'+'", "'-'", "'in'", "'^'", "'print'", 
			"'<<'", "'const'", "'if'", "'else'", "'while'", "'forEach'", "'for'", 
			"'case'", "'default'", "'main'", "'fun'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ASSIGN", "INT_TYPE", "FLOAT_TYPE", "SEMICOLON", "OPAR", 
			"CPAR", "OANGLEBR", "EQOANGLEBR", "CANGLEBR", "EQCANGLEBR", "OBRACKET", 
			"CBRACKET", "COLON", "NEGATION", "INCR", "DECR", "EQ", "NEQ", "IS", "MOD", 
			"MUL", "DIV", "ADD", "SUB", "IN", "POW", "PRINT", "PRITTY_PRINT", "CONST", 
			"IF", "ELSE", "WHILE", "FOREACH", "FOR", "CASE", "DEFAULT", "MAIN", "FUNCTION", 
			"RETURN", "INT", "FLOAT", "ID", "COMMENT", "SPACES"
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

	@Override
	public String getGrammarFileName() { return "mylang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mylangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mylangParser.EOF, 0); }
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << CONST))) != 0)) {
				{
				{
				setState(60);
				create();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(66);
				function();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			main();
			setState(73);
			match(EOF);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(mylangParser.MAIN, 0); }
		public TerminalNode OBRACKET() { return getToken(mylangParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(mylangParser.CBRACKET, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(MAIN);
			setState(76);
			match(OBRACKET);
			setState(77);
			start();
			setState(78);
			match(CBRACKET);
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

	public static class StartContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << OPAR) | (1L << ADD) | (1L << SUB) | (1L << PRINT) | (1L << CONST) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				{
				setState(80);
				instruction();
				}
				}
				setState(85);
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

	public static class InstructionContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				create();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				for_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				function_call();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModMulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(mylangParser.MOD, 0); }
		public TerminalNode MUL() { return getToken(mylangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(mylangParser.DIV, 0); }
		public ModMulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterModMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitModMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitModMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatExprContext extends ExprContext {
		public Name_object_floatContext name_object_float() {
			return getRuleContext(Name_object_floatContext.class,0);
		}
		public FloatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public PrimContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(mylangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(mylangParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExrpContext extends ExprContext {
		public Name_object_intContext name_object_int() {
			return getRuleContext(Name_object_intContext.class,0);
		}
		public IntExrpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterIntExrp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitIntExrp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitIntExrp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConversionContext extends ExprContext {
		public Token tp;
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT_TYPE() { return getToken(mylangParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(mylangParser.FLOAT_TYPE, 0); }
		public TypeConversionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterTypeConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitTypeConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitTypeConversion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(mylangParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(mylangParser.SUB, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(mylangParser.POW, 0); }
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mylangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new TypeConversionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(OPAR);
				setState(97);
				((TypeConversionContext)_localctx).tp = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
					((TypeConversionContext)_localctx).tp = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(98);
				match(CPAR);
				setState(99);
				expr(10);
				}
				break;
			case 2:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(ID);
				setState(101);
				match(OPAR);
				setState(102);
				expr(0);
				setState(103);
				match(CPAR);
				}
				break;
			case 3:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				expr(7);
				}
				break;
			case 4:
				{
				_localctx = new PrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(OPAR);
				setState(108);
				expr(0);
				setState(109);
				match(CPAR);
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(ID);
				}
				break;
			case 6:
				{
				_localctx = new IntExrpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				name_object_int();
				}
				break;
			case 7:
				{
				_localctx = new FloatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				name_object_float();
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(ID);
				setState(115);
				match(ASSIGN);
				setState(116);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ModMulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(120);
						((ModMulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOD) | (1L << MUL) | (1L << DIV))) != 0)) ) {
							((ModMulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(121);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(123);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(126);
						match(POW);
						setState(127);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class CreateContext extends ParserRuleContext {
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext create_const_int() {
			return getRuleContext(Create_const_intContext.class,0);
		}
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext create_const_float() {
			return getRuleContext(Create_const_floatContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				create_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				create_const_int();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				create_float();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				create_const_float();
				}
				break;
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

	public static class Create_intContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(mylangParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mylangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCreate_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCreate_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCreate_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_intContext create_int() throws RecognitionException {
		Create_intContext _localctx = new Create_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(INT_TYPE);
			setState(140);
			match(ID);
			setState(141);
			match(ASSIGN);
			setState(142);
			expr(0);
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

	public static class Create_const_intContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(mylangParser.CONST, 0); }
		public Create_intContext create_int() {
			return getRuleContext(Create_intContext.class,0);
		}
		public Create_const_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCreate_const_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCreate_const_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCreate_const_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_intContext create_const_int() throws RecognitionException {
		Create_const_intContext _localctx = new Create_const_intContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_create_const_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(CONST);
			setState(145);
			create_int();
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

	public static class Create_floatContext extends ParserRuleContext {
		public TerminalNode FLOAT_TYPE() { return getToken(mylangParser.FLOAT_TYPE, 0); }
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(mylangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCreate_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCreate_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCreate_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_floatContext create_float() throws RecognitionException {
		Create_floatContext _localctx = new Create_floatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FLOAT_TYPE);
			setState(148);
			match(ID);
			setState(149);
			match(ASSIGN);
			setState(150);
			expr(0);
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

	public static class Create_const_floatContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(mylangParser.CONST, 0); }
		public Create_floatContext create_float() {
			return getRuleContext(Create_floatContext.class,0);
		}
		public Create_const_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_const_float; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCreate_const_float(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCreate_const_float(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCreate_const_float(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_const_floatContext create_const_float() throws RecognitionException {
		Create_const_floatContext _localctx = new Create_const_floatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_const_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(CONST);
			setState(153);
			create_float();
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

	public static class Name_object_intContext extends ParserRuleContext {
		public Name_object_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_int; }
	 
		public Name_object_intContext() { }
		public void copyFrom(Name_object_intContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectIntContext extends Name_object_intContext {
		public TerminalNode INT() { return getToken(mylangParser.INT, 0); }
		public NameObjectIntContext(Name_object_intContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterNameObjectInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitNameObjectInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitNameObjectInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_intContext name_object_int() throws RecognitionException {
		Name_object_intContext _localctx = new Name_object_intContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_name_object_int);
		try {
			_localctx = new NameObjectIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(INT);
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

	public static class Name_object_floatContext extends ParserRuleContext {
		public Name_object_floatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_object_float; }
	 
		public Name_object_floatContext() { }
		public void copyFrom(Name_object_floatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NameObjectFloatContext extends Name_object_floatContext {
		public TerminalNode FLOAT() { return getToken(mylangParser.FLOAT, 0); }
		public NameObjectFloatContext(Name_object_floatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterNameObjectFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitNameObjectFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitNameObjectFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_object_floatContext name_object_float() throws RecognitionException {
		Name_object_floatContext _localctx = new Name_object_floatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name_object_float);
		try {
			_localctx = new NameObjectFloatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(FLOAT);
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

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(mylangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(mylangParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(mylangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(mylangParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(IF);
			setState(160);
			condition_block();
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					match(ELSE);
					setState(162);
					match(IF);
					setState(163);
					condition_block();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(169);
				match(ELSE);
				setState(170);
				stat_block();
				}
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

	public static class Condition_blockContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(mylangParser.NEGATION, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCondition_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCondition_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(OPAR);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(174);
				match(NEGATION);
				}
			}

			setState(177);
			condition();
			setState(178);
			match(CPAR);
			setState(179);
			stat_block();
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(mylangParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(mylangParser.CBRACKET, 0); }
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stat_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(OBRACKET);
			setState(182);
			start();
			setState(183);
			match(CBRACKET);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(mylangParser.WHILE, 0); }
		public Condition_blockContext condition_block() {
			return getRuleContext(Condition_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}


	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(WHILE);
			setState(186);
			condition_block();
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

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(mylangParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public Condition_forContext condition_for() {
			return getRuleContext(Condition_forContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitFor_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(FOR);
			setState(189);
			match(OPAR);
			setState(190);
			condition_for();
			setState(191);
			match(CPAR);
			setState(192);
			stat_block();
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

	public static class Condition_forContext extends ParserRuleContext {
		public Condition_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_for; }
	 
		public Condition_forContext() { }
		public void copyFrom(Condition_forContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondContext extends Condition_forContext {
		public Token oper;
		public List<TerminalNode> ID() { return getTokens(mylangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mylangParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(mylangParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(mylangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(mylangParser.SEMICOLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode INCR() { return getToken(mylangParser.INCR, 0); }
		public TerminalNode DECR() { return getToken(mylangParser.DECR, 0); }
		public ForCondContext(Condition_forContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterForCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitForCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitForCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_forContext condition_for() throws RecognitionException {
		Condition_forContext _localctx = new Condition_forContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition_for);
		int _la;
		try {
			_localctx = new ForCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(ASSIGN);
			setState(196);
			expr(0);
			setState(197);
			match(SEMICOLON);
			setState(198);
			condition();
			setState(199);
			match(SEMICOLON);
			setState(200);
			match(ID);
			setState(201);
			((ForCondContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INCR || _la==DECR) ) {
				((ForCondContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CheckTypeContext extends ConditionContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public TerminalNode IS() { return getToken(mylangParser.IS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CheckTypeContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ConditionContext {
		public Token op;
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mylangParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(mylangParser.NEQ, 0); }
		public TerminalNode OANGLEBR() { return getToken(mylangParser.OANGLEBR, 0); }
		public TerminalNode CANGLEBR() { return getToken(mylangParser.CANGLEBR, 0); }
		public TerminalNode EQOANGLEBR() { return getToken(mylangParser.EQOANGLEBR, 0); }
		public TerminalNode EQCANGLEBR() { return getToken(mylangParser.EQCANGLEBR, 0); }
		public EqualityExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new EqualityExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				setState(204);
				((EqualityExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OANGLEBR) | (1L << EQOANGLEBR) | (1L << CANGLEBR) | (1L << EQCANGLEBR) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				expr(0);
				}
				break;
			case 2:
				_localctx = new CheckTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(ID);
				setState(207);
				match(IS);
				setState(208);
				type();
				}
				break;
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(mylangParser.PRINT, 0); }
		public Print_exprContext print_expr() {
			return getRuleContext(Print_exprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(PRINT);
			setState(212);
			print_expr();
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

	public static class Print_exprContext extends ParserRuleContext {
		public Print_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_expr; }
	 
		public Print_exprContext() { }
		public void copyFrom(Print_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintIdContext extends Print_exprContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public PrintIdContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPrintId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPrintId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPrintId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pretty_printContext extends Print_exprContext {
		public TerminalNode PRITTY_PRINT() { return getToken(mylangParser.PRITTY_PRINT, 0); }
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public Pretty_printContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPretty_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPretty_print(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPretty_print(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends Print_exprContext {
		public TerminalNode INT() { return getToken(mylangParser.INT, 0); }
		public PrintIntContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPrintInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPrintInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFloatContext extends Print_exprContext {
		public TerminalNode FLOAT() { return getToken(mylangParser.FLOAT, 0); }
		public PrintFloatContext(Print_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterPrintFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitPrintFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitPrintFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_exprContext print_expr() throws RecognitionException {
		Print_exprContext _localctx = new Print_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_expr);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new PrintIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				}
				break;
			case INT:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new PrintFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(FLOAT);
				}
				break;
			case PRITTY_PRINT:
				_localctx = new Pretty_printContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(PRITTY_PRINT);
				setState(218);
				match(ID);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
			setState(222);
			param_call();
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

	public static class Param_callContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(OPAR);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(225);
				arg_call();
				}
			}

			setState(228);
			match(CPAR);
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

	public static class Arg_callContext extends ParserRuleContext {
		public Arg_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_call; }
	 
		public Arg_callContext() { }
		public void copyFrom(Arg_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamCallArgsContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public Arg_callContext arg_call() {
			return getRuleContext(Arg_callContext.class,0);
		}
		public ParamCallArgsContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParamCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParamCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParamCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamCallArgContext extends Arg_callContext {
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public ParamCallArgContext(Arg_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParamCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParamCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParamCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_callContext arg_call() throws RecognitionException {
		Arg_callContext _localctx = new Arg_callContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arg_call);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ParamCallArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamCallArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(ID);
				setState(232);
				match(T__0);
				setState(233);
				arg_call();
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(mylangParser.FUNCTION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_block_with_returnContext stat_block_with_return() {
			return getRuleContext(Stat_block_with_returnContext.class,0);
		}
		public ReturnFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidFunctionContext extends FunctionContext {
		public TerminalNode FUNCTION() { return getToken(mylangParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public VoidFunctionContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new VoidFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(FUNCTION);
				setState(237);
				match(ID);
				setState(238);
				param();
				setState(239);
				stat_block();
				}
				break;
			case 2:
				_localctx = new ReturnFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(FUNCTION);
				setState(242);
				type();
				setState(243);
				match(ID);
				setState(244);
				param();
				setState(245);
				stat_block_with_return();
				}
				break;
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

	public static class Stat_block_with_returnContext extends ParserRuleContext {
		public TerminalNode OBRACKET() { return getToken(mylangParser.OBRACKET, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public Return_idContext return_id() {
			return getRuleContext(Return_idContext.class,0);
		}
		public TerminalNode CBRACKET() { return getToken(mylangParser.CBRACKET, 0); }
		public Stat_block_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block_with_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterStat_block_with_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitStat_block_with_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitStat_block_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_block_with_returnContext stat_block_with_return() throws RecognitionException {
		Stat_block_with_returnContext _localctx = new Stat_block_with_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stat_block_with_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(OBRACKET);
			setState(250);
			start();
			setState(251);
			return_id();
			setState(252);
			match(CBRACKET);
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

	public static class Return_idContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(mylangParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public Return_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterReturn_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitReturn_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitReturn_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_idContext return_id() throws RecognitionException {
		Return_idContext _localctx = new Return_idContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_return_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(RETURN);
			setState(255);
			match(ID);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(mylangParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(mylangParser.CPAR, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(OPAR);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==FLOAT_TYPE) {
				{
				setState(258);
				arg();
				}
			}

			setState(261);
			match(CPAR);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamArgsContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ParamArgsContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParamArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParamArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParamArgs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParamArgContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(mylangParser.ID, 0); }
		public ParamArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterParamArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitParamArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitParamArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arg);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ParamArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				type();
				setState(264);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ParamArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				type();
				setState(267);
				match(ID);
				setState(268);
				match(T__0);
				setState(269);
				arg();
				}
				break;
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(mylangParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(mylangParser.FLOAT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mylangListener) ((mylangListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mylangVisitor) return ((mylangVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==FLOAT_TYPE) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\7\4T\n\4\f\4\16\4W\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"`\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0083\n\6\f\6\16\6\u0086\13\6\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16\u00a7\n\16\f\16\16\16\u00aa\13"+
		"\16\3\16\3\16\5\16\u00ae\n\16\3\17\3\17\5\17\u00b2\n\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00d4\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00de"+
		"\n\26\3\27\3\27\3\27\3\30\3\30\5\30\u00e5\n\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\5\31\u00ed\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00fa\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\5\35\u0106\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0112\n\36\3\37\3\37\3\37\2\3\n \2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<\2\7\3\2\5\6\3\2\32\33\3\2\27\31\3\2\22\23"+
		"\4\2\n\r\24\25\2\u0119\2A\3\2\2\2\4M\3\2\2\2\6U\3\2\2\2\b_\3\2\2\2\nw"+
		"\3\2\2\2\f\u008b\3\2\2\2\16\u008d\3\2\2\2\20\u0092\3\2\2\2\22\u0095\3"+
		"\2\2\2\24\u009a\3\2\2\2\26\u009d\3\2\2\2\30\u009f\3\2\2\2\32\u00a1\3\2"+
		"\2\2\34\u00af\3\2\2\2\36\u00b7\3\2\2\2 \u00bb\3\2\2\2\"\u00be\3\2\2\2"+
		"$\u00c4\3\2\2\2&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00dd\3\2\2\2,\u00df\3"+
		"\2\2\2.\u00e2\3\2\2\2\60\u00ec\3\2\2\2\62\u00f9\3\2\2\2\64\u00fb\3\2\2"+
		"\2\66\u0100\3\2\2\28\u0103\3\2\2\2:\u0111\3\2\2\2<\u0113\3\2\2\2>@\5\f"+
		"\7\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\62"+
		"\32\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5"+
		"\4\3\2KL\7\2\2\3L\3\3\2\2\2MN\7(\2\2NO\7\16\2\2OP\5\6\4\2PQ\7\17\2\2Q"+
		"\5\3\2\2\2RT\5\b\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2"+
		"\2WU\3\2\2\2X`\5\f\7\2Y`\5\n\6\2Z`\5(\25\2[`\5\32\16\2\\`\5 \21\2]`\5"+
		"\"\22\2^`\5,\27\2_X\3\2\2\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_"+
		"]\3\2\2\2_^\3\2\2\2`\t\3\2\2\2ab\b\6\1\2bc\7\b\2\2cd\t\2\2\2de\7\t\2\2"+
		"ex\5\n\6\ffg\7-\2\2gh\7\b\2\2hi\5\n\6\2ij\7\t\2\2jx\3\2\2\2kl\t\3\2\2"+
		"lx\5\n\6\tmn\7\b\2\2no\5\n\6\2op\7\t\2\2px\3\2\2\2qx\7-\2\2rx\5\26\f\2"+
		"sx\5\30\r\2tu\7-\2\2uv\7\4\2\2vx\5\n\6\3wa\3\2\2\2wf\3\2\2\2wk\3\2\2\2"+
		"wm\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt\3\2\2\2x\u0084\3\2\2\2yz\f"+
		"\r\2\2z{\t\4\2\2{\u0083\5\n\6\16|}\f\13\2\2}~\t\3\2\2~\u0083\5\n\6\f\177"+
		"\u0080\f\4\2\2\u0080\u0081\7\35\2\2\u0081\u0083\5\n\6\5\u0082y\3\2\2\2"+
		"\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008c"+
		"\5\16\b\2\u0088\u008c\5\20\t\2\u0089\u008c\5\22\n\2\u008a\u008c\5\24\13"+
		"\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\r\3\2\2\2\u008d\u008e\7\5\2\2\u008e\u008f\7-\2\2\u008f"+
		"\u0090\7\4\2\2\u0090\u0091\5\n\6\2\u0091\17\3\2\2\2\u0092\u0093\7 \2\2"+
		"\u0093\u0094\5\16\b\2\u0094\21\3\2\2\2\u0095\u0096\7\6\2\2\u0096\u0097"+
		"\7-\2\2\u0097\u0098\7\4\2\2\u0098\u0099\5\n\6\2\u0099\23\3\2\2\2\u009a"+
		"\u009b\7 \2\2\u009b\u009c\5\22\n\2\u009c\25\3\2\2\2\u009d\u009e\7+\2\2"+
		"\u009e\27\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7!\2"+
		"\2\u00a2\u00a8\5\34\17\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\7!\2\2\u00a5"+
		"\u00a7\5\34\17\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\7\"\2\2\u00ac\u00ae\5\36\20\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3"+
		"\2\2\2\u00ae\33\3\2\2\2\u00af\u00b1\7\b\2\2\u00b0\u00b2\7\21\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\5&"+
		"\24\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\36\20\2\u00b6\35\3\2\2\2\u00b7"+
		"\u00b8\7\16\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\17\2\2\u00ba\37\3\2"+
		"\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\5\34\17\2\u00bd!\3\2\2\2\u00be\u00bf"+
		"\7%\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\7\t\2\2\u00c2"+
		"\u00c3\5\36\20\2\u00c3#\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\u00c6\7\4\2\2"+
		"\u00c6\u00c7\5\n\6\2\u00c7\u00c8\7\7\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca"+
		"\7\7\2\2\u00ca\u00cb\7-\2\2\u00cb\u00cc\t\5\2\2\u00cc%\3\2\2\2\u00cd\u00ce"+
		"\7-\2\2\u00ce\u00cf\t\6\2\2\u00cf\u00d4\5\n\6\2\u00d0\u00d1\7-\2\2\u00d1"+
		"\u00d2\7\26\2\2\u00d2\u00d4\5<\37\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3"+
		"\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\36\2\2\u00d6\u00d7\5*\26\2\u00d7"+
		")\3\2\2\2\u00d8\u00de\7-\2\2\u00d9\u00de\7+\2\2\u00da\u00de\7,\2\2\u00db"+
		"\u00dc\7\37\2\2\u00dc\u00de\7-\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2"+
		"\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00de+\3\2\2\2\u00df\u00e0"+
		"\7-\2\2\u00e0\u00e1\5.\30\2\u00e1-\3\2\2\2\u00e2\u00e4\7\b\2\2\u00e3\u00e5"+
		"\5\60\31\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2"+
		"\u00e6\u00e7\7\t\2\2\u00e7/\3\2\2\2\u00e8\u00ed\7-\2\2\u00e9\u00ea\7-"+
		"\2\2\u00ea\u00eb\7\3\2\2\u00eb\u00ed\5\60\31\2\u00ec\u00e8\3\2\2\2\u00ec"+
		"\u00e9\3\2\2\2\u00ed\61\3\2\2\2\u00ee\u00ef\7)\2\2\u00ef\u00f0\7-\2\2"+
		"\u00f0\u00f1\58\35\2\u00f1\u00f2\5\36\20\2\u00f2\u00fa\3\2\2\2\u00f3\u00f4"+
		"\7)\2\2\u00f4\u00f5\5<\37\2\u00f5\u00f6\7-\2\2\u00f6\u00f7\58\35\2\u00f7"+
		"\u00f8\5\64\33\2\u00f8\u00fa\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f3\3"+
		"\2\2\2\u00fa\63\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fc\u00fd\5\6\4\2\u00fd"+
		"\u00fe\5\66\34\2\u00fe\u00ff\7\17\2\2\u00ff\65\3\2\2\2\u0100\u0101\7*"+
		"\2\2\u0101\u0102\7-\2\2\u0102\67\3\2\2\2\u0103\u0105\7\b\2\2\u0104\u0106"+
		"\5:\36\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7\t\2\2\u01089\3\2\2\2\u0109\u010a\5<\37\2\u010a\u010b\7-\2\2\u010b"+
		"\u0112\3\2\2\2\u010c\u010d\5<\37\2\u010d\u010e\7-\2\2\u010e\u010f\7\3"+
		"\2\2\u010f\u0110\5:\36\2\u0110\u0112\3\2\2\2\u0111\u0109\3\2\2\2\u0111"+
		"\u010c\3\2\2\2\u0112;\3\2\2\2\u0113\u0114\t\2\2\2\u0114=\3\2\2\2\24AG"+
		"U_w\u0082\u0084\u008b\u00a8\u00ad\u00b1\u00d3\u00dd\u00e4\u00ec\u00f9"+
		"\u0105\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}