package Arrays.Problem1;

import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {
    public static void swap(int[] arr)
    {
        for(int i = 1;i<arr.length;i+=2)
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size (Even) : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array : "+ Arrays.toString(arr));
        swap(arr);
        System.out.println("After Alternate Swap : "+Arrays.toString(arr));
    }
}
