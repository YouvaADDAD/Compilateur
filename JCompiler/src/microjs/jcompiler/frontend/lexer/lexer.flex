
/* JFlex specification for JCompiler */

package microjs.jcompiler.frontend.lexer;

import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.ComplexSymbolFactory.ComplexSymbol;
import microjs.jcompiler.frontend.parser.sym;

/**
 * This class is a simple example lexer.
 */

%%

%class Lexer
%public
%unicode
%implements java_cup.runtime.Scanner
%function   next_token
%type       java_cup.runtime.Symbol
%line
%column
%x          COMMENTAIRE_C

%eofval{
  return symbol("EOF", sym.EOF);
%eofval}

%{
  private ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
  // StringBuffer string = new StringBuffer();
    
  private Symbol symbol(String name, int type) {
    return symbolFactory.newSymbol(name, type, new Location(yyline+1, yycolumn +1),  new Location(yyline+1,yycolumn+yylength()));
  }
  private Symbol symbol(String name, int type, Object value) {
    return symbolFactory.newSymbol(name, type, new Location(yyline+1, yycolumn +1),  new Location(yyline+1,yycolumn+yylength()), value);
  }
%}

Identifier = [a-zA-Z][a-zA-Z0-9]* 

Digit = [0-9]

NZDigit = [1-9]
    
LineTerminator = ( \u000D\u000A
	               | [\u000A\u000B\u000C\u000D\u0085\u2028\u2029] )
    
%%

0  { return symbol("INT", sym.INT, 0); }

{NZDigit}{Digit}*     { return symbol("INT", sym.INT, Integer.parseInt(yytext())); }

{LineTerminator} { /* ignore */ }

"nil" { return symbol ("NIL",sym.NIL) ;}

"cdr" { return symbol("CDR", sym.CDR); }

"car" { return symbol("CAR", sym.CAR); }

"cons" { return symbol("CONS", sym.CONS); }

"readInt" { return symbol("READINT", sym.READINT); }

"print" { return symbol("PRINT", sym.PRINT); }

"<->" { return symbol("SWAP", sym.SWAP); }

[;]  { return symbol("SEMICOL", sym.SEMICOL); }

[,]  { return symbol("COMMA", sym.COMMA); }

==  { return symbol("EQEQ", sym.EQEQ); }

[=]  { return symbol("EQ", sym.EQ); }

"<" { return symbol("LT", sym.LT); }

"<=" { return symbol("LE", sym.LE); }

">" { return symbol("GT", sym.GT); }

">=" { return symbol("GE", sym.GE); }

"!=" { return symbol("NE", sym.NE); }

[{]  { return symbol("LCURLY", sym.LCURLY); }

[}]  { return symbol("RCURLY", sym.RCURLY); }

[\[]  { return symbol("LBRACKET", sym.LBRACKET); }

[\]]  { return symbol("RBRACKET", sym.RBRACKET); }

[(]  { return symbol("LPAREN", sym.LPAREN); }

[)]  { return symbol("RPAREN", sym.RPAREN); }

var { return symbol("VAR", sym.VAR); }

let { return symbol("LET", sym.LET); }

true { return symbol("BOOL", sym.BOOL, true); }

false { return symbol("BOOL", sym.BOOL, false); }

if { return symbol("IF", sym.IF); }

while { return symbol("WHILE", sym.WHILE); }

when { return symbol("WHEN", sym.WHEN); }

else { return symbol("ELSE", sym.ELSE); }

function { return symbol("FUNCTION", sym.FUNCTION); }

lambda { return symbol("LAMBDA", sym.LAMBDA); }

return { return symbol("RETURN", sym.RETURN); }

[+] { return symbol("PLUS", sym.PLUS); }

[-] { return symbol("MINUS", sym.MINUS); }

[*] { return symbol("TIMES", sym.TIMES); }

[/] { return symbol("DIV", sym.DIV); }

{Identifier} { return symbol("IDENTIFIER", sym.IDENTIFIER, yytext()); }

[ \t\f]  { /* ignore */ }

\/\/.*\R { /* ignore */ }

"/*"			{ yybegin(COMMENTAIRE_C); }
<COMMENTAIRE_C>[^*]+	{ /* ignore */ }
<COMMENTAIRE_C>\*+	{ /* ignore */ }
<COMMENTAIRE_C>\**"*/"	{ yybegin(YYINITIAL); }

/* error fallback */
.		{  // very strange "bug"
                   if (yytext() == "\\u000A") { /* ignore */
                      System.err.println(
		        "WARNING: strange fallback character");
                   } else { throw new Error("Illegal character <"+
                                                yytext()+">"); }
		}
