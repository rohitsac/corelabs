class Test41{
	
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.a);
	}
}

class Hello{
	{
		// System.out.println(a);	//	illegal f/w ref.
		// System.out.println(this.a);
	}
	int a = 10;
}