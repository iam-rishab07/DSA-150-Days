package BinarySearch;

// GFG
public class SquareRoot {
    int floorSqrt(int n) {
        int low = 1, high = n;
        int ans = -1;
        while(low<=high)
        {
            int mid = low +(high-low)/2;
            if(mid*mid <= n)
            {
                ans = mid;
                low = mid+1;
            }else if(mid*mid > n)
            {
                high = mid-1;
            }

        }
        return ans;
    }
}
