//	write a Predicate function to check if the collection is empty or not.

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Lab3 {
	public static void main(String[] args) {
		
		Collection c1 = new ArrayList<>();
		c1.add("as");
		
		Collection c2 = new ArrayList<>();
		
		Predicate<Collection> p = c -> c.isEmpty();
		System.out.println(p.test(c1));
		System.out.println(p.test(c2));
	}
}
