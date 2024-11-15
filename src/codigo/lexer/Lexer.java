/* The following code was generated by JFlex 1.4.3 on 7/11/24, 04:14 */

package codigo;
import static codigo.TokenType.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/11/24, 04:14 from the specification file
 * <tt>C:/AnalizadorLexicoNetBeans/AnalizadorLexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\46\1\7\2\0"+
    "\1\51\1\44\1\0\1\53\1\54\1\6\1\42\1\3\1\43\1\66"+
    "\1\4\1\63\7\65\2\2\1\61\1\62\1\50\1\41\1\47\2\0"+
    "\4\64\1\67\1\64\14\1\1\30\7\1\1\57\1\0\1\60\1\52"+
    "\1\1\1\0\1\20\1\10\1\16\1\26\1\13\1\25\1\24\1\17"+
    "\1\14\1\1\1\34\1\22\1\33\1\15\1\23\1\37\1\1\1\21"+
    "\1\31\1\12\1\27\1\40\1\32\1\35\1\11\1\36\1\55\1\45"+
    "\1\56\1\52\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\21\2\1\11\1\12\1\13\2\14\1\15\2\16"+
    "\1\1\1\14\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\3\1\0\1\4\1\27\1\30\10\2"+
    "\1\31\12\2\1\32\11\2\1\16\1\33\1\15\2\0"+
    "\1\34\3\0\7\2\1\35\11\2\1\36\17\2\1\0"+
    "\1\37\1\0\1\4\2\2\1\40\1\41\1\42\20\2"+
    "\1\43\1\2\1\3\1\44\1\0\11\2\1\45\2\2"+
    "\1\46\1\2\1\47\2\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
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
    "\0\0\0\70\0\160\0\250\0\340\0\u0118\0\70\0\u0150"+
    "\0\70\0\u0188\0\u01c0\0\u01f8\0\u0230\0\u0268\0\u02a0\0\u02d8"+
    "\0\u0310\0\u0348\0\u0380\0\u03b8\0\u03f0\0\u0428\0\u0460\0\u0498"+
    "\0\u04d0\0\u0508\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0540"+
    "\0\u0658\0\u0690\0\u0150\0\70\0\u06c8\0\70\0\70\0\70"+
    "\0\70\0\70\0\70\0\70\0\u0700\0\u0738\0\u0770\0\u07a8"+
    "\0\70\0\u07e0\0\u0818\0\u0850\0\u0888\0\u08c0\0\u08f8\0\u0930"+
    "\0\u0968\0\160\0\u09a0\0\u09d8\0\u0a10\0\u0a48\0\u0a80\0\u0ab8"+
    "\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08\0\u0c40\0\u0c78"+
    "\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58\0\u0d90\0\u0dc8\0\70\0\70"+
    "\0\70\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u07a8\0\u0ee0\0\u0f18"+
    "\0\u0f50\0\u0f88\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\160\0\u10a0"+
    "\0\u10d8\0\u1110\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u1228\0\u1260"+
    "\0\160\0\u1298\0\u12d0\0\u1308\0\u1340\0\u1378\0\u13b0\0\u13e8"+
    "\0\u1420\0\u1458\0\u1490\0\u14c8\0\u1500\0\u1538\0\u1570\0\u15a8"+
    "\0\u15e0\0\u0e38\0\u1618\0\70\0\u1650\0\u1688\0\160\0\160"+
    "\0\160\0\u16c0\0\u16f8\0\u1730\0\u1768\0\u17a0\0\u17d8\0\u1810"+
    "\0\u1848\0\u1880\0\u18b8\0\u18f0\0\u1928\0\u1960\0\u1998\0\u19d0"+
    "\0\u1a08\0\160\0\u1a40\0\70\0\u1a78\0\u1a78\0\u1ab0\0\u1ae8"+
    "\0\u1b20\0\u1b58\0\u1b90\0\u1bc8\0\u1c00\0\u1c38\0\u1c70\0\160"+
    "\0\u1ca8\0\u1ce0\0\160\0\u1d18\0\160\0\u1d50\0\u1d88";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\3\1\16\1\3"+
    "\1\17\1\20\1\21\1\3\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\4\3\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\3\1\4\1\2\1\3\71\0\2\3\5\0"+
    "\31\3\22\0\3\3\1\0\1\3\2\0\1\4\60\0"+
    "\1\4\1\0\1\4\1\56\4\0\1\5\70\0\1\57"+
    "\1\0\1\60\32\0\1\61\67\0\1\61\27\0\2\3"+
    "\5\0\1\3\1\62\7\3\1\63\17\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\1\3\1\64\7\3"+
    "\1\65\17\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\5\3\1\66\4\3\1\67\12\3\1\70\3\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\5\3"+
    "\1\71\7\3\1\72\13\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\7\3\1\73\1\74\2\3\1\75"+
    "\15\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\17\3\1\76\11\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\3\3\1\77\25\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\13\3\1\100\15\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\13\3\1\76"+
    "\15\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\10\3\1\101\1\3\1\102\1\103\15\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\3\3\1\104\7\3"+
    "\1\105\15\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\5\3\1\106\23\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\2\3\1\107\26\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\2\3\1\110\1\3"+
    "\1\111\2\3\1\112\12\3\1\113\6\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\7\3\1\114\21\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\10\3"+
    "\1\115\20\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\13\3\1\116\15\3\22\0\3\3\1\0\1\3"+
    "\41\0\1\117\67\0\1\61\1\120\66\0\1\61\1\0"+
    "\1\120\70\0\1\121\70\0\1\121\63\0\1\117\5\0"+
    "\1\117\61\0\1\117\6\0\1\117\62\0\1\122\26\0"+
    "\1\4\32\0\1\123\25\0\1\124\1\0\1\124\1\56"+
    "\3\0\1\125\60\0\1\125\1\0\1\125\2\0\5\57"+
    "\1\0\62\57\6\126\1\127\61\126\1\0\2\3\5\0"+
    "\2\3\1\130\26\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\3\3\1\131\25\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\27\3\1\132\1\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\17\3\1\133"+
    "\11\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\17\3\1\134\11\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\21\3\1\135\7\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\2\3\1\136\26\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\2\3\1\137"+
    "\26\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\10\3\1\140\20\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\21\3\1\141\7\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\5\3\1\142\23\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\2\3\1\143"+
    "\26\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\2\3\1\144\11\3\1\145\14\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\5\3\1\146\23\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\12\3\1\147"+
    "\16\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\13\3\1\150\15\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\11\3\1\151\17\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\15\3\1\152\13\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\17\3\1\153"+
    "\11\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\4\3\1\154\14\3\1\155\7\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\11\3\1\156\17\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\10\3\1\157"+
    "\1\160\17\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\14\3\1\161\11\3\1\162\2\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\13\3\1\163\15\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\4\3"+
    "\1\164\24\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\4\3\1\165\24\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\4\3\1\166\24\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\4\3\1\167\5\3"+
    "\1\170\16\3\22\0\3\3\1\0\1\3\2\0\1\171"+
    "\60\0\1\171\1\0\1\171\4\0\1\172\5\0\1\172"+
    "\2\0\1\172\2\0\1\172\1\0\1\172\4\0\2\172"+
    "\34\0\3\172\1\0\1\172\2\0\1\4\60\0\1\124"+
    "\1\0\1\124\1\56\3\0\1\125\10\0\1\173\47\0"+
    "\1\125\1\0\1\125\1\0\1\173\4\126\1\174\1\126"+
    "\1\127\61\126\1\0\2\3\5\0\3\3\1\137\25\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\10\3"+
    "\1\175\20\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\3\3\1\176\25\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\3\3\1\177\25\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\23\3\1\200\5\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\3\3"+
    "\1\201\25\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\3\3\1\202\25\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\11\3\1\137\17\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\3\3\1\200\25\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\2\3"+
    "\1\203\16\3\1\204\7\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\13\3\1\200\15\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\17\3\1\205\11\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\4\3"+
    "\1\206\24\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\14\3\1\137\14\3\22\0\3\3\1\0\1\3"+
    "\1\0\2\3\5\0\21\3\1\133\7\3\22\0\3\3"+
    "\1\0\1\3\1\0\2\3\5\0\10\3\1\71\20\3"+
    "\22\0\3\3\1\0\1\3\1\0\2\3\5\0\10\3"+
    "\1\207\20\3\22\0\3\3\1\0\1\3\1\0\2\3"+
    "\5\0\1\210\30\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\13\3\1\211\15\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\4\3\1\212\24\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\4\3\1\213"+
    "\24\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\2\3\1\214\26\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\17\3\1\215\11\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\5\3\1\216\23\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\3\3\1\217"+
    "\25\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\11\3\1\204\17\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\2\3\1\220\26\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\12\3\1\221\16\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\5\3\1\222"+
    "\23\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\16\3\1\200\12\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\10\3\1\223\20\3\22\0\3\3\1\0"+
    "\1\3\2\0\1\171\51\0\1\224\6\0\1\171\1\0"+
    "\1\171\4\0\1\225\37\0\2\226\17\0\1\225\1\0"+
    "\1\225\3\0\2\3\5\0\24\3\1\200\4\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\16\3\1\227"+
    "\12\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\11\3\1\211\17\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\4\3\1\230\24\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\2\3\1\200\26\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\11\3\1\231"+
    "\17\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\21\3\1\232\7\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\17\3\1\233\11\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\12\3\1\130\16\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\5\3\1\200"+
    "\23\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\14\3\1\161\14\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\5\3\1\234\23\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\4\3\1\235\24\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\6\3\1\204"+
    "\22\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\3\3\1\167\25\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\13\3\1\236\15\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\6\3\1\237\22\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\3\3\1\240"+
    "\25\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\2\3\1\241\26\3\22\0\3\3\1\0\1\3\2\0"+
    "\1\225\60\0\1\225\1\0\1\225\3\0\2\3\5\0"+
    "\3\3\1\236\25\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\5\3\1\242\23\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\5\3\1\243\23\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\2\3\1\244"+
    "\26\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\12\3\1\204\16\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\14\3\1\245\14\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\6\3\1\200\22\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\15\3\1\200"+
    "\13\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\7\3\1\200\21\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\4\3\1\246\24\3\22\0\3\3\1\0"+
    "\1\3\1\0\2\3\5\0\17\3\1\141\11\3\22\0"+
    "\3\3\1\0\1\3\1\0\2\3\5\0\3\3\1\247"+
    "\25\3\22\0\3\3\1\0\1\3\1\0\2\3\5\0"+
    "\12\3\1\141\16\3\22\0\3\3\1\0\1\3\1\0"+
    "\2\3\5\0\11\3\1\200\17\3\22\0\3\3\1\0"+
    "\1\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7616];
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
    "\1\0\1\11\4\1\1\11\1\1\1\11\32\1\1\11"+
    "\1\1\7\11\1\1\1\0\2\1\1\11\35\1\3\11"+
    "\2\0\1\1\3\0\41\1\1\0\1\1\1\0\1\11"+
    "\27\1\1\11\1\1\1\0\21\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
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
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  public int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  public TokenType yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
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
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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

      if (zzInput == '\n') {
        yyline++;
        }
      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 40: break;
        case 23: 
          { /* Agregar manejo de error para comentario sin terminar */ return ERROR;
          }
        case 41: break;
        case 22: 
          { lexeme=yytext(); return P_coma;
          }
        case 42: break;
        case 17: 
          { lexeme=yytext(); return Llave_a;
          }
        case 43: break;
        case 34: 
          { lexeme=yytext(); return Else;
          }
        case 44: break;
        case 6: 
          { return Linea;
          }
        case 45: break;
        case 30: 
          { lexeme=yytext(); return For;
          }
        case 46: break;
        case 12: 
          { lexeme = yytext(); return Op_binario;
          }
        case 47: break;
        case 36: 
          { lexeme = yytext(); return Numero_cientifico;
          }
        case 48: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 49: break;
        case 14: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 50: break;
        case 13: 
          { lexeme=yytext(); return Op_logico;
          }
        case 51: break;
        case 24: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 52: break;
        case 27: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 53: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 54: break;
        case 4: 
          { /* Ignore */
          }
        case 55: break;
        case 18: 
          { lexeme=yytext(); return Llave_c;
          }
        case 56: break;
        case 21: 
          { lexeme = yytext(); return Dos_puntos;
          }
        case 57: break;
        case 33: 
          { lexeme = yytext(); return Reservada;
          }
        case 58: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 59: break;
        case 8: 
          { lexeme=yytext(); return Comillas;
          }
        case 60: break;
        case 19: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 61: break;
        case 39: 
          { lexeme=yytext(); return Cadena;
          }
        case 62: break;
        case 31: 
          { lexeme = yytext(); return Numero_hex;
          }
        case 63: break;
        case 26: 
          { lexeme=yytext(); return Do;
          }
        case 64: break;
        case 35: 
          { lexeme=yytext(); return Main;
          }
        case 65: break;
        case 11: 
          { lexeme=yytext(); return Resta;
          }
        case 66: break;
        case 29: 
          { lexeme=yytext(); return T_dato;
          }
        case 67: break;
        case 16: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 68: break;
        case 7: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 69: break;
        case 20: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 70: break;
        case 1: 
          { return ERROR;
          }
        case 71: break;
        case 9: 
          { lexeme=yytext(); return Igual;
          }
        case 72: break;
        case 37: 
          { lexeme=yytext(); return While;
          }
        case 73: break;
        case 32: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 74: break;
        case 25: 
          { lexeme=yytext(); return If;
          }
        case 75: break;
        case 38: 
          { lexeme = yytext(); return Return;
          }
        case 76: break;
        case 28: 
          { lexeme = yytext(); return Numero_oct;
          }
        case 77: break;
        case 10: 
          { lexeme=yytext(); return Suma;
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
