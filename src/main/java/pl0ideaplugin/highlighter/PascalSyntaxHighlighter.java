package pl0ideaplugin.highlighter;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NotNull;
import pl0ideaplugin.PascalLexerAdapter;
import pl0ideaplugin.psi.PascalTypes;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class PascalSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("PASCAL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);

    public static final TextAttributesKey PROCEDURE =
            createTextAttributesKey("PASCAL_PROCEDURE", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
    public static final TextAttributesKey KEY =
            createTextAttributesKey("PASCAL_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey VALUE =
            createTextAttributesKey("PASCAL_VALUE", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("PASCAL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("PASCAL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey NUMBER =
            createTextAttributesKey("PASCAL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);

    public static final TextAttributesKey SEMICOL =
            createTextAttributesKey("PASCAL_SEMICOL", DefaultLanguageHighlighterColors.SEMICOLON);

    public static final TextAttributesKey COMMA =
            createTextAttributesKey("PASCAL_COMMA", DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey DOT =
            createTextAttributesKey("PASCAL_DOT", DefaultLanguageHighlighterColors.DOT);

    public static final TextAttributesKey ID =
            createTextAttributesKey("PASCAL_ID", DefaultLanguageHighlighterColors.IDENTIFIER);



    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] PROCEDURE_KEYS = new TextAttributesKey[]{PROCEDURE};
    private static final TextAttributesKey[] ID_KEYS = new TextAttributesKey[]{ID};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};
    private static final TextAttributesKey[] SEMICOL_KEYS = new TextAttributesKey[]{SEMICOL};

    private static final TextAttributesKey[] COMMA_KEYS = new TextAttributesKey[]{COMMA};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new PascalLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {

        //Statements
        if (tokenType.equals(PascalTypes.BEGIN) || tokenType.equals(PascalTypes.END)
                || tokenType.equals(PascalTypes.VAR) || tokenType.equals(PascalTypes.CALL) ||
                tokenType.equals(PascalTypes.IF) || tokenType.equals(PascalTypes.THEN) ||
                tokenType.equals(PascalTypes.WHILE) || tokenType.equals(PascalTypes.DO)) {
            return KEY_KEYS;
        }

        if (tokenType.equals(PascalTypes.PROCEDURE)){
            return PROCEDURE_KEYS;
        }

        if (tokenType.equals(PascalTypes.NUMBER)) {
            return NUMBER_KEYS;
        }

        if (tokenType.equals(PascalTypes.ID)) {
            return ID_KEYS;
        }

        if (tokenType.equals(PascalTypes.EQUALING)) {
            return COMMENT_KEYS;
        }

        if (tokenType.equals(PascalTypes.DOT)) {
            return DOT_KEYS;
        }

        if (tokenType.equals(PascalTypes.SEMICOL)) {
            return SEMICOL_KEYS;
        }

        if (tokenType.equals(TokenType.BAD_CHARACTER)){
            return BAD_CHAR_KEYS;
        }

        return EMPTY_KEYS;
    }
}
