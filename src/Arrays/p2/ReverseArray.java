package Arrays.p2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr)
    {
        int left = 0;
        int right = arr.length-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {124,46,24,546,2,35,6,3543,22};
        Scanner sc = new Scanner(System.in);
        System.out.println("The Array is "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("After Reversing array is "+Arrays.toString(arr));
    }
}
