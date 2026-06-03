package BitwiseOperators;

import java.util.Scanner;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Number : ");
        int num = sc.nextInt();
        num = num & (num-1);
        System.out.println("answer : "+num);
    }
}
