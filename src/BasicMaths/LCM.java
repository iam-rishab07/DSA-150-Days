package BasicMaths;

import java.util.Scanner;

import static BasicMaths.GCD.gcd;

public class LCM {

    public static int lcm(int a, int b)
    {
        int hcf = gcd(a,b);
        int prod = a*b;
        int result = prod/hcf;

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n = sc.nextInt();
        System.out.print("\nEnter second number : ");
        int m = sc.nextInt();
        int ans = lcm(n,m);
        System.out.println("\nThe LCM is "+ans);
    }
}
