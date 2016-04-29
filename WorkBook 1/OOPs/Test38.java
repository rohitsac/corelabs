class Test38 {
	
	public static void main(String[] args) {
		System.out.println(Hello.b);
	}
}

class Hello{
	static{
		b = 10;
		System.out.println(b);
	}
	static int b = 90;
}