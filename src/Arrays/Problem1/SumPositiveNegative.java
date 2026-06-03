package Arrays.Problem1;

import java.util.Scanner;

//return sum of +ve and -ve numbes
public class SumPositiveNegative {
    public static int[] sum(int[] arr)
    {
        int posSum = 0;
        int negSum = 0;
        for(int num : arr)
        {
            if(num<0) negSum+=num;
            else posSum+=num;
        }
        return new int[] {posSum,negSum};
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
        int[] ans = sum(arr);
        System.out.println("The sum of +ve numbers is "+ans[0]+"\nThe sum of -ve numbers is "+ans[1]);
    }
}
