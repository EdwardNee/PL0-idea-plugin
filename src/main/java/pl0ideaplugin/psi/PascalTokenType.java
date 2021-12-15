package pl0ideaplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pl0ideaplugin.PascalLanguage;

public class PascalTokenType extends IElementType {

    public PascalTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PascalLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PascalTokenType." + super.toString();
    }

}