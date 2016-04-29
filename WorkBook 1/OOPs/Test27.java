class Test27{
	public static void main(String[] args) {

		Student st = new Student();
		System.out.println(st.fee);
	}
}

class Student {
	final float fee;
	{
		fee = 1000;
	}
	{
		fee = 2000;
	}
}