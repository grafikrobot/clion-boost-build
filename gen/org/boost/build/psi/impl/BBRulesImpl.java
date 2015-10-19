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

public class BBRulesImpl extends ASTWrapperPsiElement implements BBRules {

  public BBRulesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) ((BBVisitor)visitor).visitRules(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BBAssignListOpt getAssignListOpt() {
    return findChildByClass(BBAssignListOpt.class);
  }

  @Override
  @Nullable
  public BBBlock getBlock() {
    return findChildByClass(BBBlock.class);
  }

  @Override
  @Nullable
  public BBList getList() {
    return findChildByClass(BBList.class);
  }

  @Override
  @NotNull
  public List<BBRule> getRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BBRule.class);
  }

}
