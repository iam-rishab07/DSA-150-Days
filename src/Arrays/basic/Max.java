package Arrays.basic;

import java.util.Scanner;


//find the max element from the array
public class Max {

    public static int maxElement(int[] arr,int n)
    {
        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = maxElement(arr,n);
        System.out.println("The max element is : "+max);
    }
}
