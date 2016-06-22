class A{
	static void m1(){
		System.out.println("static method");
	}
	void m2(){
		System.out.println("instance method");
	}
}

class Test7{
	public static void main(String[] args) {
		A a = null;
		a.m1();
		a.m2();
	}
}