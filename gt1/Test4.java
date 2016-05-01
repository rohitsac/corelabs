package gt1;

class Otherclass{
	int i;
	boolean b;
	static int si;
	public void printValue(){
		System.out.print(i);
		System.out.print(b);
		System.out.print(si);
	}
}


public class Test4 {
	public static void main(String[] args) {
		Otherclass obj = new Otherclass();
		obj.printValue();
	}
}
