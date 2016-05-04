// OtherDbase.java

public class OtherDbase implements Dbase {
    public OtherDbase() { }
    public void write(Record obj) {
        System.out.println("OtherDbase: write");
    }
    public Record read() {
        System.out.println("OtherDbase: read");
        return new Record();
    }
}