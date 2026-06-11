package Arrays.p3;

// gfg question : Wave Array

/*
Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
*/

public class WaveArray {
    public void waveSort(int[] arr)
    {
        for(int i=1;i<arr.length;i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
}
