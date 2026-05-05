package Arrays.TwoD;

import java.util.Scanner;

import static Arrays.TwoD.PrintMatrix.printMatrix;

public class Transpose {
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
        System.out.println("The Transpose is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mtx[j][i]+" ");
            }
            System.out.println();
        }
    }
}
