// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.boost.build.language.psi.BBTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.boost.build.language.psi.*;

public class BBStatementImpl extends ASTWrapperPsiElement implements BBStatement {

  public BBStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BBStatementActions getStatementActions() {
    return findChildByClass(BBStatementActions.class);
  }

  @Override
  @Nullable
  public BBStatementAssign getStatementAssign() {
    return findChildByClass(BBStatementAssign.class);
  }

  @Override
  @Nullable
  public BBStatementBreak getStatementBreak() {
    return findChildByClass(BBStatementBreak.class);
  }

  @Override
  @Nullable
  public BBStatementCall getStatementCall() {
    return findChildByClass(BBStatementCall.class);
  }

  @Override
  @Nullable
  public BBStatementClass getStatementClass() {
    return findChildByClass(BBStatementClass.class);
  }

  @Override
  @Nullable
  public BBStatementContinue getStatementContinue() {
    return findChildByClass(BBStatementContinue.class);
  }

  @Override
  @Nullable
  public BBStatementDefine getStatementDefine() {
    return findChildByClass(BBStatementDefine.class);
  }

  @Override
  @Nullable
  public BBStatementFor getStatementFor() {
    return findChildByClass(BBStatementFor.class);
  }

  @Override
  @Nullable
  public BBStatementIf getStatementIf() {
    return findChildByClass(BBStatementIf.class);
  }

  @Override
  @Nullable
  public BBStatementInclude getStatementInclude() {
    return findChildByClass(BBStatementInclude.class);
  }

  @Override
  @Nullable
  public BBStatementModule getStatementModule() {
    return findChildByClass(BBStatementModule.class);
  }

  @Override
  @Nullable
  public BBStatementReturn getStatementReturn() {
    return findChildByClass(BBStatementReturn.class);
  }

  @Override
  @Nullable
  public BBStatementScope getStatementScope() {
    return findChildByClass(BBStatementScope.class);
  }

  @Override
  @Nullable
  public BBStatementSwitch getStatementSwitch() {
    return findChildByClass(BBStatementSwitch.class);
  }

  @Override
  @Nullable
  public BBStatementWhile getStatementWhile() {
    return findChildByClass(BBStatementWhile.class);
  }

}
