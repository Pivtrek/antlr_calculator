grammar Calculator;

//Parser rules

expr: expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | '(' expr ')'
    ;

//Lexer rules

INT: [0-9]+ ; //Liczby całkowite
WS: [ \t\r\n]+ -> skip ; //Pomijanie białych znaków