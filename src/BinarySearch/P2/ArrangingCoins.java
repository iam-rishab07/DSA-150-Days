package BinarySearch.P2;

// leetcode 441     T.C.= O(log n)
public class ArrangingCoins {
    public int arrangeCoins(int n) {            // using in-built methods
        long m = n;
        return (int)(Math.sqrt(8*m+1)-1)/2;
    }

    // without inbuilt methods
    public int arrange(int n)
    {
        long low = 1, high = n;
        while(low <= high)
        {
            long mid = low+(high-low)/2;
            long k = mid*(mid+1)/2;
            if(k==n) return (int) mid;
            else if(k<n) low = mid+1;
            else high = mid-1;
        }
        return (int) high;
    }
}
