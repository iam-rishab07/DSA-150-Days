package Arrays.Problem3;

import java.util.Arrays;
import java.util.Scanner;

// you are given array of integers that appears twice, only one in unique. return that
public class UniqueElement {
    public static int unique(int[] nums)
    {
        int unique = 0;
        for(int num : nums)
        {
            unique ^= num;
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size (odd) : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter elements twice (one unique)");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array : "+ Arrays.toString(arr));
        int ans = unique(arr);
        System.out.println("The unique element is "+ans);
    }
}
