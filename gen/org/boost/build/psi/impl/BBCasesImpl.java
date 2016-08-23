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

public class BBCasesImpl extends ASTWrapperPsiElement implements BBCases {

  public BBCasesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitCases(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<BBCaseClause> getCaseClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, BBCaseClause.class);
  }

}
