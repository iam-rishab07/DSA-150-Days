package Sorting;
import java.util.*;

public class TwoSum {
    public List<Integer> twoSum(int arr[], int target) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList();
        int left = 0, right = arr.length-1;
        while(left<right)
        {
            int total = arr[left]+arr[right];
            if(total==target)
            {
                list.add(arr[left]);
                list.add(arr[right]);
                return list;
            }else if(total<target) left++;
            else right--;
        }
        return list;
    }
}
