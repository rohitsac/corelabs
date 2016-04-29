import java.lang.*;
import java.util.*;

class Misc{
	public static void main(String[] args) throws Exception{
		// System.out.println(System.out);
		// System.out.println(System.out.println("hello"));
		// System.out.println(null);
		// System.out.println(System.toString());
		// System.out.println(new System().toString());

		// System.out.println(this);
		// System.out.println(this.hashCode());
		// System.out.println(super);
		// System.out.println(super.hashCode());
		// System.out.println(super.getClass().getName());
		// System.out.println(java.lang.Object);
		// System.out.println(ObjecthashCode());
		// System.out.println(new Object().hashCode());

		/**************** from API *******************/
		// public void write(int);
  		// public void write(byte[], int, int);
		/********************************************/
		// System.out.write("Hello");
		// System.out.write(97);
		// System.out.write(1);
		// System.out.write(10);
		// System.out.write(12);
		// System.out.write(123);
		// System.out.flush();
	
	/*	byte[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		// System.out.write(b);
		System.out.write(b, 1, 3);
		//	here flush is not required
	*/

		// System.out.println(1.0/-0.);
		
	/*	//	output is platform Dependent	////
		char[] carr = new char[]{'\u0097'};
		System.out.println(carr);
		String s = new String(carr);
		byte[] barr = s.getBytes();
		System.out.println(Arrays.toString(barr));
	*/	

		// System.out.println(0.1*3 ==	0.3);
		// System.out.println((Integer)111 == (Integer)111);
		// System.out.println((Integer)222 == (Integer)222);

		// System.out.println(Math.min(Double.MIN_VALUE, 0.0D));

		
//	------	HashCode of Strings (22-04-16)	-------------//
		
		// String str1 = "A";
		// System.out.println(str1.hashCode());
		// str1 = str1.intern();
		// System.out.println(str1.hashCode());

		// String str2 = new String();
		// System.out.println(str2.hashCode());

		// String str2 = new String("A");
		// System.out.println(str2.hashCode());

		// Integer i1 = new Integer(10);
		// System.out.println(i1.hashCode());

		// char ch = 'A';
		// String ss = new String(ch.toString());


	



	}

	// public void callThis(){
	// 	this = null;
	// }
}