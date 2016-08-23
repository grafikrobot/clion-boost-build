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
    if (t == ASSIGN) {
      r = assign(b, 0);
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
    else if (t == COMPARE) {
      r = compare(b, 0);
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
    else if (t == KEYWORD) {
      r = keyword(b, 0);
    }
    else if (t == LIST) {
      r = list(b, 0);
    }
    else if (t == LOL) {
      r = lol(b, 0);
    }
    else if (t == RUN) {
      r = run(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == STATEMENT_ACTIONS) {
      r = statement_actions(b, 0);
    }
    else if (t == STATEMENT_ASSIGN) {
      r = statement_assign(b, 0);
    }
    else if (t == STATEMENT_BREAK) {
      r = statement_break(b, 0);
    }
    else if (t == STATEMENT_CALL) {
      r = statement_call(b, 0);
    }
    else if (t == STATEMENT_CLASS) {
      r = statement_class(b, 0);
    }
    else if (t == STATEMENT_CONTINUE) {
      r = statement_continue(b, 0);
    }
    else if (t == STATEMENT_DEFINE) {
      r = statement_define(b, 0);
    }
    else if (t == STATEMENT_FOR) {
      r = statement_for(b, 0);
    }
    else if (t == STATEMENT_IF) {
      r = statement_if(b, 0);
    }
    else if (t == STATEMENT_INCLUDE) {
      r = statement_include(b, 0);
    }
    else if (t == STATEMENT_MODULE) {
      r = statement_module(b, 0);
    }
    else if (t == STATEMENT_RETURN) {
      r = statement_return(b, 0);
    }
    else if (t == STATEMENT_SCOPE) {
      r = statement_scope(b, 0);
    }
    else if (t == STATEMENT_SWITCH) {
      r = statement_switch(b, 0);
    }
    else if (t == STATEMENT_WHILE) {
      r = statement_while(b, 0);
    }
    else if (t == VAL) {
      r = val(b, 0);
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
  // EQUALS | PLUS_EQUALS | QUESTION_EQUALS | DEFAULT EQUALS
  public static boolean assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assign")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGN, "<assign>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, PLUS_EQUALS);
    if (!r) r = consumeToken(b, QUESTION_EQUALS);
    if (!r) r = parseTokens(b, 0, DEFAULT, EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // item_
  static boolean bbLangFile(PsiBuilder b, int l) {
    return item_(b, l + 1);
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
  // statement*
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    Marker m = enter_section_(b, l, _NONE_, BLOCK, "<block>");
    int c = current_position_(b);
    while (true) {
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "block", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
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
    Marker m = enter_section_(b, l, _NONE_, CASES, "<cases>");
    int c = current_position_(b);
    while (true) {
      if (!case_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cases", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // EQUALS | BANG_EQUALS | LANGLE | LANGLE_EQUALS | RANGLE | RANGLE_EQUALS |
  //     AMPER | AMPERAMPER | BAR | BARBAR
  public static boolean compare(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compare")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARE, "<compare>");
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, BANG_EQUALS);
    if (!r) r = consumeToken(b, LANGLE);
    if (!r) r = consumeToken(b, LANGLE_EQUALS);
    if (!r) r = consumeToken(b, RANGLE);
    if (!r) r = consumeToken(b, RANGLE_EQUALS);
    if (!r) r = consumeToken(b, AMPER);
    if (!r) r = consumeToken(b, AMPERAMPER);
    if (!r) r = consumeToken(b, BAR);
    if (!r) r = consumeToken(b, BARBAR);
    exit_section_(b, l, m, r, false, null);
    return r;
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
    Marker m = enter_section_(b, l, _NONE_, EFLAG, "<eflag>");
    r = consumeToken(b, UPDATED);
    if (!r) r = consumeToken(b, TOGETHER);
    if (!r) r = consumeToken(b, IGNORE);
    if (!r) r = consumeToken(b, QUIETLY);
    if (!r) r = consumeToken(b, PIECEMEAL);
    if (!r) r = consumeToken(b, EXISTING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // eflag*
  public static boolean eflags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eflags")) return false;
    Marker m = enter_section_(b, l, _NONE_, EFLAGS, "<eflags>");
    int c = current_position_(b);
    while (true) {
      if (!eflag(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "eflags", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // ( LPAREN expr RPAREN |
  //         BANG expr |
  //         val IN list |
  //         val )
  //     ( compare expr )?
  public static boolean expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, EXPR, "<expr>");
    r = expr_0(b, l + 1);
    r = r && expr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LPAREN expr RPAREN |
  //         BANG expr |
  //         val IN list |
  //         val
  private static boolean expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expr_0_0(b, l + 1);
    if (!r) r = expr_0_1(b, l + 1);
    if (!r) r = expr_0_2(b, l + 1);
    if (!r) r = val(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LPAREN expr RPAREN
  private static boolean expr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  // BANG expr
  private static boolean expr_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BANG);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // val IN list
  private static boolean expr_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = val(b, l + 1);
    r = r && consumeToken(b, IN);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( compare expr )?
  private static boolean expr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1")) return false;
    expr_1_0(b, l + 1);
    return true;
  }

  // compare expr
  private static boolean expr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expr_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compare(b, l + 1);
    r = r && expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET ( ARG lol | ON val ARG lol | ON val RETURN list ) RBRACKET
  public static boolean func(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && func_1(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, FUNC, r);
    return r;
  }

  // ARG lol | ON val ARG lol | ON val RETURN list
  private static boolean func_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = func_1_0(b, l + 1);
    if (!r) r = func_1_1(b, l + 1);
    if (!r) r = func_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ARG lol
  private static boolean func_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG);
    r = r && lol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON val ARG lol
  private static boolean func_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && val(b, l + 1);
    r = r && consumeToken(b, ARG);
    r = r && lol(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON val RETURN list
  private static boolean func_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "func_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && val(b, l + 1);
    r = r && consumeToken(b, RETURN);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // run
  static boolean item_(PsiBuilder b, int l) {
    return run(b, l + 1);
  }

  /* ********************************************************** */
  // ACTIONS |
  //     BIND |
  //     BREAK |
  //     CASE |
  //     CLASS |
  //     CONTINUE |
  //     DEFAULT |
  //     ELSE |
  //     EXISTING |
  //     FOR |
  //     IF |
  //     IGNORE |
  //     IN |
  //     INCLUDE |
  //     LOCAL |
  //     MODULE |
  //     ON |
  //     PIECEMEAL |
  //     QUIETLY |
  //     RETURN |
  //     RULE |
  //     SWITCH |
  //     TOGETHER |
  //     UPDATED |
  //     WHILE
  public static boolean keyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYWORD, "<keyword>");
    r = consumeToken(b, ACTIONS);
    if (!r) r = consumeToken(b, BIND);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CASE);
    if (!r) r = consumeToken(b, CLASS);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, DEFAULT);
    if (!r) r = consumeToken(b, ELSE);
    if (!r) r = consumeToken(b, EXISTING);
    if (!r) r = consumeToken(b, FOR);
    if (!r) r = consumeToken(b, IF);
    if (!r) r = consumeToken(b, IGNORE);
    if (!r) r = consumeToken(b, IN);
    if (!r) r = consumeToken(b, INCLUDE);
    if (!r) r = consumeToken(b, LOCAL);
    if (!r) r = consumeToken(b, MODULE);
    if (!r) r = consumeToken(b, ON);
    if (!r) r = consumeToken(b, PIECEMEAL);
    if (!r) r = consumeToken(b, QUIETLY);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, RULE);
    if (!r) r = consumeToken(b, SWITCH);
    if (!r) r = consumeToken(b, TOGETHER);
    if (!r) r = consumeToken(b, UPDATED);
    if (!r) r = consumeToken(b, WHILE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // val*
  public static boolean list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "list")) return false;
    Marker m = enter_section_(b, l, _NONE_, LIST, "<list>");
    int c = current_position_(b);
    while (true) {
      if (!val(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // list ( COLON list )*
  public static boolean lol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lol")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOL, "<lol>");
    r = list(b, l + 1);
    r = r && lol_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
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
  // block
  public static boolean run(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "run")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RUN, "<run>");
    r = block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement_define |
  //     statement_scope |
  //     statement_include |
  //     statement_return |
  //     statement_break |
  //     statement_continue |
  //     statement_for |
  //     statement_switch |
  //     statement_if |
  //     statement_module |
  //     statement_class |
  //     statement_while |
  //     statement_actions |
  //     statement_call |
  //     statement_assign
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = statement_define(b, l + 1);
    if (!r) r = statement_scope(b, l + 1);
    if (!r) r = statement_include(b, l + 1);
    if (!r) r = statement_return(b, l + 1);
    if (!r) r = statement_break(b, l + 1);
    if (!r) r = statement_continue(b, l + 1);
    if (!r) r = statement_for(b, l + 1);
    if (!r) r = statement_switch(b, l + 1);
    if (!r) r = statement_if(b, l + 1);
    if (!r) r = statement_module(b, l + 1);
    if (!r) r = statement_class(b, l + 1);
    if (!r) r = statement_while(b, l + 1);
    if (!r) r = statement_actions(b, l + 1);
    if (!r) r = statement_call(b, l + 1);
    if (!r) r = statement_assign(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ACTIONS eflags ARG bindlist? LBRACE STRING RBRACE
  public static boolean statement_actions(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_actions")) return false;
    if (!nextTokenIs(b, ACTIONS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ACTIONS);
    r = r && eflags(b, l + 1);
    r = r && consumeToken(b, ARG);
    r = r && statement_actions_3(b, l + 1);
    r = r && consumeTokens(b, 0, LBRACE, STRING, RBRACE);
    exit_section_(b, m, STATEMENT_ACTIONS, r);
    return r;
  }

  // bindlist?
  private static boolean statement_actions_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_actions_3")) return false;
    bindlist(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LOCAL? ARG SEMIC
  //     | LOCAL? ARG assign list SEMIC
  //     | ARG ON list assign list SEMIC
  //     | LOCAL list ( assign list )? SEMIC
  public static boolean statement_assign(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign")) return false;
    if (!nextTokenIs(b, "<statement assign>", ARG, LOCAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_ASSIGN, "<statement assign>");
    r = statement_assign_0(b, l + 1);
    if (!r) r = statement_assign_1(b, l + 1);
    if (!r) r = statement_assign_2(b, l + 1);
    if (!r) r = statement_assign_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LOCAL? ARG SEMIC
  private static boolean statement_assign_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_assign_0_0(b, l + 1);
    r = r && consumeTokens(b, 0, ARG, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // LOCAL?
  private static boolean statement_assign_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_0_0")) return false;
    consumeToken(b, LOCAL);
    return true;
  }

  // LOCAL? ARG assign list SEMIC
  private static boolean statement_assign_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement_assign_1_0(b, l + 1);
    r = r && consumeToken(b, ARG);
    r = r && assign(b, l + 1);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // LOCAL?
  private static boolean statement_assign_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_1_0")) return false;
    consumeToken(b, LOCAL);
    return true;
  }

  // ARG ON list assign list SEMIC
  private static boolean statement_assign_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ARG, ON);
    r = r && list(b, l + 1);
    r = r && assign(b, l + 1);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // LOCAL list ( assign list )? SEMIC
  private static boolean statement_assign_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOCAL);
    r = r && list(b, l + 1);
    r = r && statement_assign_3_2(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // ( assign list )?
  private static boolean statement_assign_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_3_2")) return false;
    statement_assign_3_2_0(b, l + 1);
    return true;
  }

  // assign list
  private static boolean statement_assign_3_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_assign_3_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assign(b, l + 1);
    r = r && list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BREAK SEMIC
  public static boolean statement_break(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_break")) return false;
    if (!nextTokenIs(b, BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BREAK, SEMIC);
    exit_section_(b, m, STATEMENT_BREAK, r);
    return r;
  }

  /* ********************************************************** */
  // ARG lol SEMIC
  //     | ON val statement
  public static boolean statement_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_call")) return false;
    if (!nextTokenIs(b, "<statement call>", ARG, ON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_CALL, "<statement call>");
    r = statement_call_0(b, l + 1);
    if (!r) r = statement_call_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ARG lol SEMIC
  private static boolean statement_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_call_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARG);
    r = r && lol(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, null, r);
    return r;
  }

  // ON val statement
  private static boolean statement_call_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_call_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ON);
    r = r && val(b, l + 1);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS lol LBRACE block RBRACE
  public static boolean statement_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_class")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS);
    r = r && lol(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_CLASS, r);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE SEMIC
  public static boolean statement_continue(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_continue")) return false;
    if (!nextTokenIs(b, CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTINUE, SEMIC);
    exit_section_(b, m, STATEMENT_CONTINUE, r);
    return r;
  }

  /* ********************************************************** */
  // LOCAL? RULE ARG ( LPAREN lol RPAREN )? LBRACE block RBRACE
  public static boolean statement_define(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_define")) return false;
    if (!nextTokenIs(b, "<statement define>", LOCAL, RULE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_DEFINE, "<statement define>");
    r = statement_define_0(b, l + 1);
    r = r && consumeTokens(b, 0, RULE, ARG);
    r = r && statement_define_3(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LOCAL?
  private static boolean statement_define_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_define_0")) return false;
    consumeToken(b, LOCAL);
    return true;
  }

  // ( LPAREN lol RPAREN )?
  private static boolean statement_define_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_define_3")) return false;
    statement_define_3_0(b, l + 1);
    return true;
  }

  // LPAREN lol RPAREN
  private static boolean statement_define_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_define_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && lol(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FOR LOCAL? ARG IN list LBRACE block RBRACE
  public static boolean statement_for(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_for")) return false;
    if (!nextTokenIs(b, FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FOR);
    r = r && statement_for_1(b, l + 1);
    r = r && consumeTokens(b, 0, ARG, IN);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_FOR, r);
    return r;
  }

  // LOCAL?
  private static boolean statement_for_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_for_1")) return false;
    consumeToken(b, LOCAL);
    return true;
  }

  /* ********************************************************** */
  // IF expr LBRACE block RBRACE ( ELSE statement )?
  public static boolean statement_if(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if")) return false;
    if (!nextTokenIs(b, IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IF);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    r = r && statement_if_5(b, l + 1);
    exit_section_(b, m, STATEMENT_IF, r);
    return r;
  }

  // ( ELSE statement )?
  private static boolean statement_if_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if_5")) return false;
    statement_if_5_0(b, l + 1);
    return true;
  }

  // ELSE statement
  private static boolean statement_if_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_if_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE);
    r = r && statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INCLUDE list SEMIC
  public static boolean statement_include(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_include")) return false;
    if (!nextTokenIs(b, INCLUDE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCLUDE);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, STATEMENT_INCLUDE, r);
    return r;
  }

  /* ********************************************************** */
  // MODULE list LBRACE block RBRACE
  public static boolean statement_module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_module")) return false;
    if (!nextTokenIs(b, MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MODULE);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_MODULE, r);
    return r;
  }

  /* ********************************************************** */
  // RETURN list SEMIC
  public static boolean statement_return(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_return")) return false;
    if (!nextTokenIs(b, RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, SEMIC);
    exit_section_(b, m, STATEMENT_RETURN, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACE block RBRACE
  public static boolean statement_scope(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_scope")) return false;
    if (!nextTokenIs(b, LBRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_SCOPE, r);
    return r;
  }

  /* ********************************************************** */
  // SWITCH list LBRACE cases RBRACE
  public static boolean statement_switch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_switch")) return false;
    if (!nextTokenIs(b, SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SWITCH);
    r = r && list(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && cases(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_SWITCH, r);
    return r;
  }

  /* ********************************************************** */
  // WHILE expr LBRACE block RBRACE
  public static boolean statement_while(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_while")) return false;
    if (!nextTokenIs(b, WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, WHILE);
    r = r && expr(b, l + 1);
    r = r && consumeToken(b, LBRACE);
    r = r && block(b, l + 1);
    r = r && consumeToken(b, RBRACE);
    exit_section_(b, m, STATEMENT_WHILE, r);
    return r;
  }

  /* ********************************************************** */
  // ARG	| keyword | func
  public static boolean val(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "val")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAL, "<val>");
    r = consumeToken(b, ARG);
    if (!r) r = keyword(b, l + 1);
    if (!r) r = func(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
