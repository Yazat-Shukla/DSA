public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 15, 16, 22, 45, 89};
        int[] arr = {99,80,75,22,11,9,5,3,2};
        int target = 22;

        int ans = orderagnosticbs(arr, target);
        System.out.println(ans);
    }
    static int orderagnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isASC = arr[start] < arr[end];

        while (start <= end) {
            // find whether the array is sorted in ascending or descending

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isASC) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }
        return -1;
    }
}