import java.io.*;

class C{
	public static void main(String[] args) throws IOException{
		String[] s = new String[100];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter line of text....");
		System.out.println("enter 'stop' to quit");

		for(int i=0; i<100; i++){
			s[i] = br.readLine();
			// System.out.println(s[i]);
			if(s[i].equals("stop"))	break;
		}

		System.out.println("here is ur file...");
		for(int i=0; i<100; i++){
			System.out.println(s[i]);
			if(s[i].equals("stop"))	break;
		}
		
	}
}