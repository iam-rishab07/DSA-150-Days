package BinarySearch;

// return the first and last occurrence of an element in a sorted array
import java.util.*;
public class FirstLastOccurrences {
    ArrayList<Integer> find(int arr[], int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int low = 0, high = arr.length-1;
        int first = -1, last = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]<target)
                low = mid+1;
            else if(arr[mid]>target)
                high = mid-1;
            else{
                first = mid;
                high = mid-1;
            }
        }
        list.add(first);
        low = 0;
        high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]<target)
                low = mid+1;
            else if(arr[mid]>target)
                high = mid-1;
            else{
                last = mid;
                low = mid+1;
            }
        }
        list.add(last);

        return list;
    }
}
