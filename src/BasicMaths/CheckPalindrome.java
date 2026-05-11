package BasicMaths;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean checkPalindrome(int n)
    {
        int original = n;
        int rev = 0;
        while(n!=0)
        {
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        return rev==original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean res = checkPalindrome(n);
        if(res) System.out.println("The number is palindrome");
        else System.out.println("Not palindrome");
    }
}
