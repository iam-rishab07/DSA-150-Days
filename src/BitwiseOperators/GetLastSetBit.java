package BitwiseOperators;

import java.util.Scanner;

public class GetLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Number : ");
        int num = sc.nextInt();
        num = num & (-num);
        System.out.println("answer : "+num);
    }
}
