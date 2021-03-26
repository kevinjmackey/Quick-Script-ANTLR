lexer grammar qsLexer;

CMPR
   : C M P R
   ;
CRSR
   : C R S R
   ;
DVAR
   : D V A R
   ;
EQUALS
   : '='
   ;
EXIT
   : E X I T
   ;
GOTO
   : G O T O;
INFO
   : I N F O
   ;
LABL
   : L A B L
   ;
NOOP
   : N O O P
   ;
NUMPARAMS
   : N U M P A R A M S
   ;
NUMSTMTS
   : N U M S T M T S
   ;
PARAM
   : P A R A M NUMBER_INT EQUALS
   ;
PRMT
   : P R M T
   ;
PPUP
   : P P U P
   ;
REFCOUNT
   : R E F C O U N T
   ;
RUNM
   : R U N M
   ;
RVAR
   : R V A R
   ;
SNDK
   : S N D K
   ;
STMT
   : S T M T
   ;
STMTID
   : S T M T I D
   ;
SVAR
   : S V A R
   ;
VERSION
   : V E R S I O N
   ;
WTXT
   : W T X T
   ;
LBRACK
   : '['
   ;
RBRACK
   : ']'
   ;
ELSE
   : E L S E
   ;
THEN
   : T H E N
   ;
STRING_LITERAL
   : '""' (~["\\\r\n] | ESCAPE_SEQUENCE)* '""'
   ;
NUMBER_INT
	: DEC_DIGIT+
	;
IDENTIFIER
   : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9')*
   ;
SPACE:              [ \t\r\n]+    -> skip;
COMMENT:            '/*' (COMMENT | .)*? '*/' -> channel(HIDDEN);
LINE_COMMENT:       '//' ~[\r\n]* -> channel(HIDDEN);

fragment DEC_DOT_DEC:  (DEC_DIGIT+ '.' DEC_DIGIT+ |  DEC_DIGIT+ '.' | '.' DEC_DIGIT+);
fragment HEX_DIGIT:    [0-9A-F];
fragment DEC_DIGIT:    [0-9];
fragment ALPHA: ([A-Z] | [a-z]);

fragment ESCAPE_SEQUENCE
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

fragment A
   : ('a' | 'A')
   ;
fragment B
   : ('b' | 'B')
   ;
fragment C
   : ('c' | 'C')
   ;
fragment D
   : ('d' | 'D')
   ;
fragment E
   : ('e' | 'E')
   ;
fragment F
   : ('f' | 'F')
   ;
fragment G
   : ('g' | 'G')
   ;
fragment H
   : ('h' | 'H')
   ;
fragment I
   : ('i' | 'I')
   ;
fragment J
   : ('j' | 'J')
   ;
fragment K
   : ('k' | 'K')
   ;
fragment L
   : ('l' | 'L')
   ;
fragment M
   : ('m' | 'M')
   ;
fragment N
   : ('n' | 'N')
   ;
fragment O
   : ('o' | 'O')
   ;
fragment P
   : ('p' | 'P')
   ;
fragment Q
   : ('q' | 'Q')
   ;
fragment R
   : ('r' | 'R')
   ;
fragment S
   : ('s' | 'S')
   ;
fragment T
   : ('t' | 'T')
   ;
fragment U
   : ('u' | 'U')
   ;
fragment V
   : ('v' | 'V')
   ;
fragment W
   : ('w' | 'W')
   ;
fragment X
   : ('x' | 'X')
   ;
fragment Y
   : ('y' | 'Y')
   ;
fragment Z
   : ('z' | 'Z')
   ;
