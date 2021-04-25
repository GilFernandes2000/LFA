grammar AssignCalculator;

program: stat* EOF;

stat: 
        assign
    |   expr? NEWLINE
    ;

assign: ID '=' num=expr ';';

expr:
        
        num1=expr op=('*'|'/'|'%'|'+'|'-') num2=expr    #ExprOP
    |   Integer                                         #ExprInteger
    |   ID                                              #ExprID
    |   '(' expr ')'                                    #ExprParent
    ;

Integer: [0-9]+ ;
ID: [a-zA-Z ]+ ;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;
COMMENT: '#' .*? '\n' -> skip;