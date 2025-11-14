import java.util.*;
public class Arrays_PrintSubarrays {
    public static void subArray(int[] array){
        int total_subarrays=0;
        for (int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k = i;k<j; k++){
                    System.out.print(array[k] + " ");
                }
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are :" + total_subarrays);
    }

    public static void main (String [] args){
        int[] array={2,4,6,8,10};
        subArray(array);
    }

}
