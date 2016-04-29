class NestingDemo{
	class inner1{
		class inner2{
			class inner3{
				class inner4{
					class inner5{
						class inner6{
							public void m1(){
								System.out.println("Hello");
							}
						}
					}
				}
			}
		}
	}

	public void m2(){
		new inner1().new inner2().new inner3().new inner4().new inner5().new inner6().m1();
	}

	public static void main(String[] args) {
		// new inner1().new inner2().new inner3().new inner4().new inner5().new inner6().m1();
		new NestingDemo().m2();
	}
}