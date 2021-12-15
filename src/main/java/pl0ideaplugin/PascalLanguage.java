package pl0ideaplugin;

import com.intellij.lang.Language;

public class PascalLanguage extends Language {

    public static final PascalLanguage INSTANCE = new PascalLanguage();

    private PascalLanguage() {
        super("Pascal");
    }
}