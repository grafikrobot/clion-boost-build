// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

// This is a generated file. Not intended for manual editing.
package org.boost.build.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.boost.build.psi.impl.*;

public interface BBTypes {

  IElementType ARGLIST_OPT = new BBElementType("ARGLIST_OPT");
  IElementType ASSIGN = new BBElementType("ASSIGN");
  IElementType ASSIGN_LIST_OPT = new BBElementType("ASSIGN_LIST_OPT");
  IElementType BINDLIST = new BBElementType("BINDLIST");
  IElementType BLOCK = new BBElementType("BLOCK");
  IElementType CASES = new BBElementType("CASES");
  IElementType CASE_CLAUSE = new BBElementType("CASE_CLAUSE");
  IElementType EFLAG = new BBElementType("EFLAG");
  IElementType EFLAGS = new BBElementType("EFLAGS");
  IElementType EXPR = new BBElementType("EXPR");
  IElementType FUNC = new BBElementType("FUNC");
  IElementType LIST = new BBElementType("LIST");
  IElementType LOCAL_OPT = new BBElementType("LOCAL_OPT");
  IElementType LOL = new BBElementType("LOL");
  IElementType RULES = new BBElementType("RULES");
  IElementType RUN = new BBElementType("RUN");

  IElementType ACTIONS = new BBTokenType("ACTIONS");
  IElementType AMPER = new BBTokenType("AMPER");
  IElementType AMPERAMPER = new BBTokenType("AMPERAMPER");
  IElementType ARG = new BBTokenType("ARG");
  IElementType BANG = new BBTokenType("BANG");
  IElementType BANG_EQUALS = new BBTokenType("BANG_EQUALS");
  IElementType BAR = new BBTokenType("BAR");
  IElementType BARBAR = new BBTokenType("BARBAR");
  IElementType BIND = new BBTokenType("BIND");
  IElementType BREAK = new BBTokenType("BREAK");
  IElementType CASE = new BBTokenType("CASE");
  IElementType CLASS = new BBTokenType("CLASS");
  IElementType COLON = new BBTokenType("COLON");
  IElementType COMMENT = new BBTokenType("COMMENT");
  IElementType CONTINUE = new BBTokenType("CONTINUE");
  IElementType DEFAULT = new BBTokenType("DEFAULT");
  IElementType ELSE = new BBTokenType("ELSE");
  IElementType EQUALS = new BBTokenType("EQUALS");
  IElementType EXISTING = new BBTokenType("EXISTING");
  IElementType FOR = new BBTokenType("FOR");
  IElementType IF = new BBTokenType("IF");
  IElementType IGNORE = new BBTokenType("IGNORE");
  IElementType IN = new BBTokenType("IN");
  IElementType INCLUDE = new BBTokenType("INCLUDE");
  IElementType LANGLE = new BBTokenType("LANGLE");
  IElementType LANGLE_EQUALS = new BBTokenType("LANGLE_EQUALS");
  IElementType LBRACE = new BBTokenType("LBRACE");
  IElementType LBRACKET = new BBTokenType("LBRACKET");
  IElementType LOCAL = new BBTokenType("LOCAL");
  IElementType LPAREN = new BBTokenType("LPAREN");
  IElementType MODULE = new BBTokenType("MODULE");
  IElementType ON = new BBTokenType("ON");
  IElementType PIECEMEAL = new BBTokenType("PIECEMEAL");
  IElementType PLUS_EQUALS = new BBTokenType("PLUS_EQUALS");
  IElementType QUESTION_EQUALS = new BBTokenType("QUESTION_EQUALS");
  IElementType QUIETLY = new BBTokenType("QUIETLY");
  IElementType RANGLE = new BBTokenType("RANGLE");
  IElementType RANGLE_EQUALS = new BBTokenType("RANGLE_EQUALS");
  IElementType RBRACE = new BBTokenType("RBRACE");
  IElementType RBRACKET = new BBTokenType("RBRACKET");
  IElementType RETURN = new BBTokenType("RETURN");
  IElementType RPAREN = new BBTokenType("RPAREN");
  IElementType RULE = new BBTokenType("RULE");
  IElementType SEMIC = new BBTokenType("SEMIC");
  IElementType STRING = new BBTokenType("STRING");
  IElementType SWITCH = new BBTokenType("SWITCH");
  IElementType TOGETHER = new BBTokenType("TOGETHER");
  IElementType UPDATED = new BBTokenType("UPDATED");
  IElementType WHILE = new BBTokenType("WHILE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARG) {
        return new BBArgImpl(node);
      }
      else if (type == ARGLIST_OPT) {
        return new BBArglistOptImpl(node);
      }
      else if (type == ASSIGN) {
        return new BBAssignImpl(node);
      }
      else if (type == ASSIGN_LIST_OPT) {
        return new BBAssignListOptImpl(node);
      }
      else if (type == BINDLIST) {
        return new BBBindlistImpl(node);
      }
      else if (type == BLOCK) {
        return new BBBlockImpl(node);
      }
      else if (type == CASES) {
        return new BBCasesImpl(node);
      }
      else if (type == CASE_CLAUSE) {
        return new BBCaseClauseImpl(node);
      }
      else if (type == EFLAG) {
        return new BBEflagImpl(node);
      }
      else if (type == EFLAGS) {
        return new BBEflagsImpl(node);
      }
      else if (type == EXPR) {
        return new BBExprImpl(node);
      }
      else if (type == FUNC) {
        return new BBFuncImpl(node);
      }
      else if (type == LIST) {
        return new BBListImpl(node);
      }
      else if (type == LOCAL_OPT) {
        return new BBLocalOptImpl(node);
      }
      else if (type == LOL) {
        return new BBLolImpl(node);
      }
      else if (type == RULE) {
        return new BBRuleImpl(node);
      }
      else if (type == RULES) {
        return new BBRulesImpl(node);
      }
      else if (type == RUN) {
        return new BBRunImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
