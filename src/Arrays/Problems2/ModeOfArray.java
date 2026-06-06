package Arrays.Problems2;

import java.util.*;

public class ModeOfArray {
    public static int mode(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        // 1. Build the frequency map
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int modeElement = -1;

        // 2. Iterate through both keys and values
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentElement = entry.getKey();
            int currentFreq = entry.getValue();

            // 3. Update the mode if we find a higher frequency
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                modeElement = currentElement;
            }
        }

        return modeElement;
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
        System.out.println("The Array : "+ Arrays.toString(arr));
        int res = mode(arr);
        System.out.println("The mode is "+res);
    }
}
