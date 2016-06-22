class Test3{
	Test3(){
		System.out.println("Hello");
	}

	// Test3 t1 = new Test3();
	static Test3 t1 = new Test3();

	public static void main(String[] args) {
		Test3 t2 = new Test3();
	}
}