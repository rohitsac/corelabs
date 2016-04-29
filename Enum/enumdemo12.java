enum beer{

	KL, KO(20), KF(10);
	int qty;

	beer(int qty){
		this.qty = qty;
		System.out.println("Hello ArgC");
	}

	beer(){
		this.qty = qty;
		System.out.println("Hello DC");
	}

	public int getQty(){
		return qty;
	}
}

class enumdemo12{
	public static void main(String[] args) {
		beer[] b = beer.values();
		for(beer b1 : b)
			System.out.println(b1+" ====> "+b1.getQty());
	}
}