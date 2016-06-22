class Base{
	public String name = "Base";
}

class Derived extends Base{
	private String name = "Derived";
}

class Test14{
	public static void main(String[] args) {
		System.out.println(new Derived().name);
	}
}