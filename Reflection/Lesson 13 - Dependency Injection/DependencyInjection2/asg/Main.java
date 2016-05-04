// Main.java - Container application
package asg;

public class Main {
    public static void main(String[] args) {
        try {
            MyContainer container = new MyContainer();
            WriterService writerService =
                    (WriterService)container.getComponent("asg.WriterService");
            writerService.writeMessage("Here is a message.");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}

/********************************************************

$ java Main
File: Here is a message.

*/
