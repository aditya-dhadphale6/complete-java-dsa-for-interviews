import java.util.*;
public class Arrays_PairsInArrays {
    public static void pairsInArray(int[] num){
        int totalpair = 0;

        for (int i= 0; i < num.length; i++){

            for (int j = i+1; j < num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] + ") ");
                totalpair++;
            }
            System.out.println();

        }
        System.out.println(totalpair);

    }
    public static void main(String [] args){
        int[] num= {2,4,6,8,10};
        pairsInArray(num);
    }
}
