package Personal;

import java.util.*;
public class P01_SortedRowColumnMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {33, 34, 38, 50},
        };
        System.out.println(Arrays.toString(search(arr, 30)));
    }
    static int[] search(int[][] matrix,int target){
        int r=0;
        int c = matrix[0].length-1;
        while (r<matrix.length && c>=0 ){
            if (matrix[r][c]==target){
                return new int[]{r,c};
            } else if (matrix[r][c]>target){
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }

}
