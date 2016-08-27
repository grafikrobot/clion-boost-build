// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.*;
import org.jetbrains.annotations.*;
import javax.swing.*;
import java.util.Map;

public class BBColorSettingsPage implements ColorSettingsPage, BBSyntaxColors {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Actions: String", ACTION_STRING_COLOR),
            new AttributesDescriptor("Braces and Operators: Braces", BRACES_COLOR),
            new AttributesDescriptor("Braces and Operators: Brackets", BRACKETS_COLOR),
            new AttributesDescriptor("Braces and Operators: Colon", COLON_COLOR),
            new AttributesDescriptor("Braces and Operators: Compare", COMPARE_COLOR),
            new AttributesDescriptor("Braces and Operators: Parentheses", PARENTHESES_COLOR),
            new AttributesDescriptor("Braces and Operators: Semicolon", SEMICCOLON_COLOR),
            new AttributesDescriptor("Identifiers: Call Rule", CALL_RULE_COLOR),
            new AttributesDescriptor("Comment", COMMENT_COLOR),
            new AttributesDescriptor("Keyword", KEYWORD_COLOR),
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
        return
            "# The hash mark starts a text comment." + "\n" +
            "\n" +
            "rule this-is-a-rule ( a1 * : a2 + : a3 ? )" + "\n"+
            "{" + "\n"+
            "   local local-var = [ this-is-a-local-rule 1 2 : 3 4 5 ] ;" + "\n"+
            "}" + "\n"+
            "\n" +
            "local rule this-is-a-local-rule ( a1 * : a2 + )" + "\n"+
            "{" + "\n"+
            "   return $(a1) $(a2) ;" + "\n"+
            "}" + "\n"+
            "\n"+
            "class this-is-a-class : with-a-super-class" + "\n"+
            "{" + "\n"+
            "   rule __init__ ( a1 * : a2 + : a3 ? )" + "\n"+
            "   {" + "\n"+
            "       self.instance-var = $(a1) $(a2) $(a3) ;" + "\n"+
            "   }" + "\n"+
            "\n" +
            "   rule this-is-a-method ( a1 * : a2 + : a3 ? )" + "\n"+
            "   {" + "\n"+
            "       return $(self.instance-var) $(a1) $(a2) $(a3) ;" + "\n"+
            "   }" + "\n"+
            "\n" +
            "   local rule this-is-a-local-method ( a1 * : a2 + )" + "\n"+
            "   {" + "\n"+
            "       return [ $(self).this-is-a-method $(a1) : $(a2) ] ;" + "\n"+
            "   }" + "\n"+
            "}" + "\n"+
            "\n" +
            "actions this-is-an-action" + "\n"+
            "{" + "\n"+
            "   echo \"$(<)\" > \"$(>)\"" + "\n"+
            "}" + "\n";
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
