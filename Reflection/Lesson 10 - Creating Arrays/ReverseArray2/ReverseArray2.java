// ReverseArray2.java - reverse array elements, specialize for doubles

public class ReverseArray2 {
    public static void main(String[] args) {
        double[] vals = {1.1, 1.2, 1.3, 1.4, 1.5};
        reverseArray(vals);
        for (double elem : vals)
            System.out.format("%3.1f ", elem);
        System.out.println();

        String[] nums = {"one", "two", "three", "four"};
        reverseArray(nums);
        for (String elem : nums)
            System.out.format("%s ", elem);
        System.out.println();
    }

    static <T> void reverseArray(T[] array) {
        System.out.format("reverse with %ss\n",
            array.getClass().getComponentType().getSimpleName());
        int len = array.length;
        for (int i = 0; i < len/2; i++) {
            T temp = array[len-i-1];
            array[len-i-1] = array[i];
            array[i] = temp;
        }
    }

    static void reverseArray(double[] array) {
        System.out.format("reverse with doubles\n");
        int len = array.length;
        for (int i = 0; i < len/2; i++) {
            double temp = array[len-i-1];
            array[len-i-1] = array[i];
            array[i] = temp;
        }
    }
}

/***********************************************

$ java ReverseArray2
reverse with doubles
1.5 1.4 1.3 1.2 1.1
reverse with Strings
four three two one 

*/
