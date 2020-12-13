// Generated from C:/Users/jeffc/Desktop/CMPILER-Machine-Project/src\Clyps.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClypsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BOOLEAN=5, BREAK=6, BYTE=7, CHAR=8, CLASS=9, 
		CONST=10, DO=11, DOUBLE=12, ELSE=13, FINAL=14, FLOAT=15, FOR=16, IF=17, 
		INT=18, LONG=19, NEW=20, PRINT=21, RETURN=22, SCAN=23, SHORT=24, VOID=25, 
		WHILE=26, IntegerLiteral=27, FloatingPointLiteral=28, BooleanLiteral=29, 
		CharacterLiteral=30, StringLiteral=31, NullLiteral=32, LPAREN=33, RPAREN=34, 
		LBRACE=35, RBRACE=36, LBRACK=37, RBRACK=38, SEMI=39, COMMA=40, DOT=41, 
		ASSIGN=42, GT=43, LT=44, BANG=45, TILDE=46, QUESTION=47, COLON=48, EQUAL=49, 
		LE=50, GE=51, NOTEQUAL=52, AND=53, OR=54, INC=55, DEC=56, ADD=57, SUB=58, 
		MUL=59, DIV=60, BITAND=61, BITOR=62, CARET=63, MOD=64, ARROW=65, COLONCOLON=66, 
		ADD_ASSIGN=67, SUB_ASSIGN=68, MUL_ASSIGN=69, DIV_ASSIGN=70, AND_ASSIGN=71, 
		OR_ASSIGN=72, XOR_ASSIGN=73, MOD_ASSIGN=74, LSHIFT_ASSIGN=75, RSHIFT_ASSIGN=76, 
		URSHIFT_ASSIGN=77, Identifier=78, AT=79, ELLIPSIS=80, WS=81, COMMENT=82, 
		LINE_COMMENT=83;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "BOOLEAN", "BREAK", "BYTE", "CHAR", "CLASS", 
			"CONST", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", 
			"LONG", "NEW", "PRINT", "RETURN", "SCAN", "SHORT", "VOID", "WHILE", "IntegerLiteral", 
			"DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "IdentifierStart", "IdentifierPart", 
			"AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'String'", "'this'", "'instanceof'", "'boolean'", "'break'", 
			"'byte'", "'char'", "'class'", "'const'", "'do'", "'double'", "'else'", 
			"'final'", "'float'", "'for'", "'if'", "'int'", "'long'", "'new'", "'print'", 
			"'return'", "'scan'", "'short'", "'void'", "'while'", null, null, null, 
			null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
			"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
			"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", 
			"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", 
			null, "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BOOLEAN", "BREAK", "BYTE", "CHAR", "CLASS", 
			"CONST", "DO", "DOUBLE", "ELSE", "FINAL", "FLOAT", "FOR", "IF", "INT", 
			"LONG", "NEW", "PRINT", "RETURN", "SCAN", "SHORT", "VOID", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", 
			"COLONCOLON", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
			"COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ClypsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Clyps.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2U\u0352\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\5\34\u019c\n\34\3\35\3\35\5\35\u01a0\n\35\3\36\3\36\5"+
		"\36\u01a4\n\36\3\37\3\37\5\37\u01a8\n\37\3 \3 \5 \u01ac\n \3!\3!\3\"\3"+
		"\"\3\"\5\"\u01b3\n\"\3\"\3\"\3\"\5\"\u01b8\n\"\5\"\u01ba\n\"\3#\3#\5#"+
		"\u01be\n#\3#\5#\u01c1\n#\3$\3$\5$\u01c5\n$\3%\3%\3&\6&\u01ca\n&\r&\16"+
		"&\u01cb\3\'\3\'\5\'\u01d0\n\'\3(\6(\u01d3\n(\r(\16(\u01d4\3)\3)\3)\3)"+
		"\3*\3*\5*\u01dd\n*\3*\5*\u01e0\n*\3+\3+\3,\6,\u01e5\n,\r,\16,\u01e6\3"+
		"-\3-\5-\u01eb\n-\3.\3.\5.\u01ef\n.\3.\3.\3/\3/\5/\u01f5\n/\3/\5/\u01f8"+
		"\n/\3\60\3\60\3\61\6\61\u01fd\n\61\r\61\16\61\u01fe\3\62\3\62\5\62\u0203"+
		"\n\62\3\63\3\63\3\63\3\63\3\64\3\64\5\64\u020b\n\64\3\64\5\64\u020e\n"+
		"\64\3\65\3\65\3\66\6\66\u0213\n\66\r\66\16\66\u0214\3\67\3\67\5\67\u0219"+
		"\n\67\38\38\58\u021d\n8\39\39\39\59\u0222\n9\39\59\u0225\n9\39\59\u0228"+
		"\n9\39\39\39\59\u022d\n9\39\59\u0230\n9\39\39\39\59\u0235\n9\39\39\39"+
		"\59\u023a\n9\3:\3:\3:\3;\3;\3<\5<\u0242\n<\3<\3<\3=\3=\3>\3>\3?\3?\3?"+
		"\5?\u024d\n?\3@\3@\5@\u0251\n@\3@\3@\3@\5@\u0256\n@\3@\3@\5@\u025a\n@"+
		"\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u026a\nC\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\5D\u0274\nD\3E\3E\3F\3F\5F\u027a\nF\3F\3F\3G\6G\u027f\nG\rG"+
		"\16G\u0280\3H\3H\5H\u0285\nH\3I\3I\3I\3I\5I\u028b\nI\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\5J\u0298\nJ\3K\3K\3L\3L\6L\u029e\nL\rL\16L\u029f\3L\3"+
		"L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3"+
		"U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3^\3_\3_"+
		"\3_\3`\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d\3e\3e\3e\3f\3f\3g\3g"+
		"\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3n\3o\3o\3o\3p\3p\3p\3q\3q"+
		"\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3x"+
		"\3y\3y\3y\3y\3z\3z\3z\3z\3z\3{\3{\7{\u0321\n{\f{\16{\u0324\13{\3|\5|\u0327"+
		"\n|\3}\3}\5}\u032b\n}\3~\3~\3\177\3\177\3\177\3\177\3\u0080\6\u0080\u0334"+
		"\n\u0080\r\u0080\16\u0080\u0335\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\7\u0081\u033e\n\u0081\f\u0081\16\u0081\u0341\13\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0082\7\u0082"+
		"\u034c\n\u0082\f\u0082\16\u0082\u034f\13\u0082\3\u0082\3\u0082\3\u033f"+
		"\2\u0083\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2"+
		"g\2i\2k\2m\2o\36q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\37\u0087"+
		" \u0089\2\u008b!\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\"\u009b#\u009d$\u009f%\u00a1&\u00a3\'\u00a5(\u00a7)\u00a9*\u00ab+\u00ad"+
		",\u00af-\u00b1.\u00b3/\u00b5\60\u00b7\61\u00b9\62\u00bb\63\u00bd\64\u00bf"+
		"\65\u00c1\66\u00c3\67\u00c58\u00c79\u00c9:\u00cb;\u00cd<\u00cf=\u00d1"+
		">\u00d3?\u00d5@\u00d7A\u00d9B\u00dbC\u00ddD\u00dfE\u00e1F\u00e3G\u00e5"+
		"H\u00e7I\u00e9J\u00ebK\u00edL\u00efM\u00f1N\u00f3O\u00f5P\u00f7\2\u00f9"+
		"\2\u00fbQ\u00fdR\u00ffS\u0101T\u0103U\3\2\25\4\2NNnn\3\2\63;\4\2ZZzz\5"+
		"\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2R"+
		"Rrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65"+
		"\u0194\2&&C\\aac|\u00a4\u00a7\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u02c3\u02c8\u02d3\u02e2\u02e6\u02ee\u02ee\u02f0"+
		"\u02f0\u0372\u0376\u0378\u0379\u037c\u037f\u0381\u0381\u0388\u0388\u038a"+
		"\u038c\u038e\u038e\u0390\u03a3\u03a5\u03f7\u03f9\u0483\u048c\u0531\u0533"+
		"\u0558\u055b\u055b\u0563\u0589\u0591\u0591\u05d2\u05ec\u05f2\u05f4\u060d"+
		"\u060d\u0622\u064c\u0670\u0671\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0"+
		"\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712\u0714\u0731\u074f\u07a7\u07b3"+
		"\u07b3\u07cc\u07ec\u07f6\u07f7\u07fc\u07fc\u0802\u0817\u081c\u081c\u0826"+
		"\u0826\u082a\u082a\u0842\u085a\u0862\u086c\u08a2\u08b6\u08b8\u08bf\u0906"+
		"\u093b\u093f\u093f\u0952\u0952\u095a\u0963\u0973\u0982\u0987\u098e\u0991"+
		"\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09d0"+
		"\u09d0\u09de\u09df\u09e1\u09e3\u09f2\u09f5\u09fd\u09fe\u0a07\u0a0c\u0a11"+
		"\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a5b"+
		"\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac"+
		"\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3\u0af3"+
		"\u0af3\u0afb\u0afb\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34"+
		"\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85"+
		"\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0"+
		"\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bbb\u0bd2\u0bd2\u0bfb\u0bfb\u0c07"+
		"\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c3b\u0c3f\u0c3f\u0c5a\u0c5c\u0c62"+
		"\u0c63\u0c82\u0c82\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7"+
		"\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0\u0ce2\u0ce3\u0cf3\u0cf4\u0d07\u0d0e\u0d10"+
		"\u0d12\u0d14\u0d3c\u0d3f\u0d3f\u0d50\u0d50\u0d56\u0d58\u0d61\u0d63\u0d7c"+
		"\u0d81\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03"+
		"\u0e32\u0e34\u0e35\u0e41\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c"+
		"\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9"+
		"\u0ea9\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8"+
		"\u0ec8\u0ede\u0ee1\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6e\u0f8a\u0f8e\u1002"+
		"\u102c\u1041\u1041\u1052\u1057\u105c\u105f\u1063\u1063\u1067\u1068\u1070"+
		"\u1072\u1077\u1083\u1090\u1090\u10a2\u10c7\u10c9\u10c9\u10cf\u10cf\u10d2"+
		"\u10fc\u10fe\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262"+
		"\u128a\u128c\u128f\u1292\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4"+
		"\u12c7\u12ca\u12d8\u12da\u1312\u1314\u1317\u131a\u135c\u1382\u1391\u13a2"+
		"\u13f7\u13fa\u13ff\u1403\u166e\u1671\u1681\u1683\u169c\u16a2\u16ec\u16f0"+
		"\u16fa\u1702\u170e\u1710\u1713\u1722\u1733\u1742\u1753\u1762\u176e\u1770"+
		"\u1772\u1782\u17b5\u17d9\u17d9\u17dd\u17de\u1822\u1879\u1882\u1886\u1889"+
		"\u18aa\u18ac\u18ac\u18b2\u18f7\u1902\u1920\u1952\u196f\u1972\u1976\u1982"+
		"\u19ad\u19b2\u19cb\u1a02\u1a18\u1a22\u1a56\u1aa9\u1aa9\u1b07\u1b35\u1b47"+
		"\u1b4d\u1b85\u1ba2\u1bb0\u1bb1\u1bbc\u1be7\u1c02\u1c25\u1c4f\u1c51\u1c5c"+
		"\u1c7f\u1c82\u1c8a\u1ceb\u1cee\u1cf0\u1cf3\u1cf7\u1cf8\u1d02\u1dc1\u1e02"+
		"\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d"+
		"\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4"+
		"\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8"+
		"\u1ffe\u2041\u2042\u2056\u2056\u2073\u2073\u2081\u2081\u2092\u209e\u20a2"+
		"\u20c1\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211b\u211f\u2126"+
		"\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u213b\u213e\u2141\u2147"+
		"\u214b\u2150\u2150\u2162\u218a\u2c02\u2c30\u2c32\u2c60\u2c62\u2ce6\u2ced"+
		"\u2cf0\u2cf4\u2cf5\u2d02\u2d27\u2d29\u2d29\u2d2f\u2d2f\u2d32\u2d69\u2d71"+
		"\u2d71\u2d82\u2d98\u2da2\u2da8\u2daa\u2db0\u2db2\u2db8\u2dba\u2dc0\u2dc2"+
		"\u2dc8\u2dca\u2dd0\u2dd2\u2dd8\u2dda\u2de0\u2e31\u2e31\u3007\u3009\u3023"+
		"\u302b\u3033\u3037\u303a\u303e\u3043\u3098\u309f\u30a1\u30a3\u30fc\u30fe"+
		"\u3101\u3107\u3130\u3133\u3190\u31a2\u31bc\u31f2\u3201\u3402\u4db7\u4e02"+
		"\u9fec\ua002\ua48e\ua4d2\ua4ff\ua502\ua60e\ua612\ua621\ua62c\ua62d\ua642"+
		"\ua670\ua681\ua69f\ua6a2\ua6f1\ua719\ua721\ua724\ua78a\ua78d\ua7b0\ua7b2"+
		"\ua7b9\ua7f9\ua803\ua805\ua807\ua809\ua80c\ua80e\ua824\ua83a\ua83a\ua842"+
		"\ua875\ua884\ua8b5\ua8f4\ua8f9\ua8fd\ua8fd\ua8ff\ua8ff\ua90c\ua927\ua932"+
		"\ua948\ua962\ua97e\ua986\ua9b4\ua9d1\ua9d1\ua9e2\ua9e6\ua9e8\ua9f1\ua9fc"+
		"\uaa00\uaa02\uaa2a\uaa42\uaa44\uaa46\uaa4d\uaa62\uaa78\uaa7c\uaa7c\uaa80"+
		"\uaab1\uaab3\uaab3\uaab7\uaab8\uaabb\uaabf\uaac2\uaac2\uaac4\uaac4\uaadd"+
		"\uaadf\uaae2\uaaec\uaaf4\uaaf6\uab03\uab08\uab0b\uab10\uab13\uab18\uab22"+
		"\uab28\uab2a\uab30\uab32\uab5c\uab5e\uab67\uab72\uabe4\uac02\ud7a5\ud7b2"+
		"\ud7c8\ud7cd\ud7fd\uf902\ufa6f\ufa72\ufadb\ufb02\ufb08\ufb15\ufb19\ufb1f"+
		"\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45"+
		"\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfe\ufe35"+
		"\ufe36\ufe4f\ufe51\ufe6b\ufe6b\ufe72\ufe76\ufe78\ufefe\uff06\uff06\uff23"+
		"\uff3c\uff41\uff41\uff43\uff5c\uff68\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4"+
		"\uffd9\uffdc\uffde\uffe2\uffe3\uffe7\uffe8\u00e6\2\62;\u0081\u00a1\u00af"+
		"\u00af\u0302\u0371\u0485\u0489\u0593\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6"+
		"\u05c7\u05c9\u05c9\u0602\u0607\u0612\u061c\u061e\u061e\u064d\u066b\u0672"+
		"\u0672\u06d8\u06df\u06e1\u06e6\u06e9\u06ea\u06ec\u06ef\u06f2\u06fb\u0711"+
		"\u0711\u0713\u0713\u0732\u074c\u07a8\u07b2\u07c2\u07cb\u07ed\u07f5\u0818"+
		"\u081b\u081d\u0825\u0827\u0829\u082b\u082f\u085b\u085d\u08d6\u0905\u093c"+
		"\u093e\u0940\u0951\u0953\u0959\u0964\u0965\u0968\u0971\u0983\u0985\u09be"+
		"\u09be\u09c0\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09e4\u09e5\u09e8"+
		"\u09f1\u0a03\u0a05\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a53"+
		"\u0a53\u0a68\u0a73\u0a77\u0a77\u0a83\u0a85\u0abe\u0abe\u0ac0\u0ac7\u0ac9"+
		"\u0acb\u0acd\u0acf\u0ae4\u0ae5\u0ae8\u0af1\u0afc\u0b01\u0b03\u0b05\u0b3e"+
		"\u0b3e\u0b40\u0b46\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b64\u0b65\u0b68"+
		"\u0b71\u0b84\u0b84\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be8"+
		"\u0bf1\u0c02\u0c05\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c64"+
		"\u0c65\u0c68\u0c71\u0c83\u0c85\u0cbe\u0cbe\u0cc0\u0cc6\u0cc8\u0cca\u0ccc"+
		"\u0ccf\u0cd7\u0cd8\u0ce4\u0ce5\u0ce8\u0cf1\u0d02\u0d05\u0d3d\u0d3e\u0d40"+
		"\u0d46\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d64\u0d65\u0d68\u0d71\u0d84"+
		"\u0d85\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0de8\u0df1\u0df4"+
		"\u0df5\u0e33\u0e33\u0e36\u0e3c\u0e49\u0e50\u0e52\u0e5b\u0eb3\u0eb3\u0eb6"+
		"\u0ebb\u0ebd\u0ebe\u0eca\u0ecf\u0ed2\u0edb\u0f1a\u0f1b\u0f22\u0f2b\u0f37"+
		"\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f41\u0f73\u0f86\u0f88\u0f89\u0f8f"+
		"\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u102d\u1040\u1042\u104b\u1058\u105b\u1060"+
		"\u1062\u1064\u1066\u1069\u106f\u1073\u1076\u1084\u108f\u1091\u109f\u135f"+
		"\u1361\u1714\u1716\u1734\u1736\u1754\u1755\u1774\u1775\u17b6\u17d5\u17df"+
		"\u17df\u17e2\u17eb\u180d\u1810\u1812\u181b\u1887\u1888\u18ab\u18ab\u1922"+
		"\u192d\u1932\u193d\u1948\u1951\u19d2\u19db\u1a19\u1a1d\u1a57\u1a60\u1a62"+
		"\u1a7e\u1a81\u1a8b\u1a92\u1a9b\u1ab2\u1abf\u1b02\u1b06\u1b36\u1b46\u1b52"+
		"\u1b5b\u1b6d\u1b75\u1b82\u1b84\u1ba3\u1baf\u1bb2\u1bbb\u1be8\u1bf5\u1c26"+
		"\u1c39\u1c42\u1c4b\u1c52\u1c5b\u1cd2\u1cd4\u1cd6\u1cea\u1cef\u1cef\u1cf4"+
		"\u1cf6\u1cf9\u1cfb\u1dc2\u1dfb\u1dfd\u1e01\u200d\u2011\u202c\u2030\u2062"+
		"\u2066\u2068\u2071\u20d2\u20de\u20e3\u20e3\u20e7\u20f2\u2cf1\u2cf3\u2d81"+
		"\u2d81\u2de2\u2e01\u302c\u3031\u309b\u309c\ua622\ua62b\ua671\ua671\ua676"+
		"\ua67f\ua6a0\ua6a1\ua6f2\ua6f3\ua804\ua804\ua808\ua808\ua80d\ua80d\ua825"+
		"\ua829\ua882\ua883\ua8b6\ua8c7\ua8d2\ua8db\ua8e2\ua8f3\ua902\ua90b\ua928"+
		"\ua92f\ua949\ua955\ua982\ua985\ua9b5\ua9c2\ua9d2\ua9db\ua9e7\ua9e7\ua9f2"+
		"\ua9fb\uaa2b\uaa38\uaa45\uaa45\uaa4e\uaa4f\uaa52\uaa5b\uaa7d\uaa7f\uaab2"+
		"\uaab2\uaab4\uaab6\uaab9\uaaba\uaac0\uaac1\uaac3\uaac3\uaaed\uaaf1\uaaf7"+
		"\uaaf8\uabe5\uabec\uabee\uabef\uabf2\uabfb\ufb20\ufb20\ufe02\ufe11\ufe22"+
		"\ufe31\uff01\uff01\uff12\uff1b\ufffb\ufffd\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\2\u035e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"o\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u008b\3\2\2\2\2\u0099\3\2"+
		"\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2"+
		"\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd"+
		"\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2"+
		"\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf"+
		"\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2"+
		"\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2"+
		"\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3"+
		"\3\2\2\2\2\u00f5\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2"+
		"\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\3\u0105\3\2\2\2\5\u010a\3\2\2\2\7\u0111"+
		"\3\2\2\2\t\u0116\3\2\2\2\13\u0121\3\2\2\2\r\u0129\3\2\2\2\17\u012f\3\2"+
		"\2\2\21\u0134\3\2\2\2\23\u0139\3\2\2\2\25\u013f\3\2\2\2\27\u0145\3\2\2"+
		"\2\31\u0148\3\2\2\2\33\u014f\3\2\2\2\35\u0154\3\2\2\2\37\u015a\3\2\2\2"+
		"!\u0160\3\2\2\2#\u0164\3\2\2\2%\u0167\3\2\2\2\'\u016b\3\2\2\2)\u0170\3"+
		"\2\2\2+\u0174\3\2\2\2-\u017a\3\2\2\2/\u0181\3\2\2\2\61\u0186\3\2\2\2\63"+
		"\u018c\3\2\2\2\65\u0191\3\2\2\2\67\u019b\3\2\2\29\u019d\3\2\2\2;\u01a1"+
		"\3\2\2\2=\u01a5\3\2\2\2?\u01a9\3\2\2\2A\u01ad\3\2\2\2C\u01b9\3\2\2\2E"+
		"\u01bb\3\2\2\2G\u01c4\3\2\2\2I\u01c6\3\2\2\2K\u01c9\3\2\2\2M\u01cf\3\2"+
		"\2\2O\u01d2\3\2\2\2Q\u01d6\3\2\2\2S\u01da\3\2\2\2U\u01e1\3\2\2\2W\u01e4"+
		"\3\2\2\2Y\u01ea\3\2\2\2[\u01ec\3\2\2\2]\u01f2\3\2\2\2_\u01f9\3\2\2\2a"+
		"\u01fc\3\2\2\2c\u0202\3\2\2\2e\u0204\3\2\2\2g\u0208\3\2\2\2i\u020f\3\2"+
		"\2\2k\u0212\3\2\2\2m\u0218\3\2\2\2o\u021c\3\2\2\2q\u0239\3\2\2\2s\u023b"+
		"\3\2\2\2u\u023e\3\2\2\2w\u0241\3\2\2\2y\u0245\3\2\2\2{\u0247\3\2\2\2}"+
		"\u0249\3\2\2\2\177\u0259\3\2\2\2\u0081\u025b\3\2\2\2\u0083\u025e\3\2\2"+
		"\2\u0085\u0269\3\2\2\2\u0087\u0273\3\2\2\2\u0089\u0275\3\2\2\2\u008b\u0277"+
		"\3\2\2\2\u008d\u027e\3\2\2\2\u008f\u0284\3\2\2\2\u0091\u028a\3\2\2\2\u0093"+
		"\u0297\3\2\2\2\u0095\u0299\3\2\2\2\u0097\u029b\3\2\2\2\u0099\u02a6\3\2"+
		"\2\2\u009b\u02ab\3\2\2\2\u009d\u02ad\3\2\2\2\u009f\u02af\3\2\2\2\u00a1"+
		"\u02b1\3\2\2\2\u00a3\u02b3\3\2\2\2\u00a5\u02b5\3\2\2\2\u00a7\u02b7\3\2"+
		"\2\2\u00a9\u02b9\3\2\2\2\u00ab\u02bb\3\2\2\2\u00ad\u02bd\3\2\2\2\u00af"+
		"\u02bf\3\2\2\2\u00b1\u02c1\3\2\2\2\u00b3\u02c3\3\2\2\2\u00b5\u02c5\3\2"+
		"\2\2\u00b7\u02c7\3\2\2\2\u00b9\u02c9\3\2\2\2\u00bb\u02cb\3\2\2\2\u00bd"+
		"\u02ce\3\2\2\2\u00bf\u02d1\3\2\2\2\u00c1\u02d4\3\2\2\2\u00c3\u02d7\3\2"+
		"\2\2\u00c5\u02da\3\2\2\2\u00c7\u02dd\3\2\2\2\u00c9\u02e0\3\2\2\2\u00cb"+
		"\u02e3\3\2\2\2\u00cd\u02e5\3\2\2\2\u00cf\u02e7\3\2\2\2\u00d1\u02e9\3\2"+
		"\2\2\u00d3\u02eb\3\2\2\2\u00d5\u02ed\3\2\2\2\u00d7\u02ef\3\2\2\2\u00d9"+
		"\u02f1\3\2\2\2\u00db\u02f3\3\2\2\2\u00dd\u02f6\3\2\2\2\u00df\u02f9\3\2"+
		"\2\2\u00e1\u02fc\3\2\2\2\u00e3\u02ff\3\2\2\2\u00e5\u0302\3\2\2\2\u00e7"+
		"\u0305\3\2\2\2\u00e9\u0308\3\2\2\2\u00eb\u030b\3\2\2\2\u00ed\u030e\3\2"+
		"\2\2\u00ef\u0311\3\2\2\2\u00f1\u0315\3\2\2\2\u00f3\u0319\3\2\2\2\u00f5"+
		"\u031e\3\2\2\2\u00f7\u0326\3\2\2\2\u00f9\u032a\3\2\2\2\u00fb\u032c\3\2"+
		"\2\2\u00fd\u032e\3\2\2\2\u00ff\u0333\3\2\2\2\u0101\u0339\3\2\2\2\u0103"+
		"\u0347\3\2\2\2\u0105\u0106\7o\2\2\u0106\u0107\7c\2\2\u0107\u0108\7k\2"+
		"\2\u0108\u0109\7p\2\2\u0109\4\3\2\2\2\u010a\u010b\7U\2\2\u010b\u010c\7"+
		"v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7k\2\2\u010e\u010f\7p\2\2\u010f\u0110"+
		"\7i\2\2\u0110\6\3\2\2\2\u0111\u0112\7v\2\2\u0112\u0113\7j\2\2\u0113\u0114"+
		"\7k\2\2\u0114\u0115\7u\2\2\u0115\b\3\2\2\2\u0116\u0117\7k\2\2\u0117\u0118"+
		"\7p\2\2\u0118\u0119\7u\2\2\u0119\u011a\7v\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7p\2\2\u011c\u011d\7e\2\2\u011d\u011e\7g\2\2\u011e\u011f\7q\2\2"+
		"\u011f\u0120\7h\2\2\u0120\n\3\2\2\2\u0121\u0122\7d\2\2\u0122\u0123\7q"+
		"\2\2\u0123\u0124\7q\2\2\u0124\u0125\7n\2\2\u0125\u0126\7g\2\2\u0126\u0127"+
		"\7c\2\2\u0127\u0128\7p\2\2\u0128\f\3\2\2\2\u0129\u012a\7d\2\2\u012a\u012b"+
		"\7t\2\2\u012b\u012c\7g\2\2\u012c\u012d\7c\2\2\u012d\u012e\7m\2\2\u012e"+
		"\16\3\2\2\2\u012f\u0130\7d\2\2\u0130\u0131\7{\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7g\2\2\u0133\20\3\2\2\2\u0134\u0135\7e\2\2\u0135\u0136\7j\2\2\u0136"+
		"\u0137\7c\2\2\u0137\u0138\7t\2\2\u0138\22\3\2\2\2\u0139\u013a\7e\2\2\u013a"+
		"\u013b\7n\2\2\u013b\u013c\7c\2\2\u013c\u013d\7u\2\2\u013d\u013e\7u\2\2"+
		"\u013e\24\3\2\2\2\u013f\u0140\7e\2\2\u0140\u0141\7q\2\2\u0141\u0142\7"+
		"p\2\2\u0142\u0143\7u\2\2\u0143\u0144\7v\2\2\u0144\26\3\2\2\2\u0145\u0146"+
		"\7f\2\2\u0146\u0147\7q\2\2\u0147\30\3\2\2\2\u0148\u0149\7f\2\2\u0149\u014a"+
		"\7q\2\2\u014a\u014b\7w\2\2\u014b\u014c\7d\2\2\u014c\u014d\7n\2\2\u014d"+
		"\u014e\7g\2\2\u014e\32\3\2\2\2\u014f\u0150\7g\2\2\u0150\u0151\7n\2\2\u0151"+
		"\u0152\7u\2\2\u0152\u0153\7g\2\2\u0153\34\3\2\2\2\u0154\u0155\7h\2\2\u0155"+
		"\u0156\7k\2\2\u0156\u0157\7p\2\2\u0157\u0158\7c\2\2\u0158\u0159\7n\2\2"+
		"\u0159\36\3\2\2\2\u015a\u015b\7h\2\2\u015b\u015c\7n\2\2\u015c\u015d\7"+
		"q\2\2\u015d\u015e\7c\2\2\u015e\u015f\7v\2\2\u015f \3\2\2\2\u0160\u0161"+
		"\7h\2\2\u0161\u0162\7q\2\2\u0162\u0163\7t\2\2\u0163\"\3\2\2\2\u0164\u0165"+
		"\7k\2\2\u0165\u0166\7h\2\2\u0166$\3\2\2\2\u0167\u0168\7k\2\2\u0168\u0169"+
		"\7p\2\2\u0169\u016a\7v\2\2\u016a&\3\2\2\2\u016b\u016c\7n\2\2\u016c\u016d"+
		"\7q\2\2\u016d\u016e\7p\2\2\u016e\u016f\7i\2\2\u016f(\3\2\2\2\u0170\u0171"+
		"\7p\2\2\u0171\u0172\7g\2\2\u0172\u0173\7y\2\2\u0173*\3\2\2\2\u0174\u0175"+
		"\7r\2\2\u0175\u0176\7t\2\2\u0176\u0177\7k\2\2\u0177\u0178\7p\2\2\u0178"+
		"\u0179\7v\2\2\u0179,\3\2\2\2\u017a\u017b\7t\2\2\u017b\u017c\7g\2\2\u017c"+
		"\u017d\7v\2\2\u017d\u017e\7w\2\2\u017e\u017f\7t\2\2\u017f\u0180\7p\2\2"+
		"\u0180.\3\2\2\2\u0181\u0182\7u\2\2\u0182\u0183\7e\2\2\u0183\u0184\7c\2"+
		"\2\u0184\u0185\7p\2\2\u0185\60\3\2\2\2\u0186\u0187\7u\2\2\u0187\u0188"+
		"\7j\2\2\u0188\u0189\7q\2\2\u0189\u018a\7t\2\2\u018a\u018b\7v\2\2\u018b"+
		"\62\3\2\2\2\u018c\u018d\7x\2\2\u018d\u018e\7q\2\2\u018e\u018f\7k\2\2\u018f"+
		"\u0190\7f\2\2\u0190\64\3\2\2\2\u0191\u0192\7y\2\2\u0192\u0193\7j\2\2\u0193"+
		"\u0194\7k\2\2\u0194\u0195\7n\2\2\u0195\u0196\7g\2\2\u0196\66\3\2\2\2\u0197"+
		"\u019c\59\35\2\u0198\u019c\5;\36\2\u0199\u019c\5=\37\2\u019a\u019c\5?"+
		" \2\u019b\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019a\3\2\2\2\u019c8\3\2\2\2\u019d\u019f\5C\"\2\u019e\u01a0\5A!\2\u019f"+
		"\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0:\3\2\2\2\u01a1\u01a3\5Q)\2\u01a2"+
		"\u01a4\5A!\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4<\3\2\2\2\u01a5"+
		"\u01a7\5[.\2\u01a6\u01a8\5A!\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2"+
		"\u01a8>\3\2\2\2\u01a9\u01ab\5e\63\2\u01aa\u01ac\5A!\2\u01ab\u01aa\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac@\3\2\2\2\u01ad\u01ae\t\2\2\2\u01aeB\3\2"+
		"\2\2\u01af\u01ba\7\62\2\2\u01b0\u01b7\5I%\2\u01b1\u01b3\5E#\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\3\2\2\2\u01b4\u01b5\5O(\2\u01b5"+
		"\u01b6\5E#\2\u01b6\u01b8\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7\u01b4\3\2\2"+
		"\2\u01b8\u01ba\3\2\2\2\u01b9\u01af\3\2\2\2\u01b9\u01b0\3\2\2\2\u01baD"+
		"\3\2\2\2\u01bb\u01c0\5G$\2\u01bc\u01be\5K&\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\5G$\2\u01c0\u01bd\3\2\2"+
		"\2\u01c0\u01c1\3\2\2\2\u01c1F\3\2\2\2\u01c2\u01c5\7\62\2\2\u01c3\u01c5"+
		"\5I%\2\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5H\3\2\2\2\u01c6\u01c7"+
		"\t\3\2\2\u01c7J\3\2\2\2\u01c8\u01ca\5M\'\2\u01c9\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccL\3\2\2\2\u01cd"+
		"\u01d0\5G$\2\u01ce\u01d0\7a\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2"+
		"\2\u01d0N\3\2\2\2\u01d1\u01d3\7a\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5P\3\2\2\2\u01d6\u01d7"+
		"\7\62\2\2\u01d7\u01d8\t\4\2\2\u01d8\u01d9\5S*\2\u01d9R\3\2\2\2\u01da\u01df"+
		"\5U+\2\u01db\u01dd\5W,\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\5U+\2\u01df\u01dc\3\2\2\2\u01df\u01e0\3\2\2"+
		"\2\u01e0T\3\2\2\2\u01e1\u01e2\t\5\2\2\u01e2V\3\2\2\2\u01e3\u01e5\5Y-\2"+
		"\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7X\3\2\2\2\u01e8\u01eb\5U+\2\u01e9\u01eb\7a\2\2\u01ea\u01e8"+
		"\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebZ\3\2\2\2\u01ec\u01ee\7\62\2\2\u01ed"+
		"\u01ef\5O(\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2"+
		"\2\u01f0\u01f1\5]/\2\u01f1\\\3\2\2\2\u01f2\u01f7\5_\60\2\u01f3\u01f5\5"+
		"a\61\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\5_\60\2\u01f7\u01f4\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8^\3\2\2\2"+
		"\u01f9\u01fa\t\6\2\2\u01fa`\3\2\2\2\u01fb\u01fd\5c\62\2\u01fc\u01fb\3"+
		"\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"b\3\2\2\2\u0200\u0203\5_\60\2\u0201\u0203\7a\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0201\3\2\2\2\u0203d\3\2\2\2\u0204\u0205\7\62\2\2\u0205\u0206\t\7\2\2"+
		"\u0206\u0207\5g\64\2\u0207f\3\2\2\2\u0208\u020d\5i\65\2\u0209\u020b\5"+
		"k\66\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020e\5i\65\2\u020d\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020eh\3\2\2\2"+
		"\u020f\u0210\t\b\2\2\u0210j\3\2\2\2\u0211\u0213\5m\67\2\u0212\u0211\3"+
		"\2\2\2\u0213\u0214\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"l\3\2\2\2\u0216\u0219\5i\65\2\u0217\u0219\7a\2\2\u0218\u0216\3\2\2\2\u0218"+
		"\u0217\3\2\2\2\u0219n\3\2\2\2\u021a\u021d\5q9\2\u021b\u021d\5}?\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021dp\3\2\2\2\u021e\u021f\5E#\2\u021f"+
		"\u0221\7\60\2\2\u0220\u0222\5E#\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2"+
		"\2\2\u0222\u0224\3\2\2\2\u0223\u0225\5s:\2\u0224\u0223\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0228\5{>\2\u0227\u0226\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u023a\3\2\2\2\u0229\u022a\7\60\2\2\u022a\u022c\5"+
		"E#\2\u022b\u022d\5s:\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f"+
		"\3\2\2\2\u022e\u0230\5{>\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u023a\3\2\2\2\u0231\u0232\5E#\2\u0232\u0234\5s:\2\u0233\u0235\5{>\2\u0234"+
		"\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u023a\3\2\2\2\u0236\u0237\5E"+
		"#\2\u0237\u0238\5{>\2\u0238\u023a\3\2\2\2\u0239\u021e\3\2\2\2\u0239\u0229"+
		"\3\2\2\2\u0239\u0231\3\2\2\2\u0239\u0236\3\2\2\2\u023ar\3\2\2\2\u023b"+
		"\u023c\5u;\2\u023c\u023d\5w<\2\u023dt\3\2\2\2\u023e\u023f\t\t\2\2\u023f"+
		"v\3\2\2\2\u0240\u0242\5y=\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\5E#\2\u0244x\3\2\2\2\u0245\u0246\t\n\2\2\u0246"+
		"z\3\2\2\2\u0247\u0248\t\13\2\2\u0248|\3\2\2\2\u0249\u024a\5\177@\2\u024a"+
		"\u024c\5\u0081A\2\u024b\u024d\5{>\2\u024c\u024b\3\2\2\2\u024c\u024d\3"+
		"\2\2\2\u024d~\3\2\2\2\u024e\u0250\5Q)\2\u024f\u0251\7\60\2\2\u0250\u024f"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u025a\3\2\2\2\u0252\u0253\7\62\2\2"+
		"\u0253\u0255\t\4\2\2\u0254\u0256\5S*\2\u0255\u0254\3\2\2\2\u0255\u0256"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\7\60\2\2\u0258\u025a\5S*\2\u0259"+
		"\u024e\3\2\2\2\u0259\u0252\3\2\2\2\u025a\u0080\3\2\2\2\u025b\u025c\5\u0083"+
		"B\2\u025c\u025d\5w<\2\u025d\u0082\3\2\2\2\u025e\u025f\t\f\2\2\u025f\u0084"+
		"\3\2\2\2\u0260\u0261\7v\2\2\u0261\u0262\7t\2\2\u0262\u0263\7w\2\2\u0263"+
		"\u026a\7g\2\2\u0264\u0265\7h\2\2\u0265\u0266\7c\2\2\u0266\u0267\7n\2\2"+
		"\u0267\u0268\7u\2\2\u0268\u026a\7g\2\2\u0269\u0260\3\2\2\2\u0269\u0264"+
		"\3\2\2\2\u026a\u0086\3\2\2\2\u026b\u026c\7)\2\2\u026c\u026d\5\u0089E\2"+
		"\u026d\u026e\7)\2\2\u026e\u0274\3\2\2\2\u026f\u0270\7)\2\2\u0270\u0271"+
		"\5\u0091I\2\u0271\u0272\7)\2\2\u0272\u0274\3\2\2\2\u0273\u026b\3\2\2\2"+
		"\u0273\u026f\3\2\2\2\u0274\u0088\3\2\2\2\u0275\u0276\n\r\2\2\u0276\u008a"+
		"\3\2\2\2\u0277\u0279\7$\2\2\u0278\u027a\5\u008dG\2\u0279\u0278\3\2\2\2"+
		"\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\7$\2\2\u027c\u008c"+
		"\3\2\2\2\u027d\u027f\5\u008fH\2\u027e\u027d\3\2\2\2\u027f\u0280\3\2\2"+
		"\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u008e\3\2\2\2\u0282\u0285"+
		"\n\16\2\2\u0283\u0285\5\u0091I\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2"+
		"\2\u0285\u0090\3\2\2\2\u0286\u0287\7^\2\2\u0287\u028b\t\17\2\2\u0288\u028b"+
		"\5\u0093J\2\u0289\u028b\5\u0097L\2\u028a\u0286\3\2\2\2\u028a\u0288\3\2"+
		"\2\2\u028a\u0289\3\2\2\2\u028b\u0092\3\2\2\2\u028c\u028d\7^\2\2\u028d"+
		"\u0298\5_\60\2\u028e\u028f\7^\2\2\u028f\u0290\5_\60\2\u0290\u0291\5_\60"+
		"\2\u0291\u0298\3\2\2\2\u0292\u0293\7^\2\2\u0293\u0294\5\u0095K\2\u0294"+
		"\u0295\5_\60\2\u0295\u0296\5_\60\2\u0296\u0298\3\2\2\2\u0297\u028c\3\2"+
		"\2\2\u0297\u028e\3\2\2\2\u0297\u0292\3\2\2\2\u0298\u0094\3\2\2\2\u0299"+
		"\u029a\t\20\2\2\u029a\u0096\3\2\2\2\u029b\u029d\7^\2\2\u029c\u029e\7w"+
		"\2\2\u029d\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\5U+\2\u02a2\u02a3\5U+\2"+
		"\u02a3\u02a4\5U+\2\u02a4\u02a5\5U+\2\u02a5\u0098\3\2\2\2\u02a6\u02a7\7"+
		"p\2\2\u02a7\u02a8\7w\2\2\u02a8\u02a9\7n\2\2\u02a9\u02aa\7n\2\2\u02aa\u009a"+
		"\3\2\2\2\u02ab\u02ac\7*\2\2\u02ac\u009c\3\2\2\2\u02ad\u02ae\7+\2\2\u02ae"+
		"\u009e\3\2\2\2\u02af\u02b0\7}\2\2\u02b0\u00a0\3\2\2\2\u02b1\u02b2\7\177"+
		"\2\2\u02b2\u00a2\3\2\2\2\u02b3\u02b4\7]\2\2\u02b4\u00a4\3\2\2\2\u02b5"+
		"\u02b6\7_\2\2\u02b6\u00a6\3\2\2\2\u02b7\u02b8\7=\2\2\u02b8\u00a8\3\2\2"+
		"\2\u02b9\u02ba\7.\2\2\u02ba\u00aa\3\2\2\2\u02bb\u02bc\7\60\2\2\u02bc\u00ac"+
		"\3\2\2\2\u02bd\u02be\7?\2\2\u02be\u00ae\3\2\2\2\u02bf\u02c0\7@\2\2\u02c0"+
		"\u00b0\3\2\2\2\u02c1\u02c2\7>\2\2\u02c2\u00b2\3\2\2\2\u02c3\u02c4\7#\2"+
		"\2\u02c4\u00b4\3\2\2\2\u02c5\u02c6\7\u0080\2\2\u02c6\u00b6\3\2\2\2\u02c7"+
		"\u02c8\7A\2\2\u02c8\u00b8\3\2\2\2\u02c9\u02ca\7<\2\2\u02ca\u00ba\3\2\2"+
		"\2\u02cb\u02cc\7?\2\2\u02cc\u02cd\7?\2\2\u02cd\u00bc\3\2\2\2\u02ce\u02cf"+
		"\7>\2\2\u02cf\u02d0\7?\2\2\u02d0\u00be\3\2\2\2\u02d1\u02d2\7@\2\2\u02d2"+
		"\u02d3\7?\2\2\u02d3\u00c0\3\2\2\2\u02d4\u02d5\7#\2\2\u02d5\u02d6\7?\2"+
		"\2\u02d6\u00c2\3\2\2\2\u02d7\u02d8\7(\2\2\u02d8\u02d9\7(\2\2\u02d9\u00c4"+
		"\3\2\2\2\u02da\u02db\7~\2\2\u02db\u02dc\7~\2\2\u02dc\u00c6\3\2\2\2\u02dd"+
		"\u02de\7-\2\2\u02de\u02df\7-\2\2\u02df\u00c8\3\2\2\2\u02e0\u02e1\7/\2"+
		"\2\u02e1\u02e2\7/\2\2\u02e2\u00ca\3\2\2\2\u02e3\u02e4\7-\2\2\u02e4\u00cc"+
		"\3\2\2\2\u02e5\u02e6\7/\2\2\u02e6\u00ce\3\2\2\2\u02e7\u02e8\7,\2\2\u02e8"+
		"\u00d0\3\2\2\2\u02e9\u02ea\7\61\2\2\u02ea\u00d2\3\2\2\2\u02eb\u02ec\7"+
		"(\2\2\u02ec\u00d4\3\2\2\2\u02ed\u02ee\7~\2\2\u02ee\u00d6\3\2\2\2\u02ef"+
		"\u02f0\7`\2\2\u02f0\u00d8\3\2\2\2\u02f1\u02f2\7\'\2\2\u02f2\u00da\3\2"+
		"\2\2\u02f3\u02f4\7/\2\2\u02f4\u02f5\7@\2\2\u02f5\u00dc\3\2\2\2\u02f6\u02f7"+
		"\7<\2\2\u02f7\u02f8\7<\2\2\u02f8\u00de\3\2\2\2\u02f9\u02fa\7-\2\2\u02fa"+
		"\u02fb\7?\2\2\u02fb\u00e0\3\2\2\2\u02fc\u02fd\7/\2\2\u02fd\u02fe\7?\2"+
		"\2\u02fe\u00e2\3\2\2\2\u02ff\u0300\7,\2\2\u0300\u0301\7?\2\2\u0301\u00e4"+
		"\3\2\2\2\u0302\u0303\7\61\2\2\u0303\u0304\7?\2\2\u0304\u00e6\3\2\2\2\u0305"+
		"\u0306\7(\2\2\u0306\u0307\7?\2\2\u0307\u00e8\3\2\2\2\u0308\u0309\7~\2"+
		"\2\u0309\u030a\7?\2\2\u030a\u00ea\3\2\2\2\u030b\u030c\7`\2\2\u030c\u030d"+
		"\7?\2\2\u030d\u00ec\3\2\2\2\u030e\u030f\7\'\2\2\u030f\u0310\7?\2\2\u0310"+
		"\u00ee\3\2\2\2\u0311\u0312\7>\2\2\u0312\u0313\7>\2\2\u0313\u0314\7?\2"+
		"\2\u0314\u00f0\3\2\2\2\u0315\u0316\7@\2\2\u0316\u0317\7@\2\2\u0317\u0318"+
		"\7?\2\2\u0318\u00f2\3\2\2\2\u0319\u031a\7@\2\2\u031a\u031b\7@\2\2\u031b"+
		"\u031c\7@\2\2\u031c\u031d\7?\2\2\u031d\u00f4\3\2\2\2\u031e\u0322\5\u00f7"+
		"|\2\u031f\u0321\5\u00f9}\2\u0320\u031f\3\2\2\2\u0321\u0324\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u00f6\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0325\u0327\t\21\2\2\u0326\u0325\3\2\2\2\u0327\u00f8\3\2\2\2\u0328"+
		"\u032b\5\u00f7|\2\u0329\u032b\t\22\2\2\u032a\u0328\3\2\2\2\u032a\u0329"+
		"\3\2\2\2\u032b\u00fa\3\2\2\2\u032c\u032d\7B\2\2\u032d\u00fc\3\2\2\2\u032e"+
		"\u032f\7\60\2\2\u032f\u0330\7\60\2\2\u0330\u0331\7\60\2\2\u0331\u00fe"+
		"\3\2\2\2\u0332\u0334\t\23\2\2\u0333\u0332\3\2\2\2\u0334\u0335\3\2\2\2"+
		"\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338"+
		"\b\u0080\2\2\u0338\u0100\3\2\2\2\u0339\u033a\7\61\2\2\u033a\u033b\7,\2"+
		"\2\u033b\u033f\3\2\2\2\u033c\u033e\13\2\2\2\u033d\u033c\3\2\2\2\u033e"+
		"\u0341\3\2\2\2\u033f\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0342\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0342\u0343\7,\2\2\u0343\u0344\7\61\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0346\b\u0081\2\2\u0346\u0102\3\2\2\2\u0347\u0348"+
		"\7\61\2\2\u0348\u0349\7\61\2\2\u0349\u034d\3\2\2\2\u034a\u034c\n\24\2"+
		"\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u034d\3\2\2\2\u0350\u0351\b\u0082\2"+
		"\2\u0351\u0104\3\2\2\29\2\u019b\u019f\u01a3\u01a7\u01ab\u01b2\u01b7\u01b9"+
		"\u01bd\u01c0\u01c4\u01cb\u01cf\u01d4\u01dc\u01df\u01e6\u01ea\u01ee\u01f4"+
		"\u01f7\u01fe\u0202\u020a\u020d\u0214\u0218\u021c\u0221\u0224\u0227\u022c"+
		"\u022f\u0234\u0239\u0241\u024c\u0250\u0255\u0259\u0269\u0273\u0279\u0280"+
		"\u0284\u028a\u0297\u029f\u0322\u0326\u032a\u0335\u033f\u034d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}