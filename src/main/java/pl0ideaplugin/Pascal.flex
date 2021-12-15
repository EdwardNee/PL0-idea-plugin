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


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "ident"            { return IDENT; }
  "number"           { return NUMBER; }


}

[^] { return BAD_CHARACTER; }
