import java.util.*;

public class Arrays_LargestNumber {

    public static int getLargest(int[] num) {
        int largest = Integer.MIN_VALUE; // start with the smallest possible integer

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] num = {1, 23, 54, 28, 64, 34, 73, 12};
        System.out.println("Largest number is: " + getLargest(num));
    }
}
