import java.util.*;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class P03_InfiniteArrays {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 12, 15, 18, 21, 25, 30, 35, 40, 45, 50};
        int target = 21;

        int result = ans(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with box of 2
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int temp = end+1;
            //double the box value
            // end = previous end + sizeofbox *2
            end = end + (end- start + 1) * 2;
            start = temp;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){

        while(start<=end){
            //find the middle element
//            int mid = (start+end)/2 // might be possible that in start+end exceeds the range of integer in java
            int mid = start + (end-start)/2;
            if(target <arr[mid]){
                end=mid-1;
            } else if (target > arr[mid]){
                start = mid+1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
