class Cat{
	public static void meow(){
		System.out.println("meow");
	}
}

class Cati extends Cat{
	public static void meow(){
		System.out.println("zzzz");
	}
}

class Test13{
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cati();

		c1.meow();
		c2.meow();
	}
}