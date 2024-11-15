package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
/* Espacios en blanco */
{espacio} {/* Ignore */}

/* Comentarios de línea */
"//"([^\n])* {/* Ignore */}

/* Comentarios de bloque */
"/*"([^*]|"*"+[^/*])*"*"+"/" { /* Ignore */ }

/* Comentario sin terminar */
"/*" { /* Agregar manejo de error para comentario sin terminar */ return ERROR; }

/* Salto de línea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexeme=yytext(); return T_dato;}
( String ) {lexeme=yytext(); return Cadena;}

/* Palabras reservadas */
( if ) {lexeme=yytext(); return If;}
( else ) {lexeme=yytext(); return Else;}
( do ) {lexeme=yytext(); return Do;}
( while ) {lexeme=yytext(); return While;}
( for ) {lexeme=yytext(); return For;}
( main ) {lexeme=yytext(); return Main;}
(return) { lexeme = yytext(); return Return; }


/* Palabras reservadas adicionales */
(  const | unsigned | auto | break | case | continue | default | enum | extern | goto | register | short | signed | sizeof | static | struct | switch | typedef | union | void | volatile ) { lexeme = yytext(); return Reservada; }

/* Operadores */
( "=" ) {lexeme=yytext(); return Igual;}
( "+" ) {lexeme=yytext(); return Suma;}
( "-" ) {lexeme=yytext(); return Resta;}
( "*" ) {lexeme=yytext(); return Multiplicacion;}
( "/" ) {lexeme=yytext(); return Division;}
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/* Operadores Lógicos */
( "&&" | "||" | "!" ) {lexeme=yytext(); return Op_logico;}

/* Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores de Atribución */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Binarios */
( "&" | "|" | "^" | "~" ) { lexeme = yytext(); return Op_binario; }

/* Operadores Booleanos */
(true | false) {lexeme = yytext(); return Op_booleano;}

/* Paréntesis, Llaves y Corchetes */
( "(" ) {lexeme=yytext(); return Parentesis_a;}
( ")" ) {lexeme=yytext(); return Parentesis_c;}
( "{" ) {lexeme=yytext(); return Llave_a;}
( "}" ) {lexeme=yytext(); return Llave_c;}
( "[" ) {lexeme = yytext(); return Corchete_a;}
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Dos Puntos */
( ":" ) { lexeme = yytext(); return Dos_puntos; }

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Números */
("0x"[0-9a-fA-F]+) { lexeme = yytext(); return Numero_hex; }
("0"[0-7]+) { lexeme = yytext(); return Numero_oct; }
({D}+"."{D}+[eE][-+]?{D}+) { lexeme = yytext(); return Numero_cientifico; }
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Error de análisis */
. {return ERROR;}
