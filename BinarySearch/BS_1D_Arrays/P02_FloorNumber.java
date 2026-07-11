import java.util.*;
public class P02_FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18};
        int target = 13;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    //floor means largest number smaller than target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[0]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end; // as upon running teh end would go behind start and middle (which are at same index) and it would give the smallest largest number of target
    }
}
