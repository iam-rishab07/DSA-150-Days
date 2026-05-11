package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {
    public static void reverseDigit(int n)
    {
        int rev = 0;
        while(n!=0)
        {
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        System.out.println("The Reverse number is "+rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        reverseDigit(n);
    }
}
