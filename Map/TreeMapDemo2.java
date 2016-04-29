import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {
		
//		TreeMap map = new TreeMap();
		TreeMap map = new TreeMap(new MyComp());
		
		map.put("zzz", "A");
		map.put("sss", "B");
		map.put("hhh", "C");
		map.put("iii", "D");
		map.put("kkk", "E");
		map.put("aaa", null);
		
		System.out.println(map);

	}
}

class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
	
}