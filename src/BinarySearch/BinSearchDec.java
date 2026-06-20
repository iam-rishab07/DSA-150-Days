package BinarySearch;

// binary search on descending order array
public class BinSearchDec {
    public int binaryDescending(int[] arr, int target)
    {
        int left = 0, right = arr.length-1;
        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                right = mid-1;
            else
                left = mid+1;
        }

        return -1;
    }
}
