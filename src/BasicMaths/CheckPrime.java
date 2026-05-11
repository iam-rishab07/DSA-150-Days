package BasicMaths;

import java.util.Scanner;

public class CheckPrime {

    public static boolean checkPrime(int n)
    {
        int num = 2;
        while(num<=Math.sqrt(n))
        {
            if(n%num==0) return false;
            else num++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean res = checkPrime(n);
        if(res) System.out.println("The number is prime");
        else System.out.println("Not prime");
    }
}
