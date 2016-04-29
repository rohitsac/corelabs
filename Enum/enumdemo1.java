enum beer{
	KF, RC, FO, NEW1;	
	// int a = 10;

	// public static void main(String[] args) {
	// 	System.out.println("Hello");
	// }

	// beer(){
	// 	System.out.println("DC");
	// }

	// class innerBeer{
	// 	void m1(){
	// 		System.out.println("inner method");
	// 	}
	// }

}

// class beerTest{
// 	public static void main(String[] args) {
// 		beer b = beer.RC;
// 		System.out.println(b);	// toString  method will be called
// 	}
// }

class beerTest2{
	public static void main(String[] args) {
		beer b = beer.RC;

		switch(b){
			case KF:
				System.out.println("KF");
				break;

			case RC:
				System.out.println("RC");
				break;

			case FO:
				System.out.println("FO");
				break;

			// case NEW:
			// 	System.out.println("NEW");
			// 	break;

			case NEW1:
				System.out.println("NEW1");
				break;
		}
	}
}