class ConsDemo{

	static int count = 0;
	{
		count++;
	}
	ConsDemo(){}

	ConsDemo(int i){
		this.count = i;
	}


	public static void main(String[] args) {
		ConsDemo o1 = new ConsDemo();	// count = 1
		ConsDemo o2 = new ConsDemo(4);	// count = 4
		ConsDemo o3 = new ConsDemo();	// count = 5

		System.out.println(count);
	}
}