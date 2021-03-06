//Basic Hummingbord QuickScript Grammar
parser grammar qsParser;

options { tokenVocab=qsLexer; }

qscript_file
        : info_statement statements EOF
        ;
info_statement
        : LBRACK INFO RBRACK version_clause description_clause? num_stmts_clause
        ;
version_clause
        : VERSION EQUALS integer_value
        ;
num_stmts_clause
        : NUMSTMTS EQUALS integer_value
        ;
description_clause
        : DESCRIPTION_INFO
        ;
statements
        : statement+
        ;
statement
        : LBRACK identifier RBRACK statement_type reference_count
        ;
statement_type
        : statement_CRSR parameter_count params
        | statement_COPY parameter_count params
        | statement_CMPR parameter_count params then_clause else_clause
        | statement_DVAR parameter_count params
        | statement_EXIT parameter_count
        | statement_GOTO parameter_count params
        | statement_LABL parameter_count params
        | statement_NOOP parameter_count
        | statement_PPUP parameter_count params
        | statement_PRMT parameter_count params
        | statement_RUNM parameter_count params
        | statement_RVAR parameter_count params
        | statement_SNDK parameter_count params
        | statement_SVAR parameter_count params
        | statement_WINP parameter_count params then_clause else_clause
        | statement_WTXT parameter_count params then_clause else_clause
        ;
statement_COPY
        : STMTID EQUALS COPY
        ;
statement_CMPR
        : STMTID EQUALS CMPR
        ;
statement_CRSR
        : STMTID EQUALS CRSR
        ;
statement_DVAR
        : STMTID EQUALS DVAR
        ;
statement_EXIT
        : STMTID EQUALS EXIT
        ;
statement_GOTO
        : STMTID EQUALS GOTO
        ;
statement_LABL
        : STMTID EQUALS LABL
        ;
statement_NOOP
        : STMTID EQUALS NOOP
        ;
statement_PRMT
        : STMTID EQUALS PRMT
        ;
statement_PPUP
        : STMTID EQUALS PPUP
        ;
statement_RUNM
        : STMTID EQUALS RUNM
        ;
statement_RVAR
        : STMTID EQUALS RVAR
        ;
statement_SNDK
        : STMTID EQUALS SNDK
        ;
statement_SVAR
        : STMTID EQUALS SVAR
        ;
statement_WINP
        : STMTID EQUALS WINP
        ;
statement_WTXT
        : STMTID EQUALS WTXT
        ;
params
        : param+
        ;
param
        : PARAM STRING_LITERAL
        ;
parameter_count
        : NUMPARAMS EQUALS integer_value
        ;
reference_count
        : REFCOUNT EQUALS sign? integer_value
        ;
integer_value
        : NUMBER_INT
        ;
then_clause
        : THEN EQUALS identifier
        ;
else_clause
        : ELSE EQUALS identifier
        ;
identifier
        : IDENTIFIER
        ;
sign
        : PLUS
        | MINUS
        ;
