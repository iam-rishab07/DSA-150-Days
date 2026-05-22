package Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class RotateKRight {
    public void rotate(int[] nums, int k) {
        // Reversal Algorithm
        int n = nums.length;
        k = k%n;

        // right rotate
        reverse(nums,0,n-1); // step 1 : reverse 0 to n-1
        reverse(nums,0,k-1); // step 2 : reverse 0 to k-1
        reverse(nums,k,n-1); // step 3 : reverse k to n-1

    }

    private void reverse(int[] nums, int left, int right) // helper
    {
        int temp;
        while(left<right)
        {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
