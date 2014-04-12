// Generated from /Users/michaelnekrasov/Documents/workspace_ee/Interpreter/src/main/java/com/interpreter/parsers/Expr.g4 by ANTLR 4.2

  package com.interpreter.parsers;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#loopExpr}.
	 * @param ctx the parse tree
	 */
	void enterLoopExpr(@NotNull ExprParser.LoopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loopExpr}.
	 * @param ctx the parse tree
	 */
	void exitLoopExpr(@NotNull ExprParser.LoopExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull ExprParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull ExprParser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(@NotNull ExprParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(@NotNull ExprParser.IfElseContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExprParser.ProgContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#numbers}.
	 * @param ctx the parse tree
	 */
	void enterNumbers(@NotNull ExprParser.NumbersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numbers}.
	 * @param ctx the parse tree
	 */
	void exitNumbers(@NotNull ExprParser.NumbersContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ExprParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ExprParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(@NotNull ExprParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(@NotNull ExprParser.OperatorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link ExprParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseExpr(@NotNull ExprParser.ElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseExpr(@NotNull ExprParser.ElseExprContext ctx);
}