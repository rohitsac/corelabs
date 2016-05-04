// MyContainer.java - Custom container
package asg;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class MyContainer {
    private MySaxParser parser = new MySaxParser();
    private Map<String, Object> map = new HashMap<String, Object>();

    public MyContainer(String xmlFile) throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser sp = factory.newSAXParser();
        sp.parse(MyContainer.class.getResourceAsStream(xmlFile), parser);
        buildMap();
    }
    
    public Object getComponent(String id) throws IllegalArgumentException {
        if (map.containsKey(id))
            return map.get(id);
        throw new IllegalArgumentException(id);
    }

    private void buildMap() throws Exception {
        ArrayList<Element> el = parser.getElementList();
        for (Element e : el)    // build all beans first
            if (e.getElementName().equals("bean")) {
                Object bean = Class.forName(e.getValue()).newInstance();
                map.put(e.getKey(), bean);
            }
        for (Element e : el)    // set property in parent bean
            if (e.getElementName().equals("property") && e.getParent() != null) {
                Object reference = map.get(e.getValue());
                Object bean = map.get(e.getParent());
//                System.out.format("%s %s %s\n", 
//                    bean.getClass().getSimpleName(),e.getKey(),
//                            reference.getClass().getSimpleName());
                setProperty(bean, e.getKey(), reference);
            }
    }

    private void setProperty(Object obj, String fieldName, Object arg)
            throws NoSuchMethodException, IllegalAccessException,
                InvocationTargetException {
        Class<?> c = obj.getClass();
        StringBuilder setMethodName = new StringBuilder(fieldName);
        char ch = (char)((int)setMethodName.charAt(0) - 32);
        setMethodName.setCharAt(0, ch);
        setMethodName.insert(0, "set");
        Method method = c.getMethod(setMethodName.toString(),
                arg.getClass().getInterfaces()[0]);
        method.invoke(obj, arg);    // call setter method
    }
}
