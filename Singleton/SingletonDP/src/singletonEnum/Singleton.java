package singletonEnum;

/**
 * Created by Object on 09-Mar-16.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum Singleton {
   INSTANCE;

    public String getConfiguration(){
        return "xyz";
    }
}

class TestClassForSingleton{

    static void print(String name, Singleton obj){
        System.out.println(String.format("Object : %s, HashCode : %d", name, obj.hashCode()));
    }

    static void useSingleton(){
        Singleton singleton = Singleton.INSTANCE;
        print("singleton", singleton);
    }

    public static void main(String[] args) throws Exception{

        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(TestClassForSingleton::useSingleton);
        service.submit(TestClassForSingleton::useSingleton);
        service.shutdown();

    }

}