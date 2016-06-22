class Test17{
	public Test17(Object o){
		System.out.println("Object");
	}

	public Test17(double[] darr){
		System.out.println("Double array");
	}

	public static void main(String[] args) {
		Test17 t = new Test17(null);
	}
}