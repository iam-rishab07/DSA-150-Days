package Arrays.basic;

import java.util.Scanner;

// search for an element in the array, if found return the index
public class LinearSearch {
    public static int linearSearch(int[] arr, int n, int target)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target) return i;
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
        int res = linearSearch(arr,n,target);
        if(res==-1)
        {
            System.out.println("element not found!");
        }else{
            System.out.println("Element found at index : "+res);
        }
    }
}
