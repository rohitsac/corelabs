import java.io.*;

class Merge2FilesLineByLine{
	public static void main(String[] args) throws Exception{
		BufferedReader br1 = new BufferedReader(new FileReader("input1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("input2.txt"));

		PrintWriter pw = new PrintWriter("output.txt");

		String line1 = br1.readLine();
		String line2 = br2.readLine();

		while((line1 != null) || (line2 != null)){
			
			if(line1 != null){
				pw.println(line1);
				line1 = br1.readLine();
			}
			if(line2 != null){
				pw.println(line2);
				line2 = br2.readLine();
			}

		}
		pw.flush();
		pw.close();


	}
}