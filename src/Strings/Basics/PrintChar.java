package Strings.Basics;

import java.util.*;

public class PrintChar {
    public static void printChar(String name)
    {
        for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        printChar(name);
    }
}
