// MyDbase.java

public class MyDbase implements Dbase {
    public MyDbase() { }
    public void write(Record obj) {
        System.out.println("MyDbase: write");
    }
    public Record read() {
        System.out.println("MyDbase: read");
        return new Record();
    }
}