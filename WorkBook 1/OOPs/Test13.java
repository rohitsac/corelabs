class Test13{
	public static void main(String[] args) {
		Student st = null;
		System.out.println(st);
		System.out.println("Hello");
	}
}

class Student{
	static{
		System.out.println("static block");
	}
}