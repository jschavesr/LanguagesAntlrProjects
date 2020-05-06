grammar MyLanguage;		

commands	: command* EOF;

command 	: conditional
			| repeat
			| printexpr
			| whilecmd
			| VAR ID 'as' expr SMCOLON
			| SET ID 'as' expr SMCOLON
			;

conditional : 'if' booleanExpr 'then' command* else_cond? 'endif';
else_cond: 'else then' command*;
repeat		: 'repeat' expr 'times' command* 'endrepeat';
printexpr	: 'print' expr SMCOLON ;
whilecmd       : 'while' booleanExpr 'do' command* 'endwhile';

expr:	expr MULOP expr
    |	expr SUMOP expr
    |	DOUBLE
    |	PIZQ expr PDER
    | 	ID
    ;

booleanExpr : expr ROP expr;


COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;
VAR		: 'var';
SET     : 'set';
PIZQ	: '(' ;
PDER	: ')' ;
ROP		: ( '<' | '<=' | '>=' | '>' | '==' | '!=' ) ;
SMCOLON : ';' ;
MULOP	: ( '*' | '/' );
SUMOP	: ('+' | '-') ;
DOUBLE	: [0-9]+( | [.][0-9]+);
ID 		: [a-zA-Z][a-zA-Z0-9_]* ;