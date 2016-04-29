import java.io.*;

class B{
	public static void main(String[] args) throws IOException{
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the Strings...");
		System.out.println("enter 'halt' to terminate...");

		do{
			s = br.readLine();
			System.out.println(s);
		}while(!s.equals("halt"));

	}
}