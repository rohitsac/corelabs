import java.util.*;

class asListDemo{
	public static void main(String[] args) {
		
		String a[] = {"a", "b", "s", "c", "f"};

		List l = Arrays.asList(a);
		System.out.println(a);
		System.out.println(l);

		a[0] = "d";
		for(String i : a)
			System.out.println(i);

		l.set(0, "z");
		System.out.println(l);

		// l.add("M");		//	UnsupportedOperationException
		// l.remove(0);		//	UnsupportedOperationException

		l.set(1, new Integer(10));	// ArrayStoreException
	}
}