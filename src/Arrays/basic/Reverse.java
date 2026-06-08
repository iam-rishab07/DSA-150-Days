package Arrays.basic;

import java.util.Arrays;
import java.util.Scanner;


// reverse the array given by the user
public class Reverse {
    public static void reverse(int[] arr,int n)
    {
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();

        }

        System.out.println("The Array is : "+ Arrays.toString(arr));

        reverse(arr,n);

        System.out.println("The Reversed Array is : "+ Arrays.toString(arr));
    }
}
