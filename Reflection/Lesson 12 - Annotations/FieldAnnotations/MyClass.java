// MyClass.java - Field annotations

public class MyClass {
    @Token(name="Field", code=20)
    @Platform(what="Mac")
    private String data;
    private int num;
    public MyClass() { }
    public MyClass(String data) { this.data = data; }
    public String read() { return data; }
    public void write(String value, int num) { }
}