package Arrays.Problem1;

import java.util.Scanner;

public class Average {
    public double avg(int[] arr)
    {
        int sum = 0;
        int n = arr.length;
        for(int num:arr)
        {
            sum+=num;
        }
        double res = sum/n;

        return res;
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
        Average a1 = new Average();
        double ans = a1.avg(arr);
        System.out.println("The Average is : "+ans);
    }
}
