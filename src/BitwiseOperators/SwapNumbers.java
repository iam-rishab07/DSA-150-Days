package BitwiseOperators;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter second Number : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping\nNum 1 : "+a+"\tNum 2 : "+b);
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println("After Swapping\nNum 1 : "+a+"\tNum 2 : "+b);
    }
}
