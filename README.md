Interpreter
===========

The Java projects which implements the interpreter for the simple language. 

Language rules:<br>
The interpreter interprets the input. Any numerical
value is put on the data stack. Any text that is not a number, is an
operator. The language operators work on data stack. They can take the operands
from the stack and will put the results back on the stack.

Operators:
- '.' - take a value from the stack and print it,<br>
- '+' - add the values on the stack,<br>
- '-' - subtract the values on the stack,<br>
- '*' - multiply the values on the stack,<br>
- '/' - divide the values on the stack (the top-1 value is divided by the top value).<br>
- 'DUP' - duplicate the value on the stack,<br>
- 'SWAP' - swap the 2 values on the stack,<br>
- '<' - the 'less-than' operator,<br>
- '>' - the 'more-than' operator.<br>
- 'if <operators-executed-when-the-top-of-the-stack-is-non-zero> else
    <executed-in-the other-case> then' - control structure (can be
    nested). <br>
- 'do <operators-executed-in-a-loop> LOOP' - takes the initial counter
    from the top of the stack and executes the loop that many times. <br>

The implementation of interpreter is based on [ANTLR](http://www.antlr.org/) library. This library is a powerful parser generator for reading and processing any text formats. From the grammar file, it generates a parser that can build and walk parse trees.
The grammar file defines the syntax rules for the interpreted language.

The grammar file is - [Expr.g4](https://github.com/miklen326/interpreter/blob/master/src/main/java/com/interpreter/parsers/Expr.g4)

Application entry point - [App.java](https://github.com/miklen326/interpreter/blob/master/src/main/java/com/interpreter/App.java)
