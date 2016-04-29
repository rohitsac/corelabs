class Test40{
	
	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.a);
	}
}

class Hello{
	{
		this.a = 90;
	}
	int a = 10;
}