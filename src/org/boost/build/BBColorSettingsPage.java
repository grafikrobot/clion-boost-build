package org.boost.build;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;
import javax.swing.*;
import java.util.Map;

public class BBColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            //new AttributesDescriptor("Key", SimpleSyntaxHighlighter.KEY),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return BBIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new BBSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "# The hash mark starts a text comment.\n" +
                "\n" +
                "rule this-is-a-rule ( a1 * : a2 + )\n"+
                "{\n"+
                "}\n"+
                "\n"+
                "class this-is-a-test\n"+
                "{\n"+
                "}\n";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Boost.Build";
    }
}
