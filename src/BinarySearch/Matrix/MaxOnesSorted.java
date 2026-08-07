package BinarySearch.Matrix;

// find row with max ones in a binary matrix where each row is sorted
public class MaxOnesSorted {
    public int rowWithMax1s(int[][] arr) {
        int R = arr.length, C = arr[0].length;
        int row = 0, col = C-1;
        int ans = -1;
        while(row<R && col>=0)
        {
            if(arr[row][col]==0) row++;
            else{
                ans = row;
                col--;
            }
        }
        return ans;
    }
}
