import java.time.Year;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
//		int n = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year : ");
		int i = sc.nextInt();
		Year y = Year.of(i);
		
		if(y.isLeap())
			System.out.println("YES ...it is a leap year");
		else
			System.out.println("NOOOOOOOO......not at all a leap");
	}
}
