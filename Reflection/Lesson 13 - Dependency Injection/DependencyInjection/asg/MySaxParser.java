// MySaxParser.java - XML Parser for custom container
package asg;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MySaxParser extends DefaultHandler {
    private ArrayList<Element> elementList = new ArrayList<Element>();
    private String id = null;
    private String className = null;
    private String propName = null;
    private String refName = null;

    public ArrayList<Element> getElementList() {
        return elementList;
    }

    @Override
    public void startElement(String namespaceURI, String sName,
            String qName, Attributes attrs) throws SAXException {
        if (qName.equals("bean")) {    // bean element
            if (attrs != null) {
                for (int i = 0; i < attrs.getLength(); i++) {
                    if (attrs.getLocalName(i).equals("id"))
                        id = attrs.getValue(i);
                    if (attrs.getLocalName(i).equals("class"))
                        className = attrs.getValue(i);
                }
                if (id != null && className != null) {
                    Element el = new Element(id, className);
                    el.setElementName(qName);
                    elementList.add(el);
                }
            }
        } else if (qName.equals("property")) {  // property element
            // this is nested so id and className will already be set
            if (attrs != null) {
                for (int i = 0; i < attrs.getLength(); i++) {
                    if (attrs.getLocalName(i).equals("name"))
                        propName = attrs.getValue(i);
                    if (attrs.getLocalName(i).equals("ref"))
                        refName = attrs.getValue(i);
                }
                if (propName != null && refName != null) {
                    Element el = new Element(propName, refName);
                    el.setElementName(qName);
                    el.setParent(id);
                    elementList.add(el);
                }
            }
        }
    }
    @Override
    public void endElement(String namespaceURI, String sName,
            String qName) throws SAXException {
        if (qName.equals("bean")) {  // end of bean element
            id = null;
            className = null;
        } else if (qName.equals("property")) {
            propName = null;
            refName = null;
        }
    }
}
