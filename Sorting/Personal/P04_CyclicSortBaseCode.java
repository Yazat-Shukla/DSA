import java.util.*;
public class P04_CyclicSortBaseCode {
    public static void main(String[] args){
        int[] arr = {2,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        int i =0;
         //the mainv formula to check if value is at correct position or not
        while (i<arr.length){
            int correct= arr[i]-1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            } else {
                i++;
            }

        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
