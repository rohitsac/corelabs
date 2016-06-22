import java.util.*;

class Test21{
	private static Random r = new Random();

	public static void main(String[] args) {
		StringBuffer word = null;

		switch(r.nextInt(5)){
			case 1 : 
			word = new StringBuffer('P');
			
			case 2 : 
			word = new StringBuffer('G');
			
			default : 
			word = new StringBuffer('A');
		}

		System.out.println(word.capacity());
		System.out.println(word.length());

		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);

		System.out.println(word.capacity());
		System.out.println(word.length());

		System.out.println(new StringBuffer().capacity());
		System.out.println(new StringBuffer().length());
	}
}