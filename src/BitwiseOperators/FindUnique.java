package BitwiseOperators;

import java.util.Scanner;

public class FindUnique {
    public static int findUnique(int[] arr)
    {
        int res = 0;
        for(int num:arr)
        {
            res ^= num;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size (odd) : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter numbers such that only 1 unique number , rest all appear twice");
        for(int i = 0; i<num;i++)
        {
            System.out.println("enter number "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        int res = findUnique(arr);
        System.out.println("the Unique number is "+res);
    }
}
