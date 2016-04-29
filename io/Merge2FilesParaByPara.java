//	assume a blank line b/w two para

import java.io.*;

class Merge2FilesParabyPara{
	public static void main(String[] args) throws Exception{
		BufferedReader br1 = new BufferedReader(new FileReader("input1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("input2.txt"));

		PrintWriter pw = new PrintWriter("outpara.txt");

		String line1 = br1.readLine();
		String line2 = br2.readLine();

		.
		.
		.
		.
		.
		.
		.

		pw.flush();
		pw.close();


	}
}