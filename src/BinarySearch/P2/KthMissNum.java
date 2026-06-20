package BinarySearch.P2;

// Kth missing positive number in a sorted array
public class KthMissNum {
    public int kthMissing(int[] arr, int k) {
        int low = 0, high = arr.length-1;
        int res = arr.length+k;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]>mid+k)      // we need to go left
            {
                res = mid+k;        // potential answer
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}
