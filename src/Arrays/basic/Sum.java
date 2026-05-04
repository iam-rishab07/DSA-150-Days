package Arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("The Array is "+ Arrays.toString(arr));
        System.out.println("The total sum is : "+sum);
    }
}
