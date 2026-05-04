package Patterns;

import java.util.Scanner;

public class InvertedTriangle {

    public static void invertedTriangle(int n)
    {
        int sp =0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
                sp=j;
            }
            for(int j=1;j<=2*n-i-sp;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        invertedTriangle(n);

        sc.close();
    }
}
