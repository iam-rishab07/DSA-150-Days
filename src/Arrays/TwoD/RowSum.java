package Arrays.TwoD;

import java.util.Scanner;

public class RowSum {
    public static void rowSum(int[][] mtx,int n, int m)
    {

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j=0;j<m;j++)
            {
                sum+=mtx[i][j];
            }
            System.out.println("The sum of row "+i+" is "+sum);
        }
    }

    public static void printMatrix(int[][] mtx,int n, int m)
    {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                System.out.print(mtx[i][j]+"\t");
            }
            System.out.println();
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
        rowSum(mtx,n,m);
    }
}
