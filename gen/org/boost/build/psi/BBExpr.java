// This is a generated file. Not intended for manual editing.
package org.boost.build.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BBExpr extends PsiElement {

  @Nullable
  BBCompare getCompare();

  @NotNull
  List<BBExpr> getExprList();

  @Nullable
  BBList getList();

  @Nullable
  BBVal getVal();

}
