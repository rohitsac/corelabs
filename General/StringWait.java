class StringWait{
	public static void main(String[] args) throws InterruptedException{

		String s = "Hello";
	/*	s.wait(50000);
		System.out.println(s);
	*/	

	synchronized(s){
		s.wait(5000);
	}
	System.out.println(s);

	}
}