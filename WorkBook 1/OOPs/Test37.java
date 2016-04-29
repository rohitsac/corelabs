class Test37 {
	
	public static void main(String[] args) {
		Hello h = new Hello();
		h.show();
	}
}

class Hello{
	int a;
	void show(){
		System.out.println(a);
		System.out.println(new Hello().a);
		System.out.println(this.a);
		System.out.println(Hello.this.a);
	}
}