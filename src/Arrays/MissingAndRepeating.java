package Arrays;

// Missing And Repeating (GFG)

import java.util.*;
public class MissingAndRepeating {
    ArrayList<Integer> findTwoElement(int[] arr) {
        int missing = 0, repeating = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // finding repeating element by marking array
        for(int i=0;i<arr.length;i++)
        {
            int val = Math.abs(arr[i]); // we need original positive values
            int pos = val-1;  // ideal index at which the val must present

            if(arr[pos]>0)  // mark the value at that pos as negative
            {
                arr[pos] = -arr[pos];
            }else{
                repeating = val;    // if already negative , it means val is repeating
            }
        }

        // finding missing element
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                missing = i+1;  // element at index is pos , it mean ideal val(i+1) is missing
            }
        }
        list.add(repeating);
        list.add(missing);

        return list;
    }
}
