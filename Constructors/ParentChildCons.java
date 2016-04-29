class Parent{
	int x;
	int y;

	Parent(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Parent");
	}
}

class Child extends Parent{
	int a;
	int b;

	Child(int a, int b, int x, int y){
		super(x, y);
		this.a = a;
		this.b = b;
		System.out.println("Child");
	}

	// Child(){}

}

class ParentChildCons{
	public static void main(String[] args) throws Exception{
		Child c = new Child(10, 20, 30, 40);
		// Thread.sleep(5000000);
	}
}