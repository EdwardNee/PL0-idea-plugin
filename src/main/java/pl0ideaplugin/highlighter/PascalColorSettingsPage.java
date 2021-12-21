package pl0ideaplugin.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl0ideaplugin.PascalIcons;

import javax.swing.*;
import java.util.Map;

public class PascalColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Key", PascalSyntaxHighlighter.KEY),
            new AttributesDescriptor("Separator", PascalSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Value", PascalSyntaxHighlighter.VALUE),
            new AttributesDescriptor("Bad value", PascalSyntaxHighlighter.BAD_CHARACTER)
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return PascalIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new PascalSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "var x, squ;\n" +
                "\n" +
                "procedure square;\n" +
                "begin\n" +
                "   squ := x * x\n" +
                "end;\n" +
                "\n" +
                "begin\n" +
                "   x := 1;\n" +
                "   while x <= 10 do\n" +
                "   begin\n" +
                "      call square;\n" +
                "      x := x + 1\n" +
                "   end\n" +
                "end.";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Pascal";
    }

}