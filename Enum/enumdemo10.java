enum enumdemo10{

	KO, KF, KOs(10), KFs(20);

	enumdemo10(){
		System.out.println("Hello DC");
	}

	enumdemo10(int a){
		System.out.println("Hello ARG-Cons");
	}

	public static void main(String[] args) {
		System.out.println("Hello main()...");
	}

}

