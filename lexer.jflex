/* ------------------------Codigo copiado al inicio de la clase---------------------- */
/* Esta seccion contiene codigo que se copiara literalmente al principio de la clase, aqui
se define el paquete y los import necesarios. */


// imports para la clase
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;

%%
/* ------------------------Configuracion de flex y declaraciones---------------------- */
/* Esta seccion contiene codigo para configurar la clase creada y declaraciones de macros 
y estados para usar en las expresiones regulares */

// configuracion de la clase. -> public class Lexer implements sym { ... }
%class Lexer
%implements sym
%public

// compatibilidad con cup y simbolos unicode. 
%unicode
%cup

// conteo de columnas y lineas.
%column	// disponible en variable yycolumn.
%line	// disponible en variable yyline.


// todo lo que va aqui dentro se copia textual en la clase Lexer.
%{   
	// variable e inicializadores para trabajar con cup.
    private ComplexSymbolFactory symbolFactory;
    
	public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    
	// funciones para generar simbolos (con y sin valor asociado).
    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar),
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, Object value){
		return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), 
						value);
    }
    
    
    // funcion para enviar errores.
    private void send_error(String error) {
    	throw new Error("at line: " + (yyline+1) + " column: " + yycolumn + ". " + error);
    }
%}

%eofval{
    return symbol("EOF", EOF); 
%eofval}

//declaracion de macros

direccion = [SOET]
color = [ARVBN]
numero = [0-9]+
NewLine = \r | \n | \r\n
Whitespace = [ \t\f] | {NewLine}
bajarPluma = "bajar-pluma"
levantarPluma = "levantar-pluma"
colorPluma = "color-pluma"
direccionPluma = "direccion-pluma"
avanzar = "avanzar"
tableroColor = "tablero-col"
borde = "borde"
plumaColor = "pluma-col"
plumaDireccion = "pluma-dir"
plumaArriba = "pluma-arriba"
plumaAbajo = "pluma-abajo"

%%

<YYINITIAL> {
	{bajarPluma}       {return symbolFactory.newSymbol("bajar_pluma",BAJARP); }
	{levantarPluma}    {return symbolFactory.newSymbol("levantar_pluma",LEVANTARP); }
	{colorPluma}       {return symbolFactory.newSymbol("color_pluma",COLORP); }
	{direccionPluma}   {return symbolFactory.newSymbol("direccion_pluma",DIRP); }
	{avanzar}          {return symbolFactory.newSymbol("avanza_pluma",AVANZA); }
	{tableroColor}     {return symbolFactory.newSymbol("color_tablero",TCOLOR); }
	{borde}            {return symbolFactory.newSymbol("borde",BORDE); }
	{plumaColor}       {return symbolFactory.newSymbol("color_pluma",PCOLOR); }
	{plumaDireccion}    {return symbolFactory.newSymbol("direccion_actual",DIRACT); }
	{plumaAbajo}       {return symbolFactory.newSymbol("pluma_abajo",PABAJO); }
	{plumaArriba}      {return symbolFactory.newSymbol("pluma_arriba",PARRIBA); }
	{numero}           {return symbolFactory.newSymbol("number",NUMBER,Integer.parseInt(yytext())); }
	{color}            {return symbolFactory.newSymbol("color",COLOR,yytext()); }
	{direccion}        {return symbolFactory.newSymbol("direccion",DIRECCION,yytext()); }
    "if"               {return symbolFactory.newSymbol("if",IF,yytext());}
    "while"            {return symbolFactory.newSymbol("while",WHILE,yytext());}
    "then"             {return symbolFactory.newSymbol("then",THEN,yytext());}
    "do"               {return symbolFactory.newSymbol("do",DO,yytext());}
    "else"             {return symbolFactory.newSymbol("else",ELSE,yytext());}
    "not"              {return symbolFactory.newSymbol("not",NOT,yytext());}
    "and"              {return symbolFactory.newSymbol("and",AND,yytext());}
    "or"               {return symbolFactory.newSymbol("or",OR,yytext());}
    ";"                {return symbolFactory.newSymbol(";",PTOCOMA,yytext());}
    "{"                {return symbolFactory.newSymbol("{",ABRE,yytext());}
    "}"                {return symbolFactory.newSymbol("}",CIERRA,yytext());}

    {Whitespace}       {; /* Ignora*/}
    [^]                {send_error("error");}
}