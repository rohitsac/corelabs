import java.util.regex.Pattern;

public class Puzzle20 {
	public static void main(String[] args) {
		System.out.println(Puzzle20.class.getName().replaceAll(".", "/") + ".class");
		System.out.println(Puzzle20.class.getName().replaceAll("\\.", "/") + ".class");
		System.out.println(Puzzle20.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
	}
}