package Arrays;

public class RotateKLeft {
    public void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d%n;

        // rotate left
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

    }

    public void reverse(int nums[], int left, int right)
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
