package Arrays.TwoD;

import java.util.Scanner;

public class MaxMin {
    public static void printMatrix(int[][] mtx,int n, int m)
    {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.print(mtx[i][j]+"\t");
                if(mtx[i][j]>max) max = mtx[i][j];
                if(mtx[i][j]<min) min = mtx[i][j];
            }
            System.out.println();
        }
        System.out.println("The Max Element is "+max);
        System.out.println("The Min Element is "+min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int m = sc.nextInt();
        int[][] mtx = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element " + (i + 1) + (j + 1) + " : ");
                mtx[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        printMatrix(mtx, n, m);
    }
}
