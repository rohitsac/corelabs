// Element.java - Map of element/parent strings
package asg;
import java.util.AbstractMap.SimpleEntry;

public class Element {
    private SimpleEntry<String, String> entry;
    private String elementName = null;
    private String parent = null;

    public Element(String key, String value) {
        entry = new SimpleEntry<String, String>(key, value);
    }
    public String getKey() { return entry.getKey(); }
    public String getValue() { return entry.getValue(); }
    public String getElementName() { return elementName; }
    public String getParent() { return parent; }
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
    public void setParent(String parent) {
        this.parent = parent;
    }
}
