package pl0ideaplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static pl0ideaplugin.psi.PascalTypes.*;

%%

%{
  public PascalLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class PascalLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
NUMBER=[0-9]+
ID=[a-z]([a-z0-9])*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "const"            { return CONST; }
  "var"              { return VAR; }
  "procedure"        { return PROCEDURE; }
  "call"             { return CALL; }
  "begin"            { return BEGIN; }
  "end"              { return END; }
  "while"            { return WHILE; }
  "do"               { return DO; }
  "if"               { return IF; }
  "then"             { return THEN; }
  "odd"              { return ODD; }
  ":="               { return EQUALING; }
  "+"                { return PLUS; }
  "-"                { return MINUS; }
  "*"                { return PRODUCT; }
  "/"                { return DELIM; }
  "<"                { return LESS; }
  "<="               { return LESSEQ; }
  ">"                { return GREATER; }
  ">="               { return GREATEREQ; }
  ","                { return COMMA; }
  ";"                { return SEMICOL; }
  "."                { return DOT; }

  {SPACE}            { return SPACE; }
  {NUMBER}           { return NUMBER; }
  {ID}               { return ID; }

}

[^] { return BAD_CHARACTER; }
