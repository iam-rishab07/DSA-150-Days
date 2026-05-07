package Strings.Basics;
// count string length without using length()
import java.util.Scanner;

public class Count {
    public static void countChar(String name)
    {
        int count=0;
        char[] word = name.toCharArray();
        for(char ch : word)
        {
            count++;
        }
        System.out.println("the length is "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.next();
        countChar(name);
    }
}
