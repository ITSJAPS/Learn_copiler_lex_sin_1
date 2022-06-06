// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/LexerColor.flex

import compilerTools.TextColor;
import java.awt.Color;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexerColor {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\2\0\1\5\1\6\3\0\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\0\1\15\1\16\11\17\1\0\1\13"+
    "\1\20\1\0\1\21\1\22\1\23\1\24\2\25\1\26"+
    "\11\25\1\27\1\30\11\25\1\31\1\25\3\0\1\32"+
    "\1\33\1\0\1\34\1\25\1\35\1\36\1\37\3\25"+
    "\1\40\2\25\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\4\25\1\7\1\54"+
    "\1\10\1\55\6\0\1\3\46\0\1\56\24\0\1\25"+
    "\7\0\1\25\3\0\1\25\3\0\1\25\1\0\1\25"+
    "\6\0\1\25\1\0\1\25\4\0\1\25\7\0\1\25"+
    "\3\0\1\25\3\0\1\25\1\0\1\25\6\0\1\25"+
    "\1\0\1\25\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\1\1\3\3\1\2\4\2\5"+
    "\3\1\2\2\1\6\2\7\10\2\1\0\4\3\1\10"+
    "\3\7\1\2\1\11\1\2\1\12\10\2\1\0\4\3"+
    "\1\13\7\2\1\14\1\0\1\3\2\0\4\3\10\2"+
    "\4\0\1\3\1\15\3\2\1\16\2\2\1\0\3\3"+
    "\3\2\1\15\2\2\1\17\3\0\2\2\1\20\2\2"+
    "\1\20\20\2\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[129];
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
    "\0\0\0\57\0\57\0\136\0\215\0\274\0\353\0\u011a"+
    "\0\u0149\0\57\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u0292\0\57\0\u0292\0\u02f0\0\u031f\0\u034e"+
    "\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\57"+
    "\0\u04c6\0\u04f5\0\57\0\u0524\0\u0553\0\u0582\0\u05b1\0\57"+
    "\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729"+
    "\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u0843\0\u0872\0\57"+
    "\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb\0\u0292"+
    "\0\u09ea\0\u0a19\0\u0814\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c"+
    "\0\u0cab\0\u0a77\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5"+
    "\0\u0df4\0\u0292\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e"+
    "\0\u0f3d\0\u0f6c\0\u0f9b\0\u0292\0\u0fca\0\u0ff9\0\57\0\u0eb0"+
    "\0\u1028\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u0292"+
    "\0\u1171\0\u11a0\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b\0\u12ba"+
    "\0\u12e9\0\u1318\0\u1347\0\u1376\0\u13a5\0\u13d4\0\u1403\0\u1432"+
    "\0\u0292";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[129];
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
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\2\1\7"+
    "\1\10\1\11\1\12\1\13\1\10\1\14\1\15\1\16"+
    "\1\17\1\2\1\20\3\21\1\22\2\23\1\24\1\25"+
    "\1\21\1\26\2\21\1\27\1\21\1\30\1\31\2\21"+
    "\1\32\1\33\1\21\1\34\1\21\1\35\1\12\2\2"+
    "\61\0\1\3\72\0\2\36\4\0\6\36\1\0\22\36"+
    "\2\0\2\37\1\40\1\37\1\41\50\37\1\42\1\37"+
    "\21\0\1\43\113\0\1\24\56\0\1\44\14\0\1\45"+
    "\5\0\1\24\33\0\1\46\16\0\1\3\1\47\55\0"+
    "\2\15\46\0\1\43\67\0\2\50\2\0\6\51\1\0"+
    "\21\51\27\0\6\52\1\0\21\52\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\21\21\10\0\1\12\10\0"+
    "\2\21\4\0\4\21\1\23\1\21\1\0\21\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\11\21\1\53"+
    "\7\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\10\21\1\54\10\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\5\21\1\55\13\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\17\21\1\56\1\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\17\21\1\57"+
    "\1\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\4\21\1\60\14\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\4\21\1\61\14\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\4\21\1\62\14\21\21\0"+
    "\2\63\4\0\6\63\1\0\22\63\2\0\2\37\1\40"+
    "\1\37\1\41\52\37\2\0\1\40\54\0\2\64\1\65"+
    "\1\64\1\66\4\64\1\37\43\64\1\67\1\64\12\0"+
    "\1\24\65\0\1\70\51\0\1\24\60\0\2\47\55\0"+
    "\2\51\4\0\6\51\1\0\21\51\21\0\2\52\4\0"+
    "\6\52\1\0\21\52\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\6\21\1\71\12\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\16\21\1\72\2\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\4\21\1\73"+
    "\14\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\7\21\1\74\11\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\4\21\1\75\14\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\12\21\1\76\6\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\14\21\1\77"+
    "\4\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\14\21\1\100\4\21\21\0\2\101\4\0\6\101\1\0"+
    "\22\101\2\0\2\64\1\65\1\64\1\66\50\64\1\102"+
    "\1\64\55\103\1\104\3\103\1\65\52\103\1\104\1\103"+
    "\2\67\1\105\1\67\1\106\4\67\1\107\43\67\1\110"+
    "\1\67\5\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\11\21\1\111\7\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\4\21\1\112\14\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\10\21\1\113\10\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\4\21\1\114"+
    "\14\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\10\21\1\115\4\21\1\116\3\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\4\21\1\117\14\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\7\21\1\120"+
    "\11\21\21\0\2\121\4\0\6\121\1\0\22\121\2\0"+
    "\2\64\1\65\1\64\1\66\1\64\1\37\46\64\1\102"+
    "\1\64\6\103\1\40\46\103\1\104\1\103\11\122\1\123"+
    "\43\122\1\124\3\122\1\105\6\122\1\123\43\122\1\124"+
    "\1\122\2\67\1\105\1\67\1\106\4\67\1\107\3\67"+
    "\1\64\37\67\1\110\3\67\1\105\1\67\1\106\1\67"+
    "\1\125\2\67\1\107\43\67\1\110\1\67\5\0\1\12"+
    "\10\0\2\21\4\0\6\21\1\0\14\21\1\126\4\21"+
    "\10\0\1\12\10\0\2\21\4\0\6\21\1\0\14\21"+
    "\1\127\4\21\10\0\1\12\10\0\2\21\4\0\6\21"+
    "\1\0\16\21\1\130\2\21\10\0\1\12\10\0\2\21"+
    "\4\0\6\21\1\0\14\21\1\131\4\21\10\0\1\12"+
    "\10\0\2\21\4\0\6\21\1\0\11\21\1\132\7\21"+
    "\10\0\1\12\10\0\2\21\4\0\6\21\1\0\5\21"+
    "\1\132\13\21\10\0\1\12\10\0\2\21\4\0\6\21"+
    "\1\0\16\21\1\133\2\21\10\0\1\12\10\0\2\21"+
    "\4\0\6\21\1\0\5\21\1\134\13\21\21\0\2\135"+
    "\4\0\6\135\1\0\22\135\2\0\11\122\1\123\3\122"+
    "\1\103\37\122\1\124\7\122\1\136\2\122\1\123\43\122"+
    "\1\124\1\122\2\125\1\136\1\125\1\137\4\125\1\140"+
    "\45\125\5\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\4\21\1\141\14\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\14\21\1\142\4\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\14\21\1\143\4\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\11\21\1\144"+
    "\7\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\5\21\1\145\13\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\10\21\1\146\10\21\21\0\2\147\4\0"+
    "\6\147\1\0\22\147\2\0\11\150\1\151\43\150\1\152"+
    "\3\150\1\136\6\150\1\151\43\150\1\152\1\150\2\125"+
    "\1\136\1\125\1\137\4\125\1\140\3\125\1\37\41\125"+
    "\5\0\1\12\10\0\2\21\4\0\6\21\1\0\1\21"+
    "\1\62\17\21\10\0\1\12\10\0\2\21\4\0\6\21"+
    "\1\0\17\21\1\153\1\21\10\0\1\12\10\0\2\21"+
    "\4\0\6\21\1\0\1\21\1\154\17\21\10\0\1\12"+
    "\10\0\2\21\4\0\6\21\1\0\14\21\1\155\4\21"+
    "\10\0\1\12\10\0\2\21\4\0\6\21\1\0\1\21"+
    "\1\156\17\21\3\0\11\150\1\151\3\150\1\0\47\150"+
    "\1\136\2\150\1\151\43\150\1\152\1\150\5\0\1\12"+
    "\10\0\2\21\4\0\6\21\1\0\7\21\1\157\11\21"+
    "\10\0\1\12\10\0\2\21\4\0\6\21\1\0\15\21"+
    "\1\160\3\21\10\0\1\12\10\0\2\21\4\0\2\21"+
    "\1\161\3\21\1\0\21\21\10\0\1\12\10\0\2\21"+
    "\4\0\6\21\1\0\14\21\1\162\4\21\10\0\1\12"+
    "\10\0\2\21\4\0\6\21\1\0\12\21\1\163\6\21"+
    "\10\0\1\12\10\0\2\21\4\0\6\21\1\0\17\21"+
    "\1\164\1\21\10\0\1\12\10\0\2\21\4\0\1\165"+
    "\5\21\1\0\21\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\5\21\1\166\13\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\14\21\1\167\4\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\12\21\1\170"+
    "\6\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\14\21\1\160\4\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\1\21\1\171\17\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\14\21\1\172\4\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\10\21\1\173"+
    "\10\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\4\21\1\174\14\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\16\21\1\175\2\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\10\21\1\176\10\21\10\0"+
    "\1\12\10\0\2\21\4\0\6\21\1\0\4\21\1\160"+
    "\14\21\10\0\1\12\10\0\2\21\4\0\6\21\1\0"+
    "\3\21\1\177\15\21\10\0\1\12\10\0\2\21\4\0"+
    "\6\21\1\0\4\21\1\200\14\21\10\0\1\12\10\0"+
    "\2\21\4\0\6\21\1\0\14\21\1\201\4\21\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5217];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\6\1\1\11\11\1\1\11\11\1\1\0"+
    "\1\1\1\11\2\1\1\11\4\1\1\11\12\1\1\0"+
    "\4\1\1\11\10\1\1\0\1\1\2\0\14\1\4\0"+
    "\10\1\1\0\11\1\1\11\3\0\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[129];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            { /* Ignorar */
            }
            // fall through
          case 17: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 18: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(255, 128, 0));
            }
            // fall through
          case 19: break;
          case 4:
            { return textColor(yychar, yylength(), Color.red) ;
            }
            // fall through
          case 20: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(35, 120, 147)) ;
            }
            // fall through
          case 21: break;
          case 6:
            { return textColor(yychar, yylength(), new Color(102, 41, 120)) ;
            }
            // fall through
          case 22: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(17, 94, 153)) ;
            }
            // fall through
          case 23: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(169, 176, 179)) ;
            }
            // fall through
          case 24: break;
          case 9:
            { return textColor(yychar, yylength(), new Color(239, 108, 0)) ;
            }
            // fall through
          case 25: break;
          case 10:
            { return textColor(yychar, yylength(), Color.blue) ;
            }
            // fall through
          case 26: break;
          case 11:
            { return textColor(yychar, yylength(), Color.orange) ;
            }
            // fall through
          case 27: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(212, 129, 6)) ;
            }
            // fall through
          case 28: break;
          case 13:
            { return textColor(yychar, yylength(), new Color(148, 58, 173)) ;
            }
            // fall through
          case 29: break;
          case 14:
            { return textColor(yychar, yylength(), Color.green) ;
            }
            // fall through
          case 30: break;
          case 15:
            { return textColor(yychar, yylength(), new Color(194, 195, 12)) ;
            }
            // fall through
          case 31: break;
          case 16:
            { return textColor(yychar, yylength(), new Color(150, 50, 0)) ;
            }
            // fall through
          case 32: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}