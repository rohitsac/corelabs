package misc;

public class ConsDemo {
	public static void main(String[] args) {
		A a = new A();				// stackOverFlow due to recursive calling of constructor
		System.out.println(a);
	}
}

class A{
	A(){
		A a = new A();
	}
}