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

public class BBSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();
    protected static void fillMap(
            Map<IElementType, TextAttributesKey> attributes,
            String externalName,
            TextAttributesKey color,
            IElementType... types)
    {
        TextAttributesKey v = createTextAttributesKey(externalName, color);
        for (int i = 0; i < types.length; ++i)
        {
            attributes.put(types[i], v);
        }
    }
    static {
        fillMap(ATTRIBUTES,
                "BB_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT,
                BBParserDefinition.COMMENT);
        fillMap(ATTRIBUTES,
                "BB_PAREN", DefaultLanguageHighlighterColors.PARENTHESES,
                BBTypes.LPAREN, BBTypes.RPAREN);
        fillMap(ATTRIBUTES, "BB_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD,
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
        fillMap(ATTRIBUTES,
                "BB_STRING", DefaultLanguageHighlighterColors.STRING,
                BBTypes.STRING);
        fillMap(ATTRIBUTES,
                "BB_BRACES", DefaultLanguageHighlighterColors.BRACES,
                BBTypes.LBRACE, BBTypes.RBRACE);
        fillMap(ATTRIBUTES,
                "BB_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS,
                BBTypes.LBRACKET, BBTypes.RBRACKET);
        fillMap(ATTRIBUTES,
                "BB_FUNC", DefaultLanguageHighlighterColors.FUNCTION_CALL,
                BBTypes.FUNC);
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
