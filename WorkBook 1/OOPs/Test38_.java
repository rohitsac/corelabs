class Test38_{
	static {
		ab = 10;
		// System.out.println(ab);	//	don't print this then no illegal forward reference.
	}
	static int ab = 90;

	public static void main(String[] args) {

		System.out.println(ab);
	}
}
