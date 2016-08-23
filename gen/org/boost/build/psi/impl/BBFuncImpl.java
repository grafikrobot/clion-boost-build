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

public class BBFuncImpl extends ASTWrapperPsiElement implements BBFunc {

  public BBFuncImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BBVisitor visitor) {
    visitor.visitFunc(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BBVisitor) accept((BBVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public BBList getList() {
    return findChildByClass(BBList.class);
  }

  @Override
  @Nullable
  public BBLol getLol() {
    return findChildByClass(BBLol.class);
  }

  @Override
  @Nullable
  public BBVal getVal() {
    return findChildByClass(BBVal.class);
  }

}
