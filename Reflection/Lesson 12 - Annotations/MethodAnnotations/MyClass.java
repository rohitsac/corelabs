// MyClass.java - Method annotations

public class MyClass {
    private String data;
    public MyClass() { }
    public MyClass(String data) { this.data = data; }
    public void print() { }
    @Token(name="Void Method", code=30)
    public String read() { return data; }
    @Token(name="Method", code=30)
    @Platform(what="Mac")
    public void write(String value, int num) { }
}