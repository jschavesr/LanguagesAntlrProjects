grammar exrp;
i : e EOF;
e : t ep ;
ep: (OP t ep)*;
t: ID | '('e')';
OP: ( '+' | '-' | '*');
ID: [a-zA-Z]+;

WP: [ \t\n] -> skip ;
