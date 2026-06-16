package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimal(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean isSorted = true;
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    isSorted = false;
                    break;
                }
            }
            if(isSorted) break;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
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
        bubbleSortOptimal(arr);
        System.out.println("The Array after sort "+ Arrays.toString(arr));
    }
}
