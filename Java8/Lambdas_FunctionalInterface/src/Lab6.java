interface interfaces{
	public int square(int a);
}


public class Lab6{
	public static void main(String[] args) {
		interfac i1 = x -> x*x;
		interfac i2 = (x) -> x*x;
		interfac i3 = (int x) -> x*x;	// All 3 are same.
		
		System.out.println(i1.square(20));
		System.out.println(i2.square(20));
		System.out.println(i3.square(20));
	}
}
