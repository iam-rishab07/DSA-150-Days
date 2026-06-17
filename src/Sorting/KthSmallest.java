package Sorting;

import java.util.*;
public class KthSmallest {

    public int kthSmallest(int[] arr, int k) {    // expected approach
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr)
        {
            pq.add(num);
            if(pq.size()>k) pq.poll();
        }
        int ans = pq.isEmpty()? 0:pq.peek();
        return ans;
    }

//    public int kthSmallest(int[] arr, int k) {  brute force approach
//        Arrays.sort(arr);
//        return arr[k-1];
//    }
}
