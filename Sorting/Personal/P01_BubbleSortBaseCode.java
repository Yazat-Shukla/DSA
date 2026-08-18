import java.util.*;
public class P01_BubbleSortBaseCode {
    public static void main(String[] args){
        int[] arr = {-2,3,0,42,12};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[] arr){
        for (int i = 0;i<=arr.length-1;i++){ //this loop i acts as number of passes over the index , making the initial starting marker in linear sorting
            for (int j = 0;j<arr.length-1-i;j++){ // this one iterates to all values in array comparing values and
                // acts as anchor to swap the values, and add -i in the loop condition to prevent it from checking already maximum value in
                // thenumber of passes
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

}
