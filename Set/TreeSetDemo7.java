//	sorting based on empId or empName.
import java.util.*;

//	-------		Client Code		-------------------//
class TreeSetDemo7{
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		// TreeSet t = new TreeSet(new MyComp());
		Emp e1 = new Emp(101, "asd");
		Emp e2 = new Emp(102, "qwe");
		Emp e3 = new Emp(103, "fgjjj");
		Emp e4 = new Emp(104, "zxasw");
		Emp e5 = new Emp(105, "s");
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);

		System.out.println(t);

	}
}

//	-------		Given Class		-------------------//
class Emp implements Comparable{
	int sid;
	String sname;
	
	Emp(int sid, String sname){
		this.sid = sid;
		this.sname = sname;
	}

	public int compareTo(Object obj){
		Emp e = (Emp)obj;

		if(this.sid < e.sid)
			return -1;
		if(this.sid > e.sid)
			return +1;
		return 0;
	}

	public String toString(){
		return "sid : "+sid+" --- sname : "+sname+"\n";
	}

}

//	-------		Customized Sorting	-------------------//

class MyComp implements Comparator{
	public int compare(Object o1, Object o2){
		Emp e1 = (Emp)o1;
		Emp e2 = (Emp)o2;

//	-------		Sorting based on name of name	-------------------//
		String s1 = e1.sname;
		String s2 = e2.sname;

		return s1.compareTo(s2);
//	-------		Sorting based on length of name	-------------------//
/*		int l1 = s1.length();
		int l2 = s2.length();

		if(l1 < l2)
			return -1;
		if(l1 > l2)
			return +1;
		return s1.compareTo(s2);
*/	}
}

