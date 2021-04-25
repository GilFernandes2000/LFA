grammar PreffixCalculator;

program: stat* EOF;
stat: expr? NEWLINE;

expr:
        op=('+'|'-'|'*'|'/') op1=expr op2=expr  #ExprCalc
    |   Integer                                 #ExprInteger
    ;

Integer: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;