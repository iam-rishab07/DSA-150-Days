package BinarySearch.SearchAnswer;

// Aggressive cow problem (GFG)
import java.util.*;
public class AggressiveCows {
    public static boolean isPossible(int[] arr, int k, int dist)
    {
        int cnt = 1;
        int curr = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-curr>=dist)
            {
                curr = arr[i];
                cnt++;
            }
        }
        return cnt>=k;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int res = 0;
        int low = 1;        // min distance is one
        int high = arr[arr.length-1]-arr[0];    // max distance will be ,
        // max position- min position
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isPossible(arr,k,mid))
            {
                res = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return res;
    }
}
