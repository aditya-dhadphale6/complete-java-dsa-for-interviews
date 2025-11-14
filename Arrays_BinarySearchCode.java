import java.util.*;

public class Arrays_BinarySearchCode {

    public static int binarySearch (int[] num, int key) {

        int start = 0;
        int end = num.length-1;

        while (start<=end) {
            int mid = (start+end)/2;

            if (num[mid]==key){
                return mid;
            }
            if (num[mid]<key){
                start=mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter key");
        int key = sc.nextInt();

        int index = binarySearch(num,key);
        System.out.println("Key is at index :" + index);
    }
}
