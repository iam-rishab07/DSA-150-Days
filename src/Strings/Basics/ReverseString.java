package Strings.Basics;

import java.util.Scanner;

public class ReverseString {
    public static void reverse(String name)
    {
        StringBuilder br = new StringBuilder();
        for(int i = name.length()-1;i>=0;i--)
        {
            br.append(name.charAt(i));
        }
        System.out.println("Reverse String is "+br.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        reverse(name);
    }
}
