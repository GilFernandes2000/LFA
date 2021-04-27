grammar AssignCalculator;

program: stat* EOF;

stat: 
        assign NEWLINE
    |   expr? NEWLINE
    ;

assign: ID '=' expr ';';

expr:
        num1=expr op=('*'|'/'|'%') num2=expr            #ExprMultDivMod
    |   num1=expr op=('+'|'-') num2=expr                #ExprAddSub
    |   Integer                                         #ExprInteger
    |   ID                                              #ExprID
    |   '(' expr ')'                                    #ExprParent
    ;

Integer: [0-9]+ ;
ID: [a-zA-Z]+ ;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;