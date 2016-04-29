//	underlying data-structure is Balanced-Tree.
//	only homogeneous && Comparable elements allowed.(ClassCastException)

import java.util.*;

public class TreeSetDemo1{
	public static void main(String[] args) {
		
//	--------	Constructors	-----------
/*		TreeSet t = new TreeSet();
		TreeSet t = new TreeSet(Comparator);
		TreeSet t = new TreeSet(Collection);
		TreeSet t = new TreeSet(SortedSet);
*/

		Set s = new TreeSet();
//	------	String	---------//	

		// s.add("A");
		// s.add("B");
		// s.add("C");
		// s.add("a");
		// s.add("Z");
		// s.add(10);		//	CCEx
		// s.add(null);		//	NPEx
		System.out.println(s);

//	------	StringBuffer	---------//

		// s.add(new StringBuffer("A"));

//	------	CompareTo (only one method --> public int compareTo())	---------//

		// System.out.println("A".compareTo("Z"));
		// System.out.println("Z".compareTo("A"));
		// System.out.println("A".compareTo("A"));
		// System.out.println("A".compareTo(null));	//	NPEx

//	------	Compare	---------//
	//	2 methods
		//	public int compare()
		//	public boolen equals(Object obj)

		//	Program in next Example








/*		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet("C"));
		System.out.println(s.tailSet("C"));
		System.out.println(s.subSet("B", "A"));
*/
	}
}
