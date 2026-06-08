package Arrays.Problem3;

import java.util.Arrays;
import java.util.Scanner;

// given an array in range 0 to n, find the missing element
public class MissingElement {
    public static int missing(int[] arr)
    {
        int xorSum = 0;

        for(int num:arr)
        {
            xorSum = xorSum^num;
        }
        for(int i=0;i<=arr.length;i++)
        {
            xorSum = xorSum^i;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("enter elements in range 0 to "+n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array : "+ Arrays.toString(arr));
        int res = missing(arr);
        System.out.println("The missing element is "+res);
    }
}
