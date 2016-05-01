interface interfac{
	public int square(int a);
}

class DemoA implements interfac{

	@Override
	public int square(int a) {
		return a*a;
	}
}

public class Lab5{
	public static void main(String[] args) {
		interfac i = new DemoA();
		System.out.println(i.square(20));
	}
}
