// Factory.java - Factory class
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
    public static Dbase createDbase() throws ClassNotFoundException,
            InstantiationException, IllegalAccessException, IOException {
        Properties props = new Properties();
        InputStream file = new FileInputStream("Dbase.properties");
        props.load(file);
        String name = props.getProperty("Dbase");
        file.close();
        return createObject(name);    // no arg constructor
    }
    
    @SuppressWarnings("unchecked")
    static <T> T createObject(String className)
      throws ClassNotFoundException, InstantiationException,
                IllegalAccessException {
          Class<?> c = Class.forName(className);
          return (T)c.newInstance();
    }
}
