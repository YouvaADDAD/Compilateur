/* The following code was generated by JFlex 1.6.1 */


/* JFlex specification for JCompiler */

package microjs.jcompiler.frontend.lexer;

import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.ComplexSymbolFactory.ComplexSymbol;
import microjs.jcompiler.frontend.parser.sym;

/**
 * This class is a simple example lexer.
 */


public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENTAIRE_C = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\53\1\5\1\6\1\6\1\4\22\0\1\53\1\32\6\0"+
    "\1\37\1\40\1\51\1\50\1\30\1\25\1\0\1\52\1\2\11\3"+
    "\1\0\1\27\1\24\1\31\1\26\2\0\10\1\1\21\21\1\1\35"+
    "\1\0\1\36\3\0\1\15\1\47\1\12\1\13\1\20\1\43\1\1"+
    "\1\45\1\10\2\1\1\11\1\46\1\7\1\16\1\23\1\1\1\14"+
    "\1\17\1\22\1\42\1\41\1\44\3\1\1\33\1\0\1\34\7\0"+
    "\1\6\u1fa2\0\1\6\1\6\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\2\5\10\2\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\3\2\1\22\1\23\1\24"+
    "\2\5\1\2\1\25\11\2\1\0\1\26\1\27\1\30"+
    "\1\31\4\2\1\32\1\0\1\33\1\34\1\2\1\35"+
    "\1\36\1\37\6\2\1\40\1\41\5\2\1\42\2\2"+
    "\1\43\1\44\4\2\1\45\3\2\1\46\1\47\1\2"+
    "\1\50\1\51\1\2\1\52\1\2\1\53\1\2\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[102];
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
    "\0\0\0\54\0\130\0\204\0\130\0\260\0\334\0\130"+
    "\0\u0108\0\u0134\0\u0160\0\u018c\0\u01b8\0\u01e4\0\u0210\0\u023c"+
    "\0\u0268\0\130\0\u0294\0\130\0\130\0\u02c0\0\u02ec\0\130"+
    "\0\130\0\130\0\130\0\130\0\130\0\u0318\0\u0344\0\u0370"+
    "\0\130\0\130\0\u039c\0\u03c8\0\u03f4\0\u0420\0\204\0\u044c"+
    "\0\u0478\0\u04a4\0\u04d0\0\u04fc\0\u0528\0\u0554\0\u0580\0\u05ac"+
    "\0\u05d8\0\130\0\130\0\130\0\130\0\u0604\0\u0630\0\u065c"+
    "\0\u0688\0\130\0\u06b4\0\130\0\204\0\u06e0\0\204\0\204"+
    "\0\204\0\u070c\0\u0738\0\u0764\0\u0790\0\u07bc\0\u07e8\0\130"+
    "\0\204\0\u0814\0\u0840\0\u086c\0\u0898\0\u08c4\0\204\0\u08f0"+
    "\0\u091c\0\204\0\204\0\u0948\0\u0974\0\u09a0\0\u09cc\0\204"+
    "\0\u09f8\0\u0a24\0\u0a50\0\204\0\204\0\u0a7c\0\204\0\204"+
    "\0\u0aa8\0\204\0\u0ad4\0\204\0\u0b00\0\204";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[102];
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
    "\1\3\1\4\1\5\1\6\1\7\2\10\1\11\1\12"+
    "\1\13\1\14\1\4\1\15\3\4\1\16\1\4\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\4"+
    "\1\37\1\40\3\4\1\41\1\42\1\43\1\10\51\44"+
    "\1\45\2\44\55\0\3\4\3\0\15\4\15\0\7\4"+
    "\6\0\2\6\55\0\1\10\47\0\3\4\3\0\1\4"+
    "\1\46\13\4\15\0\7\4\5\0\3\4\3\0\15\4"+
    "\15\0\2\4\1\47\4\4\5\0\3\4\3\0\6\4"+
    "\1\50\2\4\1\51\3\4\15\0\7\4\5\0\3\4"+
    "\3\0\4\4\1\52\1\4\1\53\1\54\5\4\15\0"+
    "\7\4\5\0\3\4\3\0\11\4\1\55\3\4\15\0"+
    "\7\4\5\0\3\4\3\0\2\4\1\56\12\4\15\0"+
    "\7\4\5\0\3\4\3\0\5\4\1\57\7\4\15\0"+
    "\7\4\5\0\3\4\3\0\5\4\1\60\7\4\15\0"+
    "\7\4\31\0\1\61\3\0\1\62\53\0\1\63\53\0"+
    "\1\64\53\0\1\65\23\0\3\4\3\0\6\4\1\66"+
    "\6\4\15\0\7\4\5\0\3\4\3\0\6\4\1\67"+
    "\6\4\15\0\1\4\1\70\5\4\5\0\3\4\3\0"+
    "\15\4\15\0\4\4\1\71\2\4\55\0\1\72\1\73"+
    "\1\0\51\44\1\0\2\44\51\0\1\45\1\74\2\0"+
    "\3\4\3\0\2\4\1\75\12\4\15\0\7\4\5\0"+
    "\3\4\3\0\15\4\15\0\5\4\1\76\1\4\5\0"+
    "\3\4\3\0\13\4\1\77\1\4\15\0\7\4\5\0"+
    "\3\4\3\0\5\4\1\100\7\4\15\0\7\4\5\0"+
    "\3\4\3\0\5\4\1\101\7\4\15\0\7\4\5\0"+
    "\3\4\3\0\1\102\14\4\15\0\7\4\5\0\3\4"+
    "\3\0\6\4\1\103\4\4\1\104\1\4\15\0\7\4"+
    "\5\0\3\4\3\0\10\4\1\105\4\4\15\0\7\4"+
    "\5\0\3\4\3\0\15\4\15\0\1\4\1\106\5\4"+
    "\5\0\3\4\3\0\1\4\1\107\13\4\15\0\7\4"+
    "\32\0\1\110\26\0\3\4\3\0\5\4\1\111\7\4"+
    "\15\0\7\4\5\0\3\4\3\0\2\4\1\112\12\4"+
    "\15\0\7\4\5\0\3\4\3\0\1\113\14\4\15\0"+
    "\7\4\5\0\3\4\3\0\1\4\1\114\7\4\1\115"+
    "\3\4\15\0\7\4\4\0\4\73\1\7\2\10\45\73"+
    "\1\0\3\4\3\0\15\4\15\0\6\4\1\116\5\0"+
    "\3\4\3\0\10\4\1\117\4\4\15\0\7\4\5\0"+
    "\3\4\3\0\4\4\1\120\10\4\15\0\7\4\5\0"+
    "\3\4\3\0\15\4\15\0\1\4\1\121\5\4\5\0"+
    "\3\4\3\0\11\4\1\122\3\4\15\0\7\4\5\0"+
    "\3\4\3\0\11\4\1\123\3\4\15\0\7\4\5\0"+
    "\3\4\3\0\1\124\14\4\15\0\7\4\5\0\3\4"+
    "\3\0\10\4\1\125\4\4\15\0\7\4\5\0\3\4"+
    "\3\0\3\4\1\126\11\4\15\0\7\4\5\0\3\4"+
    "\3\0\2\4\1\127\12\4\15\0\7\4\5\0\3\4"+
    "\3\0\1\130\14\4\15\0\7\4\5\0\3\4\3\0"+
    "\4\4\1\131\10\4\15\0\7\4\5\0\3\4\3\0"+
    "\12\4\1\132\2\4\15\0\7\4\5\0\3\4\3\0"+
    "\5\4\1\133\7\4\15\0\7\4\5\0\3\4\3\0"+
    "\13\4\1\134\1\4\15\0\7\4\5\0\3\4\3\0"+
    "\11\4\1\135\3\4\15\0\7\4\5\0\3\4\3\0"+
    "\13\4\1\136\1\4\15\0\7\4\5\0\3\4\3\0"+
    "\11\4\1\137\3\4\15\0\7\4\5\0\3\4\3\0"+
    "\6\4\1\140\6\4\15\0\7\4\5\0\3\4\3\0"+
    "\1\141\14\4\15\0\7\4\5\0\3\4\3\0\1\142"+
    "\14\4\15\0\7\4\5\0\3\4\3\0\1\4\1\143"+
    "\13\4\15\0\7\4\5\0\3\4\3\0\13\4\1\144"+
    "\1\4\15\0\7\4\5\0\3\4\3\0\7\4\1\145"+
    "\5\4\15\0\7\4\5\0\3\4\3\0\1\146\14\4"+
    "\15\0\7\4\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2860];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\1\1\1\11\2\1\1\11\11\1\1\11"+
    "\1\1\2\11\2\1\6\11\3\1\2\11\16\1\1\0"+
    "\4\11\4\1\1\11\1\0\1\11\13\1\1\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[102];
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
  private int yyline;

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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
  private ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
  // StringBuffer string = new StringBuffer();
    
  private Symbol symbol(String name, int type) {
    return symbolFactory.newSymbol(name, type, new Location(yyline+1, yycolumn +1),  new Location(yyline+1,yycolumn+yylength()));
  }
  private Symbol symbol(String name, int type, Object value) {
    return symbolFactory.newSymbol(name, type, new Location(yyline+1, yycolumn +1),  new Location(yyline+1,yycolumn+yylength()), value);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 162) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
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
          {   return symbol("EOF", sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { // very strange "bug"
                   if (yytext() == "\\u000A") { /* ignore */
                      System.err.println(
		        "WARNING: strange fallback character");
                   } else { throw new Error("Illegal character <"+
                                                yytext()+">"); }
            }
          case 45: break;
          case 2: 
            { return symbol("IDENTIFIER", sym.IDENTIFIER, yytext());
            }
          case 46: break;
          case 3: 
            { return symbol("INT", sym.INT, 0);
            }
          case 47: break;
          case 4: 
            { return symbol("INT", sym.INT, Integer.parseInt(yytext()));
            }
          case 48: break;
          case 5: 
            { /* ignore */
            }
          case 49: break;
          case 6: 
            { return symbol("LT", sym.LT);
            }
          case 50: break;
          case 7: 
            { return symbol("MINUS", sym.MINUS);
            }
          case 51: break;
          case 8: 
            { return symbol("GT", sym.GT);
            }
          case 52: break;
          case 9: 
            { return symbol("SEMICOL", sym.SEMICOL);
            }
          case 53: break;
          case 10: 
            { return symbol("COMMA", sym.COMMA);
            }
          case 54: break;
          case 11: 
            { return symbol("EQ", sym.EQ);
            }
          case 55: break;
          case 12: 
            { return symbol("LCURLY", sym.LCURLY);
            }
          case 56: break;
          case 13: 
            { return symbol("RCURLY", sym.RCURLY);
            }
          case 57: break;
          case 14: 
            { return symbol("LBRACKET", sym.LBRACKET);
            }
          case 58: break;
          case 15: 
            { return symbol("RBRACKET", sym.RBRACKET);
            }
          case 59: break;
          case 16: 
            { return symbol("LPAREN", sym.LPAREN);
            }
          case 60: break;
          case 17: 
            { return symbol("RPAREN", sym.RPAREN);
            }
          case 61: break;
          case 18: 
            { return symbol("PLUS", sym.PLUS);
            }
          case 62: break;
          case 19: 
            { return symbol("TIMES", sym.TIMES);
            }
          case 63: break;
          case 20: 
            { return symbol("DIV", sym.DIV);
            }
          case 64: break;
          case 21: 
            { return symbol("IF", sym.IF);
            }
          case 65: break;
          case 22: 
            { return symbol("LE", sym.LE);
            }
          case 66: break;
          case 23: 
            { return symbol("GE", sym.GE);
            }
          case 67: break;
          case 24: 
            { return symbol("EQEQ", sym.EQEQ);
            }
          case 68: break;
          case 25: 
            { return symbol("NE", sym.NE);
            }
          case 69: break;
          case 26: 
            { yybegin(COMMENTAIRE_C);
            }
          case 70: break;
          case 27: 
            { yybegin(YYINITIAL);
            }
          case 71: break;
          case 28: 
            { return symbol ("NIL",sym.NIL) ;
            }
          case 72: break;
          case 29: 
            { return symbol("LET", sym.LET);
            }
          case 73: break;
          case 30: 
            { return symbol("CDR", sym.CDR);
            }
          case 74: break;
          case 31: 
            { return symbol("CAR", sym.CAR);
            }
          case 75: break;
          case 32: 
            { return symbol("SWAP", sym.SWAP);
            }
          case 76: break;
          case 33: 
            { return symbol("VAR", sym.VAR);
            }
          case 77: break;
          case 34: 
            { return symbol("CONS", sym.CONS);
            }
          case 78: break;
          case 35: 
            { return symbol("ELSE", sym.ELSE);
            }
          case 79: break;
          case 36: 
            { return symbol("BOOL", sym.BOOL, true);
            }
          case 80: break;
          case 37: 
            { return symbol("WHEN", sym.WHEN);
            }
          case 81: break;
          case 38: 
            { return symbol("PRINT", sym.PRINT);
            }
          case 82: break;
          case 39: 
            { return symbol("BOOL", sym.BOOL, false);
            }
          case 83: break;
          case 40: 
            { return symbol("WHILE", sym.WHILE);
            }
          case 84: break;
          case 41: 
            { return symbol("LAMBDA", sym.LAMBDA);
            }
          case 85: break;
          case 42: 
            { return symbol("RETURN", sym.RETURN);
            }
          case 86: break;
          case 43: 
            { return symbol("READINT", sym.READINT);
            }
          case 87: break;
          case 44: 
            { return symbol("FUNCTION", sym.FUNCTION);
            }
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
