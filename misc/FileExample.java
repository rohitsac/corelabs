import java.io.*;

public class FileExample {

public static void main(String[] args) {
boolean flag = false;

// create File object
File stockFile = new File("/Desktop/stockFile.txt");

try {
    flag = stockFile.createNewFile();
} catch (IOException ioe) {
     System.out.println("Error while Creating File in Java" + ioe);
}

System.out.println("stock file" + stockFile.getPath() + " created ");

}
}

