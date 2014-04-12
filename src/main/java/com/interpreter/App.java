package com.interpreter;

import java.text.MessageFormat;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.interpreter.parsers.ExprLexer;
import com.interpreter.parsers.ExprParser;
import com.interpreter.parsers.ExprParser.IfElseContext;
import com.interpreter.parsers.ExprParser.LoopExprContext;
import com.interpreter.parsers.ExprParser.NumbersContext;
import com.interpreter.parsers.ExprParser.OperatorsContext;
import com.interpreter.parsers.ExprParser.ProgContext;

public class App {
	static final String FACTORIAL = "{0} 1 SWAP 1 - do DUP 1 + LOOP DUP 1 - do * LOOP .";
		
	public static void main(String[] args) {
		// Calculate the factorial of 10
		// Output: 3628800
		execute(MessageFormat.format(FACTORIAL, 10));
	}
	
	public static void execute(String input) {
		ExprLexer lexer = new ExprLexer(new ANTLRInputStream(input));
		ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
		lexer.removeErrorListeners();
		ProgContext exprContext = parser.prog();
		new Interpreter().process(exprContext);
	}
		
	static class Interpreter {
		final Stack<Integer> dataStack = new Stack<Integer>();
		
		void process(ParseTree context) {
			if (context instanceof NumbersContext) {
				dataStack.push(Integer.parseInt(context.getText()));
			} else if (context instanceof OperatorsContext) {
				processOperators(context);
			} else if (context instanceof IfElseContext) {
				processIfElse(context);
			} else if (context instanceof LoopExprContext) {
				processLoop(context);
			} else {
				for (int i = 0; i < context.getChildCount(); i++) {
					process(context .getChild(i));
				}
			}
		}
		
		private void processOperators(ParseTree context) {
			String operator = context.getText();
			if (operator.equals(".")) {
				Integer val = dataStack.pop();
				System.out.println(val);
			} else if (operator.equals("+")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val1 + val2);
			} else if (operator.equals("-")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val2 - val1);
			} else if (operator.equals("*")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val1 * val2);
			} else if (operator.equals("/")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val2 / val1);
			} else if (operator.equals("DUP")) {
				Integer val = dataStack.peek();
				dataStack.push(val);
			} else if (operator.equals("SWAP")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val1);
				dataStack.push(val2);
			} else if (operator.equals(">")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val2 > val1 ? 1 : 0);
			} else if (operator.equals("<")) {
				Integer val1 = dataStack.pop();
				Integer val2 = dataStack.pop();
				dataStack.push(val2 < val1 ? 1 : 0);
			}
		}
		
		private void processIfElse(ParseTree context) {
			int value = dataStack.peek();
			if (value != 0) {
				process(context .getChild(1));
			} else {
				process(context .getChild(3));
			}
		}
		
		private void processLoop(ParseTree context) {
			int val = dataStack.pop();
			for (int i = 0; i < val; i++) {
				process(context .getChild(0));
			}
		}
	}
}
