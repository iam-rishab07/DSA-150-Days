package Arrays.p3;

// gfg practice question
public class MergeTwoSortedArrays {
    public static int[] mergeArrays(int[] a, int[] b)
    {
        int n = a.length, m = b.length;
        int[] c = new int[m+n];
        int i=0,j=0,k=0;
        while (i<n && j<m)      // runs until any one array is done
            c[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];

        // we don't know which array is remaining
        while(i<n)
            c[k++] = a[i++];
        while(j<m)
            c[k++] = b[j++];

        return c;
    }
}
