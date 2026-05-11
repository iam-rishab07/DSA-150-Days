package BasicMaths;

import java.util.Scanner;

import static BasicMaths.CheckPrime.checkPrime;

public class PrintPrime {

    public static void printPrime(int n)
    {
        int count = 0;
        for(int i = 2;i<=n;i++)
        {
            if(checkPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("\n\nThe count is "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The Prime numbers till "+n+" are :");
        printPrime(n);
    }
}
