package Arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

// print all the negative elements from the array
public class PrintNegative {

    public static void negative(int[] arr)
    {
        for(int num:arr)
        {
            if(num<0) System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the Array is "+ Arrays.toString(arr));
        System.out.print("the negative elements are : ");
        negative(arr);
    }
}
