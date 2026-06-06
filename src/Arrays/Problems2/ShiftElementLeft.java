package Arrays.Problems2;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftElementLeft {

    public static void shiftleft(int[] arr)
    {
        int first = arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;
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
            shiftleft(arr);
            System.out.println("The Array After shifting 1 pos left : "+ Arrays.toString(arr));

    }
}
