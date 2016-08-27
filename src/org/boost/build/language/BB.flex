// Copyright Rene Rivera 2015-2016
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.boost.build.language.psi.BBTypes;
import static org.boost.build.language.BBParserDefinition.*;

%%

%{
  public BBLexerBase() {
    this((java.io.Reader)null);
 }
%}

%class BBLexerBase
%implements FlexLexer, BBTypes
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WS_CHAR = [\ \t\f\n\r]

COMMENT = "#" [^\r\n]* [\r\n]

/* String body of actions. */
//STRING = ( [^{]+ [{] [^}]* [}] )* | [^}]*
STRING = [^}]*

/* Value/arg, possibly quoted. */
ARG = ( {LITERAL_STRING} | {DOUBLE_QUOTED_STRING} )+
LITERAL_STRING = ( [^\ \t\f\n\r\\\"] | {ESCAPED_CHAR} )+
DOUBLE_QUOTED_STRING = \" ( [^\\\"] | {ESCAPED_CHAR} )* \"
ESCAPED_CHAR = \\ .

BANG = "!"
BANG_EQUALS = "!="
AMPER = "&"
AMPERAMPER = "&&"
LANGLE = "<"
LANGLE_EQUALS = "<="
RANGLE = ">"
RANGLE_EQUALS = ">="
BAR = "|"
BARBAR = "||"

EQUALS = "="
PLUS_EQUALS = "+="
QUESTION_EQUALS = "?="

LPAREN = "("
RPAREN = ")"
COLON = ":"
SEMIC = ";"
LBRACKET = "["
RBRACKET = "]"
LBRACE = "{"
RBRACE = "}"

ACTIONS = "actions"
BIND = "bind"
BREAK = "break"
CASE = "case"
CLASS = "class"
CONTINUE = "continue"
DEFAULT = "default"
ELSE = "else"
EXISTING = "existing"
FOR = "for"
IF = "if"
IGNORE = "ignore"
IN = "in"
INCLUDE = "include"
LOCAL = "local"
MODULE = "module"
ON = "on"
PIECEMEAL = "piecemeal"
QUIETLY = "quietly"
RETURN = "return"
RULE = "rule"
SWITCH = "switch"
TOGETHER = "together"
UPDATED = "updated"
WHILE = "while"

%state YYSPACE, ACTIONS_SCAN_DEF, ACTIONS_SCAN_DEF_WS, ACTIONS_SCAN_STRING,

%%

<YYINITIAL> {WS_CHAR}+              { return TokenType.WHITE_SPACE; }
<YYSPACE> {WS_CHAR}+                { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<YYINITIAL> {COMMENT}               { return COMMENT; }
<YYINITIAL> {BANG}                  { yybegin(YYSPACE); return BANG; }
<YYINITIAL> {BANG_EQUALS}           { yybegin(YYSPACE); return BANG_EQUALS; }
<YYINITIAL> {AMPER}                 { yybegin(YYSPACE); return AMPER; }
<YYINITIAL> {AMPERAMPER}            { yybegin(YYSPACE); return AMPERAMPER; }
<YYINITIAL> {LANGLE}                { yybegin(YYSPACE); return LANGLE; }
<YYINITIAL> {LANGLE_EQUALS}         { yybegin(YYSPACE); return LANGLE_EQUALS; }
<YYINITIAL> {RANGLE}                { yybegin(YYSPACE); return RANGLE; }
<YYINITIAL> {RANGLE_EQUALS}         { yybegin(YYSPACE); return RANGLE_EQUALS; }
<YYINITIAL> {BAR}                   { yybegin(YYSPACE); return BAR; }
<YYINITIAL> {BARBAR}                { yybegin(YYSPACE); return BARBAR; }
<YYINITIAL> {EQUALS}                { yybegin(YYSPACE); return EQUALS; }
<YYINITIAL> {PLUS_EQUALS}           { yybegin(YYSPACE); return PLUS_EQUALS; }
<YYINITIAL> {QUESTION_EQUALS}       { yybegin(YYSPACE); return QUESTION_EQUALS; }
<YYINITIAL> {LPAREN}                { yybegin(YYSPACE); return LPAREN; }
<YYINITIAL> {RPAREN}                { yybegin(YYSPACE); return RPAREN; }
<YYINITIAL> {COLON}                 { yybegin(YYSPACE); return COLON; }
<YYINITIAL> {SEMIC}                 { yybegin(YYSPACE); return SEMIC; }
<YYINITIAL> {LBRACKET}              { yybegin(YYSPACE); return LBRACKET; }
<YYINITIAL> {RBRACKET}              { yybegin(YYSPACE); return RBRACKET; }
<YYINITIAL> {LBRACE}                { yybegin(YYSPACE); return LBRACE; }
<YYINITIAL> {RBRACE}                { yybegin(YYSPACE); return RBRACE; }
<YYINITIAL> {BREAK}                 { yybegin(YYSPACE); return BREAK; }
<YYINITIAL> {CASE}                  { yybegin(YYSPACE); return CASE; }
<YYINITIAL> {CLASS}                 { yybegin(YYSPACE); return CLASS; }
<YYINITIAL> {CONTINUE}              { yybegin(YYSPACE); return CONTINUE; }
<YYINITIAL> {DEFAULT}               { yybegin(YYSPACE); return DEFAULT; }
<YYINITIAL> {ELSE}                  { yybegin(YYSPACE); return ELSE; }
<YYINITIAL> {FOR}                   { yybegin(YYSPACE); return FOR; }
<YYINITIAL> {IF}                    { yybegin(YYSPACE); return IF; }
<YYINITIAL> {IN}                    { yybegin(YYSPACE); return IN; }
<YYINITIAL> {INCLUDE}               { yybegin(YYSPACE); return INCLUDE; }
<YYINITIAL> {LOCAL}                 { yybegin(YYSPACE); return LOCAL; }
<YYINITIAL> {MODULE}                { yybegin(YYSPACE); return MODULE; }
<YYINITIAL> {ON}                    { yybegin(YYSPACE); return ON; }
<YYINITIAL> {RETURN}                { yybegin(YYSPACE); return RETURN; }
<YYINITIAL> {RULE}                  { yybegin(YYSPACE); return RULE; }
<YYINITIAL> {SWITCH}                { yybegin(YYSPACE); return SWITCH; }
<YYINITIAL> {WHILE}                 { yybegin(YYSPACE); return WHILE; }

/* Scanning for actions and their string block. */
<YYINITIAL> {ACTIONS}
    { yybegin(ACTIONS_SCAN_DEF_WS); return ACTIONS; }
<ACTIONS_SCAN_DEF_WS> {WS_CHAR}+
    { yybegin(ACTIONS_SCAN_DEF); return TokenType.WHITE_SPACE; }
<ACTIONS_SCAN_DEF> {UPDATED}
    { yybegin(ACTIONS_SCAN_DEF_WS); return UPDATED; }
<ACTIONS_SCAN_DEF> {TOGETHER}
    { yybegin(ACTIONS_SCAN_DEF_WS); return TOGETHER; }
<ACTIONS_SCAN_DEF> {IGNORE}
    { yybegin(ACTIONS_SCAN_DEF_WS); return IGNORE; }
<ACTIONS_SCAN_DEF> {QUIETLY}
    { yybegin(ACTIONS_SCAN_DEF_WS); return QUIETLY; }
<ACTIONS_SCAN_DEF> {PIECEMEAL}
    { yybegin(ACTIONS_SCAN_DEF_WS); return PIECEMEAL; }
<ACTIONS_SCAN_DEF> {EXISTING}
    { yybegin(ACTIONS_SCAN_DEF_WS); return EXISTING; }
<ACTIONS_SCAN_DEF> {BIND}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BIND; }
<ACTIONS_SCAN_DEF> {LBRACE}
    { yybegin(ACTIONS_SCAN_STRING); return LBRACE; }
<ACTIONS_SCAN_STRING> {STRING}
    { yybegin(ACTIONS_SCAN_DEF); return STRING; }
<ACTIONS_SCAN_DEF> {RBRACE}
    { yybegin(YYINITIAL); return RBRACE; }
/* ARG needs to be after actions as it can match any token. */
<ACTIONS_SCAN_DEF> {ARG}
    { yybegin(ACTIONS_SCAN_DEF_WS); return ARG; }

<YYINITIAL> {ARG}
    { yybegin(YYSPACE); return ARG; }

. { return TokenType.BAD_CHARACTER; }
