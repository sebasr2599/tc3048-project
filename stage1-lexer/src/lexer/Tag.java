package lexer;

public class Tag {
	public final static int
		EOF = 65535, ERROR = 65534,
		/* OPERATORS */
		GEQ = 258, LEQ = 259, NEQ = 260,

		/* REGULAR EXPRESSIONS */
		ID = 357, NUMBER = 358, STRING = 359, TRUE = 360, FALSE = 361,

		/* RESERVED WORDS */
		FORWARD =69420, BACKWARD=232, RIGHT=2356, LEFT =424,SETX=23287,SETY=7542,
		SETXY = 23466, CLEAR = 23998, CIRCLE = 9818, ARC = 23087, PENUP = 492,
		PENDOWN = 7541, COLOR =3213, PENWIDTH = 93821, PRINT = 23997, REPEAT =9221, IF = 9222,
		IFELSE = 232998, OR = 9223, AND = 29312, MOD = 3921, VAR=39737,
		MAKE = 457, HOME = 98342;
}
