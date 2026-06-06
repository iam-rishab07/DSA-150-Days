package Arrays.Problem1;

import java.util.Arrays;
import java.util.Scanner;

//print exteme elements in an alternate manner
public class PrintExtreme {

    public static int[] extreme(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        int left = 0, right = n-1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                ans[i] = arr[left];
                left++;
            }else{
                ans[i] = arr[right];
                right--;
            }
        }
        return ans;
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
        System.out.println("The Array "+ Arrays.toString(arr));
        int[] ans = extreme(arr);
        System.out.println("The Array after extreme swap"+ Arrays.toString(ans));
    }
}

