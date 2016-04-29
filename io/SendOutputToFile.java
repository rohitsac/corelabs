import java.io.*;

class SendOutputToFile{

	public static void main(String[] args) throws FileNotFoundException{
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		System.out.println("Hello this is from SendOutputToFile.java output");
	}
}