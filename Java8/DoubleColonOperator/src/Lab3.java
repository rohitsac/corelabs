interface inter{
	public void m1(int a);
}

public class Lab3 {

	public void m2(int i) {
			System.out.println("from method reference : "+i);
	}

	public static void main(String[] args) {

		inter f = l -> System.out.println("from Lambda Expression : "+l);
		
		f.m1(10);
		Lab3 obj = new Lab3();
		inter i1 = obj::m2;
		i1.m1(20);
		
	}
}
