public class P01_CeilingNumber {
    // floor is the smallest number greater than target
    static int ceilinglogic(int[] nums, int target) {

        // If target is greater than the largest element,
        // then no ceiling exists.
        if (target > nums[nums.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = nums.length - 1;

        // Normal Binary Search
        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target is smaller than middle element.
            // nums[mid] COULD be the ceiling,
            // but there might be a smaller valid element on the left.
            // So search the left half.
            if (target < nums[mid]) {
                end = mid - 1;
            }

            // Target is greater than middle element.
            // nums[mid] can NEVER be the ceiling because it is too small.
            // Ignore the left half and search right.
            else if (target > nums[mid]) {
                start = mid + 1;
            }

            // Exact match.
            // Target itself is the smallest element >= target.
            // Therefore it is the ceiling.
            else {
                return nums[mid];
            }
        }

        /*
         Loop ends when start > end.

         At this moment:

         end   -> last element smaller than target
         start -> first element greater than target

         Example:
         [1,3,5,7,9,11,13,15,17]
                    E  S
                    11 13

         Since ceiling = smallest element >= target,
         answer is nums[start].
        */

        return nums[start];
    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11,13,15,17};
        int target = 19;

        int ans = ceilinglogic(arr, target);

        System.out.println(ans);
    }
}