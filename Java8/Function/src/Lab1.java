import java.util.function.Function;

//	Write a function to find the length of given input String.

public class Lab1 {
	
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("ABCD"));
		System.out.println(f.apply("A"));
	}
	
}
