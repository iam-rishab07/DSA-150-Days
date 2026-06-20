package BinarySearch.P2;

// Search in a Sorted Matrix (GFG problem)
public class SortedMatrix {
    public boolean searchMatrix(int[][] mat, int target) {
        int row = mat.length, col = mat[0].length;
        int low = 0, high = row*col-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int midRow = mid/col, midCol = mid%col;
            if(mat[midRow][midCol]==target) return true;
            else if(mat[midRow][midCol]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
