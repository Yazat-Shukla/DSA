import java.util.*;
public class P04_RevisingtheSortingLogic {
    public static void main(String[] args){
        int[] arr = {23,-43,-5,21,5,62};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {23,-43,-5,21,5,62};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int i = 0;
        for (i =0;i<arr.length;i++){
            for (int j =0;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void Selection(int[] arr){
        int minval=0; //taken as index of minimum value
        for (int i =0;i<arr.length;i++){
            minval=i;
            for (int j = i;j<arr.length;j++){
                if (arr[j]<arr[minval]){

                    minval = j;
                }

            }
            swap(arr,i,minval);

        }
    }
    static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
