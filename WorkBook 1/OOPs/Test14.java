class Test14{
	public static void main(String[] args) {

		new Student();
		new Student();		
		System.out.println("Hello");
	}
}

class Student {
	static{
		System.out.println("static block");
	}
}