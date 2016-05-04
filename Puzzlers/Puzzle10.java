// provide declarations for the variables x and i  such that this is a legal
// statement:
// x = x + i;
// but this is not:
// x += i;

class Puzzle10{
	public static void main(String[] args) {
		Object x = "Buy ";
		String i = "Effective Java!";

		x += i;	
		x =x + i;
	}
}