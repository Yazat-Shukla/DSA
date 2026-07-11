import java.util.*;
public class BINARYSEARCHMAIN {
    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,22,45,89};
        int target = 22;
        int and = binarysearch(arr,target);
        System.out.println(and);
    }
    //return the index
    // return -1 if it doesnt exists
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
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
