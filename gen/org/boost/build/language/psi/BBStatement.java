// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language.psi;

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
