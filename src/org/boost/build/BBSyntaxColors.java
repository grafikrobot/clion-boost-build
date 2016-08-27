// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public interface BBSyntaxColors {
    TextAttributesKey ACTION_STRING_COLOR
            = createTextAttributesKey("BB_ACTION_STRING", DefaultLanguageHighlighterColors.STRING);
    TextAttributesKey BRACES_COLOR
            = createTextAttributesKey("BB_BRACES", DefaultLanguageHighlighterColors.BRACES);
    TextAttributesKey BRACKETS_COLOR
            = createTextAttributesKey("BB_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    TextAttributesKey CALL_RULE_COLOR
            = createTextAttributesKey("BB_CALL_RULE", DefaultLanguageHighlighterColors.FUNCTION_CALL);
    TextAttributesKey COLON_COLOR
            = createTextAttributesKey("BB_COLON", DefaultLanguageHighlighterColors.COMMA);
    TextAttributesKey COMMENT_COLOR
            = createTextAttributesKey("BB_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    TextAttributesKey COMPARE_COLOR
            = createTextAttributesKey("BB_COMPARE", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    TextAttributesKey KEYWORD_COLOR
            = createTextAttributesKey("BB_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    TextAttributesKey PARENTHESES_COLOR
            = createTextAttributesKey("BB_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);
    TextAttributesKey SEMICCOLON_COLOR
            = createTextAttributesKey("BB_SEMIC", DefaultLanguageHighlighterColors.SEMICOLON);
}
