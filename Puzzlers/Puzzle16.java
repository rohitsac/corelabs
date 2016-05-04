public class Puzzle16 {
	public static void main(String[] args) {
// Note: \u000A is Unicode representation of linefeed (LF)
		char c = 0x000A;
		System.out.println(c);
	}
}


//	use multiline comment instead of single line comment in 3rd Line

/*
The compiler not only translates Unicode escapes into the characters they represent before
it parses a program into tokens (Puzzle 14), but it does so before discarding comments and white space [JLS 3.2]

*/

/*
The program is converted into :

public class LinePrinter {
public static void main(String[] args) {
// Note:
is Unicode representation of linefeed (LF)
char c = 0x000A;
System.out.println(c);
}
}

*/