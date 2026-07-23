package BinarySearch.SearchAnswer;

// Max Height for Given Total Reduction (GFG)
import java.util.*;
public class EkoSpoj {
    public static boolean isValid(int[] arr, int m, int maxH)
    {
        long collected = 0;
        for(int num:arr)
        {
            if(num>maxH)
                collected+=num-maxH;
        }
        return collected>=m;
    }
    int maxHeight(int[] arr, int m) {
        int low = 0, high = Arrays.stream(arr).max().getAsInt();
        int ans = 0;
        while(low<=high)
        {

            int mid = low + (high-low)/2;

            if(isValid(arr,m,mid)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
