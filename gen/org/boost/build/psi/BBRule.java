// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

// This is a generated file. Not intended for manual editing.
package org.boost.build.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface BBRule extends PsiElement {

  @Nullable
  BBArg getArg();

  @Nullable
  BBArglistOpt getArglistOpt();

  @Nullable
  BBAssign getAssign();

  @Nullable
  BBBindlist getBindlist();

  @Nullable
  BBBlock getBlock();

  @Nullable
  BBCases getCases();

  @Nullable
  BBEflags getEflags();

  @Nullable
  BBExpr getExpr();

  @Nullable
  BBList getList();

  @Nullable
  BBLocalOpt getLocalOpt();

  @Nullable
  BBLol getLol();

  @Nullable
  BBRule getRule();

}
