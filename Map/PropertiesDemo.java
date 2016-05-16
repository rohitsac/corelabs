import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("messages.properties");
		p.load(fis);
		System.out.println(p);
		
		String s = p.getProperty("url");
		System.out.println(s);
		
		p.setProperty("aaa", "1123");
		FileOutputStream fos = new FileOutputStream("messages.properties");
		p.store(fos, "updated by me !!");
		
		
	}
}
