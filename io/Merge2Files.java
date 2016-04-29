import java.io.*;

class Merge2Files{
	public static void main(String[] args) throws Exception{
		BufferedReader br1 = new BufferedReader(new FileReader("input1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("input2.txt"));

		PrintWriter pw = new PrintWriter("output.txt");

		String line = br1.readLine();
		while(line != null){
			pw.println(line);
			line = br1.readLine();
		}

		line = br2.readLine();
		while(line != null){
			pw.println(line);
			line = br2.readLine();
		}
		pw.flush();
		pw.close();


	}
}