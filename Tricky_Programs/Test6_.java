// pass by value

class Test6_{
	static int x = 50;
	static String s = "0";

	public static void main(String[] args) {
		
		minInt(x, 20, 10);
		minInt(s, 20, 10);

		System.out.println("s = "+s);		
		System.out.println("x = "+x);		
	}

	static void minInt(String s, int a, int b){
		if(a > b)
			s = new Integer(b).toString();
		else
			s = new Integer(a).toString();
	}

	static void minInt(int min, int a, int b){
		if(a > b)
			min = b;
		else
			min = a;
	}
}