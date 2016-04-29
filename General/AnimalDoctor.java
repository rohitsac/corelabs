import java.util.ArrayList;
import java.util.List;

class Animal{}
 
class BigCat extends Animal{}
class Cat extends BigCat{}
class Dog extends Animal{}
 
class AnimalDoctor{
    void addAll(List<? super BigCat> animals){ 
        animals.add(new BigCat());      
        // animals.add(new Object());   
        animals.add(new Animal());         
    }
    public static void main(String[] args){
        List<BigCat> bigcats=new ArrayList<>();
        bigcats.add(new BigCat());
        bigcats.add(new BigCat());
         
        AnimalDoctor obj=new AnimalDoctor();
        obj.addAll(bigcats);
    }
}