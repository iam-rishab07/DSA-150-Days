package Arrays.Problem1;

import java.util.Scanner;

public class MaxElement {
    public static int max(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int num : arr)
        {
            if(max<num) max = num;
        }
        return max;
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
        int ans = max(arr);
        System.out.println("the max element is "+ans);
    }
}
