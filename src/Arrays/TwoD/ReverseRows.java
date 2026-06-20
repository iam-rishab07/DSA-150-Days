package Arrays.TwoD;

// Reverse all the rows of a given matrix
public class ReverseRows {
    public static void printMatrix(int[][] mtx)
    {
        int n = mtx.length;
        int m = mtx[0].length;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.print(mtx[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void reverseRows(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int left = 0, right = arr[0].length-1;
            while(left<right)
            {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{12,35,56,2},{3,2,54,23},{86,899,345,90},{89,912,248,35}};
        System.out.println("Original matrix :");
        printMatrix(arr);
        reverseRows(arr);
        System.out.println("\nReversed rows matrix :");
        printMatrix(arr);
    }
}
