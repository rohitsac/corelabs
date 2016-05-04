// Provide declarations for the variables x and i  such that this is a legal statement:

// x += i;

// but this is not:

// x = x + i;

class Puzzle9{
	public static void main(String[] args) {
	
		short x = 0;
		int i = 123456;
		x += i;				//hidden implicit casting
		x =x + i;

	}
}
