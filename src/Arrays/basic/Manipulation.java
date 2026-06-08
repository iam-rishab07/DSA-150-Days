package Arrays.basic;


import java.util.Arrays;
import java.util.Scanner;

// take array from user, multiply odd index by 2 and add 10 to even index elements
public class Manipulation {

    public static void manipulate(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0) arr[i]+=10;
            else arr[i] *= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("the Array is "+ Arrays.toString(arr));
        manipulate(arr);
        System.out.println("After Manipulation "+ Arrays.toString(arr));
    }
}
