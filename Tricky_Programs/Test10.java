import java.util.*;

class Test10{
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");

		// Set<String> set1 = new HashSet<>(){{
		Set<String> set1 = new HashSet<String>(){{
			add("c");
			add("d");
		}};

		Set<String> set2 = new HashSet<String>(){};
		Set<String> set3 = new HashSet<String>(){
			{
				add("e");
			}
			{
				add("f");
			}
		};

		System.out.println(set);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}