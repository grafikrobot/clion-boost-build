// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

// This is a generated file. Not intended for manual editing.
package org.boost.build.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.boost.build.psi.BBTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.boost.build.psi.*;

public class BBRuleImpl extends ASTWrapperPsiElement implements BBRule {

  public BBRuleImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) ((BBVisitor)visitor).visitRule(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BBArg getArg() {
    return findChildByClass(BBArg.class);
  }

  @Override
  @Nullable
  public BBArglistOpt getArglistOpt() {
    return findChildByClass(BBArglistOpt.class);
  }

  @Override
  @Nullable
  public BBAssign getAssign() {
    return findChildByClass(BBAssign.class);
  }

  @Override
  @Nullable
  public BBBindlist getBindlist() {
    return findChildByClass(BBBindlist.class);
  }

  @Override
  @Nullable
  public BBBlock getBlock() {
    return findChildByClass(BBBlock.class);
  }

  @Override
  @Nullable
  public BBCases getCases() {
    return findChildByClass(BBCases.class);
  }

  @Override
  @Nullable
  public BBEflags getEflags() {
    return findChildByClass(BBEflags.class);
  }

  @Override
  @Nullable
  public BBExpr getExpr() {
    return findChildByClass(BBExpr.class);
  }

  @Override
  @Nullable
  public BBList getList() {
    return findChildByClass(BBList.class);
  }

  @Override
  @Nullable
  public BBLocalOpt getLocalOpt() {
    return findChildByClass(BBLocalOpt.class);
  }

  @Override
  @Nullable
  public BBLol getLol() {
    return findChildByClass(BBLol.class);
  }

  @Override
  @Nullable
  public BBRule getRule() {
    return findChildByClass(BBRule.class);
  }

}
