class Test11{
	public static void main(String[] args) {
		System.out.println(returnSome());
	}

	public static int returnSome(){
		try{
			// throw new RuntimeException("Blah !Blah !Blah !");
			return 5;
		}
		finally{
			return 0;
		}
	}
}