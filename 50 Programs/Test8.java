package pack;

import java.io.IOException;

public class Test8 {
	public static void main(String[] args) throws IOException {
		System.out.println("enter a char");
		char ch = (char)System.in.read();
		
		if(ch>=65 && ch<=90)
			System.out.println("UPPER CASE");
		else if(ch>=97 && ch<=122)
			System.out.println("lower case");
		else if(ch>=48 && ch<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Char");
	}

}

//	read a char and check CASE, Digit, Special Char