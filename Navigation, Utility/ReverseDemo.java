import java.util.*;

class ReverseDemo{
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		l.add("a");

		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

	}
}

