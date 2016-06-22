class Test1{
	public static void main(String[] args) {
		System.out.println(T.x);
	}
}

class T{
	// public static int x = 100;
	public static final int x = 100;

	static{
		System.out.println("T Loaded");
	}
}