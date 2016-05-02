//	write a Predicate function to check the length of String is greater than 10 or not.

import java.util.function.Predicate;

public class Lab2 {
	public static void main(String[] args) {
		Predicate<String> p = s -> (s.length() > 10);
		System.out.println(p.test("wjeoihfiohier"));
		System.out.println(p.test("hfjr"));
	}
}
