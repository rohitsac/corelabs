class Test4{
	
	static int foo(int i){
		return (i<10 ? null : i);
	}

	public static void main(String[] args) {
		int x = Test4.foo(5);
		System.out.println(x);
	}
}