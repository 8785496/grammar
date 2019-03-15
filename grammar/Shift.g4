grammar Shift;

statementseq: statement | statementseq statement;

statement: ';' | shiftexpression ';';

shiftexpression: 'cout' ('<<' expression)+;

expression: literal | identifer;

literal: Integerliteral
       | Booleanliteral
       | Stringliteral
       | Characterliteral
       | Floatingliteral;

identifer: Identifer;

Booleanliteral: 'true' | 'false';

Identifer: Identifernodigit (Identifernodigit | Digit)*;

Identifernodigit: [a-zA-Z_];

Integerliteral: Digit | Nonzerodigit Digit*;

Floatingliteral: Digit* '.' Digit*;

Nonzerodigit: [1-9];

Digit: [0-9];

Stringliteral: '"' ~["\\\r\n]* '"';

Characterliteral: '\'' ~['\\\r\n] '\'';

Whitespace: [ \t\r\n]+ -> skip;