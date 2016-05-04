// Main.java - Container Application
package asg;

public class Main {
    public static void main(String[] args) {
        try {
            MyContainer container = new MyContainer("/asg/beans.xml");
            WriterService writerService =
                    (WriterService)container.getComponent("writerService");
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
