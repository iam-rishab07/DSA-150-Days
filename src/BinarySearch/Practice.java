package BinarySearch;

public class Practice {
    public static int binRev(int[] arr, int target)
    {
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {110,57,43,23,11,10,7};
        int target = 1143;
        int ans = binRev(arr,target);
        if(ans==-1) System.out.println("Not found!");
        else System.out.println("Found at index "+ans);
    }
}
