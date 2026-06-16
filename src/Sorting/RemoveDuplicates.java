package Sorting;

// remove duplicates from a sorted array in place, and return total no. of unique elements
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j = 1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return i+1;
    }
}
