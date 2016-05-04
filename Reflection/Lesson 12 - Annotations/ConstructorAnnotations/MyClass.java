// MyClass.java - Constructor annotations

public class MyClass {
    private String data;
    @Platform(what="Mac")
    @Token(name="Default Constructor", code=40)
    public MyClass() { }
    @Token(name="Constructor", code=40)
    public MyClass(String data) { this.data = data; }
    public String read() { return data; }
    public void write(String value, int num) { }
}