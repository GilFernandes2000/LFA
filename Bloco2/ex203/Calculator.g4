grammar Calculator;

program:
        stat* EOF
    ;

stat:
        expr? NEWLINE
    ;

expr:
        op1=expr op=('*'|'/'|'%') op2=expr  #ExprMultDivMod 
    |   op1=expr op=('+'|'-') op2=expr      #ExprAddSub
    |   Integer                             #ExprInteger
    |   '(' expr ')'                        #ExprParent
    ;

Integer: [0-9]+; //implement with long integers
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;