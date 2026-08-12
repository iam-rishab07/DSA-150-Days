package BinarySearch.P2;

// search in an infinite sorted array using unbounded search
public class InfiniteSortedArray {
    public int unbounded(int[] arr, int key)
    {
        int low = 0, high = 1;
        while(high<arr.length && arr[high]<key)
        {
            low = high;
            high = 2*high;
        }
        if(high>=arr.length)
        {
            high = arr.length-1;
        }
        return binary(arr,low,high,key);
    }

    public int binary(int[] arr, int low , int high , int key)
    {
        while(high >= low)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key)
                low = mid+1;
            else
                high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        InfiniteSortedArray is = new InfiniteSortedArray();
        int[] arr = {10,20,30,40,50,60,70,80,100,110,120,140,150,160,170,180,190,200};
        int key = 90;
        int ans = is.unbounded(arr,key);
        System.out.println("Element at index "+ans);
    }
}
