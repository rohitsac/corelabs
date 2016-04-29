import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		
		Map map = new HashMap();		//	underlying Data-Structure is Hashtable
		map.put(1, "A");
		map.put(2, "B");
		map.put(1, "C");
		map.put(3, "P");
		map.put(4, "Q");
		map.put(5, "R");
		
		System.out.println(map);
/*		
		System.out.println(map.put(2, "D"));	//	return type is Object
		
		map.putAll(map);						//	return type is  void
		System.out.println(map);
		
		System.out.println(map.get(1));			//	return type is Object
		System.out.println(map.get(10));
		System.out.println(map.remove(2));		//	return type is Object
		
		System.out.println(map.containsKey(1));	//	return type is boolean
		System.out.println(map.containsValue("Z"));//	return type is boolean

		System.out.println(map);
		System.out.println(map.size());			//	return type is int
		System.out.println(map.isEmpty());		//	return type is boolean 
		
//		map.clear();		//	will clear the map
		
		System.out.println("******	Collection View of Map	******");
		System.out.println(map.keySet());	//	return type is Set
		System.out.println(map.values());	//	return type is Collection
		System.out.println(map.entrySet());	//	return type is Set

*/		
	////////////	Entry interface	//////////
/*		
		System.out.println(map);
		Entry entry = new Entry() {

			@Override
			public Object getKey() {
//				
				return null;
			}

			@Override
			public Object getValue() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object setValue(Object arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		System.out.println(entry);
		
*/		
		
	///////	  4	Constructors	//////////
/*		System.out.println(map);
		
		HashMap h1 = new HashMap();	//	empty hashmap with default capacity 16.
		HashMap h2 = new HashMap(100);	//	empty hashmap with initial capacity 100.
		HashMap h3 = new HashMap(100, 0.90F);	//	0.90 is fill ratio
		HashMap h4 = new HashMap(map);
		
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);				// output in {}
		
		System.out.println(h4.entrySet());	// output in []
		
		Set set = h4.entrySet();
		Iterator it = set.iterator();
		
		System.out.println("----Iterating----");
		
		while(it.hasNext()){
			Map.Entry entry = (Map.Entry)it.next();
			System.out.println(entry.getKey()+"..."+entry.getValue());
			if(entry.getKey().equals(1))
				entry.setValue("CC");
		}
		System.out.println(h4);
		
		System.out.println("----Synchronized Version of HashMap----");
		
		Map syncMap = Collections.synchronizedMap(map);
		System.out.println(map);
		
*/		
		
		//////////	LinkedHashMap(sorted HashMap)	////////////
		
/*		LinkedHashMap lmap = new LinkedHashMap();	//	Hashtable + LinkedList
		lmap.put(1, "A");
		lmap.put(2, "B");
		lmap.put(1, "C");
		lmap.put(3, "P");
		lmap.put(4, "Q");
		lmap.put(5, "R");
		System.out.println(lmap);
*/		
		
	//////////	IdentityHashMap(sorted HashMap)	////////////
		
/*		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		Integer i3 = 10;
		Integer i4 = 10;
		Integer i5 = 1000;
		Integer i6 = 1000;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
	
		
		HashMap hmap = new HashMap();
		hmap.put(i1, "hello");
		hmap.put(i2, "hai");
		System.out.println(hmap);		//	uses equals() to identify duplicates
		
		IdentityHashMap imap = new IdentityHashMap();
		imap.put(i1, "hello");
		imap.put(i2, "hai");
		System.out.println(imap);		//	uses == to identify duplicates
		
*/		
		
	}
}
