/**
 * 	SortedMap contains 6 methods...
 * (1)	Object firstKey()
 * (2)	Object lastKey()
 * (3)	SortedMap headMap(Object key)
 * (4)	SortedMap tailMap(Object key)
 * (5)	SortedMap subMap(Object key1, Object key2)
 * (6)	Comparator comparator()
 *
 */

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap map = new TreeMap();
		
//		map.put(null, "h");
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.put(105, "E");
		
		
		System.out.println(map);
		
/*		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap(102));
		System.out.println(map.tailMap(104));
		System.out.println(map.subMap(102, 105));
		System.out.println(map.comparator());	// null if sorted based on default Sorting Order
*/	
	
		/////	Constructors	//////
/*		TreeMap t1 = new TreeMap();
		TreeMap t2 = new TreeMap(map);
		TreeMap t3 = new TreeMap(SortedMap m);
		TreeMap t4 = new TreeMap(Comparator c);
*/		
	
	}
	
}
