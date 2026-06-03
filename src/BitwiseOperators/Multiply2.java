package BitwiseOperators;

import java.util.Scanner;

public class Multiply2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Number : ");
        int num = sc.nextInt();
        System.out.println("After multiplying by 2 : "+(num<<1));
    }
}
