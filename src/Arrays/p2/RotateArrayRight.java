package Arrays.p2;

import java.util.Arrays;
import java.util.Scanner;

// rotate array elements to right by k
public class RotateArrayRight {
    public static void rotateClockwise(int[] arr, int k) {
        // code here
        int n = arr.length;
        k = k%n;

        if(k==n) return;    // this indicates no need to rotate, answer will original array only

        // rotate right
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

    }
    private static void reverse(int[] arr, int left, int right)
    {
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
        int[] arr = {325,23,92,78,342,4,289};
        System.out.println("The Array : "+ Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k : ");
        int k = sc.nextInt();
        rotateClockwise(arr,k);
        System.out.println("Array After k rotations to right \n"+Arrays.toString(arr));
    }

}
