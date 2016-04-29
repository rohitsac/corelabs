import java.io.*;

class PrintItself{
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("PrintItself.java"));
		
		String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}