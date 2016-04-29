import java.io.*;

class A{
	public static void main(String[] args) throws Exception{
		
	//	creating a file.........
		// File f = new File("abc.txt");
		// System.out.println(f.exists());
		// f.createNewFile();
		// System.out.println(f.exists());
	
	//	creating a Directory......
		// File d = new File("dirrr");
		// System.out.println(d.exists());
		// d.mkdir();
		// System.out.println(d.exists());

	//	Constructors.....
		// File f1 = new File("subDir", "file1.txt");
		// f1.createNewFile();

		// File f2 = new File(d, "file2.txt");
		// f2.createNewFile();

		// File f3 = new File("C:\\tmp", "file2.txt");
		// f3.createNewFile();

	//	methods......
		// System.out.println(f.isFile());
		// System.out.println(d.isDirectory());

		/*String[] list = d.list();
		for(String s : list)
			System.out.println(s);*/

		// long l = f.length();
		// System.out.println(l);

		// f.delete();

	/*********************************************************/
	
	/*	int count = 0;
		File f4 = new File("C:\\tmp");
		String[] s = f4.list();
		for(String s1 : s){
			count++;
			System.out.println(s1);	
		}
		System.out.println(count);
	*/

	/*	int count = 0;
		File f5 = new File("C:\\tmp");
		String[] s = f5.list();
		for(String s1 : s){
			File f6 = new File(f5, s1);
			// if(f6.isFile()){
			if(f6.isDirectory()){
				count++;
				System.out.println(s1);	
			}
		}
		System.out.println(count);	
	*/

	/***************************************/
			//	FileWriter	//
		//	constructors

/*		FileWriter fw = new FileWriter("hello.txt");
		fw.write('A');
		fw.write('\n');
		fw.write(100);
		fw.write('\n');
		fw.write("hello hello hello...");
		char[] ch = {'A', 's', 'd'};
		fw.write(ch);

		// FileWriter fw = new FileWriter(f);

		// FileWriter fw = new FileWriter("abc.txt", true);

		// FileWriter fw = new FileWriter(f, true);
		
		fw.flush();
		fw.close();
*/

	//////////		FileReader		/////////
		// File ff = new File("hello.txt");
		/*FileReader fr = new FileReader(ff);
		// System.out.println(fr.read());		// unicode of first char
		char[] ch = new char[(int)(ff.length())];
		fr.read(ch);
		// System.out.print(ch);
		for(char c1 : ch)
			System.out.print(c1);*/
		/********************************/

/*		FileReader fr1 = new FileReader(ff);
		int i = fr1.read();
		// System.out.println(i);
		while(i != -1){
			System.out.println((char)i);
			i = fr1.read();
		}

*/

	///////////	BufferedWriter	/////////////////

/*		File f = new File("wc.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		bw.write('A');
		bw.newLine();
		char[] ch = {'a', 's', 'd'};
		bw.write(ch);
		bw.flush();
		bw.close();
*/

	///////////	BufferedReader	/////////////
	
/*		FileReader fr = new FileReader("wc.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null){
			System.out.print(line);
			line = br.readLine();
		}
		br.close();
*/

	//////////	PrintWriter		///////////////////
/*		FileWriter fw = new FileWriter("fileWriter.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('a');
		pw.println("Hello");
		pw.flush();
		pw.close();
*/

	}

}