package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {35,123,68,3453,945,223};
        System.out.println("The Array "+ Arrays.toString(arr));
        selection(arr);
        System.out.println("The Array after sort "+ Arrays.toString(arr));
    }
}
