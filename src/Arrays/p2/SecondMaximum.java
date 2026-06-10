package Arrays.p2;

import java.util.Arrays;
import java.util.Scanner;

//return second-largest element in the array
public class SecondMaximum {
    private static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>max)
            {
                smax = max;
                max = num;
            }else if(num>smax && num!=max)  // this case skips duplicates
                smax = num;
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {124,46,24,546,2,35,6,3543,22};
        Scanner sc = new Scanner(System.in);
        System.out.println("The Array is "+ Arrays.toString(arr));
        int ans = secondMax(arr);
        System.out.println("The Second Largest element is "+ans);
    }


}
