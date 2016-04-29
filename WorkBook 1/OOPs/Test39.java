class Test39{
	
	public static void main(String[] args) {
		System.out.println(Hello.b);
	}
}

class Hello{
	static {
		// System.out.println(b);	//direct read, so illegal forward reference.
		System.out.println(Hello.b);	//	RIWO
	}

	static int b = 90;


	static{
		System.out.println(Hello.b);
	}
}