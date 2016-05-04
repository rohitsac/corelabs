// ReverseArray.java - reverse array elements, handles primitives
import java.lang.reflect.Array;

public class ReverseArray {
    public static void main(String[] args) {
        try {
            double[] vals = { 1.1, 1.2, 1.3, 1.4, 1.5 };
            reverseArray(vals);
            for (double elem : vals)
                System.out.format("%3.1f ", elem);
            System.out.println();
            
            String[] nums = { "one", "two", "three", "four" };
            reverseArray(nums);
            for (String elem : nums)
                System.out.format("%s ", elem);
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }

    static <T> void reverseArray(T array) {
        int len = Array.getLength(array);
        for (int i = 0; i < len/2; i++) {
            Object temp = Array.get(array, len-i -1);
            Array.set(array, len-i-1, Array.get(array, i));
            Array.set(array, i, temp);
        }
    }
}

/***********************************************

$ java ReverseArray
1.5 1.4 1.3 1.2 1.1
four three two one 

*/
