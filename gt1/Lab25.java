package gt1;

class Rockin {
	int i1;
	boolean b;
	static int i3;
	public void getValue(){
		System.out.println(i1);
		System.out.println(b);
		System.out.println(i3);
	}
	
}
public class Lab25{
	public static void main(String[] args) {
		Rockin o = new Rockin();
		o.getValue();
	}
}