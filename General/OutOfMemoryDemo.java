class OutOfMemoryDemo{
	public static void main(String[] args) {
	

	/*	System.out.println(Integer.MAX_VALUE);
		int[] matrix = new int[214748360];
	*/
	


		Long maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println(maxMemory);
		
		int[] matrix = new int[(int) (maxMemory + 1)];
		
	}
}

