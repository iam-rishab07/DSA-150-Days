package Arrays.basic;

import java.util.Scanner;

public class Min {
    public static int minElement(int[] arr, int n)
    {
        int min = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<min) min = arr[i];
        }
        return min;
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
        int min = minElement(arr,n);
        System.out.println("The min element is : "+ min);
    }
}
