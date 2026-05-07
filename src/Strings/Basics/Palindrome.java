package Strings.Basics;

import java.util.Scanner;

public class Palindrome {
    public static boolean ispalindrome(String name)
    {
        int left = 0;
        int right = name.length()-1;
        while(left<right)
        {
            if(name.charAt(left)!=name.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        if(ispalindrome(name))
        {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
