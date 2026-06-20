package BinarySearch;

// Peak index in a mountain array (Leetcode)
public class PeakIndex {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length-1;
        int peak = Integer.MIN_VALUE;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid+1])
                high = mid;
            else
                low = mid+1;
        }
        return low;
    }
}
