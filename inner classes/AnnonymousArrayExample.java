public class AnnonymousArrayExample {

    public static void main(String[] args) {
       
        //calling method with anonymous array argument
        System.out.println("first total of numbers: " + sum(new int[]{ 1, 2,3,4}));
        System.out.println("second total of numbers: " + sum(new int[]{ 1, 2,3,4,5,6,}));
      
    }
    
    //method which takes an array as argument
    public static int sum(int[] numbers){
        int total = 0;
        for(int i: numbers){
            total = total + i;
        }
        return total;
    }
}


// Read more: http://javarevisited.blogspot.com/2012/01/anonymous-array-example-java-create.html#ixzz44gqjPCqw