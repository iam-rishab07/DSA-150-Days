package Arrays.TwoD;

import java.util.Scanner;

public class CheckSymmetric {

    public static boolean checkSymmetric(int[][] mtx, int n, int m)
    {
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                if(mtx[i][j]!=mtx[j][i]) return false;
            }
        }
        return true;
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
        boolean result = checkSymmetric(mtx,n,m);
        if(result) System.out.println("The Matrix is Symmetric");
        else System.out.println("Not Symmetric Matrix!");
    }
}
