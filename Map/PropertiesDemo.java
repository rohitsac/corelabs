import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("prop.zzz");
		p.load(fis);
		System.out.println(p);
		
		String s = p.getProperty("url");
		System.out.println(s);
		
		p.setProperty("aaa", "123");
		FileOutputStream fos = new FileOutputStream("prop.zzz");
		p.store(fos, "updated by me !!");
		
		
	}
}
