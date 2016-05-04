public class Puzzle19 {

	public static void main(String[] args) {
	
		

	}

	static String classify(char ch){
		if ("0123456789".indexOf(ch) >= 0)
			return "NUMERAL ";
		
		if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
			return "LETTER ";
	
	/* (Operators not supported yet)
		if ("+-*/&|!=".indexOf(ch) >= 0)
			return "OPERATOR ";
	*/
		return "UNKNOWN ";
		}
	}
}