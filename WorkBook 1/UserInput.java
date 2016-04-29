import java.io.BufferedReader;
import java.io.Console;
import java.io.IOError;
import java.io.InputStreamReader;
import java.util.Scanner;

class UserInput{
	
	public static void main(String[] args) throws Exception{
		// System.out.println(input1());
		// System.out.println(input2());
		System.out.println(input3());
		// System.out.println(input4());

	}

	public static String input1(){
	    System.out.println("enter the name");
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    return "Hello "+s1;
	}
	public static String input2()throws IOError{
	    Console c=System.console();
	    String s2=c.readLine("enter the name\n");
	    return "Hello "+s2;
	}
	public static String input3(){
	    System.out.println("enter the name");
	    String s3=javax.swing.JOptionPane.showInputDialog("enter the name");
	    return "Hello "+s3;

	}
	public static String input4()throws Exception{
	    System.out.println("enter the name");
	    InputStreamReader isr=new InputStreamReader(System.in);
	    BufferedReader br=new BufferedReader(isr);
	    String s4=br.readLine();
	    return "Hello "+s4;
	}
}