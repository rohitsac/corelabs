import java.util.*;

class NavDemo1{
	public static void main(String[] args) {
		TreeMap<String, String> m = new TreeMap<>();
		m.put("s", "static");
		m.put("d", "Dog");
		m.put("p", "Pompie");
		m.put("h", "horse");
		m.put("l", "land");
		System.out.println(m);

		System.out.println(m.ceilingKey("c"));
		System.out.println(m.higherKey("e"));
		System.out.println(m.floorKey("e"));
		System.out.println(m.lowerKey("e"));
		System.out.println(m.pollFirstEntry());
		System.out.println(m.pollLastEntry());
		System.out.println(m.descendingMap());
		System.out.println(m);

	}
}