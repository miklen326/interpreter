grammar Expr;	
@lexer::header {
  package com.interpreter.parsers;
}
@parser::header {
  package com.interpreter.parsers;
}
prog: ( WS? (numbers | operators | loop | ifElse | ' ') WS?)* ;
numbers: '-'INT | '+'INT | INT ;
operators: '.' |'+' | '-' | '*' | '/' | 'DUP' | 'SWAP' | '<' | '>' ;
loop: 'do' loopExpr 'LOOP' ;
loopExpr: prog;
ifElse: 'if' ifExpr 'else' elseExpr 'then' ;
ifExpr: prog;
elseExpr: prog;
INT: [0-9]+ ;
WS:   ( ' ' | '\t' | '\r' | '\n' )+ ;

