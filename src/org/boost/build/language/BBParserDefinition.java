// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.boost.build.language.BBLanguage;
import org.boost.build.language.BBLexerAdapter;
import org.boost.build.language.psi.BBTokenType;
import org.jetbrains.annotations.NotNull;
import org.boost.build.language.BBParser;
import org.boost.build.language.psi.BBFile;

import static org.boost.build.language.psi.BBTypes.*;

public class BBParserDefinition implements ParserDefinition
{
    public static final IElementType COMMENT = new BBTokenType("BB_COMMENT");

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(COMMENT);

    public static final IFileElementType FILE = new IFileElementType(Language.<BBLanguage>findInstance(BBLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new BBLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new BBParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new BBFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return Factory.createElement(node);
    }
}
