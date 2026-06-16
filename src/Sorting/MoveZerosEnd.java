package Sorting;

import java.util.Arrays;

// move all zeros to the end
public class MoveZerosEnd {
    public static void moveZeros(int[] arr)
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,123,0,3453,0,223};
        System.out.println("The Array "+ Arrays.toString(arr));
        moveZeros(arr);
        System.out.println("The Array after sort "+ Arrays.toString(arr));
    }
}
