package BinarySearch.Matrix;

// leetcode 2643 : row with maximum ones
public class CountOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int row = 0;
        for(int i=0;i<mat.length;i++)
        {
            int sum=0;
            for(int j=0;j<mat[0].length;j++)
            {
                sum+=mat[i][j];
            }
            if(sum>max){
                max = sum;
                row = i;
            }
        }
        return new int[] {row,max};
    }
}
