// This is a generated file. Not intended for manual editing.
package org.boost.build.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BBStatement extends PsiElement {

  @Nullable
  BBStatementActions getStatementActions();

  @Nullable
  BBStatementAssign getStatementAssign();

  @Nullable
  BBStatementBreak getStatementBreak();

  @Nullable
  BBStatementCall getStatementCall();

  @Nullable
  BBStatementClass getStatementClass();

  @Nullable
  BBStatementContinue getStatementContinue();

  @Nullable
  BBStatementDefine getStatementDefine();

  @Nullable
  BBStatementFor getStatementFor();

  @Nullable
  BBStatementIf getStatementIf();

  @Nullable
  BBStatementInclude getStatementInclude();

  @Nullable
  BBStatementModule getStatementModule();

  @Nullable
  BBStatementReturn getStatementReturn();

  @Nullable
  BBStatementScope getStatementScope();

  @Nullable
  BBStatementSwitch getStatementSwitch();

  @Nullable
  BBStatementWhile getStatementWhile();

}
