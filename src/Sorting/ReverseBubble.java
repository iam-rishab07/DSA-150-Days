package Sorting;

import java.util.Arrays;

public class ReverseBubble {
    public static void reverseBubble(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j+1]>arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {35,123,68,3453,945,223};
        System.out.println("The Array "+ Arrays.toString(arr));
        reverseBubble(arr);
        System.out.println("The Array after reverse sort "+ Arrays.toString(arr));
    }
}
