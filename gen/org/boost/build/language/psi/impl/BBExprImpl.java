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

public class BBExprImpl extends ASTWrapperPsiElement implements BBExpr {

  public BBExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitExpr(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BBCompare getCompare() {
    return findChildByClass(BBCompare.class);
  }

  @Override
  @NotNull
  public List<BBExpr> getExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BBExpr.class);
  }

  @Override
  @Nullable
  public BBList getList() {
    return findChildByClass(BBList.class);
  }

  @Override
  @Nullable
  public BBVal getVal() {
    return findChildByClass(BBVal.class);
  }

}
