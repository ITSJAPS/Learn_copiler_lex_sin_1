import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "$~" [^*] ~"~$" | "$~" "~"+ "$"
FinDeLineaComentario = "$" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "$~~" {ContenidoComentario} "~"+ "$"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /* Ignorar */ }

/* Identificador */
\>{Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }

/* Tipo de dato */
numero | color { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/* Numero */
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/* Colores */
#[{Letra}|{Digito}]{6} { return token(yytext(), "COLOR", yyline, yycolumn); }

/* Operadores de agrupacion */
"<(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")>" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"<{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}>" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }

/* Signos de puntuacion */
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }
"-" { return token(yytext(), "GUION_MED", yyline, yycolumn); }
"|" { return token(yytext(), "BARRA_VER", yyline, yycolumn); }

/* Operador de asignacion */
"-->" { return token(yytext(), "OP_ASIG", yyline, yycolumn); }

/* ESTRUCTURA WHILE */
repetir | repetirDurante { return token(yytext(), "REPETIR", yyline, yycolumn); }

/* Detener repetir FIN WHILE */
interrumpir { return token(yytext(), "INTERRUMPIR", yyline, yycolumn); }

/* Estructura IF */
quesi | queno { return token(yytext(), "EST_QUESI", yyline, yycolumn); }

/* Estructura colorear*/
colorear { return token(yytext(), "COLOREAR", yyline, yycolumn); }

/* Mientras */
mientras { return token(yytext(), "MIENTRAS", yyline, yycolumn); }

/* Funciones */
\@{Identificador} { return token(yytext(), "FUNCION_USUA", yyline, yycolumn); }
ver { return token(yytext(), "VER", yyline, yycolumn); }

/* Etiquetas */
{Identificador}# { return token(yytext(), "ETIQUETA", yyline, yycolumn); }


/* Operadores aritmeticos */
"+¬" { return token(yytext(), "AGREGAR", yyline, yycolumn); }
"-¬" { return token(yytext(), "QUITAR", yyline, yycolumn); }
"/¬" { return token(yytext(), "SEPARAR", yyline, yycolumn); }
"*¬" { return token(yytext(), "ADICIONX", yyline, yycolumn); }
"+¬+" { return token(yytext(), "AUMENTO", yyline, yycolumn); }
"-¬-" { return token(yytext(), "DESAUMENTO", yyline, yycolumn); }

/* Operadores Comparacion*/
"^" { return token(yytext(), "SUPERIOR", yyline, yycolumn); }
"_" { return token(yytext(), "INFERIOR", yyline, yycolumn); }
"--" { return token(yytext(), "EQUIVALENTE", yyline, yycolumn); }
"-?" { return token(yytext(), "DIFERENTE", yyline, yycolumn); }

/* Operadores logicos o relacionales*/
"Y" | "O" | "NO" { return token(yytext(), "OPE_LOGICO", yyline, yycolumn); }

/* Operadores Concatenacion*/
">>" { return token(yytext(), "CONCATENAR", yyline, yycolumn); }
"><" { return token(yytext(), "MAS_IGUAL", yyline, yycolumn); }


/* Final */
terminarAprender { return token(yytext(), "FINAL", yyline, yycolumn); }

//Número erróneo
0{Numero} { return token(yytext(), "ERROR_1", yyline, yycolumn); }

// Identificador erroneo
{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }

. { return token(yytext(), "ERROR", yyline, yycolumn); }