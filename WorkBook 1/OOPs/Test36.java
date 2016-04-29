class Test36 {
	
	public static void main(String[] args) {
		Hello h = new Hello();
		h.show();
	}
}

class Hello{
	void show(){
		this = null;
	}
}