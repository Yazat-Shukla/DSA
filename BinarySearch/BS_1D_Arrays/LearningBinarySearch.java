import java.util.*;
public class LearningBinarySearch {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isASC = arr[start] <arr[end];
        while (start<=end){
            int middle = start+(end-start)/2;
            if (isASC) {
                if (target<arr[middle]){
                    end = middle-1;
                } else if (target>arr[middle]){
                    start=middle+1;
                } else {
                    return middle;
                }

            } else {
                if (target<arr[middle]){
                    start= middle+1;
                } else if (target >arr[middle]){
                    end = middle-1;
                } else {
                    return middle;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {95, 82, 71, 63, 51, 44, 30, 18, 7};
        int target = 44;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }
}
