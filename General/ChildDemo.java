interface CI{}

class ChildDemo implements CI{
	public static void main(String[] args) {
		ChildDemo co = new ChildDemo();
		System.out.println(co.getClass().getSuperclass().getName());
	}
}