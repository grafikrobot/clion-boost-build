// Copyright Rene Rivera 2015
// Distributed under the Boost Software License, Version 1.0.
// (See accompanying file LICENSE_1_0.txt or copy at
// http://www.boost.org/LICENSE_1_0.txt)

/* The following code was generated by JFlex 1.4.3 on 10/18/15 2:42 PM */

package org.boost.build;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import org.boost.build.psi.BBTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/18/15 2:42 PM from the specification file
 * <tt>/Users/grafik/devroots/Boost/clion-b2/src/org/boost/build/BB.flex</tt>
 */
class BBLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int ACTIONS_SCAN_DEF = 4;
  public static final int YYINITIAL = 0;
  public static final int YYSPACE = 2;
  public static final int ACTIONS_SCAN_STRING = 8;
  public static final int ACTIONS_SCAN_DEF_WS = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\13\1\0\1\1\1\3\22\0\1\1\1\14\1\6"+
    "\1\2\2\0\1\16\1\0\1\24\1\25\1\0\1\22\16\0\1\26"+
    "\1\27\1\17\1\15\1\20\1\23\33\0\1\30\1\7\1\31\3\0"+
    "\1\32\1\37\1\33\1\40\1\41\1\45\1\47\1\55\1\34\1\0"+
    "\1\42\1\43\1\50\1\10\1\35\1\51\1\52\1\11\1\36\1\12"+
    "\1\44\1\0\1\54\1\46\1\53\1\0\1\4\1\21\1\5\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\3\1\4\1\5\1\6\3\2"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\2\2\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\14\2\1\23\1\24"+
    "\4\25\1\26\1\27\6\25\1\30\2\1\1\23\2\4"+
    "\1\0\3\2\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\4\2\1\40\1\41\1\42\10\2\1\0\10\25"+
    "\1\1\2\0\1\2\1\0\15\2\1\43\2\2\1\25"+
    "\1\0\10\25\1\1\1\2\1\44\1\2\1\45\6\2"+
    "\1\46\3\2\2\25\1\47\4\25\3\2\1\50\2\2"+
    "\1\51\1\2\1\52\1\2\1\53\6\25\1\54\3\2"+
    "\1\55\1\2\1\56\1\25\1\57\4\25\1\60\1\2"+
    "\1\61\1\62\2\25\1\63\1\25\1\64\1\65\1\66"+
    "\1\67\1\25\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\u0114\0\u0142"+
    "\0\346\0\346\0\u0170\0\u019e\0\u01cc\0\u01fa\0\346\0\u0228"+
    "\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\346\0\346\0\346"+
    "\0\346\0\346\0\346\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4"+
    "\0\u0422\0\u0450\0\u047e\0\u04ac\0\u04da\0\u0508\0\u0536\0\u0564"+
    "\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u05c0\0\u05c0\0\u0678"+
    "\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\346"+
    "\0\346\0\346\0\346\0\346\0\346\0\346\0\u0958\0\u0986"+
    "\0\u09b4\0\u09e2\0\u0a10\0\346\0\346\0\u0a3e\0\u0a6c\0\u0a9a"+
    "\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a"+
    "\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0\0\u0d1e\0\u0d4c\0\u0816"+
    "\0\u0d7a\0\u0564\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\u0e60\0\u0e8e"+
    "\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\u0f74\0\u0fa2\0\u0fd0\0\u0ffe"+
    "\0\346\0\u102c\0\u105a\0\u0564\0\u1088\0\u10b6\0\u10e4\0\u1112"+
    "\0\u1140\0\u116e\0\u119c\0\u11ca\0\u11f8\0\u1226\0\u1254\0\346"+
    "\0\u1282\0\346\0\u12b0\0\u12de\0\u130c\0\u133a\0\u1368\0\u1396"+
    "\0\346\0\u13c4\0\u13f2\0\u1420\0\u144e\0\u147c\0\u05c0\0\u14aa"+
    "\0\u14d8\0\u1506\0\u1534\0\u1562\0\u1590\0\u15be\0\346\0\u15ec"+
    "\0\u161a\0\346\0\u1648\0\346\0\u1676\0\346\0\u16a4\0\u16d2"+
    "\0\u1700\0\u172e\0\u175c\0\u178a\0\346\0\u17b8\0\u17e6\0\u1814"+
    "\0\346\0\u1842\0\346\0\u1870\0\u05c0\0\u189e\0\u18cc\0\u18fa"+
    "\0\u1928\0\346\0\u1956\0\346\0\346\0\u1984\0\u19b2\0\u05c0"+
    "\0\u19e0\0\u05c0\0\346\0\u05c0\0\u05c0\0\u1a0e\0\u05c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\6\1\7\1\10\1\7\1\11\1\12\1\13\1\14"+
    "\1\6\1\15\1\6\1\7\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\6\1\44\1\6\1\45\2\6\1\46"+
    "\3\6\1\47\1\6\1\50\1\51\1\50\1\51\7\50"+
    "\1\51\42\50\1\52\1\50\1\52\1\50\2\52\1\53"+
    "\1\54\2\52\1\55\1\0\14\52\1\56\1\57\2\52"+
    "\1\60\2\52\1\61\1\52\1\62\2\52\1\63\4\52"+
    "\1\64\1\65\3\52\1\50\1\66\1\50\1\66\7\50"+
    "\1\66\42\50\4\67\1\70\1\71\50\67\1\6\1\0"+
    "\1\6\1\0\3\6\1\14\3\6\1\0\42\6\1\0"+
    "\1\7\1\0\1\7\7\0\1\7\42\0\1\10\1\72"+
    "\1\10\1\0\3\10\1\73\3\10\1\0\42\10\1\13"+
    "\1\74\1\13\1\74\2\13\1\6\1\75\3\13\1\74"+
    "\42\13\7\6\1\14\3\6\1\0\43\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\25\6\1\76\2\6"+
    "\1\77\12\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\1\6\1\100\41\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\2\6\1\101\40\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\1\6\1\102\41\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\1\6"+
    "\1\103\41\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\5\6\1\104\35\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\1\6\1\105\41\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\1\6\1\106\41\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\17\6"+
    "\1\107\23\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\16\6\1\110\2\6\1\111\5\6\1\112\13\6"+
    "\1\0\1\6\1\0\3\6\1\14\1\113\2\6\1\0"+
    "\31\6\1\114\11\6\1\0\1\6\1\0\3\6\1\14"+
    "\1\115\2\6\1\0\43\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\40\6\1\116\2\6\1\0\1\6"+
    "\1\0\3\6\1\14\1\6\1\117\1\6\1\0\43\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\25\6"+
    "\1\120\15\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\27\6\1\121\13\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\21\6\1\122\21\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\21\6\1\123\21\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\21\6"+
    "\1\124\21\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\41\6\1\125\57\0\1\51\1\0\1\51\7\0"+
    "\1\51\42\0\1\52\1\0\1\52\1\0\3\52\1\54"+
    "\3\52\1\0\42\52\1\53\1\126\1\53\1\126\2\53"+
    "\1\52\1\127\3\53\1\126\42\53\7\52\1\54\3\52"+
    "\1\0\43\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\21\52\1\130\21\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\33\52\1\131\7\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\20\52\1\132\22\52"+
    "\1\0\1\52\1\0\3\52\1\54\3\52\1\0\32\52"+
    "\1\133\10\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\35\52\1\134\5\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\20\52\1\135\22\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\30\52\1\136\11\52"+
    "\1\0\1\66\1\0\1\66\7\0\1\66\42\0\4\67"+
    "\1\137\1\140\50\67\5\70\1\0\50\70\4\140\1\141"+
    "\51\140\3\72\1\0\7\72\1\0\42\72\3\10\1\6"+
    "\3\10\1\73\3\10\1\0\42\10\6\74\1\142\1\143"+
    "\46\74\7\13\1\144\3\13\1\0\42\13\1\6\1\0"+
    "\1\6\1\0\3\6\1\14\2\6\1\145\1\0\43\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\27\6"+
    "\1\146\13\6\1\0\1\6\1\0\3\6\1\14\2\6"+
    "\1\147\1\0\43\6\1\0\1\6\1\0\3\6\1\14"+
    "\3\6\1\0\22\6\1\150\20\6\1\0\1\6\1\0"+
    "\3\6\1\14\1\151\2\6\1\0\43\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\16\6\1\152\24\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\17\6"+
    "\1\153\23\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\20\6\1\154\22\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\25\6\1\155\15\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\31\6\1\156\11\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\22\6"+
    "\1\157\20\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\17\6\1\160\23\6\1\0\1\6\1\0\3\6"+
    "\1\14\1\6\1\161\1\6\1\0\43\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\24\6\1\162\16\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\20\6"+
    "\1\163\21\6\6\126\1\164\1\165\46\126\7\53\1\166"+
    "\3\53\1\0\42\53\1\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\33\52\1\167\7\52\1\0\1\52"+
    "\1\0\3\52\1\54\1\170\2\52\1\0\43\52\1\0"+
    "\1\52\1\0\3\52\1\54\1\171\2\52\1\0\43\52"+
    "\1\0\1\52\1\0\3\52\1\54\3\52\1\0\20\52"+
    "\1\172\22\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\24\52\1\173\16\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\25\52\1\174\15\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\20\52\1\175\21\52"+
    "\5\137\1\176\50\137\5\141\1\176\50\141\13\74\1\0"+
    "\42\74\6\13\1\6\1\75\3\13\1\74\42\13\1\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\30\6"+
    "\1\177\12\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\25\6\1\200\15\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\20\6\1\201\22\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\25\6\1\202\15\6"+
    "\1\0\1\6\1\0\3\6\1\14\2\6\1\203\1\0"+
    "\43\6\1\0\1\6\1\0\3\6\1\14\3\6\1\0"+
    "\22\6\1\204\20\6\1\0\1\6\1\0\3\6\1\14"+
    "\3\6\1\0\27\6\1\205\13\6\1\0\1\6\1\0"+
    "\3\6\1\14\2\6\1\206\1\0\43\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\16\6\1\207\24\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\16\6"+
    "\1\210\24\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\25\6\1\211\15\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\16\6\1\212\24\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\30\6\1\213\12\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\27\6"+
    "\1\214\12\6\13\126\1\0\42\126\6\53\1\52\1\127"+
    "\3\53\1\126\42\53\1\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\25\52\1\215\15\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\21\52\1\216\21\52"+
    "\1\0\1\52\1\0\3\52\1\54\3\52\1\0\24\52"+
    "\1\217\16\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\22\52\1\220\20\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\16\52\1\221\24\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\17\52\1\222\23\52"+
    "\1\0\1\52\1\0\3\52\1\54\3\52\1\0\25\52"+
    "\1\223\14\52\4\140\1\0\51\140\1\6\1\0\1\6"+
    "\1\0\3\6\1\14\1\6\1\224\1\6\1\0\43\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\21\6"+
    "\1\225\21\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\20\6\1\226\22\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\22\6\1\227\20\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\30\6\1\230\12\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\17\6"+
    "\1\231\23\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\26\6\1\232\14\6\1\0\1\6\1\0\3\6"+
    "\1\14\3\6\1\0\30\6\1\233\12\6\1\0\1\6"+
    "\1\0\3\6\1\14\3\6\1\0\27\6\1\234\13\6"+
    "\1\0\1\6\1\0\3\6\1\14\3\6\1\0\27\6"+
    "\1\235\13\6\1\0\1\6\1\0\3\6\1\14\3\6"+
    "\1\0\25\6\1\236\14\6\1\52\1\0\1\52\1\0"+
    "\3\52\1\54\2\52\1\237\1\0\43\52\1\0\1\52"+
    "\1\0\3\52\1\54\1\52\1\240\1\52\1\0\43\52"+
    "\1\0\1\52\1\0\3\52\1\54\2\52\1\241\1\0"+
    "\43\52\1\0\1\52\1\0\3\52\1\54\2\52\1\242"+
    "\1\0\43\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\25\52\1\243\15\52\1\0\1\52\1\0\3\52"+
    "\1\54\2\52\1\244\1\0\42\52\1\6\1\0\1\6"+
    "\1\0\3\6\1\14\1\245\2\6\1\0\43\6\1\0"+
    "\1\6\1\0\3\6\1\14\1\246\2\6\1\0\43\6"+
    "\1\0\1\6\1\0\3\6\1\14\1\247\2\6\1\0"+
    "\43\6\1\0\1\6\1\0\3\6\1\14\3\6\1\0"+
    "\24\6\1\250\16\6\1\0\1\6\1\0\3\6\1\14"+
    "\3\6\1\0\41\6\1\251\1\6\1\0\1\6\1\0"+
    "\3\6\1\14\3\6\1\0\27\6\1\252\13\6\1\0"+
    "\1\6\1\0\3\6\1\14\3\6\1\0\25\6\1\253"+
    "\14\6\1\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\41\52\1\254\1\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\25\52\1\255\15\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\20\52\1\256\22\52"+
    "\1\0\1\52\1\0\3\52\1\54\3\52\1\0\25\52"+
    "\1\257\15\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\34\52\1\260\6\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\27\52\1\261\12\52\1\6\1\0"+
    "\1\6\1\0\3\6\1\14\3\6\1\0\22\6\1\262"+
    "\20\6\1\0\1\6\1\0\3\6\1\14\3\6\1\0"+
    "\30\6\1\263\12\6\1\0\1\6\1\0\3\6\1\14"+
    "\3\6\1\0\25\6\1\264\15\6\1\0\1\6\1\0"+
    "\3\6\1\14\2\6\1\265\1\0\42\6\1\52\1\0"+
    "\1\52\1\0\3\52\1\54\3\52\1\0\25\52\1\266"+
    "\15\52\1\0\1\52\1\0\3\52\1\54\1\267\2\52"+
    "\1\0\43\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\24\52\1\270\16\52\1\0\1\52\1\0\3\52"+
    "\1\54\3\52\1\0\25\52\1\271\15\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\37\52\1\272\2\52"+
    "\1\6\1\0\1\6\1\0\3\6\1\14\3\6\1\0"+
    "\25\6\1\273\14\6\1\52\1\0\1\52\1\0\3\52"+
    "\1\54\1\52\1\274\1\52\1\0\43\52\1\0\1\52"+
    "\1\0\3\52\1\54\3\52\1\0\33\52\1\275\7\52"+
    "\1\0\1\52\1\0\3\52\1\54\3\52\1\0\16\52"+
    "\1\276\24\52\1\0\1\52\1\0\3\52\1\54\3\52"+
    "\1\0\27\52\1\277\12\52";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6716];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\43\1\1\11\23\1\1\0\31\1\1\0\11\1"+
    "\2\0\1\11\1\0\20\1\1\11\1\0\112\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[191];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  BBLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 52: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.QUIETLY;
          }
        case 57: break;
        case 22: 
          { yybegin(ACTIONS_SCAN_STRING); return BBTypes.LBRACKET;
          }
        case 58: break;
        case 31: 
          { yybegin(YYSPACE); return BBTypes.QUESTION_EQUALS;
          }
        case 59: break;
        case 45: 
          { yybegin(YYSPACE); return BBTypes.SWITCH;
          }
        case 60: break;
        case 32: 
          { yybegin(YYSPACE); return BBTypes.IN;
          }
        case 61: break;
        case 50: 
          { yybegin(YYSPACE); return BBTypes.DEFAULT;
          }
        case 62: break;
        case 26: 
          { yybegin(YYSPACE); return BBTypes.AMPERAMPER;
          }
        case 63: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 64: break;
        case 16: 
          { yybegin(YYSPACE); return BBTypes.SEMIC;
          }
        case 65: break;
        case 8: 
          { yybegin(YYSPACE); return BBTypes.EQUALS;
          }
        case 66: break;
        case 28: 
          { yybegin(YYSPACE); return BBTypes.RANGLE_EQUALS;
          }
        case 67: break;
        case 47: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.IGNORE;
          }
        case 68: break;
        case 30: 
          { yybegin(YYSPACE); return BBTypes.PLUS_EQUALS;
          }
        case 69: break;
        case 17: 
          { yybegin(YYSPACE); return BBTypes.LBRACKET;
          }
        case 70: break;
        case 25: 
          { yybegin(YYSPACE); return BBTypes.BANG_EQUALS;
          }
        case 71: break;
        case 54: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.TOGETHER;
          }
        case 72: break;
        case 36: 
          { yybegin(YYSPACE); return BBTypes.RULE;
          }
        case 73: break;
        case 34: 
          { yybegin(YYSPACE); return BBTypes.ON;
          }
        case 74: break;
        case 44: 
          { yybegin(YYSPACE); return BBTypes.RETURN;
          }
        case 75: break;
        case 38: 
          { yybegin(YYSPACE); return BBTypes.ELSE;
          }
        case 76: break;
        case 51: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.UPDATED;
          }
        case 77: break;
        case 37: 
          { yybegin(YYSPACE); return BBTypes.CASE;
          }
        case 78: break;
        case 39: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.BIND;
          }
        case 79: break;
        case 15: 
          { yybegin(YYSPACE); return BBTypes.COLON;
          }
        case 80: break;
        case 23: 
          { yybegin(YYINITIAL); return BBTypes.RBRACKET;
          }
        case 81: break;
        case 9: 
          { yybegin(YYSPACE); return BBTypes.AMPER;
          }
        case 82: break;
        case 24: 
          { yybegin(ACTIONS_SCAN_DEF); return TokenType.WHITE_SPACE;
          }
        case 83: break;
        case 20: 
          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
          }
        case 84: break;
        case 4: 
          { return BBTypes.COMMENT;
          }
        case 85: break;
        case 19: 
          { return TokenType.BAD_CHARACTER;
          }
        case 86: break;
        case 13: 
          { yybegin(YYSPACE); return BBTypes.LPAREN;
          }
        case 87: break;
        case 14: 
          { yybegin(YYSPACE); return BBTypes.RPAREN;
          }
        case 88: break;
        case 46: 
          { yybegin(YYSPACE); return BBTypes.MODULE;
          }
        case 89: break;
        case 21: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.ARG;
          }
        case 90: break;
        case 12: 
          { yybegin(YYSPACE); return BBTypes.BAR;
          }
        case 91: break;
        case 35: 
          { yybegin(YYSPACE); return BBTypes.FOR;
          }
        case 92: break;
        case 7: 
          { yybegin(YYSPACE); return BBTypes.BANG;
          }
        case 93: break;
        case 56: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.PIECEMEAL;
          }
        case 94: break;
        case 33: 
          { yybegin(YYSPACE); return BBTypes.IF;
          }
        case 95: break;
        case 40: 
          { yybegin(YYSPACE); return BBTypes.CLASS;
          }
        case 96: break;
        case 42: 
          { yybegin(YYSPACE); return BBTypes.LOCAL;
          }
        case 97: break;
        case 1: 
          { yybegin(ACTIONS_SCAN_DEF); return BBTypes.STRING;
          }
        case 98: break;
        case 29: 
          { yybegin(YYSPACE); return BBTypes.BARBAR;
          }
        case 99: break;
        case 43: 
          { yybegin(YYSPACE); return BBTypes.WHILE;
          }
        case 100: break;
        case 27: 
          { yybegin(YYSPACE); return BBTypes.LANGLE_EQUALS;
          }
        case 101: break;
        case 49: 
          { yybegin(YYSPACE); return BBTypes.INCLUDE;
          }
        case 102: break;
        case 18: 
          { yybegin(YYSPACE); return BBTypes.RBRACKET;
          }
        case 103: break;
        case 2: 
          { yybegin(YYSPACE); return BBTypes.ARG;
          }
        case 104: break;
        case 55: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.EXISTING;
          }
        case 105: break;
        case 10: 
          { yybegin(YYSPACE); return BBTypes.LANGLE;
          }
        case 106: break;
        case 5: 
          { yybegin(YYSPACE); return BBTypes.LBRACE;
          }
        case 107: break;
        case 41: 
          { yybegin(YYSPACE); return BBTypes.BREAK;
          }
        case 108: break;
        case 53: 
          { yybegin(YYSPACE); return BBTypes.CONTINUE;
          }
        case 109: break;
        case 11: 
          { yybegin(YYSPACE); return BBTypes.RANGLE;
          }
        case 110: break;
        case 6: 
          { yybegin(YYSPACE); return BBTypes.RBRACE;
          }
        case 111: break;
        case 48: 
          { yybegin(ACTIONS_SCAN_DEF_WS); return BBTypes.ACTIONS;
          }
        case 112: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
