package Arrays.p2;

import java.util.Arrays;
import java.util.Scanner;

// rotate array elements towards left by k
public class RotateArrayLeft {
    public static void rotate(int[] arr, int d)
    {
        int n = arr.length;
        d = d%n;

        if(d==n) return;    // this indicates no need to rotate, answer will original array only
        // rotate left
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);


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
        rotate(arr,k);
        System.out.println("Array After k rotations to left \n"+Arrays.toString(arr));
    }
}
