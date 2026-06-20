package BinarySearch.P2;

// leetcode : maximum-count-of-positive-integer-and-negative-integer
public class MaxCount {
    // better approach (same T.C. but clean code)
    public int maximumCount(int[] nums) {
        int leftCount = firstIndex(nums,0);
        int rightCount = nums.length-firstIndex(nums,1);
        return Math.max(leftCount,rightCount);
    }

    private int firstIndex(int[] arr, int target)
    {
        int low = 0, high = arr.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return low;
    }


    //approach 1
//    public int maximumCount(int[] nums) {
//        int n = nums.length;
//        int low = 0, high = n-1;
//        int negCount = 0, posCount = 0;
//        while(low<=high)    //negative count
//        {
//            int mid = low+(high-low)/2;
//            if(nums[mid]>=0) high = mid-1;
//            else{
//                low = mid+1;
//            }
//        }
//        negCount = low;
//
//        low = 0;high = n-1;;
//        while(low<=high)
//        {
//            int mid = low+(high-low)/2;
//            if(nums[mid]<=0)
//                low = mid+1;
//            else
//                high = mid-1;
//        }
//        posCount = n-low;
//
//        return Math.max(negCount,posCount);
//    }
}
