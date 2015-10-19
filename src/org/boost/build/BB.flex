// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

package org.boost.build;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.boost.build.psi.BBTypes;

%%

%class BBLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WS_CHAR = [\ \t\f\n\r]
CHAR = [^\ \t\f\n\r]

COMMENT = "#" [^\r\n]*

/* String body of actions. */
STRING = ( [^{]+ [{] [^}]* [}] )* | [^}]*

/* Value/arg, possibly quoted. */
ARG = {DOUBLE_QUOTED_STRING} | {LITERAL_STRING}
LITERAL_STRING = ( {ESCAPE_SEQUENCE} | {CHAR} )+
DOUBLE_QUOTED_STRING = \" ( [^\\\"] | {ESCAPE_SEQUENCE} )* \"
ESCAPE_SEQUENCE = {ESCAPE_SEQUENCE_SPEC_CHAR}
ESCAPE_SEQUENCE_SPEC_CHAR = "\\n"  | "\\r"  | "\\t" | "\\" .

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
<YYINITIAL> {COMMENT}               { return BBTypes.COMMENT; }
<YYINITIAL> {DOUBLE_QUOTED_STRING}  { yybegin(YYSPACE); return BBTypes.ARG; }
<YYINITIAL> {BANG}                  { yybegin(YYSPACE); return BBTypes.BANG; }
<YYINITIAL> {BANG_EQUALS}           { yybegin(YYSPACE); return BBTypes.BANG_EQUALS; }
<YYINITIAL> {AMPER}                 { yybegin(YYSPACE); return BBTypes.AMPER; }
<YYINITIAL> {AMPERAMPER}            { yybegin(YYSPACE); return BBTypes.AMPERAMPER; }
<YYINITIAL> {LANGLE}                { yybegin(YYSPACE); return BBTypes.LANGLE; }
<YYINITIAL> {LANGLE_EQUALS}         { yybegin(YYSPACE); return BBTypes.LANGLE_EQUALS; }
<YYINITIAL> {RANGLE}                { yybegin(YYSPACE); return BBTypes.RANGLE; }
<YYINITIAL> {RANGLE_EQUALS}         { yybegin(YYSPACE); return BBTypes.RANGLE_EQUALS; }
<YYINITIAL> {BAR}                   { yybegin(YYSPACE); return BBTypes.BAR; }
<YYINITIAL> {BARBAR}                { yybegin(YYSPACE); return BBTypes.BARBAR; }
<YYINITIAL> {EQUALS}                { yybegin(YYSPACE); return BBTypes.EQUALS; }
<YYINITIAL> {PLUS_EQUALS}           { yybegin(YYSPACE); return BBTypes.PLUS_EQUALS; }
<YYINITIAL> {QUESTION_EQUALS}       { yybegin(YYSPACE); return BBTypes.QUESTION_EQUALS; }
<YYINITIAL> {LPAREN}                { yybegin(YYSPACE); return BBTypes.LPAREN; }
<YYINITIAL> {RPAREN}                { yybegin(YYSPACE); return BBTypes.RPAREN; }
<YYINITIAL> {COLON}                 { yybegin(YYSPACE); return BBTypes.COLON; }
<YYINITIAL> {SEMIC}                 { yybegin(YYSPACE); return BBTypes.SEMIC; }
<YYINITIAL> {LBRACKET}              { yybegin(YYSPACE); return BBTypes.LBRACKET; }
<YYINITIAL> {RBRACKET}              { yybegin(YYSPACE); return BBTypes.RBRACKET; }
<YYINITIAL> {LBRACE}                { yybegin(YYSPACE); return BBTypes.LBRACE; }
<YYINITIAL> {RBRACE}                { yybegin(YYSPACE); return BBTypes.RBRACE; }
<YYINITIAL> {BREAK}                 { yybegin(YYSPACE); return BBTypes.BREAK; }
<YYINITIAL> {CASE}                  { yybegin(YYSPACE); return BBTypes.CASE; }
<YYINITIAL> {CLASS}                 { yybegin(YYSPACE); return BBTypes.CLASS; }
<YYINITIAL> {CONTINUE}              { yybegin(YYSPACE); return BBTypes.CONTINUE; }
<YYINITIAL> {DEFAULT}               { yybegin(YYSPACE); return BBTypes.DEFAULT; }
<YYINITIAL> {ELSE}                  { yybegin(YYSPACE); return BBTypes.ELSE; }
<YYINITIAL> {FOR}                   { yybegin(YYSPACE); return BBTypes.FOR; }
<YYINITIAL> {IF}                    { yybegin(YYSPACE); return BBTypes.IF; }
<YYINITIAL> {IN}                    { yybegin(YYSPACE); return BBTypes.IN; }
<YYINITIAL> {INCLUDE}               { yybegin(YYSPACE); return BBTypes.INCLUDE; }
<YYINITIAL> {LOCAL}                 { yybegin(YYSPACE); return BBTypes.LOCAL; }
<YYINITIAL> {MODULE}                { yybegin(YYSPACE); return BBTypes.MODULE; }
<YYINITIAL> {ON}                    { yybegin(YYSPACE); return BBTypes.ON; }
<YYINITIAL> {RETURN}                { yybegin(YYSPACE); return BBTypes.RETURN; }
<YYINITIAL> {RULE}                  { yybegin(YYSPACE); return BBTypes.RULE; }
<YYINITIAL> {SWITCH}                { yybegin(YYSPACE); return BBTypes.SWITCH; }
<YYINITIAL> {WHILE}                 { yybegin(YYSPACE); return BBTypes.WHILE; }

/* Scanning for actions and their string block. */
<YYINITIAL> {ACTIONS}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.ACTIONS; }
<ACTIONS_SCAN_DEF_WS> {WS_CHAR}+
    { yybegin(ACTIONS_SCAN_DEF); return TokenType.WHITE_SPACE; }
<ACTIONS_SCAN_DEF> {UPDATED}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.UPDATED; }
<ACTIONS_SCAN_DEF> {TOGETHER}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.TOGETHER; }
<ACTIONS_SCAN_DEF> {IGNORE}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.IGNORE; }
<ACTIONS_SCAN_DEF> {QUIETLY}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.QUIETLY; }
<ACTIONS_SCAN_DEF> {PIECEMEAL}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.PIECEMEAL; }
<ACTIONS_SCAN_DEF> {EXISTING}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.EXISTING; }
<ACTIONS_SCAN_DEF> {BIND}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.BIND; }
<ACTIONS_SCAN_DEF> {LBRACKET}
    { yybegin(ACTIONS_SCAN_STRING); return BBTypes.LBRACKET; }
<ACTIONS_SCAN_STRING> {STRING}
    { yybegin(ACTIONS_SCAN_DEF); return BBTypes.STRING; }
<ACTIONS_SCAN_DEF> {RBRACKET}
    { yybegin(YYINITIAL); return BBTypes.RBRACKET; }
/* ARG needs to be last for actions as it can match any token. */
<ACTIONS_SCAN_DEF> {ARG}
    { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.ARG; }

/* Literals are last so that it doesn't match any of the tokens. */
<YYINITIAL> {LITERAL_STRING}        { yybegin(YYSPACE); return BBTypes.ARG; }

. { return TokenType.BAD_CHARACTER; }
