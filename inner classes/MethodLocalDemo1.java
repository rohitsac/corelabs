class Outer{
	public void m1(){
		class inner{
			public void sum(int x, int y){
				System.out.println(x+y);
			}
		}

		inner i = new inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
	}
}

class MethodLocalDemo1{
	public static void main(String[] args) {
		Outer o = new Outer();
		o.m1();
	}
}