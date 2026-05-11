package BasicMaths;

import java.util.Scanner;

public class SumDigits {

    public static void sumDigit(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("The sum of digits is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sumDigit(n);
    }
}
