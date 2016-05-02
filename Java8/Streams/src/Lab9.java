/**
 * 	processing by Stream.of() method.
 * 	we can also apply a stream for group of values and for arrays.
 */

import java.util.stream.Stream;

public class Lab9 {
	public static void main(String[] args) {
		
		Stream s = Stream.of(99, 999, 9999, 99999);
		s.forEach(System.out :: println);
		
		System.out.println("-----------------");
		
		Double[] d = {10.0, 20.0, 45.0, 53.0, 87.0};
		Stream s1 = Stream.of(d);
		s1.forEach(System.out :: println);
	}
}
