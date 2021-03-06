// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class BBVisitor extends PsiElementVisitor {

  public void visitAssign(@NotNull BBAssign o) {
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

  public void visitCompare(@NotNull BBCompare o) {
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

  public void visitKeyword(@NotNull BBKeyword o) {
    visitPsiElement(o);
  }

  public void visitList(@NotNull BBList o) {
    visitPsiElement(o);
  }

  public void visitLol(@NotNull BBLol o) {
    visitPsiElement(o);
  }

  public void visitRun(@NotNull BBRun o) {
    visitPsiElement(o);
  }

  public void visitStatement(@NotNull BBStatement o) {
    visitPsiElement(o);
  }

  public void visitStatementActions(@NotNull BBStatementActions o) {
    visitPsiElement(o);
  }

  public void visitStatementAssign(@NotNull BBStatementAssign o) {
    visitPsiElement(o);
  }

  public void visitStatementBreak(@NotNull BBStatementBreak o) {
    visitPsiElement(o);
  }

  public void visitStatementCall(@NotNull BBStatementCall o) {
    visitPsiElement(o);
  }

  public void visitStatementClass(@NotNull BBStatementClass o) {
    visitPsiElement(o);
  }

  public void visitStatementContinue(@NotNull BBStatementContinue o) {
    visitPsiElement(o);
  }

  public void visitStatementDefine(@NotNull BBStatementDefine o) {
    visitPsiElement(o);
  }

  public void visitStatementFor(@NotNull BBStatementFor o) {
    visitPsiElement(o);
  }

  public void visitStatementIf(@NotNull BBStatementIf o) {
    visitPsiElement(o);
  }

  public void visitStatementInclude(@NotNull BBStatementInclude o) {
    visitPsiElement(o);
  }

  public void visitStatementModule(@NotNull BBStatementModule o) {
    visitPsiElement(o);
  }

  public void visitStatementReturn(@NotNull BBStatementReturn o) {
    visitPsiElement(o);
  }

  public void visitStatementScope(@NotNull BBStatementScope o) {
    visitPsiElement(o);
  }

  public void visitStatementSwitch(@NotNull BBStatementSwitch o) {
    visitPsiElement(o);
  }

  public void visitStatementWhile(@NotNull BBStatementWhile o) {
    visitPsiElement(o);
  }

  public void visitVal(@NotNull BBVal o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
