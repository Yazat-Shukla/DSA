import java.util.*;
public class P02_SelectionSortBaseLogic {
    public static void main(String[] args){
        int[] arr = {-23,25,34,12,53};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr){
        int i = 0;

        for (i =0;i<arr.length;i++){
            int min =i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min !=i){
                swap(arr,i,min);
            }
        }
    }
    static void swap(int[] arr,int start , int end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
