// URLWriter.java - Writes to URL
package asg;

public class URLWriter implements Writer {
    public void write(String msg) {
        System.out.println("URL: " + msg);
    }
}