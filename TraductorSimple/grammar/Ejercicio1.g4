grammar Ejercicio1;

e : t ep EOF;
ep: (OP t ep)*;
t: ID | '(' e ')';
OP: ( '+' | '-' | '*');
ID: [a-zA-z]+;

WP: [ \t\r\n] -> skip ;
