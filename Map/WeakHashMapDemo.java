import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
//		HashMap map = new HashMap();
		WeakHashMap map = new WeakHashMap();
		
		Tmp t = new Tmp();
		
		map.put(t, "Hello");
		System.out.println(map);
		
		t = null;		// nullifying Object
		System.gc();
		
		Thread.sleep(2000);
		System.out.println(map);
	}
}


class Tmp{
	public String toString(){
		return "tmp";
	}
	
	public void finalize(){
		System.out.println("finalize()... called...");
	}
}