/* The following code was generated by JFlex 1.4.3 on 11/18/24, 11:29 PM */

package codigo.lexer;
import static codigo.lexer.TokenType.*;
import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/18/24, 11:29 PM from the specification file
 * <tt>D:/Downloads/Parser (1)/Parser/AnalizadorLexicoNetBeans/AnalizadorLexico/src/codigo/lexer/Lexer.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

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
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\41\1\7\2\0"+
    "\1\43\1\37\1\0\1\44\1\45\1\6\1\35\1\3\1\36\1\56"+
    "\1\4\1\52\7\55\2\2\2\0\1\42\1\34\1\42\2\0\4\54"+
    "\1\57\1\54\14\1\1\30\7\1\1\50\1\0\1\51\1\0\1\1"+
    "\1\0\1\20\1\10\1\16\1\26\1\13\1\25\1\24\1\17\1\14"+
    "\2\1\1\22\1\33\1\15\1\23\2\1\1\21\1\31\1\12\1\27"+
    "\1\1\1\32\1\53\1\11\1\1\1\46\1\40\1\47\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\5\1\6\13\2"+
    "\1\7\2\10\2\1\1\11\1\12\1\1\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\3\1\0\1\4\1\21"+
    "\1\22\3\2\1\23\5\2\1\24\3\2\1\12\1\25"+
    "\1\11\1\26\4\0\2\2\1\27\4\2\1\30\4\2"+
    "\1\31\1\0\1\4\1\32\4\2\1\33\1\34\1\0"+
    "\2\2\1\35\1\36\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[87];
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
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\60"+
    "\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270\0\u02a0"+
    "\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0\0\u0420"+
    "\0\u0360\0\u0360\0\u0120\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\u0450\0\u0480\0\u04b0\0\u04e0\0\60\0\u0510\0\u0540"+
    "\0\u0570\0\140\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690"+
    "\0\u06c0\0\u06f0\0\u0720\0\60\0\60\0\60\0\u0750\0\u0780"+
    "\0\u07b0\0\u04e0\0\u07e0\0\u0810\0\u0840\0\140\0\u0870\0\u08a0"+
    "\0\u08d0\0\u0900\0\140\0\u0930\0\u0960\0\u0990\0\u09c0\0\u0780"+
    "\0\u09f0\0\60\0\140\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\140"+
    "\0\u0ae0\0\u0ae0\0\u0b10\0\u0b40\0\140\0\140\0\140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[87];
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
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\11\2\3\1\12\1\13\1\3\1\14\2\3\1\15"+
    "\1\16\2\3\1\17\1\20\1\3\1\21\1\3\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\2\3\1\4\1\2\1\3\61\0\2\3\5\0\24\3"+
    "\16\0\4\3\1\0\1\3\2\0\1\4\47\0\1\4"+
    "\2\0\1\4\1\43\4\0\1\5\1\0\1\5\56\0"+
    "\1\44\1\0\1\45\25\0\1\46\57\0\1\46\24\0"+
    "\2\3\5\0\1\3\1\47\22\3\16\0\4\3\1\0"+
    "\1\3\1\0\2\3\5\0\12\3\1\50\11\3\16\0"+
    "\4\3\1\0\1\3\1\0\2\3\5\0\5\3\1\51"+
    "\7\3\1\52\6\3\16\0\4\3\1\0\1\3\1\0"+
    "\2\3\5\0\7\3\1\53\14\3\16\0\4\3\1\0"+
    "\1\3\1\0\2\3\5\0\3\3\1\54\20\3\16\0"+
    "\4\3\1\0\1\3\1\0\2\3\5\0\13\3\1\55"+
    "\10\3\16\0\4\3\1\0\1\3\1\0\2\3\5\0"+
    "\12\3\1\56\1\57\10\3\16\0\4\3\1\0\1\3"+
    "\1\0\2\3\5\0\13\3\1\60\10\3\16\0\4\3"+
    "\1\0\1\3\1\0\2\3\5\0\2\3\1\61\21\3"+
    "\16\0\4\3\1\0\1\3\1\0\2\3\5\0\7\3"+
    "\1\62\14\3\16\0\4\3\1\0\1\3\1\0\2\3"+
    "\5\0\10\3\1\63\13\3\16\0\4\3\1\0\1\3"+
    "\34\0\1\64\57\0\1\46\1\65\56\0\1\46\1\0"+
    "\1\65\60\0\1\66\60\0\1\66\21\0\1\4\47\0"+
    "\1\67\1\70\1\0\1\67\1\43\3\0\1\71\47\0"+
    "\1\71\2\0\1\71\2\0\5\44\1\0\52\44\6\72"+
    "\1\73\51\72\1\0\2\3\5\0\2\3\1\74\21\3"+
    "\16\0\4\3\1\0\1\3\1\0\2\3\5\0\21\3"+
    "\1\75\2\3\16\0\4\3\1\0\1\3\1\0\2\3"+
    "\5\0\2\3\1\76\21\3\16\0\4\3\1\0\1\3"+
    "\1\0\2\3\5\0\10\3\1\77\13\3\16\0\4\3"+
    "\1\0\1\3\1\0\2\3\5\0\2\3\1\100\21\3"+
    "\16\0\4\3\1\0\1\3\1\0\2\3\5\0\5\3"+
    "\1\101\16\3\16\0\4\3\1\0\1\3\1\0\2\3"+
    "\5\0\13\3\1\102\10\3\16\0\4\3\1\0\1\3"+
    "\1\0\2\3\5\0\11\3\1\103\12\3\16\0\4\3"+
    "\1\0\1\3\1\0\2\3\5\0\17\3\1\104\4\3"+
    "\16\0\4\3\1\0\1\3\1\0\2\3\5\0\11\3"+
    "\1\105\12\3\16\0\4\3\1\0\1\3\1\0\2\3"+
    "\5\0\4\3\1\106\17\3\16\0\4\3\1\0\1\3"+
    "\1\0\2\3\5\0\4\3\1\107\17\3\16\0\4\3"+
    "\1\0\1\3\2\0\1\4\47\0\1\67\2\0\1\67"+
    "\1\43\3\0\1\110\5\0\1\110\2\0\1\110\2\0"+
    "\1\110\1\0\1\110\4\0\2\110\23\0\1\110\1\0"+
    "\2\110\1\0\1\110\2\0\1\71\10\0\1\111\36\0"+
    "\1\71\2\0\1\71\1\0\1\111\4\72\1\112\1\72"+
    "\1\73\51\72\1\0\2\3\5\0\3\3\1\76\20\3"+
    "\16\0\4\3\1\0\1\3\1\0\2\3\5\0\3\3"+
    "\1\113\20\3\16\0\4\3\1\0\1\3\1\0\2\3"+
    "\5\0\11\3\1\76\12\3\16\0\4\3\1\0\1\3"+
    "\1\0\2\3\5\0\17\3\1\114\4\3\16\0\4\3"+
    "\1\0\1\3\1\0\2\3\5\0\14\3\1\76\7\3"+
    "\16\0\4\3\1\0\1\3\1\0\2\3\5\0\10\3"+
    "\1\51\13\3\16\0\4\3\1\0\1\3\1\0\2\3"+
    "\5\0\1\115\23\3\16\0\4\3\1\0\1\3\1\0"+
    "\2\3\5\0\4\3\1\116\17\3\16\0\4\3\1\0"+
    "\1\3\1\0\2\3\5\0\12\3\1\117\11\3\16\0"+
    "\4\3\1\0\1\3\1\0\2\3\5\0\5\3\1\120"+
    "\16\3\16\0\4\3\1\0\1\3\2\0\1\121\32\0"+
    "\2\122\13\0\1\121\2\0\1\121\3\0\2\3\5\0"+
    "\11\3\1\123\12\3\16\0\4\3\1\0\1\3\1\0"+
    "\2\3\5\0\12\3\1\74\11\3\16\0\4\3\1\0"+
    "\1\3\1\0\2\3\5\0\5\3\1\124\16\3\16\0"+
    "\4\3\1\0\1\3\1\0\2\3\5\0\3\3\1\125"+
    "\20\3\16\0\4\3\1\0\1\3\2\0\1\121\47\0"+
    "\1\121\2\0\1\121\3\0\2\3\5\0\5\3\1\126"+
    "\16\3\16\0\4\3\1\0\1\3\1\0\2\3\5\0"+
    "\14\3\1\127\7\3\16\0\4\3\1\0\1\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2928];
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
    "\1\0\1\11\5\1\1\11\23\1\6\11\1\1\1\0"+
    "\2\1\1\11\15\1\3\11\1\1\4\0\15\1\1\0"+
    "\1\11\7\1\1\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[87];
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
    public int line;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
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
    while (i < 138) {
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
  public Token yylex() throws java.io.IOException {
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

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 9: 
          { lexeme = yytext(); return new Token(Op_logico, lexeme, yyline);
          }
        case 32: break;
        case 4: 
          { /* Ignore */
          }
        case 33: break;
        case 24: 
          { lexeme = yytext(); return new Token(For, lexeme, yyline);
          }
        case 34: break;
        case 22: 
          { lexeme = yytext(); return new Token(Numero_oct, lexeme, yyline);
          }
        case 35: break;
        case 8: 
          { lexeme = yytext(); return new Token(Suma, lexeme, yyline);
          }
        case 36: break;
        case 3: 
          { lexeme = yytext(); return new Token(Numero, lexeme, yyline);
          }
        case 37: break;
        case 10: 
          { lexeme = yytext(); return new Token(Op_relacional, lexeme, yyline);
          }
        case 38: break;
        case 14: 
          { lexeme = yytext(); return new Token(Llave_c, lexeme, yyline);
          }
        case 39: break;
        case 29: 
          { lexeme = yytext(); return new Token(While, lexeme, yyline);
          }
        case 40: break;
        case 25: 
          { lexeme = yytext(); return new Token(Numero_hex, lexeme, yyline);
          }
        case 41: break;
        case 18: 
          { lexeme = yytext(); return new Token(Op_atribucion, lexeme, yyline);
          }
        case 42: break;
        case 7: 
          { lexeme = yytext(); return new Token(Igual, lexeme, yyline);
          }
        case 43: break;
        case 23: 
          { lexeme = yytext(); return new Token(T_dato, lexeme, yyline);
          }
        case 44: break;
        case 11: 
          { lexeme = yytext(); return new Token(Parentesis_a, lexeme, yyline);
          }
        case 45: break;
        case 13: 
          { lexeme = yytext(); return new Token(Llave_a, lexeme, yyline);
          }
        case 46: break;
        case 17: 
          { /* Agregar manejo de error para comentario sin terminar */ return new Token(INVALID_TOKEN, "Unclosed comment", yyline);
          }
        case 47: break;
        case 21: 
          { lexeme = yytext(); return new Token(Op_incremento, lexeme, yyline);
          }
        case 48: break;
        case 28: 
          { lexeme = yytext(); return new Token(Numero_cientifico, lexeme, yyline);
          }
        case 49: break;
        case 30: 
          { lexeme = yytext(); return new Token(Return, lexeme, yyline);
          }
        case 50: break;
        case 16: 
          { lexeme = yytext(); return new Token(Corchete_c, lexeme, yyline);
          }
        case 51: break;
        case 12: 
          { lexeme = yytext(); return new Token(Parentesis_c, lexeme, yyline);
          }
        case 52: break;
        case 5: 
          { lexeme = yytext(); return new Token(Multiplicacion, lexeme, yyline);
          }
        case 53: break;
        case 20: 
          { lexeme = yytext(); return new Token(Do, lexeme, yyline);
          }
        case 54: break;
        case 27: 
          { lexeme = yytext(); return new Token(Main, lexeme, yyline);
          }
        case 55: break;
        case 15: 
          { lexeme = yytext(); return new Token(Corchete_a, lexeme, yyline);
          }
        case 56: break;
        case 2: 
          { lexeme = yytext(); return new Token(Identificador, lexeme, yyline);
          }
        case 57: break;
        case 26: 
          { lexeme = yytext(); return new Token(Else, lexeme, yyline);
          }
        case 58: break;
        case 19: 
          { lexeme = yytext(); return new Token(If, lexeme, yyline);
          }
        case 59: break;
        case 6: 
          { lexeme = yytext(); return new Token(Comillas, lexeme, yyline);
          }
        case 60: break;
        case 1: 
          { return new Token(INVALID_TOKEN, yytext(), yyline);
          }
        case 61: break;
        case 31: 
          { lexeme = yytext(); return new Token(Cadena, lexeme, yyline);
          }
        case 62: break;
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

    @Override
    public Symbol next_token() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
