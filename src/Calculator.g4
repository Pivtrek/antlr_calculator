grammar Calculator;

//Parser rules

expr: expr op=('*'|'/') expr
    | expr op=('+'|'-') expr
    | INT
    | '(' expr ')'
    ;