// This is a generated file. Not intended for manual editing.
package org.boost.build.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.boost.build.psi.impl.*;

public interface BBTypes {

  IElementType ASSIGN = new BBElementType("ASSIGN");
  IElementType BINDLIST = new BBElementType("BINDLIST");
  IElementType BLOCK = new BBElementType("BLOCK");
  IElementType CASES = new BBElementType("CASES");
  IElementType CASE_CLAUSE = new BBElementType("CASE_CLAUSE");
  IElementType COMPARE = new BBElementType("COMPARE");
  IElementType EFLAG = new BBElementType("EFLAG");
  IElementType EFLAGS = new BBElementType("EFLAGS");
  IElementType EXPR = new BBElementType("EXPR");
  IElementType FUNC = new BBElementType("FUNC");
  IElementType KEYWORD = new BBElementType("KEYWORD");
  IElementType LIST = new BBElementType("LIST");
  IElementType LOL = new BBElementType("LOL");
  IElementType RUN = new BBElementType("RUN");
  IElementType STATEMENT = new BBElementType("STATEMENT");
  IElementType STATEMENT_ACTIONS = new BBElementType("STATEMENT_ACTIONS");
  IElementType STATEMENT_ASSIGN = new BBElementType("STATEMENT_ASSIGN");
  IElementType STATEMENT_BREAK = new BBElementType("STATEMENT_BREAK");
  IElementType STATEMENT_CALL = new BBElementType("STATEMENT_CALL");
  IElementType STATEMENT_CLASS = new BBElementType("STATEMENT_CLASS");
  IElementType STATEMENT_CONTINUE = new BBElementType("STATEMENT_CONTINUE");
  IElementType STATEMENT_DEFINE = new BBElementType("STATEMENT_DEFINE");
  IElementType STATEMENT_FOR = new BBElementType("STATEMENT_FOR");
  IElementType STATEMENT_IF = new BBElementType("STATEMENT_IF");
  IElementType STATEMENT_INCLUDE = new BBElementType("STATEMENT_INCLUDE");
  IElementType STATEMENT_MODULE = new BBElementType("STATEMENT_MODULE");
  IElementType STATEMENT_RETURN = new BBElementType("STATEMENT_RETURN");
  IElementType STATEMENT_SCOPE = new BBElementType("STATEMENT_SCOPE");
  IElementType STATEMENT_SWITCH = new BBElementType("STATEMENT_SWITCH");
  IElementType STATEMENT_WHILE = new BBElementType("STATEMENT_WHILE");
  IElementType VAL = new BBElementType("VAL");

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
       if (type == ASSIGN) {
        return new BBAssignImpl(node);
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
      else if (type == COMPARE) {
        return new BBCompareImpl(node);
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
      else if (type == KEYWORD) {
        return new BBKeywordImpl(node);
      }
      else if (type == LIST) {
        return new BBListImpl(node);
      }
      else if (type == LOL) {
        return new BBLolImpl(node);
      }
      else if (type == RUN) {
        return new BBRunImpl(node);
      }
      else if (type == STATEMENT) {
        return new BBStatementImpl(node);
      }
      else if (type == STATEMENT_ACTIONS) {
        return new BBStatementActionsImpl(node);
      }
      else if (type == STATEMENT_ASSIGN) {
        return new BBStatementAssignImpl(node);
      }
      else if (type == STATEMENT_BREAK) {
        return new BBStatementBreakImpl(node);
      }
      else if (type == STATEMENT_CALL) {
        return new BBStatementCallImpl(node);
      }
      else if (type == STATEMENT_CLASS) {
        return new BBStatementClassImpl(node);
      }
      else if (type == STATEMENT_CONTINUE) {
        return new BBStatementContinueImpl(node);
      }
      else if (type == STATEMENT_DEFINE) {
        return new BBStatementDefineImpl(node);
      }
      else if (type == STATEMENT_FOR) {
        return new BBStatementForImpl(node);
      }
      else if (type == STATEMENT_IF) {
        return new BBStatementIfImpl(node);
      }
      else if (type == STATEMENT_INCLUDE) {
        return new BBStatementIncludeImpl(node);
      }
      else if (type == STATEMENT_MODULE) {
        return new BBStatementModuleImpl(node);
      }
      else if (type == STATEMENT_RETURN) {
        return new BBStatementReturnImpl(node);
      }
      else if (type == STATEMENT_SCOPE) {
        return new BBStatementScopeImpl(node);
      }
      else if (type == STATEMENT_SWITCH) {
        return new BBStatementSwitchImpl(node);
      }
      else if (type == STATEMENT_WHILE) {
        return new BBStatementWhileImpl(node);
      }
      else if (type == VAL) {
        return new BBValImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
