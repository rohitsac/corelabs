package gt1;

public class Lab20 {
	public static void main(String[] args) {
		Float f = new Float(123.12);
		changeInteger(f);
		System.out.println(f);
	}

	private static void changeInteger(Float ft) {
		ft = new Float(ft.floatValue()+1);
	}
	
}
