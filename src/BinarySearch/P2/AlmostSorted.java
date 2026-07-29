package BinarySearch.P2;

// Search in an almost sorted array
public class AlmostSorted {
    public int findTarget(int[] arr, int target) {
        int low=0, high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }else if(mid-1>=0 && arr[mid-1]==target){
                return mid-1;
            }else if(mid+1<arr.length && arr[mid+1]==target)
            {
                return mid+1;
            }else if(arr[mid]<target)
            {
                low = mid+1;
            }else high = mid-1;
        }
        return -1;
    }
}
