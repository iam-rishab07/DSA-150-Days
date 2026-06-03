package Arrays.Problem1;

import java.util.Arrays;
import java.util.Scanner;

// find first unsorted element in the array
public class FirstUnsortedElement {

    public static int findUnsorted(int[] arr, int type)
    {
        if(type==0)
        {
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i-1]>arr[i]) return arr[i-1];
            }
        }else if(type==1){
            for(int i=1;i<arr.length;i++)
            {
                if(arr[i-1]<arr[i]) return arr[i-1];
            }
        }else{
            throw new RuntimeException("Invalid Type");
        }
        return -1;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Type : (0 for Ascending , 1 for Descending)");
        int type = sc.nextInt();
        int ans = findUnsorted(arr,type);  // if type 0 -> ascending order, if type->1 descending order
        if(ans==-1) System.out.println("The Array : "+ Arrays.toString(arr)+"\nArray is sorted");
        else System.out.println("The Array : "+ Arrays.toString(arr) +"\nThe first unsorted element is "+ans);
    }
}
