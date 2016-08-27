// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.boost.build.psi.BBTypes;
import java.util.HashMap;
import java.util.Map;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class BBSyntaxHighlighter extends SyntaxHighlighterBase implements BBSyntaxColors {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();
    protected static void fillMap(
            Map<IElementType, TextAttributesKey> attributes,
            String externalName,
            TextAttributesKey color,
            IElementType... types)
    {
        fillMap(attributes, createTextAttributesKey(externalName, color), types);
    }
    static {
        fillMap(ATTRIBUTES, ACTION_STRING_COLOR,
                BBTypes.STRING);
        fillMap(ATTRIBUTES, BRACES_COLOR,
                BBTypes.LBRACE, BBTypes.RBRACE);
        fillMap(ATTRIBUTES, BRACKETS_COLOR,
                BBTypes.LBRACKET, BBTypes.RBRACKET);
        fillMap(ATTRIBUTES, CALL_RULE_COLOR,
                BBTypes.FUNC);
        fillMap(ATTRIBUTES, COLON_COLOR,
                BBTypes.COLON);
        fillMap(ATTRIBUTES, COMMENT_COLOR,
                BBParserDefinition.COMMENT);
        fillMap(ATTRIBUTES, COMPARE_COLOR,
                BBTypes.COMPARE);
        fillMap(ATTRIBUTES, KEYWORD_COLOR,
                BBTypes.ACTIONS,
                BBTypes.BIND,
                BBTypes.BREAK,
                BBTypes.CASE,
                BBTypes.CLASS,
                BBTypes.CONTINUE,
                BBTypes.DEFAULT,
                BBTypes.EFLAG,
                BBTypes.ELSE,
                BBTypes.FOR,
                BBTypes.IF,
                BBTypes.IN,
                BBTypes.INCLUDE,
                BBTypes.LOCAL,
                BBTypes.MODULE,
                BBTypes.ON,
                BBTypes.RETURN,
                BBTypes.RULE,
                BBTypes.SWITCH,
                BBTypes.WHILE);
        fillMap(ATTRIBUTES, PARENTHESES_COLOR,
                BBTypes.LPAREN, BBTypes.RPAREN);
        fillMap(ATTRIBUTES, SEMICCOLON_COLOR,
                BBTypes.SEMIC);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new BBLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }
}
