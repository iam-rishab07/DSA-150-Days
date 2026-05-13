package BasicMaths;

import java.util.Scanner;

public class GCD {

    public static int gcd(int a,int b)
    {
        while(b!=0){
            int oldB = b;
            b = a%b;
            a = oldB;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n = sc.nextInt();
        System.out.print("\nEnter second number : ");
        int m = sc.nextInt();
        int ans = gcd(n,m);
        System.out.println("\nThe GCD is "+ans);
    }
}
