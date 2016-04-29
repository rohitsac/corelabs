class MainTest{
	public static void main(String[] args) {
	// public static void main(Object[] args) {	
		System.out.println("oooooooo");
		m1(new String[5]);
	}

	static void m1(Object[] as){
		System.out.println("m1() called");
	}
}