package pl0ideaplugin;

import com.intellij.lexer.FlexAdapter;

public class PascalLexerAdapter extends FlexAdapter {

    public PascalLexerAdapter() {
        super(new PascalLexer());
    }

}
