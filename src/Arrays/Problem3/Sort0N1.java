package Arrays.Problem3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0N1 {

    public static void sort(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;

        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }else if(arr[left]==0) left++;
            else right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter the elements (0 or 1)");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array : "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("The Array after sorting: "+ Arrays.toString(arr));
    }
}
