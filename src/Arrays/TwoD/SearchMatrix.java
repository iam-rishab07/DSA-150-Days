package Arrays.TwoD;

import java.util.Arrays;
import java.util.Scanner;

public class SearchMatrix {
    public static int[][] searchMtx(int[][] mtx, int n, int m,int target){
        for (int i = 0; i < n; i++) {
            for(int j=0;j<m;j++)
            {
                if(mtx[i][j]==target) return new int[][] {{i},{j}};
            }
        }
        return new int[][] {{-1}, {-1}};
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

        System.out.println("Enter a number to search : ");
        int target = sc.nextInt();
        int[][] result = searchMtx(mtx,n,m,target);
        if(Arrays.deepEquals(result,new int[][] {{-1}, {-1}})) {
            System.out.println("Element Not Found !");
        }else{
            System.out.println("Element Found at index "+Arrays.deepToString(result));
        }
    }
}
