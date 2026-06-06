package Arrays.Problem1;

import java.util.*;

public class Intersection {

    public static int[] findIntersection(int[] arr, int[] arr1)
    {
        Arrays.sort(arr);
        Arrays.sort(arr1);
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr.length && j<arr1.length)
        {
            if(arr[i]<arr1[j]) i++;
            else if(arr[i]>arr1[j]) j++;
            else{
                list.add(arr[i]);

                //skips the duplicate elements
                int current = arr[i];
                while(i<arr.length && arr[i]==current) i++;
                while(j<arr1.length && arr1[j]==current) j++;
            }
        }
        int[] ans = new int[list.size()];
        for(int k = 0; k<ans.length;k++)
        {
            ans[k] = list.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size : ");
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter second array size : ");
        int n1 = sc.nextInt();
        int[] arr1  = new int[n1];
        for(int i=0;i<n1;i++)
        {
            System.out.println("Enter element "+(i+1)+" : ");
            arr1[i] = sc.nextInt();
        }
        int[] ans = findIntersection(arr,arr1);
        System.out.println("The intersection array is "+ Arrays.toString(ans));
    }
}
