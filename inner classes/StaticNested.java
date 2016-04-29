class StaticNested{
	static class Nested{
		public void m1(){
			System.out.println("Hello");
		}
		public static void main(String[] args) {
			System.out.println("hai");
		}
	}

	public static void main(String[] args) {
		// StaticNested.Nested n = new StaticNested.Nested();
		Nested n = new Nested();
		n.m1();
	}
}

//	run as : java StaticNested
//	run as : java StaticNested$Nested