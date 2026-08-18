class L852_PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while (start<end){
            mid = start+ (end-start)/2;
            if (arr[mid]<arr[mid+1]){
                //why mid? because we dont know whether the mid is the soltuion or not
                end = mid;
            } else {
                start = mid+1;
            }

        }
        return mid;
    }
}