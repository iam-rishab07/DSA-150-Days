package Arrays.Problems2;

import java.util.*;

public class highestLowestFreq {
    public static int[] freq(int[] arr) {
        // 1. Build the frequency map
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Variables to track the highest/lowest frequencies and their corresponding elements
        int highFreq = Integer.MIN_VALUE;
        int lowFreq = Integer.MAX_VALUE;
        int mostFrequentElement = -1;
        int leastFrequentElement = -1;

        // 3. Iterate through the map's entries (both keys and values at once)
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int currentElement = entry.getKey();
            int currentFreq = entry.getValue();

            // Check for highest frequency
            if (currentFreq > highFreq) {
                highFreq = currentFreq;
                mostFrequentElement = currentElement;
            }

            // Check for lowest frequency
            if (currentFreq < lowFreq) {
                lowFreq = currentFreq;
                leastFrequentElement = currentElement;
            }
        }

        // Returns {Element with highest frequency, Element with lowest frequency}
        return new int[] {mostFrequentElement, leastFrequentElement};
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
        int[] ans = freq(arr);
        System.out.println("The min freq no. is "+ans[0]+"\nThe max freq no. is "+ans[1]);
    }
}
