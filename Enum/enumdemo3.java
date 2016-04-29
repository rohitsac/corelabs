enum beer{
	KF, KO, RC, FO;
}

class enumdemo3{
	public static void main(String[] args) {
		beer[] b = beer.values();
		for(beer b1 : b)
			System.out.println(b1+"--->"+b1.ordinal());

	}
}