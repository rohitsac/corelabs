// MyContainer.java - Custom container
package asg;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyContainer {
    public MyContainer() { }
    
    public Object getComponent(String id) throws Exception {
        Object bean = Class.forName(id).newInstance();
        Class<?> c = bean.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            MyInject myInject = field.getAnnotation(MyInject.class);
            if (myInject != null) {
                Object reference = Class.forName(myInject.name()).newInstance();
                setProperty(bean, field.getName(), reference);
            }
        }
        return bean;
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
