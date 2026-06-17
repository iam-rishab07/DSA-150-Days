package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {35,123,68,3453,945,223};
        System.out.println("The Array "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("The Array after sort "+ Arrays.toString(arr));
    }
}
