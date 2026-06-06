package Arrays.Problems2;

import java.util.Arrays;
import java.util.Scanner;

//shift array elements by 1 position
public class ShiftElementsRight {
    public static void shiftRight(int[] arr)
    {
        int last = arr[arr.length-1];
        for(int i = arr.length-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
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
        shiftRight(arr);
        System.out.println("The Array After shifting 1 pos right : "+ Arrays.toString(arr));
    }
}
