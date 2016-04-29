import java.io.*;

class ConsoleToFile{
	public static void main(String[] args) throws FileNotFoundException{
		String s = "Hello! welcome to Java World.";

		System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		System.out.println(s);
	}
}