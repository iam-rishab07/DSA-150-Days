package Arrays.Problem1;

import java.util.Scanner;

public class Count0N1 {
    public static int[] count(int[] arr)
    {
        int count0 = 0;
        int count1 = 0;
        for(int num:arr)
        {
            if(num==0) count0++;
            else if (num==1) count1++;
        }
        return new int[] {count0,count1};
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
        int[] ans = count(arr);
        System.out.println("The no. of zero is "+ans[0]+"\nThe no. of one is "+ans[1]);
    }
}
