public class Puzzle11 {
	public static void main(String args[]) {
		System.out.println("H" + "a");
		System.out.println('H' + 'a');
	}
}



/*
The compiler evaluates the constant expression ’H’ + ’a’  by promoting each of
the char-valued operands (’H’  and ’a’ ) to int values through a process known
as widening primitive conversion [JLS 5.1.2, 5.6.2]. Widening primitive
conversion of a char to an int zero extends the 16-bit char value to fill the
32-bit int. In the case of ’H’ , the char value is 72 and in the case of ’a’ ,
it is 97, so the expression ’H’ + ’a’  is equivalent to the int constant 72 +
97, or 169.
*/