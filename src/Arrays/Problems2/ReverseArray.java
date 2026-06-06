package Arrays.Problems2;

import java.util.*;

public class ReverseArray {
    public static void reverse(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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
        System.out.println("The Array : "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("After reverse : "+Arrays.toString(arr));
    }
}
