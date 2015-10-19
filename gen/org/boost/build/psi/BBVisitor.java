// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

// This is a generated file. Not intended for manual editing.
package org.boost.build.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class BBVisitor extends PsiElementVisitor {

  public void visitArg(@NotNull BBArg o) {
    visitPsiElement(o);
  }

  public void visitArglistOpt(@NotNull BBArglistOpt o) {
    visitPsiElement(o);
  }

  public void visitAssign(@NotNull BBAssign o) {
    visitPsiElement(o);
  }

  public void visitAssignListOpt(@NotNull BBAssignListOpt o) {
    visitPsiElement(o);
  }

  public void visitBindlist(@NotNull BBBindlist o) {
    visitPsiElement(o);
  }

  public void visitBlock(@NotNull BBBlock o) {
    visitPsiElement(o);
  }

  public void visitCaseClause(@NotNull BBCaseClause o) {
    visitPsiElement(o);
  }

  public void visitCases(@NotNull BBCases o) {
    visitPsiElement(o);
  }

  public void visitEflag(@NotNull BBEflag o) {
    visitPsiElement(o);
  }

  public void visitEflags(@NotNull BBEflags o) {
    visitPsiElement(o);
  }

  public void visitExpr(@NotNull BBExpr o) {
    visitPsiElement(o);
  }

  public void visitFunc(@NotNull BBFunc o) {
    visitPsiElement(o);
  }

  public void visitList(@NotNull BBList o) {
    visitPsiElement(o);
  }

  public void visitLocalOpt(@NotNull BBLocalOpt o) {
    visitPsiElement(o);
  }

  public void visitLol(@NotNull BBLol o) {
    visitPsiElement(o);
  }

  public void visitRule(@NotNull BBRule o) {
    visitPsiElement(o);
  }

  public void visitRules(@NotNull BBRules o) {
    visitPsiElement(o);
  }

  public void visitRun(@NotNull BBRun o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
