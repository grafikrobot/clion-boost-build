// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language;
import com.intellij.lang.ASTNode;
import com.intellij.lang.annotation.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.TextAttributes;
import com.intellij.psi.*;
import org.boost.build.language.psi.*;
import org.jetbrains.annotations.NotNull;

public class BBAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement e, @NotNull AnnotationHolder holder) {
        if (!e.isValid()) return;
        if (e instanceof BBStatementDefine) {
            // def ::= |local| rule arg lparen lol rparen
            boolean is_local = getChildN(e, 0).getNode().getElementType() == BBTypes.LOCAL;
            for (ASTNode c : e.getNode().getChildren(null)) {
                // First ARG is the rule identifier name.
                if (c.getElementType() == BBTypes.ARG) {
                    setHighlighting(c, holder,
                        is_local
                        ? DefaultLanguageHighlighterColors.STATIC_METHOD
                        : DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);
                    break;
                }
            }
        }
        if (e instanceof BBStatementClass) {
            // class_args ::= class lol[ list,val,arg:class_name colon list,val,arg:super_class_name ]
            PsiElement class_args = getChildN(e,1);
            if (class_args != null && class_args instanceof BBLol) {
                // First ARG is the class name.
                PsiElement class_name = getChildNN(class_args, 0, 0, 0); // list, val, arg
                if (class_name != null) {
                    setHighlighting(class_name, holder, DefaultLanguageHighlighterColors.CLASS_NAME);
                } else {
                    // Error: missing class name.
                    holder.createErrorAnnotation(e.getFirstChild(), "Missing class name.");
                }
                // Second ARG is the super class name.
                PsiElement colon = getChildN(class_args, 1);
                PsiElement super_class_name = getChildNN(class_args, 2, 0, 0); // list, val, arg
                if (colon != null) {
                    if (super_class_name != null) {
                        setHighlighting(super_class_name, holder, DefaultLanguageHighlighterColors.CLASS_REFERENCE);
                    } else {
                        // Error: missing class name.
                        holder.createErrorAnnotation(e.getFirstChild(), "Missing super-class name.");
                    }
                }
            }
        }
    }

    private static PsiElement getChildN(PsiElement element, int n)
    {
        ASTNode[] children = element.getNode().getChildren(null);
        int i = -1;
        for(ASTNode child : children) {
            if (!(child.getPsi() instanceof PsiWhiteSpace)) {
                i += 1;
                if (i == n) return child.getPsi();
            }
        }
        return null;
    }

    private static PsiElement getChildNN(PsiElement element, int... n) {
        PsiElement subchild = element;
        for (int nn : n) {
            subchild = getChildN(subchild, nn);
            if (subchild == null) return null;
        }
        return subchild;
    }

    private static void setHighlighting(@NotNull PsiElement element, @NotNull AnnotationHolder holder, @NotNull TextAttributesKey key) {
        holder.createInfoAnnotation(element, null).setTextAttributes(key);
    }

    private static void setHighlighting(@NotNull ASTNode node, @NotNull AnnotationHolder holder, @NotNull TextAttributesKey key) {
        holder.createInfoAnnotation(node, null).setTextAttributes(key);
    }
}
