package gt1;

public class Lab14 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("jlcindia.com");
		modifyValue(sb);
		System.out.println(sb);
	}
	public static void modifyValue(StringBuffer s){
		s = new StringBuffer("java");
	}
}
