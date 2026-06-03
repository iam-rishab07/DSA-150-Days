package Arrays.Problem1;

import java.util.Arrays;
import java.util.Scanner;

public class Multiply10 {
    public static int[] multi(int[] arr)
    {
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            res[i] = arr[i]* 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        int[] ans = multi(arr);
        System.out.println("After multiply by 10 : "+ Arrays.toString(ans));
    }
}
