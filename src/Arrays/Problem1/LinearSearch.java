package Arrays.Problem1;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target) return i;
        }
        return -1;
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
        System.out.println("enter an element to search : ");
        int target = sc.nextInt();
        int res = linearSearch(arr,target);
        if(res==-1) System.out.println("element not found!");
        else System.out.println("Element present at index : "+res);
    }
}
