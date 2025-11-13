import java.util.*;

public class Arrays_SmallestNumber {

    public static int getSmallest(int[] num) {
        int smallest = Integer.MAX_VALUE; // start with the largest possible integer

        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] num = {1, 23, 54, 28, 64, 34, 73, 12};
        System.out.println("Smallest number is: " + getSmallest(num));
    }
}
