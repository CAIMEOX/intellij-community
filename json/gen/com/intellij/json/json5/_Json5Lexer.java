/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package com.intellij.json.json5;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.intellij.json.JsonElementTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_Json5Lexer.flex</tt>
 */
public class _Json5Lexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 13376 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\2\21\1\50\4\21\1\25\1\51\1\52\5\21\2\25\1\53\31\21\1\25\1\54\1\21"+
    "\1\55\40\21\1\56\17\21\1\57\1\60\1\61\1\62\13\21\1\63\10\21\123\25\1\64\7"+
    "\25\1\65\1\66\37\21\1\25\1\66\u0582\21\1\67\u017f\21");

  /* The ZZ_CMAP_Y table has 3584 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\0\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\3\0\1\17\1\20\1\21\1\22\2\0\1\23\3\0\1\23\71\0\1\24\1\0\1\25\1\26\1\27\1"+
    "\30\2\26\16\0\1\31\1\32\1\33\1\34\2\0\1\35\11\0\1\36\21\0\1\35\1\37\23\0\1"+
    "\26\1\40\3\0\1\23\1\41\1\40\4\0\1\42\1\40\4\0\1\36\1\43\1\26\3\0\2\44\1\26"+
    "\1\27\1\45\1\0\1\44\11\0\1\24\14\0\1\46\1\36\1\0\1\47\1\0\1\50\1\26\1\42\7"+
    "\0\1\51\14\0\1\25\1\26\6\0\1\52\1\22\5\0\1\52\2\26\3\0\1\2\10\26\1\47\1\27"+
    "\6\26\1\53\2\0\1\23\14\0\1\54\1\0\2\40\1\55\1\50\1\56\2\0\1\47\1\57\1\60\1"+
    "\50\1\61\1\42\1\62\1\54\1\0\1\2\1\45\1\55\1\63\1\56\2\0\1\47\1\64\1\65\1\63"+
    "\1\66\1\41\1\67\1\70\1\0\1\52\1\26\1\55\1\36\1\35\2\0\1\47\1\71\1\60\1\36"+
    "\1\72\1\73\1\26\1\54\1\0\1\41\1\26\1\55\1\50\1\56\2\0\1\47\1\71\1\60\1\50"+
    "\1\66\1\70\1\62\1\54\1\0\1\41\1\26\1\74\1\75\1\76\1\77\1\100\1\75\1\0\1\24"+
    "\1\75\1\76\1\101\1\26\1\70\1\0\1\26\1\41\1\55\1\31\1\47\2\0\1\47\1\46\1\102"+
    "\1\31\1\76\1\103\1\25\1\54\1\0\2\26\1\74\1\31\1\47\2\0\1\47\1\46\1\60\1\31"+
    "\1\76\1\103\1\33\1\54\1\0\1\104\1\26\1\74\1\31\1\47\4\0\1\51\1\31\1\105\1"+
    "\42\1\26\1\54\1\0\1\26\1\37\1\74\1\0\1\23\1\37\2\0\1\35\1\106\1\23\1\107\1"+
    "\110\1\0\2\26\1\111\1\26\1\40\6\0\1\63\1\0\1\23\1\0\1\25\4\26\1\112\1\113"+
    "\1\53\1\40\1\114\1\74\1\0\1\72\1\110\1\52\1\0\1\60\4\26\1\73\2\26\1\25\1\0"+
    "\1\25\1\115\1\116\1\0\1\40\3\0\1\27\1\40\1\0\1\31\2\0\1\40\3\0\1\27\1\33\7"+
    "\26\11\0\1\25\11\0\1\52\4\0\1\36\1\21\5\0\1\117\51\0\1\76\1\23\1\76\5\0\1"+
    "\76\4\0\1\76\1\23\1\76\1\0\1\23\7\0\1\76\10\0\1\51\4\26\2\0\2\26\12\0\1\27"+
    "\1\26\1\40\114\0\1\50\2\0\1\120\2\0\1\44\11\0\1\75\1\73\1\26\1\0\1\31\1\27"+
    "\1\26\2\0\1\27\1\26\2\0\1\2\1\26\1\0\1\31\1\121\1\26\12\0\1\122\1\123\1\0"+
    "\1\25\3\26\1\123\1\0\1\25\13\0\1\26\5\0\1\44\10\0\1\52\1\26\3\0\1\27\1\0\1"+
    "\2\1\0\1\2\1\70\4\0\1\52\1\27\1\26\5\0\1\2\3\0\1\25\1\0\1\25\4\26\3\0\1\2"+
    "\7\0\1\23\3\0\1\50\1\0\1\25\1\0\1\25\1\42\13\26\11\0\1\2\1\0\1\25\1\26\1\124"+
    "\1\2\1\26\16\0\1\2\1\26\7\0\1\26\1\0\1\102\5\0\1\52\12\26\1\117\3\0\1\23\1"+
    "\26\34\0\1\23\2\26\1\53\42\0\2\52\4\0\2\52\1\0\1\125\3\0\1\52\6\0\1\31\1\110"+
    "\1\126\1\27\1\54\1\2\1\0\1\27\1\126\1\27\1\127\1\130\3\26\1\131\1\26\1\42"+
    "\1\73\1\26\1\132\1\133\1\27\1\37\1\41\1\42\2\26\1\0\1\27\3\0\1\44\2\26\1\0"+
    "\1\27\1\134\1\0\1\73\1\26\1\107\1\37\1\106\1\135\1\30\1\136\1\0\1\60\1\137"+
    "\1\140\2\26\5\0\1\73\116\26\5\0\1\23\5\0\1\23\20\0\1\27\1\124\1\2\1\26\4\0"+
    "\1\36\1\21\7\0\1\42\1\26\1\42\2\0\1\23\1\26\10\23\4\0\5\26\1\42\72\26\1\141"+
    "\3\26\1\40\1\0\1\135\1\27\1\40\11\0\1\23\1\142\1\40\12\0\1\117\1\137\4\0\1"+
    "\52\1\40\12\0\1\23\2\26\3\0\1\44\6\26\170\0\1\52\11\26\71\0\1\27\6\26\21\0"+
    "\1\27\10\26\5\0\1\52\41\0\1\27\3\0\1\2\2\26\6\0\1\53\1\36\3\0\1\42\12\0\1"+
    "\25\3\26\1\42\1\0\1\37\14\0\1\61\1\2\1\26\1\0\1\44\11\26\6\0\2\26\1\73\6\0"+
    "\1\2\1\26\10\0\1\27\1\26\1\0\1\25\3\0\1\45\5\0\1\52\4\0\1\2\1\26\3\0\1\27"+
    "\10\0\1\73\1\42\1\0\1\25\4\26\6\0\1\23\1\26\1\0\1\52\1\0\1\25\2\0\1\23\1\111"+
    "\10\0\1\44\2\26\1\123\2\0\1\143\1\26\3\144\1\26\2\23\22\26\5\0\1\145\1\0\1"+
    "\25\64\0\1\2\1\26\2\0\1\23\1\124\5\0\1\2\40\26\55\0\1\52\15\0\1\25\4\26\1"+
    "\23\1\26\1\124\1\137\1\0\1\47\1\23\1\110\1\146\15\0\1\25\3\26\1\124\54\0\1"+
    "\52\2\26\10\0\1\37\6\0\5\26\1\0\1\27\2\0\2\26\1\23\1\26\1\100\2\26\1\137\3"+
    "\26\1\41\1\31\20\0\1\50\1\132\1\26\1\0\1\25\1\40\2\0\1\63\1\40\2\0\1\44\1"+
    "\70\12\0\1\23\3\37\1\147\1\150\2\26\1\151\1\0\1\46\2\0\1\23\2\0\1\152\1\0"+
    "\1\52\1\0\1\52\4\26\17\0\1\44\10\26\6\0\1\27\20\26\1\21\20\26\3\0\1\27\6\0"+
    "\1\73\5\26\3\0\1\23\2\26\3\0\1\44\6\26\3\0\1\52\4\0\1\2\1\0\1\135\5\26\23"+
    "\0\1\52\1\0\1\25\52\26\1\52\1\47\4\0\1\36\1\153\2\0\1\52\25\26\2\0\1\52\1"+
    "\26\3\0\1\25\10\26\7\0\1\70\10\26\1\154\1\53\1\46\1\40\2\0\1\2\1\63\4\26\3"+
    "\0\1\27\20\26\6\0\1\52\1\26\2\0\1\52\1\26\2\0\1\44\21\26\11\0\1\73\66\26\10"+
    "\0\1\23\3\26\1\70\1\0\2\26\7\0\1\155\2\26\3\0\1\73\1\0\1\25\6\0\1\31\1\0\10"+
    "\26\10\0\1\27\1\26\1\0\1\25\24\26\7\0\1\26\1\0\1\25\46\26\55\0\1\23\22\26"+
    "\14\0\1\44\63\26\5\0\1\23\72\26\7\0\1\73\130\26\10\0\1\27\1\26\5\0\1\23\1"+
    "\26\1\42\2\0\14\26\1\25\153\26\1\137\1\102\2\0\1\51\1\2\3\26\1\32\22\26\1"+
    "\147\67\26\12\0\1\31\10\0\1\31\1\156\1\157\1\0\1\160\1\46\7\0\1\36\1\51\2"+
    "\31\3\0\1\161\1\110\1\37\1\47\51\0\1\52\3\0\1\47\2\0\1\117\3\0\1\117\2\0\1"+
    "\31\3\0\1\31\2\0\1\23\3\0\1\23\3\0\1\47\3\0\1\47\2\0\1\117\1\54\6\0\1\46\3"+
    "\0\1\112\1\40\1\117\1\162\1\107\1\163\1\112\1\125\1\112\2\117\1\67\1\0\1\35"+
    "\1\0\1\2\1\55\1\35\1\0\1\2\50\26\32\0\1\23\5\26\106\0\1\27\1\26\33\0\1\52"+
    "\74\26\1\41\3\26\14\0\20\26\36\0\2\26");

  /* The ZZ_CMAP_A table has 928 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\35\1\12\1\2\1\1\1\7\1\3\6\35\4\0\1\12\1\35\1\13\1\0\1\35\2\0\1\15\2\35"+
    "\1\11\1\16\1\42\1\17\1\22\1\6\1\20\11\21\1\43\1\0\3\35\1\0\1\35\4\5\1\23\1"+
    "\5\2\35\1\25\4\35\1\33\1\35\1\24\2\35\1\40\1\14\1\41\2\35\1\0\1\34\3\5\1\46"+
    "\1\27\2\35\1\30\2\35\1\47\1\35\1\26\3\35\1\44\1\50\1\31\1\45\2\35\1\24\1\32"+
    "\1\35\1\36\1\0\1\37\7\35\1\10\2\35\1\4\1\0\4\35\4\0\1\35\2\0\1\35\7\0\1\35"+
    "\4\0\1\35\5\0\7\35\1\0\2\35\4\0\4\35\16\0\5\35\7\0\1\35\1\0\1\35\1\0\5\35"+
    "\1\0\2\35\2\0\4\35\10\0\1\35\1\0\3\35\1\0\1\35\1\0\4\35\1\0\13\35\1\0\1\35"+
    "\2\0\6\35\1\0\7\35\1\0\1\35\15\0\1\35\1\0\2\35\1\0\2\35\1\0\4\35\10\0\1\35"+
    "\4\0\4\35\1\0\4\35\1\0\13\35\2\0\4\35\2\0\11\35\6\0\10\35\2\0\2\35\1\0\3\35"+
    "\1\0\4\35\2\0\6\35\1\0\1\35\3\0\4\35\2\0\5\35\2\0\4\35\5\0\2\35\1\0\4\35\4"+
    "\0\2\35\1\0\2\35\1\0\2\35\1\0\2\35\2\0\1\35\1\0\3\35\2\0\3\35\3\0\4\35\1\0"+
    "\1\35\7\0\3\35\1\0\2\35\1\0\5\35\1\0\3\35\2\0\1\35\11\0\2\35\1\0\6\35\3\0"+
    "\3\35\1\0\4\35\3\0\2\35\1\0\1\35\1\0\2\35\3\0\2\35\3\0\1\35\6\0\3\35\3\0\3"+
    "\35\5\0\2\35\2\0\2\35\5\0\1\35\1\0\5\35\1\0\4\35\1\0\1\35\4\0\1\35\4\0\6\35"+
    "\1\0\1\35\3\0\2\35\5\0\2\35\1\0\1\35\2\0\2\35\1\0\1\35\2\0\1\35\3\0\3\35\1"+
    "\0\1\35\1\0\1\35\5\0\1\35\1\0\1\35\1\0\1\35\4\0\5\35\1\0\4\35\1\4\10\35\1"+
    "\0\2\35\4\0\4\35\3\0\1\35\3\0\3\35\5\0\5\35\1\0\1\35\1\0\1\35\1\0\1\35\1\0"+
    "\1\35\2\0\3\35\1\0\2\35\13\4\5\35\2\1\5\35\1\4\4\0\1\35\12\0\1\4\1\0\1\35"+
    "\3\0\3\35\1\0\5\35\2\0\1\35\1\0\4\35\1\0\1\35\5\0\5\35\4\0\1\35\1\0\1\4\4"+
    "\0\3\35\1\0\2\35\2\0\3\35\2\0\5\35\2\0\6\35\1\0\3\35\1\0\2\35\2\0\2\35\1\0"+
    "\2\35\1\0\2\35\2\0\3\35\3\0\2\35\3\0\2\35\2\0\3\35\4\0\3\35\1\0\2\35\1\0\2"+
    "\35\3\0\1\35\2\0\5\35\1\0\2\35\1\0\3\35\2\0\1\35\4\0\1\35\2\0\2\35\2\0\4\35"+
    "\1\0\4\35\1\0\1\35\1\0\5\35\1\0\4\35\2\0\1\35\1\0\1\35\5\0\1\35\1\0\1\35\1"+
    "\0\3\35");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\2\4\1\3\1\5\1\6\6\1"+
    "\5\4\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\5\2\0\1\6\4\1\2\0\1\1\1\4"+
    "\2\1\5\4\1\15\1\16\1\4\2\5\2\6\2\0"+
    "\1\1\4\4\1\1\1\0\1\16\1\0\1\1\1\4"+
    "\1\17\1\4\1\20\1\16\1\0\1\4\1\21\1\0"+
    "\1\4\1\0\1\4\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
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
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\366\0\u011f"+
    "\0\u0148\0\u0171\0\u019a\0\u01c3\0\u01ec\0\u0215\0\u023e\0\u0267"+
    "\0\u0290\0\u02b9\0\u02e2\0\51\0\51\0\51\0\51\0\51"+
    "\0\51\0\u030b\0\u0334\0\51\0\u035d\0\u0386\0\51\0\u03af"+
    "\0\u03d8\0\u0401\0\u042a\0\u0453\0\u047c\0\u04a5\0\u04ce\0\u04f7"+
    "\0\u0520\0\u0549\0\u0572\0\u059b\0\u05c4\0\u05ed\0\u0616\0\u063f"+
    "\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\u04ce"+
    "\0\u0787\0\u07b0\0\u07d9\0\u0802\0\173\0\u082b\0\173\0\u0854"+
    "\0\51\0\u087d\0\173\0\u08a6\0\173\0\51\0\u08cf\0\u08f8"+
    "\0\173\0\u0921\0\u094a\0\u0973\0\u099c\0\u09c5";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
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
    "\1\2\4\3\1\4\1\5\1\3\1\6\1\4\1\3"+
    "\1\7\1\2\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\4\1\17\1\20\1\21\1\4\1\22\1\4"+
    "\1\23\2\4\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\2\4\1\16\2\4\52\0\4\3\2\0\2\3\1\0"+
    "\1\3\43\0\2\4\1\0\2\4\5\0\17\4\6\0"+
    "\5\4\5\0\1\4\1\32\1\0\1\4\1\33\5\0"+
    "\17\4\6\0\5\4\1\0\4\3\2\4\1\3\1\6"+
    "\1\4\1\3\4\0\17\4\6\0\5\4\2\7\2\0"+
    "\7\7\1\34\1\35\34\7\2\10\2\0\10\10\1\36"+
    "\1\37\33\10\20\0\1\40\1\41\1\42\1\43\1\0"+
    "\1\44\5\0\1\45\12\0\1\43\7\0\2\4\1\0"+
    "\2\4\5\0\1\4\1\46\1\14\1\15\1\16\1\4"+
    "\1\17\5\4\1\23\2\4\6\0\2\4\1\16\2\4"+
    "\5\0\2\4\1\0\2\4\5\0\1\4\3\15\1\16"+
    "\1\47\11\4\6\0\2\4\1\16\2\4\5\0\2\4"+
    "\1\0\2\4\5\0\1\4\2\14\1\15\1\16\12\4"+
    "\6\0\2\4\1\16\2\4\5\0\2\4\1\0\2\4"+
    "\5\0\1\4\2\15\1\4\1\16\12\4\6\0\2\4"+
    "\1\16\2\4\5\0\2\4\1\0\2\4\4\0\1\50"+
    "\3\51\14\4\6\0\5\4\5\0\2\4\1\0\2\4"+
    "\5\0\7\4\1\52\7\4\6\0\5\4\5\0\2\4"+
    "\1\0\2\4\5\0\17\4\6\0\1\4\1\53\3\4"+
    "\5\0\2\4\1\0\2\4\5\0\15\4\1\54\1\4"+
    "\6\0\5\4\5\0\2\4\1\0\2\4\5\0\17\4"+
    "\6\0\1\55\4\4\5\0\2\4\1\0\2\4\5\0"+
    "\15\4\1\56\1\4\6\0\5\4\1\57\3\0\1\57"+
    "\2\32\1\0\1\4\1\32\5\57\17\32\6\57\5\32"+
    "\5\60\2\33\1\60\1\33\1\61\5\60\17\33\6\60"+
    "\5\33\3\7\1\62\3\7\1\63\2\7\1\63\36\7"+
    "\3\10\1\64\3\10\1\65\2\10\1\65\36\10\20\0"+
    "\3\42\1\43\22\0\1\43\22\0\2\41\1\42\1\43"+
    "\22\0\1\43\22\0\2\42\1\0\1\43\22\0\1\43"+
    "\20\0\4\50\55\0\1\66\56\0\1\67\21\0\2\4"+
    "\1\0\2\4\5\0\1\4\3\15\1\16\12\4\6\0"+
    "\2\4\1\16\2\4\5\0\1\70\1\4\1\0\2\4"+
    "\5\0\1\4\2\70\1\4\1\70\3\4\1\70\4\4"+
    "\1\70\1\4\6\0\2\4\1\70\2\4\20\0\2\50"+
    "\34\0\2\4\1\0\2\4\5\0\1\4\2\51\14\4"+
    "\6\0\5\4\5\0\2\4\1\0\2\4\5\0\10\4"+
    "\1\71\6\4\6\0\5\4\5\0\2\4\1\0\2\4"+
    "\5\0\17\4\6\0\3\4\1\72\1\4\5\0\2\4"+
    "\1\0\2\4\5\0\17\4\6\0\3\4\1\73\1\4"+
    "\5\0\2\4\1\0\2\4\5\0\17\4\6\0\1\4"+
    "\1\74\3\4\5\0\2\4\1\0\2\4\5\0\14\4"+
    "\1\75\2\4\6\0\5\4\1\57\3\0\3\57\2\0"+
    "\40\57\11\60\1\76\44\60\1\33\1\77\1\60\1\33"+
    "\1\61\5\60\17\33\6\60\5\33\3\7\1\0\7\7"+
    "\1\34\1\35\37\7\1\62\3\7\1\63\2\7\1\63"+
    "\1\34\1\35\34\7\3\10\1\0\10\10\1\36\1\37"+
    "\36\10\1\64\3\10\1\65\2\10\1\65\1\10\1\36"+
    "\1\37\33\10\27\0\1\100\54\0\1\101\22\0\2\4"+
    "\1\0\2\4\5\0\11\4\1\102\5\4\6\0\5\4"+
    "\5\0\2\4\1\0\2\4\5\0\17\4\6\0\3\4"+
    "\1\103\1\4\5\0\2\4\1\0\2\4\5\0\17\4"+
    "\6\0\4\4\1\104\5\0\2\4\1\0\2\4\5\0"+
    "\17\4\6\0\2\4\1\105\2\4\6\60\1\106\2\60"+
    "\1\76\37\60\30\0\1\107\25\0\2\4\1\0\2\4"+
    "\5\0\7\4\1\110\7\4\6\0\5\4\5\0\2\4"+
    "\1\0\2\4\5\0\17\4\6\0\2\4\1\111\2\4"+
    "\26\0\1\112\27\0\2\4\1\0\2\4\5\0\11\4"+
    "\1\113\5\4\6\0\5\4\30\0\1\114\25\0\2\4"+
    "\1\0\2\4\5\0\12\4\1\115\4\4\6\0\5\4"+
    "\31\0\1\116\24\0\2\4\1\0\2\4\5\0\13\4"+
    "\1\75\3\4\6\0\5\4\32\0\1\101\16\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2542];
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

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\21\1\6\11\2\1\1\11\2\0\1\11"+
    "\4\1\2\0\20\1\2\0\6\1\1\0\1\1\1\0"+
    "\1\11\4\1\1\11\1\0\2\1\1\0\1\1\1\0"+
    "\1\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

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

  /* user code: */
  public _Json5Lexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _Json5Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
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
    return zzBuffer.charAt(zzStartRead+pos);
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

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return NUMBER;
            } 
            // fall through
          case 18: break;
          case 2: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 19: break;
          case 3: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 20: break;
          case 4: 
            { return IDENTIFIER;
            } 
            // fall through
          case 21: break;
          case 5: 
            { return DOUBLE_QUOTED_STRING;
            } 
            // fall through
          case 22: break;
          case 6: 
            { return SINGLE_QUOTED_STRING;
            } 
            // fall through
          case 23: break;
          case 7: 
            { return L_CURLY;
            } 
            // fall through
          case 24: break;
          case 8: 
            { return R_CURLY;
            } 
            // fall through
          case 25: break;
          case 9: 
            { return L_BRACKET;
            } 
            // fall through
          case 26: break;
          case 10: 
            { return R_BRACKET;
            } 
            // fall through
          case 27: break;
          case 11: 
            { return COMMA;
            } 
            // fall through
          case 28: break;
          case 12: 
            { return COLON;
            } 
            // fall through
          case 29: break;
          case 13: 
            { return LINE_COMMENT;
            } 
            // fall through
          case 30: break;
          case 14: 
            { return BLOCK_COMMENT;
            } 
            // fall through
          case 31: break;
          case 15: 
            { return NULL;
            } 
            // fall through
          case 32: break;
          case 16: 
            { return TRUE;
            } 
            // fall through
          case 33: break;
          case 17: 
            { return FALSE;
            } 
            // fall through
          case 34: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
