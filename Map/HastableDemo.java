import java.util.Hashtable;

public class HastableDemo {
	public static void main(String[] args) {
		
		/////	Constructor		///////

/*		Hashtable ht1 = new Hashtable();	//	empty hashtable with default capacity of 11 and fill ratio of 0.75
		Hashtable ht2 = new Hashtable(100);
		Hashtable ht3 = new Hashtable(100, 0.5F);
		Hashtable ht4 = new Hashtable(map);
*/		
		
		Hashtable h = new Hashtable();
		h.put(new Temp(5), "A");
		h.put(new Temp(2), "B");
		h.put(new Temp(6), "C");
		h.put(new Temp(15), "D");
		h.put(new Temp(23), "E");
		h.put(new Temp(16), "F");
		
//		h.put("hai", null);
		
		System.out.println(h);
		
	}
}

class Temp{
	int i;
	
	public Temp(int i) {
		this.i = i;
	}
	
	public String toString(){
		return i+"";
	}
}

