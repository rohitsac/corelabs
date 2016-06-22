class A{
	void m(int i){
		System.out.println("A int");
	}
}

class B extends A{
	void m(Integer i){
		System.out.println("B Integer");
	}
}

class Test16_ extends A{
	public static void main(String[] args) {
		A a = new B();
		a.m(new Integer(10));
		a.m(10);

		B b = new B();
		b.m(new Integer(10));
		b.m(10);
	}
}