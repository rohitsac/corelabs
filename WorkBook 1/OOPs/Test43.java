class Test43{
	
	public static void main(String[] args) {
		System.out.println(Hello.a);
	}
}

class Hello{
	
	static int a = 10;
	static Hello h = new Hello();
	
	{
		System.out.println("IB");
	}

	static{
		System.out.println("SB");
	}

}