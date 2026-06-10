package Arrays.p2;

import java.util.*;

public class LinearSearch {

    public static int linearSearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {124,46,24,546,2,35,6,3543,22};
        Scanner sc = new Scanner(System.in);
        System.out.println("The Array is "+Arrays.toString(arr));
        System.out.println("Enter Target :");
        int target = sc.nextInt();
        int ans = linearSearch(arr,target);
        if(ans==-1)
        {
            System.out.println("Element not found!");
        }else{
            System.out.println("Element found at index "+ans);
        }
    }
}
