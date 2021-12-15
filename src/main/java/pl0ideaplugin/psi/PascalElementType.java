package pl0ideaplugin.psi;

import com.intellij.psi.tree.IElementType;

import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pl0ideaplugin.PascalLanguage;

public class PascalElementType extends IElementType {

    public PascalElementType(@NotNull @NonNls String debugName) {
        super(debugName, PascalLanguage.INSTANCE);
    }

}
