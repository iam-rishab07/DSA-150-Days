package Arrays.TwoD;

// leetcode 48
public class RotateImage {
    public void rotate(int[][] matrix) {

        // transpose of matrix (step 1)
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse rows of matrix (step 2)
        for(int i=0;i<matrix.length;i++)
        {
            int left = 0, right = matrix.length-1;
            while(left<right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
