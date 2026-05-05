package Arrays.basic;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int n, int target)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            return i;
        }
        return -1;
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
        System.out.println("Enter Element to Search : ");
        int target = sc.nextInt();
        int result = linearSearch(arr,n,target);
        if(result==-1)
        {
            System.out.println("Element not found...");
        }else{
            System.out.println("Element found at index "+result);
        }
    }
}
