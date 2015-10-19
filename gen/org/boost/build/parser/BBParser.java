// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

// This is a generated file. Not intended for manual editing.
package org.boost.build.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.boost.build.psi.BBTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BBParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARG) {
      r = arg(b, 0);
    }
    else if (t == ARGLIST_OPT) {
      r = arglist_opt(b, 0);
    }
    else if (t == ASSIGN) {
      r = assign(b, 0);
    }
    else if (t == ASSIGN_LIST_OPT) {
      r = assign_list_opt(b, 0);
    }
    else if (t == BINDLIST) {
      r = bindlist(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == CASE_CLAUSE) {
      r = case_clause(b, 0);
    }
    else if (t == CASES) {
      r = cases(b, 0);
    }
    else if (t == EFLAG) {
      r = eflag(b, 0);
    }
    else if (t == EFLAGS) {
      r = eflags(b, 0);
    }
    else if (t == EXPR) {
      r = expr(b, 0);
    }
    else if (t == FUNC) {
      r = func(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == LOCAL_OPT) {
      r = local_opt(b, 0);
    }
    else if (t == LOL) {
      r = lol(b, 0);
    }
    else if (t == RULE) {
      r = rule(b, 0);
    }
    else if (t == RULES) {
      r = rules(b, 0);
    }
    else if (t == RUN) {
      r = run(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return bbLangFile(b, l + 1);
  }

  /* ********************************************************** */
  // ARG	| LBRACKET func RBRACKET
  public static boolean arg(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg")) return false;
    if (!nextTokenIs(b, "<arg>", ARG, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<arg>");
    r = consumeToken(b, ARG);
    if (!r) r = arg_1(b, l + 1);
    exit_section_(b, l, m, ARG, r, false, null);
    return r;
  }

  // LBRACKET func RBRACKET
  private static boolean arg_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arg_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && func(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( LPAREN lol RPAREN )?
  public static boolean arglist_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<arglist opt>");
    arglist_opt_0(b, l + 1);
    exit_section_(b, l, m, ARGLIST_OPT, true, false, null);
    return true;
  }

  // LPAREN lol RPAREN
  private static boolean arglist_opt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arglist_opt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && lol(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUALS
  //     | PLUS_EQUALS
  //     | QUESTION_EQUALS
  //     | DEFAULT EQUALS
  public static boolean assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<assign>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, PLUS_EQUALS);
    if (!r) r = consumeToken(b, QUESTION_EQUALS);
    if (!r) r = parseTokens(b, 0, DEFAULT, EQUALS);
    exit_section_(b, l, m, ASSIGN, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( EQUALS list )?
  public static boolean assign_list_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_list_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<assign list opt>");
    assign_list_opt_0(b, l + 1);
    exit_section_(b, l, m, ASSIGN_LIST_OPT, true, false, null);
    return true;
  }

  // EQUALS list
  private static boolean assign_list_opt_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign_list_opt_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean bbLangFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bbLangFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "bbLangFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // BIND ARG+
  public static boolean bindlist(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindlist")) return false;
    if (!nextTokenIs(b, BIND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BIND);
    r = r && bindlist_1(b, l + 1);
    exit_section_(b, m, BINDLIST, r);
    return r;
  }

  // ARG+
  private static boolean bindlist_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bindlist_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, ARG)) break;
      if (!empty_element_parsed_guard_(b, "bindlist_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // rules?
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<block>");
    rules(b, l + 1);
    exit_section_(b, l, m, BLOCK, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // CASE ARG COLON block
  public static boolean case_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "case_clause")) return false;
    if (!nextTokenIs(b, CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE, ARG, COLON);
    r = r && block(b, l + 1);
    exit_section_(b, m, CASE_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // case_clause*
  public static boolean cases(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cases")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<cases>");
    int c = current_position_(b);
    while (true) {
      if (!case_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cases", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CASES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // UPDATED
  //     | TOGETHER
  //     | IGNORE
  //     | QUIETLY
  //     | PIECEMEAL
  //     | EXISTING
  public static boolean eflag(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eflag")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<eflag>");
    r = consumeToken(b, UPDATED);
    if (!r) r = consumeToken(b, TOGETHER);
    if (!r) r = consumeToken(b, IGNORE);
    if (!r) r = consumeToken(b, QUIETLY);
    if (!r) r = consumeToken(b, PIECEMEAL);
    if (!r) r = consumeToken(b, EXISTING);
    exit_section_(b, l, m, EFLAG, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // eflag*
  public static boolean eflags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eflags")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<eflags>");
    int c = current_position_(b);
    while (true) {
      if (!eflag(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "eflags", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, EFLAGS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // arg
  //     | arg EQUALS expr
  //     | arg BANG_EQUALS expr
  //     | arg LANGLE expr
  //     | arg LANGLE_EQUALS expr
  //     | arg RANGLE expr
  //     | arg RANGLE_EQUALS expr
  //     | arg AMPER expr
  //     | arg AMPERAMPER expr
  //     | arg BAR expr
  //     | arg BARBAR expr
  //     | arg IN list
  //     | BANG expr
  //     | LPAREN expr RPAREN
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expr>");
    r = arg(b, l + 1);
    if (!r) r = expr_1(b, l + 1);
    if (!r) r = expr_2(b, l + 1);
    if (!r) r = expr_3(b, l + 1);
    if (!r) r = expr_4(b, l + 1);
    if (!r) r = expr_5(b, l + 1);
    if (!r) r = expr_6(b, l + 1);
    if (!r) r = expr_7(b, l + 1);
    if (!r) r = expr_8(b, l + 1);
    if (!r) r = expr_9(b, l + 1);
    if (!r) r = expr_10(b, l + 1);
    if (!r) r = expr_11(b, l + 1);
    if (!r) r = expr_12(b, l + 1);
    if (!r) r = expr_13(b, l + 1);
    exit_section_(b, l, m, EXPR, r, false, null);
    return r;
  }

  // arg EQUALS expr
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg BANG_EQUALS expr
  private static boolean expr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, BANG_EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg LANGLE expr
  private static boolean expr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, LANGLE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg LANGLE_EQUALS expr
  private static boolean expr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, LANGLE_EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg RANGLE expr
  private static boolean expr_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, RANGLE);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg RANGLE_EQUALS expr
  private static boolean expr_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, RANGLE_EQUALS);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg AMPER expr
  private static boolean expr_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, AMPER);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg AMPERAMPER expr
  private static boolean expr_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, AMPERAMPER);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg BAR expr
  private static boolean expr_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, BAR);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg BARBAR expr
  private static boolean expr_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, BARBAR);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg IN list
  private static boolean expr_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BANG expr
  private static boolean expr_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BANG);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN expr RPAREN
  private static boolean expr_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ARG lol
  //     | ON arg ARG lol
  //     | ON arg RETURN list
  public static boolean func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func")) return false;
    if (!nextTokenIs(b, "<func>", ARG, ON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<func>");
    r = func_0(b, l + 1);
    if (!r) r = func_1(b, l + 1);
    if (!r) r = func_2(b, l + 1);
    exit_section_(b, l, m, FUNC, r, false, null);
    return r;
  }

  // ARG lol
  private static boolean func_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG);
    r = r && lol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON arg ARG lol
  private static boolean func_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && arg(b, l + 1);
    r = r && consumeToken(b, ARG);
    r = r && lol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON arg RETURN list
  private static boolean func_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && arg(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // run | COMMENT
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = run(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // arg*
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<list>");
    int c = current_position_(b);
    while (true) {
      if (!arg(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // LOCAL?
  public static boolean local_opt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_opt")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<local opt>");
    consumeToken(b, LOCAL);
    exit_section_(b, l, m, LOCAL_OPT, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // list ( COLON list )*
  public static boolean lol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lol>");
    r = list(b, l + 1);
    r = r && lol_1(b, l + 1);
    exit_section_(b, l, m, LOL, r, false, null);
    return r;
  }

  // ( COLON list )*
  private static boolean lol_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lol_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!lol_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lol_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COLON list
  private static boolean lol_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lol_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE block RBRACE
  //     | INCLUDE list SEMIC
  //     | ARG lol SEMIC
  //     | arg assign list SEMIC
  //     | arg ON list assign list SEMIC
  //     | RETURN list SEMIC
  //     | BREAK SEMIC
  //     | CONTINUE SEMIC
  //     | FOR local_opt ARG IN list LBRACE block RBRACE
  //     | SWITCH list LBRACE cases RBRACE
  //     | IF expr LBRACE block RBRACE
  //     | MODULE list LBRACE block RBRACE
  //     | CLASS lol LBRACE block RBRACE
  //     | WHILE expr LBRACE block RBRACE
  //     | IF expr LBRACE block RBRACE ELSE rule
  //     | local_opt RULE ARG arglist_opt rule
  //     | ON arg rule
  //     | ACTIONS eflags ARG bindlist? LBRACE STRING RBRACE
  public static boolean rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rule>");
    r = rule_0(b, l + 1);
    if (!r) r = rule_1(b, l + 1);
    if (!r) r = rule_2(b, l + 1);
    if (!r) r = rule_3(b, l + 1);
    if (!r) r = rule_4(b, l + 1);
    if (!r) r = rule_5(b, l + 1);
    if (!r) r = parseTokens(b, 0, BREAK, SEMIC);
    if (!r) r = parseTokens(b, 0, CONTINUE, SEMIC);
    if (!r) r = rule_8(b, l + 1);
    if (!r) r = rule_9(b, l + 1);
    if (!r) r = rule_10(b, l + 1);
    if (!r) r = rule_11(b, l + 1);
    if (!r) r = rule_12(b, l + 1);
    if (!r) r = rule_13(b, l + 1);
    if (!r) r = rule_14(b, l + 1);
    if (!r) r = rule_15(b, l + 1);
    if (!r) r = rule_16(b, l + 1);
    if (!r) r = rule_17(b, l + 1);
    exit_section_(b, l, m, RULE, r, false, null);
    return r;
  }

  // LBRACE block RBRACE
  private static boolean rule_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // INCLUDE list SEMIC
  private static boolean rule_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // ARG lol SEMIC
  private static boolean rule_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG);
    r = r && lol(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg assign list SEMIC
  private static boolean rule_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && assign(b, l + 1);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // arg ON list assign list SEMIC
  private static boolean rule_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arg(b, l + 1);
    r = r && consumeToken(b, ON);
    r = r && list(b, l + 1);
    r = r && assign(b, l + 1);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // RETURN list SEMIC
  private static boolean rule_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // FOR local_opt ARG IN list LBRACE block RBRACE
  private static boolean rule_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && local_opt(b, l + 1);
    r = r && consumeTokens(b, 0, ARG, IN);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // SWITCH list LBRACE cases RBRACE
  private static boolean rule_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SWITCH);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && cases(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IF expr LBRACE block RBRACE
  private static boolean rule_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // MODULE list LBRACE block RBRACE
  private static boolean rule_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODULE);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CLASS lol LBRACE block RBRACE
  private static boolean rule_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && lol(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHILE expr LBRACE block RBRACE
  private static boolean rule_13(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_13")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // IF expr LBRACE block RBRACE ELSE rule
  private static boolean rule_14(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_14")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeTokens(b, 0, RBRACE, ELSE);
    r = r && rule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // local_opt RULE ARG arglist_opt rule
  private static boolean rule_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_opt(b, l + 1);
    r = r && consumeTokens(b, 0, RULE, ARG);
    r = r && arglist_opt(b, l + 1);
    r = r && rule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON arg rule
  private static boolean rule_16(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_16")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && arg(b, l + 1);
    r = r && rule(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ACTIONS eflags ARG bindlist? LBRACE STRING RBRACE
  private static boolean rule_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTIONS);
    r = r && eflags(b, l + 1);
    r = r && consumeToken(b, ARG);
    r = r && rule_17_3(b, l + 1);
    r = r && consumeTokens(b, 0, LBRACE, STRING, RBRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // bindlist?
  private static boolean rule_17_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule_17_3")) return false;
    bindlist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // rule+ | LOCAL list assign_list_opt SEMIC block
  public static boolean rules(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rules>");
    r = rules_0(b, l + 1);
    if (!r) r = rules_1(b, l + 1);
    exit_section_(b, l, m, RULES, r, false, null);
    return r;
  }

  // rule+
  private static boolean rules_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rule(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!rule(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rules_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // LOCAL list assign_list_opt SEMIC block
  private static boolean rules_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rules_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCAL);
    r = r && list(b, l + 1);
    r = r && assign_list_opt(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    r = r && block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // rules
  public static boolean run(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<run>");
    r = rules(b, l + 1);
    exit_section_(b, l, m, RUN, r, false, null);
    return r;
  }

}
