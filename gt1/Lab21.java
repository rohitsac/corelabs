package gt1;

public class Lab21 {
	static Integer i;
	public static void main(String[] args) {
		addNumber(i);
		System.out.println(i);
	}
	private static void addNumber(Integer i2) {
		i2 = new Integer(i2.intValue()+1);
	}
	
}
