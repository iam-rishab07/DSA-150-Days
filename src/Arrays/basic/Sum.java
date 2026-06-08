package Arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

// find the sum of elements of array
public class Sum {
    public static int total(int[] arr)
    {
        int sum = 0;
        for(int num:arr)
        {
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = total(arr);
        System.out.println("The Array is "+ Arrays.toString(arr));
        System.out.println("The total sum is : "+sum);
    }
}
