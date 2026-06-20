package Arrays.Problem4;

// leetcode : remove duplicates from a sorted array
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;  // base check
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
