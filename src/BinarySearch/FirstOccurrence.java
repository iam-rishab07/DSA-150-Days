package BinarySearch;

public class FirstOccurrence {
    public int firstSearch(int[] arr, int target) {

        int low = 0, high = arr.length-1, idx = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>target)
                high = mid-1;
            else if(arr[mid]<target)
                low = mid+1;
            else{
                idx = mid;
                high = mid-1;
            }
        }
        return idx;
    }
}
