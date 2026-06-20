package Arrays;

import java.util.*;

public class Practice {
    public static int linear(int[] arr)
    {
        int product=1;
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
        }
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {31,324,12,533};
        int ans = linear(arr);
        System.out.println(ans);
    }
}
