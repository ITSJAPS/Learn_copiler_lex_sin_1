import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char
%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
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
{Comentario} { return textColor(yychar, yylength(), new Color(255, 128, 0)); }
{EspacioEnBlanco} { /*Ignorar*/ }

/* Identificador */
\>{Identificador} { /*Ignorar*/ }

/* Tipo de dato */
numero | color { return textColor(yychar, yylength(), new Color(148, 58, 173)) ; }//morado

/* Numero */
{Numero} { return textColor(yychar, yylength(), new Color(35, 120, 147)) ; }

/* Colores */
#[{Letra}|{Digito}]{6} { return textColor(yychar, yylength(), new Color(194, 195, 12)) ; }

/* Operadores de agrupacion */
"<(" | ")>" | "<{" | "}>" { return textColor(yychar, yylength(), new Color(169, 176, 179)) ; }

/* Signos de puntuacion */
"," | ";" | "-" { return textColor(yychar, yylength(), Color.red) ; }

/* Operador de asignacion */
"-->" { return textColor(yychar, yylength(), Color.orange) ; }


/* Operadores aritmeticos */
"+¬" | "-¬" | "/¬" | "*¬" | "+¬+" | "-¬-" { return textColor(yychar, yylength(), new Color(17, 94, 153)) ; }

/* Operadores Comparacion*/
"^" | "_" | "--" | "-?" { return textColor(yychar, yylength(), new Color(17, 94, 153)) ; }

/* Operadores logicos o relacionales*/
"Y" | "O" | "NO" { return textColor(yychar, yylength(), new Color(102, 41, 120)) ; }

/* Operadores Concatenacion*/
">>" | "><" { return textColor(yychar, yylength(), new Color(239, 108, 0)) ; }

/* Funciones */
\@{Identificador} { return textColor(yychar, yylength(), Color.blue) ; }
colorear | ver { return textColor(yychar, yylength(), new Color(212, 129, 6)) ; }

/* Repetir */
repetir | repetirDurante { return textColor(yychar, yylength(), new Color(150, 50, 0)) ; }

/* Detener repetir */
interrumpir { return textColor(yychar, yylength(), new Color(150, 50, 0)) ; }

/* Estructura QUESI */
quesi | queno { return textColor(yychar, yylength(), Color.green) ; }

/* Mientras */
mientras { return textColor(yychar, yylength(), new Color(150, 50, 0)) ; }

/* Etiquetas */
{Identificador}# { return textColor(yychar, yylength(), Color.red) ; }

/* BARRA DE FINAL SENTENCIA*/
"|" { return textColor(yychar, yylength(), Color.red) ;  }

/* Final */
terminarAprender { return textColor(yychar, yylength(), Color.blue) ; }

//Núnemro erróneo
0{Numero} { /*Ignorar*/ }

// Identificador erroneo
{Identificador} { /*Ignorar*/ }


. { /* Ignorar */ }