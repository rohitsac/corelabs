// FileWriter.java - Writes to File
package asg;

public class FileWriter implements Writer {
    public void write(String msg) {
        System.out.println("File: " + msg);
    }
}