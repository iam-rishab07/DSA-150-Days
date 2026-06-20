package BinarySearch;

// floor in a sorted array GFG
public class Floor {
    public int findFloor(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        int idx = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]>target)
                high = mid-1;
            else if(arr[mid]<=target)
            {
                idx = mid;
                low = mid+1;
            }
        }
        return idx;
    }
}
