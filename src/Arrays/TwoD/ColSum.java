package Arrays.TwoD;

import java.util.Scanner;

import static Arrays.TwoD.PrintMatrix.printMatrix;

public class ColSum {
    public static void colSum(int[][] mtx,int n, int m)
    {

        for (int j=0;j<m;j++) {
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum+=mtx[i][j];
            }
            System.out.println("The sum of column "+j+" is "+sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int m = sc.nextInt();
        int[][] mtx = new int[n][m];

        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.println("Enter element " + (i + 1) +(j+1)+" : ");
                mtx[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        printMatrix(mtx,n,m);
        colSum(mtx,n,m);
    }
}
