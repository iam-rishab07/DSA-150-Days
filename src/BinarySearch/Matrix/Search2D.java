package BinarySearch.Matrix;

// leetcode 74. Search a 2D matrix
public class Search2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int low = 0, high = (row*col)-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int midRow = mid/col;
            int midCol = mid%col;
            if(target==matrix[midRow][midCol])
            {
                return true;
            }else if(target<matrix[midRow][midCol])
            {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}
