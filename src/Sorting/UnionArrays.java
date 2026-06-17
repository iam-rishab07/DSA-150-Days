package Sorting;

// union of two sorted arrays
import java.util.*;
public class UnionArrays {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(i>0 && a[i-1]==a[i])  // skip duplicate is 1st array
            {
                i++;
                continue;
            }
            if(j>0 && b[j-1]==b[j])   // // skip duplicate is 2nd array
            {
                j++;
                continue;
            }

            // select and add the smaller element and move
            if(a[i]<b[j])
            {
                list.add(a[i]);
                i++;
            }
            else if(b[j]<a[i])
            {
                list.add(b[j]);
                j++;
            }else{                  // if equal , add to result and move both
                list.add(a[i]);
                i++;
                j++;
            }
        }

        // add remaining elements of a[]
        while(i<a.length)
        {
            if(i>0 && a[i-1]==a[i])
            {
                i++;
                continue;
            }
            list.add(a[i]);
            i++;
        }

        // add remaining elements of b[]
        while(j<b.length)
        {
            if(j>0 && b[j-1]==b[j])
            {
                j++;
                continue;
            }
            list.add(b[j]);
            j++;
        }
        return list;
    }

    // better version (short code)
    public static ArrayList<Integer> findUnionBetter(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        // Single loop handles both arrays and any remaining elements
        while (i < a.length || j < b.length) {
            // Pick from a[] if b[] is empty OR if a[i] is smaller/equal
            int val = (i < a.length && (j == b.length || a[i] <= b[j])) ? a[i++] : b[j++];

            // Avoid duplicates by comparing with the last added element
            if (list.isEmpty() || list.get(list.size() - 1) != val) {
                list.add(val);
            }
        }
        return list;
    }
}
