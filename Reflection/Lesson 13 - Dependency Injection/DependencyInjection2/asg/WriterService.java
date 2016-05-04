// WriterService.java - Writer Service
package asg;

public class WriterService {
    @MyInject(name="asg.FileWriter")
    private Writer writer;
    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    public void writeMessage(String msg) {
        writer.write(msg);
    }
}